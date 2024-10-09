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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Input for fluency metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.FluencyInput}
 */
public final class FluencyInput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.FluencyInput)
    FluencyInputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FluencyInput.newBuilder() to construct.
  private FluencyInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FluencyInput() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FluencyInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_FluencyInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_FluencyInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.FluencyInput.class,
            com.google.cloud.aiplatform.v1beta1.FluencyInput.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.FluencySpec metricSpec_;
  /**
   *
   *
   * <pre>
   * Required. Spec for fluency score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricSpec field is set.
   */
  @java.lang.Override
  public boolean hasMetricSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Spec for fluency score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricSpec.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FluencySpec getMetricSpec() {
    return metricSpec_ == null
        ? com.google.cloud.aiplatform.v1beta1.FluencySpec.getDefaultInstance()
        : metricSpec_;
  }
  /**
   *
   *
   * <pre>
   * Required. Spec for fluency score metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FluencySpecOrBuilder getMetricSpecOrBuilder() {
    return metricSpec_ == null
        ? com.google.cloud.aiplatform.v1beta1.FluencySpec.getDefaultInstance()
        : metricSpec_;
  }

  public static final int INSTANCE_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.FluencyInstance instance_;
  /**
   *
   *
   * <pre>
   * Required. Fluency instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instance field is set.
   */
  @java.lang.Override
  public boolean hasInstance() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Fluency instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instance.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FluencyInstance getInstance() {
    return instance_ == null
        ? com.google.cloud.aiplatform.v1beta1.FluencyInstance.getDefaultInstance()
        : instance_;
  }
  /**
   *
   *
   * <pre>
   * Required. Fluency instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FluencyInstanceOrBuilder getInstanceOrBuilder() {
    return instance_ == null
        ? com.google.cloud.aiplatform.v1beta1.FluencyInstance.getDefaultInstance()
        : instance_;
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
      output.writeMessage(1, getMetricSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getInstance());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetricSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInstance());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.FluencyInput)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.FluencyInput other =
        (com.google.cloud.aiplatform.v1beta1.FluencyInput) obj;

    if (hasMetricSpec() != other.hasMetricSpec()) return false;
    if (hasMetricSpec()) {
      if (!getMetricSpec().equals(other.getMetricSpec())) return false;
    }
    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance().equals(other.getInstance())) return false;
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
    if (hasMetricSpec()) {
      hash = (37 * hash) + METRIC_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getMetricSpec().hashCode();
    }
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.FluencyInput prototype) {
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
   * Input for fluency metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.FluencyInput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.FluencyInput)
      com.google.cloud.aiplatform.v1beta1.FluencyInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_FluencyInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_FluencyInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.FluencyInput.class,
              com.google.cloud.aiplatform.v1beta1.FluencyInput.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.FluencyInput.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetricSpecFieldBuilder();
        getInstanceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metricSpec_ = null;
      if (metricSpecBuilder_ != null) {
        metricSpecBuilder_.dispose();
        metricSpecBuilder_ = null;
      }
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_FluencyInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FluencyInput getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.FluencyInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FluencyInput build() {
      com.google.cloud.aiplatform.v1beta1.FluencyInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FluencyInput buildPartial() {
      com.google.cloud.aiplatform.v1beta1.FluencyInput result =
          new com.google.cloud.aiplatform.v1beta1.FluencyInput(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.FluencyInput result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricSpec_ = metricSpecBuilder_ == null ? metricSpec_ : metricSpecBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instance_ = instanceBuilder_ == null ? instance_ : instanceBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.FluencyInput) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.FluencyInput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.FluencyInput other) {
      if (other == com.google.cloud.aiplatform.v1beta1.FluencyInput.getDefaultInstance())
        return this;
      if (other.hasMetricSpec()) {
        mergeMetricSpec(other.getMetricSpec());
      }
      if (other.hasInstance()) {
        mergeInstance(other.getInstance());
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
                input.readMessage(getMetricSpecFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getInstanceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.aiplatform.v1beta1.FluencySpec metricSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FluencySpec,
            com.google.cloud.aiplatform.v1beta1.FluencySpec.Builder,
            com.google.cloud.aiplatform.v1beta1.FluencySpecOrBuilder>
        metricSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metricSpec field is set.
     */
    public boolean hasMetricSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metricSpec.
     */
    public com.google.cloud.aiplatform.v1beta1.FluencySpec getMetricSpec() {
      if (metricSpecBuilder_ == null) {
        return metricSpec_ == null
            ? com.google.cloud.aiplatform.v1beta1.FluencySpec.getDefaultInstance()
            : metricSpec_;
      } else {
        return metricSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetricSpec(com.google.cloud.aiplatform.v1beta1.FluencySpec value) {
      if (metricSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricSpec_ = value;
      } else {
        metricSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetricSpec(
        com.google.cloud.aiplatform.v1beta1.FluencySpec.Builder builderForValue) {
      if (metricSpecBuilder_ == null) {
        metricSpec_ = builderForValue.build();
      } else {
        metricSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetricSpec(com.google.cloud.aiplatform.v1beta1.FluencySpec value) {
      if (metricSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && metricSpec_ != null
            && metricSpec_
                != com.google.cloud.aiplatform.v1beta1.FluencySpec.getDefaultInstance()) {
          getMetricSpecBuilder().mergeFrom(value);
        } else {
          metricSpec_ = value;
        }
      } else {
        metricSpecBuilder_.mergeFrom(value);
      }
      if (metricSpec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetricSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricSpec_ = null;
      if (metricSpecBuilder_ != null) {
        metricSpecBuilder_.dispose();
        metricSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FluencySpec.Builder getMetricSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetricSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FluencySpecOrBuilder getMetricSpecOrBuilder() {
      if (metricSpecBuilder_ != null) {
        return metricSpecBuilder_.getMessageOrBuilder();
      } else {
        return metricSpec_ == null
            ? com.google.cloud.aiplatform.v1beta1.FluencySpec.getDefaultInstance()
            : metricSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Spec for fluency score metric.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FluencySpec,
            com.google.cloud.aiplatform.v1beta1.FluencySpec.Builder,
            com.google.cloud.aiplatform.v1beta1.FluencySpecOrBuilder>
        getMetricSpecFieldBuilder() {
      if (metricSpecBuilder_ == null) {
        metricSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.FluencySpec,
                com.google.cloud.aiplatform.v1beta1.FluencySpec.Builder,
                com.google.cloud.aiplatform.v1beta1.FluencySpecOrBuilder>(
                getMetricSpec(), getParentForChildren(), isClean());
        metricSpec_ = null;
      }
      return metricSpecBuilder_;
    }

    private com.google.cloud.aiplatform.v1beta1.FluencyInstance instance_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FluencyInstance,
            com.google.cloud.aiplatform.v1beta1.FluencyInstance.Builder,
            com.google.cloud.aiplatform.v1beta1.FluencyInstanceOrBuilder>
        instanceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the instance field is set.
     */
    public boolean hasInstance() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The instance.
     */
    public com.google.cloud.aiplatform.v1beta1.FluencyInstance getInstance() {
      if (instanceBuilder_ == null) {
        return instance_ == null
            ? com.google.cloud.aiplatform.v1beta1.FluencyInstance.getDefaultInstance()
            : instance_;
      } else {
        return instanceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInstance(com.google.cloud.aiplatform.v1beta1.FluencyInstance value) {
      if (instanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instance_ = value;
      } else {
        instanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInstance(
        com.google.cloud.aiplatform.v1beta1.FluencyInstance.Builder builderForValue) {
      if (instanceBuilder_ == null) {
        instance_ = builderForValue.build();
      } else {
        instanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeInstance(com.google.cloud.aiplatform.v1beta1.FluencyInstance value) {
      if (instanceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && instance_ != null
            && instance_
                != com.google.cloud.aiplatform.v1beta1.FluencyInstance.getDefaultInstance()) {
          getInstanceBuilder().mergeFrom(value);
        } else {
          instance_ = value;
        }
      } else {
        instanceBuilder_.mergeFrom(value);
      }
      if (instance_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearInstance() {
      bitField0_ = (bitField0_ & ~0x00000002);
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FluencyInstance.Builder getInstanceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInstanceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FluencyInstanceOrBuilder getInstanceOrBuilder() {
      if (instanceBuilder_ != null) {
        return instanceBuilder_.getMessageOrBuilder();
      } else {
        return instance_ == null
            ? com.google.cloud.aiplatform.v1beta1.FluencyInstance.getDefaultInstance()
            : instance_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Fluency instance.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FluencyInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FluencyInstance,
            com.google.cloud.aiplatform.v1beta1.FluencyInstance.Builder,
            com.google.cloud.aiplatform.v1beta1.FluencyInstanceOrBuilder>
        getInstanceFieldBuilder() {
      if (instanceBuilder_ == null) {
        instanceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.FluencyInstance,
                com.google.cloud.aiplatform.v1beta1.FluencyInstance.Builder,
                com.google.cloud.aiplatform.v1beta1.FluencyInstanceOrBuilder>(
                getInstance(), getParentForChildren(), isClean());
        instance_ = null;
      }
      return instanceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.FluencyInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.FluencyInput)
  private static final com.google.cloud.aiplatform.v1beta1.FluencyInput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.FluencyInput();
  }

  public static com.google.cloud.aiplatform.v1beta1.FluencyInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FluencyInput> PARSER =
      new com.google.protobuf.AbstractParser<FluencyInput>() {
        @java.lang.Override
        public FluencyInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<FluencyInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FluencyInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FluencyInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
