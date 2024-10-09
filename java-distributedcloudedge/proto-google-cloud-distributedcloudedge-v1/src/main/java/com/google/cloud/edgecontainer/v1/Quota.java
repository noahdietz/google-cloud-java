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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.edgecontainer.v1;

/**
 *
 *
 * <pre>
 * Represents quota for Edge Container resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgecontainer.v1.Quota}
 */
public final class Quota extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgecontainer.v1.Quota)
    QuotaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Quota.newBuilder() to construct.
  private Quota(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Quota() {
    metric_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Quota();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_Quota_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_Quota_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgecontainer.v1.Quota.class,
            com.google.cloud.edgecontainer.v1.Quota.Builder.class);
  }

  public static final int METRIC_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object metric_ = "";
  /**
   *
   *
   * <pre>
   * Name of the quota metric.
   * </pre>
   *
   * <code>string metric = 1;</code>
   *
   * @return The metric.
   */
  @java.lang.Override
  public java.lang.String getMetric() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metric_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the quota metric.
   * </pre>
   *
   * <code>string metric = 1;</code>
   *
   * @return The bytes for metric.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetricBytes() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metric_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private double limit_ = 0D;
  /**
   *
   *
   * <pre>
   * Quota limit for this metric.
   * </pre>
   *
   * <code>double limit = 2;</code>
   *
   * @return The limit.
   */
  @java.lang.Override
  public double getLimit() {
    return limit_;
  }

  public static final int USAGE_FIELD_NUMBER = 3;
  private double usage_ = 0D;
  /**
   *
   *
   * <pre>
   * Current usage of this metric.
   * </pre>
   *
   * <code>double usage = 3;</code>
   *
   * @return The usage.
   */
  @java.lang.Override
  public double getUsage() {
    return usage_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metric_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metric_);
    }
    if (java.lang.Double.doubleToRawLongBits(limit_) != 0) {
      output.writeDouble(2, limit_);
    }
    if (java.lang.Double.doubleToRawLongBits(usage_) != 0) {
      output.writeDouble(3, usage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metric_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metric_);
    }
    if (java.lang.Double.doubleToRawLongBits(limit_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, limit_);
    }
    if (java.lang.Double.doubleToRawLongBits(usage_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, usage_);
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
    if (!(obj instanceof com.google.cloud.edgecontainer.v1.Quota)) {
      return super.equals(obj);
    }
    com.google.cloud.edgecontainer.v1.Quota other = (com.google.cloud.edgecontainer.v1.Quota) obj;

    if (!getMetric().equals(other.getMetric())) return false;
    if (java.lang.Double.doubleToLongBits(getLimit())
        != java.lang.Double.doubleToLongBits(other.getLimit())) return false;
    if (java.lang.Double.doubleToLongBits(getUsage())
        != java.lang.Double.doubleToLongBits(other.getUsage())) return false;
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
    hash = (37 * hash) + METRIC_FIELD_NUMBER;
    hash = (53 * hash) + getMetric().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getLimit()));
    hash = (37 * hash) + USAGE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getUsage()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.Quota parseFrom(
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

  public static Builder newBuilder(com.google.cloud.edgecontainer.v1.Quota prototype) {
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
   * Represents quota for Edge Container resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgecontainer.v1.Quota}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgecontainer.v1.Quota)
      com.google.cloud.edgecontainer.v1.QuotaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Quota_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Quota_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgecontainer.v1.Quota.class,
              com.google.cloud.edgecontainer.v1.Quota.Builder.class);
    }

    // Construct using com.google.cloud.edgecontainer.v1.Quota.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metric_ = "";
      limit_ = 0D;
      usage_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_Quota_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Quota getDefaultInstanceForType() {
      return com.google.cloud.edgecontainer.v1.Quota.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Quota build() {
      com.google.cloud.edgecontainer.v1.Quota result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.Quota buildPartial() {
      com.google.cloud.edgecontainer.v1.Quota result =
          new com.google.cloud.edgecontainer.v1.Quota(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.edgecontainer.v1.Quota result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metric_ = metric_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.usage_ = usage_;
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
      if (other instanceof com.google.cloud.edgecontainer.v1.Quota) {
        return mergeFrom((com.google.cloud.edgecontainer.v1.Quota) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.edgecontainer.v1.Quota other) {
      if (other == com.google.cloud.edgecontainer.v1.Quota.getDefaultInstance()) return this;
      if (!other.getMetric().isEmpty()) {
        metric_ = other.metric_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getLimit() != 0D) {
        setLimit(other.getLimit());
      }
      if (other.getUsage() != 0D) {
        setUsage(other.getUsage());
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
                metric_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 17:
              {
                limit_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 25:
              {
                usage_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
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

    private java.lang.Object metric_ = "";
    /**
     *
     *
     * <pre>
     * Name of the quota metric.
     * </pre>
     *
     * <code>string metric = 1;</code>
     *
     * @return The metric.
     */
    public java.lang.String getMetric() {
      java.lang.Object ref = metric_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metric_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the quota metric.
     * </pre>
     *
     * <code>string metric = 1;</code>
     *
     * @return The bytes for metric.
     */
    public com.google.protobuf.ByteString getMetricBytes() {
      java.lang.Object ref = metric_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metric_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the quota metric.
     * </pre>
     *
     * <code>string metric = 1;</code>
     *
     * @param value The metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetric(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      metric_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the quota metric.
     * </pre>
     *
     * <code>string metric = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetric() {
      metric_ = getDefaultInstance().getMetric();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the quota metric.
     * </pre>
     *
     * <code>string metric = 1;</code>
     *
     * @param value The bytes for metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetricBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      metric_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double limit_;
    /**
     *
     *
     * <pre>
     * Quota limit for this metric.
     * </pre>
     *
     * <code>double limit = 2;</code>
     *
     * @return The limit.
     */
    @java.lang.Override
    public double getLimit() {
      return limit_;
    }
    /**
     *
     *
     * <pre>
     * Quota limit for this metric.
     * </pre>
     *
     * <code>double limit = 2;</code>
     *
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(double value) {

      limit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Quota limit for this metric.
     * </pre>
     *
     * <code>double limit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0D;
      onChanged();
      return this;
    }

    private double usage_;
    /**
     *
     *
     * <pre>
     * Current usage of this metric.
     * </pre>
     *
     * <code>double usage = 3;</code>
     *
     * @return The usage.
     */
    @java.lang.Override
    public double getUsage() {
      return usage_;
    }
    /**
     *
     *
     * <pre>
     * Current usage of this metric.
     * </pre>
     *
     * <code>double usage = 3;</code>
     *
     * @param value The usage to set.
     * @return This builder for chaining.
     */
    public Builder setUsage(double value) {

      usage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Current usage of this metric.
     * </pre>
     *
     * <code>double usage = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      usage_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.edgecontainer.v1.Quota)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgecontainer.v1.Quota)
  private static final com.google.cloud.edgecontainer.v1.Quota DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgecontainer.v1.Quota();
  }

  public static com.google.cloud.edgecontainer.v1.Quota getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Quota> PARSER =
      new com.google.protobuf.AbstractParser<Quota>() {
        @java.lang.Override
        public Quota parsePartialFrom(
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

  public static com.google.protobuf.Parser<Quota> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Quota> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.Quota getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
