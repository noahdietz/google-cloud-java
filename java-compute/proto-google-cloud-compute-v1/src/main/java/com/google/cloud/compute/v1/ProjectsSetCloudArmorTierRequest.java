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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest}
 */
public final class ProjectsSetCloudArmorTierRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest)
    ProjectsSetCloudArmorTierRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectsSetCloudArmorTierRequest.newBuilder() to construct.
  private ProjectsSetCloudArmorTierRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectsSetCloudArmorTierRequest() {
    cloudArmorTier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectsSetCloudArmorTierRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsSetCloudArmorTierRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsSetCloudArmorTierRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.class,
            com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Managed protection tier to be set.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.CloudArmorTier}
   */
  public enum CloudArmorTier implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_CLOUD_ARMOR_TIER = 0;</code>
     */
    UNDEFINED_CLOUD_ARMOR_TIER(0),
    /**
     *
     *
     * <pre>
     * Enterprise tier protection billed annually.
     * </pre>
     *
     * <code>CA_ENTERPRISE_ANNUAL = 219921116;</code>
     */
    CA_ENTERPRISE_ANNUAL(219921116),
    /**
     *
     *
     * <pre>
     * Enterprise tier protection billed monthly.
     * </pre>
     *
     * <code>CA_ENTERPRISE_PAYGO = 453530323;</code>
     */
    CA_ENTERPRISE_PAYGO(453530323),
    /**
     *
     *
     * <pre>
     * Standard protection.
     * </pre>
     *
     * <code>CA_STANDARD = 13156734;</code>
     */
    CA_STANDARD(13156734),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_CLOUD_ARMOR_TIER = 0;</code>
     */
    public static final int UNDEFINED_CLOUD_ARMOR_TIER_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Enterprise tier protection billed annually.
     * </pre>
     *
     * <code>CA_ENTERPRISE_ANNUAL = 219921116;</code>
     */
    public static final int CA_ENTERPRISE_ANNUAL_VALUE = 219921116;
    /**
     *
     *
     * <pre>
     * Enterprise tier protection billed monthly.
     * </pre>
     *
     * <code>CA_ENTERPRISE_PAYGO = 453530323;</code>
     */
    public static final int CA_ENTERPRISE_PAYGO_VALUE = 453530323;
    /**
     *
     *
     * <pre>
     * Standard protection.
     * </pre>
     *
     * <code>CA_STANDARD = 13156734;</code>
     */
    public static final int CA_STANDARD_VALUE = 13156734;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CloudArmorTier valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CloudArmorTier forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_CLOUD_ARMOR_TIER;
        case 219921116:
          return CA_ENTERPRISE_ANNUAL;
        case 453530323:
          return CA_ENTERPRISE_PAYGO;
        case 13156734:
          return CA_STANDARD;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CloudArmorTier> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CloudArmorTier> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CloudArmorTier>() {
          public CloudArmorTier findValueByNumber(int number) {
            return CloudArmorTier.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final CloudArmorTier[] VALUES = values();

    public static CloudArmorTier valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CloudArmorTier(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.CloudArmorTier)
  }

  private int bitField0_;
  public static final int CLOUD_ARMOR_TIER_FIELD_NUMBER = 4427052;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cloudArmorTier_ = "";
  /**
   *
   *
   * <pre>
   * Managed protection tier to be set.
   * Check the CloudArmorTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cloud_armor_tier = 4427052;</code>
   *
   * @return Whether the cloudArmorTier field is set.
   */
  @java.lang.Override
  public boolean hasCloudArmorTier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Managed protection tier to be set.
   * Check the CloudArmorTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cloud_armor_tier = 4427052;</code>
   *
   * @return The cloudArmorTier.
   */
  @java.lang.Override
  public java.lang.String getCloudArmorTier() {
    java.lang.Object ref = cloudArmorTier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cloudArmorTier_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Managed protection tier to be set.
   * Check the CloudArmorTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cloud_armor_tier = 4427052;</code>
   *
   * @return The bytes for cloudArmorTier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCloudArmorTierBytes() {
    java.lang.Object ref = cloudArmorTier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cloudArmorTier_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4427052, cloudArmorTier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4427052, cloudArmorTier_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest other =
        (com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest) obj;

    if (hasCloudArmorTier() != other.hasCloudArmorTier()) return false;
    if (hasCloudArmorTier()) {
      if (!getCloudArmorTier().equals(other.getCloudArmorTier())) return false;
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
    if (hasCloudArmorTier()) {
      hash = (37 * hash) + CLOUD_ARMOR_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getCloudArmorTier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest parseFrom(
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
      com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest)
      com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetCloudArmorTierRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetCloudArmorTierRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.class,
              com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cloudArmorTier_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsSetCloudArmorTierRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest build() {
      com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest buildPartial() {
      com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest result =
          new com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudArmorTier_ = cloudArmorTier_;
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
      if (other instanceof com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest other) {
      if (other
          == com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest.getDefaultInstance())
        return this;
      if (other.hasCloudArmorTier()) {
        cloudArmorTier_ = other.cloudArmorTier_;
        bitField0_ |= 0x00000001;
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
            case 35416418:
              {
                cloudArmorTier_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 35416418
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

    private java.lang.Object cloudArmorTier_ = "";
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @return Whether the cloudArmorTier field is set.
     */
    public boolean hasCloudArmorTier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @return The cloudArmorTier.
     */
    public java.lang.String getCloudArmorTier() {
      java.lang.Object ref = cloudArmorTier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cloudArmorTier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @return The bytes for cloudArmorTier.
     */
    public com.google.protobuf.ByteString getCloudArmorTierBytes() {
      java.lang.Object ref = cloudArmorTier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cloudArmorTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @param value The cloudArmorTier to set.
     * @return This builder for chaining.
     */
    public Builder setCloudArmorTier(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cloudArmorTier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCloudArmorTier() {
      cloudArmorTier_ = getDefaultInstance().getCloudArmorTier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Managed protection tier to be set.
     * Check the CloudArmorTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string cloud_armor_tier = 4427052;</code>
     *
     * @param value The bytes for cloudArmorTier to set.
     * @return This builder for chaining.
     */
    public Builder setCloudArmorTierBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cloudArmorTier_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest)
  private static final com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest();
  }

  public static com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectsSetCloudArmorTierRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProjectsSetCloudArmorTierRequest>() {
        @java.lang.Override
        public ProjectsSetCloudArmorTierRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProjectsSetCloudArmorTierRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectsSetCloudArmorTierRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsSetCloudArmorTierRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
