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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_object_tracking.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 * Protobuf type {@code
 * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs}
 */
public final class AutoMlVideoObjectTrackingInputs extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs)
    AutoMlVideoObjectTrackingInputsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoMlVideoObjectTrackingInputs.newBuilder() to construct.
  private AutoMlVideoObjectTrackingInputs(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoMlVideoObjectTrackingInputs() {
    modelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoMlVideoObjectTrackingInputs();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoObjectTrackingProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoObjectTrackingProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.class,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.Builder.class);
  }

  /**
   * Protobuf enum {@code
   * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType}
   */
  public enum ModelType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    MODEL_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * A model best tailored to be used within Google Cloud, and which c annot
     * be exported. Default.
     * </pre>
     *
     * <code>CLOUD = 1;</code>
     */
    CLOUD(1),
    /**
     *
     *
     * <pre>
     * A model that, in addition to being available within Google Cloud, can
     * also be exported (see ModelService.ExportModel) as a TensorFlow or
     * TensorFlow Lite model and used on a mobile or edge device afterwards.
     * </pre>
     *
     * <code>MOBILE_VERSATILE_1 = 2;</code>
     */
    MOBILE_VERSATILE_1(2),
    /**
     *
     *
     * <pre>
     * A versatile model that is meant to be exported (see
     * ModelService.ExportModel) and used on a Google Coral device.
     * </pre>
     *
     * <code>MOBILE_CORAL_VERSATILE_1 = 3;</code>
     */
    MOBILE_CORAL_VERSATILE_1(3),
    /**
     *
     *
     * <pre>
     * A model that trades off quality for low latency, to be exported (see
     * ModelService.ExportModel) and used on a Google Coral device.
     * </pre>
     *
     * <code>MOBILE_CORAL_LOW_LATENCY_1 = 4;</code>
     */
    MOBILE_CORAL_LOW_LATENCY_1(4),
    /**
     *
     *
     * <pre>
     * A versatile model that is meant to be exported (see
     * ModelService.ExportModel) and used on an NVIDIA Jetson device.
     * </pre>
     *
     * <code>MOBILE_JETSON_VERSATILE_1 = 5;</code>
     */
    MOBILE_JETSON_VERSATILE_1(5),
    /**
     *
     *
     * <pre>
     * A model that trades off quality for low latency, to be exported (see
     * ModelService.ExportModel) and used on an NVIDIA Jetson device.
     * </pre>
     *
     * <code>MOBILE_JETSON_LOW_LATENCY_1 = 6;</code>
     */
    MOBILE_JETSON_LOW_LATENCY_1(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MODEL_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * A model best tailored to be used within Google Cloud, and which c annot
     * be exported. Default.
     * </pre>
     *
     * <code>CLOUD = 1;</code>
     */
    public static final int CLOUD_VALUE = 1;
    /**
     *
     *
     * <pre>
     * A model that, in addition to being available within Google Cloud, can
     * also be exported (see ModelService.ExportModel) as a TensorFlow or
     * TensorFlow Lite model and used on a mobile or edge device afterwards.
     * </pre>
     *
     * <code>MOBILE_VERSATILE_1 = 2;</code>
     */
    public static final int MOBILE_VERSATILE_1_VALUE = 2;
    /**
     *
     *
     * <pre>
     * A versatile model that is meant to be exported (see
     * ModelService.ExportModel) and used on a Google Coral device.
     * </pre>
     *
     * <code>MOBILE_CORAL_VERSATILE_1 = 3;</code>
     */
    public static final int MOBILE_CORAL_VERSATILE_1_VALUE = 3;
    /**
     *
     *
     * <pre>
     * A model that trades off quality for low latency, to be exported (see
     * ModelService.ExportModel) and used on a Google Coral device.
     * </pre>
     *
     * <code>MOBILE_CORAL_LOW_LATENCY_1 = 4;</code>
     */
    public static final int MOBILE_CORAL_LOW_LATENCY_1_VALUE = 4;
    /**
     *
     *
     * <pre>
     * A versatile model that is meant to be exported (see
     * ModelService.ExportModel) and used on an NVIDIA Jetson device.
     * </pre>
     *
     * <code>MOBILE_JETSON_VERSATILE_1 = 5;</code>
     */
    public static final int MOBILE_JETSON_VERSATILE_1_VALUE = 5;
    /**
     *
     *
     * <pre>
     * A model that trades off quality for low latency, to be exported (see
     * ModelService.ExportModel) and used on an NVIDIA Jetson device.
     * </pre>
     *
     * <code>MOBILE_JETSON_LOW_LATENCY_1 = 6;</code>
     */
    public static final int MOBILE_JETSON_LOW_LATENCY_1_VALUE = 6;

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
    public static ModelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModelType forNumber(int value) {
      switch (value) {
        case 0:
          return MODEL_TYPE_UNSPECIFIED;
        case 1:
          return CLOUD;
        case 2:
          return MOBILE_VERSATILE_1;
        case 3:
          return MOBILE_CORAL_VERSATILE_1;
        case 4:
          return MOBILE_CORAL_LOW_LATENCY_1;
        case 5:
          return MOBILE_JETSON_VERSATILE_1;
        case 6:
          return MOBILE_JETSON_LOW_LATENCY_1;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModelType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ModelType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ModelType>() {
          public ModelType findValueByNumber(int number) {
            return ModelType.forNumber(number);
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
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ModelType[] VALUES = values();

    public static ModelType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ModelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType)
  }

  public static final int MODEL_TYPE_FIELD_NUMBER = 1;
  private int modelType_ = 0;
  /**
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for modelType.
   */
  @java.lang.Override
  public int getModelTypeValue() {
    return modelType_;
  }
  /**
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The modelType.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs.ModelType
      getModelType() {
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.ModelType
        result =
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.ModelType.forNumber(modelType_);
    return result == null
        ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.ModelType.UNRECOGNIZED
        : result;
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
    if (modelType_
        != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, modelType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modelType_
        != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, modelType_);
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        other =
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputs)
                obj;

    if (modelType_ != other.modelType_) return false;
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
    hash = (37 * hash) + MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + modelType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs
          prototype) {
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
   * Protobuf type {@code
   * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTrackingInputs.class,
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTrackingInputs.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      modelType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs
          result =
              new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTrackingInputs(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelType_ = modelType_;
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputs)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs
            other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs.getDefaultInstance()) return this;
      if (other.modelType_ != 0) {
        setModelTypeValue(other.getModelTypeValue());
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
                modelType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int modelType_ = 0;
    /**
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for modelType.
     */
    @java.lang.Override
    public int getModelTypeValue() {
      return modelType_;
    }
    /**
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelTypeValue(int value) {
      modelType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
     * </code>
     *
     * @return The modelType.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.ModelType
        getModelType() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs.ModelType
          result =
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTrackingInputs.ModelType.forNumber(modelType_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTrackingInputs.ModelType.UNRECOGNIZED
          : result;
    }
    /**
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
     * </code>
     *
     * @param value The modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelType(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.ModelType
            value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      modelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType model_type = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModelType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      modelType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlVideoObjectTrackingInputs> PARSER =
      new com.google.protobuf.AbstractParser<AutoMlVideoObjectTrackingInputs>() {
        @java.lang.Override
        public AutoMlVideoObjectTrackingInputs parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlVideoObjectTrackingInputs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlVideoObjectTrackingInputs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
