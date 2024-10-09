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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * `CreateReleaseConfig` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.CreateReleaseConfigRequest}
 */
public final class CreateReleaseConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)
    CreateReleaseConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateReleaseConfigRequest.newBuilder() to construct.
  private CreateReleaseConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReleaseConfigRequest() {
    parent_ = "";
    releaseConfigId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateReleaseConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CreateReleaseConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CreateReleaseConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.class,
            com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The repository in which to create the release config. Must be in
   * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
   * Required. The repository in which to create the release config. Must be in
   * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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

  public static final int RELEASE_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataform.v1beta1.ReleaseConfig releaseConfig_;
  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the releaseConfig field is set.
   */
  @java.lang.Override
  public boolean hasReleaseConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The releaseConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ReleaseConfig getReleaseConfig() {
    return releaseConfig_ == null
        ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
        : releaseConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder getReleaseConfigOrBuilder() {
    return releaseConfig_ == null
        ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
        : releaseConfig_;
  }

  public static final int RELEASE_CONFIG_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object releaseConfigId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the release config, which will become the final
   * component of the release config's resource name.
   * </pre>
   *
   * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The releaseConfigId.
   */
  @java.lang.Override
  public java.lang.String getReleaseConfigId() {
    java.lang.Object ref = releaseConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      releaseConfigId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the release config, which will become the final
   * component of the release config's resource name.
   * </pre>
   *
   * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for releaseConfigId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReleaseConfigIdBytes() {
    java.lang.Object ref = releaseConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      releaseConfigId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getReleaseConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(releaseConfigId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, releaseConfigId_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReleaseConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(releaseConfigId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, releaseConfigId_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest other =
        (com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReleaseConfig() != other.hasReleaseConfig()) return false;
    if (hasReleaseConfig()) {
      if (!getReleaseConfig().equals(other.getReleaseConfig())) return false;
    }
    if (!getReleaseConfigId().equals(other.getReleaseConfigId())) return false;
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
    if (hasReleaseConfig()) {
      hash = (37 * hash) + RELEASE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseConfig().hashCode();
    }
    hash = (37 * hash) + RELEASE_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReleaseConfigId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest parseFrom(
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
      com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest prototype) {
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
   * `CreateReleaseConfig` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.CreateReleaseConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)
      com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateReleaseConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateReleaseConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.class,
              com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getReleaseConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      releaseConfig_ = null;
      if (releaseConfigBuilder_ != null) {
        releaseConfigBuilder_.dispose();
        releaseConfigBuilder_ = null;
      }
      releaseConfigId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateReleaseConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest build() {
      com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest buildPartial() {
      com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest result =
          new com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.releaseConfig_ =
            releaseConfigBuilder_ == null ? releaseConfig_ : releaseConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.releaseConfigId_ = releaseConfigId_;
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
      if (other instanceof com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest other) {
      if (other
          == com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReleaseConfig()) {
        mergeReleaseConfig(other.getReleaseConfig());
      }
      if (!other.getReleaseConfigId().isEmpty()) {
        releaseConfigId_ = other.releaseConfigId_;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getReleaseConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                releaseConfigId_ = input.readStringRequireUtf8();
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
     * Required. The repository in which to create the release config. Must be in
     * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the release config. Must be in
     * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the release config. Must be in
     * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the release config. Must be in
     * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the release config. Must be in
     * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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

    private com.google.cloud.dataform.v1beta1.ReleaseConfig releaseConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.ReleaseConfig,
            com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
            com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>
        releaseConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the releaseConfig field is set.
     */
    public boolean hasReleaseConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The releaseConfig.
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfig getReleaseConfig() {
      if (releaseConfigBuilder_ == null) {
        return releaseConfig_ == null
            ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
            : releaseConfig_;
      } else {
        return releaseConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReleaseConfig(com.google.cloud.dataform.v1beta1.ReleaseConfig value) {
      if (releaseConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        releaseConfig_ = value;
      } else {
        releaseConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReleaseConfig(
        com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder builderForValue) {
      if (releaseConfigBuilder_ == null) {
        releaseConfig_ = builderForValue.build();
      } else {
        releaseConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReleaseConfig(com.google.cloud.dataform.v1beta1.ReleaseConfig value) {
      if (releaseConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && releaseConfig_ != null
            && releaseConfig_
                != com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()) {
          getReleaseConfigBuilder().mergeFrom(value);
        } else {
          releaseConfig_ = value;
        }
      } else {
        releaseConfigBuilder_.mergeFrom(value);
      }
      if (releaseConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReleaseConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      releaseConfig_ = null;
      if (releaseConfigBuilder_ != null) {
        releaseConfigBuilder_.dispose();
        releaseConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder getReleaseConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReleaseConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder getReleaseConfigOrBuilder() {
      if (releaseConfigBuilder_ != null) {
        return releaseConfigBuilder_.getMessageOrBuilder();
      } else {
        return releaseConfig_ == null
            ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
            : releaseConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.ReleaseConfig,
            com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
            com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>
        getReleaseConfigFieldBuilder() {
      if (releaseConfigBuilder_ == null) {
        releaseConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1beta1.ReleaseConfig,
                com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
                com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>(
                getReleaseConfig(), getParentForChildren(), isClean());
        releaseConfig_ = null;
      }
      return releaseConfigBuilder_;
    }

    private java.lang.Object releaseConfigId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the release config, which will become the final
     * component of the release config's resource name.
     * </pre>
     *
     * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The releaseConfigId.
     */
    public java.lang.String getReleaseConfigId() {
      java.lang.Object ref = releaseConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        releaseConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the release config, which will become the final
     * component of the release config's resource name.
     * </pre>
     *
     * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for releaseConfigId.
     */
    public com.google.protobuf.ByteString getReleaseConfigIdBytes() {
      java.lang.Object ref = releaseConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        releaseConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the release config, which will become the final
     * component of the release config's resource name.
     * </pre>
     *
     * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The releaseConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setReleaseConfigId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      releaseConfigId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the release config, which will become the final
     * component of the release config's resource name.
     * </pre>
     *
     * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReleaseConfigId() {
      releaseConfigId_ = getDefaultInstance().getReleaseConfigId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the release config, which will become the final
     * component of the release config's resource name.
     * </pre>
     *
     * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for releaseConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setReleaseConfigIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      releaseConfigId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)
  private static final com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest();
  }

  public static com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReleaseConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReleaseConfigRequest>() {
        @java.lang.Override
        public CreateReleaseConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateReleaseConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReleaseConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CreateReleaseConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
