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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * A generic insight about an asset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.GenericInsight}
 */
public final class GenericInsight extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.GenericInsight)
    GenericInsightOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenericInsight.newBuilder() to construct.
  private GenericInsight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenericInsight() {
    defaultMessage_ = "";
    additionalInformation_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenericInsight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_GenericInsight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_GenericInsight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.GenericInsight.class,
            com.google.cloud.migrationcenter.v1.GenericInsight.Builder.class);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 1;
  private long messageId_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. Represents a globally unique message id for
   * this insight, can be used for localization purposes, in case message_code
   * is not yet known by the client use default_message instead.
   * </pre>
   *
   * <code>int64 message_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The messageId.
   */
  @java.lang.Override
  public long getMessageId() {
    return messageId_;
  }

  public static final int DEFAULT_MESSAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultMessage_ = "";
  /**
   *
   *
   * <pre>
   * Output only. In case message_code is not yet known by the client
   * default_message will be the message to be used instead.
   * </pre>
   *
   * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The defaultMessage.
   */
  @java.lang.Override
  public java.lang.String getDefaultMessage() {
    java.lang.Object ref = defaultMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. In case message_code is not yet known by the client
   * default_message will be the message to be used instead.
   * </pre>
   *
   * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for defaultMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDefaultMessageBytes() {
    java.lang.Object ref = defaultMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      defaultMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITIONAL_INFORMATION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList additionalInformation_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the additionalInformation.
   */
  public com.google.protobuf.ProtocolStringList getAdditionalInformationList() {
    return additionalInformation_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of additionalInformation.
   */
  public int getAdditionalInformationCount() {
    return additionalInformation_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The additionalInformation at the given index.
   */
  public java.lang.String getAdditionalInformation(int index) {
    return additionalInformation_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the insight, each entry can be a
   * logical entry and must make sense if it is displayed with line breaks
   * between each entry. Text can contain md style links.
   * </pre>
   *
   * <code>repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalInformation at the given index.
   */
  public com.google.protobuf.ByteString getAdditionalInformationBytes(int index) {
    return additionalInformation_.getByteString(index);
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
    if (messageId_ != 0L) {
      output.writeInt64(1, messageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultMessage_);
    }
    for (int i = 0; i < additionalInformation_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 3, additionalInformation_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, messageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultMessage_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < additionalInformation_.size(); i++) {
        dataSize += computeStringSizeNoTag(additionalInformation_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdditionalInformationList().size();
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.GenericInsight)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.GenericInsight other =
        (com.google.cloud.migrationcenter.v1.GenericInsight) obj;

    if (getMessageId() != other.getMessageId()) return false;
    if (!getDefaultMessage().equals(other.getDefaultMessage())) return false;
    if (!getAdditionalInformationList().equals(other.getAdditionalInformationList())) return false;
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
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMessageId());
    hash = (37 * hash) + DEFAULT_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultMessage().hashCode();
    if (getAdditionalInformationCount() > 0) {
      hash = (37 * hash) + ADDITIONAL_INFORMATION_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalInformationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight parseFrom(
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

  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.GenericInsight prototype) {
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
   * A generic insight about an asset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.GenericInsight}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.GenericInsight)
      com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_GenericInsight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_GenericInsight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.GenericInsight.class,
              com.google.cloud.migrationcenter.v1.GenericInsight.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.GenericInsight.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      messageId_ = 0L;
      defaultMessage_ = "";
      additionalInformation_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_GenericInsight_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.GenericInsight getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.GenericInsight build() {
      com.google.cloud.migrationcenter.v1.GenericInsight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.GenericInsight buildPartial() {
      com.google.cloud.migrationcenter.v1.GenericInsight result =
          new com.google.cloud.migrationcenter.v1.GenericInsight(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.GenericInsight result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.messageId_ = messageId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultMessage_ = defaultMessage_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        additionalInformation_.makeImmutable();
        result.additionalInformation_ = additionalInformation_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.GenericInsight) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.GenericInsight) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.GenericInsight other) {
      if (other == com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance())
        return this;
      if (other.getMessageId() != 0L) {
        setMessageId(other.getMessageId());
      }
      if (!other.getDefaultMessage().isEmpty()) {
        defaultMessage_ = other.defaultMessage_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.additionalInformation_.isEmpty()) {
        if (additionalInformation_.isEmpty()) {
          additionalInformation_ = other.additionalInformation_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAdditionalInformationIsMutable();
          additionalInformation_.addAll(other.additionalInformation_);
        }
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
                messageId_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                defaultMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAdditionalInformationIsMutable();
                additionalInformation_.add(s);
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

    private long messageId_;
    /**
     *
     *
     * <pre>
     * Output only. Represents a globally unique message id for
     * this insight, can be used for localization purposes, in case message_code
     * is not yet known by the client use default_message instead.
     * </pre>
     *
     * <code>int64 message_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The messageId.
     */
    @java.lang.Override
    public long getMessageId() {
      return messageId_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Represents a globally unique message id for
     * this insight, can be used for localization purposes, in case message_code
     * is not yet known by the client use default_message instead.
     * </pre>
     *
     * <code>int64 message_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageId(long value) {

      messageId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Represents a globally unique message id for
     * this insight, can be used for localization purposes, in case message_code
     * is not yet known by the client use default_message instead.
     * </pre>
     *
     * <code>int64 message_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessageId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      messageId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object defaultMessage_ = "";
    /**
     *
     *
     * <pre>
     * Output only. In case message_code is not yet known by the client
     * default_message will be the message to be used instead.
     * </pre>
     *
     * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The defaultMessage.
     */
    public java.lang.String getDefaultMessage() {
      java.lang.Object ref = defaultMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. In case message_code is not yet known by the client
     * default_message will be the message to be used instead.
     * </pre>
     *
     * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for defaultMessage.
     */
    public com.google.protobuf.ByteString getDefaultMessageBytes() {
      java.lang.Object ref = defaultMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        defaultMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. In case message_code is not yet known by the client
     * default_message will be the message to be used instead.
     * </pre>
     *
     * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The defaultMessage to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      defaultMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. In case message_code is not yet known by the client
     * default_message will be the message to be used instead.
     * </pre>
     *
     * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultMessage() {
      defaultMessage_ = getDefaultInstance().getDefaultMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. In case message_code is not yet known by the client
     * default_message will be the message to be used instead.
     * </pre>
     *
     * <code>string default_message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for defaultMessage to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      defaultMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList additionalInformation_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAdditionalInformationIsMutable() {
      if (!additionalInformation_.isModifiable()) {
        additionalInformation_ =
            new com.google.protobuf.LazyStringArrayList(additionalInformation_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the additionalInformation.
     */
    public com.google.protobuf.ProtocolStringList getAdditionalInformationList() {
      additionalInformation_.makeImmutable();
      return additionalInformation_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The count of additionalInformation.
     */
    public int getAdditionalInformationCount() {
      return additionalInformation_.size();
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The additionalInformation at the given index.
     */
    public java.lang.String getAdditionalInformation(int index) {
      return additionalInformation_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the additionalInformation at the given index.
     */
    public com.google.protobuf.ByteString getAdditionalInformationBytes(int index) {
      return additionalInformation_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The additionalInformation to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalInformation(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAdditionalInformationIsMutable();
      additionalInformation_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The additionalInformation to add.
     * @return This builder for chaining.
     */
    public Builder addAdditionalInformation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAdditionalInformationIsMutable();
      additionalInformation_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The additionalInformation to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdditionalInformation(java.lang.Iterable<java.lang.String> values) {
      ensureAdditionalInformationIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, additionalInformation_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdditionalInformation() {
      additionalInformation_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Additional information about the insight, each entry can be a
     * logical entry and must make sense if it is displayed with line breaks
     * between each entry. Text can contain md style links.
     * </pre>
     *
     * <code>
     * repeated string additional_information = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The bytes of the additionalInformation to add.
     * @return This builder for chaining.
     */
    public Builder addAdditionalInformationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAdditionalInformationIsMutable();
      additionalInformation_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.GenericInsight)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.GenericInsight)
  private static final com.google.cloud.migrationcenter.v1.GenericInsight DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.GenericInsight();
  }

  public static com.google.cloud.migrationcenter.v1.GenericInsight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenericInsight> PARSER =
      new com.google.protobuf.AbstractParser<GenericInsight>() {
        @java.lang.Override
        public GenericInsight parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenericInsight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenericInsight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.GenericInsight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
