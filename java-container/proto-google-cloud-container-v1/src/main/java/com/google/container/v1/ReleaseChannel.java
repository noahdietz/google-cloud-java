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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * ReleaseChannel indicates which release channel a cluster is
 * subscribed to. Release channels are arranged in order of risk.
 *
 * When a cluster is subscribed to a release channel, Google maintains
 * both the master version and the node version. Node auto-upgrade
 * defaults to true and cannot be disabled.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.ReleaseChannel}
 */
public final class ReleaseChannel extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.ReleaseChannel)
    ReleaseChannelOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReleaseChannel.newBuilder() to construct.
  private ReleaseChannel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReleaseChannel() {
    channel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReleaseChannel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_ReleaseChannel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_ReleaseChannel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.ReleaseChannel.class,
            com.google.container.v1.ReleaseChannel.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible values for 'channel'.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.ReleaseChannel.Channel}
   */
  public enum Channel implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No channel specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * RAPID channel is offered on an early access basis for customers who want
     * to test new releases.
     *
     * WARNING: Versions available in the RAPID Channel may be subject to
     * unresolved issues with no known workaround and are not subject to any
     * SLAs.
     * </pre>
     *
     * <code>RAPID = 1;</code>
     */
    RAPID(1),
    /**
     *
     *
     * <pre>
     * Clusters subscribed to REGULAR receive versions that are considered GA
     * quality. REGULAR is intended for production users who want to take
     * advantage of new features.
     * </pre>
     *
     * <code>REGULAR = 2;</code>
     */
    REGULAR(2),
    /**
     *
     *
     * <pre>
     * Clusters subscribed to STABLE receive versions that are known to be
     * stable and reliable in production.
     * </pre>
     *
     * <code>STABLE = 3;</code>
     */
    STABLE(3),
    /**
     *
     *
     * <pre>
     * Clusters subscribed to EXTENDED receive extended support and availability
     * for versions which are known to be stable and reliable in production.
     * </pre>
     *
     * <code>EXTENDED = 4;</code>
     */
    EXTENDED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No channel specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * RAPID channel is offered on an early access basis for customers who want
     * to test new releases.
     *
     * WARNING: Versions available in the RAPID Channel may be subject to
     * unresolved issues with no known workaround and are not subject to any
     * SLAs.
     * </pre>
     *
     * <code>RAPID = 1;</code>
     */
    public static final int RAPID_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Clusters subscribed to REGULAR receive versions that are considered GA
     * quality. REGULAR is intended for production users who want to take
     * advantage of new features.
     * </pre>
     *
     * <code>REGULAR = 2;</code>
     */
    public static final int REGULAR_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Clusters subscribed to STABLE receive versions that are known to be
     * stable and reliable in production.
     * </pre>
     *
     * <code>STABLE = 3;</code>
     */
    public static final int STABLE_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Clusters subscribed to EXTENDED receive extended support and availability
     * for versions which are known to be stable and reliable in production.
     * </pre>
     *
     * <code>EXTENDED = 4;</code>
     */
    public static final int EXTENDED_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Channel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Channel forNumber(int value) {
      switch (value) {
        case 0:
          return UNSPECIFIED;
        case 1:
          return RAPID;
        case 2:
          return REGULAR;
        case 3:
          return STABLE;
        case 4:
          return EXTENDED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Channel> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Channel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Channel>() {
          public Channel findValueByNumber(int number) {
            return Channel.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1.ReleaseChannel.getDescriptor().getEnumTypes().get(0);
    }

    private static final Channel[] VALUES = values();

    public static Channel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Channel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.ReleaseChannel.Channel)
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private int channel_ = 0;
  /**
   *
   *
   * <pre>
   * channel specifies which release channel the cluster is subscribed to.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
   *
   * @return The enum numeric value on the wire for channel.
   */
  @java.lang.Override
  public int getChannelValue() {
    return channel_;
  }
  /**
   *
   *
   * <pre>
   * channel specifies which release channel the cluster is subscribed to.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
   *
   * @return The channel.
   */
  @java.lang.Override
  public com.google.container.v1.ReleaseChannel.Channel getChannel() {
    com.google.container.v1.ReleaseChannel.Channel result =
        com.google.container.v1.ReleaseChannel.Channel.forNumber(channel_);
    return result == null ? com.google.container.v1.ReleaseChannel.Channel.UNRECOGNIZED : result;
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
    if (channel_ != com.google.container.v1.ReleaseChannel.Channel.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, channel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != com.google.container.v1.ReleaseChannel.Channel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, channel_);
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
    if (!(obj instanceof com.google.container.v1.ReleaseChannel)) {
      return super.equals(obj);
    }
    com.google.container.v1.ReleaseChannel other = (com.google.container.v1.ReleaseChannel) obj;

    if (channel_ != other.channel_) return false;
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
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + channel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.ReleaseChannel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.ReleaseChannel parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.ReleaseChannel parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.ReleaseChannel prototype) {
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
   * ReleaseChannel indicates which release channel a cluster is
   * subscribed to. Release channels are arranged in order of risk.
   *
   * When a cluster is subscribed to a release channel, Google maintains
   * both the master version and the node version. Node auto-upgrade
   * defaults to true and cannot be disabled.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.ReleaseChannel}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.ReleaseChannel)
      com.google.container.v1.ReleaseChannelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_ReleaseChannel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_ReleaseChannel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.ReleaseChannel.class,
              com.google.container.v1.ReleaseChannel.Builder.class);
    }

    // Construct using com.google.container.v1.ReleaseChannel.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      channel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_ReleaseChannel_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.ReleaseChannel getDefaultInstanceForType() {
      return com.google.container.v1.ReleaseChannel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.ReleaseChannel build() {
      com.google.container.v1.ReleaseChannel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.ReleaseChannel buildPartial() {
      com.google.container.v1.ReleaseChannel result =
          new com.google.container.v1.ReleaseChannel(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.ReleaseChannel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channel_ = channel_;
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
      if (other instanceof com.google.container.v1.ReleaseChannel) {
        return mergeFrom((com.google.container.v1.ReleaseChannel) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.ReleaseChannel other) {
      if (other == com.google.container.v1.ReleaseChannel.getDefaultInstance()) return this;
      if (other.channel_ != 0) {
        setChannelValue(other.getChannelValue());
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
                channel_ = input.readEnum();
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

    private int channel_ = 0;
    /**
     *
     *
     * <pre>
     * channel specifies which release channel the cluster is subscribed to.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
     *
     * @return The enum numeric value on the wire for channel.
     */
    @java.lang.Override
    public int getChannelValue() {
      return channel_;
    }
    /**
     *
     *
     * <pre>
     * channel specifies which release channel the cluster is subscribed to.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
     *
     * @param value The enum numeric value on the wire for channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannelValue(int value) {
      channel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * channel specifies which release channel the cluster is subscribed to.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
     *
     * @return The channel.
     */
    @java.lang.Override
    public com.google.container.v1.ReleaseChannel.Channel getChannel() {
      com.google.container.v1.ReleaseChannel.Channel result =
          com.google.container.v1.ReleaseChannel.Channel.forNumber(channel_);
      return result == null ? com.google.container.v1.ReleaseChannel.Channel.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * channel specifies which release channel the cluster is subscribed to.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
     *
     * @param value The channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannel(com.google.container.v1.ReleaseChannel.Channel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      channel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * channel specifies which release channel the cluster is subscribed to.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel.Channel channel = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearChannel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      channel_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.ReleaseChannel)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.ReleaseChannel)
  private static final com.google.container.v1.ReleaseChannel DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.ReleaseChannel();
  }

  public static com.google.container.v1.ReleaseChannel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReleaseChannel> PARSER =
      new com.google.protobuf.AbstractParser<ReleaseChannel>() {
        @java.lang.Override
        public ReleaseChannel parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReleaseChannel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReleaseChannel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.ReleaseChannel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
