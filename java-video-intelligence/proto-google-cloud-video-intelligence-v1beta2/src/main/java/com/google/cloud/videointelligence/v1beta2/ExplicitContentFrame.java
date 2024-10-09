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
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1beta2;

/**
 *
 *
 * <pre>
 * Video frame level annotation results for explicit content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta2.ExplicitContentFrame}
 */
public final class ExplicitContentFrame extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta2.ExplicitContentFrame)
    ExplicitContentFrameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExplicitContentFrame.newBuilder() to construct.
  private ExplicitContentFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExplicitContentFrame() {
    pornographyLikelihood_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExplicitContentFrame();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_ExplicitContentFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_ExplicitContentFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.class,
            com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_OFFSET_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  @java.lang.Override
  public boolean hasTimeOffset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   *
   * @return The timeOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeOffset() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }

  public static final int PORNOGRAPHY_LIKELIHOOD_FIELD_NUMBER = 2;
  private int pornographyLikelihood_ = 0;
  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
   *
   * @return The enum numeric value on the wire for pornographyLikelihood.
   */
  @java.lang.Override
  public int getPornographyLikelihoodValue() {
    return pornographyLikelihood_;
  }
  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
   *
   * @return The pornographyLikelihood.
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta2.Likelihood getPornographyLikelihood() {
    com.google.cloud.videointelligence.v1beta2.Likelihood result =
        com.google.cloud.videointelligence.v1beta2.Likelihood.forNumber(pornographyLikelihood_);
    return result == null
        ? com.google.cloud.videointelligence.v1beta2.Likelihood.UNRECOGNIZED
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTimeOffset());
    }
    if (pornographyLikelihood_
        != com.google.cloud.videointelligence.v1beta2.Likelihood.LIKELIHOOD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, pornographyLikelihood_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeOffset());
    }
    if (pornographyLikelihood_
        != com.google.cloud.videointelligence.v1beta2.Likelihood.LIKELIHOOD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, pornographyLikelihood_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame other =
        (com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame) obj;

    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
    }
    if (pornographyLikelihood_ != other.pornographyLikelihood_) return false;
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
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (37 * hash) + PORNOGRAPHY_LIKELIHOOD_FIELD_NUMBER;
    hash = (53 * hash) + pornographyLikelihood_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame parseFrom(
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
      com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame prototype) {
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
   * Video frame level annotation results for explicit content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta2.ExplicitContentFrame}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta2.ExplicitContentFrame)
      com.google.cloud.videointelligence.v1beta2.ExplicitContentFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_ExplicitContentFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_ExplicitContentFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.class,
              com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTimeOffsetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      pornographyLikelihood_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_ExplicitContentFrame_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame build() {
      com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame buildPartial() {
      com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame result =
          new com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeOffset_ = timeOffsetBuilder_ == null ? timeOffset_ : timeOffsetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pornographyLikelihood_ = pornographyLikelihood_;
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
      if (other instanceof com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame other) {
      if (other
          == com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame.getDefaultInstance())
        return this;
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
      }
      if (other.pornographyLikelihood_ != 0) {
        setPornographyLikelihoodValue(other.getPornographyLikelihoodValue());
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
                input.readMessage(getTimeOffsetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                pornographyLikelihood_ = input.readEnum();
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

    private com.google.protobuf.Duration timeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     *
     * @return Whether the timeOffset field is set.
     */
    public boolean hasTimeOffset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     *
     * @return The timeOffset.
     */
    public com.google.protobuf.Duration getTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      } else {
        return timeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOffset_ = value;
      } else {
        timeOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && timeOffset_ != null
            && timeOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTimeOffsetBuilder().mergeFrom(value);
        } else {
          timeOffset_ = value;
        }
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }
      if (timeOffset_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public Builder clearTimeOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
      if (timeOffsetBuilder_ != null) {
        return timeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time-offset, relative to the beginning of the video, corresponding to the
     * video frame for this location.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeOffsetFieldBuilder() {
      if (timeOffsetBuilder_ == null) {
        timeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeOffset(), getParentForChildren(), isClean());
        timeOffset_ = null;
      }
      return timeOffsetBuilder_;
    }

    private int pornographyLikelihood_ = 0;
    /**
     *
     *
     * <pre>
     * Likelihood of the pornography content..
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
     *
     * @return The enum numeric value on the wire for pornographyLikelihood.
     */
    @java.lang.Override
    public int getPornographyLikelihoodValue() {
      return pornographyLikelihood_;
    }
    /**
     *
     *
     * <pre>
     * Likelihood of the pornography content..
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
     *
     * @param value The enum numeric value on the wire for pornographyLikelihood to set.
     * @return This builder for chaining.
     */
    public Builder setPornographyLikelihoodValue(int value) {
      pornographyLikelihood_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood of the pornography content..
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
     *
     * @return The pornographyLikelihood.
     */
    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.Likelihood getPornographyLikelihood() {
      com.google.cloud.videointelligence.v1beta2.Likelihood result =
          com.google.cloud.videointelligence.v1beta2.Likelihood.forNumber(pornographyLikelihood_);
      return result == null
          ? com.google.cloud.videointelligence.v1beta2.Likelihood.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Likelihood of the pornography content..
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
     *
     * @param value The pornographyLikelihood to set.
     * @return This builder for chaining.
     */
    public Builder setPornographyLikelihood(
        com.google.cloud.videointelligence.v1beta2.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      pornographyLikelihood_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood of the pornography content..
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1beta2.Likelihood pornography_likelihood = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPornographyLikelihood() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pornographyLikelihood_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta2.ExplicitContentFrame)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta2.ExplicitContentFrame)
  private static final com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame();
  }

  public static com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplicitContentFrame> PARSER =
      new com.google.protobuf.AbstractParser<ExplicitContentFrame>() {
        @java.lang.Override
        public ExplicitContentFrame parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExplicitContentFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplicitContentFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
