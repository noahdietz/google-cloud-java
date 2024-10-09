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
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.reports.v1beta;

public interface NonProductPerformanceViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.NonProductPerformanceView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Date in the merchant timezone to which metrics apply. Segment.
   *
   * Condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Date in the merchant timezone to which metrics apply. Segment.
   *
   * Condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return The date.
   */
  com.google.type.Date getDate();
  /**
   *
   *
   * <pre>
   * Date in the merchant timezone to which metrics apply. Segment.
   *
   * Condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   */
  com.google.type.DateOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * First day of the week (Monday) of the metrics date in the merchant
   * timezone. Segment.
   * </pre>
   *
   * <code>.google.type.Date week = 2;</code>
   *
   * @return Whether the week field is set.
   */
  boolean hasWeek();
  /**
   *
   *
   * <pre>
   * First day of the week (Monday) of the metrics date in the merchant
   * timezone. Segment.
   * </pre>
   *
   * <code>.google.type.Date week = 2;</code>
   *
   * @return The week.
   */
  com.google.type.Date getWeek();
  /**
   *
   *
   * <pre>
   * First day of the week (Monday) of the metrics date in the merchant
   * timezone. Segment.
   * </pre>
   *
   * <code>.google.type.Date week = 2;</code>
   */
  com.google.type.DateOrBuilder getWeekOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of clicks on images and online store links leading to your
   * non-product pages. Metric.
   * </pre>
   *
   * <code>optional int64 clicks = 3;</code>
   *
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   *
   *
   * <pre>
   * Number of clicks on images and online store links leading to your
   * non-product pages. Metric.
   * </pre>
   *
   * <code>optional int64 clicks = 3;</code>
   *
   * @return The clicks.
   */
  long getClicks();

  /**
   *
   *
   * <pre>
   * Number of times images and online store links leading to your non-product
   * pages were shown. Metric.
   * </pre>
   *
   * <code>optional int64 impressions = 4;</code>
   *
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   *
   *
   * <pre>
   * Number of times images and online store links leading to your non-product
   * pages were shown. Metric.
   * </pre>
   *
   * <code>optional int64 impressions = 4;</code>
   *
   * @return The impressions.
   */
  long getImpressions();

  /**
   *
   *
   * <pre>
   * Click-through rate - the number of clicks (`clicks`) divided by the number
   * of impressions (`impressions`) of images and online store links leading to
   * your non-product pages. Metric.
   * </pre>
   *
   * <code>optional double click_through_rate = 5;</code>
   *
   * @return Whether the clickThroughRate field is set.
   */
  boolean hasClickThroughRate();
  /**
   *
   *
   * <pre>
   * Click-through rate - the number of clicks (`clicks`) divided by the number
   * of impressions (`impressions`) of images and online store links leading to
   * your non-product pages. Metric.
   * </pre>
   *
   * <code>optional double click_through_rate = 5;</code>
   *
   * @return The clickThroughRate.
   */
  double getClickThroughRate();
}
