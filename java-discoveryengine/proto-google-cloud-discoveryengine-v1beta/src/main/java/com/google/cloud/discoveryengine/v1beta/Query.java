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
// source: google/cloud/discoveryengine/v1beta/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Defines a user inputed query.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.Query}
 */
public final class Query extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.Query)
    QueryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Query.newBuilder() to construct.
  private Query(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Query() {
    queryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Query();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.SessionProto
        .internal_static_google_cloud_discoveryengine_v1beta_Query_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.SessionProto
        .internal_static_google_cloud_discoveryengine_v1beta_Query_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.Query.class,
            com.google.cloud.discoveryengine.v1beta.Query.Builder.class);
  }

  private int contentCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object content_;

  public enum ContentCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEXT(2),
    CONTENT_NOT_SET(0);
    private final int value;

    private ContentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentCase forNumber(int value) {
      switch (value) {
        case 2:
          return TEXT;
        case 0:
          return CONTENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ContentCase getContentCase() {
    return ContentCase.forNumber(contentCase_);
  }

  public static final int TEXT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return Whether the text field is set.
   */
  public boolean hasText() {
    return contentCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The text.
   */
  public java.lang.String getText() {
    java.lang.Object ref = "";
    if (contentCase_ == 2) {
      ref = content_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (contentCase_ == 2) {
        content_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The bytes for text.
   */
  public com.google.protobuf.ByteString getTextBytes() {
    java.lang.Object ref = "";
    if (contentCase_ == 2) {
      ref = content_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (contentCase_ == 2) {
        content_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object queryId_ = "";
  /**
   *
   *
   * <pre>
   * Unique Id for the query.
   * </pre>
   *
   * <code>string query_id = 1;</code>
   *
   * @return The queryId.
   */
  @java.lang.Override
  public java.lang.String getQueryId() {
    java.lang.Object ref = queryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Unique Id for the query.
   * </pre>
   *
   * <code>string query_id = 1;</code>
   *
   * @return The bytes for queryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQueryIdBytes() {
    java.lang.Object ref = queryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      queryId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryId_);
    }
    if (contentCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryId_);
    }
    if (contentCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.Query)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.Query other =
        (com.google.cloud.discoveryengine.v1beta.Query) obj;

    if (!getQueryId().equals(other.getQueryId())) return false;
    if (!getContentCase().equals(other.getContentCase())) return false;
    switch (contentCase_) {
      case 2:
        if (!getText().equals(other.getText())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQueryId().hashCode();
    switch (contentCase_) {
      case 2:
        hash = (37 * hash) + TEXT_FIELD_NUMBER;
        hash = (53 * hash) + getText().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Query parseFrom(
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

  public static Builder newBuilder(com.google.cloud.discoveryengine.v1beta.Query prototype) {
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
   * Defines a user inputed query.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.Query}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.Query)
      com.google.cloud.discoveryengine.v1beta.QueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.SessionProto
          .internal_static_google_cloud_discoveryengine_v1beta_Query_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.SessionProto
          .internal_static_google_cloud_discoveryengine_v1beta_Query_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.Query.class,
              com.google.cloud.discoveryengine.v1beta.Query.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.Query.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      queryId_ = "";
      contentCase_ = 0;
      content_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.SessionProto
          .internal_static_google_cloud_discoveryengine_v1beta_Query_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Query getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.Query.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Query build() {
      com.google.cloud.discoveryengine.v1beta.Query result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Query buildPartial() {
      com.google.cloud.discoveryengine.v1beta.Query result =
          new com.google.cloud.discoveryengine.v1beta.Query(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1beta.Query result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queryId_ = queryId_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.discoveryengine.v1beta.Query result) {
      result.contentCase_ = contentCase_;
      result.content_ = this.content_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.Query) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.Query) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.Query other) {
      if (other == com.google.cloud.discoveryengine.v1beta.Query.getDefaultInstance()) return this;
      if (!other.getQueryId().isEmpty()) {
        queryId_ = other.queryId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getContentCase()) {
        case TEXT:
          {
            contentCase_ = 2;
            content_ = other.content_;
            onChanged();
            break;
          }
        case CONTENT_NOT_SET:
          {
            break;
          }
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
                queryId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                contentCase_ = 2;
                content_ = s;
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

    private int contentCase_ = 0;
    private java.lang.Object content_;

    public ContentCase getContentCase() {
      return ContentCase.forNumber(contentCase_);
    }

    public Builder clearContent() {
      contentCase_ = 0;
      content_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return contentCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      java.lang.Object ref = "";
      if (contentCase_ == 2) {
        ref = content_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (contentCase_ == 2) {
          content_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = "";
      if (contentCase_ == 2) {
        ref = content_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (contentCase_ == 2) {
          content_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentCase_ = 2;
      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearText() {
      if (contentCase_ == 2) {
        contentCase_ = 0;
        content_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Plain text.
     * </pre>
     *
     * <code>string text = 2;</code>
     *
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contentCase_ = 2;
      content_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object queryId_ = "";
    /**
     *
     *
     * <pre>
     * Unique Id for the query.
     * </pre>
     *
     * <code>string query_id = 1;</code>
     *
     * @return The queryId.
     */
    public java.lang.String getQueryId() {
      java.lang.Object ref = queryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique Id for the query.
     * </pre>
     *
     * <code>string query_id = 1;</code>
     *
     * @return The bytes for queryId.
     */
    public com.google.protobuf.ByteString getQueryIdBytes() {
      java.lang.Object ref = queryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        queryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unique Id for the query.
     * </pre>
     *
     * <code>string query_id = 1;</code>
     *
     * @param value The queryId to set.
     * @return This builder for chaining.
     */
    public Builder setQueryId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      queryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unique Id for the query.
     * </pre>
     *
     * <code>string query_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQueryId() {
      queryId_ = getDefaultInstance().getQueryId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unique Id for the query.
     * </pre>
     *
     * <code>string query_id = 1;</code>
     *
     * @param value The bytes for queryId to set.
     * @return This builder for chaining.
     */
    public Builder setQueryIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      queryId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.Query)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.Query)
  private static final com.google.cloud.discoveryengine.v1beta.Query DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.Query();
  }

  public static com.google.cloud.discoveryengine.v1beta.Query getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Query> PARSER =
      new com.google.protobuf.AbstractParser<Query>() {
        @java.lang.Override
        public Query parsePartialFrom(
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

  public static com.google.protobuf.Parser<Query> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Query> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.Query getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
