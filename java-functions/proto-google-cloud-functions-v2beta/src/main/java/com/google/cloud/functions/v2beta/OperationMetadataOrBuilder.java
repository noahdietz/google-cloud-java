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
// source: google/cloud/functions/v2beta/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v2beta;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString getVerbBytes();

  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString getStatusDetailBytes();

  /**
   *
   *
   * <pre>
   * Identifies whether the user has requested cancellation
   * of the operation. Operations that have successfully been cancelled
   * have
   * [google.longrunning.Operation.error][google.longrunning.Operation.error]
   * value with a [google.rpc.Status.code][google.rpc.Status.code] of 1,
   * corresponding to `Code.CANCELLED`.
   * </pre>
   *
   * <code>bool cancel_requested = 6;</code>
   *
   * @return The cancelRequested.
   */
  boolean getCancelRequested();

  /**
   *
   *
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   *
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   *
   *
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   *
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString getApiVersionBytes();

  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request_resource = 8;</code>
   *
   * @return Whether the requestResource field is set.
   */
  boolean hasRequestResource();
  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request_resource = 8;</code>
   *
   * @return The requestResource.
   */
  com.google.protobuf.Any getRequestResource();
  /**
   *
   *
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request_resource = 8;</code>
   */
  com.google.protobuf.AnyOrBuilder getRequestResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Mechanism for reporting in-progress stages
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Stage stages = 9;</code>
   */
  java.util.List<com.google.cloud.functions.v2beta.Stage> getStagesList();
  /**
   *
   *
   * <pre>
   * Mechanism for reporting in-progress stages
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Stage stages = 9;</code>
   */
  com.google.cloud.functions.v2beta.Stage getStages(int index);
  /**
   *
   *
   * <pre>
   * Mechanism for reporting in-progress stages
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Stage stages = 9;</code>
   */
  int getStagesCount();
  /**
   *
   *
   * <pre>
   * Mechanism for reporting in-progress stages
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Stage stages = 9;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2beta.StageOrBuilder>
      getStagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Mechanism for reporting in-progress stages
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Stage stages = 9;</code>
   */
  com.google.cloud.functions.v2beta.StageOrBuilder getStagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The build name of the function for create and update operations.
   * </pre>
   *
   * <code>string build_name = 13;</code>
   *
   * @return The buildName.
   */
  java.lang.String getBuildName();
  /**
   *
   *
   * <pre>
   * The build name of the function for create and update operations.
   * </pre>
   *
   * <code>string build_name = 13;</code>
   *
   * @return The bytes for buildName.
   */
  com.google.protobuf.ByteString getBuildNameBytes();

  /**
   *
   *
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.OperationType operation_type = 11;</code>
   *
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   *
   *
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.OperationType operation_type = 11;</code>
   *
   * @return The operationType.
   */
  com.google.cloud.functions.v2beta.OperationType getOperationType();
}
