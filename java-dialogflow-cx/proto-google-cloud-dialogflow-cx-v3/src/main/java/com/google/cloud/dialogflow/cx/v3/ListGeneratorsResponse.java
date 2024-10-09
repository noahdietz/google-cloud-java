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
// source: google/cloud/dialogflow/cx/v3/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for
 * [Generators.ListGenerators][google.cloud.dialogflow.cx.v3.Generators.ListGenerators].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListGeneratorsResponse}
 */
public final class ListGeneratorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ListGeneratorsResponse)
    ListGeneratorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListGeneratorsResponse.newBuilder() to construct.
  private ListGeneratorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListGeneratorsResponse() {
    generators_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListGeneratorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.GeneratorProto
        .internal_static_google_cloud_dialogflow_cx_v3_ListGeneratorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.GeneratorProto
        .internal_static_google_cloud_dialogflow_cx_v3_ListGeneratorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.class,
            com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.Builder.class);
  }

  public static final int GENERATORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3.Generator> generators_;
  /**
   *
   *
   * <pre>
   * The list of generators. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.Generator> getGeneratorsList() {
    return generators_;
  }
  /**
   *
   *
   * <pre>
   * The list of generators. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder>
      getGeneratorsOrBuilderList() {
    return generators_;
  }
  /**
   *
   *
   * <pre>
   * The list of generators. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
   */
  @java.lang.Override
  public int getGeneratorsCount() {
    return generators_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of generators. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Generator getGenerators(int index) {
    return generators_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of generators. There will be a maximum number of items returned
   * based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder getGeneratorsOrBuilder(int index) {
    return generators_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < generators_.size(); i++) {
      output.writeMessage(1, generators_.get(i));
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
    for (int i = 0; i < generators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, generators_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse other =
        (com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse) obj;

    if (!getGeneratorsList().equals(other.getGeneratorsList())) return false;
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
    if (getGeneratorsCount() > 0) {
      hash = (37 * hash) + GENERATORS_FIELD_NUMBER;
      hash = (53 * hash) + getGeneratorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse parseFrom(
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
      com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse prototype) {
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
   * The response message for
   * [Generators.ListGenerators][google.cloud.dialogflow.cx.v3.Generators.ListGenerators].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListGeneratorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ListGeneratorsResponse)
      com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.GeneratorProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListGeneratorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.GeneratorProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListGeneratorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.class,
              com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (generatorsBuilder_ == null) {
        generators_ = java.util.Collections.emptyList();
      } else {
        generators_ = null;
        generatorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.GeneratorProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListGeneratorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse build() {
      com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse result =
          new com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse result) {
      if (generatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          generators_ = java.util.Collections.unmodifiableList(generators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.generators_ = generators_;
      } else {
        result.generators_ = generatorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse.getDefaultInstance())
        return this;
      if (generatorsBuilder_ == null) {
        if (!other.generators_.isEmpty()) {
          if (generators_.isEmpty()) {
            generators_ = other.generators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGeneratorsIsMutable();
            generators_.addAll(other.generators_);
          }
          onChanged();
        }
      } else {
        if (!other.generators_.isEmpty()) {
          if (generatorsBuilder_.isEmpty()) {
            generatorsBuilder_.dispose();
            generatorsBuilder_ = null;
            generators_ = other.generators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            generatorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGeneratorsFieldBuilder()
                    : null;
          } else {
            generatorsBuilder_.addAllMessages(other.generators_);
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
                com.google.cloud.dialogflow.cx.v3.Generator m =
                    input.readMessage(
                        com.google.cloud.dialogflow.cx.v3.Generator.parser(), extensionRegistry);
                if (generatorsBuilder_ == null) {
                  ensureGeneratorsIsMutable();
                  generators_.add(m);
                } else {
                  generatorsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3.Generator> generators_ =
        java.util.Collections.emptyList();

    private void ensureGeneratorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        generators_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.Generator>(generators_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Generator,
            com.google.cloud.dialogflow.cx.v3.Generator.Builder,
            com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder>
        generatorsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Generator> getGeneratorsList() {
      if (generatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(generators_);
      } else {
        return generatorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public int getGeneratorsCount() {
      if (generatorsBuilder_ == null) {
        return generators_.size();
      } else {
        return generatorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Generator getGenerators(int index) {
      if (generatorsBuilder_ == null) {
        return generators_.get(index);
      } else {
        return generatorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder setGenerators(int index, com.google.cloud.dialogflow.cx.v3.Generator value) {
      if (generatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeneratorsIsMutable();
        generators_.set(index, value);
        onChanged();
      } else {
        generatorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder setGenerators(
        int index, com.google.cloud.dialogflow.cx.v3.Generator.Builder builderForValue) {
      if (generatorsBuilder_ == null) {
        ensureGeneratorsIsMutable();
        generators_.set(index, builderForValue.build());
        onChanged();
      } else {
        generatorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder addGenerators(com.google.cloud.dialogflow.cx.v3.Generator value) {
      if (generatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeneratorsIsMutable();
        generators_.add(value);
        onChanged();
      } else {
        generatorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder addGenerators(int index, com.google.cloud.dialogflow.cx.v3.Generator value) {
      if (generatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeneratorsIsMutable();
        generators_.add(index, value);
        onChanged();
      } else {
        generatorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder addGenerators(
        com.google.cloud.dialogflow.cx.v3.Generator.Builder builderForValue) {
      if (generatorsBuilder_ == null) {
        ensureGeneratorsIsMutable();
        generators_.add(builderForValue.build());
        onChanged();
      } else {
        generatorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder addGenerators(
        int index, com.google.cloud.dialogflow.cx.v3.Generator.Builder builderForValue) {
      if (generatorsBuilder_ == null) {
        ensureGeneratorsIsMutable();
        generators_.add(index, builderForValue.build());
        onChanged();
      } else {
        generatorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder addAllGenerators(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.Generator> values) {
      if (generatorsBuilder_ == null) {
        ensureGeneratorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, generators_);
        onChanged();
      } else {
        generatorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder clearGenerators() {
      if (generatorsBuilder_ == null) {
        generators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        generatorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public Builder removeGenerators(int index) {
      if (generatorsBuilder_ == null) {
        ensureGeneratorsIsMutable();
        generators_.remove(index);
        onChanged();
      } else {
        generatorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Generator.Builder getGeneratorsBuilder(int index) {
      return getGeneratorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder getGeneratorsOrBuilder(int index) {
      if (generatorsBuilder_ == null) {
        return generators_.get(index);
      } else {
        return generatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder>
        getGeneratorsOrBuilderList() {
      if (generatorsBuilder_ != null) {
        return generatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(generators_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Generator.Builder addGeneratorsBuilder() {
      return getGeneratorsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.cx.v3.Generator.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Generator.Builder addGeneratorsBuilder(int index) {
      return getGeneratorsFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.cx.v3.Generator.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of generators. There will be a maximum number of items returned
     * based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Generator generators = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Generator.Builder>
        getGeneratorsBuilderList() {
      return getGeneratorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Generator,
            com.google.cloud.dialogflow.cx.v3.Generator.Builder,
            com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder>
        getGeneratorsFieldBuilder() {
      if (generatorsBuilder_ == null) {
        generatorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.Generator,
                com.google.cloud.dialogflow.cx.v3.Generator.Builder,
                com.google.cloud.dialogflow.cx.v3.GeneratorOrBuilder>(
                generators_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        generators_ = null;
      }
      return generatorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ListGeneratorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListGeneratorsResponse)
  private static final com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGeneratorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListGeneratorsResponse>() {
        @java.lang.Override
        public ListGeneratorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListGeneratorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListGeneratorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ListGeneratorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
