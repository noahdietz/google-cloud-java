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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface AlloyDbConnectionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.AlloyDbConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster ID that this connection profile is associated
   * with.
   * </pre>
   *
   * <code>string cluster_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterId.
   */
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster ID that this connection profile is associated
   * with.
   * </pre>
   *
   * <code>string cluster_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterId.
   */
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The settings.
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings getSettings();
  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.clouddms.v1.AlloyDbSettingsOrBuilder getSettingsOrBuilder();
}
