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
// source: google/cloud/apphub/v1/workload.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apphub.v1;

/**
 *
 *
 * <pre>
 * Properties of an underlying compute resource represented by the Workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apphub.v1.WorkloadProperties}
 */
public final class WorkloadProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apphub.v1.WorkloadProperties)
    WorkloadPropertiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkloadProperties.newBuilder() to construct.
  private WorkloadProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkloadProperties() {
    gcpProject_ = "";
    location_ = "";
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkloadProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apphub.v1.WorkloadProto
        .internal_static_google_cloud_apphub_v1_WorkloadProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apphub.v1.WorkloadProto
        .internal_static_google_cloud_apphub_v1_WorkloadProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apphub.v1.WorkloadProperties.class,
            com.google.cloud.apphub.v1.WorkloadProperties.Builder.class);
  }

  public static final int GCP_PROJECT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gcpProject_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The service project identifier that the underlying cloud
   * resource resides in. Empty for non cloud resources.
   * </pre>
   *
   * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The gcpProject.
   */
  @java.lang.Override
  public java.lang.String getGcpProject() {
    java.lang.Object ref = gcpProject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcpProject_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The service project identifier that the underlying cloud
   * resource resides in. Empty for non cloud resources.
   * </pre>
   *
   * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for gcpProject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcpProjectBytes() {
    java.lang.Object ref = gcpProject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcpProject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The location that the underlying compute resource resides in
   * (e.g us-west1).
   * </pre>
   *
   * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The location that the underlying compute resource resides in
   * (e.g us-west1).
   * </pre>
   *
   * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The location that the underlying compute resource resides in
   * if it is zonal (e.g us-west1-a).
   * </pre>
   *
   * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The location that the underlying compute resource resides in
   * if it is zonal (e.g us-west1-a).
   * </pre>
   *
   * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcpProject_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcpProject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, zone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcpProject_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcpProject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, zone_);
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
    if (!(obj instanceof com.google.cloud.apphub.v1.WorkloadProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.apphub.v1.WorkloadProperties other =
        (com.google.cloud.apphub.v1.WorkloadProperties) obj;

    if (!getGcpProject().equals(other.getGcpProject())) return false;
    if (!getLocation().equals(other.getLocation())) return false;
    if (!getZone().equals(other.getZone())) return false;
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
    hash = (37 * hash) + GCP_PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getGcpProject().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apphub.v1.WorkloadProperties prototype) {
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
   * Properties of an underlying compute resource represented by the Workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apphub.v1.WorkloadProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apphub.v1.WorkloadProperties)
      com.google.cloud.apphub.v1.WorkloadPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apphub.v1.WorkloadProto
          .internal_static_google_cloud_apphub_v1_WorkloadProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apphub.v1.WorkloadProto
          .internal_static_google_cloud_apphub_v1_WorkloadProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apphub.v1.WorkloadProperties.class,
              com.google.cloud.apphub.v1.WorkloadProperties.Builder.class);
    }

    // Construct using com.google.cloud.apphub.v1.WorkloadProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcpProject_ = "";
      location_ = "";
      zone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apphub.v1.WorkloadProto
          .internal_static_google_cloud_apphub_v1_WorkloadProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.WorkloadProperties getDefaultInstanceForType() {
      return com.google.cloud.apphub.v1.WorkloadProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.WorkloadProperties build() {
      com.google.cloud.apphub.v1.WorkloadProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.WorkloadProperties buildPartial() {
      com.google.cloud.apphub.v1.WorkloadProperties result =
          new com.google.cloud.apphub.v1.WorkloadProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apphub.v1.WorkloadProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcpProject_ = gcpProject_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.zone_ = zone_;
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
      if (other instanceof com.google.cloud.apphub.v1.WorkloadProperties) {
        return mergeFrom((com.google.cloud.apphub.v1.WorkloadProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apphub.v1.WorkloadProperties other) {
      if (other == com.google.cloud.apphub.v1.WorkloadProperties.getDefaultInstance()) return this;
      if (!other.getGcpProject().isEmpty()) {
        gcpProject_ = other.gcpProject_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
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
                gcpProject_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                location_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                zone_ = input.readStringRequireUtf8();
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

    private java.lang.Object gcpProject_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The service project identifier that the underlying cloud
     * resource resides in. Empty for non cloud resources.
     * </pre>
     *
     * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The gcpProject.
     */
    public java.lang.String getGcpProject() {
      java.lang.Object ref = gcpProject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcpProject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The service project identifier that the underlying cloud
     * resource resides in. Empty for non cloud resources.
     * </pre>
     *
     * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for gcpProject.
     */
    public com.google.protobuf.ByteString getGcpProjectBytes() {
      java.lang.Object ref = gcpProject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcpProject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The service project identifier that the underlying cloud
     * resource resides in. Empty for non cloud resources.
     * </pre>
     *
     * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The gcpProject to set.
     * @return This builder for chaining.
     */
    public Builder setGcpProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gcpProject_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The service project identifier that the underlying cloud
     * resource resides in. Empty for non cloud resources.
     * </pre>
     *
     * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcpProject() {
      gcpProject_ = getDefaultInstance().getGcpProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The service project identifier that the underlying cloud
     * resource resides in. Empty for non cloud resources.
     * </pre>
     *
     * <code>string gcp_project = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for gcpProject to set.
     * @return This builder for chaining.
     */
    public Builder setGcpProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gcpProject_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * (e.g us-west1).
     * </pre>
     *
     * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * (e.g us-west1).
     * </pre>
     *
     * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * (e.g us-west1).
     * </pre>
     *
     * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * (e.g us-west1).
     * </pre>
     *
     * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * (e.g us-west1).
     * </pre>
     *
     * <code>string location = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * if it is zonal (e.g us-west1-a).
     * </pre>
     *
     * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * if it is zonal (e.g us-west1-a).
     * </pre>
     *
     * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * if it is zonal (e.g us-west1-a).
     * </pre>
     *
     * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      zone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * if it is zonal (e.g us-west1-a).
     * </pre>
     *
     * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The location that the underlying compute resource resides in
     * if it is zonal (e.g us-west1-a).
     * </pre>
     *
     * <code>string zone = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      zone_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apphub.v1.WorkloadProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apphub.v1.WorkloadProperties)
  private static final com.google.cloud.apphub.v1.WorkloadProperties DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apphub.v1.WorkloadProperties();
  }

  public static com.google.cloud.apphub.v1.WorkloadProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadProperties> PARSER =
      new com.google.protobuf.AbstractParser<WorkloadProperties>() {
        @java.lang.Override
        public WorkloadProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkloadProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apphub.v1.WorkloadProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
