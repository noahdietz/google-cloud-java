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
// source: google/shopping/merchant/products/v1beta/products.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.products.v1beta;

public interface ProductOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.products.v1beta.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the product.
   * Format:
   * `"{product.name=accounts/{account}/products/{product}}"`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the product.
   * Format:
   * `"{product.name=accounts/{account}/products/{product}}"`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The
   * [channel](https://support.google.com/merchants/answer/7361332) of the
   * product.
   * </pre>
   *
   * <code>
   * .google.shopping.type.Channel.ChannelEnum channel = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for channel.
   */
  int getChannelValue();
  /**
   *
   *
   * <pre>
   * Output only. The
   * [channel](https://support.google.com/merchants/answer/7361332) of the
   * product.
   * </pre>
   *
   * <code>
   * .google.shopping.type.Channel.ChannelEnum channel = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The channel.
   */
  com.google.shopping.type.Channel.ChannelEnum getChannel();

  /**
   *
   *
   * <pre>
   * Output only. Your unique identifier for the product. This is the same for
   * the product input and processed product. Leading and trailing whitespaces
   * are stripped and multiple whitespaces are replaced by a single whitespace
   * upon submission. See the [product data
   * specification](https://support.google.com/merchants/answer/188494#id) for
   * details.
   * </pre>
   *
   * <code>string offer_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The offerId.
   */
  java.lang.String getOfferId();
  /**
   *
   *
   * <pre>
   * Output only. Your unique identifier for the product. This is the same for
   * the product input and processed product. Leading and trailing whitespaces
   * are stripped and multiple whitespaces are replaced by a single whitespace
   * upon submission. See the [product data
   * specification](https://support.google.com/merchants/answer/188494#id) for
   * details.
   * </pre>
   *
   * <code>string offer_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for offerId.
   */
  com.google.protobuf.ByteString getOfferIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The two-letter [ISO
   * 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code for the
   * product.
   * </pre>
   *
   * <code>string content_language = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The contentLanguage.
   */
  java.lang.String getContentLanguage();
  /**
   *
   *
   * <pre>
   * Output only. The two-letter [ISO
   * 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code for the
   * product.
   * </pre>
   *
   * <code>string content_language = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for contentLanguage.
   */
  com.google.protobuf.ByteString getContentLanguageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The feed label for the product.
   * </pre>
   *
   * <code>string feed_label = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();
  /**
   *
   *
   * <pre>
   * Output only. The feed label for the product.
   * </pre>
   *
   * <code>string feed_label = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The primary data source of the product.
   * </pre>
   *
   * <code>string data_source = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * Output only. The primary data source of the product.
   * </pre>
   *
   * <code>string data_source = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();

  /**
   *
   *
   * <pre>
   * Output only. Represents the existing version (freshness) of the product,
   * which can be used to preserve the right order when multiple updates are
   * done at the same time.
   *
   * If set, the insertion is prevented when version number is lower than
   * the current version number of the existing product. Re-insertion (for
   * example, product refresh after 30 days) can be performed with the current
   * `version_number`.
   *
   * Only supported for insertions into primary data sources.
   *
   * If the operation is prevented, the aborted exception will be
   * thrown.
   * </pre>
   *
   * <code>optional int64 version_number = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the versionNumber field is set.
   */
  boolean hasVersionNumber();
  /**
   *
   *
   * <pre>
   * Output only. Represents the existing version (freshness) of the product,
   * which can be used to preserve the right order when multiple updates are
   * done at the same time.
   *
   * If set, the insertion is prevented when version number is lower than
   * the current version number of the existing product. Re-insertion (for
   * example, product refresh after 30 days) can be performed with the current
   * `version_number`.
   *
   * Only supported for insertions into primary data sources.
   *
   * If the operation is prevented, the aborted exception will be
   * thrown.
   * </pre>
   *
   * <code>optional int64 version_number = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The versionNumber.
   */
  long getVersionNumber();

  /**
   *
   *
   * <pre>
   * Output only. A list of product attributes.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.Attributes attributes = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   *
   *
   * <pre>
   * Output only. A list of product attributes.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.Attributes attributes = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The attributes.
   */
  com.google.shopping.merchant.products.v1beta.Attributes getAttributes();
  /**
   *
   *
   * <pre>
   * Output only. A list of product attributes.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.Attributes attributes = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.AttributesOrBuilder getAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A list of custom (merchant-provided) attributes. It can also
   * be used to submit any attribute of the data specification in its generic
   * form (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.shopping.type.CustomAttribute> getCustomAttributesList();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (merchant-provided) attributes. It can also
   * be used to submit any attribute of the data specification in its generic
   * form (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.type.CustomAttribute getCustomAttributes(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (merchant-provided) attributes. It can also
   * be used to submit any attribute of the data specification in its generic
   * form (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCustomAttributesCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (merchant-provided) attributes. It can also
   * be used to submit any attribute of the data specification in its generic
   * form (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.shopping.type.CustomAttributeOrBuilder>
      getCustomAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (merchant-provided) attributes. It can also
   * be used to submit any attribute of the data specification in its generic
   * form (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.type.CustomAttributeOrBuilder getCustomAttributesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The status of a product, data validation issues, that is,
   * information about a product computed asynchronously.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.ProductStatus product_status = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the productStatus field is set.
   */
  boolean hasProductStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of a product, data validation issues, that is,
   * information about a product computed asynchronously.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.ProductStatus product_status = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The productStatus.
   */
  com.google.shopping.merchant.products.v1beta.ProductStatus getProductStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of a product, data validation issues, that is,
   * information about a product computed asynchronously.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.products.v1beta.ProductStatus product_status = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.ProductStatusOrBuilder getProductStatusOrBuilder();
}
