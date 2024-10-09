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
// source: google/cloud/automl/v1/text_sentiment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Contains annotation details specific to text sentiment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.TextSentimentAnnotation}
 */
public final class TextSentimentAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.TextSentimentAnnotation)
    TextSentimentAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextSentimentAnnotation.newBuilder() to construct.
  private TextSentimentAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextSentimentAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextSentimentAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.TextSentimentProto
        .internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.TextSentimentProto
        .internal_static_google_cloud_automl_v1_TextSentimentAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.TextSentimentAnnotation.class,
            com.google.cloud.automl.v1.TextSentimentAnnotation.Builder.class);
  }

  public static final int SENTIMENT_FIELD_NUMBER = 1;
  private int sentiment_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. The sentiment with the semantic, as given to the
   * [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData] when populating the dataset from which the model used
   * for the prediction had been trained.
   * The sentiment values are between 0 and
   * Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
   * with higher value meaning more positive sentiment. They are completely
   * relative, i.e. 0 means least positive sentiment and sentiment_max means
   * the most positive from the sentiments present in the train data. Therefore
   *  e.g. if train data had only negative sentiment, then sentiment_max, would
   * be still negative (although least negative).
   * The sentiment shouldn't be confused with "score" or "magnitude"
   * from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>int32 sentiment = 1;</code>
   *
   * @return The sentiment.
   */
  @java.lang.Override
  public int getSentiment() {
    return sentiment_;
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
    if (sentiment_ != 0) {
      output.writeInt32(1, sentiment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sentiment_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, sentiment_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.TextSentimentAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.TextSentimentAnnotation other =
        (com.google.cloud.automl.v1.TextSentimentAnnotation) obj;

    if (getSentiment() != other.getSentiment()) return false;
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
    hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
    hash = (53 * hash) + getSentiment();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.TextSentimentAnnotation prototype) {
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
   * Contains annotation details specific to text sentiment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.TextSentimentAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.TextSentimentAnnotation)
      com.google.cloud.automl.v1.TextSentimentAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.TextSentimentProto
          .internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.TextSentimentProto
          .internal_static_google_cloud_automl_v1_TextSentimentAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.TextSentimentAnnotation.class,
              com.google.cloud.automl.v1.TextSentimentAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.TextSentimentAnnotation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sentiment_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.TextSentimentProto
          .internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextSentimentAnnotation getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.TextSentimentAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextSentimentAnnotation build() {
      com.google.cloud.automl.v1.TextSentimentAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextSentimentAnnotation buildPartial() {
      com.google.cloud.automl.v1.TextSentimentAnnotation result =
          new com.google.cloud.automl.v1.TextSentimentAnnotation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1.TextSentimentAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sentiment_ = sentiment_;
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
      if (other instanceof com.google.cloud.automl.v1.TextSentimentAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1.TextSentimentAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.TextSentimentAnnotation other) {
      if (other == com.google.cloud.automl.v1.TextSentimentAnnotation.getDefaultInstance())
        return this;
      if (other.getSentiment() != 0) {
        setSentiment(other.getSentiment());
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
                sentiment_ = input.readInt32();
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

    private int sentiment_;
    /**
     *
     *
     * <pre>
     * Output only. The sentiment with the semantic, as given to the
     * [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData] when populating the dataset from which the model used
     * for the prediction had been trained.
     * The sentiment values are between 0 and
     * Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
     * with higher value meaning more positive sentiment. They are completely
     * relative, i.e. 0 means least positive sentiment and sentiment_max means
     * the most positive from the sentiments present in the train data. Therefore
     *  e.g. if train data had only negative sentiment, then sentiment_max, would
     * be still negative (although least negative).
     * The sentiment shouldn't be confused with "score" or "magnitude"
     * from the previous Natural Language Sentiment Analysis API.
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     *
     * @return The sentiment.
     */
    @java.lang.Override
    public int getSentiment() {
      return sentiment_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The sentiment with the semantic, as given to the
     * [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData] when populating the dataset from which the model used
     * for the prediction had been trained.
     * The sentiment values are between 0 and
     * Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
     * with higher value meaning more positive sentiment. They are completely
     * relative, i.e. 0 means least positive sentiment and sentiment_max means
     * the most positive from the sentiments present in the train data. Therefore
     *  e.g. if train data had only negative sentiment, then sentiment_max, would
     * be still negative (although least negative).
     * The sentiment shouldn't be confused with "score" or "magnitude"
     * from the previous Natural Language Sentiment Analysis API.
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     *
     * @param value The sentiment to set.
     * @return This builder for chaining.
     */
    public Builder setSentiment(int value) {

      sentiment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The sentiment with the semantic, as given to the
     * [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData] when populating the dataset from which the model used
     * for the prediction had been trained.
     * The sentiment values are between 0 and
     * Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
     * with higher value meaning more positive sentiment. They are completely
     * relative, i.e. 0 means least positive sentiment and sentiment_max means
     * the most positive from the sentiments present in the train data. Therefore
     *  e.g. if train data had only negative sentiment, then sentiment_max, would
     * be still negative (although least negative).
     * The sentiment shouldn't be confused with "score" or "magnitude"
     * from the previous Natural Language Sentiment Analysis API.
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSentiment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sentiment_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.TextSentimentAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextSentimentAnnotation)
  private static final com.google.cloud.automl.v1.TextSentimentAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.TextSentimentAnnotation();
  }

  public static com.google.cloud.automl.v1.TextSentimentAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextSentimentAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<TextSentimentAnnotation>() {
        @java.lang.Override
        public TextSentimentAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextSentimentAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextSentimentAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.TextSentimentAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
