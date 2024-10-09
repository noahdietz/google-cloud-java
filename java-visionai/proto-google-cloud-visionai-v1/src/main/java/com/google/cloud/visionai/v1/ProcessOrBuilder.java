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
// source: google/cloud/visionai/v1/lva_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface ProcessOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.Process)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Reference to an existing Analysis resource.
   * </pre>
   *
   * <code>
   * string analysis = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The analysis.
   */
  java.lang.String getAnalysis();
  /**
   *
   *
   * <pre>
   * Required. Reference to an existing Analysis resource.
   * </pre>
   *
   * <code>
   * string analysis = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for analysis.
   */
  com.google.protobuf.ByteString getAnalysisBytes();

  /**
   *
   *
   * <pre>
   * Optional. Attribute overrides of the Analyzers.
   * Format for each single override item:
   * "{analyzer_name}:{attribute_key}={value}"
   * </pre>
   *
   * <code>repeated string attribute_overrides = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the attributeOverrides.
   */
  java.util.List<java.lang.String> getAttributeOverridesList();
  /**
   *
   *
   * <pre>
   * Optional. Attribute overrides of the Analyzers.
   * Format for each single override item:
   * "{analyzer_name}:{attribute_key}={value}"
   * </pre>
   *
   * <code>repeated string attribute_overrides = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of attributeOverrides.
   */
  int getAttributeOverridesCount();
  /**
   *
   *
   * <pre>
   * Optional. Attribute overrides of the Analyzers.
   * Format for each single override item:
   * "{analyzer_name}:{attribute_key}={value}"
   * </pre>
   *
   * <code>repeated string attribute_overrides = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The attributeOverrides at the given index.
   */
  java.lang.String getAttributeOverrides(int index);
  /**
   *
   *
   * <pre>
   * Optional. Attribute overrides of the Analyzers.
   * Format for each single override item:
   * "{analyzer_name}:{attribute_key}={value}"
   * </pre>
   *
   * <code>repeated string attribute_overrides = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the attributeOverrides at the given index.
   */
  com.google.protobuf.ByteString getAttributeOverridesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Status of the Process.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.RunStatus run_status = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the runStatus field is set.
   */
  boolean hasRunStatus();
  /**
   *
   *
   * <pre>
   * Optional. Status of the Process.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.RunStatus run_status = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The runStatus.
   */
  com.google.cloud.visionai.v1.RunStatus getRunStatus();
  /**
   *
   *
   * <pre>
   * Optional. Status of the Process.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.RunStatus run_status = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.visionai.v1.RunStatusOrBuilder getRunStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Run mode of the Process.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.RunMode run_mode = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for runMode.
   */
  int getRunModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Run mode of the Process.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.RunMode run_mode = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The runMode.
   */
  com.google.cloud.visionai.v1.RunMode getRunMode();

  /**
   *
   *
   * <pre>
   * Optional. Event ID of the input/output streams.
   * This is useful when you have a StreamSource/StreamSink operator in the
   * Analysis, and you want to manually specify the Event to read from/write to.
   * </pre>
   *
   * <code>string event_id = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The eventId.
   */
  java.lang.String getEventId();
  /**
   *
   *
   * <pre>
   * Optional. Event ID of the input/output streams.
   * This is useful when you have a StreamSource/StreamSink operator in the
   * Analysis, and you want to manually specify the Event to read from/write to.
   * </pre>
   *
   * <code>string event_id = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for eventId.
   */
  com.google.protobuf.ByteString getEventIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional: Batch ID of the Process.
   * </pre>
   *
   * <code>string batch_id = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The batchId.
   */
  java.lang.String getBatchId();
  /**
   *
   *
   * <pre>
   * Optional. Optional: Batch ID of the Process.
   * </pre>
   *
   * <code>string batch_id = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for batchId.
   */
  com.google.protobuf.ByteString getBatchIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional: The number of retries for a process in submission mode
   * the system should try before declaring failure. By default, no retry will
   * be performed.
   * </pre>
   *
   * <code>int32 retry_count = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The retryCount.
   */
  int getRetryCount();
}
