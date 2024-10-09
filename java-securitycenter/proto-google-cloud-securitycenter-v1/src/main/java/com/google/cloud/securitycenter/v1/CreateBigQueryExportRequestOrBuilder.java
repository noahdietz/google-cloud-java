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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

public interface CreateBigQueryExportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateBigQueryExportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource of the new BigQuery export. Its
   * format is `organizations/[organization_id]`, `folders/[folder_id]`, or
   * `projects/[project_id]`.
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
   * Required. The name of the parent resource of the new BigQuery export. Its
   * format is `organizations/[organization_id]`, `folders/[folder_id]`, or
   * `projects/[project_id]`.
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
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigQueryExport field is set.
   */
  boolean hasBigQueryExport();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigQueryExport.
   */
  com.google.cloud.securitycenter.v1.BigQueryExport getBigQueryExport();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder getBigQueryExportOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of only lowercase letters, numbers, and hyphens, must start
   * with a letter, must end with either a letter or a number, and must be 63
   * characters or less.
   * </pre>
   *
   * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bigQueryExportId.
   */
  java.lang.String getBigQueryExportId();
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of only lowercase letters, numbers, and hyphens, must start
   * with a letter, must end with either a letter or a number, and must be 63
   * characters or less.
   * </pre>
   *
   * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bigQueryExportId.
   */
  com.google.protobuf.ByteString getBigQueryExportIdBytes();
}
