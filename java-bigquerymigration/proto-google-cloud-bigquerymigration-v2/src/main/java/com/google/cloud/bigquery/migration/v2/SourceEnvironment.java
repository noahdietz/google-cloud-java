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
// source: google/cloud/bigquery/migration/v2/translation_details.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.migration.v2;

/**
 *
 *
 * <pre>
 * Represents the default source environment values for the translation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2.SourceEnvironment}
 */
public final class SourceEnvironment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2.SourceEnvironment)
    SourceEnvironmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceEnvironment.newBuilder() to construct.
  private SourceEnvironment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceEnvironment() {
    defaultDatabase_ = "";
    schemaSearchPath_ = com.google.protobuf.LazyStringArrayList.emptyList();
    metadataStoreDataset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceEnvironment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2.TranslationDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2_SourceEnvironment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2.TranslationDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2_SourceEnvironment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2.SourceEnvironment.class,
            com.google.cloud.bigquery.migration.v2.SourceEnvironment.Builder.class);
  }

  public static final int DEFAULT_DATABASE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultDatabase_ = "";
  /**
   *
   *
   * <pre>
   * The default database name to fully qualify SQL objects when their database
   * name is missing.
   * </pre>
   *
   * <code>string default_database = 1;</code>
   *
   * @return The defaultDatabase.
   */
  @java.lang.Override
  public java.lang.String getDefaultDatabase() {
    java.lang.Object ref = defaultDatabase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultDatabase_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The default database name to fully qualify SQL objects when their database
   * name is missing.
   * </pre>
   *
   * <code>string default_database = 1;</code>
   *
   * @return The bytes for defaultDatabase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDefaultDatabaseBytes() {
    java.lang.Object ref = defaultDatabase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      defaultDatabase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_SEARCH_PATH_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList schemaSearchPath_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @return A list containing the schemaSearchPath.
   */
  public com.google.protobuf.ProtocolStringList getSchemaSearchPathList() {
    return schemaSearchPath_;
  }
  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @return The count of schemaSearchPath.
   */
  public int getSchemaSearchPathCount() {
    return schemaSearchPath_.size();
  }
  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The schemaSearchPath at the given index.
   */
  public java.lang.String getSchemaSearchPath(int index) {
    return schemaSearchPath_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The schema search path. When SQL objects are missing schema name,
   * translation engine will search through this list to find the value.
   * </pre>
   *
   * <code>repeated string schema_search_path = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the schemaSearchPath at the given index.
   */
  public com.google.protobuf.ByteString getSchemaSearchPathBytes(int index) {
    return schemaSearchPath_.getByteString(index);
  }

  public static final int METADATA_STORE_DATASET_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object metadataStoreDataset_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
   * project-123.metadata_store_123.  If specified, translation will search and
   * read the required schema information from a metadata store in this dataset.
   * If metadata store doesn't exist, translation will parse the metadata file
   * and upload the schema info to a temp table in the dataset to speed up
   * future translation jobs.
   * </pre>
   *
   * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metadataStoreDataset.
   */
  @java.lang.Override
  public java.lang.String getMetadataStoreDataset() {
    java.lang.Object ref = metadataStoreDataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataStoreDataset_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
   * project-123.metadata_store_123.  If specified, translation will search and
   * read the required schema information from a metadata store in this dataset.
   * If metadata store doesn't exist, translation will parse the metadata file
   * and upload the schema info to a temp table in the dataset to speed up
   * future translation jobs.
   * </pre>
   *
   * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for metadataStoreDataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadataStoreDatasetBytes() {
    java.lang.Object ref = metadataStoreDataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metadataStoreDataset_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDatabase_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, defaultDatabase_);
    }
    for (int i = 0; i < schemaSearchPath_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, schemaSearchPath_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataStoreDataset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metadataStoreDataset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDatabase_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, defaultDatabase_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < schemaSearchPath_.size(); i++) {
        dataSize += computeStringSizeNoTag(schemaSearchPath_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSchemaSearchPathList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataStoreDataset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metadataStoreDataset_);
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2.SourceEnvironment)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2.SourceEnvironment other =
        (com.google.cloud.bigquery.migration.v2.SourceEnvironment) obj;

    if (!getDefaultDatabase().equals(other.getDefaultDatabase())) return false;
    if (!getSchemaSearchPathList().equals(other.getSchemaSearchPathList())) return false;
    if (!getMetadataStoreDataset().equals(other.getMetadataStoreDataset())) return false;
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
    hash = (37 * hash) + DEFAULT_DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultDatabase().hashCode();
    if (getSchemaSearchPathCount() > 0) {
      hash = (37 * hash) + SCHEMA_SEARCH_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getSchemaSearchPathList().hashCode();
    }
    hash = (37 * hash) + METADATA_STORE_DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataStoreDataset().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment parseFrom(
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
      com.google.cloud.bigquery.migration.v2.SourceEnvironment prototype) {
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
   * Represents the default source environment values for the translation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2.SourceEnvironment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2.SourceEnvironment)
      com.google.cloud.bigquery.migration.v2.SourceEnvironmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2.TranslationDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2_SourceEnvironment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2.TranslationDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2_SourceEnvironment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2.SourceEnvironment.class,
              com.google.cloud.bigquery.migration.v2.SourceEnvironment.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2.SourceEnvironment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      defaultDatabase_ = "";
      schemaSearchPath_ = com.google.protobuf.LazyStringArrayList.emptyList();
      metadataStoreDataset_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2.TranslationDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2_SourceEnvironment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.SourceEnvironment getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2.SourceEnvironment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.SourceEnvironment build() {
      com.google.cloud.bigquery.migration.v2.SourceEnvironment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.SourceEnvironment buildPartial() {
      com.google.cloud.bigquery.migration.v2.SourceEnvironment result =
          new com.google.cloud.bigquery.migration.v2.SourceEnvironment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2.SourceEnvironment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.defaultDatabase_ = defaultDatabase_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        schemaSearchPath_.makeImmutable();
        result.schemaSearchPath_ = schemaSearchPath_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadataStoreDataset_ = metadataStoreDataset_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2.SourceEnvironment) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2.SourceEnvironment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2.SourceEnvironment other) {
      if (other == com.google.cloud.bigquery.migration.v2.SourceEnvironment.getDefaultInstance())
        return this;
      if (!other.getDefaultDatabase().isEmpty()) {
        defaultDatabase_ = other.defaultDatabase_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.schemaSearchPath_.isEmpty()) {
        if (schemaSearchPath_.isEmpty()) {
          schemaSearchPath_ = other.schemaSearchPath_;
          bitField0_ |= 0x00000002;
        } else {
          ensureSchemaSearchPathIsMutable();
          schemaSearchPath_.addAll(other.schemaSearchPath_);
        }
        onChanged();
      }
      if (!other.getMetadataStoreDataset().isEmpty()) {
        metadataStoreDataset_ = other.metadataStoreDataset_;
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
                defaultDatabase_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureSchemaSearchPathIsMutable();
                schemaSearchPath_.add(s);
                break;
              } // case 18
            case 26:
              {
                metadataStoreDataset_ = input.readStringRequireUtf8();
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

    private java.lang.Object defaultDatabase_ = "";
    /**
     *
     *
     * <pre>
     * The default database name to fully qualify SQL objects when their database
     * name is missing.
     * </pre>
     *
     * <code>string default_database = 1;</code>
     *
     * @return The defaultDatabase.
     */
    public java.lang.String getDefaultDatabase() {
      java.lang.Object ref = defaultDatabase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultDatabase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The default database name to fully qualify SQL objects when their database
     * name is missing.
     * </pre>
     *
     * <code>string default_database = 1;</code>
     *
     * @return The bytes for defaultDatabase.
     */
    public com.google.protobuf.ByteString getDefaultDatabaseBytes() {
      java.lang.Object ref = defaultDatabase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        defaultDatabase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The default database name to fully qualify SQL objects when their database
     * name is missing.
     * </pre>
     *
     * <code>string default_database = 1;</code>
     *
     * @param value The defaultDatabase to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      defaultDatabase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The default database name to fully qualify SQL objects when their database
     * name is missing.
     * </pre>
     *
     * <code>string default_database = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultDatabase() {
      defaultDatabase_ = getDefaultInstance().getDefaultDatabase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The default database name to fully qualify SQL objects when their database
     * name is missing.
     * </pre>
     *
     * <code>string default_database = 1;</code>
     *
     * @param value The bytes for defaultDatabase to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      defaultDatabase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList schemaSearchPath_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureSchemaSearchPathIsMutable() {
      if (!schemaSearchPath_.isModifiable()) {
        schemaSearchPath_ = new com.google.protobuf.LazyStringArrayList(schemaSearchPath_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @return A list containing the schemaSearchPath.
     */
    public com.google.protobuf.ProtocolStringList getSchemaSearchPathList() {
      schemaSearchPath_.makeImmutable();
      return schemaSearchPath_;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @return The count of schemaSearchPath.
     */
    public int getSchemaSearchPathCount() {
      return schemaSearchPath_.size();
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The schemaSearchPath at the given index.
     */
    public java.lang.String getSchemaSearchPath(int index) {
      return schemaSearchPath_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the schemaSearchPath at the given index.
     */
    public com.google.protobuf.ByteString getSchemaSearchPathBytes(int index) {
      return schemaSearchPath_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The schemaSearchPath to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaSearchPath(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSchemaSearchPathIsMutable();
      schemaSearchPath_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param value The schemaSearchPath to add.
     * @return This builder for chaining.
     */
    public Builder addSchemaSearchPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSchemaSearchPathIsMutable();
      schemaSearchPath_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param values The schemaSearchPath to add.
     * @return This builder for chaining.
     */
    public Builder addAllSchemaSearchPath(java.lang.Iterable<java.lang.String> values) {
      ensureSchemaSearchPathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, schemaSearchPath_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchemaSearchPath() {
      schemaSearchPath_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema search path. When SQL objects are missing schema name,
     * translation engine will search through this list to find the value.
     * </pre>
     *
     * <code>repeated string schema_search_path = 2;</code>
     *
     * @param value The bytes of the schemaSearchPath to add.
     * @return This builder for chaining.
     */
    public Builder addSchemaSearchPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureSchemaSearchPathIsMutable();
      schemaSearchPath_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object metadataStoreDataset_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
     * project-123.metadata_store_123.  If specified, translation will search and
     * read the required schema information from a metadata store in this dataset.
     * If metadata store doesn't exist, translation will parse the metadata file
     * and upload the schema info to a temp table in the dataset to speed up
     * future translation jobs.
     * </pre>
     *
     * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The metadataStoreDataset.
     */
    public java.lang.String getMetadataStoreDataset() {
      java.lang.Object ref = metadataStoreDataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataStoreDataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
     * project-123.metadata_store_123.  If specified, translation will search and
     * read the required schema information from a metadata store in this dataset.
     * If metadata store doesn't exist, translation will parse the metadata file
     * and upload the schema info to a temp table in the dataset to speed up
     * future translation jobs.
     * </pre>
     *
     * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for metadataStoreDataset.
     */
    public com.google.protobuf.ByteString getMetadataStoreDatasetBytes() {
      java.lang.Object ref = metadataStoreDataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metadataStoreDataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
     * project-123.metadata_store_123.  If specified, translation will search and
     * read the required schema information from a metadata store in this dataset.
     * If metadata store doesn't exist, translation will parse the metadata file
     * and upload the schema info to a temp table in the dataset to speed up
     * future translation jobs.
     * </pre>
     *
     * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The metadataStoreDataset to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataStoreDataset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      metadataStoreDataset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
     * project-123.metadata_store_123.  If specified, translation will search and
     * read the required schema information from a metadata store in this dataset.
     * If metadata store doesn't exist, translation will parse the metadata file
     * and upload the schema info to a temp table in the dataset to speed up
     * future translation jobs.
     * </pre>
     *
     * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetadataStoreDataset() {
      metadataStoreDataset_ = getDefaultInstance().getMetadataStoreDataset();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Expects a validQ BigQuery dataset ID that exists, e.g.,
     * project-123.metadata_store_123.  If specified, translation will search and
     * read the required schema information from a metadata store in this dataset.
     * If metadata store doesn't exist, translation will parse the metadata file
     * and upload the schema info to a temp table in the dataset to speed up
     * future translation jobs.
     * </pre>
     *
     * <code>string metadata_store_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for metadataStoreDataset to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataStoreDatasetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      metadataStoreDataset_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2.SourceEnvironment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2.SourceEnvironment)
  private static final com.google.cloud.bigquery.migration.v2.SourceEnvironment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2.SourceEnvironment();
  }

  public static com.google.cloud.bigquery.migration.v2.SourceEnvironment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceEnvironment> PARSER =
      new com.google.protobuf.AbstractParser<SourceEnvironment>() {
        @java.lang.Override
        public SourceEnvironment parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceEnvironment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceEnvironment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.SourceEnvironment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
