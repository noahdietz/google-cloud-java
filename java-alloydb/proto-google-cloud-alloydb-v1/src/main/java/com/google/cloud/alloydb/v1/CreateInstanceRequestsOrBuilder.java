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
// source: google/cloud/alloydb/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1;

public interface CreateInstanceRequestsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.CreateInstanceRequests)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.alloydb.v1.CreateInstanceRequest> getCreateInstanceRequestsList();
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.alloydb.v1.CreateInstanceRequest getCreateInstanceRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getCreateInstanceRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.alloydb.v1.CreateInstanceRequestOrBuilder>
      getCreateInstanceRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.alloydb.v1.CreateInstanceRequestOrBuilder getCreateInstanceRequestsOrBuilder(
      int index);
}
