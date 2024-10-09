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
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * A request to enroll a set of data sources so they are visible in the
 * BigQuery UI's `Transfer` tab.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest}
 */
public final class EnrollDataSourcesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)
    EnrollDataSourcesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnrollDataSourcesRequest.newBuilder() to construct.
  private EnrollDataSourcesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnrollDataSourcesRequest() {
    name_ = "";
    dataSourceIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnrollDataSourcesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EnrollDataSourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EnrollDataSourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest.class,
            com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the project resource in the form:
   * `projects/{project_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The name of the project resource in the form:
   * `projects/{project_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int DATA_SOURCE_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList dataSourceIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @return A list containing the dataSourceIds.
   */
  public com.google.protobuf.ProtocolStringList getDataSourceIdsList() {
    return dataSourceIds_;
  }
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @return The count of dataSourceIds.
   */
  public int getDataSourceIdsCount() {
    return dataSourceIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The dataSourceIds at the given index.
   */
  public java.lang.String getDataSourceIds(int index) {
    return dataSourceIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dataSourceIds at the given index.
   */
  public com.google.protobuf.ByteString getDataSourceIdsBytes(int index) {
    return dataSourceIds_.getByteString(index);
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
    for (int i = 0; i < dataSourceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataSourceIds_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < dataSourceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(dataSourceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDataSourceIdsList().size();
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest other =
        (com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDataSourceIdsList().equals(other.getDataSourceIdsList())) return false;
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
    if (getDataSourceIdsCount() > 0) {
      hash = (37 * hash) + DATA_SOURCE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest parseFrom(
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
      com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest prototype) {
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
   * A request to enroll a set of data sources so they are visible in the
   * BigQuery UI's `Transfer` tab.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)
      com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EnrollDataSourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EnrollDataSourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest.class,
              com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      dataSourceIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EnrollDataSourcesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest result =
          new com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        dataSourceIds_.makeImmutable();
        result.dataSourceIds_ = dataSourceIds_;
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest other) {
      if (other
          == com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.dataSourceIds_.isEmpty()) {
        if (dataSourceIds_.isEmpty()) {
          dataSourceIds_ = other.dataSourceIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDataSourceIdsIsMutable();
          dataSourceIds_.addAll(other.dataSourceIds_);
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureDataSourceIdsIsMutable();
                dataSourceIds_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the project resource in the form:
     * `projects/{project_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project resource in the form:
     * `projects/{project_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project resource in the form:
     * `projects/{project_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project resource in the form:
     * `projects/{project_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project resource in the form:
     * `projects/{project_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.protobuf.LazyStringArrayList dataSourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureDataSourceIdsIsMutable() {
      if (!dataSourceIds_.isModifiable()) {
        dataSourceIds_ = new com.google.protobuf.LazyStringArrayList(dataSourceIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @return A list containing the dataSourceIds.
     */
    public com.google.protobuf.ProtocolStringList getDataSourceIdsList() {
      dataSourceIds_.makeImmutable();
      return dataSourceIds_;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @return The count of dataSourceIds.
     */
    public int getDataSourceIdsCount() {
      return dataSourceIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The dataSourceIds at the given index.
     */
    public java.lang.String getDataSourceIds(int index) {
      return dataSourceIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the dataSourceIds at the given index.
     */
    public com.google.protobuf.ByteString getDataSourceIdsBytes(int index) {
      return dataSourceIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The dataSourceIds to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param value The dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addDataSourceIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param values The dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDataSourceIds(java.lang.Iterable<java.lang.String> values) {
      ensureDataSourceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataSourceIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataSourceIds() {
      dataSourceIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data sources that are enrolled. It is required to provide at least one
     * data source id.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     *
     * @param value The bytes of the dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addDataSourceIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnrollDataSourcesRequest> PARSER =
      new com.google.protobuf.AbstractParser<EnrollDataSourcesRequest>() {
        @java.lang.Override
        public EnrollDataSourcesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnrollDataSourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnrollDataSourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
