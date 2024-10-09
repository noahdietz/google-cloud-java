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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.texttospeech.v1beta1;

/**
 *
 *
 * <pre>
 * Description of a voice supported by the TTS service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1beta1.Voice}
 */
public final class Voice extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1beta1.Voice)
    VoiceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Voice.newBuilder() to construct.
  private Voice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Voice() {
    languageCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
    name_ = "";
    ssmlGender_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Voice();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1beta1.Voice.class,
            com.google.cloud.texttospeech.v1beta1.Voice.Builder.class);
  }

  public static final int LANGUAGE_CODES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList languageCodes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   *
   * @return A list containing the languageCodes.
   */
  public com.google.protobuf.ProtocolStringList getLanguageCodesList() {
    return languageCodes_;
  }
  /**
   *
   *
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   *
   * @return The count of languageCodes.
   */
  public int getLanguageCodesCount() {
    return languageCodes_.size();
  }
  /**
   *
   *
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  public java.lang.String getLanguageCodes(int index) {
    return languageCodes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The languages that this voice supports, expressed as
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
   * "en-US", "es-419", "cmn-tw").
   * </pre>
   *
   * <code>repeated string language_codes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  public com.google.protobuf.ByteString getLanguageCodesBytes(int index) {
    return languageCodes_.getByteString(index);
  }

  public static final int NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The name of this voice.  Each distinct voice has a unique name.
   * </pre>
   *
   * <code>string name = 2;</code>
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
   * The name of this voice.  Each distinct voice has a unique name.
   * </pre>
   *
   * <code>string name = 2;</code>
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

  public static final int SSML_GENDER_FIELD_NUMBER = 3;
  private int ssmlGender_ = 0;
  /**
   *
   *
   * <pre>
   * The gender of this voice.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
   *
   * @return The enum numeric value on the wire for ssmlGender.
   */
  @java.lang.Override
  public int getSsmlGenderValue() {
    return ssmlGender_;
  }
  /**
   *
   *
   * <pre>
   * The gender of this voice.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
   *
   * @return The ssmlGender.
   */
  @java.lang.Override
  public com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender getSsmlGender() {
    com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender result =
        com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.forNumber(ssmlGender_);
    return result == null
        ? com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.UNRECOGNIZED
        : result;
  }

  public static final int NATURAL_SAMPLE_RATE_HERTZ_FIELD_NUMBER = 4;
  private int naturalSampleRateHertz_ = 0;
  /**
   *
   *
   * <pre>
   * The natural sample rate (in hertz) for this voice.
   * </pre>
   *
   * <code>int32 natural_sample_rate_hertz = 4;</code>
   *
   * @return The naturalSampleRateHertz.
   */
  @java.lang.Override
  public int getNaturalSampleRateHertz() {
    return naturalSampleRateHertz_;
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
    for (int i = 0; i < languageCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageCodes_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (ssmlGender_
        != com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, ssmlGender_);
    }
    if (naturalSampleRateHertz_ != 0) {
      output.writeInt32(4, naturalSampleRateHertz_);
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
      for (int i = 0; i < languageCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(languageCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLanguageCodesList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (ssmlGender_
        != com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, ssmlGender_);
    }
    if (naturalSampleRateHertz_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, naturalSampleRateHertz_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1beta1.Voice)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1beta1.Voice other =
        (com.google.cloud.texttospeech.v1beta1.Voice) obj;

    if (!getLanguageCodesList().equals(other.getLanguageCodesList())) return false;
    if (!getName().equals(other.getName())) return false;
    if (ssmlGender_ != other.ssmlGender_) return false;
    if (getNaturalSampleRateHertz() != other.getNaturalSampleRateHertz()) return false;
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
    if (getLanguageCodesCount() > 0) {
      hash = (37 * hash) + LANGUAGE_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getLanguageCodesList().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SSML_GENDER_FIELD_NUMBER;
    hash = (53 * hash) + ssmlGender_;
    hash = (37 * hash) + NATURAL_SAMPLE_RATE_HERTZ_FIELD_NUMBER;
    hash = (53 * hash) + getNaturalSampleRateHertz();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice parseFrom(
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

  public static Builder newBuilder(com.google.cloud.texttospeech.v1beta1.Voice prototype) {
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
   * Description of a voice supported by the TTS service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1beta1.Voice}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1beta1.Voice)
      com.google.cloud.texttospeech.v1beta1.VoiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1beta1.Voice.class,
              com.google.cloud.texttospeech.v1beta1.Voice.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1beta1.Voice.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      languageCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      name_ = "";
      ssmlGender_ = 0;
      naturalSampleRateHertz_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Voice getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1beta1.Voice.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Voice build() {
      com.google.cloud.texttospeech.v1beta1.Voice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Voice buildPartial() {
      com.google.cloud.texttospeech.v1beta1.Voice result =
          new com.google.cloud.texttospeech.v1beta1.Voice(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.texttospeech.v1beta1.Voice result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        languageCodes_.makeImmutable();
        result.languageCodes_ = languageCodes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ssmlGender_ = ssmlGender_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.naturalSampleRateHertz_ = naturalSampleRateHertz_;
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
      if (other instanceof com.google.cloud.texttospeech.v1beta1.Voice) {
        return mergeFrom((com.google.cloud.texttospeech.v1beta1.Voice) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1beta1.Voice other) {
      if (other == com.google.cloud.texttospeech.v1beta1.Voice.getDefaultInstance()) return this;
      if (!other.languageCodes_.isEmpty()) {
        if (languageCodes_.isEmpty()) {
          languageCodes_ = other.languageCodes_;
          bitField0_ |= 0x00000001;
        } else {
          ensureLanguageCodesIsMutable();
          languageCodes_.addAll(other.languageCodes_);
        }
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.ssmlGender_ != 0) {
        setSsmlGenderValue(other.getSsmlGenderValue());
      }
      if (other.getNaturalSampleRateHertz() != 0) {
        setNaturalSampleRateHertz(other.getNaturalSampleRateHertz());
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
                ensureLanguageCodesIsMutable();
                languageCodes_.add(s);
                break;
              } // case 10
            case 18:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                ssmlGender_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                naturalSampleRateHertz_ = input.readInt32();
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

    private com.google.protobuf.LazyStringArrayList languageCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureLanguageCodesIsMutable() {
      if (!languageCodes_.isModifiable()) {
        languageCodes_ = new com.google.protobuf.LazyStringArrayList(languageCodes_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @return A list containing the languageCodes.
     */
    public com.google.protobuf.ProtocolStringList getLanguageCodesList() {
      languageCodes_.makeImmutable();
      return languageCodes_;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @return The count of languageCodes.
     */
    public int getLanguageCodesCount() {
      return languageCodes_.size();
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The languageCodes at the given index.
     */
    public java.lang.String getLanguageCodes(int index) {
      return languageCodes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the languageCodes at the given index.
     */
    public com.google.protobuf.ByteString getLanguageCodesBytes(int index) {
      return languageCodes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The languageCodes to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLanguageCodesIsMutable();
      languageCodes_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param value The languageCodes to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageCodes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLanguageCodesIsMutable();
      languageCodes_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param values The languageCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllLanguageCodes(java.lang.Iterable<java.lang.String> values) {
      ensureLanguageCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, languageCodes_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguageCodes() {
      languageCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The languages that this voice supports, expressed as
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g.
     * "en-US", "es-419", "cmn-tw").
     * </pre>
     *
     * <code>repeated string language_codes = 1;</code>
     *
     * @param value The bytes of the languageCodes to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageCodesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureLanguageCodesIsMutable();
      languageCodes_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of this voice.  Each distinct voice has a unique name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
     * The name of this voice.  Each distinct voice has a unique name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
     * The name of this voice.  Each distinct voice has a unique name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of this voice.  Each distinct voice has a unique name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of this voice.  Each distinct voice has a unique name.
     * </pre>
     *
     * <code>string name = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int ssmlGender_ = 0;
    /**
     *
     *
     * <pre>
     * The gender of this voice.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
     *
     * @return The enum numeric value on the wire for ssmlGender.
     */
    @java.lang.Override
    public int getSsmlGenderValue() {
      return ssmlGender_;
    }
    /**
     *
     *
     * <pre>
     * The gender of this voice.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
     *
     * @param value The enum numeric value on the wire for ssmlGender to set.
     * @return This builder for chaining.
     */
    public Builder setSsmlGenderValue(int value) {
      ssmlGender_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The gender of this voice.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
     *
     * @return The ssmlGender.
     */
    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender getSsmlGender() {
      com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender result =
          com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.forNumber(ssmlGender_);
      return result == null
          ? com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The gender of this voice.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
     *
     * @param value The ssmlGender to set.
     * @return This builder for chaining.
     */
    public Builder setSsmlGender(com.google.cloud.texttospeech.v1beta1.SsmlVoiceGender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      ssmlGender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The gender of this voice.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.SsmlVoiceGender ssml_gender = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSsmlGender() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ssmlGender_ = 0;
      onChanged();
      return this;
    }

    private int naturalSampleRateHertz_;
    /**
     *
     *
     * <pre>
     * The natural sample rate (in hertz) for this voice.
     * </pre>
     *
     * <code>int32 natural_sample_rate_hertz = 4;</code>
     *
     * @return The naturalSampleRateHertz.
     */
    @java.lang.Override
    public int getNaturalSampleRateHertz() {
      return naturalSampleRateHertz_;
    }
    /**
     *
     *
     * <pre>
     * The natural sample rate (in hertz) for this voice.
     * </pre>
     *
     * <code>int32 natural_sample_rate_hertz = 4;</code>
     *
     * @param value The naturalSampleRateHertz to set.
     * @return This builder for chaining.
     */
    public Builder setNaturalSampleRateHertz(int value) {

      naturalSampleRateHertz_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The natural sample rate (in hertz) for this voice.
     * </pre>
     *
     * <code>int32 natural_sample_rate_hertz = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNaturalSampleRateHertz() {
      bitField0_ = (bitField0_ & ~0x00000008);
      naturalSampleRateHertz_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1beta1.Voice)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1beta1.Voice)
  private static final com.google.cloud.texttospeech.v1beta1.Voice DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1beta1.Voice();
  }

  public static com.google.cloud.texttospeech.v1beta1.Voice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Voice> PARSER =
      new com.google.protobuf.AbstractParser<Voice>() {
        @java.lang.Override
        public Voice parsePartialFrom(
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

  public static com.google.protobuf.Parser<Voice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Voice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1beta1.Voice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
