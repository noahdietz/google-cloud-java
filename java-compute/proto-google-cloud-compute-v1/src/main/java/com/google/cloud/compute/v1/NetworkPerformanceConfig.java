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
 * Protobuf type {@code google.cloud.compute.v1.NetworkPerformanceConfig}
 */
public final class NetworkPerformanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkPerformanceConfig)
    NetworkPerformanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkPerformanceConfig.newBuilder() to construct.
  private NetworkPerformanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkPerformanceConfig() {
    totalEgressBandwidthTier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkPerformanceConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkPerformanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkPerformanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkPerformanceConfig.class,
            com.google.cloud.compute.v1.NetworkPerformanceConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.NetworkPerformanceConfig.TotalEgressBandwidthTier}
   */
  public enum TotalEgressBandwidthTier implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TOTAL_EGRESS_BANDWIDTH_TIER = 0;</code>
     */
    UNDEFINED_TOTAL_EGRESS_BANDWIDTH_TIER(0),
    /** <code>DEFAULT = 115302945;</code> */
    DEFAULT(115302945),
    /** <code>TIER_1 = 326919444;</code> */
    TIER_1(326919444),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_TOTAL_EGRESS_BANDWIDTH_TIER = 0;</code>
     */
    public static final int UNDEFINED_TOTAL_EGRESS_BANDWIDTH_TIER_VALUE = 0;
    /** <code>DEFAULT = 115302945;</code> */
    public static final int DEFAULT_VALUE = 115302945;
    /** <code>TIER_1 = 326919444;</code> */
    public static final int TIER_1_VALUE = 326919444;

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
    public static TotalEgressBandwidthTier valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TotalEgressBandwidthTier forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_TOTAL_EGRESS_BANDWIDTH_TIER;
        case 115302945:
          return DEFAULT;
        case 326919444:
          return TIER_1;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TotalEgressBandwidthTier>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TotalEgressBandwidthTier>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TotalEgressBandwidthTier>() {
              public TotalEgressBandwidthTier findValueByNumber(int number) {
                return TotalEgressBandwidthTier.forNumber(number);
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
      return com.google.cloud.compute.v1.NetworkPerformanceConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final TotalEgressBandwidthTier[] VALUES = values();

    public static TotalEgressBandwidthTier valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TotalEgressBandwidthTier(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.NetworkPerformanceConfig.TotalEgressBandwidthTier)
  }

  private int bitField0_;
  public static final int TOTAL_EGRESS_BANDWIDTH_TIER_FIELD_NUMBER = 130109439;

  @SuppressWarnings("serial")
  private volatile java.lang.Object totalEgressBandwidthTier_ = "";
  /**
   *
   *
   * <pre>
   *
   * Check the TotalEgressBandwidthTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
   *
   * @return Whether the totalEgressBandwidthTier field is set.
   */
  @java.lang.Override
  public boolean hasTotalEgressBandwidthTier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   *
   * Check the TotalEgressBandwidthTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
   *
   * @return The totalEgressBandwidthTier.
   */
  @java.lang.Override
  public java.lang.String getTotalEgressBandwidthTier() {
    java.lang.Object ref = totalEgressBandwidthTier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      totalEgressBandwidthTier_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   *
   * Check the TotalEgressBandwidthTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
   *
   * @return The bytes for totalEgressBandwidthTier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTotalEgressBandwidthTierBytes() {
    java.lang.Object ref = totalEgressBandwidthTier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      totalEgressBandwidthTier_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 130109439, totalEgressBandwidthTier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              130109439, totalEgressBandwidthTier_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkPerformanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkPerformanceConfig other =
        (com.google.cloud.compute.v1.NetworkPerformanceConfig) obj;

    if (hasTotalEgressBandwidthTier() != other.hasTotalEgressBandwidthTier()) return false;
    if (hasTotalEgressBandwidthTier()) {
      if (!getTotalEgressBandwidthTier().equals(other.getTotalEgressBandwidthTier())) return false;
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
    if (hasTotalEgressBandwidthTier()) {
      hash = (37 * hash) + TOTAL_EGRESS_BANDWIDTH_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getTotalEgressBandwidthTier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.NetworkPerformanceConfig prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NetworkPerformanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkPerformanceConfig)
      com.google.cloud.compute.v1.NetworkPerformanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkPerformanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkPerformanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkPerformanceConfig.class,
              com.google.cloud.compute.v1.NetworkPerformanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkPerformanceConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      totalEgressBandwidthTier_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkPerformanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkPerformanceConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkPerformanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkPerformanceConfig build() {
      com.google.cloud.compute.v1.NetworkPerformanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkPerformanceConfig buildPartial() {
      com.google.cloud.compute.v1.NetworkPerformanceConfig result =
          new com.google.cloud.compute.v1.NetworkPerformanceConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NetworkPerformanceConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalEgressBandwidthTier_ = totalEgressBandwidthTier_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkPerformanceConfig) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkPerformanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkPerformanceConfig other) {
      if (other == com.google.cloud.compute.v1.NetworkPerformanceConfig.getDefaultInstance())
        return this;
      if (other.hasTotalEgressBandwidthTier()) {
        totalEgressBandwidthTier_ = other.totalEgressBandwidthTier_;
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
            case 1040875514:
              {
                totalEgressBandwidthTier_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1040875514
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

    private java.lang.Object totalEgressBandwidthTier_ = "";
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @return Whether the totalEgressBandwidthTier field is set.
     */
    public boolean hasTotalEgressBandwidthTier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @return The totalEgressBandwidthTier.
     */
    public java.lang.String getTotalEgressBandwidthTier() {
      java.lang.Object ref = totalEgressBandwidthTier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        totalEgressBandwidthTier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @return The bytes for totalEgressBandwidthTier.
     */
    public com.google.protobuf.ByteString getTotalEgressBandwidthTierBytes() {
      java.lang.Object ref = totalEgressBandwidthTier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        totalEgressBandwidthTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @param value The totalEgressBandwidthTier to set.
     * @return This builder for chaining.
     */
    public Builder setTotalEgressBandwidthTier(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      totalEgressBandwidthTier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalEgressBandwidthTier() {
      totalEgressBandwidthTier_ = getDefaultInstance().getTotalEgressBandwidthTier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     *
     * Check the TotalEgressBandwidthTier enum for the list of possible values.
     * </pre>
     *
     * <code>optional string total_egress_bandwidth_tier = 130109439;</code>
     *
     * @param value The bytes for totalEgressBandwidthTier to set.
     * @return This builder for chaining.
     */
    public Builder setTotalEgressBandwidthTierBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      totalEgressBandwidthTier_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkPerformanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkPerformanceConfig)
  private static final com.google.cloud.compute.v1.NetworkPerformanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkPerformanceConfig();
  }

  public static com.google.cloud.compute.v1.NetworkPerformanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkPerformanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<NetworkPerformanceConfig>() {
        @java.lang.Override
        public NetworkPerformanceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkPerformanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkPerformanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkPerformanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
