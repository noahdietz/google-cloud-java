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
// source: google/cloud/datacatalog/v1/table_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name
 * pattern.
 *
 * For more information, see [Introduction to partitioned tables]
 * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryDateShardedSpec}
 */
public final class BigQueryDateShardedSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.BigQueryDateShardedSpec)
    BigQueryDateShardedSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryDateShardedSpec.newBuilder() to construct.
  private BigQueryDateShardedSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryDateShardedSpec() {
    dataset_ = "";
    tablePrefix_ = "";
    latestShardResource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryDateShardedSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.TableSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.TableSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.class,
            com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.Builder.class);
  }

  public static final int DATASET_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataset_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the dataset entry the
   * current table belongs to. For example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataset.
   */
  @java.lang.Override
  public java.lang.String getDataset() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataset_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the dataset entry the
   * current table belongs to. For example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatasetBytes() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_PREFIX_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tablePrefix_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The table name prefix of the shards.
   *
   * The name of any given shard is `[table_prefix]YYYYMMDD`.
   * For example, for the `MyTable20180101` shard, the
   * `table_prefix` is `MyTable`.
   * </pre>
   *
   * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tablePrefix.
   */
  @java.lang.Override
  public java.lang.String getTablePrefix() {
    java.lang.Object ref = tablePrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tablePrefix_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The table name prefix of the shards.
   *
   * The name of any given shard is `[table_prefix]YYYYMMDD`.
   * For example, for the `MyTable20180101` shard, the
   * `table_prefix` is `MyTable`.
   * </pre>
   *
   * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tablePrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTablePrefixBytes() {
    java.lang.Object ref = tablePrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tablePrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARD_COUNT_FIELD_NUMBER = 3;
  private long shardCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. Total number of shards.
   * </pre>
   *
   * <code>int64 shard_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The shardCount.
   */
  @java.lang.Override
  public long getShardCount() {
    return shardCount_;
  }

  public static final int LATEST_SHARD_RESOURCE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object latestShardResource_ = "";
  /**
   *
   *
   * <pre>
   * Output only. BigQuery resource name of the latest shard.
   * </pre>
   *
   * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The latestShardResource.
   */
  @java.lang.Override
  public java.lang.String getLatestShardResource() {
    java.lang.Object ref = latestShardResource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latestShardResource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. BigQuery resource name of the latest shard.
   * </pre>
   *
   * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for latestShardResource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLatestShardResourceBytes() {
    java.lang.Object ref = latestShardResource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      latestShardResource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tablePrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tablePrefix_);
    }
    if (shardCount_ != 0L) {
      output.writeInt64(3, shardCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestShardResource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, latestShardResource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tablePrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tablePrefix_);
    }
    if (shardCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, shardCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestShardResource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, latestShardResource_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec other =
        (com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec) obj;

    if (!getDataset().equals(other.getDataset())) return false;
    if (!getTablePrefix().equals(other.getTablePrefix())) return false;
    if (getShardCount() != other.getShardCount()) return false;
    if (!getLatestShardResource().equals(other.getLatestShardResource())) return false;
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
    hash = (37 * hash) + DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getDataset().hashCode();
    hash = (37 * hash) + TABLE_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getTablePrefix().hashCode();
    hash = (37 * hash) + SHARD_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getShardCount());
    hash = (37 * hash) + LATEST_SHARD_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getLatestShardResource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec parseFrom(
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
      com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec prototype) {
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
   * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name
   * pattern.
   *
   * For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryDateShardedSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.BigQueryDateShardedSpec)
      com.google.cloud.datacatalog.v1.BigQueryDateShardedSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.class,
              com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataset_ = "";
      tablePrefix_ = "";
      shardCount_ = 0L;
      latestShardResource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec build() {
      com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec buildPartial() {
      com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec result =
          new com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataset_ = dataset_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tablePrefix_ = tablePrefix_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.shardCount_ = shardCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.latestShardResource_ = latestShardResource_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec other) {
      if (other == com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec.getDefaultInstance())
        return this;
      if (!other.getDataset().isEmpty()) {
        dataset_ = other.dataset_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTablePrefix().isEmpty()) {
        tablePrefix_ = other.tablePrefix_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getShardCount() != 0L) {
        setShardCount(other.getShardCount());
      }
      if (!other.getLatestShardResource().isEmpty()) {
        latestShardResource_ = other.latestShardResource_;
        bitField0_ |= 0x00000008;
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
                dataset_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                tablePrefix_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                shardCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                latestShardResource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object dataset_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The Data Catalog resource name of the dataset entry the
     * current table belongs to. For example:
     *
     * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * </pre>
     *
     * <code>
     * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The dataset.
     */
    public java.lang.String getDataset() {
      java.lang.Object ref = dataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The Data Catalog resource name of the dataset entry the
     * current table belongs to. For example:
     *
     * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * </pre>
     *
     * <code>
     * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for dataset.
     */
    public com.google.protobuf.ByteString getDatasetBytes() {
      java.lang.Object ref = dataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The Data Catalog resource name of the dataset entry the
     * current table belongs to. For example:
     *
     * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * </pre>
     *
     * <code>
     * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDataset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The Data Catalog resource name of the dataset entry the
     * current table belongs to. For example:
     *
     * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * </pre>
     *
     * <code>
     * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataset() {
      dataset_ = getDefaultInstance().getDataset();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The Data Catalog resource name of the dataset entry the
     * current table belongs to. For example:
     *
     * `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * </pre>
     *
     * <code>
     * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tablePrefix_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The table name prefix of the shards.
     *
     * The name of any given shard is `[table_prefix]YYYYMMDD`.
     * For example, for the `MyTable20180101` shard, the
     * `table_prefix` is `MyTable`.
     * </pre>
     *
     * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The tablePrefix.
     */
    public java.lang.String getTablePrefix() {
      java.lang.Object ref = tablePrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tablePrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The table name prefix of the shards.
     *
     * The name of any given shard is `[table_prefix]YYYYMMDD`.
     * For example, for the `MyTable20180101` shard, the
     * `table_prefix` is `MyTable`.
     * </pre>
     *
     * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for tablePrefix.
     */
    public com.google.protobuf.ByteString getTablePrefixBytes() {
      java.lang.Object ref = tablePrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tablePrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The table name prefix of the shards.
     *
     * The name of any given shard is `[table_prefix]YYYYMMDD`.
     * For example, for the `MyTable20180101` shard, the
     * `table_prefix` is `MyTable`.
     * </pre>
     *
     * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The tablePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setTablePrefix(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tablePrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table name prefix of the shards.
     *
     * The name of any given shard is `[table_prefix]YYYYMMDD`.
     * For example, for the `MyTable20180101` shard, the
     * `table_prefix` is `MyTable`.
     * </pre>
     *
     * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTablePrefix() {
      tablePrefix_ = getDefaultInstance().getTablePrefix();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table name prefix of the shards.
     *
     * The name of any given shard is `[table_prefix]YYYYMMDD`.
     * For example, for the `MyTable20180101` shard, the
     * `table_prefix` is `MyTable`.
     * </pre>
     *
     * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for tablePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setTablePrefixBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tablePrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long shardCount_;
    /**
     *
     *
     * <pre>
     * Output only. Total number of shards.
     * </pre>
     *
     * <code>int64 shard_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The shardCount.
     */
    @java.lang.Override
    public long getShardCount() {
      return shardCount_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Total number of shards.
     * </pre>
     *
     * <code>int64 shard_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The shardCount to set.
     * @return This builder for chaining.
     */
    public Builder setShardCount(long value) {

      shardCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Total number of shards.
     * </pre>
     *
     * <code>int64 shard_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShardCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      shardCount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object latestShardResource_ = "";
    /**
     *
     *
     * <pre>
     * Output only. BigQuery resource name of the latest shard.
     * </pre>
     *
     * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The latestShardResource.
     */
    public java.lang.String getLatestShardResource() {
      java.lang.Object ref = latestShardResource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestShardResource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery resource name of the latest shard.
     * </pre>
     *
     * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for latestShardResource.
     */
    public com.google.protobuf.ByteString getLatestShardResourceBytes() {
      java.lang.Object ref = latestShardResource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        latestShardResource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery resource name of the latest shard.
     * </pre>
     *
     * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The latestShardResource to set.
     * @return This builder for chaining.
     */
    public Builder setLatestShardResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      latestShardResource_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery resource name of the latest shard.
     * </pre>
     *
     * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLatestShardResource() {
      latestShardResource_ = getDefaultInstance().getLatestShardResource();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery resource name of the latest shard.
     * </pre>
     *
     * <code>string latest_shard_resource = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for latestShardResource to set.
     * @return This builder for chaining.
     */
    public Builder setLatestShardResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      latestShardResource_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.BigQueryDateShardedSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.BigQueryDateShardedSpec)
  private static final com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec();
  }

  public static com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryDateShardedSpec> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryDateShardedSpec>() {
        @java.lang.Override
        public BigQueryDateShardedSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryDateShardedSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryDateShardedSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
