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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface WorkloadALTSConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WorkloadALTSConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   *
   * @return Whether the enableAlts field is set.
   */
  boolean hasEnableAlts();
  /**
   *
   *
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   *
   * @return The enableAlts.
   */
  com.google.protobuf.BoolValue getEnableAlts();
  /**
   *
   *
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnableAltsOrBuilder();
}
