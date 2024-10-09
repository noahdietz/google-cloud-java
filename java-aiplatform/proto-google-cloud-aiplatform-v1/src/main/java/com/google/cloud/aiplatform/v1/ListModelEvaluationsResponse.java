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
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ModelService.ListModelEvaluations][google.cloud.aiplatform.v1.ModelService.ListModelEvaluations].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListModelEvaluationsResponse}
 */
public final class ListModelEvaluationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListModelEvaluationsResponse)
    ListModelEvaluationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListModelEvaluationsResponse.newBuilder() to construct.
  private ListModelEvaluationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListModelEvaluationsResponse() {
    modelEvaluations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListModelEvaluationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListModelEvaluationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListModelEvaluationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.class,
            com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.Builder.class);
  }

  public static final int MODEL_EVALUATIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation> modelEvaluations_;
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation> getModelEvaluationsList() {
    return modelEvaluations_;
  }
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>
      getModelEvaluationsOrBuilderList() {
    return modelEvaluations_;
  }
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  @java.lang.Override
  public int getModelEvaluationsCount() {
    return modelEvaluations_.size();
  }
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelEvaluation getModelEvaluations(int index) {
    return modelEvaluations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder getModelEvaluationsOrBuilder(
      int index) {
    return modelEvaluations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < modelEvaluations_.size(); i++) {
      output.writeMessage(1, modelEvaluations_.get(i));
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
    for (int i = 0; i < modelEvaluations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, modelEvaluations_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse other =
        (com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse) obj;

    if (!getModelEvaluationsList().equals(other.getModelEvaluationsList())) return false;
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
    if (getModelEvaluationsCount() > 0) {
      hash = (37 * hash) + MODEL_EVALUATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getModelEvaluationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse prototype) {
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
   * [ModelService.ListModelEvaluations][google.cloud.aiplatform.v1.ModelService.ListModelEvaluations].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListModelEvaluationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListModelEvaluationsResponse)
      com.google.cloud.aiplatform.v1.ListModelEvaluationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListModelEvaluationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListModelEvaluationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.class,
              com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (modelEvaluationsBuilder_ == null) {
        modelEvaluations_ = java.util.Collections.emptyList();
      } else {
        modelEvaluations_ = null;
        modelEvaluationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListModelEvaluationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse build() {
      com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse result =
          new com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse result) {
      if (modelEvaluationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          modelEvaluations_ = java.util.Collections.unmodifiableList(modelEvaluations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.modelEvaluations_ = modelEvaluations_;
      } else {
        result.modelEvaluations_ = modelEvaluationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse.getDefaultInstance())
        return this;
      if (modelEvaluationsBuilder_ == null) {
        if (!other.modelEvaluations_.isEmpty()) {
          if (modelEvaluations_.isEmpty()) {
            modelEvaluations_ = other.modelEvaluations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelEvaluationsIsMutable();
            modelEvaluations_.addAll(other.modelEvaluations_);
          }
          onChanged();
        }
      } else {
        if (!other.modelEvaluations_.isEmpty()) {
          if (modelEvaluationsBuilder_.isEmpty()) {
            modelEvaluationsBuilder_.dispose();
            modelEvaluationsBuilder_ = null;
            modelEvaluations_ = other.modelEvaluations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelEvaluationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getModelEvaluationsFieldBuilder()
                    : null;
          } else {
            modelEvaluationsBuilder_.addAllMessages(other.modelEvaluations_);
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
                com.google.cloud.aiplatform.v1.ModelEvaluation m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.ModelEvaluation.parser(), extensionRegistry);
                if (modelEvaluationsBuilder_ == null) {
                  ensureModelEvaluationsIsMutable();
                  modelEvaluations_.add(m);
                } else {
                  modelEvaluationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation> modelEvaluations_ =
        java.util.Collections.emptyList();

    private void ensureModelEvaluationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        modelEvaluations_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.ModelEvaluation>(
                modelEvaluations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ModelEvaluation,
            com.google.cloud.aiplatform.v1.ModelEvaluation.Builder,
            com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>
        modelEvaluationsBuilder_;

    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation>
        getModelEvaluationsList() {
      if (modelEvaluationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(modelEvaluations_);
      } else {
        return modelEvaluationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public int getModelEvaluationsCount() {
      if (modelEvaluationsBuilder_ == null) {
        return modelEvaluations_.size();
      } else {
        return modelEvaluationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ModelEvaluation getModelEvaluations(int index) {
      if (modelEvaluationsBuilder_ == null) {
        return modelEvaluations_.get(index);
      } else {
        return modelEvaluationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder setModelEvaluations(
        int index, com.google.cloud.aiplatform.v1.ModelEvaluation value) {
      if (modelEvaluationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.set(index, value);
        onChanged();
      } else {
        modelEvaluationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder setModelEvaluations(
        int index, com.google.cloud.aiplatform.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationsBuilder_ == null) {
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelEvaluationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder addModelEvaluations(com.google.cloud.aiplatform.v1.ModelEvaluation value) {
      if (modelEvaluationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.add(value);
        onChanged();
      } else {
        modelEvaluationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder addModelEvaluations(
        int index, com.google.cloud.aiplatform.v1.ModelEvaluation value) {
      if (modelEvaluationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.add(index, value);
        onChanged();
      } else {
        modelEvaluationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder addModelEvaluations(
        com.google.cloud.aiplatform.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationsBuilder_ == null) {
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.add(builderForValue.build());
        onChanged();
      } else {
        modelEvaluationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder addModelEvaluations(
        int index, com.google.cloud.aiplatform.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationsBuilder_ == null) {
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelEvaluationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder addAllModelEvaluations(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.ModelEvaluation> values) {
      if (modelEvaluationsBuilder_ == null) {
        ensureModelEvaluationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, modelEvaluations_);
        onChanged();
      } else {
        modelEvaluationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder clearModelEvaluations() {
      if (modelEvaluationsBuilder_ == null) {
        modelEvaluations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelEvaluationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public Builder removeModelEvaluations(int index) {
      if (modelEvaluationsBuilder_ == null) {
        ensureModelEvaluationsIsMutable();
        modelEvaluations_.remove(index);
        onChanged();
      } else {
        modelEvaluationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ModelEvaluation.Builder getModelEvaluationsBuilder(
        int index) {
      return getModelEvaluationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder getModelEvaluationsOrBuilder(
        int index) {
      if (modelEvaluationsBuilder_ == null) {
        return modelEvaluations_.get(index);
      } else {
        return modelEvaluationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>
        getModelEvaluationsOrBuilderList() {
      if (modelEvaluationsBuilder_ != null) {
        return modelEvaluationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(modelEvaluations_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ModelEvaluation.Builder addModelEvaluationsBuilder() {
      return getModelEvaluationsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.ModelEvaluation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ModelEvaluation.Builder addModelEvaluationsBuilder(
        int index) {
      return getModelEvaluationsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.ModelEvaluation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ModelEvaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation.Builder>
        getModelEvaluationsBuilderList() {
      return getModelEvaluationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ModelEvaluation,
            com.google.cloud.aiplatform.v1.ModelEvaluation.Builder,
            com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>
        getModelEvaluationsFieldBuilder() {
      if (modelEvaluationsBuilder_ == null) {
        modelEvaluationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.ModelEvaluation,
                com.google.cloud.aiplatform.v1.ModelEvaluation.Builder,
                com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>(
                modelEvaluations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        modelEvaluations_ = null;
      }
      return modelEvaluationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListModelEvaluationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListModelEvaluationsResponse)
  private static final com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelEvaluationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListModelEvaluationsResponse>() {
        @java.lang.Override
        public ListModelEvaluationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListModelEvaluationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelEvaluationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListModelEvaluationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
