// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.proto.demand;

/**
 * Protobuf type {@code inventory.OptimizeResponse}
 */
public final class OptimizeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inventory.OptimizeResponse)
    OptimizeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OptimizeResponse.newBuilder() to construct.
  private OptimizeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptimizeResponse() {
    adjustment_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OptimizeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OptimizeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            reorderQuantity_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            adjustment_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.demand.Inventory.internal_static_inventory_OptimizeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.demand.Inventory.internal_static_inventory_OptimizeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.demand.OptimizeResponse.class, com.proto.demand.OptimizeResponse.Builder.class);
  }

  public static final int REORDERQUANTITY_FIELD_NUMBER = 1;
  private int reorderQuantity_;
  /**
   * <code>int32 ReorderQuantity = 1;</code>
   * @return The reorderQuantity.
   */
  @java.lang.Override
  public int getReorderQuantity() {
    return reorderQuantity_;
  }

  public static final int ADJUSTMENT_FIELD_NUMBER = 2;
  private int adjustment_;
  /**
   * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
   * @return The enum numeric value on the wire for adjustment.
   */
  @java.lang.Override public int getAdjustmentValue() {
    return adjustment_;
  }
  /**
   * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
   * @return The adjustment.
   */
  @java.lang.Override public com.proto.demand.Inventoryadjustment getAdjustment() {
    @SuppressWarnings("deprecation")
    com.proto.demand.Inventoryadjustment result = com.proto.demand.Inventoryadjustment.valueOf(adjustment_);
    return result == null ? com.proto.demand.Inventoryadjustment.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (reorderQuantity_ != 0) {
      output.writeInt32(1, reorderQuantity_);
    }
    if (adjustment_ != com.proto.demand.Inventoryadjustment.SCALE_UP.getNumber()) {
      output.writeEnum(2, adjustment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reorderQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, reorderQuantity_);
    }
    if (adjustment_ != com.proto.demand.Inventoryadjustment.SCALE_UP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, adjustment_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.demand.OptimizeResponse)) {
      return super.equals(obj);
    }
    com.proto.demand.OptimizeResponse other = (com.proto.demand.OptimizeResponse) obj;

    if (getReorderQuantity()
        != other.getReorderQuantity()) return false;
    if (adjustment_ != other.adjustment_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REORDERQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getReorderQuantity();
    hash = (37 * hash) + ADJUSTMENT_FIELD_NUMBER;
    hash = (53 * hash) + adjustment_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.demand.OptimizeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.demand.OptimizeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.demand.OptimizeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.demand.OptimizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.demand.OptimizeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code inventory.OptimizeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inventory.OptimizeResponse)
      com.proto.demand.OptimizeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.demand.Inventory.internal_static_inventory_OptimizeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.demand.Inventory.internal_static_inventory_OptimizeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.demand.OptimizeResponse.class, com.proto.demand.OptimizeResponse.Builder.class);
    }

    // Construct using com.proto.demand.OptimizeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reorderQuantity_ = 0;

      adjustment_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.demand.Inventory.internal_static_inventory_OptimizeResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.demand.OptimizeResponse getDefaultInstanceForType() {
      return com.proto.demand.OptimizeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.demand.OptimizeResponse build() {
      com.proto.demand.OptimizeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.demand.OptimizeResponse buildPartial() {
      com.proto.demand.OptimizeResponse result = new com.proto.demand.OptimizeResponse(this);
      result.reorderQuantity_ = reorderQuantity_;
      result.adjustment_ = adjustment_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.demand.OptimizeResponse) {
        return mergeFrom((com.proto.demand.OptimizeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.demand.OptimizeResponse other) {
      if (other == com.proto.demand.OptimizeResponse.getDefaultInstance()) return this;
      if (other.getReorderQuantity() != 0) {
        setReorderQuantity(other.getReorderQuantity());
      }
      if (other.adjustment_ != 0) {
        setAdjustmentValue(other.getAdjustmentValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.demand.OptimizeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.demand.OptimizeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int reorderQuantity_ ;
    /**
     * <code>int32 ReorderQuantity = 1;</code>
     * @return The reorderQuantity.
     */
    @java.lang.Override
    public int getReorderQuantity() {
      return reorderQuantity_;
    }
    /**
     * <code>int32 ReorderQuantity = 1;</code>
     * @param value The reorderQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setReorderQuantity(int value) {
      
      reorderQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ReorderQuantity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReorderQuantity() {
      
      reorderQuantity_ = 0;
      onChanged();
      return this;
    }

    private int adjustment_ = 0;
    /**
     * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
     * @return The enum numeric value on the wire for adjustment.
     */
    @java.lang.Override public int getAdjustmentValue() {
      return adjustment_;
    }
    /**
     * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
     * @param value The enum numeric value on the wire for adjustment to set.
     * @return This builder for chaining.
     */
    public Builder setAdjustmentValue(int value) {
      
      adjustment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
     * @return The adjustment.
     */
    @java.lang.Override
    public com.proto.demand.Inventoryadjustment getAdjustment() {
      @SuppressWarnings("deprecation")
      com.proto.demand.Inventoryadjustment result = com.proto.demand.Inventoryadjustment.valueOf(adjustment_);
      return result == null ? com.proto.demand.Inventoryadjustment.UNRECOGNIZED : result;
    }
    /**
     * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
     * @param value The adjustment to set.
     * @return This builder for chaining.
     */
    public Builder setAdjustment(com.proto.demand.Inventoryadjustment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      adjustment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.inventory.Inventoryadjustment adjustment = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdjustment() {
      
      adjustment_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:inventory.OptimizeResponse)
  }

  // @@protoc_insertion_point(class_scope:inventory.OptimizeResponse)
  private static final com.proto.demand.OptimizeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.demand.OptimizeResponse();
  }

  public static com.proto.demand.OptimizeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptimizeResponse>
      PARSER = new com.google.protobuf.AbstractParser<OptimizeResponse>() {
    @java.lang.Override
    public OptimizeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OptimizeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptimizeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptimizeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.demand.OptimizeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

