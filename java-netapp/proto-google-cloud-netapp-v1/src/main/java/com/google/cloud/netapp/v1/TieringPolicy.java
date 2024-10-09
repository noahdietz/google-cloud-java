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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * Defines tiering policy for the volume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.TieringPolicy}
 */
public final class TieringPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.TieringPolicy)
    TieringPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TieringPolicy.newBuilder() to construct.
  private TieringPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TieringPolicy() {
    tierAction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TieringPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_TieringPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.TieringPolicy.class,
            com.google.cloud.netapp.v1.TieringPolicy.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Tier action for the volume.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.netapp.v1.TieringPolicy.TierAction}
   */
  public enum TierAction implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>TIER_ACTION_UNSPECIFIED = 0;</code>
     */
    TIER_ACTION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * When tiering is enabled, new cold data will be tiered.
     * </pre>
     *
     * <code>ENABLED = 1;</code>
     */
    ENABLED(1),
    /**
     *
     *
     * <pre>
     * When paused, tiering won't be performed on new data. Existing data stays
     * tiered until accessed.
     * </pre>
     *
     * <code>PAUSED = 2;</code>
     */
    PAUSED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>TIER_ACTION_UNSPECIFIED = 0;</code>
     */
    public static final int TIER_ACTION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * When tiering is enabled, new cold data will be tiered.
     * </pre>
     *
     * <code>ENABLED = 1;</code>
     */
    public static final int ENABLED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * When paused, tiering won't be performed on new data. Existing data stays
     * tiered until accessed.
     * </pre>
     *
     * <code>PAUSED = 2;</code>
     */
    public static final int PAUSED_VALUE = 2;

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
    public static TierAction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TierAction forNumber(int value) {
      switch (value) {
        case 0:
          return TIER_ACTION_UNSPECIFIED;
        case 1:
          return ENABLED;
        case 2:
          return PAUSED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TierAction> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TierAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TierAction>() {
          public TierAction findValueByNumber(int number) {
            return TierAction.forNumber(number);
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
      return com.google.cloud.netapp.v1.TieringPolicy.getDescriptor().getEnumTypes().get(0);
    }

    private static final TierAction[] VALUES = values();

    public static TierAction valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TierAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.netapp.v1.TieringPolicy.TierAction)
  }

  private int bitField0_;
  public static final int TIER_ACTION_FIELD_NUMBER = 1;
  private int tierAction_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Flag indicating if the volume has tiering policy enable/pause.
   * Default is PAUSED.
   * </pre>
   *
   * <code>
   * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tierAction field is set.
   */
  @java.lang.Override
  public boolean hasTierAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Flag indicating if the volume has tiering policy enable/pause.
   * Default is PAUSED.
   * </pre>
   *
   * <code>
   * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for tierAction.
   */
  @java.lang.Override
  public int getTierActionValue() {
    return tierAction_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Flag indicating if the volume has tiering policy enable/pause.
   * Default is PAUSED.
   * </pre>
   *
   * <code>
   * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tierAction.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.TieringPolicy.TierAction getTierAction() {
    com.google.cloud.netapp.v1.TieringPolicy.TierAction result =
        com.google.cloud.netapp.v1.TieringPolicy.TierAction.forNumber(tierAction_);
    return result == null
        ? com.google.cloud.netapp.v1.TieringPolicy.TierAction.UNRECOGNIZED
        : result;
  }

  public static final int COOLING_THRESHOLD_DAYS_FIELD_NUMBER = 2;
  private int coolingThresholdDays_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Time in days to mark the volume's data block as cold and make it
   * eligible for tiering, can be range from 7-183. Default is 31.
   * </pre>
   *
   * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the coolingThresholdDays field is set.
   */
  @java.lang.Override
  public boolean hasCoolingThresholdDays() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Time in days to mark the volume's data block as cold and make it
   * eligible for tiering, can be range from 7-183. Default is 31.
   * </pre>
   *
   * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The coolingThresholdDays.
   */
  @java.lang.Override
  public int getCoolingThresholdDays() {
    return coolingThresholdDays_;
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
      output.writeEnum(1, tierAction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, coolingThresholdDays_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, tierAction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, coolingThresholdDays_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.TieringPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.TieringPolicy other = (com.google.cloud.netapp.v1.TieringPolicy) obj;

    if (hasTierAction() != other.hasTierAction()) return false;
    if (hasTierAction()) {
      if (tierAction_ != other.tierAction_) return false;
    }
    if (hasCoolingThresholdDays() != other.hasCoolingThresholdDays()) return false;
    if (hasCoolingThresholdDays()) {
      if (getCoolingThresholdDays() != other.getCoolingThresholdDays()) return false;
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
    if (hasTierAction()) {
      hash = (37 * hash) + TIER_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + tierAction_;
    }
    if (hasCoolingThresholdDays()) {
      hash = (37 * hash) + COOLING_THRESHOLD_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getCoolingThresholdDays();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.TieringPolicy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.TieringPolicy prototype) {
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
   * Defines tiering policy for the volume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.TieringPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.TieringPolicy)
      com.google.cloud.netapp.v1.TieringPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_TieringPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.TieringPolicy.class,
              com.google.cloud.netapp.v1.TieringPolicy.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.TieringPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tierAction_ = 0;
      coolingThresholdDays_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_TieringPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.TieringPolicy getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.TieringPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.TieringPolicy build() {
      com.google.cloud.netapp.v1.TieringPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.TieringPolicy buildPartial() {
      com.google.cloud.netapp.v1.TieringPolicy result =
          new com.google.cloud.netapp.v1.TieringPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.TieringPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tierAction_ = tierAction_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coolingThresholdDays_ = coolingThresholdDays_;
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
      if (other instanceof com.google.cloud.netapp.v1.TieringPolicy) {
        return mergeFrom((com.google.cloud.netapp.v1.TieringPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.TieringPolicy other) {
      if (other == com.google.cloud.netapp.v1.TieringPolicy.getDefaultInstance()) return this;
      if (other.hasTierAction()) {
        setTierAction(other.getTierAction());
      }
      if (other.hasCoolingThresholdDays()) {
        setCoolingThresholdDays(other.getCoolingThresholdDays());
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
            case 8:
              {
                tierAction_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                coolingThresholdDays_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int tierAction_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the tierAction field is set.
     */
    @java.lang.Override
    public boolean hasTierAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for tierAction.
     */
    @java.lang.Override
    public int getTierActionValue() {
      return tierAction_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for tierAction to set.
     * @return This builder for chaining.
     */
    public Builder setTierActionValue(int value) {
      tierAction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The tierAction.
     */
    @java.lang.Override
    public com.google.cloud.netapp.v1.TieringPolicy.TierAction getTierAction() {
      com.google.cloud.netapp.v1.TieringPolicy.TierAction result =
          com.google.cloud.netapp.v1.TieringPolicy.TierAction.forNumber(tierAction_);
      return result == null
          ? com.google.cloud.netapp.v1.TieringPolicy.TierAction.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The tierAction to set.
     * @return This builder for chaining.
     */
    public Builder setTierAction(com.google.cloud.netapp.v1.TieringPolicy.TierAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      tierAction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Flag indicating if the volume has tiering policy enable/pause.
     * Default is PAUSED.
     * </pre>
     *
     * <code>
     * optional .google.cloud.netapp.v1.TieringPolicy.TierAction tier_action = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTierAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tierAction_ = 0;
      onChanged();
      return this;
    }

    private int coolingThresholdDays_;
    /**
     *
     *
     * <pre>
     * Optional. Time in days to mark the volume's data block as cold and make it
     * eligible for tiering, can be range from 7-183. Default is 31.
     * </pre>
     *
     * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the coolingThresholdDays field is set.
     */
    @java.lang.Override
    public boolean hasCoolingThresholdDays() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Time in days to mark the volume's data block as cold and make it
     * eligible for tiering, can be range from 7-183. Default is 31.
     * </pre>
     *
     * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The coolingThresholdDays.
     */
    @java.lang.Override
    public int getCoolingThresholdDays() {
      return coolingThresholdDays_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time in days to mark the volume's data block as cold and make it
     * eligible for tiering, can be range from 7-183. Default is 31.
     * </pre>
     *
     * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The coolingThresholdDays to set.
     * @return This builder for chaining.
     */
    public Builder setCoolingThresholdDays(int value) {

      coolingThresholdDays_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time in days to mark the volume's data block as cold and make it
     * eligible for tiering, can be range from 7-183. Default is 31.
     * </pre>
     *
     * <code>optional int32 cooling_threshold_days = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCoolingThresholdDays() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coolingThresholdDays_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.TieringPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.TieringPolicy)
  private static final com.google.cloud.netapp.v1.TieringPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.TieringPolicy();
  }

  public static com.google.cloud.netapp.v1.TieringPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TieringPolicy> PARSER =
      new com.google.protobuf.AbstractParser<TieringPolicy>() {
        @java.lang.Override
        public TieringPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<TieringPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TieringPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.TieringPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
