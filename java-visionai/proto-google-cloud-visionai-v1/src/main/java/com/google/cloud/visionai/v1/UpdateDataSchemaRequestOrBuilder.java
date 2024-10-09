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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface UpdateDataSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.UpdateDataSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The data schema's `name` field is used to identify the data
   * schema to be updated. Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataSchema field is set.
   */
  boolean hasDataSchema();
  /**
   *
   *
   * <pre>
   * Required. The data schema's `name` field is used to identify the data
   * schema to be updated. Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataSchema.
   */
  com.google.cloud.visionai.v1.DataSchema getDataSchema();
  /**
   *
   *
   * <pre>
   * Required. The data schema's `name` field is used to identify the data
   * schema to be updated. Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/dataSchemas/{data_schema}`
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.visionai.v1.DataSchemaOrBuilder getDataSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
