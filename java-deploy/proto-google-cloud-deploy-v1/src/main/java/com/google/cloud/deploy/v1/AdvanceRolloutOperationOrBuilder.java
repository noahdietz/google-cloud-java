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

public interface AdvanceRolloutOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.AdvanceRolloutOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The phase of a deployment that initiated the operation.
   * </pre>
   *
   * <code>string source_phase = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourcePhase.
   */
  java.lang.String getSourcePhase();
  /**
   *
   *
   * <pre>
   * Output only. The phase of a deployment that initiated the operation.
   * </pre>
   *
   * <code>string source_phase = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourcePhase.
   */
  com.google.protobuf.ByteString getSourcePhaseBytes();

  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the wait field is set.
   */
  boolean hasWait();
  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The wait.
   */
  com.google.protobuf.Duration getWait();
  /**
   *
   *
   * <pre>
   * Output only. How long the operation will be paused.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.DurationOrBuilder getWaitOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rollout.
   */
  java.lang.String getRollout();
  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rollout.
   */
  com.google.protobuf.ByteString getRolloutBytes();

  /**
   *
   *
   * <pre>
   * Output only. The phase the rollout will be advanced to.
   * </pre>
   *
   * <code>string destination_phase = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The destinationPhase.
   */
  java.lang.String getDestinationPhase();
  /**
   *
   *
   * <pre>
   * Output only. The phase the rollout will be advanced to.
   * </pre>
   *
   * <code>string destination_phase = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for destinationPhase.
   */
  com.google.protobuf.ByteString getDestinationPhaseBytes();
}
