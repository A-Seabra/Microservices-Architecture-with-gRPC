// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.proto.demand;

public interface OptimizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inventory.OptimizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 ReorderQuantity = 1;</code>
   * @return The reorderQuantity.
   */
  int getReorderQuantity();

  /**
   * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
   * @return The enum numeric value on the wire for adjustment.
   */
  int getAdjustmentValue();
  /**
   * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
   * @return The adjustment.
   */
  com.proto.demand.Inventoryadjustment getAdjustment();
}
