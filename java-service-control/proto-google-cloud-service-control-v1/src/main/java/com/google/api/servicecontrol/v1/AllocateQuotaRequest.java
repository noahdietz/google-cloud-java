/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/quota_controller.proto

// Protobuf Java Version: 3.25.5
package com.google.api.servicecontrol.v1;

/**
 *
 *
 * <pre>
 * Request message for the AllocateQuota method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicecontrol.v1.AllocateQuotaRequest}
 */
public final class AllocateQuotaRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicecontrol.v1.AllocateQuotaRequest)
    AllocateQuotaRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AllocateQuotaRequest.newBuilder() to construct.
  private AllocateQuotaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AllocateQuotaRequest() {
    serviceName_ = "";
    serviceConfigId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AllocateQuotaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicecontrol.v1.QuotaControllerProto
        .internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicecontrol.v1.QuotaControllerProto
        .internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicecontrol.v1.AllocateQuotaRequest.class,
            com.google.api.servicecontrol.v1.AllocateQuotaRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceName_ = "";
  /**
   *
   *
   * <pre>
   * Name of the service as specified in the service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the service as specified in the service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOCATE_OPERATION_FIELD_NUMBER = 2;
  private com.google.api.servicecontrol.v1.QuotaOperation allocateOperation_;
  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   *
   * @return Whether the allocateOperation field is set.
   */
  @java.lang.Override
  public boolean hasAllocateOperation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   *
   * @return The allocateOperation.
   */
  @java.lang.Override
  public com.google.api.servicecontrol.v1.QuotaOperation getAllocateOperation() {
    return allocateOperation_ == null
        ? com.google.api.servicecontrol.v1.QuotaOperation.getDefaultInstance()
        : allocateOperation_;
  }
  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   */
  @java.lang.Override
  public com.google.api.servicecontrol.v1.QuotaOperationOrBuilder getAllocateOperationOrBuilder() {
    return allocateOperation_ == null
        ? com.google.api.servicecontrol.v1.QuotaOperation.getDefaultInstance()
        : allocateOperation_;
  }

  public static final int SERVICE_CONFIG_ID_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceConfigId_ = "";
  /**
   *
   *
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request. If unspecified or no matching version can be found, the latest
   * one will be used.
   * </pre>
   *
   * <code>string service_config_id = 4;</code>
   *
   * @return The serviceConfigId.
   */
  @java.lang.Override
  public java.lang.String getServiceConfigId() {
    java.lang.Object ref = serviceConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceConfigId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request. If unspecified or no matching version can be found, the latest
   * one will be used.
   * </pre>
   *
   * <code>string service_config_id = 4;</code>
   *
   * @return The bytes for serviceConfigId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceConfigIdBytes() {
    java.lang.Object ref = serviceConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceConfigId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAllocateOperation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceConfigId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceConfigId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAllocateOperation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceConfigId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceConfigId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.servicecontrol.v1.AllocateQuotaRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicecontrol.v1.AllocateQuotaRequest other =
        (com.google.api.servicecontrol.v1.AllocateQuotaRequest) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (hasAllocateOperation() != other.hasAllocateOperation()) return false;
    if (hasAllocateOperation()) {
      if (!getAllocateOperation().equals(other.getAllocateOperation())) return false;
    }
    if (!getServiceConfigId().equals(other.getServiceConfigId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasAllocateOperation()) {
      hash = (37 * hash) + ALLOCATE_OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getAllocateOperation().hashCode();
    }
    hash = (37 * hash) + SERVICE_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceConfigId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.api.servicecontrol.v1.AllocateQuotaRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for the AllocateQuota method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicecontrol.v1.AllocateQuotaRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicecontrol.v1.AllocateQuotaRequest)
      com.google.api.servicecontrol.v1.AllocateQuotaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicecontrol.v1.QuotaControllerProto
          .internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicecontrol.v1.QuotaControllerProto
          .internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicecontrol.v1.AllocateQuotaRequest.class,
              com.google.api.servicecontrol.v1.AllocateQuotaRequest.Builder.class);
    }

    // Construct using com.google.api.servicecontrol.v1.AllocateQuotaRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAllocateOperationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceName_ = "";
      allocateOperation_ = null;
      if (allocateOperationBuilder_ != null) {
        allocateOperationBuilder_.dispose();
        allocateOperationBuilder_ = null;
      }
      serviceConfigId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicecontrol.v1.QuotaControllerProto
          .internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.AllocateQuotaRequest getDefaultInstanceForType() {
      return com.google.api.servicecontrol.v1.AllocateQuotaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.AllocateQuotaRequest build() {
      com.google.api.servicecontrol.v1.AllocateQuotaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicecontrol.v1.AllocateQuotaRequest buildPartial() {
      com.google.api.servicecontrol.v1.AllocateQuotaRequest result =
          new com.google.api.servicecontrol.v1.AllocateQuotaRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.servicecontrol.v1.AllocateQuotaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceName_ = serviceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allocateOperation_ =
            allocateOperationBuilder_ == null
                ? allocateOperation_
                : allocateOperationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceConfigId_ = serviceConfigId_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicecontrol.v1.AllocateQuotaRequest) {
        return mergeFrom((com.google.api.servicecontrol.v1.AllocateQuotaRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicecontrol.v1.AllocateQuotaRequest other) {
      if (other == com.google.api.servicecontrol.v1.AllocateQuotaRequest.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAllocateOperation()) {
        mergeAllocateOperation(other.getAllocateOperation());
      }
      if (!other.getServiceConfigId().isEmpty()) {
        serviceConfigId_ = other.serviceConfigId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                serviceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getAllocateOperationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 34:
              {
                serviceConfigId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object serviceName_ = "";
    /**
     *
     *
     * <pre>
     * Name of the service as specified in the service configuration. For example,
     * `"pubsub.googleapis.com"`.
     *
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     *
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the service as specified in the service configuration. For example,
     * `"pubsub.googleapis.com"`.
     *
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     *
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the service as specified in the service configuration. For example,
     * `"pubsub.googleapis.com"`.
     *
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     *
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the service as specified in the service configuration. For example,
     * `"pubsub.googleapis.com"`.
     *
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {
      serviceName_ = getDefaultInstance().getServiceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the service as specified in the service configuration. For example,
     * `"pubsub.googleapis.com"`.
     *
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     *
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.api.servicecontrol.v1.QuotaOperation allocateOperation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicecontrol.v1.QuotaOperation,
            com.google.api.servicecontrol.v1.QuotaOperation.Builder,
            com.google.api.servicecontrol.v1.QuotaOperationOrBuilder>
        allocateOperationBuilder_;
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     *
     * @return Whether the allocateOperation field is set.
     */
    public boolean hasAllocateOperation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     *
     * @return The allocateOperation.
     */
    public com.google.api.servicecontrol.v1.QuotaOperation getAllocateOperation() {
      if (allocateOperationBuilder_ == null) {
        return allocateOperation_ == null
            ? com.google.api.servicecontrol.v1.QuotaOperation.getDefaultInstance()
            : allocateOperation_;
      } else {
        return allocateOperationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public Builder setAllocateOperation(com.google.api.servicecontrol.v1.QuotaOperation value) {
      if (allocateOperationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allocateOperation_ = value;
      } else {
        allocateOperationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public Builder setAllocateOperation(
        com.google.api.servicecontrol.v1.QuotaOperation.Builder builderForValue) {
      if (allocateOperationBuilder_ == null) {
        allocateOperation_ = builderForValue.build();
      } else {
        allocateOperationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public Builder mergeAllocateOperation(com.google.api.servicecontrol.v1.QuotaOperation value) {
      if (allocateOperationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && allocateOperation_ != null
            && allocateOperation_
                != com.google.api.servicecontrol.v1.QuotaOperation.getDefaultInstance()) {
          getAllocateOperationBuilder().mergeFrom(value);
        } else {
          allocateOperation_ = value;
        }
      } else {
        allocateOperationBuilder_.mergeFrom(value);
      }
      if (allocateOperation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public Builder clearAllocateOperation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allocateOperation_ = null;
      if (allocateOperationBuilder_ != null) {
        allocateOperationBuilder_.dispose();
        allocateOperationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.QuotaOperation.Builder getAllocateOperationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAllocateOperationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.QuotaOperationOrBuilder
        getAllocateOperationOrBuilder() {
      if (allocateOperationBuilder_ != null) {
        return allocateOperationBuilder_.getMessageOrBuilder();
      } else {
        return allocateOperation_ == null
            ? com.google.api.servicecontrol.v1.QuotaOperation.getDefaultInstance()
            : allocateOperation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Operation that describes the quota allocation.
     * </pre>
     *
     * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicecontrol.v1.QuotaOperation,
            com.google.api.servicecontrol.v1.QuotaOperation.Builder,
            com.google.api.servicecontrol.v1.QuotaOperationOrBuilder>
        getAllocateOperationFieldBuilder() {
      if (allocateOperationBuilder_ == null) {
        allocateOperationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.servicecontrol.v1.QuotaOperation,
                com.google.api.servicecontrol.v1.QuotaOperation.Builder,
                com.google.api.servicecontrol.v1.QuotaOperationOrBuilder>(
                getAllocateOperation(), getParentForChildren(), isClean());
        allocateOperation_ = null;
      }
      return allocateOperationBuilder_;
    }

    private java.lang.Object serviceConfigId_ = "";
    /**
     *
     *
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request. If unspecified or no matching version can be found, the latest
     * one will be used.
     * </pre>
     *
     * <code>string service_config_id = 4;</code>
     *
     * @return The serviceConfigId.
     */
    public java.lang.String getServiceConfigId() {
      java.lang.Object ref = serviceConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request. If unspecified or no matching version can be found, the latest
     * one will be used.
     * </pre>
     *
     * <code>string service_config_id = 4;</code>
     *
     * @return The bytes for serviceConfigId.
     */
    public com.google.protobuf.ByteString getServiceConfigIdBytes() {
      java.lang.Object ref = serviceConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request. If unspecified or no matching version can be found, the latest
     * one will be used.
     * </pre>
     *
     * <code>string service_config_id = 4;</code>
     *
     * @param value The serviceConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceConfigId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceConfigId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request. If unspecified or no matching version can be found, the latest
     * one will be used.
     * </pre>
     *
     * <code>string service_config_id = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceConfigId() {
      serviceConfigId_ = getDefaultInstance().getServiceConfigId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request. If unspecified or no matching version can be found, the latest
     * one will be used.
     * </pre>
     *
     * <code>string service_config_id = 4;</code>
     *
     * @param value The bytes for serviceConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceConfigIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceConfigId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicecontrol.v1.AllocateQuotaRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.AllocateQuotaRequest)
  private static final com.google.api.servicecontrol.v1.AllocateQuotaRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicecontrol.v1.AllocateQuotaRequest();
  }

  public static com.google.api.servicecontrol.v1.AllocateQuotaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocateQuotaRequest> PARSER =
      new com.google.protobuf.AbstractParser<AllocateQuotaRequest>() {
        @java.lang.Override
        public AllocateQuotaRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AllocateQuotaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocateQuotaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicecontrol.v1.AllocateQuotaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
