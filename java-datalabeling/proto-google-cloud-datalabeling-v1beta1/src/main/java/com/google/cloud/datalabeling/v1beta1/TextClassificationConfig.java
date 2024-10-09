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
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Config for text classification human labeling task.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.TextClassificationConfig}
 */
public final class TextClassificationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.TextClassificationConfig)
    TextClassificationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextClassificationConfig.newBuilder() to construct.
  private TextClassificationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextClassificationConfig() {
    annotationSpecSet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextClassificationConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.class,
            com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ALLOW_MULTI_LABEL_FIELD_NUMBER = 1;
  private boolean allowMultiLabel_ = false;
  /**
   *
   *
   * <pre>
   * Optional. If allow_multi_label is true, contributors are able to choose
   * multiple labels for one text segment.
   * </pre>
   *
   * <code>bool allow_multi_label = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMultiLabel.
   */
  @java.lang.Override
  public boolean getAllowMultiLabel() {
    return allowMultiLabel_;
  }

  public static final int ANNOTATION_SPEC_SET_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object annotationSpecSet_ = "";
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The annotationSpecSet.
   */
  @java.lang.Override
  public java.lang.String getAnnotationSpecSet() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationSpecSet_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for annotationSpecSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      annotationSpecSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENTIMENT_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.datalabeling.v1beta1.SentimentConfig sentimentConfig_;
  /**
   *
   *
   * <pre>
   * Optional. Configs for sentiment selection.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sentimentConfig field is set.
   */
  @java.lang.Override
  public boolean hasSentimentConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Configs for sentiment selection.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sentimentConfig.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.SentimentConfig getSentimentConfig() {
    return sentimentConfig_ == null
        ? com.google.cloud.datalabeling.v1beta1.SentimentConfig.getDefaultInstance()
        : sentimentConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Configs for sentiment selection.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.SentimentConfigOrBuilder
      getSentimentConfigOrBuilder() {
    return sentimentConfig_ == null
        ? com.google.cloud.datalabeling.v1beta1.SentimentConfig.getDefaultInstance()
        : sentimentConfig_;
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
    if (allowMultiLabel_ != false) {
      output.writeBool(1, allowMultiLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, annotationSpecSet_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSentimentConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowMultiLabel_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, allowMultiLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, annotationSpecSet_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSentimentConfig());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.TextClassificationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.TextClassificationConfig other =
        (com.google.cloud.datalabeling.v1beta1.TextClassificationConfig) obj;

    if (getAllowMultiLabel() != other.getAllowMultiLabel()) return false;
    if (!getAnnotationSpecSet().equals(other.getAnnotationSpecSet())) return false;
    if (hasSentimentConfig() != other.hasSentimentConfig()) return false;
    if (hasSentimentConfig()) {
      if (!getSentimentConfig().equals(other.getSentimentConfig())) return false;
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
    hash = (37 * hash) + ALLOW_MULTI_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowMultiLabel());
    hash = (37 * hash) + ANNOTATION_SPEC_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecSet().hashCode();
    if (hasSentimentConfig()) {
      hash = (37 * hash) + SENTIMENT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSentimentConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.TextClassificationConfig prototype) {
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
   * Config for text classification human labeling task.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.TextClassificationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.TextClassificationConfig)
      com.google.cloud.datalabeling.v1beta1.TextClassificationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.class,
              com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSentimentConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      allowMultiLabel_ = false;
      annotationSpecSet_ = "";
      sentimentConfig_ = null;
      if (sentimentConfigBuilder_ != null) {
        sentimentConfigBuilder_.dispose();
        sentimentConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextClassificationConfig
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextClassificationConfig build() {
      com.google.cloud.datalabeling.v1beta1.TextClassificationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextClassificationConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.TextClassificationConfig result =
          new com.google.cloud.datalabeling.v1beta1.TextClassificationConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.TextClassificationConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowMultiLabel_ = allowMultiLabel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.annotationSpecSet_ = annotationSpecSet_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sentimentConfig_ =
            sentimentConfigBuilder_ == null ? sentimentConfig_ : sentimentConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.TextClassificationConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.TextClassificationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.TextClassificationConfig other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.TextClassificationConfig.getDefaultInstance())
        return this;
      if (other.getAllowMultiLabel() != false) {
        setAllowMultiLabel(other.getAllowMultiLabel());
      }
      if (!other.getAnnotationSpecSet().isEmpty()) {
        annotationSpecSet_ = other.annotationSpecSet_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSentimentConfig()) {
        mergeSentimentConfig(other.getSentimentConfig());
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
                allowMultiLabel_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                annotationSpecSet_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getSentimentConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private boolean allowMultiLabel_;
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one text segment.
     * </pre>
     *
     * <code>bool allow_multi_label = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The allowMultiLabel.
     */
    @java.lang.Override
    public boolean getAllowMultiLabel() {
      return allowMultiLabel_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one text segment.
     * </pre>
     *
     * <code>bool allow_multi_label = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The allowMultiLabel to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMultiLabel(boolean value) {

      allowMultiLabel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one text segment.
     * </pre>
     *
     * <code>bool allow_multi_label = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowMultiLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowMultiLabel_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object annotationSpecSet_ = "";
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The annotationSpecSet.
     */
    public java.lang.String getAnnotationSpecSet() {
      java.lang.Object ref = annotationSpecSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationSpecSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for annotationSpecSet.
     */
    public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
      java.lang.Object ref = annotationSpecSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        annotationSpecSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSet(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      annotationSpecSet_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecSet() {
      annotationSpecSet_ = getDefaultInstance().getAnnotationSpecSet();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      annotationSpecSet_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.datalabeling.v1beta1.SentimentConfig sentimentConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.SentimentConfig,
            com.google.cloud.datalabeling.v1beta1.SentimentConfig.Builder,
            com.google.cloud.datalabeling.v1beta1.SentimentConfigOrBuilder>
        sentimentConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the sentimentConfig field is set.
     */
    public boolean hasSentimentConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sentimentConfig.
     */
    public com.google.cloud.datalabeling.v1beta1.SentimentConfig getSentimentConfig() {
      if (sentimentConfigBuilder_ == null) {
        return sentimentConfig_ == null
            ? com.google.cloud.datalabeling.v1beta1.SentimentConfig.getDefaultInstance()
            : sentimentConfig_;
      } else {
        return sentimentConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSentimentConfig(com.google.cloud.datalabeling.v1beta1.SentimentConfig value) {
      if (sentimentConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentimentConfig_ = value;
      } else {
        sentimentConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSentimentConfig(
        com.google.cloud.datalabeling.v1beta1.SentimentConfig.Builder builderForValue) {
      if (sentimentConfigBuilder_ == null) {
        sentimentConfig_ = builderForValue.build();
      } else {
        sentimentConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeSentimentConfig(
        com.google.cloud.datalabeling.v1beta1.SentimentConfig value) {
      if (sentimentConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && sentimentConfig_ != null
            && sentimentConfig_
                != com.google.cloud.datalabeling.v1beta1.SentimentConfig.getDefaultInstance()) {
          getSentimentConfigBuilder().mergeFrom(value);
        } else {
          sentimentConfig_ = value;
        }
      } else {
        sentimentConfigBuilder_.mergeFrom(value);
      }
      if (sentimentConfig_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearSentimentConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sentimentConfig_ = null;
      if (sentimentConfigBuilder_ != null) {
        sentimentConfigBuilder_.dispose();
        sentimentConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.SentimentConfig.Builder
        getSentimentConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSentimentConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.SentimentConfigOrBuilder
        getSentimentConfigOrBuilder() {
      if (sentimentConfigBuilder_ != null) {
        return sentimentConfigBuilder_.getMessageOrBuilder();
      } else {
        return sentimentConfig_ == null
            ? com.google.cloud.datalabeling.v1beta1.SentimentConfig.getDefaultInstance()
            : sentimentConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configs for sentiment selection.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.SentimentConfig sentiment_config = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.SentimentConfig,
            com.google.cloud.datalabeling.v1beta1.SentimentConfig.Builder,
            com.google.cloud.datalabeling.v1beta1.SentimentConfigOrBuilder>
        getSentimentConfigFieldBuilder() {
      if (sentimentConfigBuilder_ == null) {
        sentimentConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.SentimentConfig,
                com.google.cloud.datalabeling.v1beta1.SentimentConfig.Builder,
                com.google.cloud.datalabeling.v1beta1.SentimentConfigOrBuilder>(
                getSentimentConfig(), getParentForChildren(), isClean());
        sentimentConfig_ = null;
      }
      return sentimentConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.TextClassificationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.TextClassificationConfig)
  private static final com.google.cloud.datalabeling.v1beta1.TextClassificationConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.TextClassificationConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.TextClassificationConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextClassificationConfig> PARSER =
      new com.google.protobuf.AbstractParser<TextClassificationConfig>() {
        @java.lang.Override
        public TextClassificationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextClassificationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextClassificationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.TextClassificationConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
