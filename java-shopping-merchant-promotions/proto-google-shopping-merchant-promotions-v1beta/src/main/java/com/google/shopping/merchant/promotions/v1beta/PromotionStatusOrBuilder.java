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
// source: google/shopping/merchant/promotions/v1beta/promotions_common.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.promotions.v1beta;

public interface PromotionStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.promotions.v1beta.PromotionStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The intended destinations for the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus destination_statuses = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus>
      getDestinationStatusesList();
  /**
   *
   *
   * <pre>
   * Output only. The intended destinations for the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus destination_statuses = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus
      getDestinationStatuses(int index);
  /**
   *
   *
   * <pre>
   * Output only. The intended destinations for the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus destination_statuses = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getDestinationStatusesCount();
  /**
   *
   *
   * <pre>
   * Output only. The intended destinations for the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus destination_statuses = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.promotions.v1beta.PromotionStatus
                  .DestinationStatusOrBuilder>
      getDestinationStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The intended destinations for the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatus destination_statuses = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionStatus.DestinationStatusOrBuilder
      getDestinationStatusesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A list of issues associated with the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue item_level_issues = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue>
      getItemLevelIssuesList();
  /**
   *
   *
   * <pre>
   * Output only. A list of issues associated with the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue item_level_issues = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue getItemLevelIssues(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of issues associated with the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue item_level_issues = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getItemLevelIssuesCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of issues associated with the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue item_level_issues = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.promotions.v1beta.PromotionStatus
                  .ItemLevelIssueOrBuilder>
      getItemLevelIssuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of issues associated with the promotion.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssue item_level_issues = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.shopping.merchant.promotions.v1beta.PromotionStatus.ItemLevelIssueOrBuilder
      getItemLevelIssuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion has been created
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_date = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the creationDate field is set.
   */
  boolean hasCreationDate();
  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion has been created
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_date = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The creationDate.
   */
  com.google.protobuf.Timestamp getCreationDate();
  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion has been created
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_date = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion status has been last updated
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_date = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastUpdateDate field is set.
   */
  boolean hasLastUpdateDate();
  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion status has been last updated
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_date = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastUpdateDate.
   */
  com.google.protobuf.Timestamp getLastUpdateDate();
  /**
   *
   *
   * <pre>
   * Output only. Date on which the promotion status has been last updated
   * in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) format: Date, time,
   * and offset, for example `2020-01-02T09:00:00+01:00` or
   * `2020-01-02T09:00:00Z`
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_date = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateDateOrBuilder();
}
