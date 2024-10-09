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
// source: google/cloud/bigquery/migration/v2alpha/migration_error_details.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.migration.v2alpha;

/**
 *
 *
 * <pre>
 * Provides details for errors, e.g. issues that where encountered when
 * processing a subtask.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ErrorDetail}
 */
public final class ErrorDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.ErrorDetail)
    ErrorDetailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ErrorDetail.newBuilder() to construct.
  private ErrorDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ErrorDetail() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ErrorDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.class,
            com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.Builder.class);
  }

  private int bitField0_;
  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.migration.v2alpha.ErrorLocation location_;
  /**
   *
   *
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The location.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getLocation() {
    return location_ == null
        ? com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance()
        : location_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The exact location within the resource (if applicable).
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder getLocationOrBuilder() {
    return location_ == null
        ? com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance()
        : location_;
  }

  public static final int ERROR_INFO_FIELD_NUMBER = 2;
  private com.google.rpc.ErrorInfo errorInfo_;
  /**
   *
   *
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the errorInfo field is set.
   */
  @java.lang.Override
  public boolean hasErrorInfo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The errorInfo.
   */
  @java.lang.Override
  public com.google.rpc.ErrorInfo getErrorInfo() {
    return errorInfo_ == null ? com.google.rpc.ErrorInfo.getDefaultInstance() : errorInfo_;
  }
  /**
   *
   *
   * <pre>
   * Required. Describes the cause of the error with structured detail.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.rpc.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
    return errorInfo_ == null ? com.google.rpc.ErrorInfo.getDefaultInstance() : errorInfo_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getLocation());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getErrorInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getLocation());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getErrorInfo());
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.ErrorDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.ErrorDetail other =
        (com.google.cloud.bigquery.migration.v2alpha.ErrorDetail) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation().equals(other.getLocation())) return false;
    }
    if (hasErrorInfo() != other.hasErrorInfo()) return false;
    if (hasErrorInfo()) {
      if (!getErrorInfo().equals(other.getErrorInfo())) return false;
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
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    if (hasErrorInfo()) {
      hash = (37 * hash) + ERROR_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getErrorInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail parseFrom(
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
      com.google.cloud.bigquery.migration.v2alpha.ErrorDetail prototype) {
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
   * Provides details for errors, e.g. issues that where encountered when
   * processing a subtask.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ErrorDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.ErrorDetail)
      com.google.cloud.bigquery.migration.v2alpha.ErrorDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.class,
              com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLocationFieldBuilder();
        getErrorInfoFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      errorInfo_ = null;
      if (errorInfoBuilder_ != null) {
        errorInfoBuilder_.dispose();
        errorInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorDetail getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorDetail build() {
      com.google.cloud.bigquery.migration.v2alpha.ErrorDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorDetail buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.ErrorDetail result =
          new com.google.cloud.bigquery.migration.v2alpha.ErrorDetail(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2alpha.ErrorDetail result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = locationBuilder_ == null ? location_ : locationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorInfo_ = errorInfoBuilder_ == null ? errorInfo_ : errorInfoBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.ErrorDetail) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.ErrorDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.ErrorDetail other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.ErrorDetail.getDefaultInstance())
        return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (other.hasErrorInfo()) {
        mergeErrorInfo(other.getErrorInfo());
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
                input.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getErrorInfoFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.bigquery.migration.v2alpha.ErrorLocation location_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation,
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder,
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder>
        locationBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The location.
     */
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null
            ? com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance()
            : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setLocation(com.google.cloud.bigquery.migration.v2alpha.ErrorLocation value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setLocation(
        com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeLocation(com.google.cloud.bigquery.migration.v2alpha.ErrorLocation value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && location_ != null
            && location_
                != com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      if (location_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder getLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder
        getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null
            ? com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance()
            : location_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact location within the resource (if applicable).
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.ErrorLocation location = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation,
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder,
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder>
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.migration.v2alpha.ErrorLocation,
                com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder,
                com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder>(
                getLocation(), getParentForChildren(), isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private com.google.rpc.ErrorInfo errorInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.ErrorInfo,
            com.google.rpc.ErrorInfo.Builder,
            com.google.rpc.ErrorInfoOrBuilder>
        errorInfoBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the errorInfo field is set.
     */
    public boolean hasErrorInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The errorInfo.
     */
    public com.google.rpc.ErrorInfo getErrorInfo() {
      if (errorInfoBuilder_ == null) {
        return errorInfo_ == null ? com.google.rpc.ErrorInfo.getDefaultInstance() : errorInfo_;
      } else {
        return errorInfoBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setErrorInfo(com.google.rpc.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorInfo_ = value;
      } else {
        errorInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setErrorInfo(com.google.rpc.ErrorInfo.Builder builderForValue) {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = builderForValue.build();
      } else {
        errorInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeErrorInfo(com.google.rpc.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && errorInfo_ != null
            && errorInfo_ != com.google.rpc.ErrorInfo.getDefaultInstance()) {
          getErrorInfoBuilder().mergeFrom(value);
        } else {
          errorInfo_ = value;
        }
      } else {
        errorInfoBuilder_.mergeFrom(value);
      }
      if (errorInfo_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearErrorInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      errorInfo_ = null;
      if (errorInfoBuilder_ != null) {
        errorInfoBuilder_.dispose();
        errorInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.rpc.ErrorInfo.Builder getErrorInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorInfoFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.rpc.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
      if (errorInfoBuilder_ != null) {
        return errorInfoBuilder_.getMessageOrBuilder();
      } else {
        return errorInfo_ == null ? com.google.rpc.ErrorInfo.getDefaultInstance() : errorInfo_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Describes the cause of the error with structured detail.
     * </pre>
     *
     * <code>.google.rpc.ErrorInfo error_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.ErrorInfo,
            com.google.rpc.ErrorInfo.Builder,
            com.google.rpc.ErrorInfoOrBuilder>
        getErrorInfoFieldBuilder() {
      if (errorInfoBuilder_ == null) {
        errorInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.ErrorInfo,
                com.google.rpc.ErrorInfo.Builder,
                com.google.rpc.ErrorInfoOrBuilder>(
                getErrorInfo(), getParentForChildren(), isClean());
        errorInfo_ = null;
      }
      return errorInfoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.ErrorDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.ErrorDetail)
  private static final com.google.cloud.bigquery.migration.v2alpha.ErrorDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.ErrorDetail();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetail> PARSER =
      new com.google.protobuf.AbstractParser<ErrorDetail>() {
        @java.lang.Override
        public ErrorDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.ErrorDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
