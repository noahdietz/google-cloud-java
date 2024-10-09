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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.privatecatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [PrivateCatalog.SearchProducts][google.cloud.privatecatalog.v1beta1.PrivateCatalog.SearchProducts].
 * </pre>
 *
 * Protobuf type {@code google.cloud.privatecatalog.v1beta1.SearchProductsResponse}
 */
public final class SearchProductsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.privatecatalog.v1beta1.SearchProductsResponse)
    SearchProductsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchProductsResponse.newBuilder() to construct.
  private SearchProductsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchProductsResponse() {
    products_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchProductsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.class,
            com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.privatecatalog.v1beta1.Product> products_;
  /**
   *
   *
   * <pre>
   * The `Product` resources computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.privatecatalog.v1beta1.Product> getProductsList() {
    return products_;
  }
  /**
   *
   *
   * <pre>
   * The `Product` resources computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder>
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   *
   *
   * <pre>
   * The `Product` resources computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
   */
  @java.lang.Override
  public int getProductsCount() {
    return products_.size();
  }
  /**
   *
   *
   * <pre>
   * The `Product` resources computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.Product getProducts(int index) {
    return products_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The `Product` resources computed from the resource context.
   * </pre>
   *
   * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder getProductsOrBuilder(int index) {
    return products_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to SearchProducts that
   * indicates from where listing should continue.
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
   * A pagination token returned from a previous call to SearchProducts that
   * indicates from where listing should continue.
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
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
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
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, products_.get(i));
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
    if (!(obj instanceof com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse other =
        (com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse) obj;

    if (!getProductsList().equals(other.getProductsList())) return false;
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
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse parseFrom(
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
      com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse prototype) {
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
   * Response message for [PrivateCatalog.SearchProducts][google.cloud.privatecatalog.v1beta1.PrivateCatalog.SearchProducts].
   * </pre>
   *
   * Protobuf type {@code google.cloud.privatecatalog.v1beta1.SearchProductsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.privatecatalog.v1beta1.SearchProductsResponse)
      com.google.cloud.privatecatalog.v1beta1.SearchProductsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.class,
              com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.Builder.class);
    }

    // Construct using com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
      } else {
        products_ = null;
        productsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse build() {
      com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse buildPartial() {
      com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse result =
          new com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse result) {
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse result) {
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
      if (other instanceof com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse) {
        return mergeFrom((com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse other) {
      if (other
          == com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse.getDefaultInstance())
        return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProductsFieldBuilder()
                    : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
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
                com.google.cloud.privatecatalog.v1beta1.Product m =
                    input.readMessage(
                        com.google.cloud.privatecatalog.v1beta1.Product.parser(),
                        extensionRegistry);
                if (productsBuilder_ == null) {
                  ensureProductsIsMutable();
                  products_.add(m);
                } else {
                  productsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.privatecatalog.v1beta1.Product> products_ =
        java.util.Collections.emptyList();

    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ =
            new java.util.ArrayList<com.google.cloud.privatecatalog.v1beta1.Product>(products_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.privatecatalog.v1beta1.Product,
            com.google.cloud.privatecatalog.v1beta1.Product.Builder,
            com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder>
        productsBuilder_;

    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public java.util.List<com.google.cloud.privatecatalog.v1beta1.Product> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Product getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder setProducts(int index, com.google.cloud.privatecatalog.v1beta1.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder setProducts(
        int index, com.google.cloud.privatecatalog.v1beta1.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder addProducts(com.google.cloud.privatecatalog.v1beta1.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder addProducts(int index, com.google.cloud.privatecatalog.v1beta1.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder addProducts(
        com.google.cloud.privatecatalog.v1beta1.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder addProducts(
        int index, com.google.cloud.privatecatalog.v1beta1.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.google.cloud.privatecatalog.v1beta1.Product> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Product.Builder getProductsBuilder(int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder>
        getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Product.Builder addProductsBuilder() {
      return getProductsFieldBuilder()
          .addBuilder(com.google.cloud.privatecatalog.v1beta1.Product.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public com.google.cloud.privatecatalog.v1beta1.Product.Builder addProductsBuilder(int index) {
      return getProductsFieldBuilder()
          .addBuilder(index, com.google.cloud.privatecatalog.v1beta1.Product.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The `Product` resources computed from the resource context.
     * </pre>
     *
     * <code>repeated .google.cloud.privatecatalog.v1beta1.Product products = 1;</code>
     */
    public java.util.List<com.google.cloud.privatecatalog.v1beta1.Product.Builder>
        getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.privatecatalog.v1beta1.Product,
            com.google.cloud.privatecatalog.v1beta1.Product.Builder,
            com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder>
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.privatecatalog.v1beta1.Product,
                com.google.cloud.privatecatalog.v1beta1.Product.Builder,
                com.google.cloud.privatecatalog.v1beta1.ProductOrBuilder>(
                products_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        products_ = null;
      }
      return productsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to SearchProducts that
     * indicates from where listing should continue.
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
     * A pagination token returned from a previous call to SearchProducts that
     * indicates from where listing should continue.
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
     * A pagination token returned from a previous call to SearchProducts that
     * indicates from where listing should continue.
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
     * A pagination token returned from a previous call to SearchProducts that
     * indicates from where listing should continue.
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
     * A pagination token returned from a previous call to SearchProducts that
     * indicates from where listing should continue.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.privatecatalog.v1beta1.SearchProductsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.privatecatalog.v1beta1.SearchProductsResponse)
  private static final com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse();
  }

  public static com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchProductsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchProductsResponse>() {
        @java.lang.Override
        public SearchProductsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchProductsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchProductsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.SearchProductsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
