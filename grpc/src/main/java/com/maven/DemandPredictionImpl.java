package com.maven;

import java.util.Random;

import com.proto.demand.DemandRequest;
import com.proto.demand.DemandResponse;
import com.proto.demand.InventoryOptimizationGrpc;

import io.grpc.stub.StreamObserver;

public class DemandPredictionImpl extends InventoryOptimizationGrpc.InventoryOptimizationImplBase {

    @Override
    public void demand(DemandRequest request, StreamObserver<DemandResponse> responseObserver) {
        // Implement your logic here
        int currentStock = request.getCurrentStock();
        int reorderLevel = request.getReorderLevel();
        int demandPredicted = calculateDemand(currentStock, reorderLevel);

        // Build the response
        DemandResponse response = DemandResponse.newBuilder()
                .setDemandPredicted(demandPredicted)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private int calculateDemand(int currentStock, int reorderLevel) {
        
        int baseDemand = currentStock/3;
        System.out.println("baseDemand" + baseDemand);

        // Range offset
        int offset = 3;
        System.out.println("offset" + offset);

        // Create an instance of Random
        Random random = new Random();

        // Generate a random number between - and + the range offset
        int randomNumber = random.nextInt((offset * 2) + 1) - offset;
        System.out.println("randomNumber" + randomNumber);

        // Add the random number to the fixed value
        int variationDemand = baseDemand + randomNumber;
        System.out.println("variationDemand" + variationDemand);

        int predictedDemand = variationDemand * reorderLevel; 
        System.out.println("predictedDemand" + predictedDemand);

        // Ensure the predicted demand is not negative
        /*if (predictedDemand < 0) {
            predictedDemand = 0;
        }*/

        return predictedDemand;
    }
}
