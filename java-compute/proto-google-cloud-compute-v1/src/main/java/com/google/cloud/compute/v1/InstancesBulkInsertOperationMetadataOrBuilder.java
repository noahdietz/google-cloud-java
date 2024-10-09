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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface InstancesBulkInsertOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  int getPerLocationStatusCount();
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  boolean containsPerLocationStatus(java.lang.String key);
  /** Use {@link #getPerLocationStatusMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      getPerLocationStatus();
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      getPerLocationStatusMap();
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.BulkInsertOperationStatus getPerLocationStatusOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.BulkInsertOperationStatus defaultValue);
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  com.google.cloud.compute.v1.BulkInsertOperationStatus getPerLocationStatusOrThrow(
      java.lang.String key);
}
