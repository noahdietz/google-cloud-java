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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Int64RangeMatch}
 */
public final class Int64RangeMatch extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Int64RangeMatch)
    Int64RangeMatchOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Int64RangeMatch.newBuilder() to construct.
  private Int64RangeMatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Int64RangeMatch() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Int64RangeMatch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Int64RangeMatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Int64RangeMatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Int64RangeMatch.class,
            com.google.cloud.compute.v1.Int64RangeMatch.Builder.class);
  }

  private int bitField0_;
  public static final int RANGE_END_FIELD_NUMBER = 322439897;
  private long rangeEnd_ = 0L;
  /**
   *
   *
   * <pre>
   * The end of the range (exclusive) in signed long integer format.
   * </pre>
   *
   * <code>optional int64 range_end = 322439897;</code>
   *
   * @return Whether the rangeEnd field is set.
   */
  @java.lang.Override
  public boolean hasRangeEnd() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The end of the range (exclusive) in signed long integer format.
   * </pre>
   *
   * <code>optional int64 range_end = 322439897;</code>
   *
   * @return The rangeEnd.
   */
  @java.lang.Override
  public long getRangeEnd() {
    return rangeEnd_;
  }

  public static final int RANGE_START_FIELD_NUMBER = 103333600;
  private long rangeStart_ = 0L;
  /**
   *
   *
   * <pre>
   * The start of the range (inclusive) in signed long integer format.
   * </pre>
   *
   * <code>optional int64 range_start = 103333600;</code>
   *
   * @return Whether the rangeStart field is set.
   */
  @java.lang.Override
  public boolean hasRangeStart() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The start of the range (inclusive) in signed long integer format.
   * </pre>
   *
   * <code>optional int64 range_start = 103333600;</code>
   *
   * @return The rangeStart.
   */
  @java.lang.Override
  public long getRangeStart() {
    return rangeStart_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(103333600, rangeStart_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(322439897, rangeEnd_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(103333600, rangeStart_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(322439897, rangeEnd_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Int64RangeMatch)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Int64RangeMatch other =
        (com.google.cloud.compute.v1.Int64RangeMatch) obj;

    if (hasRangeEnd() != other.hasRangeEnd()) return false;
    if (hasRangeEnd()) {
      if (getRangeEnd() != other.getRangeEnd()) return false;
    }
    if (hasRangeStart() != other.hasRangeStart()) return false;
    if (hasRangeStart()) {
      if (getRangeStart() != other.getRangeStart()) return false;
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
    if (hasRangeEnd()) {
      hash = (37 * hash) + RANGE_END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getRangeEnd());
    }
    if (hasRangeStart()) {
      hash = (37 * hash) + RANGE_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getRangeStart());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.Int64RangeMatch prototype) {
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
   * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Int64RangeMatch}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Int64RangeMatch)
      com.google.cloud.compute.v1.Int64RangeMatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Int64RangeMatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Int64RangeMatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Int64RangeMatch.class,
              com.google.cloud.compute.v1.Int64RangeMatch.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Int64RangeMatch.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rangeEnd_ = 0L;
      rangeStart_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Int64RangeMatch_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Int64RangeMatch getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Int64RangeMatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Int64RangeMatch build() {
      com.google.cloud.compute.v1.Int64RangeMatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Int64RangeMatch buildPartial() {
      com.google.cloud.compute.v1.Int64RangeMatch result =
          new com.google.cloud.compute.v1.Int64RangeMatch(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.Int64RangeMatch result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rangeEnd_ = rangeEnd_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rangeStart_ = rangeStart_;
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
      if (other instanceof com.google.cloud.compute.v1.Int64RangeMatch) {
        return mergeFrom((com.google.cloud.compute.v1.Int64RangeMatch) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Int64RangeMatch other) {
      if (other == com.google.cloud.compute.v1.Int64RangeMatch.getDefaultInstance()) return this;
      if (other.hasRangeEnd()) {
        setRangeEnd(other.getRangeEnd());
      }
      if (other.hasRangeStart()) {
        setRangeStart(other.getRangeStart());
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
            case 826668800:
              {
                rangeStart_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 826668800
            case -1715448120:
              {
                rangeEnd_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case -1715448120
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

    private long rangeEnd_;
    /**
     *
     *
     * <pre>
     * The end of the range (exclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_end = 322439897;</code>
     *
     * @return Whether the rangeEnd field is set.
     */
    @java.lang.Override
    public boolean hasRangeEnd() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The end of the range (exclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_end = 322439897;</code>
     *
     * @return The rangeEnd.
     */
    @java.lang.Override
    public long getRangeEnd() {
      return rangeEnd_;
    }
    /**
     *
     *
     * <pre>
     * The end of the range (exclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_end = 322439897;</code>
     *
     * @param value The rangeEnd to set.
     * @return This builder for chaining.
     */
    public Builder setRangeEnd(long value) {

      rangeEnd_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The end of the range (exclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_end = 322439897;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRangeEnd() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rangeEnd_ = 0L;
      onChanged();
      return this;
    }

    private long rangeStart_;
    /**
     *
     *
     * <pre>
     * The start of the range (inclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_start = 103333600;</code>
     *
     * @return Whether the rangeStart field is set.
     */
    @java.lang.Override
    public boolean hasRangeStart() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The start of the range (inclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_start = 103333600;</code>
     *
     * @return The rangeStart.
     */
    @java.lang.Override
    public long getRangeStart() {
      return rangeStart_;
    }
    /**
     *
     *
     * <pre>
     * The start of the range (inclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_start = 103333600;</code>
     *
     * @param value The rangeStart to set.
     * @return This builder for chaining.
     */
    public Builder setRangeStart(long value) {

      rangeStart_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start of the range (inclusive) in signed long integer format.
     * </pre>
     *
     * <code>optional int64 range_start = 103333600;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRangeStart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rangeStart_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Int64RangeMatch)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Int64RangeMatch)
  private static final com.google.cloud.compute.v1.Int64RangeMatch DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Int64RangeMatch();
  }

  public static com.google.cloud.compute.v1.Int64RangeMatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64RangeMatch> PARSER =
      new com.google.protobuf.AbstractParser<Int64RangeMatch>() {
        @java.lang.Override
        public Int64RangeMatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<Int64RangeMatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64RangeMatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Int64RangeMatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
