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
// source: google/monitoring/v3/service_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface UpdateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `Service` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Required. The `Service` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  com.google.monitoring.v3.Service getService();
  /**
   *
   *
   * <pre>
   * Required. The `Service` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.ServiceOrBuilder getServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of field paths defining which fields to use for the update.
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
   * A set of field paths defining which fields to use for the update.
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
   * A set of field paths defining which fields to use for the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
