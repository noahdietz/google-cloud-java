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
 * Network usage sample. Values are across all network interfaces.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.NetworkUsageSample}
 */
public final class NetworkUsageSample extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.NetworkUsageSample)
    NetworkUsageSampleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkUsageSample.newBuilder() to construct.
  private NetworkUsageSample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkUsageSample() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkUsageSample();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_NetworkUsageSample_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_NetworkUsageSample_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.NetworkUsageSample.class,
            com.google.cloud.migrationcenter.v1.NetworkUsageSample.Builder.class);
  }

  public static final int AVERAGE_INGRESS_BPS_FIELD_NUMBER = 1;
  private float averageIngressBps_ = 0F;
  /**
   *
   *
   * <pre>
   * Average network ingress in B/s sampled over a short window.
   * Must be non-negative.
   * </pre>
   *
   * <code>float average_ingress_bps = 1;</code>
   *
   * @return The averageIngressBps.
   */
  @java.lang.Override
  public float getAverageIngressBps() {
    return averageIngressBps_;
  }

  public static final int AVERAGE_EGRESS_BPS_FIELD_NUMBER = 2;
  private float averageEgressBps_ = 0F;
  /**
   *
   *
   * <pre>
   * Average network egress in B/s sampled over a short window.
   * Must be non-negative.
   * </pre>
   *
   * <code>float average_egress_bps = 2;</code>
   *
   * @return The averageEgressBps.
   */
  @java.lang.Override
  public float getAverageEgressBps() {
    return averageEgressBps_;
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
    if (java.lang.Float.floatToRawIntBits(averageIngressBps_) != 0) {
      output.writeFloat(1, averageIngressBps_);
    }
    if (java.lang.Float.floatToRawIntBits(averageEgressBps_) != 0) {
      output.writeFloat(2, averageEgressBps_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(averageIngressBps_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, averageIngressBps_);
    }
    if (java.lang.Float.floatToRawIntBits(averageEgressBps_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, averageEgressBps_);
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.NetworkUsageSample)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.NetworkUsageSample other =
        (com.google.cloud.migrationcenter.v1.NetworkUsageSample) obj;

    if (java.lang.Float.floatToIntBits(getAverageIngressBps())
        != java.lang.Float.floatToIntBits(other.getAverageIngressBps())) return false;
    if (java.lang.Float.floatToIntBits(getAverageEgressBps())
        != java.lang.Float.floatToIntBits(other.getAverageEgressBps())) return false;
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
    hash = (37 * hash) + AVERAGE_INGRESS_BPS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getAverageIngressBps());
    hash = (37 * hash) + AVERAGE_EGRESS_BPS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getAverageEgressBps());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample parseFrom(
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
      com.google.cloud.migrationcenter.v1.NetworkUsageSample prototype) {
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
   * Network usage sample. Values are across all network interfaces.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.NetworkUsageSample}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.NetworkUsageSample)
      com.google.cloud.migrationcenter.v1.NetworkUsageSampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_NetworkUsageSample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_NetworkUsageSample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.NetworkUsageSample.class,
              com.google.cloud.migrationcenter.v1.NetworkUsageSample.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.NetworkUsageSample.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      averageIngressBps_ = 0F;
      averageEgressBps_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_NetworkUsageSample_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NetworkUsageSample getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.NetworkUsageSample.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NetworkUsageSample build() {
      com.google.cloud.migrationcenter.v1.NetworkUsageSample result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.NetworkUsageSample buildPartial() {
      com.google.cloud.migrationcenter.v1.NetworkUsageSample result =
          new com.google.cloud.migrationcenter.v1.NetworkUsageSample(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.NetworkUsageSample result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.averageIngressBps_ = averageIngressBps_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.averageEgressBps_ = averageEgressBps_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.NetworkUsageSample) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.NetworkUsageSample) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.NetworkUsageSample other) {
      if (other == com.google.cloud.migrationcenter.v1.NetworkUsageSample.getDefaultInstance())
        return this;
      if (other.getAverageIngressBps() != 0F) {
        setAverageIngressBps(other.getAverageIngressBps());
      }
      if (other.getAverageEgressBps() != 0F) {
        setAverageEgressBps(other.getAverageEgressBps());
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
            case 13:
              {
                averageIngressBps_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 21:
              {
                averageEgressBps_ = input.readFloat();
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

    private float averageIngressBps_;
    /**
     *
     *
     * <pre>
     * Average network ingress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_ingress_bps = 1;</code>
     *
     * @return The averageIngressBps.
     */
    @java.lang.Override
    public float getAverageIngressBps() {
      return averageIngressBps_;
    }
    /**
     *
     *
     * <pre>
     * Average network ingress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_ingress_bps = 1;</code>
     *
     * @param value The averageIngressBps to set.
     * @return This builder for chaining.
     */
    public Builder setAverageIngressBps(float value) {

      averageIngressBps_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average network ingress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_ingress_bps = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAverageIngressBps() {
      bitField0_ = (bitField0_ & ~0x00000001);
      averageIngressBps_ = 0F;
      onChanged();
      return this;
    }

    private float averageEgressBps_;
    /**
     *
     *
     * <pre>
     * Average network egress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_egress_bps = 2;</code>
     *
     * @return The averageEgressBps.
     */
    @java.lang.Override
    public float getAverageEgressBps() {
      return averageEgressBps_;
    }
    /**
     *
     *
     * <pre>
     * Average network egress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_egress_bps = 2;</code>
     *
     * @param value The averageEgressBps to set.
     * @return This builder for chaining.
     */
    public Builder setAverageEgressBps(float value) {

      averageEgressBps_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Average network egress in B/s sampled over a short window.
     * Must be non-negative.
     * </pre>
     *
     * <code>float average_egress_bps = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAverageEgressBps() {
      bitField0_ = (bitField0_ & ~0x00000002);
      averageEgressBps_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.NetworkUsageSample)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.NetworkUsageSample)
  private static final com.google.cloud.migrationcenter.v1.NetworkUsageSample DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.NetworkUsageSample();
  }

  public static com.google.cloud.migrationcenter.v1.NetworkUsageSample getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkUsageSample> PARSER =
      new com.google.protobuf.AbstractParser<NetworkUsageSample>() {
        @java.lang.Override
        public NetworkUsageSample parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkUsageSample> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkUsageSample> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.NetworkUsageSample getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
