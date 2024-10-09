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
// source: google/cloud/dialogflow/cx/v3beta1/parameter_definition.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * Defines the properties of a parameter.
 * Used to define parameters used in the agent and the
 * input / output parameters for each fulfillment.
 * (-- Next Id: 4 --)
 * (-- api-linter: core::0123::resource-annotation=disabled
 *     aip.dev/not-precedent: ParameterDefinition is not an exposed resource.
 *     --)
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ParameterDefinition}
 */
public final class ParameterDefinition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ParameterDefinition)
    ParameterDefinitionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ParameterDefinition.newBuilder() to construct.
  private ParameterDefinition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ParameterDefinition() {
    name_ = "";
    type_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ParameterDefinition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.class,
            com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Parameter types are used for validation.
   * These types are consistent with [google.protobuf.Value][].
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType}
   */
  public enum ParameterType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. No validation will be performed.
     * </pre>
     *
     * <code>PARAMETER_TYPE_UNSPECIFIED = 0;</code>
     */
    PARAMETER_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Represents any string value.
     * </pre>
     *
     * <code>STRING = 1;</code>
     */
    STRING(1),
    /**
     *
     *
     * <pre>
     * Represents any number value.
     * </pre>
     *
     * <code>NUMBER = 2;</code>
     */
    NUMBER(2),
    /**
     *
     *
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>BOOLEAN = 3;</code>
     */
    BOOLEAN(3),
    /**
     *
     *
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>NULL = 4;</code>
     */
    NULL(4),
    /**
     *
     *
     * <pre>
     * Represents any object value.
     * </pre>
     *
     * <code>OBJECT = 5;</code>
     */
    OBJECT(5),
    /**
     *
     *
     * <pre>
     * Represents a repeated value.
     * </pre>
     *
     * <code>LIST = 6;</code>
     */
    LIST(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. No validation will be performed.
     * </pre>
     *
     * <code>PARAMETER_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int PARAMETER_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Represents any string value.
     * </pre>
     *
     * <code>STRING = 1;</code>
     */
    public static final int STRING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Represents any number value.
     * </pre>
     *
     * <code>NUMBER = 2;</code>
     */
    public static final int NUMBER_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>BOOLEAN = 3;</code>
     */
    public static final int BOOLEAN_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>NULL = 4;</code>
     */
    public static final int NULL_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Represents any object value.
     * </pre>
     *
     * <code>OBJECT = 5;</code>
     */
    public static final int OBJECT_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Represents a repeated value.
     * </pre>
     *
     * <code>LIST = 6;</code>
     */
    public static final int LIST_VALUE = 6;

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
    public static ParameterType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ParameterType forNumber(int value) {
      switch (value) {
        case 0:
          return PARAMETER_TYPE_UNSPECIFIED;
        case 1:
          return STRING;
        case 2:
          return NUMBER;
        case 3:
          return BOOLEAN;
        case 4:
          return NULL;
        case 5:
          return OBJECT;
        case 6:
          return LIST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ParameterType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ParameterType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ParameterType>() {
          public ParameterType findValueByNumber(int number) {
            return ParameterType.forNumber(number);
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
      return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ParameterType[] VALUES = values();

    public static ParameterType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ParameterType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of parameter.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of parameter.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Type of parameter.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
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
   * Type of parameter.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType getType() {
    com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType result =
        com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType.forNumber(type_);
    return result == null
        ? com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType.UNRECOGNIZED
        : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   *
   *
   * <pre>
   * Human-readable description of the parameter. Limited to 300 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human-readable description of the parameter. Limited to 300 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType
            .PARAMETER_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType
            .PARAMETER_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition other =
        (com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition) obj;

    if (!getName().equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (!getDescription().equals(other.getDescription())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition prototype) {
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
   * Defines the properties of a parameter.
   * Used to define parameters used in the agent and the
   * input / output parameters for each fulfillment.
   * (-- Next Id: 4 --)
   * (-- api-linter: core::0123::resource-annotation=disabled
   *     aip.dev/not-precedent: ParameterDefinition is not an exposed resource.
   *     --)
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ParameterDefinition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ParameterDefinition)
      com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.class,
              com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      type_ = 0;
      description_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinitionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition build() {
      com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition result =
          new com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                description_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of parameter.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of parameter.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of parameter.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of parameter.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of parameter.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of parameter.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
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
     * Type of parameter.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of parameter.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType getType() {
      com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType result =
          com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType.forNumber(type_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of parameter.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of parameter.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.ParameterDefinition.ParameterType type = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Human-readable description of the parameter. Limited to 300 characters.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable description of the parameter. Limited to 300 characters.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable description of the parameter. Limited to 300 characters.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable description of the parameter. Limited to 300 characters.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable description of the parameter. Limited to 300 characters.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ParameterDefinition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ParameterDefinition)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParameterDefinition> PARSER =
      new com.google.protobuf.AbstractParser<ParameterDefinition>() {
        @java.lang.Override
        public ParameterDefinition parsePartialFrom(
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

  public static com.google.protobuf.Parser<ParameterDefinition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParameterDefinition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ParameterDefinition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
