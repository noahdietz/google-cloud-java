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
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securityposture.v1;

/**
 *
 *
 * <pre>
 * Message for creating a Posture.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securityposture.v1.CreatePostureRequest}
 */
public final class CreatePostureRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securityposture.v1.CreatePostureRequest)
    CreatePostureRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePostureRequest.newBuilder() to construct.
  private CreatePostureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePostureRequest() {
    parent_ = "";
    postureId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePostureRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_CreatePostureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_CreatePostureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securityposture.v1.CreatePostureRequest.class,
            com.google.cloud.securityposture.v1.CreatePostureRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int POSTURE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object postureId_ = "";
  /**
   *
   *
   * <pre>
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The postureId.
   */
  @java.lang.Override
  public java.lang.String getPostureId() {
    java.lang.Object ref = postureId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      postureId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for postureId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPostureIdBytes() {
    java.lang.Object ref = postureId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      postureId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTURE_FIELD_NUMBER = 3;
  private com.google.cloud.securityposture.v1.Posture posture_;
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the posture field is set.
   */
  @java.lang.Override
  public boolean hasPosture() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The posture.
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.Posture getPosture() {
    return posture_ == null
        ? com.google.cloud.securityposture.v1.Posture.getDefaultInstance()
        : posture_;
  }
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PostureOrBuilder getPostureOrBuilder() {
    return posture_ == null
        ? com.google.cloud.securityposture.v1.Posture.getDefaultInstance()
        : posture_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(postureId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, postureId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPosture());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(postureId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, postureId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPosture());
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
    if (!(obj instanceof com.google.cloud.securityposture.v1.CreatePostureRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securityposture.v1.CreatePostureRequest other =
        (com.google.cloud.securityposture.v1.CreatePostureRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getPostureId().equals(other.getPostureId())) return false;
    if (hasPosture() != other.hasPosture()) return false;
    if (hasPosture()) {
      if (!getPosture().equals(other.getPosture())) return false;
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
    hash = (37 * hash) + POSTURE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPostureId().hashCode();
    if (hasPosture()) {
      hash = (37 * hash) + POSTURE_FIELD_NUMBER;
      hash = (53 * hash) + getPosture().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest parseFrom(
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
      com.google.cloud.securityposture.v1.CreatePostureRequest prototype) {
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
   * Message for creating a Posture.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securityposture.v1.CreatePostureRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securityposture.v1.CreatePostureRequest)
      com.google.cloud.securityposture.v1.CreatePostureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securityposture.v1.CreatePostureRequest.class,
              com.google.cloud.securityposture.v1.CreatePostureRequest.Builder.class);
    }

    // Construct using com.google.cloud.securityposture.v1.CreatePostureRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPostureFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      postureId_ = "";
      posture_ = null;
      if (postureBuilder_ != null) {
        postureBuilder_.dispose();
        postureBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureRequest getDefaultInstanceForType() {
      return com.google.cloud.securityposture.v1.CreatePostureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureRequest build() {
      com.google.cloud.securityposture.v1.CreatePostureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureRequest buildPartial() {
      com.google.cloud.securityposture.v1.CreatePostureRequest result =
          new com.google.cloud.securityposture.v1.CreatePostureRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securityposture.v1.CreatePostureRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.postureId_ = postureId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.posture_ = postureBuilder_ == null ? posture_ : postureBuilder_.build();
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
      if (other instanceof com.google.cloud.securityposture.v1.CreatePostureRequest) {
        return mergeFrom((com.google.cloud.securityposture.v1.CreatePostureRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securityposture.v1.CreatePostureRequest other) {
      if (other == com.google.cloud.securityposture.v1.CreatePostureRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPostureId().isEmpty()) {
        postureId_ = other.postureId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPosture()) {
        mergePosture(other.getPosture());
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
                postureId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPostureFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private java.lang.Object postureId_ = "";
    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The postureId.
     */
    public java.lang.String getPostureId() {
      java.lang.Object ref = postureId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        postureId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for postureId.
     */
    public com.google.protobuf.ByteString getPostureIdBytes() {
      java.lang.Object ref = postureId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        postureId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The postureId to set.
     * @return This builder for chaining.
     */
    public Builder setPostureId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      postureId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPostureId() {
      postureId_ = getDefaultInstance().getPostureId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for postureId to set.
     * @return This builder for chaining.
     */
    public Builder setPostureIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      postureId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.securityposture.v1.Posture posture_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securityposture.v1.Posture,
            com.google.cloud.securityposture.v1.Posture.Builder,
            com.google.cloud.securityposture.v1.PostureOrBuilder>
        postureBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the posture field is set.
     */
    public boolean hasPosture() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The posture.
     */
    public com.google.cloud.securityposture.v1.Posture getPosture() {
      if (postureBuilder_ == null) {
        return posture_ == null
            ? com.google.cloud.securityposture.v1.Posture.getDefaultInstance()
            : posture_;
      } else {
        return postureBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPosture(com.google.cloud.securityposture.v1.Posture value) {
      if (postureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        posture_ = value;
      } else {
        postureBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPosture(com.google.cloud.securityposture.v1.Posture.Builder builderForValue) {
      if (postureBuilder_ == null) {
        posture_ = builderForValue.build();
      } else {
        postureBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePosture(com.google.cloud.securityposture.v1.Posture value) {
      if (postureBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && posture_ != null
            && posture_ != com.google.cloud.securityposture.v1.Posture.getDefaultInstance()) {
          getPostureBuilder().mergeFrom(value);
        } else {
          posture_ = value;
        }
      } else {
        postureBuilder_.mergeFrom(value);
      }
      if (posture_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPosture() {
      bitField0_ = (bitField0_ & ~0x00000004);
      posture_ = null;
      if (postureBuilder_ != null) {
        postureBuilder_.dispose();
        postureBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securityposture.v1.Posture.Builder getPostureBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPostureFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securityposture.v1.PostureOrBuilder getPostureOrBuilder() {
      if (postureBuilder_ != null) {
        return postureBuilder_.getMessageOrBuilder();
      } else {
        return posture_ == null
            ? com.google.cloud.securityposture.v1.Posture.getDefaultInstance()
            : posture_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.Posture posture = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securityposture.v1.Posture,
            com.google.cloud.securityposture.v1.Posture.Builder,
            com.google.cloud.securityposture.v1.PostureOrBuilder>
        getPostureFieldBuilder() {
      if (postureBuilder_ == null) {
        postureBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securityposture.v1.Posture,
                com.google.cloud.securityposture.v1.Posture.Builder,
                com.google.cloud.securityposture.v1.PostureOrBuilder>(
                getPosture(), getParentForChildren(), isClean());
        posture_ = null;
      }
      return postureBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securityposture.v1.CreatePostureRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securityposture.v1.CreatePostureRequest)
  private static final com.google.cloud.securityposture.v1.CreatePostureRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securityposture.v1.CreatePostureRequest();
  }

  public static com.google.cloud.securityposture.v1.CreatePostureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePostureRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePostureRequest>() {
        @java.lang.Override
        public CreatePostureRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePostureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePostureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securityposture.v1.CreatePostureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
