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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datastream.v1;

public interface BackfillJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.BackfillJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Backfill job state.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BackfillJob.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Backfill job state.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BackfillJob.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.datastream.v1.BackfillJob.State getState();

  /**
   *
   *
   * <pre>
   * Backfill job's triggering reason.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BackfillJob.Trigger trigger = 2;</code>
   *
   * @return The enum numeric value on the wire for trigger.
   */
  int getTriggerValue();
  /**
   *
   *
   * <pre>
   * Backfill job's triggering reason.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BackfillJob.Trigger trigger = 2;</code>
   *
   * @return The trigger.
   */
  com.google.cloud.datastream.v1.BackfillJob.Trigger getTrigger();

  /**
   *
   *
   * <pre>
   * Output only. Backfill job's start time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastStartTime field is set.
   */
  boolean hasLastStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Backfill job's start time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastStartTime.
   */
  com.google.protobuf.Timestamp getLastStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Backfill job's start time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Backfill job's end time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastEndTime field is set.
   */
  boolean hasLastEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Backfill job's end time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastEndTime.
   */
  com.google.protobuf.Timestamp getLastEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Backfill job's end time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Errors which caused the backfill job to fail.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.datastream.v1.Error> getErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors which caused the backfill job to fail.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datastream.v1.Error getErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors which caused the backfill job to fail.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors which caused the backfill job to fail.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.ErrorOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Errors which caused the backfill job to fail.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datastream.v1.Error errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datastream.v1.ErrorOrBuilder getErrorsOrBuilder(int index);
}
