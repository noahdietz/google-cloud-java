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
// source: google/cloud/alloydb/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

/**
 *
 *
 * <pre>
 * Message describing a ContinuousBackupSource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1alpha.ContinuousBackupSource}
 */
public final class ContinuousBackupSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1alpha.ContinuousBackupSource)
    ContinuousBackupSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContinuousBackupSource.newBuilder() to construct.
  private ContinuousBackupSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContinuousBackupSource() {
    cluster_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContinuousBackupSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.class,
            com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.Builder.class);
  }

  private int bitField0_;
  public static final int CLUSTER_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cluster_ = "";
  /**
   *
   *
   * <pre>
   * Required. The source cluster from which to restore. This cluster must have
   * continuous backup enabled for this operation to succeed. For the required
   * format, see the comment on the Cluster.name field.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cluster.
   */
  @java.lang.Override
  public java.lang.String getCluster() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cluster_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The source cluster from which to restore. This cluster must have
   * continuous backup enabled for this operation to succeed. For the required
   * format, see the comment on the Cluster.name field.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cluster.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterBytes() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cluster_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POINT_IN_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp pointInTime_;
  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pointInTime field is set.
   */
  @java.lang.Override
  public boolean hasPointInTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pointInTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getPointInTime() {
    return pointInTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pointInTime_;
  }
  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getPointInTimeOrBuilder() {
    return pointInTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : pointInTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cluster_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPointInTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPointInTime());
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
    if (!(obj instanceof com.google.cloud.alloydb.v1alpha.ContinuousBackupSource)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1alpha.ContinuousBackupSource other =
        (com.google.cloud.alloydb.v1alpha.ContinuousBackupSource) obj;

    if (!getCluster().equals(other.getCluster())) return false;
    if (hasPointInTime() != other.hasPointInTime()) return false;
    if (hasPointInTime()) {
      if (!getPointInTime().equals(other.getPointInTime())) return false;
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
    hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + getCluster().hashCode();
    if (hasPointInTime()) {
      hash = (37 * hash) + POINT_IN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPointInTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource parseFrom(
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
      com.google.cloud.alloydb.v1alpha.ContinuousBackupSource prototype) {
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
   * Message describing a ContinuousBackupSource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1alpha.ContinuousBackupSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1alpha.ContinuousBackupSource)
      com.google.cloud.alloydb.v1alpha.ContinuousBackupSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.class,
              com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPointInTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cluster_ = "";
      pointInTime_ = null;
      if (pointInTimeBuilder_ != null) {
        pointInTimeBuilder_.dispose();
        pointInTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_ContinuousBackupSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupSource getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupSource build() {
      com.google.cloud.alloydb.v1alpha.ContinuousBackupSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.ContinuousBackupSource buildPartial() {
      com.google.cloud.alloydb.v1alpha.ContinuousBackupSource result =
          new com.google.cloud.alloydb.v1alpha.ContinuousBackupSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1alpha.ContinuousBackupSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cluster_ = cluster_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pointInTime_ =
            pointInTimeBuilder_ == null ? pointInTime_ : pointInTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.alloydb.v1alpha.ContinuousBackupSource) {
        return mergeFrom((com.google.cloud.alloydb.v1alpha.ContinuousBackupSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1alpha.ContinuousBackupSource other) {
      if (other == com.google.cloud.alloydb.v1alpha.ContinuousBackupSource.getDefaultInstance())
        return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPointInTime()) {
        mergePointInTime(other.getPointInTime());
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
                cluster_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPointInTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object cluster_ = "";
    /**
     *
     *
     * <pre>
     * Required. The source cluster from which to restore. This cluster must have
     * continuous backup enabled for this operation to succeed. For the required
     * format, see the comment on the Cluster.name field.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The cluster.
     */
    public java.lang.String getCluster() {
      java.lang.Object ref = cluster_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cluster_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The source cluster from which to restore. This cluster must have
     * continuous backup enabled for this operation to succeed. For the required
     * format, see the comment on the Cluster.name field.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for cluster.
     */
    public com.google.protobuf.ByteString getClusterBytes() {
      java.lang.Object ref = cluster_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cluster_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The source cluster from which to restore. This cluster must have
     * continuous backup enabled for this operation to succeed. For the required
     * format, see the comment on the Cluster.name field.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The cluster to set.
     * @return This builder for chaining.
     */
    public Builder setCluster(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cluster_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source cluster from which to restore. This cluster must have
     * continuous backup enabled for this operation to succeed. For the required
     * format, see the comment on the Cluster.name field.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCluster() {
      cluster_ = getDefaultInstance().getCluster();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The source cluster from which to restore. This cluster must have
     * continuous backup enabled for this operation to succeed. For the required
     * format, see the comment on the Cluster.name field.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for cluster to set.
     * @return This builder for chaining.
     */
    public Builder setClusterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cluster_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp pointInTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        pointInTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the pointInTime field is set.
     */
    public boolean hasPointInTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The pointInTime.
     */
    public com.google.protobuf.Timestamp getPointInTime() {
      if (pointInTimeBuilder_ == null) {
        return pointInTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : pointInTime_;
      } else {
        return pointInTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPointInTime(com.google.protobuf.Timestamp value) {
      if (pointInTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pointInTime_ = value;
      } else {
        pointInTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPointInTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (pointInTimeBuilder_ == null) {
        pointInTime_ = builderForValue.build();
      } else {
        pointInTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePointInTime(com.google.protobuf.Timestamp value) {
      if (pointInTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && pointInTime_ != null
            && pointInTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getPointInTimeBuilder().mergeFrom(value);
        } else {
          pointInTime_ = value;
        }
      } else {
        pointInTimeBuilder_.mergeFrom(value);
      }
      if (pointInTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPointInTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pointInTime_ = null;
      if (pointInTimeBuilder_ != null) {
        pointInTimeBuilder_.dispose();
        pointInTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getPointInTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPointInTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getPointInTimeOrBuilder() {
      if (pointInTimeBuilder_ != null) {
        return pointInTimeBuilder_.getMessageOrBuilder();
      } else {
        return pointInTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : pointInTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The point in time to restore to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getPointInTimeFieldBuilder() {
      if (pointInTimeBuilder_ == null) {
        pointInTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getPointInTime(), getParentForChildren(), isClean());
        pointInTime_ = null;
      }
      return pointInTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1alpha.ContinuousBackupSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1alpha.ContinuousBackupSource)
  private static final com.google.cloud.alloydb.v1alpha.ContinuousBackupSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1alpha.ContinuousBackupSource();
  }

  public static com.google.cloud.alloydb.v1alpha.ContinuousBackupSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContinuousBackupSource> PARSER =
      new com.google.protobuf.AbstractParser<ContinuousBackupSource>() {
        @java.lang.Override
        public ContinuousBackupSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContinuousBackupSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContinuousBackupSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.ContinuousBackupSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
