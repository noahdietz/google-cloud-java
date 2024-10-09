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
// source: google/cloud/networkservices/v1/endpoint_policy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

/**
 *
 *
 * <pre>
 * Request used with the UpdateEndpointPolicy method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkservices.v1.UpdateEndpointPolicyRequest}
 */
public final class UpdateEndpointPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)
    UpdateEndpointPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEndpointPolicyRequest.newBuilder() to construct.
  private UpdateEndpointPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEndpointPolicyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEndpointPolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkservices.v1.EndpointPolicyProto
        .internal_static_google_cloud_networkservices_v1_UpdateEndpointPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkservices.v1.EndpointPolicyProto
        .internal_static_google_cloud_networkservices_v1_UpdateEndpointPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.class,
            com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * EndpointPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * EndpointPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * EndpointPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int ENDPOINT_POLICY_FIELD_NUMBER = 2;
  private com.google.cloud.networkservices.v1.EndpointPolicy endpointPolicy_;
  /**
   *
   *
   * <pre>
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the endpointPolicy field is set.
   */
  @java.lang.Override
  public boolean hasEndpointPolicy() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The endpointPolicy.
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.EndpointPolicy getEndpointPolicy() {
    return endpointPolicy_ == null
        ? com.google.cloud.networkservices.v1.EndpointPolicy.getDefaultInstance()
        : endpointPolicy_;
  }
  /**
   *
   *
   * <pre>
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder getEndpointPolicyOrBuilder() {
    return endpointPolicy_ == null
        ? com.google.cloud.networkservices.v1.EndpointPolicy.getDefaultInstance()
        : endpointPolicy_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEndpointPolicy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndpointPolicy());
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
    if (!(obj instanceof com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest other =
        (com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasEndpointPolicy() != other.hasEndpointPolicy()) return false;
    if (hasEndpointPolicy()) {
      if (!getEndpointPolicy().equals(other.getEndpointPolicy())) return false;
    }
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasEndpointPolicy()) {
      hash = (37 * hash) + ENDPOINT_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getEndpointPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest parseFrom(
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
      com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest prototype) {
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
   * Request used with the UpdateEndpointPolicy method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkservices.v1.UpdateEndpointPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)
      com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkservices.v1.EndpointPolicyProto
          .internal_static_google_cloud_networkservices_v1_UpdateEndpointPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkservices.v1.EndpointPolicyProto
          .internal_static_google_cloud_networkservices_v1_UpdateEndpointPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.class,
              com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUpdateMaskFieldBuilder();
        getEndpointPolicyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      endpointPolicy_ = null;
      if (endpointPolicyBuilder_ != null) {
        endpointPolicyBuilder_.dispose();
        endpointPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkservices.v1.EndpointPolicyProto
          .internal_static_google_cloud_networkservices_v1_UpdateEndpointPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest build() {
      com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest buildPartial() {
      com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest result =
          new com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endpointPolicy_ =
            endpointPolicyBuilder_ == null ? endpointPolicy_ : endpointPolicyBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest) {
        return mergeFrom((com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest other) {
      if (other
          == com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasEndpointPolicy()) {
        mergeEndpointPolicy(other.getEndpointPolicy());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEndpointPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * EndpointPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.networkservices.v1.EndpointPolicy endpointPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.EndpointPolicy,
            com.google.cloud.networkservices.v1.EndpointPolicy.Builder,
            com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder>
        endpointPolicyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the endpointPolicy field is set.
     */
    public boolean hasEndpointPolicy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The endpointPolicy.
     */
    public com.google.cloud.networkservices.v1.EndpointPolicy getEndpointPolicy() {
      if (endpointPolicyBuilder_ == null) {
        return endpointPolicy_ == null
            ? com.google.cloud.networkservices.v1.EndpointPolicy.getDefaultInstance()
            : endpointPolicy_;
      } else {
        return endpointPolicyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEndpointPolicy(com.google.cloud.networkservices.v1.EndpointPolicy value) {
      if (endpointPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpointPolicy_ = value;
      } else {
        endpointPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEndpointPolicy(
        com.google.cloud.networkservices.v1.EndpointPolicy.Builder builderForValue) {
      if (endpointPolicyBuilder_ == null) {
        endpointPolicy_ = builderForValue.build();
      } else {
        endpointPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEndpointPolicy(com.google.cloud.networkservices.v1.EndpointPolicy value) {
      if (endpointPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && endpointPolicy_ != null
            && endpointPolicy_
                != com.google.cloud.networkservices.v1.EndpointPolicy.getDefaultInstance()) {
          getEndpointPolicyBuilder().mergeFrom(value);
        } else {
          endpointPolicy_ = value;
        }
      } else {
        endpointPolicyBuilder_.mergeFrom(value);
      }
      if (endpointPolicy_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEndpointPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endpointPolicy_ = null;
      if (endpointPolicyBuilder_ != null) {
        endpointPolicyBuilder_.dispose();
        endpointPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkservices.v1.EndpointPolicy.Builder getEndpointPolicyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndpointPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder
        getEndpointPolicyOrBuilder() {
      if (endpointPolicyBuilder_ != null) {
        return endpointPolicyBuilder_.getMessageOrBuilder();
      } else {
        return endpointPolicy_ == null
            ? com.google.cloud.networkservices.v1.EndpointPolicy.getDefaultInstance()
            : endpointPolicy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Updated EndpointPolicy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.EndpointPolicy,
            com.google.cloud.networkservices.v1.EndpointPolicy.Builder,
            com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder>
        getEndpointPolicyFieldBuilder() {
      if (endpointPolicyBuilder_ == null) {
        endpointPolicyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.networkservices.v1.EndpointPolicy,
                com.google.cloud.networkservices.v1.EndpointPolicy.Builder,
                com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder>(
                getEndpointPolicy(), getParentForChildren(), isClean());
        endpointPolicy_ = null;
      }
      return endpointPolicyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)
  private static final com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest();
  }

  public static com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEndpointPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEndpointPolicyRequest>() {
        @java.lang.Override
        public UpdateEndpointPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEndpointPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEndpointPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkservices.v1.UpdateEndpointPolicyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
