/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

package com.google.cloud.servicedirectory.v1beta1;

/**
 *
 *
 * <pre>
 * The request message for [RegistrationService.UpdateNamespace][google.cloud.servicedirectory.v1beta1.RegistrationService.UpdateNamespace].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest}
 */
public final class UpdateNamespaceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)
    UpdateNamespaceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateNamespaceRequest.newBuilder() to construct.
  private UpdateNamespaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateNamespaceRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateNamespaceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateNamespaceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.cloud.servicedirectory.v1beta1.Namespace.Builder subBuilder = null;
              if (namespace_ != null) {
                subBuilder = namespace_.toBuilder();
              }
              namespace_ =
                  input.readMessage(
                      com.google.cloud.servicedirectory.v1beta1.Namespace.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(namespace_);
                namespace_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_UpdateNamespaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_UpdateNamespaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.class,
            com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.Builder.class);
  }

  public static final int NAMESPACE_FIELD_NUMBER = 1;
  private com.google.cloud.servicedirectory.v1beta1.Namespace namespace_;
  /**
   *
   *
   * <pre>
   * Required. The updated namespace.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the namespace field is set.
   */
  public boolean hasNamespace() {
    return namespace_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated namespace.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The namespace.
   */
  public com.google.cloud.servicedirectory.v1beta1.Namespace getNamespace() {
    return namespace_ == null
        ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance()
        : namespace_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated namespace.
   * </pre>
   *
   * <code>
   * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder getNamespaceOrBuilder() {
    return getNamespace();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (namespace_ != null) {
      output.writeMessage(1, getNamespace());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (namespace_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNamespace());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest other =
        (com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest) obj;

    if (hasNamespace() != other.hasNamespace()) return false;
    if (hasNamespace()) {
      if (!getNamespace().equals(other.getNamespace())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNamespace()) {
      hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + getNamespace().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parseFrom(
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
      com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest prototype) {
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
   * The request message for [RegistrationService.UpdateNamespace][google.cloud.servicedirectory.v1beta1.RegistrationService.UpdateNamespace].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)
      com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_UpdateNamespaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_UpdateNamespaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.class,
              com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (namespaceBuilder_ == null) {
        namespace_ = null;
      } else {
        namespace_ = null;
        namespaceBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_UpdateNamespaceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest
        getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest build() {
      com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest buildPartial() {
      com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest result =
          new com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest(this);
      if (namespaceBuilder_ == null) {
        result.namespace_ = namespace_;
      } else {
        result.namespace_ = namespaceBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest) {
        return mergeFrom((com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest other) {
      if (other
          == com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest.getDefaultInstance())
        return this;
      if (other.hasNamespace()) {
        mergeNamespace(other.getNamespace());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.servicedirectory.v1beta1.Namespace namespace_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1beta1.Namespace,
            com.google.cloud.servicedirectory.v1beta1.Namespace.Builder,
            com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder>
        namespaceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return namespaceBuilder_ != null || namespace_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The namespace.
     */
    public com.google.cloud.servicedirectory.v1beta1.Namespace getNamespace() {
      if (namespaceBuilder_ == null) {
        return namespace_ == null
            ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance()
            : namespace_;
      } else {
        return namespaceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNamespace(com.google.cloud.servicedirectory.v1beta1.Namespace value) {
      if (namespaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        namespace_ = value;
        onChanged();
      } else {
        namespaceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNamespace(
        com.google.cloud.servicedirectory.v1beta1.Namespace.Builder builderForValue) {
      if (namespaceBuilder_ == null) {
        namespace_ = builderForValue.build();
        onChanged();
      } else {
        namespaceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNamespace(com.google.cloud.servicedirectory.v1beta1.Namespace value) {
      if (namespaceBuilder_ == null) {
        if (namespace_ != null) {
          namespace_ =
              com.google.cloud.servicedirectory.v1beta1.Namespace.newBuilder(namespace_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          namespace_ = value;
        }
        onChanged();
      } else {
        namespaceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNamespace() {
      if (namespaceBuilder_ == null) {
        namespace_ = null;
        onChanged();
      } else {
        namespace_ = null;
        namespaceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Namespace.Builder getNamespaceBuilder() {

      onChanged();
      return getNamespaceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder getNamespaceOrBuilder() {
      if (namespaceBuilder_ != null) {
        return namespaceBuilder_.getMessageOrBuilder();
      } else {
        return namespace_ == null
            ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance()
            : namespace_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated namespace.
     * </pre>
     *
     * <code>
     * .google.cloud.servicedirectory.v1beta1.Namespace namespace = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1beta1.Namespace,
            com.google.cloud.servicedirectory.v1beta1.Namespace.Builder,
            com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder>
        getNamespaceFieldBuilder() {
      if (namespaceBuilder_ == null) {
        namespaceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.servicedirectory.v1beta1.Namespace,
                com.google.cloud.servicedirectory.v1beta1.Namespace.Builder,
                com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder>(
                getNamespace(), getParentForChildren(), isClean());
        namespace_ = null;
      }
      return namespaceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest)
  private static final com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest();
  }

  public static com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNamespaceRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateNamespaceRequest>() {
        @java.lang.Override
        public UpdateNamespaceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateNamespaceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateNamespaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNamespaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.UpdateNamespaceRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
