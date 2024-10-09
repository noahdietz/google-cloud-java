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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Data schema indicates how the user specified annotation is interpreted in the
 * system.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.DataSchema}
 */
public final class DataSchema extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.DataSchema)
    DataSchemaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataSchema.newBuilder() to construct.
  private DataSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataSchema() {
    name_ = "";
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataSchema();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_DataSchema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_DataSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.DataSchema.class,
            com.google.cloud.visionai.v1.DataSchema.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Resource name of the data schema in the form of:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
   * where {data_schema} part should be the same as the `key` field below.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the data schema in the form of:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
   * where {data_schema} part should be the same as the `key` field below.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   *
   *
   * <pre>
   * Required. The key of this data schema. This key should be matching the key
   * of user specified annotation and unique inside corpus. This value can be up
   * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
   * character must be a letter, the last could be a letter or a number.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The key of this data schema. This key should be matching the key
   * of user specified annotation and unique inside corpus. This value can be up
   * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
   * character must be a letter, the last could be a letter or a number.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_DETAILS_FIELD_NUMBER = 3;
  private com.google.cloud.visionai.v1.DataSchemaDetails schemaDetails_;
  /**
   *
   *
   * <pre>
   * The schema details mapping to the key.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
   *
   * @return Whether the schemaDetails field is set.
   */
  @java.lang.Override
  public boolean hasSchemaDetails() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The schema details mapping to the key.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
   *
   * @return The schemaDetails.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.DataSchemaDetails getSchemaDetails() {
    return schemaDetails_ == null
        ? com.google.cloud.visionai.v1.DataSchemaDetails.getDefaultInstance()
        : schemaDetails_;
  }
  /**
   *
   *
   * <pre>
   * The schema details mapping to the key.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.DataSchemaDetailsOrBuilder getSchemaDetailsOrBuilder() {
    return schemaDetails_ == null
        ? com.google.cloud.visionai.v1.DataSchemaDetails.getDefaultInstance()
        : schemaDetails_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSchemaDetails());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSchemaDetails());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.DataSchema)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.DataSchema other = (com.google.cloud.visionai.v1.DataSchema) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getKey().equals(other.getKey())) return false;
    if (hasSchemaDetails() != other.hasSchemaDetails()) return false;
    if (hasSchemaDetails()) {
      if (!getSchemaDetails().equals(other.getSchemaDetails())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (hasSchemaDetails()) {
      hash = (37 * hash) + SCHEMA_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getSchemaDetails().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.DataSchema parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.DataSchema prototype) {
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
   * Data schema indicates how the user specified annotation is interpreted in the
   * system.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.DataSchema}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.DataSchema)
      com.google.cloud.visionai.v1.DataSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_DataSchema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_DataSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.DataSchema.class,
              com.google.cloud.visionai.v1.DataSchema.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.DataSchema.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSchemaDetailsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      key_ = "";
      schemaDetails_ = null;
      if (schemaDetailsBuilder_ != null) {
        schemaDetailsBuilder_.dispose();
        schemaDetailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_DataSchema_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.DataSchema getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.DataSchema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.DataSchema build() {
      com.google.cloud.visionai.v1.DataSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.DataSchema buildPartial() {
      com.google.cloud.visionai.v1.DataSchema result =
          new com.google.cloud.visionai.v1.DataSchema(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.DataSchema result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = key_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.schemaDetails_ =
            schemaDetailsBuilder_ == null ? schemaDetails_ : schemaDetailsBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.DataSchema) {
        return mergeFrom((com.google.cloud.visionai.v1.DataSchema) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.DataSchema other) {
      if (other == com.google.cloud.visionai.v1.DataSchema.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSchemaDetails()) {
        mergeSchemaDetails(other.getSchemaDetails());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getSchemaDetailsFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the data schema in the form of:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
     * where {data_schema} part should be the same as the `key` field below.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the data schema in the form of:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
     * where {data_schema} part should be the same as the `key` field below.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the data schema in the form of:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
     * where {data_schema} part should be the same as the `key` field below.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the data schema in the form of:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
     * where {data_schema} part should be the same as the `key` field below.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the data schema in the form of:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
     * where {data_schema} part should be the same as the `key` field below.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * Required. The key of this data schema. This key should be matching the key
     * of user specified annotation and unique inside corpus. This value can be up
     * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
     * character must be a letter, the last could be a letter or a number.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key of this data schema. This key should be matching the key
     * of user specified annotation and unique inside corpus. This value can be up
     * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
     * character must be a letter, the last could be a letter or a number.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key of this data schema. This key should be matching the key
     * of user specified annotation and unique inside corpus. This value can be up
     * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
     * character must be a letter, the last could be a letter or a number.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key of this data schema. This key should be matching the key
     * of user specified annotation and unique inside corpus. This value can be up
     * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
     * character must be a letter, the last could be a letter or a number.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key of this data schema. This key should be matching the key
     * of user specified annotation and unique inside corpus. This value can be up
     * to 63 characters, and valid characters are /[a-z][0-9]-/. The first
     * character must be a letter, the last could be a letter or a number.
     * </pre>
     *
     * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.visionai.v1.DataSchemaDetails schemaDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.DataSchemaDetails,
            com.google.cloud.visionai.v1.DataSchemaDetails.Builder,
            com.google.cloud.visionai.v1.DataSchemaDetailsOrBuilder>
        schemaDetailsBuilder_;
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     *
     * @return Whether the schemaDetails field is set.
     */
    public boolean hasSchemaDetails() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     *
     * @return The schemaDetails.
     */
    public com.google.cloud.visionai.v1.DataSchemaDetails getSchemaDetails() {
      if (schemaDetailsBuilder_ == null) {
        return schemaDetails_ == null
            ? com.google.cloud.visionai.v1.DataSchemaDetails.getDefaultInstance()
            : schemaDetails_;
      } else {
        return schemaDetailsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public Builder setSchemaDetails(com.google.cloud.visionai.v1.DataSchemaDetails value) {
      if (schemaDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schemaDetails_ = value;
      } else {
        schemaDetailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public Builder setSchemaDetails(
        com.google.cloud.visionai.v1.DataSchemaDetails.Builder builderForValue) {
      if (schemaDetailsBuilder_ == null) {
        schemaDetails_ = builderForValue.build();
      } else {
        schemaDetailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public Builder mergeSchemaDetails(com.google.cloud.visionai.v1.DataSchemaDetails value) {
      if (schemaDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && schemaDetails_ != null
            && schemaDetails_
                != com.google.cloud.visionai.v1.DataSchemaDetails.getDefaultInstance()) {
          getSchemaDetailsBuilder().mergeFrom(value);
        } else {
          schemaDetails_ = value;
        }
      } else {
        schemaDetailsBuilder_.mergeFrom(value);
      }
      if (schemaDetails_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public Builder clearSchemaDetails() {
      bitField0_ = (bitField0_ & ~0x00000004);
      schemaDetails_ = null;
      if (schemaDetailsBuilder_ != null) {
        schemaDetailsBuilder_.dispose();
        schemaDetailsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public com.google.cloud.visionai.v1.DataSchemaDetails.Builder getSchemaDetailsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSchemaDetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    public com.google.cloud.visionai.v1.DataSchemaDetailsOrBuilder getSchemaDetailsOrBuilder() {
      if (schemaDetailsBuilder_ != null) {
        return schemaDetailsBuilder_.getMessageOrBuilder();
      } else {
        return schemaDetails_ == null
            ? com.google.cloud.visionai.v1.DataSchemaDetails.getDefaultInstance()
            : schemaDetails_;
      }
    }
    /**
     *
     *
     * <pre>
     * The schema details mapping to the key.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.DataSchemaDetails schema_details = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.DataSchemaDetails,
            com.google.cloud.visionai.v1.DataSchemaDetails.Builder,
            com.google.cloud.visionai.v1.DataSchemaDetailsOrBuilder>
        getSchemaDetailsFieldBuilder() {
      if (schemaDetailsBuilder_ == null) {
        schemaDetailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.DataSchemaDetails,
                com.google.cloud.visionai.v1.DataSchemaDetails.Builder,
                com.google.cloud.visionai.v1.DataSchemaDetailsOrBuilder>(
                getSchemaDetails(), getParentForChildren(), isClean());
        schemaDetails_ = null;
      }
      return schemaDetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.DataSchema)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.DataSchema)
  private static final com.google.cloud.visionai.v1.DataSchema DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.DataSchema();
  }

  public static com.google.cloud.visionai.v1.DataSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSchema> PARSER =
      new com.google.protobuf.AbstractParser<DataSchema>() {
        @java.lang.Override
        public DataSchema parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSchema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.DataSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
