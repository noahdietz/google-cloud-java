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
// source: google/shopping/css/v1/css_products.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.css.v1;

public interface CssProductOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.CssProduct)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the CSS Product.
   * Format:
   * `"accounts/{account}/cssProducts/{css_product}"`
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
   * The name of the CSS Product.
   * Format:
   * `"accounts/{account}/cssProducts/{css_product}"`
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
   * Output only. Your unique raw identifier for the product.
   * </pre>
   *
   * <code>string raw_provided_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rawProvidedId.
   */
  java.lang.String getRawProvidedId();
  /**
   *
   *
   * <pre>
   * Output only. Your unique raw identifier for the product.
   * </pre>
   *
   * <code>string raw_provided_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rawProvidedId.
   */
  com.google.protobuf.ByteString getRawProvidedIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The two-letter [ISO
   * 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code for the
   * product.
   * </pre>
   *
   * <code>string content_language = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * <code>string content_language = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * <code>string feed_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * <code>string feed_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Output only. A list of product attributes.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.Attributes attributes = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * .google.shopping.css.v1.Attributes attributes = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The attributes.
   */
  com.google.shopping.css.v1.Attributes getAttributes();
  /**
   *
   *
   * <pre>
   * Output only. A list of product attributes.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.Attributes attributes = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.css.v1.AttributesOrBuilder getAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A list of custom (CSS-provided) attributes. It can also be
   * used to submit any attribute of the feed specification in its generic form
   * (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.shopping.type.CustomAttribute> getCustomAttributesList();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (CSS-provided) attributes. It can also be
   * used to submit any attribute of the feed specification in its generic form
   * (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.type.CustomAttribute getCustomAttributes(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (CSS-provided) attributes. It can also be
   * used to submit any attribute of the feed specification in its generic form
   * (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCustomAttributesCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (CSS-provided) attributes. It can also be
   * used to submit any attribute of the feed specification in its generic form
   * (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.shopping.type.CustomAttributeOrBuilder>
      getCustomAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of custom (CSS-provided) attributes. It can also be
   * used to submit any attribute of the feed specification in its generic form
   * (for example,
   * `{ "name": "size type", "value": "regular" }`).
   * This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.type.CustomAttribute custom_attributes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * .google.shopping.css.v1.CssProductStatus css_product_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the cssProductStatus field is set.
   */
  boolean hasCssProductStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of a product, data validation issues, that is,
   * information about a product computed asynchronously.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.CssProductStatus css_product_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The cssProductStatus.
   */
  com.google.shopping.css.v1.CssProductStatus getCssProductStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of a product, data validation issues, that is,
   * information about a product computed asynchronously.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.CssProductStatus css_product_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.css.v1.CssProductStatusOrBuilder getCssProductStatusOrBuilder();
}
