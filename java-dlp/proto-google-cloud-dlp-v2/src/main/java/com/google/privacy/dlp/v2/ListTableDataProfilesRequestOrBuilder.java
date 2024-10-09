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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface ListTableDataProfilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListTableDataProfilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the organization or project, for
   * example `organizations/433245324/locations/europe` or
   * `projects/project-id/locations/asia`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the organization or project, for
   * example `organizations/433245324/locations/europe` or
   * `projects/project-id/locations/asia`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Page token to continue retrieval.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Page token to continue retrieval.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Size of the page. This value can be limited by the server. If zero, server
   * returns a page of max size 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Comma-separated list of fields to order by, followed by `asc` or `desc`
   * postfix. This list is case insensitive. The default sorting order is
   * ascending. Redundant space characters are insignificant. Only one order
   * field at a time is allowed.
   *
   * Examples:
   * * `project_id asc`
   * * `table_id`
   * * `sensitivity_level desc`
   *
   * Supported fields are:
   *
   * - `project_id`: The Google Cloud project ID.
   * - `dataset_id`: The ID of a BigQuery dataset.
   * - `table_id`: The ID of a BigQuery table.
   * - `sensitivity_level`: How sensitive the data in a table is, at most.
   * - `data_risk_level`: How much risk is associated with this data.
   * - `profile_last_generated`: When the profile was last updated in epoch
   * seconds.
   * - `last_modified`: The last time the resource was modified.
   * - `resource_visibility`: Visibility restriction for this resource.
   * - `row_count`: Number of rows in this resource.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Comma-separated list of fields to order by, followed by `asc` or `desc`
   * postfix. This list is case insensitive. The default sorting order is
   * ascending. Redundant space characters are insignificant. Only one order
   * field at a time is allowed.
   *
   * Examples:
   * * `project_id asc`
   * * `table_id`
   * * `sensitivity_level desc`
   *
   * Supported fields are:
   *
   * - `project_id`: The Google Cloud project ID.
   * - `dataset_id`: The ID of a BigQuery dataset.
   * - `table_id`: The ID of a BigQuery table.
   * - `sensitivity_level`: How sensitive the data in a table is, at most.
   * - `data_risk_level`: How much risk is associated with this data.
   * - `profile_last_generated`: When the profile was last updated in epoch
   * seconds.
   * - `last_modified`: The last time the resource was modified.
   * - `resource_visibility`: Visibility restriction for this resource.
   * - `row_count`: Number of rows in this resource.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Allows filtering.
   *
   * Supported syntax:
   *
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values:
   *     - `project_id` - The Google Cloud project ID.
   *     - `dataset_id` - The BigQuery dataset ID.
   *     - `table_id` - The ID of the BigQuery table.
   *     - `sensitivity_level` - HIGH|MODERATE|LOW
   *     - `data_risk_level` - HIGH|MODERATE|LOW
   *     - `resource_visibility`: PUBLIC|RESTRICTED
   *     - `status_code` - an RPC status code as defined in
   *     https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto
   * * The operator must be `=` or `!=`.
   *
   * Examples:
   *
   * * `project_id = 12345 AND status_code = 1`
   * * `project_id = 12345 AND sensitivity_level = HIGH`
   * * `project_id = 12345 AND resource_visibility = PUBLIC`
   *
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Allows filtering.
   *
   * Supported syntax:
   *
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values:
   *     - `project_id` - The Google Cloud project ID.
   *     - `dataset_id` - The BigQuery dataset ID.
   *     - `table_id` - The ID of the BigQuery table.
   *     - `sensitivity_level` - HIGH|MODERATE|LOW
   *     - `data_risk_level` - HIGH|MODERATE|LOW
   *     - `resource_visibility`: PUBLIC|RESTRICTED
   *     - `status_code` - an RPC status code as defined in
   *     https://github.com/googleapis/googleapis/blob/master/google/rpc/code.proto
   * * The operator must be `=` or `!=`.
   *
   * Examples:
   *
   * * `project_id = 12345 AND status_code = 1`
   * * `project_id = 12345 AND sensitivity_level = HIGH`
   * * `project_id = 12345 AND resource_visibility = PUBLIC`
   *
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
