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
// source: google/cloud/aiplatform/v1/service_networking.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface PSCAutomationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PSCAutomationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project id used to create forwarding rule.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. Project id used to create forwarding rule.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks).
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in '12345', and {network} is
   * network name.
   * </pre>
   *
   * <code>string network = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Required. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks).
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in '12345', and {network} is
   * network name.
   * </pre>
   *
   * <code>string network = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();
}
