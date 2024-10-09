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
// source: google/cloud/discoveryengine/v1alpha/engine_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for
 * [EngineService.ListEngines][google.cloud.discoveryengine.v1alpha.EngineService.ListEngines]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.ListEnginesResponse}
 */
public final class ListEnginesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.ListEnginesResponse)
    ListEnginesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEnginesResponse.newBuilder() to construct.
  private ListEnginesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEnginesResponse() {
    engines_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEnginesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.class,
            com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.Builder.class);
  }

  public static final int ENGINES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.discoveryengine.v1alpha.Engine> engines_;
  /**
   *
   *
   * <pre>
   * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.discoveryengine.v1alpha.Engine> getEnginesList() {
    return engines_;
  }
  /**
   *
   *
   * <pre>
   * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder>
      getEnginesOrBuilderList() {
    return engines_;
  }
  /**
   *
   *
   * <pre>
   * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
   */
  @java.lang.Override
  public int getEnginesCount() {
    return engines_.size();
  }
  /**
   *
   *
   * <pre>
   * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.Engine getEngines(int index) {
    return engines_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder getEnginesOrBuilder(int index) {
    return engines_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Not supported.
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
   * Not supported.
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
    for (int i = 0; i < engines_.size(); i++) {
      output.writeMessage(1, engines_.get(i));
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
    for (int i = 0; i < engines_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, engines_.get(i));
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse other =
        (com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse) obj;

    if (!getEnginesList().equals(other.getEnginesList())) return false;
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
    if (getEnginesCount() > 0) {
      hash = (37 * hash) + ENGINES_FIELD_NUMBER;
      hash = (53 * hash) + getEnginesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse prototype) {
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
   * Response message for
   * [EngineService.ListEngines][google.cloud.discoveryengine.v1alpha.EngineService.ListEngines]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.ListEnginesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.ListEnginesResponse)
      com.google.cloud.discoveryengine.v1alpha.ListEnginesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.class,
              com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (enginesBuilder_ == null) {
        engines_ = java.util.Collections.emptyList();
      } else {
        engines_ = null;
        enginesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ListEnginesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse build() {
      com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse result =
          new com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse result) {
      if (enginesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          engines_ = java.util.Collections.unmodifiableList(engines_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.engines_ = engines_;
      } else {
        result.engines_ = enginesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse result) {
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse other) {
      if (other
          == com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse.getDefaultInstance())
        return this;
      if (enginesBuilder_ == null) {
        if (!other.engines_.isEmpty()) {
          if (engines_.isEmpty()) {
            engines_ = other.engines_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEnginesIsMutable();
            engines_.addAll(other.engines_);
          }
          onChanged();
        }
      } else {
        if (!other.engines_.isEmpty()) {
          if (enginesBuilder_.isEmpty()) {
            enginesBuilder_.dispose();
            enginesBuilder_ = null;
            engines_ = other.engines_;
            bitField0_ = (bitField0_ & ~0x00000001);
            enginesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEnginesFieldBuilder()
                    : null;
          } else {
            enginesBuilder_.addAllMessages(other.engines_);
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
                com.google.cloud.discoveryengine.v1alpha.Engine m =
                    input.readMessage(
                        com.google.cloud.discoveryengine.v1alpha.Engine.parser(),
                        extensionRegistry);
                if (enginesBuilder_ == null) {
                  ensureEnginesIsMutable();
                  engines_.add(m);
                } else {
                  enginesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.discoveryengine.v1alpha.Engine> engines_ =
        java.util.Collections.emptyList();

    private void ensureEnginesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        engines_ =
            new java.util.ArrayList<com.google.cloud.discoveryengine.v1alpha.Engine>(engines_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1alpha.Engine,
            com.google.cloud.discoveryengine.v1alpha.Engine.Builder,
            com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder>
        enginesBuilder_;

    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1alpha.Engine> getEnginesList() {
      if (enginesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(engines_);
      } else {
        return enginesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public int getEnginesCount() {
      if (enginesBuilder_ == null) {
        return engines_.size();
      } else {
        return enginesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1alpha.Engine getEngines(int index) {
      if (enginesBuilder_ == null) {
        return engines_.get(index);
      } else {
        return enginesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder setEngines(int index, com.google.cloud.discoveryengine.v1alpha.Engine value) {
      if (enginesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnginesIsMutable();
        engines_.set(index, value);
        onChanged();
      } else {
        enginesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder setEngines(
        int index, com.google.cloud.discoveryengine.v1alpha.Engine.Builder builderForValue) {
      if (enginesBuilder_ == null) {
        ensureEnginesIsMutable();
        engines_.set(index, builderForValue.build());
        onChanged();
      } else {
        enginesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder addEngines(com.google.cloud.discoveryengine.v1alpha.Engine value) {
      if (enginesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnginesIsMutable();
        engines_.add(value);
        onChanged();
      } else {
        enginesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder addEngines(int index, com.google.cloud.discoveryengine.v1alpha.Engine value) {
      if (enginesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnginesIsMutable();
        engines_.add(index, value);
        onChanged();
      } else {
        enginesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder addEngines(
        com.google.cloud.discoveryengine.v1alpha.Engine.Builder builderForValue) {
      if (enginesBuilder_ == null) {
        ensureEnginesIsMutable();
        engines_.add(builderForValue.build());
        onChanged();
      } else {
        enginesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder addEngines(
        int index, com.google.cloud.discoveryengine.v1alpha.Engine.Builder builderForValue) {
      if (enginesBuilder_ == null) {
        ensureEnginesIsMutable();
        engines_.add(index, builderForValue.build());
        onChanged();
      } else {
        enginesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder addAllEngines(
        java.lang.Iterable<? extends com.google.cloud.discoveryengine.v1alpha.Engine> values) {
      if (enginesBuilder_ == null) {
        ensureEnginesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, engines_);
        onChanged();
      } else {
        enginesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder clearEngines() {
      if (enginesBuilder_ == null) {
        engines_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        enginesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public Builder removeEngines(int index) {
      if (enginesBuilder_ == null) {
        ensureEnginesIsMutable();
        engines_.remove(index);
        onChanged();
      } else {
        enginesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1alpha.Engine.Builder getEnginesBuilder(int index) {
      return getEnginesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder getEnginesOrBuilder(int index) {
      if (enginesBuilder_ == null) {
        return engines_.get(index);
      } else {
        return enginesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder>
        getEnginesOrBuilderList() {
      if (enginesBuilder_ != null) {
        return enginesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(engines_);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1alpha.Engine.Builder addEnginesBuilder() {
      return getEnginesFieldBuilder()
          .addBuilder(com.google.cloud.discoveryengine.v1alpha.Engine.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1alpha.Engine.Builder addEnginesBuilder(int index) {
      return getEnginesFieldBuilder()
          .addBuilder(index, com.google.cloud.discoveryengine.v1alpha.Engine.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the customer's [Engine][google.cloud.discoveryengine.v1alpha.Engine]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1alpha.Engine engines = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1alpha.Engine.Builder>
        getEnginesBuilderList() {
      return getEnginesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1alpha.Engine,
            com.google.cloud.discoveryengine.v1alpha.Engine.Builder,
            com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder>
        getEnginesFieldBuilder() {
      if (enginesBuilder_ == null) {
        enginesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.discoveryengine.v1alpha.Engine,
                com.google.cloud.discoveryengine.v1alpha.Engine.Builder,
                com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder>(
                engines_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        engines_ = null;
      }
      return enginesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Not supported.
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
     * Not supported.
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
     * Not supported.
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
     * Not supported.
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
     * Not supported.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.ListEnginesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.ListEnginesResponse)
  private static final com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse();
  }

  public static com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEnginesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEnginesResponse>() {
        @java.lang.Override
        public ListEnginesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEnginesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEnginesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.ListEnginesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
