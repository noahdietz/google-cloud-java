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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * Request to create a snapshot of a Cloud Composer environment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest}
 */
public final class SaveSnapshotRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest)
    SaveSnapshotRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SaveSnapshotRequest.newBuilder() to construct.
  private SaveSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SaveSnapshotRequest() {
    environment_ = "";
    snapshotLocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SaveSnapshotRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest.class,
            com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object environment_ = "";
  /**
   *
   *
   * <pre>
   * The resource name of the source environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The environment.
   */
  @java.lang.Override
  public java.lang.String getEnvironment() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environment_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the source environment in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The bytes for environment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnvironmentBytes() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      environment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_LOCATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object snapshotLocation_ = "";
  /**
   *
   *
   * <pre>
   * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
   * "gs://my-bucket/snapshots".
   * </pre>
   *
   * <code>string snapshot_location = 2;</code>
   *
   * @return The snapshotLocation.
   */
  @java.lang.Override
  public java.lang.String getSnapshotLocation() {
    java.lang.Object ref = snapshotLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotLocation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
   * "gs://my-bucket/snapshots".
   * </pre>
   *
   * <code>string snapshot_location = 2;</code>
   *
   * @return The bytes for snapshotLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotLocationBytes() {
    java.lang.Object ref = snapshotLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotLocation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotLocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, snapshotLocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, environment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotLocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, snapshotLocation_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest other =
        (com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest) obj;

    if (!getEnvironment().equals(other.getEnvironment())) return false;
    if (!getSnapshotLocation().equals(other.getSnapshotLocation())) return false;
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
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironment().hashCode();
    hash = (37 * hash) + SNAPSHOT_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest prototype) {
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
   * Request to create a snapshot of a Cloud Composer environment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest)
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest.class,
              com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = "";
      snapshotLocation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest build() {
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest result =
          new com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ = environment_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapshotLocation_ = snapshotLocation_;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
              .getDefaultInstance()) return this;
      if (!other.getEnvironment().isEmpty()) {
        environment_ = other.environment_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSnapshotLocation().isEmpty()) {
        snapshotLocation_ = other.snapshotLocation_;
        bitField0_ |= 0x00000002;
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
                environment_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                snapshotLocation_ = input.readStringRequireUtf8();
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

    private java.lang.Object environment_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the source environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     *
     * @return The environment.
     */
    public java.lang.String getEnvironment() {
      java.lang.Object ref = environment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the source environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     *
     * @return The bytes for environment.
     */
    public com.google.protobuf.ByteString getEnvironmentBytes() {
      java.lang.Object ref = environment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        environment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the source environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     *
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      environment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the source environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      environment_ = getDefaultInstance().getEnvironment();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the source environment in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
     * </pre>
     *
     * <code>string environment = 1;</code>
     *
     * @param value The bytes for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      environment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotLocation_ = "";
    /**
     *
     *
     * <pre>
     * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
     * "gs://my-bucket/snapshots".
     * </pre>
     *
     * <code>string snapshot_location = 2;</code>
     *
     * @return The snapshotLocation.
     */
    public java.lang.String getSnapshotLocation() {
      java.lang.Object ref = snapshotLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
     * "gs://my-bucket/snapshots".
     * </pre>
     *
     * <code>string snapshot_location = 2;</code>
     *
     * @return The bytes for snapshotLocation.
     */
    public com.google.protobuf.ByteString getSnapshotLocationBytes() {
      java.lang.Object ref = snapshotLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
     * "gs://my-bucket/snapshots".
     * </pre>
     *
     * <code>string snapshot_location = 2;</code>
     *
     * @param value The snapshotLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      snapshotLocation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
     * "gs://my-bucket/snapshots".
     * </pre>
     *
     * <code>string snapshot_location = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotLocation() {
      snapshotLocation_ = getDefaultInstance().getSnapshotLocation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location in a Cloud Storage where the snapshot is going to be stored, e.g.:
     * "gs://my-bucket/snapshots".
     * </pre>
     *
     * <code>string snapshot_location = 2;</code>
     *
     * @param value The bytes for snapshotLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      snapshotLocation_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest)
  private static final com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveSnapshotRequest> PARSER =
      new com.google.protobuf.AbstractParser<SaveSnapshotRequest>() {
        @java.lang.Override
        public SaveSnapshotRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
