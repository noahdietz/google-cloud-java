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
// source: google/cloud/discoveryengine/v1alpha/schema_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface UpdateSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.UpdateSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schema.
   */
  com.google.cloud.discoveryengine.v1alpha.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.SchemaOrBuilder getSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the
   * [Schema][google.cloud.discoveryengine.v1alpha.Schema] is not found, a new
   * [Schema][google.cloud.discoveryengine.v1alpha.Schema] is created. In this
   * situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
