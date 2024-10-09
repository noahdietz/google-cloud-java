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
// source: google/cloud/discoveryengine/v1beta/schema.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Defines the structure and layout of a type of document data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.Schema}
 */
public final class Schema extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.Schema)
    SchemaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Schema.newBuilder() to construct.
  private Schema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Schema() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Schema();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.SchemaProto
        .internal_static_google_cloud_discoveryengine_v1beta_Schema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.SchemaProto
        .internal_static_google_cloud_discoveryengine_v1beta_Schema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.Schema.class,
            com.google.cloud.discoveryengine.v1beta.Schema.Builder.class);
  }

  private int schemaCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object schema_;

  public enum SchemaCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRUCT_SCHEMA(2),
    JSON_SCHEMA(3),
    SCHEMA_NOT_SET(0);
    private final int value;

    private SchemaCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SchemaCase valueOf(int value) {
      return forNumber(value);
    }

    public static SchemaCase forNumber(int value) {
      switch (value) {
        case 2:
          return STRUCT_SCHEMA;
        case 3:
          return JSON_SCHEMA;
        case 0:
          return SCHEMA_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SchemaCase getSchemaCase() {
    return SchemaCase.forNumber(schemaCase_);
  }

  public static final int STRUCT_SCHEMA_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   *
   * @return Whether the structSchema field is set.
   */
  @java.lang.Override
  public boolean hasStructSchema() {
    return schemaCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   *
   * @return The structSchema.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getStructSchema() {
    if (schemaCase_ == 2) {
      return (com.google.protobuf.Struct) schema_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getStructSchemaOrBuilder() {
    if (schemaCase_ == 2) {
      return (com.google.protobuf.Struct) schema_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }

  public static final int JSON_SCHEMA_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return Whether the jsonSchema field is set.
   */
  public boolean hasJsonSchema() {
    return schemaCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return The jsonSchema.
   */
  public java.lang.String getJsonSchema() {
    java.lang.Object ref = "";
    if (schemaCase_ == 3) {
      ref = schema_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (schemaCase_ == 3) {
        schema_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return The bytes for jsonSchema.
   */
  public com.google.protobuf.ByteString getJsonSchemaBytes() {
    java.lang.Object ref = "";
    if (schemaCase_ == 3) {
      ref = schema_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (schemaCase_ == 3) {
        schema_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
    if (schemaCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Struct) schema_);
    }
    if (schemaCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, schema_);
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
    if (schemaCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.protobuf.Struct) schema_);
    }
    if (schemaCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, schema_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.Schema)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.Schema other =
        (com.google.cloud.discoveryengine.v1beta.Schema) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getSchemaCase().equals(other.getSchemaCase())) return false;
    switch (schemaCase_) {
      case 2:
        if (!getStructSchema().equals(other.getStructSchema())) return false;
        break;
      case 3:
        if (!getJsonSchema().equals(other.getJsonSchema())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    switch (schemaCase_) {
      case 2:
        hash = (37 * hash) + STRUCT_SCHEMA_FIELD_NUMBER;
        hash = (53 * hash) + getStructSchema().hashCode();
        break;
      case 3:
        hash = (37 * hash) + JSON_SCHEMA_FIELD_NUMBER;
        hash = (53 * hash) + getJsonSchema().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema parseFrom(
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

  public static Builder newBuilder(com.google.cloud.discoveryengine.v1beta.Schema prototype) {
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
   * Defines the structure and layout of a type of document data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.Schema}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.Schema)
      com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.SchemaProto
          .internal_static_google_cloud_discoveryengine_v1beta_Schema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.SchemaProto
          .internal_static_google_cloud_discoveryengine_v1beta_Schema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.Schema.class,
              com.google.cloud.discoveryengine.v1beta.Schema.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.Schema.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (structSchemaBuilder_ != null) {
        structSchemaBuilder_.clear();
      }
      name_ = "";
      schemaCase_ = 0;
      schema_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.SchemaProto
          .internal_static_google_cloud_discoveryengine_v1beta_Schema_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Schema getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Schema build() {
      com.google.cloud.discoveryengine.v1beta.Schema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.Schema buildPartial() {
      com.google.cloud.discoveryengine.v1beta.Schema result =
          new com.google.cloud.discoveryengine.v1beta.Schema(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1beta.Schema result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.discoveryengine.v1beta.Schema result) {
      result.schemaCase_ = schemaCase_;
      result.schema_ = this.schema_;
      if (schemaCase_ == 2 && structSchemaBuilder_ != null) {
        result.schema_ = structSchemaBuilder_.build();
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.Schema) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.Schema) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.Schema other) {
      if (other == com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      switch (other.getSchemaCase()) {
        case STRUCT_SCHEMA:
          {
            mergeStructSchema(other.getStructSchema());
            break;
          }
        case JSON_SCHEMA:
          {
            schemaCase_ = 3;
            schema_ = other.schema_;
            onChanged();
            break;
          }
        case SCHEMA_NOT_SET:
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStructSchemaFieldBuilder().getBuilder(), extensionRegistry);
                schemaCase_ = 2;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                schemaCase_ = 3;
                schema_ = s;
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

    private int schemaCase_ = 0;
    private java.lang.Object schema_;

    public SchemaCase getSchemaCase() {
      return SchemaCase.forNumber(schemaCase_);
    }

    public Builder clearSchema() {
      schemaCase_ = 0;
      schema_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        structSchemaBuilder_;
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     *
     * @return Whether the structSchema field is set.
     */
    @java.lang.Override
    public boolean hasStructSchema() {
      return schemaCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     *
     * @return The structSchema.
     */
    @java.lang.Override
    public com.google.protobuf.Struct getStructSchema() {
      if (structSchemaBuilder_ == null) {
        if (schemaCase_ == 2) {
          return (com.google.protobuf.Struct) schema_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (schemaCase_ == 2) {
          return structSchemaBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    public Builder setStructSchema(com.google.protobuf.Struct value) {
      if (structSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schema_ = value;
        onChanged();
      } else {
        structSchemaBuilder_.setMessage(value);
      }
      schemaCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    public Builder setStructSchema(com.google.protobuf.Struct.Builder builderForValue) {
      if (structSchemaBuilder_ == null) {
        schema_ = builderForValue.build();
        onChanged();
      } else {
        structSchemaBuilder_.setMessage(builderForValue.build());
      }
      schemaCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    public Builder mergeStructSchema(com.google.protobuf.Struct value) {
      if (structSchemaBuilder_ == null) {
        if (schemaCase_ == 2 && schema_ != com.google.protobuf.Struct.getDefaultInstance()) {
          schema_ =
              com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) schema_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          schema_ = value;
        }
        onChanged();
      } else {
        if (schemaCase_ == 2) {
          structSchemaBuilder_.mergeFrom(value);
        } else {
          structSchemaBuilder_.setMessage(value);
        }
      }
      schemaCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    public Builder clearStructSchema() {
      if (structSchemaBuilder_ == null) {
        if (schemaCase_ == 2) {
          schemaCase_ = 0;
          schema_ = null;
          onChanged();
        }
      } else {
        if (schemaCase_ == 2) {
          schemaCase_ = 0;
          schema_ = null;
        }
        structSchemaBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getStructSchemaBuilder() {
      return getStructSchemaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.StructOrBuilder getStructSchemaOrBuilder() {
      if ((schemaCase_ == 2) && (structSchemaBuilder_ != null)) {
        return structSchemaBuilder_.getMessageOrBuilder();
      } else {
        if (schemaCase_ == 2) {
          return (com.google.protobuf.Struct) schema_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The structured representation of the schema.
     * </pre>
     *
     * <code>.google.protobuf.Struct struct_schema = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getStructSchemaFieldBuilder() {
      if (structSchemaBuilder_ == null) {
        if (!(schemaCase_ == 2)) {
          schema_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        structSchemaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) schema_, getParentForChildren(), isClean());
        schema_ = null;
      }
      schemaCase_ = 2;
      onChanged();
      return structSchemaBuilder_;
    }

    /**
     *
     *
     * <pre>
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @return Whether the jsonSchema field is set.
     */
    @java.lang.Override
    public boolean hasJsonSchema() {
      return schemaCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @return The jsonSchema.
     */
    @java.lang.Override
    public java.lang.String getJsonSchema() {
      java.lang.Object ref = "";
      if (schemaCase_ == 3) {
        ref = schema_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (schemaCase_ == 3) {
          schema_ = s;
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
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @return The bytes for jsonSchema.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getJsonSchemaBytes() {
      java.lang.Object ref = "";
      if (schemaCase_ == 3) {
        ref = schema_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (schemaCase_ == 3) {
          schema_ = b;
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
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @param value The jsonSchema to set.
     * @return This builder for chaining.
     */
    public Builder setJsonSchema(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      schemaCase_ = 3;
      schema_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJsonSchema() {
      if (schemaCase_ == 3) {
        schemaCase_ = 0;
        schema_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The JSON representation of the schema.
     * </pre>
     *
     * <code>string json_schema = 3;</code>
     *
     * @param value The bytes for jsonSchema to set.
     * @return This builder for chaining.
     */
    public Builder setJsonSchemaBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      schemaCase_ = 3;
      schema_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. The full resource name of the schema, in the format of
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
     *
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Immutable. The full resource name of the schema, in the format of
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
     *
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Immutable. The full resource name of the schema, in the format of
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
     *
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The full resource name of the schema, in the format of
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
     *
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The full resource name of the schema, in the format of
     * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
     *
     * This field must be a UTF-8 encoded string with a length limit of 1024
     * characters.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.Schema)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.Schema)
  private static final com.google.cloud.discoveryengine.v1beta.Schema DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.Schema();
  }

  public static com.google.cloud.discoveryengine.v1beta.Schema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Schema> PARSER =
      new com.google.protobuf.AbstractParser<Schema>() {
        @java.lang.Override
        public Schema parsePartialFrom(
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

  public static com.google.protobuf.Parser<Schema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Schema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.Schema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
