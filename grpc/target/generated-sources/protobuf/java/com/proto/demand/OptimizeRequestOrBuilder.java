// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.proto.demand;

public interface OptimizeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inventory.OptimizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ItemID = 1;</code>
   * @return The itemID.
   */
  java.lang.String getItemID();
  /**
   * <code>string ItemID = 1;</code>
   * @return The bytes for itemID.
   */
  com.google.protobuf.ByteString
      getItemIDBytes();

  /**
   * <code>int32 CurrentStock = 2;</code>
   * @return The currentStock.
   */
  int getCurrentStock();

  /**
   * <code>int32 PredictedDemand = 3;</code>
   * @return The predictedDemand.
   */
  int getPredictedDemand();

  /**
   * <code>int32 ReorderLevel = 4;</code>
   * @return The reorderLevel.
   */
  int getReorderLevel();
}