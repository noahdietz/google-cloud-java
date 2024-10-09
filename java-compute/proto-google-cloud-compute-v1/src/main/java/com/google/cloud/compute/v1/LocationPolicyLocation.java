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
 * Protobuf type {@code google.cloud.compute.v1.LocationPolicyLocation}
 */
public final class LocationPolicyLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LocationPolicyLocation)
    LocationPolicyLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationPolicyLocation.newBuilder() to construct.
  private LocationPolicyLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationPolicyLocation() {
    preference_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationPolicyLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LocationPolicyLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_LocationPolicyLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LocationPolicyLocation.class,
            com.google.cloud.compute.v1.LocationPolicyLocation.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.LocationPolicyLocation.Preference}
   */
  public enum Preference implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PREFERENCE = 0;</code>
     */
    UNDEFINED_PREFERENCE(0),
    /**
     *
     *
     * <pre>
     * Location is allowed for use.
     * </pre>
     *
     * <code>ALLOW = 62368553;</code>
     */
    ALLOW(62368553),
    /**
     *
     *
     * <pre>
     * Location is prohibited.
     * </pre>
     *
     * <code>DENY = 2094604;</code>
     */
    DENY(2094604),
    /**
     *
     *
     * <pre>
     * Default value, unused.
     * </pre>
     *
     * <code>PREFERENCE_UNSPECIFIED = 496219571;</code>
     */
    PREFERENCE_UNSPECIFIED(496219571),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PREFERENCE = 0;</code>
     */
    public static final int UNDEFINED_PREFERENCE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Location is allowed for use.
     * </pre>
     *
     * <code>ALLOW = 62368553;</code>
     */
    public static final int ALLOW_VALUE = 62368553;
    /**
     *
     *
     * <pre>
     * Location is prohibited.
     * </pre>
     *
     * <code>DENY = 2094604;</code>
     */
    public static final int DENY_VALUE = 2094604;
    /**
     *
     *
     * <pre>
     * Default value, unused.
     * </pre>
     *
     * <code>PREFERENCE_UNSPECIFIED = 496219571;</code>
     */
    public static final int PREFERENCE_UNSPECIFIED_VALUE = 496219571;

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
    public static Preference valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Preference forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_PREFERENCE;
        case 62368553:
          return ALLOW;
        case 2094604:
          return DENY;
        case 496219571:
          return PREFERENCE_UNSPECIFIED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Preference> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Preference> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Preference>() {
          public Preference findValueByNumber(int number) {
            return Preference.forNumber(number);
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
      return com.google.cloud.compute.v1.LocationPolicyLocation.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Preference[] VALUES = values();

    public static Preference valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Preference(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.LocationPolicyLocation.Preference)
  }

  private int bitField0_;
  public static final int CONSTRAINTS_FIELD_NUMBER = 3909174;
  private com.google.cloud.compute.v1.LocationPolicyLocationConstraints constraints_;
  /**
   *
   *
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
   * </code>
   *
   * @return Whether the constraints field is set.
   */
  @java.lang.Override
  public boolean hasConstraints() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
   * </code>
   *
   * @return The constraints.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LocationPolicyLocationConstraints getConstraints() {
    return constraints_ == null
        ? com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance()
        : constraints_;
  }
  /**
   *
   *
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder
      getConstraintsOrBuilder() {
    return constraints_ == null
        ? com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance()
        : constraints_;
  }

  public static final int PREFERENCE_FIELD_NUMBER = 150781147;

  @SuppressWarnings("serial")
  private volatile java.lang.Object preference_ = "";
  /**
   *
   *
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return Whether the preference field is set.
   */
  @java.lang.Override
  public boolean hasPreference() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return The preference.
   */
  @java.lang.Override
  public java.lang.String getPreference() {
    java.lang.Object ref = preference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preference_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return The bytes for preference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPreferenceBytes() {
    java.lang.Object ref = preference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      preference_ = b;
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
      output.writeMessage(3909174, getConstraints());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 150781147, preference_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3909174, getConstraints());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(150781147, preference_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LocationPolicyLocation)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LocationPolicyLocation other =
        (com.google.cloud.compute.v1.LocationPolicyLocation) obj;

    if (hasConstraints() != other.hasConstraints()) return false;
    if (hasConstraints()) {
      if (!getConstraints().equals(other.getConstraints())) return false;
    }
    if (hasPreference() != other.hasPreference()) return false;
    if (hasPreference()) {
      if (!getPreference().equals(other.getPreference())) return false;
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
    if (hasConstraints()) {
      hash = (37 * hash) + CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getConstraints().hashCode();
    }
    if (hasPreference()) {
      hash = (37 * hash) + PREFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getPreference().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.LocationPolicyLocation prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.LocationPolicyLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LocationPolicyLocation)
      com.google.cloud.compute.v1.LocationPolicyLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LocationPolicyLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LocationPolicyLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LocationPolicyLocation.class,
              com.google.cloud.compute.v1.LocationPolicyLocation.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LocationPolicyLocation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getConstraintsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      constraints_ = null;
      if (constraintsBuilder_ != null) {
        constraintsBuilder_.dispose();
        constraintsBuilder_ = null;
      }
      preference_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_LocationPolicyLocation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocation getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LocationPolicyLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocation build() {
      com.google.cloud.compute.v1.LocationPolicyLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocation buildPartial() {
      com.google.cloud.compute.v1.LocationPolicyLocation result =
          new com.google.cloud.compute.v1.LocationPolicyLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.LocationPolicyLocation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.constraints_ =
            constraintsBuilder_ == null ? constraints_ : constraintsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.preference_ = preference_;
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
      if (other instanceof com.google.cloud.compute.v1.LocationPolicyLocation) {
        return mergeFrom((com.google.cloud.compute.v1.LocationPolicyLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LocationPolicyLocation other) {
      if (other == com.google.cloud.compute.v1.LocationPolicyLocation.getDefaultInstance())
        return this;
      if (other.hasConstraints()) {
        mergeConstraints(other.getConstraints());
      }
      if (other.hasPreference()) {
        preference_ = other.preference_;
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
            case 31273394:
              {
                input.readMessage(getConstraintsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 31273394
            case 1206249178:
              {
                preference_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1206249178
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

    private com.google.cloud.compute.v1.LocationPolicyLocationConstraints constraints_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LocationPolicyLocationConstraints,
            com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder,
            com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder>
        constraintsBuilder_;
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     *
     * @return Whether the constraints field is set.
     */
    public boolean hasConstraints() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     *
     * @return The constraints.
     */
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraints getConstraints() {
      if (constraintsBuilder_ == null) {
        return constraints_ == null
            ? com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance()
            : constraints_;
      } else {
        return constraintsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public Builder setConstraints(
        com.google.cloud.compute.v1.LocationPolicyLocationConstraints value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constraints_ = value;
      } else {
        constraintsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public Builder setConstraints(
        com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        constraints_ = builderForValue.build();
      } else {
        constraintsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public Builder mergeConstraints(
        com.google.cloud.compute.v1.LocationPolicyLocationConstraints value) {
      if (constraintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && constraints_ != null
            && constraints_
                != com.google.cloud.compute.v1.LocationPolicyLocationConstraints
                    .getDefaultInstance()) {
          getConstraintsBuilder().mergeFrom(value);
        } else {
          constraints_ = value;
        }
      } else {
        constraintsBuilder_.mergeFrom(value);
      }
      if (constraints_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public Builder clearConstraints() {
      bitField0_ = (bitField0_ & ~0x00000001);
      constraints_ = null;
      if (constraintsBuilder_ != null) {
        constraintsBuilder_.dispose();
        constraintsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder
        getConstraintsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConstraintsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder
        getConstraintsOrBuilder() {
      if (constraintsBuilder_ != null) {
        return constraintsBuilder_.getMessageOrBuilder();
      } else {
        return constraints_ == null
            ? com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance()
            : constraints_;
      }
    }
    /**
     *
     *
     * <pre>
     * Constraints that the caller requires on the result distribution in this zone.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LocationPolicyLocationConstraints,
            com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder,
            com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder>
        getConstraintsFieldBuilder() {
      if (constraintsBuilder_ == null) {
        constraintsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.LocationPolicyLocationConstraints,
                com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder,
                com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder>(
                getConstraints(), getParentForChildren(), isClean());
        constraints_ = null;
      }
      return constraintsBuilder_;
    }

    private java.lang.Object preference_ = "";
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @return Whether the preference field is set.
     */
    public boolean hasPreference() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @return The preference.
     */
    public java.lang.String getPreference() {
      java.lang.Object ref = preference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @return The bytes for preference.
     */
    public com.google.protobuf.ByteString getPreferenceBytes() {
      java.lang.Object ref = preference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        preference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @param value The preference to set.
     * @return This builder for chaining.
     */
    public Builder setPreference(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      preference_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPreference() {
      preference_ = getDefaultInstance().getPreference();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preference for a given location. Set to either ALLOW or DENY.
     * Check the Preference enum for the list of possible values.
     * </pre>
     *
     * <code>optional string preference = 150781147;</code>
     *
     * @param value The bytes for preference to set.
     * @return This builder for chaining.
     */
    public Builder setPreferenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      preference_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LocationPolicyLocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LocationPolicyLocation)
  private static final com.google.cloud.compute.v1.LocationPolicyLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LocationPolicyLocation();
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationPolicyLocation> PARSER =
      new com.google.protobuf.AbstractParser<LocationPolicyLocation>() {
        @java.lang.Override
        public LocationPolicyLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationPolicyLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationPolicyLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LocationPolicyLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
