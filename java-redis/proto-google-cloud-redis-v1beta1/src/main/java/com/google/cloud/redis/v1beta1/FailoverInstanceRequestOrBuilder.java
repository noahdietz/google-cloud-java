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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.v1beta1;

public interface FailoverInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.FailoverInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
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
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Available data protection modes that the user can choose. If it's
   * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataProtectionMode.
   */
  int getDataProtectionModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Available data protection modes that the user can choose. If it's
   * unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.FailoverInstanceRequest.DataProtectionMode data_protection_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataProtectionMode.
   */
  com.google.cloud.redis.v1beta1.FailoverInstanceRequest.DataProtectionMode getDataProtectionMode();
}
