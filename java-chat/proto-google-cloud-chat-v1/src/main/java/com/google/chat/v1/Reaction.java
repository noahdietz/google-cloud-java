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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * A reaction to a message.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.Reaction}
 */
public final class Reaction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.Reaction)
    ReactionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Reaction.newBuilder() to construct.
  private Reaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Reaction() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Reaction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Reaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.ReactionProto
        .internal_static_google_chat_v1_Reaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.Reaction.class, com.google.chat.v1.Reaction.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The resource name of the reaction.
   *
   * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the reaction.
   *
   * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIELD_NUMBER = 2;
  private com.google.chat.v1.User user_;
  /**
   *
   *
   * <pre>
   * Output only. The user who created the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. The user who created the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The user.
   */
  @java.lang.Override
  public com.google.chat.v1.User getUser() {
    return user_ == null ? com.google.chat.v1.User.getDefaultInstance() : user_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The user who created the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.chat.v1.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.google.chat.v1.User.getDefaultInstance() : user_;
  }

  public static final int EMOJI_FIELD_NUMBER = 3;
  private com.google.chat.v1.Emoji emoji_;
  /**
   *
   *
   * <pre>
   * The emoji used in the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 3;</code>
   *
   * @return Whether the emoji field is set.
   */
  @java.lang.Override
  public boolean hasEmoji() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The emoji used in the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 3;</code>
   *
   * @return The emoji.
   */
  @java.lang.Override
  public com.google.chat.v1.Emoji getEmoji() {
    return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
  }
  /**
   *
   *
   * <pre>
   * The emoji used in the reaction.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 3;</code>
   */
  @java.lang.Override
  public com.google.chat.v1.EmojiOrBuilder getEmojiOrBuilder() {
    return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getEmoji());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEmoji());
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
    if (!(obj instanceof com.google.chat.v1.Reaction)) {
      return super.equals(obj);
    }
    com.google.chat.v1.Reaction other = (com.google.chat.v1.Reaction) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser().equals(other.getUser())) return false;
    }
    if (hasEmoji() != other.hasEmoji()) return false;
    if (hasEmoji()) {
      if (!getEmoji().equals(other.getEmoji())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (hasEmoji()) {
      hash = (37 * hash) + EMOJI_FIELD_NUMBER;
      hash = (53 * hash) + getEmoji().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.Reaction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Reaction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Reaction parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Reaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Reaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Reaction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Reaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Reaction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Reaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Reaction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Reaction parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Reaction parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.Reaction prototype) {
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
   * A reaction to a message.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.Reaction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.Reaction)
      com.google.chat.v1.ReactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Reaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.ReactionProto
          .internal_static_google_chat_v1_Reaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.Reaction.class, com.google.chat.v1.Reaction.Builder.class);
    }

    // Construct using com.google.chat.v1.Reaction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserFieldBuilder();
        getEmojiFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      emoji_ = null;
      if (emojiBuilder_ != null) {
        emojiBuilder_.dispose();
        emojiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Reaction_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.Reaction getDefaultInstanceForType() {
      return com.google.chat.v1.Reaction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.Reaction build() {
      com.google.chat.v1.Reaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.Reaction buildPartial() {
      com.google.chat.v1.Reaction result = new com.google.chat.v1.Reaction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.Reaction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.user_ = userBuilder_ == null ? user_ : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.emoji_ = emojiBuilder_ == null ? emoji_ : emojiBuilder_.build();
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
      if (other instanceof com.google.chat.v1.Reaction) {
        return mergeFrom((com.google.chat.v1.Reaction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.Reaction other) {
      if (other == com.google.chat.v1.Reaction.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasEmoji()) {
        mergeEmoji(other.getEmoji());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUserFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getEmojiFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the reaction.
     *
     * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the reaction.
     *
     * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the reaction.
     *
     * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the reaction.
     *
     * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the reaction.
     *
     * Format: `spaces/{space}/messages/{message}/reactions/{reaction}`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.chat.v1.User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.User,
            com.google.chat.v1.User.Builder,
            com.google.chat.v1.UserOrBuilder>
        userBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The user.
     */
    public com.google.chat.v1.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.google.chat.v1.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setUser(com.google.chat.v1.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setUser(com.google.chat.v1.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeUser(com.google.chat.v1.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && user_ != null
            && user_ != com.google.chat.v1.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000002);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.chat.v1.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.chat.v1.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ? com.google.chat.v1.User.getDefaultInstance() : user_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The user who created the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.User user = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.User,
            com.google.chat.v1.User.Builder,
            com.google.chat.v1.UserOrBuilder>
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.User,
                com.google.chat.v1.User.Builder,
                com.google.chat.v1.UserOrBuilder>(getUser(), getParentForChildren(), isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.google.chat.v1.Emoji emoji_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Emoji,
            com.google.chat.v1.Emoji.Builder,
            com.google.chat.v1.EmojiOrBuilder>
        emojiBuilder_;
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     *
     * @return Whether the emoji field is set.
     */
    public boolean hasEmoji() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     *
     * @return The emoji.
     */
    public com.google.chat.v1.Emoji getEmoji() {
      if (emojiBuilder_ == null) {
        return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
      } else {
        return emojiBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public Builder setEmoji(com.google.chat.v1.Emoji value) {
      if (emojiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        emoji_ = value;
      } else {
        emojiBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public Builder setEmoji(com.google.chat.v1.Emoji.Builder builderForValue) {
      if (emojiBuilder_ == null) {
        emoji_ = builderForValue.build();
      } else {
        emojiBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public Builder mergeEmoji(com.google.chat.v1.Emoji value) {
      if (emojiBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && emoji_ != null
            && emoji_ != com.google.chat.v1.Emoji.getDefaultInstance()) {
          getEmojiBuilder().mergeFrom(value);
        } else {
          emoji_ = value;
        }
      } else {
        emojiBuilder_.mergeFrom(value);
      }
      if (emoji_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public Builder clearEmoji() {
      bitField0_ = (bitField0_ & ~0x00000004);
      emoji_ = null;
      if (emojiBuilder_ != null) {
        emojiBuilder_.dispose();
        emojiBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public com.google.chat.v1.Emoji.Builder getEmojiBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEmojiFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    public com.google.chat.v1.EmojiOrBuilder getEmojiOrBuilder() {
      if (emojiBuilder_ != null) {
        return emojiBuilder_.getMessageOrBuilder();
      } else {
        return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
      }
    }
    /**
     *
     *
     * <pre>
     * The emoji used in the reaction.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Emoji,
            com.google.chat.v1.Emoji.Builder,
            com.google.chat.v1.EmojiOrBuilder>
        getEmojiFieldBuilder() {
      if (emojiBuilder_ == null) {
        emojiBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.Emoji,
                com.google.chat.v1.Emoji.Builder,
                com.google.chat.v1.EmojiOrBuilder>(getEmoji(), getParentForChildren(), isClean());
        emoji_ = null;
      }
      return emojiBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.Reaction)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.Reaction)
  private static final com.google.chat.v1.Reaction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.Reaction();
  }

  public static com.google.chat.v1.Reaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reaction> PARSER =
      new com.google.protobuf.AbstractParser<Reaction>() {
        @java.lang.Override
        public Reaction parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.Reaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
