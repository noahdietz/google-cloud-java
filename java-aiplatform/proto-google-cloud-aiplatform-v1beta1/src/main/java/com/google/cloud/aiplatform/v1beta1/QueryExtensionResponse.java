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
// source: google/cloud/aiplatform/v1beta1/extension_execution_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ExtensionExecutionService.QueryExtension][google.cloud.aiplatform.v1beta1.ExtensionExecutionService.QueryExtension].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.QueryExtensionResponse}
 */
public final class QueryExtensionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.QueryExtensionResponse)
    QueryExtensionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryExtensionResponse.newBuilder() to construct.
  private QueryExtensionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryExtensionResponse() {
    steps_ = java.util.Collections.emptyList();
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryExtensionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ExtensionExecutionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_QueryExtensionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExtensionExecutionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_QueryExtensionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.class,
            com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.Builder.class);
  }

  public static final int STEPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Content> steps_;
  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Content> getStepsList() {
    return steps_;
  }
  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
      getStepsOrBuilderList() {
    return steps_;
  }
  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  @java.lang.Override
  public int getStepsCount() {
    return steps_.size();
  }
  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Content getSteps(int index) {
    return steps_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ContentOrBuilder getStepsOrBuilder(int index) {
    return steps_.get(index);
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object failureMessage_ = "";
  /**
   *
   *
   * <pre>
   * Failure message if any.
   * </pre>
   *
   * <code>string failure_message = 2;</code>
   *
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Failure message if any.
   * </pre>
   *
   * <code>string failure_message = 2;</code>
   *
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      failureMessage_ = b;
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
    for (int i = 0; i < steps_.size(); i++) {
      output.writeMessage(1, steps_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, failureMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < steps_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, steps_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, failureMessage_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse other =
        (com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse) obj;

    if (!getStepsList().equals(other.getStepsList())) return false;
    if (!getFailureMessage().equals(other.getFailureMessage())) return false;
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
    if (getStepsCount() > 0) {
      hash = (37 * hash) + STEPS_FIELD_NUMBER;
      hash = (53 * hash) + getStepsList().hashCode();
    }
    hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse prototype) {
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
   * [ExtensionExecutionService.QueryExtension][google.cloud.aiplatform.v1beta1.ExtensionExecutionService.QueryExtension].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.QueryExtensionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.QueryExtensionResponse)
      com.google.cloud.aiplatform.v1beta1.QueryExtensionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExtensionExecutionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryExtensionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExtensionExecutionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryExtensionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.class,
              com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
      } else {
        steps_ = null;
        stepsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      failureMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExtensionExecutionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_QueryExtensionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse build() {
      com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse result =
          new com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse result) {
      if (stepsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          steps_ = java.util.Collections.unmodifiableList(steps_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.steps_ = steps_;
      } else {
        result.steps_ = stepsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failureMessage_ = failureMessage_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse.getDefaultInstance())
        return this;
      if (stepsBuilder_ == null) {
        if (!other.steps_.isEmpty()) {
          if (steps_.isEmpty()) {
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStepsIsMutable();
            steps_.addAll(other.steps_);
          }
          onChanged();
        }
      } else {
        if (!other.steps_.isEmpty()) {
          if (stepsBuilder_.isEmpty()) {
            stepsBuilder_.dispose();
            stepsBuilder_ = null;
            steps_ = other.steps_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stepsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStepsFieldBuilder()
                    : null;
          } else {
            stepsBuilder_.addAllMessages(other.steps_);
          }
        }
      }
      if (!other.getFailureMessage().isEmpty()) {
        failureMessage_ = other.failureMessage_;
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
                com.google.cloud.aiplatform.v1beta1.Content m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Content.parser(), extensionRegistry);
                if (stepsBuilder_ == null) {
                  ensureStepsIsMutable();
                  steps_.add(m);
                } else {
                  stepsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                failureMessage_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Content> steps_ =
        java.util.Collections.emptyList();

    private void ensureStepsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        steps_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Content>(steps_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Content,
            com.google.cloud.aiplatform.v1beta1.Content.Builder,
            com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
        stepsBuilder_;

    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Content> getStepsList() {
      if (stepsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(steps_);
      } else {
        return stepsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public int getStepsCount() {
      if (stepsBuilder_ == null) {
        return steps_.size();
      } else {
        return stepsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Content getSteps(int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);
      } else {
        return stepsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder setSteps(int index, com.google.cloud.aiplatform.v1beta1.Content value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.set(index, value);
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder setSteps(
        int index, com.google.cloud.aiplatform.v1beta1.Content.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.set(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder addSteps(com.google.cloud.aiplatform.v1beta1.Content value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder addSteps(int index, com.google.cloud.aiplatform.v1beta1.Content value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStepsIsMutable();
        steps_.add(index, value);
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder addSteps(com.google.cloud.aiplatform.v1beta1.Content.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder addSteps(
        int index, com.google.cloud.aiplatform.v1beta1.Content.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.add(index, builderForValue.build());
        onChanged();
      } else {
        stepsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder addAllSteps(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Content> values) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, steps_);
        onChanged();
      } else {
        stepsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder clearSteps() {
      if (stepsBuilder_ == null) {
        steps_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stepsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public Builder removeSteps(int index) {
      if (stepsBuilder_ == null) {
        ensureStepsIsMutable();
        steps_.remove(index);
        onChanged();
      } else {
        stepsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Content.Builder getStepsBuilder(int index) {
      return getStepsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ContentOrBuilder getStepsOrBuilder(int index) {
      if (stepsBuilder_ == null) {
        return steps_.get(index);
      } else {
        return stepsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
        getStepsOrBuilderList() {
      if (stepsBuilder_ != null) {
        return stepsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(steps_);
      }
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Content.Builder addStepsBuilder() {
      return getStepsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Content.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Content.Builder addStepsBuilder(int index) {
      return getStepsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Content.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Steps of extension or LLM interaction, can contain function call,
     * function response, or text response. The last step contains the final
     * response to the query.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Content.Builder>
        getStepsBuilderList() {
      return getStepsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Content,
            com.google.cloud.aiplatform.v1beta1.Content.Builder,
            com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
        getStepsFieldBuilder() {
      if (stepsBuilder_ == null) {
        stepsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Content,
                com.google.cloud.aiplatform.v1beta1.Content.Builder,
                com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>(
                steps_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        steps_ = null;
      }
      return stepsBuilder_;
    }

    private java.lang.Object failureMessage_ = "";
    /**
     *
     *
     * <pre>
     * Failure message if any.
     * </pre>
     *
     * <code>string failure_message = 2;</code>
     *
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Failure message if any.
     * </pre>
     *
     * <code>string failure_message = 2;</code>
     *
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Failure message if any.
     * </pre>
     *
     * <code>string failure_message = 2;</code>
     *
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      failureMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Failure message if any.
     * </pre>
     *
     * <code>string failure_message = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      failureMessage_ = getDefaultInstance().getFailureMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Failure message if any.
     * </pre>
     *
     * <code>string failure_message = 2;</code>
     *
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      failureMessage_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.QueryExtensionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.QueryExtensionResponse)
  private static final com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryExtensionResponse> PARSER =
      new com.google.protobuf.AbstractParser<QueryExtensionResponse>() {
        @java.lang.Override
        public QueryExtensionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryExtensionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryExtensionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.QueryExtensionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
