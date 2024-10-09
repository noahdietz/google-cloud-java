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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datapolicies.v1;

public interface RenameDataPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.RenameDataPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the data policy to rename. The format is
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the data policy to rename. The format is
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new data policy id.
   * </pre>
   *
   * <code>string new_data_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The newDataPolicyId.
   */
  java.lang.String getNewDataPolicyId();
  /**
   *
   *
   * <pre>
   * Required. The new data policy id.
   * </pre>
   *
   * <code>string new_data_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for newDataPolicyId.
   */
  com.google.protobuf.ByteString getNewDataPolicyIdBytes();
}
