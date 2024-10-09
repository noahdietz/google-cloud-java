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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface RackSpaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.RackSpace)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. First rack unit of the rack space (inclusive).
   * </pre>
   *
   * <code>int32 start_rack_unit = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The startRackUnit.
   */
  int getStartRackUnit();

  /**
   *
   *
   * <pre>
   * Required. Last rack unit of the rack space (inclusive).
   * </pre>
   *
   * <code>int32 end_rack_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endRackUnit.
   */
  int getEndRackUnit();
}
