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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * A request to create a new audience list.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.CreateAudienceListRequest}
 */
public final class CreateAudienceListRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.CreateAudienceListRequest)
    CreateAudienceListRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAudienceListRequest.newBuilder() to construct.
  private CreateAudienceListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAudienceListRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAudienceListRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_CreateAudienceListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_CreateAudienceListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.CreateAudienceListRequest.class,
            com.google.analytics.data.v1alpha.CreateAudienceListRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this audience list will be created.
   * Format: `properties/{property}`
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
   * Required. The parent resource where this audience list will be created.
   * Format: `properties/{property}`
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

  public static final int AUDIENCE_LIST_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.AudienceList audienceList_;
  /**
   *
   *
   * <pre>
   * Required. The audience list to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the audienceList field is set.
   */
  @java.lang.Override
  public boolean hasAudienceList() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The audience list to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audienceList.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.AudienceList getAudienceList() {
    return audienceList_ == null
        ? com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()
        : audienceList_;
  }
  /**
   *
   *
   * <pre>
   * Required. The audience list to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.AudienceListOrBuilder getAudienceListOrBuilder() {
    return audienceList_ == null
        ? com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()
        : audienceList_;
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
      output.writeMessage(2, getAudienceList());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAudienceList());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.CreateAudienceListRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.CreateAudienceListRequest other =
        (com.google.analytics.data.v1alpha.CreateAudienceListRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAudienceList() != other.hasAudienceList()) return false;
    if (hasAudienceList()) {
      if (!getAudienceList().equals(other.getAudienceList())) return false;
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
    if (hasAudienceList()) {
      hash = (37 * hash) + AUDIENCE_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAudienceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest parseFrom(
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
      com.google.analytics.data.v1alpha.CreateAudienceListRequest prototype) {
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
   * A request to create a new audience list.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.CreateAudienceListRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.CreateAudienceListRequest)
      com.google.analytics.data.v1alpha.CreateAudienceListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateAudienceListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateAudienceListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.CreateAudienceListRequest.class,
              com.google.analytics.data.v1alpha.CreateAudienceListRequest.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.CreateAudienceListRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAudienceListFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      audienceList_ = null;
      if (audienceListBuilder_ != null) {
        audienceListBuilder_.dispose();
        audienceListBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateAudienceListRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateAudienceListRequest getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.CreateAudienceListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateAudienceListRequest build() {
      com.google.analytics.data.v1alpha.CreateAudienceListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateAudienceListRequest buildPartial() {
      com.google.analytics.data.v1alpha.CreateAudienceListRequest result =
          new com.google.analytics.data.v1alpha.CreateAudienceListRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.CreateAudienceListRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.audienceList_ =
            audienceListBuilder_ == null ? audienceList_ : audienceListBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.CreateAudienceListRequest) {
        return mergeFrom((com.google.analytics.data.v1alpha.CreateAudienceListRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.CreateAudienceListRequest other) {
      if (other == com.google.analytics.data.v1alpha.CreateAudienceListRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAudienceList()) {
        mergeAudienceList(other.getAudienceList());
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
                input.readMessage(getAudienceListFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this audience list will be created.
     * Format: `properties/{property}`
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
     * Required. The parent resource where this audience list will be created.
     * Format: `properties/{property}`
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
     * Required. The parent resource where this audience list will be created.
     * Format: `properties/{property}`
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
     * Required. The parent resource where this audience list will be created.
     * Format: `properties/{property}`
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
     * Required. The parent resource where this audience list will be created.
     * Format: `properties/{property}`
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

    private com.google.analytics.data.v1alpha.AudienceList audienceList_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.AudienceList,
            com.google.analytics.data.v1alpha.AudienceList.Builder,
            com.google.analytics.data.v1alpha.AudienceListOrBuilder>
        audienceListBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the audienceList field is set.
     */
    public boolean hasAudienceList() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The audienceList.
     */
    public com.google.analytics.data.v1alpha.AudienceList getAudienceList() {
      if (audienceListBuilder_ == null) {
        return audienceList_ == null
            ? com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()
            : audienceList_;
      } else {
        return audienceListBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudienceList(com.google.analytics.data.v1alpha.AudienceList value) {
      if (audienceListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audienceList_ = value;
      } else {
        audienceListBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudienceList(
        com.google.analytics.data.v1alpha.AudienceList.Builder builderForValue) {
      if (audienceListBuilder_ == null) {
        audienceList_ = builderForValue.build();
      } else {
        audienceListBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAudienceList(com.google.analytics.data.v1alpha.AudienceList value) {
      if (audienceListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && audienceList_ != null
            && audienceList_
                != com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()) {
          getAudienceListBuilder().mergeFrom(value);
        } else {
          audienceList_ = value;
        }
      } else {
        audienceListBuilder_.mergeFrom(value);
      }
      if (audienceList_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAudienceList() {
      bitField0_ = (bitField0_ & ~0x00000002);
      audienceList_ = null;
      if (audienceListBuilder_ != null) {
        audienceListBuilder_.dispose();
        audienceListBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.data.v1alpha.AudienceList.Builder getAudienceListBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAudienceListFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.data.v1alpha.AudienceListOrBuilder getAudienceListOrBuilder() {
      if (audienceListBuilder_ != null) {
        return audienceListBuilder_.getMessageOrBuilder();
      } else {
        return audienceList_ == null
            ? com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()
            : audienceList_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The audience list to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.AudienceList audience_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.AudienceList,
            com.google.analytics.data.v1alpha.AudienceList.Builder,
            com.google.analytics.data.v1alpha.AudienceListOrBuilder>
        getAudienceListFieldBuilder() {
      if (audienceListBuilder_ == null) {
        audienceListBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.AudienceList,
                com.google.analytics.data.v1alpha.AudienceList.Builder,
                com.google.analytics.data.v1alpha.AudienceListOrBuilder>(
                getAudienceList(), getParentForChildren(), isClean());
        audienceList_ = null;
      }
      return audienceListBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.CreateAudienceListRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.CreateAudienceListRequest)
  private static final com.google.analytics.data.v1alpha.CreateAudienceListRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.CreateAudienceListRequest();
  }

  public static com.google.analytics.data.v1alpha.CreateAudienceListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAudienceListRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAudienceListRequest>() {
        @java.lang.Override
        public CreateAudienceListRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAudienceListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAudienceListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.CreateAudienceListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
