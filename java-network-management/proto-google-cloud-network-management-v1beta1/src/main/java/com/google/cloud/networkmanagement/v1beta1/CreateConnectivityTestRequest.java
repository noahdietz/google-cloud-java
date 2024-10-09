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
// source: google/cloud/networkmanagement/v1beta1/reachability.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1beta1;

/**
 *
 *
 * <pre>
 * Request for the `CreateConnectivityTest` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest}
 */
public final class CreateConnectivityTestRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)
    CreateConnectivityTestRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConnectivityTestRequest.newBuilder() to construct.
  private CreateConnectivityTestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConnectivityTestRequest() {
    parent_ = "";
    testId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConnectivityTestRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest.class,
            com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Connectivity Test to create:
   *     `projects/{project_id}/locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the Connectivity Test to create:
   *     `projects/{project_id}/locations/global`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object testId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The logical name of the Connectivity Test in your project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project
   * </pre>
   *
   * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The testId.
   */
  @java.lang.Override
  public java.lang.String getTestId() {
    java.lang.Object ref = testId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The logical name of the Connectivity Test in your project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project
   * </pre>
   *
   * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for testId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTestIdBytes() {
    java.lang.Object ref = testId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      testId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.networkmanagement.v1beta1.ConnectivityTest resource_;
  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.ConnectivityTest getResource() {
    return resource_ == null
        ? com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.getDefaultInstance()
        : resource_;
  }
  /**
   *
   *
   * <pre>
   * Required. A `ConnectivityTest` resource
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder
      getResourceOrBuilder() {
    return resource_ == null
        ? com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.getDefaultInstance()
        : resource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, testId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, testId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getResource());
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
    if (!(obj
        instanceof com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest other =
        (com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getTestId().equals(other.getTestId())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource().equals(other.getResource())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + TEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTestId().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest parseFrom(
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
      com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest prototype) {
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
   * Request for the `CreateConnectivityTest` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)
      com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest.class,
              com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      testId_ = "";
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
        getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest build() {
      com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest buildPartial() {
      com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest result =
          new com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.testId_ = testId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resourceBuilder_ == null ? resource_ : resourceBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other
          instanceof com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest) {
        return mergeFrom(
            (com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest other) {
      if (other
          == com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTestId().isEmpty()) {
        testId_ = other.testId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                testId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getResourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the Connectivity Test to create:
     *     `projects/{project_id}/locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the Connectivity Test to create:
     *     `projects/{project_id}/locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the Connectivity Test to create:
     *     `projects/{project_id}/locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the Connectivity Test to create:
     *     `projects/{project_id}/locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the Connectivity Test to create:
     *     `projects/{project_id}/locations/global`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object testId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The logical name of the Connectivity Test in your project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project
     * </pre>
     *
     * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The testId.
     */
    public java.lang.String getTestId() {
      java.lang.Object ref = testId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the Connectivity Test in your project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project
     * </pre>
     *
     * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for testId.
     */
    public com.google.protobuf.ByteString getTestIdBytes() {
      java.lang.Object ref = testId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        testId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the Connectivity Test in your project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project
     * </pre>
     *
     * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The testId to set.
     * @return This builder for chaining.
     */
    public Builder setTestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      testId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the Connectivity Test in your project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project
     * </pre>
     *
     * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTestId() {
      testId_ = getDefaultInstance().getTestId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The logical name of the Connectivity Test in your project
     * with the following restrictions:
     *
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-40 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project
     * </pre>
     *
     * <code>string test_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for testId to set.
     * @return This builder for chaining.
     */
    public Builder setTestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      testId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.networkmanagement.v1beta1.ConnectivityTest resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTest,
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.Builder,
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder>
        resourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The resource.
     */
    public com.google.cloud.networkmanagement.v1beta1.ConnectivityTest getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null
            ? com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.getDefaultInstance()
            : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResource(com.google.cloud.networkmanagement.v1beta1.ConnectivityTest value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResource(
        com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeResource(
        com.google.cloud.networkmanagement.v1beta1.ConnectivityTest value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && resource_ != null
            && resource_
                != com.google.cloud.networkmanagement.v1beta1.ConnectivityTest
                    .getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      if (resource_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.Builder
        getResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder
        getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null
            ? com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.getDefaultInstance()
            : resource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A `ConnectivityTest` resource
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.ConnectivityTest resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTest,
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.Builder,
            com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder>
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.networkmanagement.v1beta1.ConnectivityTest,
                com.google.cloud.networkmanagement.v1beta1.ConnectivityTest.Builder,
                com.google.cloud.networkmanagement.v1beta1.ConnectivityTestOrBuilder>(
                getResource(), getParentForChildren(), isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest)
  private static final com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest();
  }

  public static com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConnectivityTestRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConnectivityTestRequest>() {
        @java.lang.Override
        public CreateConnectivityTestRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConnectivityTestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConnectivityTestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
