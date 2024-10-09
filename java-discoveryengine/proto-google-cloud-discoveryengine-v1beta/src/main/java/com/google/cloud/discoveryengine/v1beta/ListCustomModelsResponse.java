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
// source: google/cloud/discoveryengine/v1beta/search_tuning_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Response message for
 * [SearchTuningService.ListCustomModels][google.cloud.discoveryengine.v1beta.SearchTuningService.ListCustomModels]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.ListCustomModelsResponse}
 */
public final class ListCustomModelsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.ListCustomModelsResponse)
    ListCustomModelsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCustomModelsResponse.newBuilder() to construct.
  private ListCustomModelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCustomModelsResponse() {
    models_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCustomModelsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.SearchTuningServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.SearchTuningServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.class,
            com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.Builder.class);
  }

  public static final int MODELS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.discoveryengine.v1beta.CustomTuningModel> models_;
  /**
   *
   *
   * <pre>
   * List of custom tuning models.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.discoveryengine.v1beta.CustomTuningModel> getModelsList() {
    return models_;
  }
  /**
   *
   *
   * <pre>
   * List of custom tuning models.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder>
      getModelsOrBuilderList() {
    return models_;
  }
  /**
   *
   *
   * <pre>
   * List of custom tuning models.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
   */
  @java.lang.Override
  public int getModelsCount() {
    return models_.size();
  }
  /**
   *
   *
   * <pre>
   * List of custom tuning models.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.CustomTuningModel getModels(int index) {
    return models_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of custom tuning models.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder getModelsOrBuilder(
      int index) {
    return models_.get(index);
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
    for (int i = 0; i < models_.size(); i++) {
      output.writeMessage(1, models_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < models_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, models_.get(i));
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse other =
        (com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse) obj;

    if (!getModelsList().equals(other.getModelsList())) return false;
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
    if (getModelsCount() > 0) {
      hash = (37 * hash) + MODELS_FIELD_NUMBER;
      hash = (53 * hash) + getModelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse prototype) {
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
   * [SearchTuningService.ListCustomModels][google.cloud.discoveryengine.v1beta.SearchTuningService.ListCustomModels]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.ListCustomModelsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.ListCustomModelsResponse)
      com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.SearchTuningServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.SearchTuningServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.class,
              com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
      } else {
        models_ = null;
        modelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.SearchTuningServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse build() {
      com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse buildPartial() {
      com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse result =
          new com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse result) {
      if (modelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          models_ = java.util.Collections.unmodifiableList(models_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.models_ = models_;
      } else {
        result.models_ = modelsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse other) {
      if (other
          == com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse.getDefaultInstance())
        return this;
      if (modelsBuilder_ == null) {
        if (!other.models_.isEmpty()) {
          if (models_.isEmpty()) {
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelsIsMutable();
            models_.addAll(other.models_);
          }
          onChanged();
        }
      } else {
        if (!other.models_.isEmpty()) {
          if (modelsBuilder_.isEmpty()) {
            modelsBuilder_.dispose();
            modelsBuilder_ = null;
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getModelsFieldBuilder()
                    : null;
          } else {
            modelsBuilder_.addAllMessages(other.models_);
          }
        }
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
                com.google.cloud.discoveryengine.v1beta.CustomTuningModel m =
                    input.readMessage(
                        com.google.cloud.discoveryengine.v1beta.CustomTuningModel.parser(),
                        extensionRegistry);
                if (modelsBuilder_ == null) {
                  ensureModelsIsMutable();
                  models_.add(m);
                } else {
                  modelsBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.discoveryengine.v1beta.CustomTuningModel> models_ =
        java.util.Collections.emptyList();

    private void ensureModelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        models_ =
            new java.util.ArrayList<com.google.cloud.discoveryengine.v1beta.CustomTuningModel>(
                models_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.CustomTuningModel,
            com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder,
            com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder>
        modelsBuilder_;

    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1beta.CustomTuningModel>
        getModelsList() {
      if (modelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(models_);
      } else {
        return modelsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public int getModelsCount() {
      if (modelsBuilder_ == null) {
        return models_.size();
      } else {
        return modelsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1beta.CustomTuningModel getModels(int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder setModels(
        int index, com.google.cloud.discoveryengine.v1beta.CustomTuningModel value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.set(index, value);
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder setModels(
        int index,
        com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder addModels(com.google.cloud.discoveryengine.v1beta.CustomTuningModel value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder addModels(
        int index, com.google.cloud.discoveryengine.v1beta.CustomTuningModel value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(index, value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder addModels(
        com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder addModels(
        int index,
        com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder addAllModels(
        java.lang.Iterable<? extends com.google.cloud.discoveryengine.v1beta.CustomTuningModel>
            values) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, models_);
        onChanged();
      } else {
        modelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder clearModels() {
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public Builder removeModels(int index) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.remove(index);
        onChanged();
      } else {
        modelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder getModelsBuilder(
        int index) {
      return getModelsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder getModelsOrBuilder(
        int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder>
        getModelsOrBuilderList() {
      if (modelsBuilder_ != null) {
        return modelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(models_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder addModelsBuilder() {
      return getModelsFieldBuilder()
          .addBuilder(
              com.google.cloud.discoveryengine.v1beta.CustomTuningModel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder addModelsBuilder(
        int index) {
      return getModelsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.discoveryengine.v1beta.CustomTuningModel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of custom tuning models.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1beta.CustomTuningModel models = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder>
        getModelsBuilderList() {
      return getModelsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.CustomTuningModel,
            com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder,
            com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder>
        getModelsFieldBuilder() {
      if (modelsBuilder_ == null) {
        modelsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.discoveryengine.v1beta.CustomTuningModel,
                com.google.cloud.discoveryengine.v1beta.CustomTuningModel.Builder,
                com.google.cloud.discoveryengine.v1beta.CustomTuningModelOrBuilder>(
                models_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        models_ = null;
      }
      return modelsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.ListCustomModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.ListCustomModelsResponse)
  private static final com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse();
  }

  public static com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomModelsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCustomModelsResponse>() {
        @java.lang.Override
        public ListCustomModelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCustomModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.ListCustomModelsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
