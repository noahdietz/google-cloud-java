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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface AdvanceChildRolloutJobRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.AdvanceChildRolloutJobRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the `ChildRollout`. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>string rollout = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rollout.
   */
  java.lang.String getRollout();
  /**
   *
   *
   * <pre>
   * Output only. Name of the `ChildRollout`. Format is
   * `projects/{project}/locations/{location}/deliveryPipelines/{deliveryPipeline}/releases/{release}/rollouts/{rollout}`.
   * </pre>
   *
   * <code>string rollout = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rollout.
   */
  com.google.protobuf.ByteString getRolloutBytes();

  /**
   *
   *
   * <pre>
   * Output only. the ID of the ChildRollout's Phase.
   * </pre>
   *
   * <code>string rollout_phase_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rolloutPhaseId.
   */
  java.lang.String getRolloutPhaseId();
  /**
   *
   *
   * <pre>
   * Output only. the ID of the ChildRollout's Phase.
   * </pre>
   *
   * <code>string rollout_phase_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rolloutPhaseId.
   */
  com.google.protobuf.ByteString getRolloutPhaseIdBytes();
}
