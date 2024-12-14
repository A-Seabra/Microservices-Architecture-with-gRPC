import grpc
from concurrent import futures
import inventory_pb2
import inventory_pb2_grpc

class InventoryServicer(inventory_pb2_grpc.InventoryOptimizationServicer):
    def Optimize(self, request, context):
        if request.CurrentStock < request.PredictedDemand :
            adjustment = inventory_pb2.Inventoryadjustment.SCALE_UP
            print('adjunstment =', adjustment)
            reorder_quantity = request.PredictedDemand - request.CurrentStock + request.ReorderLevel
            print('reorder_quantity', reorder_quantity)
        else:
            adjustment = inventory_pb2.Inventoryadjustment.SCALE_DOWN
            print('adjunstment =', adjustment)
            reorder_quantity = max(0, request.CurrentStock - request.PredictedDemand)#this is done to make sure that value isnt negative
            print('reorder_quantity', reorder_quantity)

        return inventory_pb2.OptimizeResponse(ReorderQuantity=reorder_quantity, adjustment=adjustment)

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    inventory_pb2_grpc.add_InventoryOptimizationServicer_to_server(InventoryServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    print("Server started, listening on port 50051")
    server.wait_for_termination()

if __name__ == '__main__':
    serve()