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
// source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1beta1;

/**
 *
 *
 * <pre>
 * Describes measured latency distribution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1beta1.LatencyDistribution}
 */
public final class LatencyDistribution extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1beta1.LatencyDistribution)
    LatencyDistributionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LatencyDistribution.newBuilder() to construct.
  private LatencyDistribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LatencyDistribution() {
    latencyPercentiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LatencyDistribution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkmanagement.v1beta1.TestOuterClass
        .internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1beta1.TestOuterClass
        .internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.class,
            com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.Builder.class);
  }

  public static final int LATENCY_PERCENTILES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>
      latencyPercentiles_;
  /**
   *
   *
   * <pre>
   * Representative latency percentiles.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>
      getLatencyPercentilesList() {
    return latencyPercentiles_;
  }
  /**
   *
   *
   * <pre>
   * Representative latency percentiles.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder>
      getLatencyPercentilesOrBuilderList() {
    return latencyPercentiles_;
  }
  /**
   *
   *
   * <pre>
   * Representative latency percentiles.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
   * </code>
   */
  @java.lang.Override
  public int getLatencyPercentilesCount() {
    return latencyPercentiles_.size();
  }
  /**
   *
   *
   * <pre>
   * Representative latency percentiles.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile getLatencyPercentiles(
      int index) {
    return latencyPercentiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Representative latency percentiles.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder
      getLatencyPercentilesOrBuilder(int index) {
    return latencyPercentiles_.get(index);
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
    for (int i = 0; i < latencyPercentiles_.size(); i++) {
      output.writeMessage(1, latencyPercentiles_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < latencyPercentiles_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, latencyPercentiles_.get(i));
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1beta1.LatencyDistribution)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1beta1.LatencyDistribution other =
        (com.google.cloud.networkmanagement.v1beta1.LatencyDistribution) obj;

    if (!getLatencyPercentilesList().equals(other.getLatencyPercentilesList())) return false;
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
    if (getLatencyPercentilesCount() > 0) {
      hash = (37 * hash) + LATENCY_PERCENTILES_FIELD_NUMBER;
      hash = (53 * hash) + getLatencyPercentilesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution parseFrom(
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
      com.google.cloud.networkmanagement.v1beta1.LatencyDistribution prototype) {
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
   * Describes measured latency distribution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1beta1.LatencyDistribution}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1beta1.LatencyDistribution)
      com.google.cloud.networkmanagement.v1beta1.LatencyDistributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass
          .internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass
          .internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.class,
              com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (latencyPercentilesBuilder_ == null) {
        latencyPercentiles_ = java.util.Collections.emptyList();
      } else {
        latencyPercentiles_ = null;
        latencyPercentilesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass
          .internal_static_google_cloud_networkmanagement_v1beta1_LatencyDistribution_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyDistribution
        getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyDistribution build() {
      com.google.cloud.networkmanagement.v1beta1.LatencyDistribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyDistribution buildPartial() {
      com.google.cloud.networkmanagement.v1beta1.LatencyDistribution result =
          new com.google.cloud.networkmanagement.v1beta1.LatencyDistribution(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.networkmanagement.v1beta1.LatencyDistribution result) {
      if (latencyPercentilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          latencyPercentiles_ = java.util.Collections.unmodifiableList(latencyPercentiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.latencyPercentiles_ = latencyPercentiles_;
      } else {
        result.latencyPercentiles_ = latencyPercentilesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.networkmanagement.v1beta1.LatencyDistribution result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1beta1.LatencyDistribution) {
        return mergeFrom((com.google.cloud.networkmanagement.v1beta1.LatencyDistribution) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1beta1.LatencyDistribution other) {
      if (other
          == com.google.cloud.networkmanagement.v1beta1.LatencyDistribution.getDefaultInstance())
        return this;
      if (latencyPercentilesBuilder_ == null) {
        if (!other.latencyPercentiles_.isEmpty()) {
          if (latencyPercentiles_.isEmpty()) {
            latencyPercentiles_ = other.latencyPercentiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLatencyPercentilesIsMutable();
            latencyPercentiles_.addAll(other.latencyPercentiles_);
          }
          onChanged();
        }
      } else {
        if (!other.latencyPercentiles_.isEmpty()) {
          if (latencyPercentilesBuilder_.isEmpty()) {
            latencyPercentilesBuilder_.dispose();
            latencyPercentilesBuilder_ = null;
            latencyPercentiles_ = other.latencyPercentiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            latencyPercentilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLatencyPercentilesFieldBuilder()
                    : null;
          } else {
            latencyPercentilesBuilder_.addAllMessages(other.latencyPercentiles_);
          }
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
                com.google.cloud.networkmanagement.v1beta1.LatencyPercentile m =
                    input.readMessage(
                        com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.parser(),
                        extensionRegistry);
                if (latencyPercentilesBuilder_ == null) {
                  ensureLatencyPercentilesIsMutable();
                  latencyPercentiles_.add(m);
                } else {
                  latencyPercentilesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>
        latencyPercentiles_ = java.util.Collections.emptyList();

    private void ensureLatencyPercentilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        latencyPercentiles_ =
            new java.util.ArrayList<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>(
                latencyPercentiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentile,
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder,
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder>
        latencyPercentilesBuilder_;

    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>
        getLatencyPercentilesList() {
      if (latencyPercentilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(latencyPercentiles_);
      } else {
        return latencyPercentilesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public int getLatencyPercentilesCount() {
      if (latencyPercentilesBuilder_ == null) {
        return latencyPercentiles_.size();
      } else {
        return latencyPercentilesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile getLatencyPercentiles(
        int index) {
      if (latencyPercentilesBuilder_ == null) {
        return latencyPercentiles_.get(index);
      } else {
        return latencyPercentilesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder setLatencyPercentiles(
        int index, com.google.cloud.networkmanagement.v1beta1.LatencyPercentile value) {
      if (latencyPercentilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.set(index, value);
        onChanged();
      } else {
        latencyPercentilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder setLatencyPercentiles(
        int index,
        com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder builderForValue) {
      if (latencyPercentilesBuilder_ == null) {
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        latencyPercentilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder addLatencyPercentiles(
        com.google.cloud.networkmanagement.v1beta1.LatencyPercentile value) {
      if (latencyPercentilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.add(value);
        onChanged();
      } else {
        latencyPercentilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder addLatencyPercentiles(
        int index, com.google.cloud.networkmanagement.v1beta1.LatencyPercentile value) {
      if (latencyPercentilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.add(index, value);
        onChanged();
      } else {
        latencyPercentilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder addLatencyPercentiles(
        com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder builderForValue) {
      if (latencyPercentilesBuilder_ == null) {
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.add(builderForValue.build());
        onChanged();
      } else {
        latencyPercentilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder addLatencyPercentiles(
        int index,
        com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder builderForValue) {
      if (latencyPercentilesBuilder_ == null) {
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        latencyPercentilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder addAllLatencyPercentiles(
        java.lang.Iterable<? extends com.google.cloud.networkmanagement.v1beta1.LatencyPercentile>
            values) {
      if (latencyPercentilesBuilder_ == null) {
        ensureLatencyPercentilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, latencyPercentiles_);
        onChanged();
      } else {
        latencyPercentilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder clearLatencyPercentiles() {
      if (latencyPercentilesBuilder_ == null) {
        latencyPercentiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        latencyPercentilesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public Builder removeLatencyPercentiles(int index) {
      if (latencyPercentilesBuilder_ == null) {
        ensureLatencyPercentilesIsMutable();
        latencyPercentiles_.remove(index);
        onChanged();
      } else {
        latencyPercentilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder
        getLatencyPercentilesBuilder(int index) {
      return getLatencyPercentilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder
        getLatencyPercentilesOrBuilder(int index) {
      if (latencyPercentilesBuilder_ == null) {
        return latencyPercentiles_.get(index);
      } else {
        return latencyPercentilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder>
        getLatencyPercentilesOrBuilderList() {
      if (latencyPercentilesBuilder_ != null) {
        return latencyPercentilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(latencyPercentiles_);
      }
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder
        addLatencyPercentilesBuilder() {
      return getLatencyPercentilesFieldBuilder()
          .addBuilder(
              com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder
        addLatencyPercentilesBuilder(int index) {
      return getLatencyPercentilesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Representative latency percentiles.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.networkmanagement.v1beta1.LatencyPercentile latency_percentiles = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder>
        getLatencyPercentilesBuilderList() {
      return getLatencyPercentilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentile,
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder,
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder>
        getLatencyPercentilesFieldBuilder() {
      if (latencyPercentilesBuilder_ == null) {
        latencyPercentilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.networkmanagement.v1beta1.LatencyPercentile,
                com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder,
                com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder>(
                latencyPercentiles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        latencyPercentiles_ = null;
      }
      return latencyPercentilesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1beta1.LatencyDistribution)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1beta1.LatencyDistribution)
  private static final com.google.cloud.networkmanagement.v1beta1.LatencyDistribution
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1beta1.LatencyDistribution();
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyDistribution
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatencyDistribution> PARSER =
      new com.google.protobuf.AbstractParser<LatencyDistribution>() {
        @java.lang.Override
        public LatencyDistribution parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatencyDistribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatencyDistribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.LatencyDistribution
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
