# grpc_client.py
import grpc
import inventory_pb2
import inventory_pb2_grpc

def run_python(itemID, currentStock, predictedDemand, reorderLevel):
    with grpc.insecure_channel('server-script:50051') as channel:
        stub = inventory_pb2_grpc.InventoryOptimizationStub(channel)
        request = inventory_pb2.OptimizeRequest(ItemID=itemID, CurrentStock=currentStock, PredictedDemand=predictedDemand, ReorderLevel=reorderLevel)
        response = stub.Optimize(request)
        result = {
            "ReorderQuantity": response.ReorderQuantity,
            "Adjustment": "SCALE_DOWN" if response.adjustment == 1 else "SCALE_UP"
        }
    return result

def run_java(itemID, currentStock, reorderLevel):
    with grpc.insecure_channel('java-server:8080') as channel:  # Assuming Java server is running on port 8080
        stub = inventory_pb2_grpc.InventoryOptimizationStub(channel)
        request = inventory_pb2.DemandRequest(ItemID=itemID, CurrentStock=currentStock, ReorderLevel=reorderLevel)
        response = stub.Demand(request)
        return {"DemandPredicted": response.DemandPredicted}