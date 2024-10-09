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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.solar.v1;

/**
 *
 *
 * <pre>
 * SolarPanel describes the position, orientation, and production of a
 * single solar panel. See the [panel_height_meters]
 * [google.maps.solar.v1.SolarPotential.panel_height_meters],
 * [panel_width_meters]
 * [google.maps.solar.v1.SolarPotential.panel_width_meters],
 * and [panel_capacity_watts]
 * [google.maps.solar.v1.SolarPotential.panel_capacity_watts]
 * fields in [SolarPotential]
 * [google.maps.solar.v1.SolarPotential] for information on the
 * parameters of the panel.
 * </pre>
 *
 * Protobuf type {@code google.maps.solar.v1.SolarPanel}
 */
public final class SolarPanel extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.solar.v1.SolarPanel)
    SolarPanelOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SolarPanel.newBuilder() to construct.
  private SolarPanel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SolarPanel() {
    orientation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SolarPanel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_SolarPanel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.solar.v1.SolarServiceProto
        .internal_static_google_maps_solar_v1_SolarPanel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.solar.v1.SolarPanel.class,
            com.google.maps.solar.v1.SolarPanel.Builder.class);
  }

  private int bitField0_;
  public static final int CENTER_FIELD_NUMBER = 1;
  private com.google.type.LatLng center_;
  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   *
   * @return Whether the center field is set.
   */
  @java.lang.Override
  public boolean hasCenter() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   *
   * @return The center.
   */
  @java.lang.Override
  public com.google.type.LatLng getCenter() {
    return center_ == null ? com.google.type.LatLng.getDefaultInstance() : center_;
  }
  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getCenterOrBuilder() {
    return center_ == null ? com.google.type.LatLng.getDefaultInstance() : center_;
  }

  public static final int ORIENTATION_FIELD_NUMBER = 2;
  private int orientation_ = 0;
  /**
   *
   *
   * <pre>
   * The orientation of the panel.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
   *
   * @return The enum numeric value on the wire for orientation.
   */
  @java.lang.Override
  public int getOrientationValue() {
    return orientation_;
  }
  /**
   *
   *
   * <pre>
   * The orientation of the panel.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
   *
   * @return The orientation.
   */
  @java.lang.Override
  public com.google.maps.solar.v1.SolarPanelOrientation getOrientation() {
    com.google.maps.solar.v1.SolarPanelOrientation result =
        com.google.maps.solar.v1.SolarPanelOrientation.forNumber(orientation_);
    return result == null ? com.google.maps.solar.v1.SolarPanelOrientation.UNRECOGNIZED : result;
  }

  public static final int YEARLY_ENERGY_DC_KWH_FIELD_NUMBER = 3;
  private float yearlyEnergyDcKwh_ = 0F;
  /**
   *
   *
   * <pre>
   * How much sunlight energy this layout captures over the course of a
   * year, in DC kWh.
   * </pre>
   *
   * <code>float yearly_energy_dc_kwh = 3;</code>
   *
   * @return The yearlyEnergyDcKwh.
   */
  @java.lang.Override
  public float getYearlyEnergyDcKwh() {
    return yearlyEnergyDcKwh_;
  }

  public static final int SEGMENT_INDEX_FIELD_NUMBER = 4;
  private int segmentIndex_ = 0;
  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
   * roof segment that this panel is placed on.
   * </pre>
   *
   * <code>optional int32 segment_index = 4;</code>
   *
   * @return Whether the segmentIndex field is set.
   */
  @java.lang.Override
  public boolean hasSegmentIndex() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
   * roof segment that this panel is placed on.
   * </pre>
   *
   * <code>optional int32 segment_index = 4;</code>
   *
   * @return The segmentIndex.
   */
  @java.lang.Override
  public int getSegmentIndex() {
    return segmentIndex_;
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
      output.writeMessage(1, getCenter());
    }
    if (orientation_
        != com.google.maps.solar.v1.SolarPanelOrientation.SOLAR_PANEL_ORIENTATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, orientation_);
    }
    if (java.lang.Float.floatToRawIntBits(yearlyEnergyDcKwh_) != 0) {
      output.writeFloat(3, yearlyEnergyDcKwh_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(4, segmentIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCenter());
    }
    if (orientation_
        != com.google.maps.solar.v1.SolarPanelOrientation.SOLAR_PANEL_ORIENTATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, orientation_);
    }
    if (java.lang.Float.floatToRawIntBits(yearlyEnergyDcKwh_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, yearlyEnergyDcKwh_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, segmentIndex_);
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
    if (!(obj instanceof com.google.maps.solar.v1.SolarPanel)) {
      return super.equals(obj);
    }
    com.google.maps.solar.v1.SolarPanel other = (com.google.maps.solar.v1.SolarPanel) obj;

    if (hasCenter() != other.hasCenter()) return false;
    if (hasCenter()) {
      if (!getCenter().equals(other.getCenter())) return false;
    }
    if (orientation_ != other.orientation_) return false;
    if (java.lang.Float.floatToIntBits(getYearlyEnergyDcKwh())
        != java.lang.Float.floatToIntBits(other.getYearlyEnergyDcKwh())) return false;
    if (hasSegmentIndex() != other.hasSegmentIndex()) return false;
    if (hasSegmentIndex()) {
      if (getSegmentIndex() != other.getSegmentIndex()) return false;
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
    if (hasCenter()) {
      hash = (37 * hash) + CENTER_FIELD_NUMBER;
      hash = (53 * hash) + getCenter().hashCode();
    }
    hash = (37 * hash) + ORIENTATION_FIELD_NUMBER;
    hash = (53 * hash) + orientation_;
    hash = (37 * hash) + YEARLY_ENERGY_DC_KWH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getYearlyEnergyDcKwh());
    if (hasSegmentIndex()) {
      hash = (37 * hash) + SEGMENT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentIndex();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.SolarPanel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.SolarPanel parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.solar.v1.SolarPanel parseFrom(
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

  public static Builder newBuilder(com.google.maps.solar.v1.SolarPanel prototype) {
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
   * SolarPanel describes the position, orientation, and production of a
   * single solar panel. See the [panel_height_meters]
   * [google.maps.solar.v1.SolarPotential.panel_height_meters],
   * [panel_width_meters]
   * [google.maps.solar.v1.SolarPotential.panel_width_meters],
   * and [panel_capacity_watts]
   * [google.maps.solar.v1.SolarPotential.panel_capacity_watts]
   * fields in [SolarPotential]
   * [google.maps.solar.v1.SolarPotential] for information on the
   * parameters of the panel.
   * </pre>
   *
   * Protobuf type {@code google.maps.solar.v1.SolarPanel}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.solar.v1.SolarPanel)
      com.google.maps.solar.v1.SolarPanelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_SolarPanel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_SolarPanel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.solar.v1.SolarPanel.class,
              com.google.maps.solar.v1.SolarPanel.Builder.class);
    }

    // Construct using com.google.maps.solar.v1.SolarPanel.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCenterFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      center_ = null;
      if (centerBuilder_ != null) {
        centerBuilder_.dispose();
        centerBuilder_ = null;
      }
      orientation_ = 0;
      yearlyEnergyDcKwh_ = 0F;
      segmentIndex_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.solar.v1.SolarServiceProto
          .internal_static_google_maps_solar_v1_SolarPanel_descriptor;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.SolarPanel getDefaultInstanceForType() {
      return com.google.maps.solar.v1.SolarPanel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.solar.v1.SolarPanel build() {
      com.google.maps.solar.v1.SolarPanel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.solar.v1.SolarPanel buildPartial() {
      com.google.maps.solar.v1.SolarPanel result = new com.google.maps.solar.v1.SolarPanel(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.solar.v1.SolarPanel result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.center_ = centerBuilder_ == null ? center_ : centerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orientation_ = orientation_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.yearlyEnergyDcKwh_ = yearlyEnergyDcKwh_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.segmentIndex_ = segmentIndex_;
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
      if (other instanceof com.google.maps.solar.v1.SolarPanel) {
        return mergeFrom((com.google.maps.solar.v1.SolarPanel) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.solar.v1.SolarPanel other) {
      if (other == com.google.maps.solar.v1.SolarPanel.getDefaultInstance()) return this;
      if (other.hasCenter()) {
        mergeCenter(other.getCenter());
      }
      if (other.orientation_ != 0) {
        setOrientationValue(other.getOrientationValue());
      }
      if (other.getYearlyEnergyDcKwh() != 0F) {
        setYearlyEnergyDcKwh(other.getYearlyEnergyDcKwh());
      }
      if (other.hasSegmentIndex()) {
        setSegmentIndex(other.getSegmentIndex());
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
                input.readMessage(getCenterFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                orientation_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 29:
              {
                yearlyEnergyDcKwh_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 29
            case 32:
              {
                segmentIndex_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private com.google.type.LatLng center_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        centerBuilder_;
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     *
     * @return Whether the center field is set.
     */
    public boolean hasCenter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     *
     * @return The center.
     */
    public com.google.type.LatLng getCenter() {
      if (centerBuilder_ == null) {
        return center_ == null ? com.google.type.LatLng.getDefaultInstance() : center_;
      } else {
        return centerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public Builder setCenter(com.google.type.LatLng value) {
      if (centerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        center_ = value;
      } else {
        centerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public Builder setCenter(com.google.type.LatLng.Builder builderForValue) {
      if (centerBuilder_ == null) {
        center_ = builderForValue.build();
      } else {
        centerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public Builder mergeCenter(com.google.type.LatLng value) {
      if (centerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && center_ != null
            && center_ != com.google.type.LatLng.getDefaultInstance()) {
          getCenterBuilder().mergeFrom(value);
        } else {
          center_ = value;
        }
      } else {
        centerBuilder_.mergeFrom(value);
      }
      if (center_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public Builder clearCenter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      center_ = null;
      if (centerBuilder_ != null) {
        centerBuilder_.dispose();
        centerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public com.google.type.LatLng.Builder getCenterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCenterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getCenterOrBuilder() {
      if (centerBuilder_ != null) {
        return centerBuilder_.getMessageOrBuilder();
      } else {
        return center_ == null ? com.google.type.LatLng.getDefaultInstance() : center_;
      }
    }
    /**
     *
     *
     * <pre>
     * The centre of the panel.
     * </pre>
     *
     * <code>.google.type.LatLng center = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getCenterFieldBuilder() {
      if (centerBuilder_ == null) {
        centerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getCenter(), getParentForChildren(), isClean());
        center_ = null;
      }
      return centerBuilder_;
    }

    private int orientation_ = 0;
    /**
     *
     *
     * <pre>
     * The orientation of the panel.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
     *
     * @return The enum numeric value on the wire for orientation.
     */
    @java.lang.Override
    public int getOrientationValue() {
      return orientation_;
    }
    /**
     *
     *
     * <pre>
     * The orientation of the panel.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
     *
     * @param value The enum numeric value on the wire for orientation to set.
     * @return This builder for chaining.
     */
    public Builder setOrientationValue(int value) {
      orientation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The orientation of the panel.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
     *
     * @return The orientation.
     */
    @java.lang.Override
    public com.google.maps.solar.v1.SolarPanelOrientation getOrientation() {
      com.google.maps.solar.v1.SolarPanelOrientation result =
          com.google.maps.solar.v1.SolarPanelOrientation.forNumber(orientation_);
      return result == null ? com.google.maps.solar.v1.SolarPanelOrientation.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The orientation of the panel.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
     *
     * @param value The orientation to set.
     * @return This builder for chaining.
     */
    public Builder setOrientation(com.google.maps.solar.v1.SolarPanelOrientation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      orientation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The orientation of the panel.
     * </pre>
     *
     * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrientation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orientation_ = 0;
      onChanged();
      return this;
    }

    private float yearlyEnergyDcKwh_;
    /**
     *
     *
     * <pre>
     * How much sunlight energy this layout captures over the course of a
     * year, in DC kWh.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 3;</code>
     *
     * @return The yearlyEnergyDcKwh.
     */
    @java.lang.Override
    public float getYearlyEnergyDcKwh() {
      return yearlyEnergyDcKwh_;
    }
    /**
     *
     *
     * <pre>
     * How much sunlight energy this layout captures over the course of a
     * year, in DC kWh.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 3;</code>
     *
     * @param value The yearlyEnergyDcKwh to set.
     * @return This builder for chaining.
     */
    public Builder setYearlyEnergyDcKwh(float value) {

      yearlyEnergyDcKwh_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How much sunlight energy this layout captures over the course of a
     * year, in DC kWh.
     * </pre>
     *
     * <code>float yearly_energy_dc_kwh = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearYearlyEnergyDcKwh() {
      bitField0_ = (bitField0_ & ~0x00000004);
      yearlyEnergyDcKwh_ = 0F;
      onChanged();
      return this;
    }

    private int segmentIndex_;
    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
     * roof segment that this panel is placed on.
     * </pre>
     *
     * <code>optional int32 segment_index = 4;</code>
     *
     * @return Whether the segmentIndex field is set.
     */
    @java.lang.Override
    public boolean hasSegmentIndex() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
     * roof segment that this panel is placed on.
     * </pre>
     *
     * <code>optional int32 segment_index = 4;</code>
     *
     * @return The segmentIndex.
     */
    @java.lang.Override
    public int getSegmentIndex() {
      return segmentIndex_;
    }
    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
     * roof segment that this panel is placed on.
     * </pre>
     *
     * <code>optional int32 segment_index = 4;</code>
     *
     * @param value The segmentIndex to set.
     * @return This builder for chaining.
     */
    public Builder setSegmentIndex(int value) {

      segmentIndex_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Index in [roof_segment_stats]
     * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
     * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
     * roof segment that this panel is placed on.
     * </pre>
     *
     * <code>optional int32 segment_index = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSegmentIndex() {
      bitField0_ = (bitField0_ & ~0x00000008);
      segmentIndex_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.maps.solar.v1.SolarPanel)
  }

  // @@protoc_insertion_point(class_scope:google.maps.solar.v1.SolarPanel)
  private static final com.google.maps.solar.v1.SolarPanel DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.solar.v1.SolarPanel();
  }

  public static com.google.maps.solar.v1.SolarPanel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SolarPanel> PARSER =
      new com.google.protobuf.AbstractParser<SolarPanel>() {
        @java.lang.Override
        public SolarPanel parsePartialFrom(
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

  public static com.google.protobuf.Parser<SolarPanel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SolarPanel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.solar.v1.SolarPanel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
