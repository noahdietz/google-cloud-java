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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * Options customizing EventDriven transfers schedule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule}
 */
public final class EventDrivenSchedule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule)
    EventDrivenScheduleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventDrivenSchedule.newBuilder() to construct.
  private EventDrivenSchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventDrivenSchedule() {
    pubsubSubscription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventDrivenSchedule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.class,
            com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.Builder.class);
  }

  public static final int PUBSUB_SUBSCRIPTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pubsubSubscription_ = "";
  /**
   *
   *
   * <pre>
   * Pub/Sub subscription name used to receive events.
   * Only Google Cloud Storage data source support this option.
   * Format: projects/{project}/subscriptions/{subscription}
   * </pre>
   *
   * <code>string pubsub_subscription = 1;</code>
   *
   * @return The pubsubSubscription.
   */
  @java.lang.Override
  public java.lang.String getPubsubSubscription() {
    java.lang.Object ref = pubsubSubscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubsubSubscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Pub/Sub subscription name used to receive events.
   * Only Google Cloud Storage data source support this option.
   * Format: projects/{project}/subscriptions/{subscription}
   * </pre>
   *
   * <code>string pubsub_subscription = 1;</code>
   *
   * @return The bytes for pubsubSubscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPubsubSubscriptionBytes() {
    java.lang.Object ref = pubsubSubscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pubsubSubscription_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubsubSubscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubsubSubscription_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubsubSubscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubsubSubscription_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule other =
        (com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule) obj;

    if (!getPubsubSubscription().equals(other.getPubsubSubscription())) return false;
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
    hash = (37 * hash) + PUBSUB_SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getPubsubSubscription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule parseFrom(
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
      com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule prototype) {
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
   * Options customizing EventDriven transfers schedule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule)
      com.google.cloud.bigquery.datatransfer.v1.EventDrivenScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.class,
              com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pubsubSubscription_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_EventDrivenSchedule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule build() {
      com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule result =
          new com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pubsubSubscription_ = pubsubSubscription_;
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule other) {
      if (other
          == com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule.getDefaultInstance())
        return this;
      if (!other.getPubsubSubscription().isEmpty()) {
        pubsubSubscription_ = other.pubsubSubscription_;
        bitField0_ |= 0x00000001;
        onChanged();
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
                pubsubSubscription_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object pubsubSubscription_ = "";
    /**
     *
     *
     * <pre>
     * Pub/Sub subscription name used to receive events.
     * Only Google Cloud Storage data source support this option.
     * Format: projects/{project}/subscriptions/{subscription}
     * </pre>
     *
     * <code>string pubsub_subscription = 1;</code>
     *
     * @return The pubsubSubscription.
     */
    public java.lang.String getPubsubSubscription() {
      java.lang.Object ref = pubsubSubscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubsubSubscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pub/Sub subscription name used to receive events.
     * Only Google Cloud Storage data source support this option.
     * Format: projects/{project}/subscriptions/{subscription}
     * </pre>
     *
     * <code>string pubsub_subscription = 1;</code>
     *
     * @return The bytes for pubsubSubscription.
     */
    public com.google.protobuf.ByteString getPubsubSubscriptionBytes() {
      java.lang.Object ref = pubsubSubscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pubsubSubscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pub/Sub subscription name used to receive events.
     * Only Google Cloud Storage data source support this option.
     * Format: projects/{project}/subscriptions/{subscription}
     * </pre>
     *
     * <code>string pubsub_subscription = 1;</code>
     *
     * @param value The pubsubSubscription to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pubsubSubscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pub/Sub subscription name used to receive events.
     * Only Google Cloud Storage data source support this option.
     * Format: projects/{project}/subscriptions/{subscription}
     * </pre>
     *
     * <code>string pubsub_subscription = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPubsubSubscription() {
      pubsubSubscription_ = getDefaultInstance().getPubsubSubscription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pub/Sub subscription name used to receive events.
     * Only Google Cloud Storage data source support this option.
     * Format: projects/{project}/subscriptions/{subscription}
     * </pre>
     *
     * <code>string pubsub_subscription = 1;</code>
     *
     * @param value The bytes for pubsubSubscription to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pubsubSubscription_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule)
  private static final com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventDrivenSchedule> PARSER =
      new com.google.protobuf.AbstractParser<EventDrivenSchedule>() {
        @java.lang.Override
        public EventDrivenSchedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventDrivenSchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventDrivenSchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.EventDrivenSchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
