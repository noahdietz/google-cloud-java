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
// source: google/cloud/vision/v1/product_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1;

public interface ListProductSetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ListProductSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ProductSet product_sets = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.ProductSet> getProductSetsList();
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ProductSet product_sets = 1;</code>
   */
  com.google.cloud.vision.v1.ProductSet getProductSets(int index);
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ProductSet product_sets = 1;</code>
   */
  int getProductSetsCount();
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ProductSet product_sets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.ProductSetOrBuilder>
      getProductSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ProductSet product_sets = 1;</code>
   */
  com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
