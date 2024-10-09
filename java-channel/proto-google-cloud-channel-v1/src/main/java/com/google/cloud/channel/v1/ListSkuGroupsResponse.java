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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for ListSkuGroups.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListSkuGroupsResponse}
 */
public final class ListSkuGroupsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListSkuGroupsResponse)
    ListSkuGroupsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSkuGroupsResponse.newBuilder() to construct.
  private ListSkuGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSkuGroupsResponse() {
    skuGroups_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSkuGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListSkuGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListSkuGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListSkuGroupsResponse.class,
            com.google.cloud.channel.v1.ListSkuGroupsResponse.Builder.class);
  }

  public static final int SKU_GROUPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.SkuGroup> skuGroups_;
  /**
   *
   *
   * <pre>
   * The list of SKU groups requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.SkuGroup> getSkuGroupsList() {
    return skuGroups_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKU groups requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.SkuGroupOrBuilder>
      getSkuGroupsOrBuilderList() {
    return skuGroups_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKU groups requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
   */
  @java.lang.Override
  public int getSkuGroupsCount() {
    return skuGroups_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of SKU groups requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuGroup getSkuGroups(int index) {
    return skuGroups_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of SKU groups requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuGroupOrBuilder getSkuGroupsOrBuilder(int index) {
    return skuGroups_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListSkuGroups.page_token][] to obtain that
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListSkuGroups.page_token][] to obtain that
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < skuGroups_.size(); i++) {
      output.writeMessage(1, skuGroups_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skuGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, skuGroups_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListSkuGroupsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListSkuGroupsResponse other =
        (com.google.cloud.channel.v1.ListSkuGroupsResponse) obj;

    if (!getSkuGroupsList().equals(other.getSkuGroupsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getSkuGroupsCount() > 0) {
      hash = (37 * hash) + SKU_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getSkuGroupsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.ListSkuGroupsResponse prototype) {
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
   * Response message for ListSkuGroups.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListSkuGroupsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListSkuGroupsResponse)
      com.google.cloud.channel.v1.ListSkuGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkuGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkuGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListSkuGroupsResponse.class,
              com.google.cloud.channel.v1.ListSkuGroupsResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListSkuGroupsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (skuGroupsBuilder_ == null) {
        skuGroups_ = java.util.Collections.emptyList();
      } else {
        skuGroups_ = null;
        skuGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkuGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkuGroupsResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListSkuGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkuGroupsResponse build() {
      com.google.cloud.channel.v1.ListSkuGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkuGroupsResponse buildPartial() {
      com.google.cloud.channel.v1.ListSkuGroupsResponse result =
          new com.google.cloud.channel.v1.ListSkuGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListSkuGroupsResponse result) {
      if (skuGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skuGroups_ = java.util.Collections.unmodifiableList(skuGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skuGroups_ = skuGroups_;
      } else {
        result.skuGroups_ = skuGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListSkuGroupsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.channel.v1.ListSkuGroupsResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListSkuGroupsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListSkuGroupsResponse other) {
      if (other == com.google.cloud.channel.v1.ListSkuGroupsResponse.getDefaultInstance())
        return this;
      if (skuGroupsBuilder_ == null) {
        if (!other.skuGroups_.isEmpty()) {
          if (skuGroups_.isEmpty()) {
            skuGroups_ = other.skuGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkuGroupsIsMutable();
            skuGroups_.addAll(other.skuGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.skuGroups_.isEmpty()) {
          if (skuGroupsBuilder_.isEmpty()) {
            skuGroupsBuilder_.dispose();
            skuGroupsBuilder_ = null;
            skuGroups_ = other.skuGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skuGroupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSkuGroupsFieldBuilder()
                    : null;
          } else {
            skuGroupsBuilder_.addAllMessages(other.skuGroups_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.channel.v1.SkuGroup m =
                    input.readMessage(
                        com.google.cloud.channel.v1.SkuGroup.parser(), extensionRegistry);
                if (skuGroupsBuilder_ == null) {
                  ensureSkuGroupsIsMutable();
                  skuGroups_.add(m);
                } else {
                  skuGroupsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.util.List<com.google.cloud.channel.v1.SkuGroup> skuGroups_ =
        java.util.Collections.emptyList();

    private void ensureSkuGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skuGroups_ = new java.util.ArrayList<com.google.cloud.channel.v1.SkuGroup>(skuGroups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.SkuGroup,
            com.google.cloud.channel.v1.SkuGroup.Builder,
            com.google.cloud.channel.v1.SkuGroupOrBuilder>
        skuGroupsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.SkuGroup> getSkuGroupsList() {
      if (skuGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skuGroups_);
      } else {
        return skuGroupsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public int getSkuGroupsCount() {
      if (skuGroupsBuilder_ == null) {
        return skuGroups_.size();
      } else {
        return skuGroupsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroup getSkuGroups(int index) {
      if (skuGroupsBuilder_ == null) {
        return skuGroups_.get(index);
      } else {
        return skuGroupsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder setSkuGroups(int index, com.google.cloud.channel.v1.SkuGroup value) {
      if (skuGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuGroupsIsMutable();
        skuGroups_.set(index, value);
        onChanged();
      } else {
        skuGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder setSkuGroups(
        int index, com.google.cloud.channel.v1.SkuGroup.Builder builderForValue) {
      if (skuGroupsBuilder_ == null) {
        ensureSkuGroupsIsMutable();
        skuGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        skuGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder addSkuGroups(com.google.cloud.channel.v1.SkuGroup value) {
      if (skuGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuGroupsIsMutable();
        skuGroups_.add(value);
        onChanged();
      } else {
        skuGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder addSkuGroups(int index, com.google.cloud.channel.v1.SkuGroup value) {
      if (skuGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkuGroupsIsMutable();
        skuGroups_.add(index, value);
        onChanged();
      } else {
        skuGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder addSkuGroups(com.google.cloud.channel.v1.SkuGroup.Builder builderForValue) {
      if (skuGroupsBuilder_ == null) {
        ensureSkuGroupsIsMutable();
        skuGroups_.add(builderForValue.build());
        onChanged();
      } else {
        skuGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder addSkuGroups(
        int index, com.google.cloud.channel.v1.SkuGroup.Builder builderForValue) {
      if (skuGroupsBuilder_ == null) {
        ensureSkuGroupsIsMutable();
        skuGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        skuGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder addAllSkuGroups(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.SkuGroup> values) {
      if (skuGroupsBuilder_ == null) {
        ensureSkuGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, skuGroups_);
        onChanged();
      } else {
        skuGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder clearSkuGroups() {
      if (skuGroupsBuilder_ == null) {
        skuGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skuGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public Builder removeSkuGroups(int index) {
      if (skuGroupsBuilder_ == null) {
        ensureSkuGroupsIsMutable();
        skuGroups_.remove(index);
        onChanged();
      } else {
        skuGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroup.Builder getSkuGroupsBuilder(int index) {
      return getSkuGroupsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroupOrBuilder getSkuGroupsOrBuilder(int index) {
      if (skuGroupsBuilder_ == null) {
        return skuGroups_.get(index);
      } else {
        return skuGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.SkuGroupOrBuilder>
        getSkuGroupsOrBuilderList() {
      if (skuGroupsBuilder_ != null) {
        return skuGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skuGroups_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroup.Builder addSkuGroupsBuilder() {
      return getSkuGroupsFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.SkuGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuGroup.Builder addSkuGroupsBuilder(int index) {
      return getSkuGroupsFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.SkuGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKU groups requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.SkuGroup sku_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.SkuGroup.Builder> getSkuGroupsBuilderList() {
      return getSkuGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.SkuGroup,
            com.google.cloud.channel.v1.SkuGroup.Builder,
            com.google.cloud.channel.v1.SkuGroupOrBuilder>
        getSkuGroupsFieldBuilder() {
      if (skuGroupsBuilder_ == null) {
        skuGroupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.SkuGroup,
                com.google.cloud.channel.v1.SkuGroup.Builder,
                com.google.cloud.channel.v1.SkuGroupOrBuilder>(
                skuGroups_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        skuGroups_ = null;
      }
      return skuGroupsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListSkuGroups.page_token][] to obtain that
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListSkuGroups.page_token][] to obtain that
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListSkuGroups.page_token][] to obtain that
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListSkuGroups.page_token][] to obtain that
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListSkuGroups.page_token][] to obtain that
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListSkuGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListSkuGroupsResponse)
  private static final com.google.cloud.channel.v1.ListSkuGroupsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListSkuGroupsResponse();
  }

  public static com.google.cloud.channel.v1.ListSkuGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkuGroupsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSkuGroupsResponse>() {
        @java.lang.Override
        public ListSkuGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkuGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkuGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListSkuGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
