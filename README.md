# Microservices-Architecture-with-gRPC

 - University project about developing a gRPC based architecture for managing an inventory, using the gRPC framework, Docker, REST API, Java, Python, HTML and Javascript.

The overall architecture developed for this project is outlined below:

1. MS1 (Java) - Demand Forecasting Service:
• Implemented in Java using gRPC.
• This service estimates future demand needs based on historical data and trends. A dummy estimator (random predictions) was used for simplicity, in a real scenario, this could involve machine learning models trained on real-time data.

3. MS2 (Python) - Inventory Optimization Service:
• Implemented in Python.
• This service should use the forecasts from MS1 to recommend inventory actions such as reordering or scaling inventory levels.

Both microservices will be exposed to users through a REST API, for browsers to interact with. 
The communication between the entry point and the microservices is handled through gRPC. 
All components are deployed as containers in the Docker Engine.
