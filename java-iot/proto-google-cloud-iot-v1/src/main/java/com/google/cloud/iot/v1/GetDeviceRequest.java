// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Request for `GetDevice`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.GetDeviceRequest}
 */
public  final class GetDeviceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.GetDeviceRequest)
    GetDeviceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDeviceRequest.newBuilder() to construct.
  private GetDeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDeviceRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetDeviceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (fieldMask_ != null) {
              subBuilder = fieldMask_.toBuilder();
            }
            fieldMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fieldMask_);
              fieldMask_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GetDeviceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GetDeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.GetDeviceRequest.class, com.google.cloud.iot.v1.GetDeviceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * The fields of the `Device` resource to be returned in the response. If the
   * field mask is unset or empty, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * The fields of the `Device` resource to be returned in the response. If the
   * field mask is unset or empty, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * The fields of the `Device` resource to be returned in the response. If the
   * field mask is unset or empty, all fields are returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return getFieldMask();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (fieldMask_ != null) {
      output.writeMessage(2, getFieldMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFieldMask());
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
    if (!(obj instanceof com.google.cloud.iot.v1.GetDeviceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.GetDeviceRequest other = (com.google.cloud.iot.v1.GetDeviceRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasFieldMask() == other.hasFieldMask());
    if (hasFieldMask()) {
      result = result && getFieldMask()
          .equals(other.getFieldMask());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GetDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.iot.v1.GetDeviceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Request for `GetDevice`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.GetDeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.GetDeviceRequest)
      com.google.cloud.iot.v1.GetDeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GetDeviceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GetDeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.GetDeviceRequest.class, com.google.cloud.iot.v1.GetDeviceRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.GetDeviceRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GetDeviceRequest_descriptor;
    }

    public com.google.cloud.iot.v1.GetDeviceRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.GetDeviceRequest.getDefaultInstance();
    }

    public com.google.cloud.iot.v1.GetDeviceRequest build() {
      com.google.cloud.iot.v1.GetDeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.iot.v1.GetDeviceRequest buildPartial() {
      com.google.cloud.iot.v1.GetDeviceRequest result = new com.google.cloud.iot.v1.GetDeviceRequest(this);
      result.name_ = name_;
      if (fieldMaskBuilder_ == null) {
        result.fieldMask_ = fieldMask_;
      } else {
        result.fieldMask_ = fieldMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.GetDeviceRequest) {
        return mergeFrom((com.google.cloud.iot.v1.GetDeviceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.GetDeviceRequest other) {
      if (other == com.google.cloud.iot.v1.GetDeviceRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.iot.v1.GetDeviceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.GetDeviceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask fieldMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public boolean hasFieldMask() {
      return fieldMaskBuilder_ != null || fieldMask_ != null;
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (fieldMask_ != null) {
          fieldMask_ =
            com.google.protobuf.FieldMask.newBuilder(fieldMask_).mergeFrom(value).buildPartial();
        } else {
          fieldMask_ = value;
        }
        onChanged();
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder clearFieldMask() {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
        onChanged();
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <pre>
     * The fields of the `Device` resource to be returned in the response. If the
     * field mask is unset or empty, all fields are returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.GetDeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.GetDeviceRequest)
  private static final com.google.cloud.iot.v1.GetDeviceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.GetDeviceRequest();
  }

  public static com.google.cloud.iot.v1.GetDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeviceRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDeviceRequest>() {
    public GetDeviceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetDeviceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetDeviceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeviceRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.iot.v1.GetDeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

