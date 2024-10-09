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
// source: google/shopping/merchant/promotions/v1beta/promotions.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.promotions.v1beta;

public interface InsertPromotionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.promotions.v1beta.InsertPromotionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The account where the promotion will be inserted.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The account where the promotion will be inserted.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The promotion to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.promotions.v1beta.Promotion promotion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the promotion field is set.
   */
  boolean hasPromotion();
  /**
   *
   *
   * <pre>
   * Required. The promotion to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.promotions.v1beta.Promotion promotion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The promotion.
   */
  com.google.shopping.merchant.promotions.v1beta.Promotion getPromotion();
  /**
   *
   *
   * <pre>
   * Required. The promotion to insert.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.promotions.v1beta.Promotion promotion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionOrBuilder getPromotionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The data source of the
   * [promotion](https://support.google.com/merchants/answer/6396268?sjid=5155774230887277618-NC)
   * Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * Required. The data source of the
   * [promotion](https://support.google.com/merchants/answer/6396268?sjid=5155774230887277618-NC)
   * Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();
}
