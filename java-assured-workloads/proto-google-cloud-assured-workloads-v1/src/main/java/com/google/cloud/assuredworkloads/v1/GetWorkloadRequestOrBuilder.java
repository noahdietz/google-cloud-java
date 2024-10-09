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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.assuredworkloads.v1;

public interface GetWorkloadRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.GetWorkloadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Workload to fetch. This is the workload's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Workload to fetch. This is the workload's
   * relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
