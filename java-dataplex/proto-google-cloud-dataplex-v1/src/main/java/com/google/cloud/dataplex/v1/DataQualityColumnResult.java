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
// source: google/cloud/dataplex/v1/data_quality.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * DataQualityColumnResult provides a more detailed, per-column view of
 * the results.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.DataQualityColumnResult}
 */
public final class DataQualityColumnResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.DataQualityColumnResult)
    DataQualityColumnResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataQualityColumnResult.newBuilder() to construct.
  private DataQualityColumnResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataQualityColumnResult() {
    column_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataQualityColumnResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.DataQualityProto
        .internal_static_google_cloud_dataplex_v1_DataQualityColumnResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataQualityProto
        .internal_static_google_cloud_dataplex_v1_DataQualityColumnResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.DataQualityColumnResult.class,
            com.google.cloud.dataplex.v1.DataQualityColumnResult.Builder.class);
  }

  private int bitField0_;
  public static final int COLUMN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object column_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The column specified in the DataQualityRule.
   * </pre>
   *
   * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The column.
   */
  @java.lang.Override
  public java.lang.String getColumn() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      column_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The column specified in the DataQualityRule.
   * </pre>
   *
   * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for column.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColumnBytes() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      column_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private float score_ = 0F;
  /**
   *
   *
   * <pre>
   * Output only. The column-level data quality score for this data scan job if
   * and only if the 'column' field is set.
   *
   * The score ranges between between [0, 100] (up to two decimal
   * points).
   * </pre>
   *
   * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the score field is set.
   */
  @java.lang.Override
  public boolean hasScore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. The column-level data quality score for this data scan job if
   * and only if the 'column' field is set.
   *
   * The score ranges between between [0, 100] (up to two decimal
   * points).
   * </pre>
   *
   * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(column_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, column_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeFloat(2, score_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(column_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, column_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, score_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.DataQualityColumnResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.DataQualityColumnResult other =
        (com.google.cloud.dataplex.v1.DataQualityColumnResult) obj;

    if (!getColumn().equals(other.getColumn())) return false;
    if (hasScore() != other.hasScore()) return false;
    if (hasScore()) {
      if (java.lang.Float.floatToIntBits(getScore())
          != java.lang.Float.floatToIntBits(other.getScore())) return false;
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
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn().hashCode();
    if (hasScore()) {
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.DataQualityColumnResult prototype) {
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
   * DataQualityColumnResult provides a more detailed, per-column view of
   * the results.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.DataQualityColumnResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.DataQualityColumnResult)
      com.google.cloud.dataplex.v1.DataQualityColumnResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualityColumnResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualityColumnResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.DataQualityColumnResult.class,
              com.google.cloud.dataplex.v1.DataQualityColumnResult.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.DataQualityColumnResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      column_ = "";
      score_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualityColumnResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualityColumnResult getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.DataQualityColumnResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualityColumnResult build() {
      com.google.cloud.dataplex.v1.DataQualityColumnResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualityColumnResult buildPartial() {
      com.google.cloud.dataplex.v1.DataQualityColumnResult result =
          new com.google.cloud.dataplex.v1.DataQualityColumnResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.DataQualityColumnResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.column_ = column_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.score_ = score_;
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
      if (other instanceof com.google.cloud.dataplex.v1.DataQualityColumnResult) {
        return mergeFrom((com.google.cloud.dataplex.v1.DataQualityColumnResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.DataQualityColumnResult other) {
      if (other == com.google.cloud.dataplex.v1.DataQualityColumnResult.getDefaultInstance())
        return this;
      if (!other.getColumn().isEmpty()) {
        column_ = other.column_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasScore()) {
        setScore(other.getScore());
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
                column_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 21:
              {
                score_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
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

    private java.lang.Object column_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The column specified in the DataQualityRule.
     * </pre>
     *
     * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The column.
     */
    public java.lang.String getColumn() {
      java.lang.Object ref = column_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        column_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The column specified in the DataQualityRule.
     * </pre>
     *
     * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for column.
     */
    public com.google.protobuf.ByteString getColumnBytes() {
      java.lang.Object ref = column_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        column_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The column specified in the DataQualityRule.
     * </pre>
     *
     * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      column_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The column specified in the DataQualityRule.
     * </pre>
     *
     * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      column_ = getDefaultInstance().getColumn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The column specified in the DataQualityRule.
     * </pre>
     *
     * <code>string column = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for column to set.
     * @return This builder for chaining.
     */
    public Builder setColumnBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      column_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Output only. The column-level data quality score for this data scan job if
     * and only if the 'column' field is set.
     *
     * The score ranges between between [0, 100] (up to two decimal
     * points).
     * </pre>
     *
     * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the score field is set.
     */
    @java.lang.Override
    public boolean hasScore() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The column-level data quality score for this data scan job if
     * and only if the 'column' field is set.
     *
     * The score ranges between between [0, 100] (up to two decimal
     * points).
     * </pre>
     *
     * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The column-level data quality score for this data scan job if
     * and only if the 'column' field is set.
     *
     * The score ranges between between [0, 100] (up to two decimal
     * points).
     * </pre>
     *
     * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The column-level data quality score for this data scan job if
     * and only if the 'column' field is set.
     *
     * The score ranges between between [0, 100] (up to two decimal
     * points).
     * </pre>
     *
     * <code>optional float score = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      score_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.DataQualityColumnResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.DataQualityColumnResult)
  private static final com.google.cloud.dataplex.v1.DataQualityColumnResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.DataQualityColumnResult();
  }

  public static com.google.cloud.dataplex.v1.DataQualityColumnResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataQualityColumnResult> PARSER =
      new com.google.protobuf.AbstractParser<DataQualityColumnResult>() {
        @java.lang.Override
        public DataQualityColumnResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataQualityColumnResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataQualityColumnResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataQualityColumnResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
