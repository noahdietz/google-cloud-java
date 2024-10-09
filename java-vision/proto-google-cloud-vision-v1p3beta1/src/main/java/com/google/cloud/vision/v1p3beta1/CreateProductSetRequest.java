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
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Request message for the `CreateProductSet` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.CreateProductSetRequest}
 */
public final class CreateProductSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.CreateProductSetRequest)
    CreateProductSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateProductSetRequest.newBuilder() to construct.
  private CreateProductSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateProductSetRequest() {
    parent_ = "";
    productSetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateProductSetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_CreateProductSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_CreateProductSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.class,
            com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project in which the ProductSet should be created.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project in which the ProductSet should be created.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_SET_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1p3beta1.ProductSet productSet_;
  /**
   *
   *
   * <pre>
   * Required. The ProductSet to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the productSet field is set.
   */
  @java.lang.Override
  public boolean hasProductSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The ProductSet to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The productSet.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ProductSet getProductSet() {
    return productSet_ == null
        ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
        : productSet_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ProductSet to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetOrBuilder() {
    return productSet_ == null
        ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
        : productSet_;
  }

  public static final int PRODUCT_SET_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object productSetId_ = "";
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this ProductSet. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_set_id = 3;</code>
   *
   * @return The productSetId.
   */
  @java.lang.Override
  public java.lang.String getProductSetId() {
    java.lang.Object ref = productSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productSetId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this ProductSet. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_set_id = 3;</code>
   *
   * @return The bytes for productSetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProductSetIdBytes() {
    java.lang.Object ref = productSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      productSetId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getProductSet());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productSetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productSetId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProductSet());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productSetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productSetId_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.CreateProductSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.CreateProductSetRequest other =
        (com.google.cloud.vision.v1p3beta1.CreateProductSetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasProductSet() != other.hasProductSet()) return false;
    if (hasProductSet()) {
      if (!getProductSet().equals(other.getProductSet())) return false;
    }
    if (!getProductSetId().equals(other.getProductSetId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasProductSet()) {
      hash = (37 * hash) + PRODUCT_SET_FIELD_NUMBER;
      hash = (53 * hash) + getProductSet().hashCode();
    }
    hash = (37 * hash) + PRODUCT_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductSetId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest parseFrom(
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
      com.google.cloud.vision.v1p3beta1.CreateProductSetRequest prototype) {
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
   * Request message for the `CreateProductSet` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.CreateProductSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.CreateProductSetRequest)
      com.google.cloud.vision.v1p3beta1.CreateProductSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_CreateProductSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_CreateProductSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.class,
              com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProductSetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      productSet_ = null;
      if (productSetBuilder_ != null) {
        productSetBuilder_.dispose();
        productSetBuilder_ = null;
      }
      productSetId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_CreateProductSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.CreateProductSetRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.CreateProductSetRequest build() {
      com.google.cloud.vision.v1p3beta1.CreateProductSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.CreateProductSetRequest buildPartial() {
      com.google.cloud.vision.v1p3beta1.CreateProductSetRequest result =
          new com.google.cloud.vision.v1p3beta1.CreateProductSetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1p3beta1.CreateProductSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.productSet_ = productSetBuilder_ == null ? productSet_ : productSetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.productSetId_ = productSetId_;
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.CreateProductSetRequest) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.CreateProductSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.CreateProductSetRequest other) {
      if (other == com.google.cloud.vision.v1p3beta1.CreateProductSetRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProductSet()) {
        mergeProductSet(other.getProductSet());
      }
      if (!other.getProductSetId().isEmpty()) {
        productSetId_ = other.productSetId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getProductSetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                productSetId_ = input.readStringRequireUtf8();
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project in which the ProductSet should be created.
     *
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the ProductSet should be created.
     *
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the ProductSet should be created.
     *
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the ProductSet should be created.
     *
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the ProductSet should be created.
     *
     * Format is `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1p3beta1.ProductSet productSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        productSetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the productSet field is set.
     */
    public boolean hasProductSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The productSet.
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet getProductSet() {
      if (productSetBuilder_ == null) {
        return productSet_ == null
            ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
            : productSet_;
      } else {
        return productSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProductSet(com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productSet_ = value;
      } else {
        productSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProductSet(
        com.google.cloud.vision.v1p3beta1.ProductSet.Builder builderForValue) {
      if (productSetBuilder_ == null) {
        productSet_ = builderForValue.build();
      } else {
        productSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProductSet(com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && productSet_ != null
            && productSet_ != com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()) {
          getProductSetBuilder().mergeFrom(value);
        } else {
          productSet_ = value;
        }
      } else {
        productSetBuilder_.mergeFrom(value);
      }
      if (productSet_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProductSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      productSet_ = null;
      if (productSetBuilder_ != null) {
        productSetBuilder_.dispose();
        productSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet.Builder getProductSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProductSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetOrBuilder() {
      if (productSetBuilder_ != null) {
        return productSetBuilder_.getMessageOrBuilder();
      } else {
        return productSet_ == null
            ? com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance()
            : productSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ProductSet to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p3beta1.ProductSet product_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        getProductSetFieldBuilder() {
      if (productSetBuilder_ == null) {
        productSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p3beta1.ProductSet,
                com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
                com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>(
                getProductSet(), getParentForChildren(), isClean());
        productSet_ = null;
      }
      return productSetBuilder_;
    }

    private java.lang.Object productSetId_ = "";
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this ProductSet. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_set_id = 3;</code>
     *
     * @return The productSetId.
     */
    public java.lang.String getProductSetId() {
      java.lang.Object ref = productSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this ProductSet. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_set_id = 3;</code>
     *
     * @return The bytes for productSetId.
     */
    public com.google.protobuf.ByteString getProductSetIdBytes() {
      java.lang.Object ref = productSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        productSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this ProductSet. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_set_id = 3;</code>
     *
     * @param value The productSetId to set.
     * @return This builder for chaining.
     */
    public Builder setProductSetId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      productSetId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this ProductSet. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_set_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProductSetId() {
      productSetId_ = getDefaultInstance().getProductSetId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this ProductSet. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_set_id = 3;</code>
     *
     * @param value The bytes for productSetId to set.
     * @return This builder for chaining.
     */
    public Builder setProductSetIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      productSetId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.CreateProductSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.CreateProductSetRequest)
  private static final com.google.cloud.vision.v1p3beta1.CreateProductSetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.CreateProductSetRequest();
  }

  public static com.google.cloud.vision.v1p3beta1.CreateProductSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProductSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateProductSetRequest>() {
        @java.lang.Override
        public CreateProductSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProductSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProductSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.CreateProductSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
