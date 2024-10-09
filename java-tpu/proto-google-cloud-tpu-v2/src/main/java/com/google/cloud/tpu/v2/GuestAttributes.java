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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2;

/**
 *
 *
 * <pre>
 * A guest attributes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.GuestAttributes}
 */
public final class GuestAttributes extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.GuestAttributes)
    GuestAttributesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GuestAttributes.newBuilder() to construct.
  private GuestAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GuestAttributes() {
    queryPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GuestAttributes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_GuestAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_GuestAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.GuestAttributes.class,
            com.google.cloud.tpu.v2.GuestAttributes.Builder.class);
  }

  private int bitField0_;
  public static final int QUERY_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object queryPath_ = "";
  /**
   *
   *
   * <pre>
   * The path to be queried. This can be the default namespace ('/') or a
   * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
   * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
   * </pre>
   *
   * <code>string query_path = 1;</code>
   *
   * @return The queryPath.
   */
  @java.lang.Override
  public java.lang.String getQueryPath() {
    java.lang.Object ref = queryPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The path to be queried. This can be the default namespace ('/') or a
   * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
   * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
   * </pre>
   *
   * <code>string query_path = 1;</code>
   *
   * @return The bytes for queryPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQueryPathBytes() {
    java.lang.Object ref = queryPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      queryPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_VALUE_FIELD_NUMBER = 2;
  private com.google.cloud.tpu.v2.GuestAttributesValue queryValue_;
  /**
   *
   *
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
   *
   * @return Whether the queryValue field is set.
   */
  @java.lang.Override
  public boolean hasQueryValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
   *
   * @return The queryValue.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.GuestAttributesValue getQueryValue() {
    return queryValue_ == null
        ? com.google.cloud.tpu.v2.GuestAttributesValue.getDefaultInstance()
        : queryValue_;
  }
  /**
   *
   *
   * <pre>
   * The value of the requested queried path.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.GuestAttributesValueOrBuilder getQueryValueOrBuilder() {
    return queryValue_ == null
        ? com.google.cloud.tpu.v2.GuestAttributesValue.getDefaultInstance()
        : queryValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryPath_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getQueryValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryPath_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getQueryValue());
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
    if (!(obj instanceof com.google.cloud.tpu.v2.GuestAttributes)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.GuestAttributes other = (com.google.cloud.tpu.v2.GuestAttributes) obj;

    if (!getQueryPath().equals(other.getQueryPath())) return false;
    if (hasQueryValue() != other.hasQueryValue()) return false;
    if (hasQueryValue()) {
      if (!getQueryValue().equals(other.getQueryValue())) return false;
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
    hash = (37 * hash) + QUERY_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getQueryPath().hashCode();
    if (hasQueryValue()) {
      hash = (37 * hash) + QUERY_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getQueryValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.GuestAttributes parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2.GuestAttributes prototype) {
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
   * A guest attributes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.GuestAttributes}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.GuestAttributes)
      com.google.cloud.tpu.v2.GuestAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_GuestAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_GuestAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.GuestAttributes.class,
              com.google.cloud.tpu.v2.GuestAttributes.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.GuestAttributes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getQueryValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      queryPath_ = "";
      queryValue_ = null;
      if (queryValueBuilder_ != null) {
        queryValueBuilder_.dispose();
        queryValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_GuestAttributes_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.GuestAttributes getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.GuestAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.GuestAttributes build() {
      com.google.cloud.tpu.v2.GuestAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.GuestAttributes buildPartial() {
      com.google.cloud.tpu.v2.GuestAttributes result =
          new com.google.cloud.tpu.v2.GuestAttributes(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2.GuestAttributes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queryPath_ = queryPath_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queryValue_ = queryValueBuilder_ == null ? queryValue_ : queryValueBuilder_.build();
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
      if (other instanceof com.google.cloud.tpu.v2.GuestAttributes) {
        return mergeFrom((com.google.cloud.tpu.v2.GuestAttributes) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.GuestAttributes other) {
      if (other == com.google.cloud.tpu.v2.GuestAttributes.getDefaultInstance()) return this;
      if (!other.getQueryPath().isEmpty()) {
        queryPath_ = other.queryPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasQueryValue()) {
        mergeQueryValue(other.getQueryValue());
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
                queryPath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getQueryValueFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object queryPath_ = "";
    /**
     *
     *
     * <pre>
     * The path to be queried. This can be the default namespace ('/') or a
     * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
     * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
     * </pre>
     *
     * <code>string query_path = 1;</code>
     *
     * @return The queryPath.
     */
    public java.lang.String getQueryPath() {
      java.lang.Object ref = queryPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path to be queried. This can be the default namespace ('/') or a
     * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
     * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
     * </pre>
     *
     * <code>string query_path = 1;</code>
     *
     * @return The bytes for queryPath.
     */
    public com.google.protobuf.ByteString getQueryPathBytes() {
      java.lang.Object ref = queryPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        queryPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path to be queried. This can be the default namespace ('/') or a
     * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
     * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
     * </pre>
     *
     * <code>string query_path = 1;</code>
     *
     * @param value The queryPath to set.
     * @return This builder for chaining.
     */
    public Builder setQueryPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      queryPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path to be queried. This can be the default namespace ('/') or a
     * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
     * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
     * </pre>
     *
     * <code>string query_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQueryPath() {
      queryPath_ = getDefaultInstance().getQueryPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path to be queried. This can be the default namespace ('/') or a
     * nested namespace ('/&#92;&lt;namespace&#92;&gt;/') or a specified key
     * ('/&#92;&lt;namespace&#92;&gt;/&#92;&lt;key&#92;&gt;')
     * </pre>
     *
     * <code>string query_path = 1;</code>
     *
     * @param value The bytes for queryPath to set.
     * @return This builder for chaining.
     */
    public Builder setQueryPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      queryPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.tpu.v2.GuestAttributesValue queryValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2.GuestAttributesValue,
            com.google.cloud.tpu.v2.GuestAttributesValue.Builder,
            com.google.cloud.tpu.v2.GuestAttributesValueOrBuilder>
        queryValueBuilder_;
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     *
     * @return Whether the queryValue field is set.
     */
    public boolean hasQueryValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     *
     * @return The queryValue.
     */
    public com.google.cloud.tpu.v2.GuestAttributesValue getQueryValue() {
      if (queryValueBuilder_ == null) {
        return queryValue_ == null
            ? com.google.cloud.tpu.v2.GuestAttributesValue.getDefaultInstance()
            : queryValue_;
      } else {
        return queryValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public Builder setQueryValue(com.google.cloud.tpu.v2.GuestAttributesValue value) {
      if (queryValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryValue_ = value;
      } else {
        queryValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public Builder setQueryValue(
        com.google.cloud.tpu.v2.GuestAttributesValue.Builder builderForValue) {
      if (queryValueBuilder_ == null) {
        queryValue_ = builderForValue.build();
      } else {
        queryValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public Builder mergeQueryValue(com.google.cloud.tpu.v2.GuestAttributesValue value) {
      if (queryValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && queryValue_ != null
            && queryValue_ != com.google.cloud.tpu.v2.GuestAttributesValue.getDefaultInstance()) {
          getQueryValueBuilder().mergeFrom(value);
        } else {
          queryValue_ = value;
        }
      } else {
        queryValueBuilder_.mergeFrom(value);
      }
      if (queryValue_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public Builder clearQueryValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      queryValue_ = null;
      if (queryValueBuilder_ != null) {
        queryValueBuilder_.dispose();
        queryValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public com.google.cloud.tpu.v2.GuestAttributesValue.Builder getQueryValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getQueryValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    public com.google.cloud.tpu.v2.GuestAttributesValueOrBuilder getQueryValueOrBuilder() {
      if (queryValueBuilder_ != null) {
        return queryValueBuilder_.getMessageOrBuilder();
      } else {
        return queryValue_ == null
            ? com.google.cloud.tpu.v2.GuestAttributesValue.getDefaultInstance()
            : queryValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the requested queried path.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.GuestAttributesValue query_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2.GuestAttributesValue,
            com.google.cloud.tpu.v2.GuestAttributesValue.Builder,
            com.google.cloud.tpu.v2.GuestAttributesValueOrBuilder>
        getQueryValueFieldBuilder() {
      if (queryValueBuilder_ == null) {
        queryValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.tpu.v2.GuestAttributesValue,
                com.google.cloud.tpu.v2.GuestAttributesValue.Builder,
                com.google.cloud.tpu.v2.GuestAttributesValueOrBuilder>(
                getQueryValue(), getParentForChildren(), isClean());
        queryValue_ = null;
      }
      return queryValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.GuestAttributes)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.GuestAttributes)
  private static final com.google.cloud.tpu.v2.GuestAttributes DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.GuestAttributes();
  }

  public static com.google.cloud.tpu.v2.GuestAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestAttributes> PARSER =
      new com.google.protobuf.AbstractParser<GuestAttributes>() {
        @java.lang.Override
        public GuestAttributes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuestAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.GuestAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
