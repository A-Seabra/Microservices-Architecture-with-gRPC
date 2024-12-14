from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from client import run_python, run_java
import grpc  
from typing import Optional
import requests
import datetime

app = FastAPI()

class ItemDetails(BaseModel):
    itemID: str
    currentStock: int
    predictedDemand: Optional[int] = None
    reorderLevel: int


firebase_url = "https://iscf-lab3-default-rtdb.europe-west1.firebasedatabase.app/"


@app.post("/predict-demand/")
async def predict_demand(details: ItemDetails):
    try:
        # Call the run_java function to get the predicted demand
        predicted_demand = run_java(details.itemID, details.currentStock, details.reorderLevel)

        # Get the current timestamp
        timestamp = datetime.datetime.now().isoformat()

        # Package the predicted demand data along with other relevant information and timestamp
        prediction_data = {
            "itemID": details.itemID,
            "currentStock": details.currentStock,
            "reorderLevel": details.reorderLevel,
            "predictedDemand": predicted_demand.get('DemandPredicted'),
            "timestamp": timestamp  # Add the timestamp to the prediction data
        }

        # Send the prediction data to Firebase
        response = requests.post(f'{firebase_url}/predicted_demand.json', json=prediction_data)

        # Check if the request was successful
        if response.status_code == 200:
            return predicted_demand  # Return the predicted demand to the client
        else:
            raise HTTPException(status_code=500, detail="Failed to save data to Firebase")
        
    except grpc.RpcError as e:
        raise HTTPException(status_code=500, detail=f"GRPC error: {e.details()}")

@app.post("/optimize-inventory/")
async def optimize_inventory(details: ItemDetails):
    try:
        result = run_python(details.itemID, details.currentStock, details.predictedDemand, details.reorderLevel)

        # Get the current timestamp
        timestamp = datetime.datetime.now().isoformat()

        print("result",result)

        # Package the predicted demand data along with other relevant information and timestamp
        prediction_data = {
            "itemID": details.itemID,
            "currentStock": details.currentStock,
            "reorderLevel": details.reorderLevel,
            "predictedDemand": details.predictedDemand,
            "adjustment": result.get('Adjustment'),
            "timestamp": timestamp  # Add the timestamp to the prediction data
        }

        # Send the prediction data to Firebase
        response = requests.post(f'{firebase_url}/optimize_inventory.json', json=prediction_data)

        # Check if the request was successful
        if response.status_code == 200:
            return result  # Return the predicted demand to the client
        else:
            raise HTTPException(status_code=500, detail="Failed to save data to Firebase")

    except grpc.RpcError as e:
        raise HTTPException(status_code=500, detail=f"GRPC error: {e.details()}")

@app.post("/predict-optimization-demand/")
async def predict_optimization_demand(details: ItemDetails):
    try:
        # Call the run_java function to get the predicted demand
        predicted_demand = run_java(details.itemID, details.currentStock, details.reorderLevel)

        # Extract predictedDemand value from predicted_demand dict
        details.predictedDemand = predicted_demand.get('DemandPredicted')

        result = run_python(details.itemID, details.currentStock, details.predictedDemand, details.reorderLevel)
        
        # Get the current timestamp
        timestamp = datetime.datetime.now().isoformat()

        # Package the predicted demand data along with other relevant information and timestamp
        prediction_data = {
            "itemID": details.itemID,
            "currentStock": details.currentStock,
            "reorderLevel": details.reorderLevel,
            "predictedDemand": details.predictedDemand,
            "adjustment": result.get('Adjustment'),
            "timestamp": timestamp  # Add the timestamp to the prediction data
        }

        # Send the prediction data to Firebase
        response = requests.post(f'{firebase_url}/predict_optimization_demand.json', json=prediction_data)

        # Check if the request was successful
        if response.status_code == 200:
            return result  # Return the predicted optimizayion demand to the client
        else:
            raise HTTPException(status_code=500, detail="Failed to save data to Firebase")
    except grpc.RpcError as e:
        raise HTTPException(status_code=500, detail=f"GRPC error: {e.details()}")

if __name__ == '__main__':
    import uvicorn
    uvicorn.run(app, host='0.0.0.0', port=8000)
