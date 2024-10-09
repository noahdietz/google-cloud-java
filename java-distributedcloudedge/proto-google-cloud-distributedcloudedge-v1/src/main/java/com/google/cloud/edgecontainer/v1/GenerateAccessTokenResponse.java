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
// source: google/cloud/edgecontainer/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.edgecontainer.v1;

/**
 *
 *
 * <pre>
 * An access token for a cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgecontainer.v1.GenerateAccessTokenResponse}
 */
public final class GenerateAccessTokenResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgecontainer.v1.GenerateAccessTokenResponse)
    GenerateAccessTokenResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateAccessTokenResponse.newBuilder() to construct.
  private GenerateAccessTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateAccessTokenResponse() {
    accessToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateAccessTokenResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgecontainer.v1.ServiceProto
        .internal_static_google_cloud_edgecontainer_v1_GenerateAccessTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgecontainer.v1.ServiceProto
        .internal_static_google_cloud_edgecontainer_v1_GenerateAccessTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.class,
            com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object accessToken_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExpireTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpireTime());
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
    if (!(obj instanceof com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse other =
        (com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse) obj;

    if (!getAccessToken().equals(other.getAccessToken())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime().equals(other.getExpireTime())) return false;
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
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse parseFrom(
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
      com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse prototype) {
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
   * An access token for a cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgecontainer.v1.GenerateAccessTokenResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgecontainer.v1.GenerateAccessTokenResponse)
      com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateAccessTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.class,
              com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.Builder.class);
    }

    // Construct using com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExpireTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessToken_ = "";
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse
        getDefaultInstanceForType() {
      return com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse build() {
      com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse buildPartial() {
      com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse result =
          new com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessToken_ = accessToken_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expireTime_ = expireTimeBuilder_ == null ? expireTime_ : expireTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse) {
        return mergeFrom((com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse other) {
      if (other
          == com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse.getDefaultInstance())
        return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
                accessToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExpireTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object accessToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accessToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {
      accessToken_ = getDefaultInstance().getAccessToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accessToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        expireTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
      } else {
        expireTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && expireTime_ != null
            && expireTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpireTimeBuilder().mergeFrom(value);
        } else {
          expireTime_ = value;
        }
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }
      if (expireTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expire_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(), getParentForChildren(), isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.edgecontainer.v1.GenerateAccessTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgecontainer.v1.GenerateAccessTokenResponse)
  private static final com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse();
  }

  public static com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAccessTokenResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateAccessTokenResponse>() {
        @java.lang.Override
        public GenerateAccessTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAccessTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAccessTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.GenerateAccessTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
