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
// source: google/shopping/merchant/products/v1beta/products_common.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.products.v1beta;

/**
 *
 *
 * <pre>
 * Conditions to be met for a product to have free shipping.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.products.v1beta.FreeShippingThreshold}
 */
public final class FreeShippingThreshold extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.products.v1beta.FreeShippingThreshold)
    FreeShippingThresholdOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FreeShippingThreshold.newBuilder() to construct.
  private FreeShippingThreshold(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FreeShippingThreshold() {
    country_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FreeShippingThreshold();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_FreeShippingThreshold_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_FreeShippingThreshold_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.products.v1beta.FreeShippingThreshold.class,
            com.google.shopping.merchant.products.v1beta.FreeShippingThreshold.Builder.class);
  }

  private int bitField0_;
  public static final int COUNTRY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object country_ = "";
  /**
   *
   *
   * <pre>
   * The [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
   * of the country to which an item will ship.
   * </pre>
   *
   * <code>optional string country = 1;</code>
   *
   * @return Whether the country field is set.
   */
  @java.lang.Override
  public boolean hasCountry() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
   * of the country to which an item will ship.
   * </pre>
   *
   * <code>optional string country = 1;</code>
   *
   * @return The country.
   */
  @java.lang.Override
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
   * of the country to which an item will ship.
   * </pre>
   *
   * <code>optional string country = 1;</code>
   *
   * @return The bytes for country.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_THRESHOLD_FIELD_NUMBER = 2;
  private com.google.shopping.type.Price priceThreshold_;
  /**
   *
   *
   * <pre>
   * The minimum product price for the shipping cost to become free. Represented
   * as a number.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
   *
   * @return Whether the priceThreshold field is set.
   */
  @java.lang.Override
  public boolean hasPriceThreshold() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The minimum product price for the shipping cost to become free. Represented
   * as a number.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
   *
   * @return The priceThreshold.
   */
  @java.lang.Override
  public com.google.shopping.type.Price getPriceThreshold() {
    return priceThreshold_ == null
        ? com.google.shopping.type.Price.getDefaultInstance()
        : priceThreshold_;
  }
  /**
   *
   *
   * <pre>
   * The minimum product price for the shipping cost to become free. Represented
   * as a number.
   * </pre>
   *
   * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
   */
  @java.lang.Override
  public com.google.shopping.type.PriceOrBuilder getPriceThresholdOrBuilder() {
    return priceThreshold_ == null
        ? com.google.shopping.type.Price.getDefaultInstance()
        : priceThreshold_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, country_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getPriceThreshold());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, country_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPriceThreshold());
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
    if (!(obj instanceof com.google.shopping.merchant.products.v1beta.FreeShippingThreshold)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.products.v1beta.FreeShippingThreshold other =
        (com.google.shopping.merchant.products.v1beta.FreeShippingThreshold) obj;

    if (hasCountry() != other.hasCountry()) return false;
    if (hasCountry()) {
      if (!getCountry().equals(other.getCountry())) return false;
    }
    if (hasPriceThreshold() != other.hasPriceThreshold()) return false;
    if (hasPriceThreshold()) {
      if (!getPriceThreshold().equals(other.getPriceThreshold())) return false;
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
    if (hasCountry()) {
      hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCountry().hashCode();
    }
    if (hasPriceThreshold()) {
      hash = (37 * hash) + PRICE_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + getPriceThreshold().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold parseFrom(
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
      com.google.shopping.merchant.products.v1beta.FreeShippingThreshold prototype) {
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
   * Conditions to be met for a product to have free shipping.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.products.v1beta.FreeShippingThreshold}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.products.v1beta.FreeShippingThreshold)
      com.google.shopping.merchant.products.v1beta.FreeShippingThresholdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_FreeShippingThreshold_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_FreeShippingThreshold_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.products.v1beta.FreeShippingThreshold.class,
              com.google.shopping.merchant.products.v1beta.FreeShippingThreshold.Builder.class);
    }

    // Construct using
    // com.google.shopping.merchant.products.v1beta.FreeShippingThreshold.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPriceThresholdFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      country_ = "";
      priceThreshold_ = null;
      if (priceThresholdBuilder_ != null) {
        priceThresholdBuilder_.dispose();
        priceThresholdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_FreeShippingThreshold_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.FreeShippingThreshold build() {
      com.google.shopping.merchant.products.v1beta.FreeShippingThreshold result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.FreeShippingThreshold buildPartial() {
      com.google.shopping.merchant.products.v1beta.FreeShippingThreshold result =
          new com.google.shopping.merchant.products.v1beta.FreeShippingThreshold(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.products.v1beta.FreeShippingThreshold result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.country_ = country_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.priceThreshold_ =
            priceThresholdBuilder_ == null ? priceThreshold_ : priceThresholdBuilder_.build();
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
      if (other instanceof com.google.shopping.merchant.products.v1beta.FreeShippingThreshold) {
        return mergeFrom(
            (com.google.shopping.merchant.products.v1beta.FreeShippingThreshold) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.products.v1beta.FreeShippingThreshold other) {
      if (other
          == com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
              .getDefaultInstance()) return this;
      if (other.hasCountry()) {
        country_ = other.country_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPriceThreshold()) {
        mergePriceThreshold(other.getPriceThreshold());
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
                country_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPriceThresholdFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object country_ = "";
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @return Whether the country field is set.
     */
    public boolean hasCountry() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @return The country.
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @return The bytes for country.
     */
    public com.google.protobuf.ByteString getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @param value The country to set.
     * @return This builder for chaining.
     */
    public Builder setCountry(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      country_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCountry() {
      country_ = getDefaultInstance().getCountry();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [CLDR territory
     * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml)
     * of the country to which an item will ship.
     * </pre>
     *
     * <code>optional string country = 1;</code>
     *
     * @param value The bytes for country to set.
     * @return This builder for chaining.
     */
    public Builder setCountryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      country_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.shopping.type.Price priceThreshold_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        priceThresholdBuilder_;
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     *
     * @return Whether the priceThreshold field is set.
     */
    public boolean hasPriceThreshold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     *
     * @return The priceThreshold.
     */
    public com.google.shopping.type.Price getPriceThreshold() {
      if (priceThresholdBuilder_ == null) {
        return priceThreshold_ == null
            ? com.google.shopping.type.Price.getDefaultInstance()
            : priceThreshold_;
      } else {
        return priceThresholdBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public Builder setPriceThreshold(com.google.shopping.type.Price value) {
      if (priceThresholdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        priceThreshold_ = value;
      } else {
        priceThresholdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public Builder setPriceThreshold(com.google.shopping.type.Price.Builder builderForValue) {
      if (priceThresholdBuilder_ == null) {
        priceThreshold_ = builderForValue.build();
      } else {
        priceThresholdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public Builder mergePriceThreshold(com.google.shopping.type.Price value) {
      if (priceThresholdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && priceThreshold_ != null
            && priceThreshold_ != com.google.shopping.type.Price.getDefaultInstance()) {
          getPriceThresholdBuilder().mergeFrom(value);
        } else {
          priceThreshold_ = value;
        }
      } else {
        priceThresholdBuilder_.mergeFrom(value);
      }
      if (priceThreshold_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public Builder clearPriceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      priceThreshold_ = null;
      if (priceThresholdBuilder_ != null) {
        priceThresholdBuilder_.dispose();
        priceThresholdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public com.google.shopping.type.Price.Builder getPriceThresholdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPriceThresholdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    public com.google.shopping.type.PriceOrBuilder getPriceThresholdOrBuilder() {
      if (priceThresholdBuilder_ != null) {
        return priceThresholdBuilder_.getMessageOrBuilder();
      } else {
        return priceThreshold_ == null
            ? com.google.shopping.type.Price.getDefaultInstance()
            : priceThreshold_;
      }
    }
    /**
     *
     *
     * <pre>
     * The minimum product price for the shipping cost to become free. Represented
     * as a number.
     * </pre>
     *
     * <code>optional .google.shopping.type.Price price_threshold = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        getPriceThresholdFieldBuilder() {
      if (priceThresholdBuilder_ == null) {
        priceThresholdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.type.Price,
                com.google.shopping.type.Price.Builder,
                com.google.shopping.type.PriceOrBuilder>(
                getPriceThreshold(), getParentForChildren(), isClean());
        priceThreshold_ = null;
      }
      return priceThresholdBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.products.v1beta.FreeShippingThreshold)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.products.v1beta.FreeShippingThreshold)
  private static final com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.products.v1beta.FreeShippingThreshold();
  }

  public static com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FreeShippingThreshold> PARSER =
      new com.google.protobuf.AbstractParser<FreeShippingThreshold>() {
        @java.lang.Override
        public FreeShippingThreshold parsePartialFrom(
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

  public static com.google.protobuf.Parser<FreeShippingThreshold> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FreeShippingThreshold> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.products.v1beta.FreeShippingThreshold
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
