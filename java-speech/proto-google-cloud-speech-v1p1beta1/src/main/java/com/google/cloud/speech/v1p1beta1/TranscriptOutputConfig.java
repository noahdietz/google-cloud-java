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
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.speech.v1p1beta1;

/**
 *
 *
 * <pre>
 * Specifies an optional destination for the recognition results.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.TranscriptOutputConfig}
 */
public final class TranscriptOutputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.TranscriptOutputConfig)
    TranscriptOutputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TranscriptOutputConfig.newBuilder() to construct.
  private TranscriptOutputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TranscriptOutputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TranscriptOutputConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_TranscriptOutputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto
        .internal_static_google_cloud_speech_v1p1beta1_TranscriptOutputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.class,
            com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.Builder.class);
  }

  private int outputTypeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object outputType_;

  public enum OutputTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_URI(1),
    OUTPUTTYPE_NOT_SET(0);
    private final int value;

    private OutputTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OutputTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static OutputTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_URI;
        case 0:
          return OUTPUTTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OutputTypeCase getOutputTypeCase() {
    return OutputTypeCase.forNumber(outputTypeCase_);
  }

  public static final int GCS_URI_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return Whether the gcsUri field is set.
   */
  public boolean hasGcsUri() {
    return outputTypeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The gcsUri.
   */
  public java.lang.String getGcsUri() {
    java.lang.Object ref = "";
    if (outputTypeCase_ == 1) {
      ref = outputType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (outputTypeCase_ == 1) {
        outputType_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies a Cloud Storage URI for the recognition results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The bytes for gcsUri.
   */
  public com.google.protobuf.ByteString getGcsUriBytes() {
    java.lang.Object ref = "";
    if (outputTypeCase_ == 1) {
      ref = outputType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (outputTypeCase_ == 1) {
        outputType_ = b;
      }
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
    if (outputTypeCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (outputTypeCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputType_);
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
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig other =
        (com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig) obj;

    if (!getOutputTypeCase().equals(other.getOutputTypeCase())) return false;
    switch (outputTypeCase_) {
      case 1:
        if (!getGcsUri().equals(other.getGcsUri())) return false;
        break;
      case 0:
      default:
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
    switch (outputTypeCase_) {
      case 1:
        hash = (37 * hash) + GCS_URI_FIELD_NUMBER;
        hash = (53 * hash) + getGcsUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig parseFrom(
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
      com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig prototype) {
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
   * Specifies an optional destination for the recognition results.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.TranscriptOutputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.TranscriptOutputConfig)
      com.google.cloud.speech.v1p1beta1.TranscriptOutputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_TranscriptOutputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_TranscriptOutputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.class,
              com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      outputTypeCase_ = 0;
      outputType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto
          .internal_static_google_cloud_speech_v1p1beta1_TranscriptOutputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig build() {
      com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig buildPartial() {
      com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig result =
          new com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig result) {
      result.outputTypeCase_ = outputTypeCase_;
      result.outputType_ = this.outputType_;
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig other) {
      if (other == com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig.getDefaultInstance())
        return this;
      switch (other.getOutputTypeCase()) {
        case GCS_URI:
          {
            outputTypeCase_ = 1;
            outputType_ = other.outputType_;
            onChanged();
            break;
          }
        case OUTPUTTYPE_NOT_SET:
          {
            break;
          }
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
                outputTypeCase_ = 1;
                outputType_ = s;
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

    private int outputTypeCase_ = 0;
    private java.lang.Object outputType_;

    public OutputTypeCase getOutputTypeCase() {
      return OutputTypeCase.forNumber(outputTypeCase_);
    }

    public Builder clearOutputType() {
      outputTypeCase_ = 0;
      outputType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return Whether the gcsUri field is set.
     */
    @java.lang.Override
    public boolean hasGcsUri() {
      return outputTypeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return The gcsUri.
     */
    @java.lang.Override
    public java.lang.String getGcsUri() {
      java.lang.Object ref = "";
      if (outputTypeCase_ == 1) {
        ref = outputType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (outputTypeCase_ == 1) {
          outputType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return The bytes for gcsUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getGcsUriBytes() {
      java.lang.Object ref = "";
      if (outputTypeCase_ == 1) {
        ref = outputType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (outputTypeCase_ == 1) {
          outputType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @param value The gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      outputTypeCase_ = 1;
      outputType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsUri() {
      if (outputTypeCase_ == 1) {
        outputTypeCase_ = 0;
        outputType_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a Cloud Storage URI for the recognition results. Must be
     * specified in the format: `gs://bucket_name/object_name`, and the bucket
     * must already exist.
     * </pre>
     *
     * <code>string gcs_uri = 1;</code>
     *
     * @param value The bytes for gcsUri to set.
     * @return This builder for chaining.
     */
    public Builder setGcsUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      outputTypeCase_ = 1;
      outputType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.TranscriptOutputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.TranscriptOutputConfig)
  private static final com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig();
  }

  public static com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranscriptOutputConfig> PARSER =
      new com.google.protobuf.AbstractParser<TranscriptOutputConfig>() {
        @java.lang.Override
        public TranscriptOutputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TranscriptOutputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranscriptOutputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
