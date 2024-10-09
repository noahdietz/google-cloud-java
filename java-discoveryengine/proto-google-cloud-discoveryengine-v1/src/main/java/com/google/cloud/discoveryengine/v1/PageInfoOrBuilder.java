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
// source: google/cloud/discoveryengine/v1/user_event.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface PageInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.PageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique ID of a web page view.
   *
   * This should be kept the same for all user events triggered from the same
   * pageview. For example, an item detail page view could trigger multiple
   * events as the user is browsing the page. The `pageview_id` property should
   * be kept the same for all these events so that they can be grouped together
   * properly.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string pageview_id = 1;</code>
   *
   * @return The pageviewId.
   */
  java.lang.String getPageviewId();
  /**
   *
   *
   * <pre>
   * A unique ID of a web page view.
   *
   * This should be kept the same for all user events triggered from the same
   * pageview. For example, an item detail page view could trigger multiple
   * events as the user is browsing the page. The `pageview_id` property should
   * be kept the same for all these events so that they can be grouped together
   * properly.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string pageview_id = 1;</code>
   *
   * @return The bytes for pageviewId.
   */
  com.google.protobuf.ByteString getPageviewIdBytes();

  /**
   *
   *
   * <pre>
   * The most specific category associated with a category page.
   *
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   *
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * `"pageCategory" : "Sales &gt; 2017 Black Friday Deals"`.
   *
   * Required for `view-category-page` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string page_category = 2;</code>
   *
   * @return The pageCategory.
   */
  java.lang.String getPageCategory();
  /**
   *
   *
   * <pre>
   * The most specific category associated with a category page.
   *
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   *
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * `"pageCategory" : "Sales &gt; 2017 Black Friday Deals"`.
   *
   * Required for `view-category-page` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string page_category = 2;</code>
   *
   * @return The bytes for pageCategory.
   */
  com.google.protobuf.ByteString getPageCategoryBytes();

  /**
   *
   *
   * <pre>
   * Complete URL (window.location.href) of the user's current page.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. Maximum length 5,000
   * characters.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Complete URL (window.location.href) of the user's current page.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. Maximum length 5,000
   * characters.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The referrer URL of the current page.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. However, some browser
   * privacy restrictions may cause this field to be empty.
   * </pre>
   *
   * <code>string referrer_uri = 4;</code>
   *
   * @return The referrerUri.
   */
  java.lang.String getReferrerUri();
  /**
   *
   *
   * <pre>
   * The referrer URL of the current page.
   *
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. However, some browser
   * privacy restrictions may cause this field to be empty.
   * </pre>
   *
   * <code>string referrer_uri = 4;</code>
   *
   * @return The bytes for referrerUri.
   */
  com.google.protobuf.ByteString getReferrerUriBytes();
}
