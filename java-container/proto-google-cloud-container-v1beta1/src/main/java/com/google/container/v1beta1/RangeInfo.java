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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * RangeInfo contains the range name and the range utilization by this cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.RangeInfo}
 */
public final class RangeInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.RangeInfo)
    RangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RangeInfo.newBuilder() to construct.
  private RangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RangeInfo() {
    rangeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RangeInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_RangeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_RangeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.RangeInfo.class,
            com.google.container.v1beta1.RangeInfo.Builder.class);
  }

  public static final int RANGE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rangeName_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Name of a range.
   * </pre>
   *
   * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rangeName.
   */
  @java.lang.Override
  public java.lang.String getRangeName() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rangeName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Name of a range.
   * </pre>
   *
   * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRangeNameBytes() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rangeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTILIZATION_FIELD_NUMBER = 2;
  private double utilization_ = 0D;
  /**
   *
   *
   * <pre>
   * Output only. The utilization of the range.
   * </pre>
   *
   * <code>double utilization = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The utilization.
   */
  @java.lang.Override
  public double getUtilization() {
    return utilization_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rangeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rangeName_);
    }
    if (java.lang.Double.doubleToRawLongBits(utilization_) != 0) {
      output.writeDouble(2, utilization_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rangeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rangeName_);
    }
    if (java.lang.Double.doubleToRawLongBits(utilization_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, utilization_);
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
    if (!(obj instanceof com.google.container.v1beta1.RangeInfo)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.RangeInfo other = (com.google.container.v1beta1.RangeInfo) obj;

    if (!getRangeName().equals(other.getRangeName())) return false;
    if (java.lang.Double.doubleToLongBits(getUtilization())
        != java.lang.Double.doubleToLongBits(other.getUtilization())) return false;
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
    hash = (37 * hash) + RANGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRangeName().hashCode();
    hash = (37 * hash) + UTILIZATION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getUtilization()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.RangeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RangeInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RangeInfo parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.RangeInfo prototype) {
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
   * RangeInfo contains the range name and the range utilization by this cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.RangeInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.RangeInfo)
      com.google.container.v1beta1.RangeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.RangeInfo.class,
              com.google.container.v1beta1.RangeInfo.Builder.class);
    }

    // Construct using com.google.container.v1beta1.RangeInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rangeName_ = "";
      utilization_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RangeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.RangeInfo getDefaultInstanceForType() {
      return com.google.container.v1beta1.RangeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.RangeInfo build() {
      com.google.container.v1beta1.RangeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.RangeInfo buildPartial() {
      com.google.container.v1beta1.RangeInfo result =
          new com.google.container.v1beta1.RangeInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.RangeInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rangeName_ = rangeName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.utilization_ = utilization_;
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
      if (other instanceof com.google.container.v1beta1.RangeInfo) {
        return mergeFrom((com.google.container.v1beta1.RangeInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.RangeInfo other) {
      if (other == com.google.container.v1beta1.RangeInfo.getDefaultInstance()) return this;
      if (!other.getRangeName().isEmpty()) {
        rangeName_ = other.rangeName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUtilization() != 0D) {
        setUtilization(other.getUtilization());
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
                rangeName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 17:
              {
                utilization_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private java.lang.Object rangeName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Name of a range.
     * </pre>
     *
     * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The rangeName.
     */
    public java.lang.String getRangeName() {
      java.lang.Object ref = rangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Name of a range.
     * </pre>
     *
     * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for rangeName.
     */
    public com.google.protobuf.ByteString getRangeNameBytes() {
      java.lang.Object ref = rangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Name of a range.
     * </pre>
     *
     * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rangeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Name of a range.
     * </pre>
     *
     * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRangeName() {
      rangeName_ = getDefaultInstance().getRangeName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Name of a range.
     * </pre>
     *
     * <code>string range_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rangeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double utilization_;
    /**
     *
     *
     * <pre>
     * Output only. The utilization of the range.
     * </pre>
     *
     * <code>double utilization = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The utilization.
     */
    @java.lang.Override
    public double getUtilization() {
      return utilization_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The utilization of the range.
     * </pre>
     *
     * <code>double utilization = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The utilization to set.
     * @return This builder for chaining.
     */
    public Builder setUtilization(double value) {

      utilization_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The utilization of the range.
     * </pre>
     *
     * <code>double utilization = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUtilization() {
      bitField0_ = (bitField0_ & ~0x00000002);
      utilization_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.RangeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.RangeInfo)
  private static final com.google.container.v1beta1.RangeInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.RangeInfo();
  }

  public static com.google.container.v1beta1.RangeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeInfo> PARSER =
      new com.google.protobuf.AbstractParser<RangeInfo>() {
        @java.lang.Override
        public RangeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RangeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.RangeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
