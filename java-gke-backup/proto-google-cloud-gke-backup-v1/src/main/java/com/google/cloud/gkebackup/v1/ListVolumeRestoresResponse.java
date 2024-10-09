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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Response message for ListVolumeRestores.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.ListVolumeRestoresResponse}
 */
public final class ListVolumeRestoresResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.ListVolumeRestoresResponse)
    ListVolumeRestoresResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListVolumeRestoresResponse.newBuilder() to construct.
  private ListVolumeRestoresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListVolumeRestoresResponse() {
    volumeRestores_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListVolumeRestoresResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_ListVolumeRestoresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_ListVolumeRestoresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.class,
            com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.Builder.class);
  }

  public static final int VOLUME_RESTORES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkebackup.v1.VolumeRestore> volumeRestores_;
  /**
   *
   *
   * <pre>
   * The list of VolumeRestores matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkebackup.v1.VolumeRestore> getVolumeRestoresList() {
    return volumeRestores_;
  }
  /**
   *
   *
   * <pre>
   * The list of VolumeRestores matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder>
      getVolumeRestoresOrBuilderList() {
    return volumeRestores_;
  }
  /**
   *
   *
   * <pre>
   * The list of VolumeRestores matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
   */
  @java.lang.Override
  public int getVolumeRestoresCount() {
    return volumeRestores_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of VolumeRestores matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.VolumeRestore getVolumeRestores(int index) {
    return volumeRestores_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of VolumeRestores matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder getVolumeRestoresOrBuilder(
      int index) {
    return volumeRestores_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token which may be sent as
   * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
   * in a subsequent `ListVolumeRestores` call to retrieve the next page of
   * results. If this field is omitted or empty, then there are no more results
   * to return.
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
   * A token which may be sent as
   * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
   * in a subsequent `ListVolumeRestores` call to retrieve the next page of
   * results. If this field is omitted or empty, then there are no more results
   * to return.
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
    for (int i = 0; i < volumeRestores_.size(); i++) {
      output.writeMessage(1, volumeRestores_.get(i));
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
    for (int i = 0; i < volumeRestores_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, volumeRestores_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse other =
        (com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse) obj;

    if (!getVolumeRestoresList().equals(other.getVolumeRestoresList())) return false;
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
    if (getVolumeRestoresCount() > 0) {
      hash = (37 * hash) + VOLUME_RESTORES_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeRestoresList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse parseFrom(
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
      com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse prototype) {
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
   * Response message for ListVolumeRestores.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.ListVolumeRestoresResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.ListVolumeRestoresResponse)
      com.google.cloud.gkebackup.v1.ListVolumeRestoresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeRestoresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeRestoresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.class,
              com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (volumeRestoresBuilder_ == null) {
        volumeRestores_ = java.util.Collections.emptyList();
      } else {
        volumeRestores_ = null;
        volumeRestoresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeRestoresResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse build() {
      com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse buildPartial() {
      com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse result =
          new com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse result) {
      if (volumeRestoresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          volumeRestores_ = java.util.Collections.unmodifiableList(volumeRestores_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.volumeRestores_ = volumeRestores_;
      } else {
        result.volumeRestores_ = volumeRestoresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse result) {
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
      if (other instanceof com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse) {
        return mergeFrom((com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse other) {
      if (other == com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse.getDefaultInstance())
        return this;
      if (volumeRestoresBuilder_ == null) {
        if (!other.volumeRestores_.isEmpty()) {
          if (volumeRestores_.isEmpty()) {
            volumeRestores_ = other.volumeRestores_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVolumeRestoresIsMutable();
            volumeRestores_.addAll(other.volumeRestores_);
          }
          onChanged();
        }
      } else {
        if (!other.volumeRestores_.isEmpty()) {
          if (volumeRestoresBuilder_.isEmpty()) {
            volumeRestoresBuilder_.dispose();
            volumeRestoresBuilder_ = null;
            volumeRestores_ = other.volumeRestores_;
            bitField0_ = (bitField0_ & ~0x00000001);
            volumeRestoresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVolumeRestoresFieldBuilder()
                    : null;
          } else {
            volumeRestoresBuilder_.addAllMessages(other.volumeRestores_);
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
                com.google.cloud.gkebackup.v1.VolumeRestore m =
                    input.readMessage(
                        com.google.cloud.gkebackup.v1.VolumeRestore.parser(), extensionRegistry);
                if (volumeRestoresBuilder_ == null) {
                  ensureVolumeRestoresIsMutable();
                  volumeRestores_.add(m);
                } else {
                  volumeRestoresBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkebackup.v1.VolumeRestore> volumeRestores_ =
        java.util.Collections.emptyList();

    private void ensureVolumeRestoresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        volumeRestores_ =
            new java.util.ArrayList<com.google.cloud.gkebackup.v1.VolumeRestore>(volumeRestores_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.VolumeRestore,
            com.google.cloud.gkebackup.v1.VolumeRestore.Builder,
            com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder>
        volumeRestoresBuilder_;

    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.VolumeRestore> getVolumeRestoresList() {
      if (volumeRestoresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(volumeRestores_);
      } else {
        return volumeRestoresBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public int getVolumeRestoresCount() {
      if (volumeRestoresBuilder_ == null) {
        return volumeRestores_.size();
      } else {
        return volumeRestoresBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeRestore getVolumeRestores(int index) {
      if (volumeRestoresBuilder_ == null) {
        return volumeRestores_.get(index);
      } else {
        return volumeRestoresBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder setVolumeRestores(int index, com.google.cloud.gkebackup.v1.VolumeRestore value) {
      if (volumeRestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeRestoresIsMutable();
        volumeRestores_.set(index, value);
        onChanged();
      } else {
        volumeRestoresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder setVolumeRestores(
        int index, com.google.cloud.gkebackup.v1.VolumeRestore.Builder builderForValue) {
      if (volumeRestoresBuilder_ == null) {
        ensureVolumeRestoresIsMutable();
        volumeRestores_.set(index, builderForValue.build());
        onChanged();
      } else {
        volumeRestoresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder addVolumeRestores(com.google.cloud.gkebackup.v1.VolumeRestore value) {
      if (volumeRestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeRestoresIsMutable();
        volumeRestores_.add(value);
        onChanged();
      } else {
        volumeRestoresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder addVolumeRestores(int index, com.google.cloud.gkebackup.v1.VolumeRestore value) {
      if (volumeRestoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeRestoresIsMutable();
        volumeRestores_.add(index, value);
        onChanged();
      } else {
        volumeRestoresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder addVolumeRestores(
        com.google.cloud.gkebackup.v1.VolumeRestore.Builder builderForValue) {
      if (volumeRestoresBuilder_ == null) {
        ensureVolumeRestoresIsMutable();
        volumeRestores_.add(builderForValue.build());
        onChanged();
      } else {
        volumeRestoresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder addVolumeRestores(
        int index, com.google.cloud.gkebackup.v1.VolumeRestore.Builder builderForValue) {
      if (volumeRestoresBuilder_ == null) {
        ensureVolumeRestoresIsMutable();
        volumeRestores_.add(index, builderForValue.build());
        onChanged();
      } else {
        volumeRestoresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder addAllVolumeRestores(
        java.lang.Iterable<? extends com.google.cloud.gkebackup.v1.VolumeRestore> values) {
      if (volumeRestoresBuilder_ == null) {
        ensureVolumeRestoresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumeRestores_);
        onChanged();
      } else {
        volumeRestoresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder clearVolumeRestores() {
      if (volumeRestoresBuilder_ == null) {
        volumeRestores_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        volumeRestoresBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public Builder removeVolumeRestores(int index) {
      if (volumeRestoresBuilder_ == null) {
        ensureVolumeRestoresIsMutable();
        volumeRestores_.remove(index);
        onChanged();
      } else {
        volumeRestoresBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeRestore.Builder getVolumeRestoresBuilder(int index) {
      return getVolumeRestoresFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder getVolumeRestoresOrBuilder(
        int index) {
      if (volumeRestoresBuilder_ == null) {
        return volumeRestores_.get(index);
      } else {
        return volumeRestoresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder>
        getVolumeRestoresOrBuilderList() {
      if (volumeRestoresBuilder_ != null) {
        return volumeRestoresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(volumeRestores_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeRestore.Builder addVolumeRestoresBuilder() {
      return getVolumeRestoresFieldBuilder()
          .addBuilder(com.google.cloud.gkebackup.v1.VolumeRestore.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeRestore.Builder addVolumeRestoresBuilder(int index) {
      return getVolumeRestoresFieldBuilder()
          .addBuilder(index, com.google.cloud.gkebackup.v1.VolumeRestore.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of VolumeRestores matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeRestore volume_restores = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.VolumeRestore.Builder>
        getVolumeRestoresBuilderList() {
      return getVolumeRestoresFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.VolumeRestore,
            com.google.cloud.gkebackup.v1.VolumeRestore.Builder,
            com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder>
        getVolumeRestoresFieldBuilder() {
      if (volumeRestoresBuilder_ == null) {
        volumeRestoresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkebackup.v1.VolumeRestore,
                com.google.cloud.gkebackup.v1.VolumeRestore.Builder,
                com.google.cloud.gkebackup.v1.VolumeRestoreOrBuilder>(
                volumeRestores_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        volumeRestores_ = null;
      }
      return volumeRestoresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
     * in a subsequent `ListVolumeRestores` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
     * in a subsequent `ListVolumeRestores` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
     * in a subsequent `ListVolumeRestores` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
     * in a subsequent `ListVolumeRestores` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeRestoresRequest.page_token]
     * in a subsequent `ListVolumeRestores` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.ListVolumeRestoresResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.ListVolumeRestoresResponse)
  private static final com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse();
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVolumeRestoresResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListVolumeRestoresResponse>() {
        @java.lang.Override
        public ListVolumeRestoresResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVolumeRestoresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVolumeRestoresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.ListVolumeRestoresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
