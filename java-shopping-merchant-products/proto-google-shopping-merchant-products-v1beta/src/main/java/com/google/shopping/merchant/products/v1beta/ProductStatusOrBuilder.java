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

public interface ProductStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.products.v1beta.ProductStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The intended destinations for the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus destination_statuses = 3;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus>
      getDestinationStatusesList();
  /**
   *
   *
   * <pre>
   * The intended destinations for the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus destination_statuses = 3;
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus
      getDestinationStatuses(int index);
  /**
   *
   *
   * <pre>
   * The intended destinations for the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus destination_statuses = 3;
   * </code>
   */
  int getDestinationStatusesCount();
  /**
   *
   *
   * <pre>
   * The intended destinations for the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus destination_statuses = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatusOrBuilder>
      getDestinationStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The intended destinations for the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatus destination_statuses = 3;
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.ProductStatus.DestinationStatusOrBuilder
      getDestinationStatusesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of all issues associated with the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue item_level_issues = 4;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue>
      getItemLevelIssuesList();
  /**
   *
   *
   * <pre>
   * A list of all issues associated with the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue item_level_issues = 4;
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue getItemLevelIssues(
      int index);
  /**
   *
   *
   * <pre>
   * A list of all issues associated with the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue item_level_issues = 4;
   * </code>
   */
  int getItemLevelIssuesCount();
  /**
   *
   *
   * <pre>
   * A list of all issues associated with the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue item_level_issues = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssueOrBuilder>
      getItemLevelIssuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of all issues associated with the product.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssue item_level_issues = 4;
   * </code>
   */
  com.google.shopping.merchant.products.v1beta.ProductStatus.ItemLevelIssueOrBuilder
      getItemLevelIssuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Date on which the item has been created, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 5;</code>
   *
   * @return Whether the creationDate field is set.
   */
  boolean hasCreationDate();
  /**
   *
   *
   * <pre>
   * Date on which the item has been created, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 5;</code>
   *
   * @return The creationDate.
   */
  com.google.protobuf.Timestamp getCreationDate();
  /**
   *
   *
   * <pre>
   * Date on which the item has been created, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Date on which the item has been last updated, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_date = 6;</code>
   *
   * @return Whether the lastUpdateDate field is set.
   */
  boolean hasLastUpdateDate();
  /**
   *
   *
   * <pre>
   * Date on which the item has been last updated, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_date = 6;</code>
   *
   * @return The lastUpdateDate.
   */
  com.google.protobuf.Timestamp getLastUpdateDate();
  /**
   *
   *
   * <pre>
   * Date on which the item has been last updated, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_date = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Date on which the item expires, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_expiration_date = 7;</code>
   *
   * @return Whether the googleExpirationDate field is set.
   */
  boolean hasGoogleExpirationDate();
  /**
   *
   *
   * <pre>
   * Date on which the item expires, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_expiration_date = 7;</code>
   *
   * @return The googleExpirationDate.
   */
  com.google.protobuf.Timestamp getGoogleExpirationDate();
  /**
   *
   *
   * <pre>
   * Date on which the item expires, in [ISO
   * 8601](http://en.wikipedia.org/wiki/ISO_8601) format.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp google_expiration_date = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getGoogleExpirationDateOrBuilder();
}
