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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for DeleteConnectedSiteTag RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest}
 */
public final class DeleteConnectedSiteTagRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)
    DeleteConnectedSiteTagRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteConnectedSiteTagRequest.newBuilder() to construct.
  private DeleteConnectedSiteTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteConnectedSiteTagRequest() {
    property_ = "";
    tagId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteConnectedSiteTagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_DeleteConnectedSiteTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_DeleteConnectedSiteTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.class,
            com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.Builder.class);
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object property_ = "";
  /**
   *
   *
   * <pre>
   * The Universal Analytics property to delete connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  @java.lang.Override
  public java.lang.String getProperty() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      property_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Universal Analytics property to delete connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPropertyBytes() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      property_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tagId_ = "";
  /**
   *
   *
   * <pre>
   * Tag ID to forward events to. Also known as the Measurement ID, or the
   * "G-ID"  (For example: G-12345).
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The tagId.
   */
  @java.lang.Override
  public java.lang.String getTagId() {
    java.lang.Object ref = tagId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tagId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Tag ID to forward events to. Also known as the Measurement ID, or the
   * "G-ID"  (For example: G-12345).
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The bytes for tagId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagIdBytes() {
    java.lang.Object ref = tagId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tagId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, property_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tagId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tagId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, property_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tagId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tagId_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest other =
        (com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest) obj;

    if (!getProperty().equals(other.getProperty())) return false;
    if (!getTagId().equals(other.getTagId())) return false;
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
    hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
    hash = (53 * hash) + getProperty().hashCode();
    hash = (37 * hash) + TAG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTagId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest prototype) {
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
   * Request message for DeleteConnectedSiteTag RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)
      com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_DeleteConnectedSiteTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_DeleteConnectedSiteTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.class,
              com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      property_ = "";
      tagId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_DeleteConnectedSiteTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest build() {
      com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest buildPartial() {
      com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest result =
          new com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.property_ = property_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tagId_ = tagId_;
      }
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
      if (other instanceof com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest.getDefaultInstance())
        return this;
      if (!other.getProperty().isEmpty()) {
        property_ = other.property_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTagId().isEmpty()) {
        tagId_ = other.tagId_;
        bitField0_ |= 0x00000002;
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
                property_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                tagId_ = input.readStringRequireUtf8();
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

    private java.lang.Object property_ = "";
    /**
     *
     *
     * <pre>
     * The Universal Analytics property to delete connected site tags for.
     * This API does not support GA4 properties.
     * Format: properties/{universalAnalyticsPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1;</code>
     *
     * @return The property.
     */
    public java.lang.String getProperty() {
      java.lang.Object ref = property_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        property_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Universal Analytics property to delete connected site tags for.
     * This API does not support GA4 properties.
     * Format: properties/{universalAnalyticsPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1;</code>
     *
     * @return The bytes for property.
     */
    public com.google.protobuf.ByteString getPropertyBytes() {
      java.lang.Object ref = property_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        property_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Universal Analytics property to delete connected site tags for.
     * This API does not support GA4 properties.
     * Format: properties/{universalAnalyticsPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1;</code>
     *
     * @param value The property to set.
     * @return This builder for chaining.
     */
    public Builder setProperty(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      property_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Universal Analytics property to delete connected site tags for.
     * This API does not support GA4 properties.
     * Format: properties/{universalAnalyticsPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProperty() {
      property_ = getDefaultInstance().getProperty();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Universal Analytics property to delete connected site tags for.
     * This API does not support GA4 properties.
     * Format: properties/{universalAnalyticsPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1;</code>
     *
     * @param value The bytes for property to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      property_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tagId_ = "";
    /**
     *
     *
     * <pre>
     * Tag ID to forward events to. Also known as the Measurement ID, or the
     * "G-ID"  (For example: G-12345).
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return The tagId.
     */
    public java.lang.String getTagId() {
      java.lang.Object ref = tagId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tagId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Tag ID to forward events to. Also known as the Measurement ID, or the
     * "G-ID"  (For example: G-12345).
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return The bytes for tagId.
     */
    public com.google.protobuf.ByteString getTagIdBytes() {
      java.lang.Object ref = tagId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tagId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Tag ID to forward events to. Also known as the Measurement ID, or the
     * "G-ID"  (For example: G-12345).
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @param value The tagId to set.
     * @return This builder for chaining.
     */
    public Builder setTagId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tagId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tag ID to forward events to. Also known as the Measurement ID, or the
     * "G-ID"  (For example: G-12345).
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTagId() {
      tagId_ = getDefaultInstance().getTagId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tag ID to forward events to. Also known as the Measurement ID, or the
     * "G-ID"  (For example: G-12345).
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @param value The bytes for tagId to set.
     * @return This builder for chaining.
     */
    public Builder setTagIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tagId_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)
  private static final com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest();
  }

  public static com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteConnectedSiteTagRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteConnectedSiteTagRequest>() {
        @java.lang.Override
        public DeleteConnectedSiteTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteConnectedSiteTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteConnectedSiteTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
