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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2alpha1;

/**
 *
 *
 * <pre>
 * A TPU accelerator configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.AcceleratorConfig}
 */
public final class AcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.AcceleratorConfig)
    AcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceleratorConfig.newBuilder() to construct.
  private AcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceleratorConfig() {
    type_ = 0;
    topology_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceleratorConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_AcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_AcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.AcceleratorConfig.class,
            com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * TPU type.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.tpu.v2alpha1.AcceleratorConfig.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified version.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * TPU v2.
     * </pre>
     *
     * <code>V2 = 2;</code>
     */
    V2(2),
    /**
     *
     *
     * <pre>
     * TPU v3.
     * </pre>
     *
     * <code>V3 = 4;</code>
     */
    V3(4),
    /**
     *
     *
     * <pre>
     * TPU v4.
     * </pre>
     *
     * <code>V4 = 7;</code>
     */
    V4(7),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified version.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * TPU v2.
     * </pre>
     *
     * <code>V2 = 2;</code>
     */
    public static final int V2_VALUE = 2;
    /**
     *
     *
     * <pre>
     * TPU v3.
     * </pre>
     *
     * <code>V3 = 4;</code>
     */
    public static final int V3_VALUE = 4;
    /**
     *
     *
     * <pre>
     * TPU v4.
     * </pre>
     *
     * <code>V4 = 7;</code>
     */
    public static final int V4_VALUE = 7;

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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 2:
          return V2;
        case 4:
          return V3;
        case 7:
          return V4;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
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
      return com.google.cloud.tpu.v2alpha1.AcceleratorConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.tpu.v2alpha1.AcceleratorConfig.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Type of TPU.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Required. Type of TPU.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type getType() {
    com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type result =
        com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.forNumber(type_);
    return result == null
        ? com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.UNRECOGNIZED
        : result;
  }

  public static final int TOPOLOGY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object topology_ = "";
  /**
   *
   *
   * <pre>
   * Required. Topology of TPU in chips.
   * </pre>
   *
   * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The topology.
   */
  @java.lang.Override
  public java.lang.String getTopology() {
    java.lang.Object ref = topology_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topology_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Topology of TPU in chips.
   * </pre>
   *
   * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for topology.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTopologyBytes() {
    java.lang.Object ref = topology_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      topology_ = b;
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
    if (type_
        != com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topology_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topology_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topology_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topology_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.AcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.AcceleratorConfig other =
        (com.google.cloud.tpu.v2alpha1.AcceleratorConfig) obj;

    if (type_ != other.type_) return false;
    if (!getTopology().equals(other.getTopology())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TOPOLOGY_FIELD_NUMBER;
    hash = (53 * hash) + getTopology().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.AcceleratorConfig prototype) {
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
   * A TPU accelerator configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.AcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.AcceleratorConfig)
      com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_AcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.AcceleratorConfig.class,
              com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.AcceleratorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      topology_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.AcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig build() {
      com.google.cloud.tpu.v2alpha1.AcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig buildPartial() {
      com.google.cloud.tpu.v2alpha1.AcceleratorConfig result =
          new com.google.cloud.tpu.v2alpha1.AcceleratorConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.AcceleratorConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topology_ = topology_;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.AcceleratorConfig) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.AcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.AcceleratorConfig other) {
      if (other == com.google.cloud.tpu.v2alpha1.AcceleratorConfig.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getTopology().isEmpty()) {
        topology_ = other.topology_;
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
            case 8:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                topology_ = input.readStringRequireUtf8();
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

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Type of TPU.
     * </pre>
     *
     * <code>
     * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of TPU.
     * </pre>
     *
     * <code>
     * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of TPU.
     * </pre>
     *
     * <code>
     * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type getType() {
      com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type result =
          com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.forNumber(type_);
      return result == null
          ? com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of TPU.
     * </pre>
     *
     * <code>
     * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of TPU.
     * </pre>
     *
     * <code>
     * .google.cloud.tpu.v2alpha1.AcceleratorConfig.Type type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object topology_ = "";
    /**
     *
     *
     * <pre>
     * Required. Topology of TPU in chips.
     * </pre>
     *
     * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The topology.
     */
    public java.lang.String getTopology() {
      java.lang.Object ref = topology_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topology_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Topology of TPU in chips.
     * </pre>
     *
     * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for topology.
     */
    public com.google.protobuf.ByteString getTopologyBytes() {
      java.lang.Object ref = topology_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        topology_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Topology of TPU in chips.
     * </pre>
     *
     * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The topology to set.
     * @return This builder for chaining.
     */
    public Builder setTopology(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      topology_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Topology of TPU in chips.
     * </pre>
     *
     * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopology() {
      topology_ = getDefaultInstance().getTopology();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Topology of TPU in chips.
     * </pre>
     *
     * <code>string topology = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for topology to set.
     * @return This builder for chaining.
     */
    public Builder setTopologyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      topology_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.AcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.AcceleratorConfig)
  private static final com.google.cloud.tpu.v2alpha1.AcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.AcceleratorConfig();
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<AcceleratorConfig>() {
        @java.lang.Override
        public AcceleratorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.AcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
