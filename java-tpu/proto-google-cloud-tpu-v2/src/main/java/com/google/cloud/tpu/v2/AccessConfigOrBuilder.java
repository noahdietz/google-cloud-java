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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tpu.v2;

public interface AccessConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.AccessConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. An external IP address associated with the TPU worker.
   * </pre>
   *
   * <code>string external_ip = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The externalIp.
   */
  java.lang.String getExternalIp();
  /**
   *
   *
   * <pre>
   * Output only. An external IP address associated with the TPU worker.
   * </pre>
   *
   * <code>string external_ip = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for externalIp.
   */
  com.google.protobuf.ByteString getExternalIpBytes();
}
