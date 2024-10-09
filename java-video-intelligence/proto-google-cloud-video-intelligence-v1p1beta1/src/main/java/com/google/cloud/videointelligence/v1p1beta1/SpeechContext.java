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
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1p1beta1;

/**
 *
 *
 * <pre>
 * Provides "hints" to the speech recognizer to favor specific words and phrases
 * in the results.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.SpeechContext}
 */
public final class SpeechContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.SpeechContext)
    SpeechContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeechContext.newBuilder() to construct.
  private SpeechContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeechContext() {
    phrases_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpeechContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p1beta1_SpeechContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p1beta1_SpeechContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.SpeechContext.class,
            com.google.cloud.videointelligence.v1p1beta1.SpeechContext.Builder.class);
  }

  public static final int PHRASES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList phrases_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the phrases.
   */
  public com.google.protobuf.ProtocolStringList getPhrasesList() {
    return phrases_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of phrases.
   */
  public int getPhrasesCount() {
    return phrases_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The phrases at the given index.
   */
  public java.lang.String getPhrases(int index) {
    return phrases_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the phrases at the given index.
   */
  public com.google.protobuf.ByteString getPhrasesBytes(int index) {
    return phrases_.getByteString(index);
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
    for (int i = 0; i < phrases_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phrases_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < phrases_.size(); i++) {
        dataSize += computeStringSizeNoTag(phrases_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPhrasesList().size();
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.SpeechContext)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.SpeechContext other =
        (com.google.cloud.videointelligence.v1p1beta1.SpeechContext) obj;

    if (!getPhrasesList().equals(other.getPhrasesList())) return false;
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
    if (getPhrasesCount() > 0) {
      hash = (37 * hash) + PHRASES_FIELD_NUMBER;
      hash = (53 * hash) + getPhrasesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext parseFrom(
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
      com.google.cloud.videointelligence.v1p1beta1.SpeechContext prototype) {
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
   * Provides "hints" to the speech recognizer to favor specific words and phrases
   * in the results.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.SpeechContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.SpeechContext)
      com.google.cloud.videointelligence.v1p1beta1.SpeechContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_SpeechContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_SpeechContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.SpeechContext.class,
              com.google.cloud.videointelligence.v1p1beta1.SpeechContext.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p1beta1.SpeechContext.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      phrases_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p1beta1_SpeechContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechContext getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.SpeechContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechContext build() {
      com.google.cloud.videointelligence.v1p1beta1.SpeechContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechContext buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.SpeechContext result =
          new com.google.cloud.videointelligence.v1p1beta1.SpeechContext(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1p1beta1.SpeechContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        phrases_.makeImmutable();
        result.phrases_ = phrases_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.SpeechContext) {
        return mergeFrom((com.google.cloud.videointelligence.v1p1beta1.SpeechContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p1beta1.SpeechContext other) {
      if (other == com.google.cloud.videointelligence.v1p1beta1.SpeechContext.getDefaultInstance())
        return this;
      if (!other.phrases_.isEmpty()) {
        if (phrases_.isEmpty()) {
          phrases_ = other.phrases_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePhrasesIsMutable();
          phrases_.addAll(other.phrases_);
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePhrasesIsMutable();
                phrases_.add(s);
                break;
              } // case 10
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

    private com.google.protobuf.LazyStringArrayList phrases_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePhrasesIsMutable() {
      if (!phrases_.isModifiable()) {
        phrases_ = new com.google.protobuf.LazyStringArrayList(phrases_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the phrases.
     */
    public com.google.protobuf.ProtocolStringList getPhrasesList() {
      phrases_.makeImmutable();
      return phrases_;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of phrases.
     */
    public int getPhrasesCount() {
      return phrases_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The phrases at the given index.
     */
    public java.lang.String getPhrases(int index) {
      return phrases_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the phrases at the given index.
     */
    public com.google.protobuf.ByteString getPhrasesBytes(int index) {
      return phrases_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The phrases to set.
     * @return This builder for chaining.
     */
    public Builder setPhrases(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhrasesIsMutable();
      phrases_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The phrases to add.
     * @return This builder for chaining.
     */
    public Builder addPhrases(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhrasesIsMutable();
      phrases_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The phrases to add.
     * @return This builder for chaining.
     */
    public Builder addAllPhrases(java.lang.Iterable<java.lang.String> values) {
      ensurePhrasesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, phrases_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPhrases() {
      phrases_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the phrases to add.
     * @return This builder for chaining.
     */
    public Builder addPhrasesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePhrasesIsMutable();
      phrases_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.SpeechContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.SpeechContext)
  private static final com.google.cloud.videointelligence.v1p1beta1.SpeechContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.SpeechContext();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechContext> PARSER =
      new com.google.protobuf.AbstractParser<SpeechContext>() {
        @java.lang.Override
        public SpeechContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeechContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p1beta1.SpeechContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
