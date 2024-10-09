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

public interface BestSellersBrandViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.BestSellersBrandView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Report date. The value of this field can only be one of the following:
   *
   * *   The first day of the week (Monday) for weekly reports,
   * *   The first day of the month for monthly reports.
   *
   * Required in the `SELECT` clause. If a `WHERE` condition on `report_date` is
   * not specified in the query, the latest available weekly or monthly report
   * is returned.
   * </pre>
   *
   * <code>.google.type.Date report_date = 1;</code>
   *
   * @return Whether the reportDate field is set.
   */
  boolean hasReportDate();
  /**
   *
   *
   * <pre>
   * Report date. The value of this field can only be one of the following:
   *
   * *   The first day of the week (Monday) for weekly reports,
   * *   The first day of the month for monthly reports.
   *
   * Required in the `SELECT` clause. If a `WHERE` condition on `report_date` is
   * not specified in the query, the latest available weekly or monthly report
   * is returned.
   * </pre>
   *
   * <code>.google.type.Date report_date = 1;</code>
   *
   * @return The reportDate.
   */
  com.google.type.Date getReportDate();
  /**
   *
   *
   * <pre>
   * Report date. The value of this field can only be one of the following:
   *
   * *   The first day of the week (Monday) for weekly reports,
   * *   The first day of the month for monthly reports.
   *
   * Required in the `SELECT` clause. If a `WHERE` condition on `report_date` is
   * not specified in the query, the latest available weekly or monthly report
   * is returned.
   * </pre>
   *
   * <code>.google.type.Date report_date = 1;</code>
   */
  com.google.type.DateOrBuilder getReportDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Granularity of the report. The ranking can be done over a week or a month
   * timeframe.
   *
   * Required in the `SELECT` clause. Condition on `report_granularity` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ReportGranularity.ReportGranularityEnum report_granularity = 2;
   * </code>
   *
   * @return Whether the reportGranularity field is set.
   */
  boolean hasReportGranularity();
  /**
   *
   *
   * <pre>
   * Granularity of the report. The ranking can be done over a week or a month
   * timeframe.
   *
   * Required in the `SELECT` clause. Condition on `report_granularity` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ReportGranularity.ReportGranularityEnum report_granularity = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for reportGranularity.
   */
  int getReportGranularityValue();
  /**
   *
   *
   * <pre>
   * Granularity of the report. The ranking can be done over a week or a month
   * timeframe.
   *
   * Required in the `SELECT` clause. Condition on `report_granularity` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.ReportGranularity.ReportGranularityEnum report_granularity = 2;
   * </code>
   *
   * @return The reportGranularity.
   */
  com.google.shopping.merchant.reports.v1beta.ReportGranularity.ReportGranularityEnum
      getReportGranularity();

  /**
   *
   *
   * <pre>
   * Country where the ranking is calculated. Represented in the ISO 3166
   * format.
   *
   * Required in the `SELECT` clause. Condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 3;</code>
   *
   * @return Whether the reportCountryCode field is set.
   */
  boolean hasReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where the ranking is calculated. Represented in the ISO 3166
   * format.
   *
   * Required in the `SELECT` clause. Condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 3;</code>
   *
   * @return The reportCountryCode.
   */
  java.lang.String getReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where the ranking is calculated. Represented in the ISO 3166
   * format.
   *
   * Required in the `SELECT` clause. Condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 3;</code>
   *
   * @return The bytes for reportCountryCode.
   */
  com.google.protobuf.ByteString getReportCountryCodeBytes();

  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the ranking for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. If a `WHERE` condition on
   * `report_category_id` is not specified in the query, rankings for all
   * top-level categories are returned.
   * </pre>
   *
   * <code>optional int64 report_category_id = 4;</code>
   *
   * @return Whether the reportCategoryId field is set.
   */
  boolean hasReportCategoryId();
  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the ranking for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. If a `WHERE` condition on
   * `report_category_id` is not specified in the query, rankings for all
   * top-level categories are returned.
   * </pre>
   *
   * <code>optional int64 report_category_id = 4;</code>
   *
   * @return The reportCategoryId.
   */
  long getReportCategoryId();

  /**
   *
   *
   * <pre>
   * Name of the brand.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return Whether the brand field is set.
   */
  boolean hasBrand();
  /**
   *
   *
   * <pre>
   * Name of the brand.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   *
   *
   * <pre>
   * Name of the brand.
   * </pre>
   *
   * <code>optional string brand = 6;</code>
   *
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString getBrandBytes();

  /**
   *
   *
   * <pre>
   * Popularity of the brand on Ads and organic surfaces, in the selected
   * category and country, based on the estimated number of units sold.
   * </pre>
   *
   * <code>optional int64 rank = 7;</code>
   *
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   *
   *
   * <pre>
   * Popularity of the brand on Ads and organic surfaces, in the selected
   * category and country, based on the estimated number of units sold.
   * </pre>
   *
   * <code>optional int64 rank = 7;</code>
   *
   * @return The rank.
   */
  long getRank();

  /**
   *
   *
   * <pre>
   * Popularity rank in the previous week or month.
   * </pre>
   *
   * <code>optional int64 previous_rank = 8;</code>
   *
   * @return Whether the previousRank field is set.
   */
  boolean hasPreviousRank();
  /**
   *
   *
   * <pre>
   * Popularity rank in the previous week or month.
   * </pre>
   *
   * <code>optional int64 previous_rank = 8;</code>
   *
   * @return The previousRank.
   */
  long getPreviousRank();

  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum relative_demand = 9;
   * </code>
   *
   * @return Whether the relativeDemand field is set.
   */
  boolean hasRelativeDemand();
  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum relative_demand = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for relativeDemand.
   */
  int getRelativeDemandValue();
  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum relative_demand = 9;
   * </code>
   *
   * @return The relativeDemand.
   */
  com.google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum getRelativeDemand();

  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country in the previous week or month.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum previous_relative_demand = 10;
   * </code>
   *
   * @return Whether the previousRelativeDemand field is set.
   */
  boolean hasPreviousRelativeDemand();
  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country in the previous week or month.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum previous_relative_demand = 10;
   * </code>
   *
   * @return The enum numeric value on the wire for previousRelativeDemand.
   */
  int getPreviousRelativeDemandValue();
  /**
   *
   *
   * <pre>
   * Estimated demand in relation to the brand with the highest popularity rank
   * in the same category and country in the previous week or month.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum previous_relative_demand = 10;
   * </code>
   *
   * @return The previousRelativeDemand.
   */
  com.google.shopping.merchant.reports.v1beta.RelativeDemand.RelativeDemandEnum
      getPreviousRelativeDemand();

  /**
   *
   *
   * <pre>
   * Change in the estimated demand. Whether it rose, sank or remained flat.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemandChangeType.RelativeDemandChangeTypeEnum relative_demand_change = 11;
   * </code>
   *
   * @return Whether the relativeDemandChange field is set.
   */
  boolean hasRelativeDemandChange();
  /**
   *
   *
   * <pre>
   * Change in the estimated demand. Whether it rose, sank or remained flat.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemandChangeType.RelativeDemandChangeTypeEnum relative_demand_change = 11;
   * </code>
   *
   * @return The enum numeric value on the wire for relativeDemandChange.
   */
  int getRelativeDemandChangeValue();
  /**
   *
   *
   * <pre>
   * Change in the estimated demand. Whether it rose, sank or remained flat.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.RelativeDemandChangeType.RelativeDemandChangeTypeEnum relative_demand_change = 11;
   * </code>
   *
   * @return The relativeDemandChange.
   */
  com.google.shopping.merchant.reports.v1beta.RelativeDemandChangeType.RelativeDemandChangeTypeEnum
      getRelativeDemandChange();
}
