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

public interface GetDiskTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetDiskTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the disk type to return.
   * </pre>
   *
   * <code>string disk_type = 93009052 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Name of the disk type to return.
   * </pre>
   *
   * <code>string disk_type = 93009052 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
