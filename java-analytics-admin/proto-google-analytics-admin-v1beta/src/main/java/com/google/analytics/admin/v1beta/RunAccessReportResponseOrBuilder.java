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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1beta;

public interface RunAccessReportResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.RunAccessReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * dimension. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionHeader dimension_headers = 1;
   * </code>
   */
  java.util.List<com.google.analytics.admin.v1beta.AccessDimensionHeader> getDimensionHeadersList();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * dimension. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionHeader dimension_headers = 1;
   * </code>
   */
  com.google.analytics.admin.v1beta.AccessDimensionHeader getDimensionHeaders(int index);
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * dimension. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionHeader dimension_headers = 1;
   * </code>
   */
  int getDimensionHeadersCount();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * dimension. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionHeader dimension_headers = 1;
   * </code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.AccessDimensionHeaderOrBuilder>
      getDimensionHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * dimension. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionHeader dimension_headers = 1;
   * </code>
   */
  com.google.analytics.admin.v1beta.AccessDimensionHeaderOrBuilder getDimensionHeadersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * metric. The number of MetricHeaders and ordering of MetricHeaders matches
   * the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricHeader metric_headers = 2;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.AccessMetricHeader> getMetricHeadersList();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * metric. The number of MetricHeaders and ordering of MetricHeaders matches
   * the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricHeader metric_headers = 2;</code>
   */
  com.google.analytics.admin.v1beta.AccessMetricHeader getMetricHeaders(int index);
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * metric. The number of MetricHeaders and ordering of MetricHeaders matches
   * the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricHeader metric_headers = 2;</code>
   */
  int getMetricHeadersCount();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * metric. The number of MetricHeaders and ordering of MetricHeaders matches
   * the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricHeader metric_headers = 2;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.AccessMetricHeaderOrBuilder>
      getMetricHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The header for a column in the report that corresponds to a specific
   * metric. The number of MetricHeaders and ordering of MetricHeaders matches
   * the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricHeader metric_headers = 2;</code>
   */
  com.google.analytics.admin.v1beta.AccessMetricHeaderOrBuilder getMetricHeadersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessRow rows = 3;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.AccessRow> getRowsList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessRow rows = 3;</code>
   */
  com.google.analytics.admin.v1beta.AccessRow getRows(int index);
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessRow rows = 3;</code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessRow rows = 3;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.AccessRowOrBuilder>
      getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessRow rows = 3;</code>
   */
  com.google.analytics.admin.v1beta.AccessRowOrBuilder getRowsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The total number of rows in the query result. `rowCount` is independent of
   * the number of rows returned in the response, the `limit` request
   * parameter, and the `offset` request parameter. For example if a query
   * returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows.
   *
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int32 row_count = 4;</code>
   *
   * @return The rowCount.
   */
  int getRowCount();

  /**
   *
   *
   * <pre>
   * The quota state for this Analytics property including this request. This
   * field doesn't work with account-level requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessQuota quota = 5;</code>
   *
   * @return Whether the quota field is set.
   */
  boolean hasQuota();
  /**
   *
   *
   * <pre>
   * The quota state for this Analytics property including this request. This
   * field doesn't work with account-level requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessQuota quota = 5;</code>
   *
   * @return The quota.
   */
  com.google.analytics.admin.v1beta.AccessQuota getQuota();
  /**
   *
   *
   * <pre>
   * The quota state for this Analytics property including this request. This
   * field doesn't work with account-level requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessQuota quota = 5;</code>
   */
  com.google.analytics.admin.v1beta.AccessQuotaOrBuilder getQuotaOrBuilder();
}
