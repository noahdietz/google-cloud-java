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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface ImportFeatureValuesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ImportFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of entities that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_entity_count = 1;</code>
   *
   * @return The importedEntityCount.
   */
  long getImportedEntityCount();

  /**
   *
   *
   * <pre>
   * Number of Feature values that have been imported by the operation.
   * </pre>
   *
   * <code>int64 imported_feature_value_count = 2;</code>
   *
   * @return The importedFeatureValueCount.
   */
  long getImportedFeatureValueCount();

  /**
   *
   *
   * <pre>
   * The number of rows in input source that weren't imported due to either
   * * Not having any featureValues.
   * * Having a null entityId.
   * * Having a null timestamp.
   * * Not being parsable (applicable for CSV sources).
   * </pre>
   *
   * <code>int64 invalid_row_count = 6;</code>
   *
   * @return The invalidRowCount.
   */
  long getInvalidRowCount();

  /**
   *
   *
   * <pre>
   * The number rows that weren't ingested due to having feature timestamps
   * outside the retention boundary.
   * </pre>
   *
   * <code>int64 timestamp_outside_retention_rows_count = 4;</code>
   *
   * @return The timestampOutsideRetentionRowsCount.
   */
  long getTimestampOutsideRetentionRowsCount();
}
