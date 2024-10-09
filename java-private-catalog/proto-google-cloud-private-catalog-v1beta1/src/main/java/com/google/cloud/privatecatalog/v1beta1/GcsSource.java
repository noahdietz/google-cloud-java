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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.privatecatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Defines how to access Cloud Storage source.
 * </pre>
 *
 * Protobuf type {@code google.cloud.privatecatalog.v1beta1.GcsSource}
 */
public final class GcsSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.privatecatalog.v1beta1.GcsSource)
    GcsSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcsSource.newBuilder() to construct.
  private GcsSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsSource() {
    gcsPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcsSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.privatecatalog.v1beta1.GcsSource.class,
            com.google.cloud.privatecatalog.v1beta1.GcsSource.Builder.class);
  }

  private int bitField0_;
  public static final int GCS_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gcsPath_ = "";
  /**
   *
   *
   * <pre>
   * Output only. the cloud storage object path.
   * </pre>
   *
   * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The gcsPath.
   */
  @java.lang.Override
  public java.lang.String getGcsPath() {
    java.lang.Object ref = gcsPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. the cloud storage object path.
   * </pre>
   *
   * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for gcsPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcsPathBytes() {
    java.lang.Object ref = gcsPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcsPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENERATION_FIELD_NUMBER = 2;
  private long generation_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. Generation of the object, which is set when the content of an object starts
   * being written.
   * </pre>
   *
   * <code>int64 generation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generation.
   */
  @java.lang.Override
  public long getGeneration() {
    return generation_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. The time when the object metadata was last changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. The time when the object metadata was last changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The time when the object metadata was last changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsPath_);
    }
    if (generation_ != 0L) {
      output.writeInt64(2, generation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsPath_);
    }
    if (generation_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, generation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.privatecatalog.v1beta1.GcsSource)) {
      return super.equals(obj);
    }
    com.google.cloud.privatecatalog.v1beta1.GcsSource other =
        (com.google.cloud.privatecatalog.v1beta1.GcsSource) obj;

    if (!getGcsPath().equals(other.getGcsPath())) return false;
    if (getGeneration() != other.getGeneration()) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
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
    hash = (37 * hash) + GCS_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGcsPath().hashCode();
    hash = (37 * hash) + GENERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getGeneration());
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.privatecatalog.v1beta1.GcsSource prototype) {
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
   * Defines how to access Cloud Storage source.
   * </pre>
   *
   * Protobuf type {@code google.cloud.privatecatalog.v1beta1.GcsSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.privatecatalog.v1beta1.GcsSource)
      com.google.cloud.privatecatalog.v1beta1.GcsSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.privatecatalog.v1beta1.GcsSource.class,
              com.google.cloud.privatecatalog.v1beta1.GcsSource.Builder.class);
    }

    // Construct using com.google.cloud.privatecatalog.v1beta1.GcsSource.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUpdateTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcsPath_ = "";
      generation_ = 0L;
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.GcsSource getDefaultInstanceForType() {
      return com.google.cloud.privatecatalog.v1beta1.GcsSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.GcsSource build() {
      com.google.cloud.privatecatalog.v1beta1.GcsSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.GcsSource buildPartial() {
      com.google.cloud.privatecatalog.v1beta1.GcsSource result =
          new com.google.cloud.privatecatalog.v1beta1.GcsSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.privatecatalog.v1beta1.GcsSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsPath_ = gcsPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.generation_ = generation_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.privatecatalog.v1beta1.GcsSource) {
        return mergeFrom((com.google.cloud.privatecatalog.v1beta1.GcsSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.privatecatalog.v1beta1.GcsSource other) {
      if (other == com.google.cloud.privatecatalog.v1beta1.GcsSource.getDefaultInstance())
        return this;
      if (!other.getGcsPath().isEmpty()) {
        gcsPath_ = other.gcsPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getGeneration() != 0L) {
        setGeneration(other.getGeneration());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                gcsPath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                generation_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object gcsPath_ = "";
    /**
     *
     *
     * <pre>
     * Output only. the cloud storage object path.
     * </pre>
     *
     * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The gcsPath.
     */
    public java.lang.String getGcsPath() {
      java.lang.Object ref = gcsPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. the cloud storage object path.
     * </pre>
     *
     * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for gcsPath.
     */
    public com.google.protobuf.ByteString getGcsPathBytes() {
      java.lang.Object ref = gcsPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcsPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. the cloud storage object path.
     * </pre>
     *
     * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gcsPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. the cloud storage object path.
     * </pre>
     *
     * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsPath() {
      gcsPath_ = getDefaultInstance().getGcsPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. the cloud storage object path.
     * </pre>
     *
     * <code>string gcs_path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gcsPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long generation_;
    /**
     *
     *
     * <pre>
     * Output only. Generation of the object, which is set when the content of an object starts
     * being written.
     * </pre>
     *
     * <code>int64 generation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The generation.
     */
    @java.lang.Override
    public long getGeneration() {
      return generation_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Generation of the object, which is set when the content of an object starts
     * being written.
     * </pre>
     *
     * <code>int64 generation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The generation to set.
     * @return This builder for chaining.
     */
    public Builder setGeneration(long value) {

      generation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Generation of the object, which is set when the content of an object starts
     * being written.
     * </pre>
     *
     * <code>int64 generation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGeneration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      generation_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      if (updateTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The time when the object metadata was last changed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.privatecatalog.v1beta1.GcsSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.privatecatalog.v1beta1.GcsSource)
  private static final com.google.cloud.privatecatalog.v1beta1.GcsSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.privatecatalog.v1beta1.GcsSource();
  }

  public static com.google.cloud.privatecatalog.v1beta1.GcsSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsSource> PARSER =
      new com.google.protobuf.AbstractParser<GcsSource>() {
        @java.lang.Override
        public GcsSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.GcsSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
