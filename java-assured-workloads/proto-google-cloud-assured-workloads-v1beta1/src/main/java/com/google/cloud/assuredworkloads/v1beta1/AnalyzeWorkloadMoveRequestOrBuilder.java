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
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.assuredworkloads.v1beta1;

public interface AnalyzeWorkloadMoveRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source type is a project-based workload. Specify the workloads's
   * relative resource name, formatted as:
   * "organizations/{ORGANIZATION_ID}/locations/{LOCATION_ID}/workloads/{WORKLOAD_ID}"
   * For example:
   * "organizations/123/locations/us-east1/workloads/assured-workload-1"
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The source type is a project-based workload. Specify the workloads's
   * relative resource name, formatted as:
   * "organizations/{ORGANIZATION_ID}/locations/{LOCATION_ID}/workloads/{WORKLOAD_ID}"
   * For example:
   * "organizations/123/locations/us-east1/workloads/assured-workload-1"
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The source type is a project-based workload. Specify the workloads's
   * relative resource name, formatted as:
   * "organizations/{ORGANIZATION_ID}/locations/{LOCATION_ID}/workloads/{WORKLOAD_ID}"
   * For example:
   * "organizations/123/locations/us-east1/workloads/assured-workload-1"
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * The source type is a project. Specify the project's relative resource
   * name, formatted as either a project number or a project ID:
   * "projects/{PROJECT_NUMBER}" or "projects/{PROJECT_ID}"
   * For example:
   * "projects/951040570662" when specifying a project number, or
   * "projects/my-project-123" when specifying a project ID.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   *
   *
   * <pre>
   * The source type is a project. Specify the project's relative resource
   * name, formatted as either a project number or a project ID:
   * "projects/{PROJECT_NUMBER}" or "projects/{PROJECT_ID}"
   * For example:
   * "projects/951040570662" when specifying a project number, or
   * "projects/my-project-123" when specifying a project ID.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The source type is a project. Specify the project's relative resource
   * name, formatted as either a project number or a project ID:
   * "projects/{PROJECT_NUMBER}" or "projects/{PROJECT_ID}"
   * For example:
   * "projects/951040570662" when specifying a project number, or
   * "projects/my-project-123" when specifying a project ID.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource ID of the folder-based destination workload. This workload is
   * where the source project will hypothetically be moved to. Specify the
   * workload's relative resource name, formatted as:
   * "organizations/{ORGANIZATION_ID}/locations/{LOCATION_ID}/workloads/{WORKLOAD_ID}"
   * For example:
   * "organizations/123/locations/us-east1/workloads/assured-workload-2"
   * </pre>
   *
   * <code>string target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Required. The resource ID of the folder-based destination workload. This workload is
   * where the source project will hypothetically be moved to. Specify the
   * workload's relative resource name, formatted as:
   * "organizations/{ORGANIZATION_ID}/locations/{LOCATION_ID}/workloads/{WORKLOAD_ID}"
   * For example:
   * "organizations/123/locations/us-east1/workloads/assured-workload-2"
   * </pre>
   *
   * <code>string target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveRequest.ProjectOrWorkloadResourceCase
      getProjectOrWorkloadResourceCase();
}
