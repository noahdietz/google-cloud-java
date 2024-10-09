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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.optimization.v1;

/**
 *
 *
 * <pre>
 * Encapsulates a set of optional conditions to satisfy when calculating
 * vehicle routes. This is similar to `RouteModifiers` in the Google Maps
 * Platform API; see:
 * https://developers.google.com/maps/documentation/routes/reference/rest/v2/RouteModifiers.
 * </pre>
 *
 * Protobuf type {@code google.cloud.optimization.v1.RouteModifiers}
 */
public final class RouteModifiers extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.optimization.v1.RouteModifiers)
    RouteModifiersOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RouteModifiers.newBuilder() to construct.
  private RouteModifiers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RouteModifiers() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RouteModifiers();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_RouteModifiers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_RouteModifiers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.optimization.v1.RouteModifiers.class,
            com.google.cloud.optimization.v1.RouteModifiers.Builder.class);
  }

  public static final int AVOID_TOLLS_FIELD_NUMBER = 2;
  private boolean avoidTolls_ = false;
  /**
   *
   *
   * <pre>
   * Specifies whether to avoid toll roads where reasonable. Preference will be
   * given to routes not containing toll roads. Applies only to motorized travel
   * modes.
   * </pre>
   *
   * <code>bool avoid_tolls = 2;</code>
   *
   * @return The avoidTolls.
   */
  @java.lang.Override
  public boolean getAvoidTolls() {
    return avoidTolls_;
  }

  public static final int AVOID_HIGHWAYS_FIELD_NUMBER = 3;
  private boolean avoidHighways_ = false;
  /**
   *
   *
   * <pre>
   * Specifies whether to avoid highways where reasonable. Preference will be
   * given to routes not containing highways. Applies only to motorized travel
   * modes.
   * </pre>
   *
   * <code>bool avoid_highways = 3;</code>
   *
   * @return The avoidHighways.
   */
  @java.lang.Override
  public boolean getAvoidHighways() {
    return avoidHighways_;
  }

  public static final int AVOID_FERRIES_FIELD_NUMBER = 4;
  private boolean avoidFerries_ = false;
  /**
   *
   *
   * <pre>
   * Specifies whether to avoid ferries where reasonable. Preference will be
   * given to routes not containing travel by ferries. Applies only to motorized
   * travel modes.
   * </pre>
   *
   * <code>bool avoid_ferries = 4;</code>
   *
   * @return The avoidFerries.
   */
  @java.lang.Override
  public boolean getAvoidFerries() {
    return avoidFerries_;
  }

  public static final int AVOID_INDOOR_FIELD_NUMBER = 5;
  private boolean avoidIndoor_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Specifies whether to avoid navigating indoors where reasonable.
   * Preference will be given to routes not containing indoor navigation.
   * Applies only to the `WALKING` travel mode.
   * </pre>
   *
   * <code>bool avoid_indoor = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The avoidIndoor.
   */
  @java.lang.Override
  public boolean getAvoidIndoor() {
    return avoidIndoor_;
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
    if (avoidTolls_ != false) {
      output.writeBool(2, avoidTolls_);
    }
    if (avoidHighways_ != false) {
      output.writeBool(3, avoidHighways_);
    }
    if (avoidFerries_ != false) {
      output.writeBool(4, avoidFerries_);
    }
    if (avoidIndoor_ != false) {
      output.writeBool(5, avoidIndoor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (avoidTolls_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, avoidTolls_);
    }
    if (avoidHighways_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, avoidHighways_);
    }
    if (avoidFerries_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, avoidFerries_);
    }
    if (avoidIndoor_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, avoidIndoor_);
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
    if (!(obj instanceof com.google.cloud.optimization.v1.RouteModifiers)) {
      return super.equals(obj);
    }
    com.google.cloud.optimization.v1.RouteModifiers other =
        (com.google.cloud.optimization.v1.RouteModifiers) obj;

    if (getAvoidTolls() != other.getAvoidTolls()) return false;
    if (getAvoidHighways() != other.getAvoidHighways()) return false;
    if (getAvoidFerries() != other.getAvoidFerries()) return false;
    if (getAvoidIndoor() != other.getAvoidIndoor()) return false;
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
    hash = (37 * hash) + AVOID_TOLLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAvoidTolls());
    hash = (37 * hash) + AVOID_HIGHWAYS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAvoidHighways());
    hash = (37 * hash) + AVOID_FERRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAvoidFerries());
    hash = (37 * hash) + AVOID_INDOOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAvoidIndoor());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.RouteModifiers parseFrom(
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

  public static Builder newBuilder(com.google.cloud.optimization.v1.RouteModifiers prototype) {
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
   * Encapsulates a set of optional conditions to satisfy when calculating
   * vehicle routes. This is similar to `RouteModifiers` in the Google Maps
   * Platform API; see:
   * https://developers.google.com/maps/documentation/routes/reference/rest/v2/RouteModifiers.
   * </pre>
   *
   * Protobuf type {@code google.cloud.optimization.v1.RouteModifiers}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.optimization.v1.RouteModifiers)
      com.google.cloud.optimization.v1.RouteModifiersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_RouteModifiers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_RouteModifiers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.optimization.v1.RouteModifiers.class,
              com.google.cloud.optimization.v1.RouteModifiers.Builder.class);
    }

    // Construct using com.google.cloud.optimization.v1.RouteModifiers.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      avoidTolls_ = false;
      avoidHighways_ = false;
      avoidFerries_ = false;
      avoidIndoor_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_RouteModifiers_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.RouteModifiers getDefaultInstanceForType() {
      return com.google.cloud.optimization.v1.RouteModifiers.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.RouteModifiers build() {
      com.google.cloud.optimization.v1.RouteModifiers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.RouteModifiers buildPartial() {
      com.google.cloud.optimization.v1.RouteModifiers result =
          new com.google.cloud.optimization.v1.RouteModifiers(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.optimization.v1.RouteModifiers result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.avoidTolls_ = avoidTolls_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.avoidHighways_ = avoidHighways_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.avoidFerries_ = avoidFerries_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.avoidIndoor_ = avoidIndoor_;
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
      if (other instanceof com.google.cloud.optimization.v1.RouteModifiers) {
        return mergeFrom((com.google.cloud.optimization.v1.RouteModifiers) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.optimization.v1.RouteModifiers other) {
      if (other == com.google.cloud.optimization.v1.RouteModifiers.getDefaultInstance())
        return this;
      if (other.getAvoidTolls() != false) {
        setAvoidTolls(other.getAvoidTolls());
      }
      if (other.getAvoidHighways() != false) {
        setAvoidHighways(other.getAvoidHighways());
      }
      if (other.getAvoidFerries() != false) {
        setAvoidFerries(other.getAvoidFerries());
      }
      if (other.getAvoidIndoor() != false) {
        setAvoidIndoor(other.getAvoidIndoor());
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
            case 16:
              {
                avoidTolls_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
            case 24:
              {
                avoidHighways_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
            case 32:
              {
                avoidFerries_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
            case 40:
              {
                avoidIndoor_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
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

    private boolean avoidTolls_;
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid toll roads where reasonable. Preference will be
     * given to routes not containing toll roads. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_tolls = 2;</code>
     *
     * @return The avoidTolls.
     */
    @java.lang.Override
    public boolean getAvoidTolls() {
      return avoidTolls_;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid toll roads where reasonable. Preference will be
     * given to routes not containing toll roads. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_tolls = 2;</code>
     *
     * @param value The avoidTolls to set.
     * @return This builder for chaining.
     */
    public Builder setAvoidTolls(boolean value) {

      avoidTolls_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid toll roads where reasonable. Preference will be
     * given to routes not containing toll roads. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_tolls = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvoidTolls() {
      bitField0_ = (bitField0_ & ~0x00000001);
      avoidTolls_ = false;
      onChanged();
      return this;
    }

    private boolean avoidHighways_;
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid highways where reasonable. Preference will be
     * given to routes not containing highways. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_highways = 3;</code>
     *
     * @return The avoidHighways.
     */
    @java.lang.Override
    public boolean getAvoidHighways() {
      return avoidHighways_;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid highways where reasonable. Preference will be
     * given to routes not containing highways. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_highways = 3;</code>
     *
     * @param value The avoidHighways to set.
     * @return This builder for chaining.
     */
    public Builder setAvoidHighways(boolean value) {

      avoidHighways_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid highways where reasonable. Preference will be
     * given to routes not containing highways. Applies only to motorized travel
     * modes.
     * </pre>
     *
     * <code>bool avoid_highways = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvoidHighways() {
      bitField0_ = (bitField0_ & ~0x00000002);
      avoidHighways_ = false;
      onChanged();
      return this;
    }

    private boolean avoidFerries_;
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid ferries where reasonable. Preference will be
     * given to routes not containing travel by ferries. Applies only to motorized
     * travel modes.
     * </pre>
     *
     * <code>bool avoid_ferries = 4;</code>
     *
     * @return The avoidFerries.
     */
    @java.lang.Override
    public boolean getAvoidFerries() {
      return avoidFerries_;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid ferries where reasonable. Preference will be
     * given to routes not containing travel by ferries. Applies only to motorized
     * travel modes.
     * </pre>
     *
     * <code>bool avoid_ferries = 4;</code>
     *
     * @param value The avoidFerries to set.
     * @return This builder for chaining.
     */
    public Builder setAvoidFerries(boolean value) {

      avoidFerries_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether to avoid ferries where reasonable. Preference will be
     * given to routes not containing travel by ferries. Applies only to motorized
     * travel modes.
     * </pre>
     *
     * <code>bool avoid_ferries = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvoidFerries() {
      bitField0_ = (bitField0_ & ~0x00000004);
      avoidFerries_ = false;
      onChanged();
      return this;
    }

    private boolean avoidIndoor_;
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether to avoid navigating indoors where reasonable.
     * Preference will be given to routes not containing indoor navigation.
     * Applies only to the `WALKING` travel mode.
     * </pre>
     *
     * <code>bool avoid_indoor = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The avoidIndoor.
     */
    @java.lang.Override
    public boolean getAvoidIndoor() {
      return avoidIndoor_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether to avoid navigating indoors where reasonable.
     * Preference will be given to routes not containing indoor navigation.
     * Applies only to the `WALKING` travel mode.
     * </pre>
     *
     * <code>bool avoid_indoor = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The avoidIndoor to set.
     * @return This builder for chaining.
     */
    public Builder setAvoidIndoor(boolean value) {

      avoidIndoor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether to avoid navigating indoors where reasonable.
     * Preference will be given to routes not containing indoor navigation.
     * Applies only to the `WALKING` travel mode.
     * </pre>
     *
     * <code>bool avoid_indoor = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvoidIndoor() {
      bitField0_ = (bitField0_ & ~0x00000008);
      avoidIndoor_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.optimization.v1.RouteModifiers)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.optimization.v1.RouteModifiers)
  private static final com.google.cloud.optimization.v1.RouteModifiers DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.optimization.v1.RouteModifiers();
  }

  public static com.google.cloud.optimization.v1.RouteModifiers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteModifiers> PARSER =
      new com.google.protobuf.AbstractParser<RouteModifiers>() {
        @java.lang.Override
        public RouteModifiers parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteModifiers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteModifiers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.optimization.v1.RouteModifiers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
