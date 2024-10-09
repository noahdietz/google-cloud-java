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
// source: google/cloud/support/v2/comment_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.support.v2;

/**
 *
 *
 * <pre>
 * The response message for the ListComments endpoint.
 * </pre>
 *
 * Protobuf type {@code google.cloud.support.v2.ListCommentsResponse}
 */
public final class ListCommentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.support.v2.ListCommentsResponse)
    ListCommentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCommentsResponse.newBuilder() to construct.
  private ListCommentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCommentsResponse() {
    comments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCommentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.support.v2.CommentServiceProto
        .internal_static_google_cloud_support_v2_ListCommentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.support.v2.CommentServiceProto
        .internal_static_google_cloud_support_v2_ListCommentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.support.v2.ListCommentsResponse.class,
            com.google.cloud.support.v2.ListCommentsResponse.Builder.class);
  }

  public static final int COMMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.support.v2.Comment> comments_;
  /**
   *
   *
   * <pre>
   * The list of Comments associated with the given Case.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.support.v2.Comment> getCommentsList() {
    return comments_;
  }
  /**
   *
   *
   * <pre>
   * The list of Comments associated with the given Case.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.support.v2.CommentOrBuilder>
      getCommentsOrBuilderList() {
    return comments_;
  }
  /**
   *
   *
   * <pre>
   * The list of Comments associated with the given Case.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
   */
  @java.lang.Override
  public int getCommentsCount() {
    return comments_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Comments associated with the given Case.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.Comment getComments(int index) {
    return comments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Comments associated with the given Case.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.CommentOrBuilder getCommentsOrBuilder(int index) {
    return comments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of subsequent `ListCommentsRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
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
   * A token to retrieve the next page of results. This should be set in the
   * `page_token` field of subsequent `ListCommentsRequest` message that is
   * issued. If unspecified, there are no more results to retrieve.
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
    for (int i = 0; i < comments_.size(); i++) {
      output.writeMessage(1, comments_.get(i));
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
    for (int i = 0; i < comments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, comments_.get(i));
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
    if (!(obj instanceof com.google.cloud.support.v2.ListCommentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.support.v2.ListCommentsResponse other =
        (com.google.cloud.support.v2.ListCommentsResponse) obj;

    if (!getCommentsList().equals(other.getCommentsList())) return false;
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
    if (getCommentsCount() > 0) {
      hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.ListCommentsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.support.v2.ListCommentsResponse prototype) {
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
   * The response message for the ListComments endpoint.
   * </pre>
   *
   * Protobuf type {@code google.cloud.support.v2.ListCommentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.support.v2.ListCommentsResponse)
      com.google.cloud.support.v2.ListCommentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.support.v2.CommentServiceProto
          .internal_static_google_cloud_support_v2_ListCommentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.support.v2.CommentServiceProto
          .internal_static_google_cloud_support_v2_ListCommentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.support.v2.ListCommentsResponse.class,
              com.google.cloud.support.v2.ListCommentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.support.v2.ListCommentsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (commentsBuilder_ == null) {
        comments_ = java.util.Collections.emptyList();
      } else {
        comments_ = null;
        commentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.support.v2.CommentServiceProto
          .internal_static_google_cloud_support_v2_ListCommentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCommentsResponse getDefaultInstanceForType() {
      return com.google.cloud.support.v2.ListCommentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCommentsResponse build() {
      com.google.cloud.support.v2.ListCommentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.ListCommentsResponse buildPartial() {
      com.google.cloud.support.v2.ListCommentsResponse result =
          new com.google.cloud.support.v2.ListCommentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.support.v2.ListCommentsResponse result) {
      if (commentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          comments_ = java.util.Collections.unmodifiableList(comments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.comments_ = comments_;
      } else {
        result.comments_ = commentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.support.v2.ListCommentsResponse result) {
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
      if (other instanceof com.google.cloud.support.v2.ListCommentsResponse) {
        return mergeFrom((com.google.cloud.support.v2.ListCommentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.support.v2.ListCommentsResponse other) {
      if (other == com.google.cloud.support.v2.ListCommentsResponse.getDefaultInstance())
        return this;
      if (commentsBuilder_ == null) {
        if (!other.comments_.isEmpty()) {
          if (comments_.isEmpty()) {
            comments_ = other.comments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommentsIsMutable();
            comments_.addAll(other.comments_);
          }
          onChanged();
        }
      } else {
        if (!other.comments_.isEmpty()) {
          if (commentsBuilder_.isEmpty()) {
            commentsBuilder_.dispose();
            commentsBuilder_ = null;
            comments_ = other.comments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCommentsFieldBuilder()
                    : null;
          } else {
            commentsBuilder_.addAllMessages(other.comments_);
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
                com.google.cloud.support.v2.Comment m =
                    input.readMessage(
                        com.google.cloud.support.v2.Comment.parser(), extensionRegistry);
                if (commentsBuilder_ == null) {
                  ensureCommentsIsMutable();
                  comments_.add(m);
                } else {
                  commentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.support.v2.Comment> comments_ =
        java.util.Collections.emptyList();

    private void ensureCommentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        comments_ = new java.util.ArrayList<com.google.cloud.support.v2.Comment>(comments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.Comment,
            com.google.cloud.support.v2.Comment.Builder,
            com.google.cloud.support.v2.CommentOrBuilder>
        commentsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.Comment> getCommentsList() {
      if (commentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(comments_);
      } else {
        return commentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public int getCommentsCount() {
      if (commentsBuilder_ == null) {
        return comments_.size();
      } else {
        return commentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public com.google.cloud.support.v2.Comment getComments(int index) {
      if (commentsBuilder_ == null) {
        return comments_.get(index);
      } else {
        return commentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder setComments(int index, com.google.cloud.support.v2.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.set(index, value);
        onChanged();
      } else {
        commentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder setComments(
        int index, com.google.cloud.support.v2.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.set(index, builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder addComments(com.google.cloud.support.v2.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.add(value);
        onChanged();
      } else {
        commentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder addComments(int index, com.google.cloud.support.v2.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.add(index, value);
        onChanged();
      } else {
        commentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder addComments(com.google.cloud.support.v2.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.add(builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder addComments(
        int index, com.google.cloud.support.v2.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.add(index, builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder addAllComments(
        java.lang.Iterable<? extends com.google.cloud.support.v2.Comment> values) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, comments_);
        onChanged();
      } else {
        commentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder clearComments() {
      if (commentsBuilder_ == null) {
        comments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public Builder removeComments(int index) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.remove(index);
        onChanged();
      } else {
        commentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public com.google.cloud.support.v2.Comment.Builder getCommentsBuilder(int index) {
      return getCommentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public com.google.cloud.support.v2.CommentOrBuilder getCommentsOrBuilder(int index) {
      if (commentsBuilder_ == null) {
        return comments_.get(index);
      } else {
        return commentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.support.v2.CommentOrBuilder>
        getCommentsOrBuilderList() {
      if (commentsBuilder_ != null) {
        return commentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(comments_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public com.google.cloud.support.v2.Comment.Builder addCommentsBuilder() {
      return getCommentsFieldBuilder()
          .addBuilder(com.google.cloud.support.v2.Comment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public com.google.cloud.support.v2.Comment.Builder addCommentsBuilder(int index) {
      return getCommentsFieldBuilder()
          .addBuilder(index, com.google.cloud.support.v2.Comment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Comments associated with the given Case.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.Comment comments = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.Comment.Builder> getCommentsBuilderList() {
      return getCommentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.Comment,
            com.google.cloud.support.v2.Comment.Builder,
            com.google.cloud.support.v2.CommentOrBuilder>
        getCommentsFieldBuilder() {
      if (commentsBuilder_ == null) {
        commentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.support.v2.Comment,
                com.google.cloud.support.v2.Comment.Builder,
                com.google.cloud.support.v2.CommentOrBuilder>(
                comments_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        comments_ = null;
      }
      return commentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of subsequent `ListCommentsRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
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
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of subsequent `ListCommentsRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
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
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of subsequent `ListCommentsRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
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
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of subsequent `ListCommentsRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
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
     * A token to retrieve the next page of results. This should be set in the
     * `page_token` field of subsequent `ListCommentsRequest` message that is
     * issued. If unspecified, there are no more results to retrieve.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.support.v2.ListCommentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.support.v2.ListCommentsResponse)
  private static final com.google.cloud.support.v2.ListCommentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.support.v2.ListCommentsResponse();
  }

  public static com.google.cloud.support.v2.ListCommentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCommentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCommentsResponse>() {
        @java.lang.Override
        public ListCommentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCommentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCommentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.support.v2.ListCommentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
