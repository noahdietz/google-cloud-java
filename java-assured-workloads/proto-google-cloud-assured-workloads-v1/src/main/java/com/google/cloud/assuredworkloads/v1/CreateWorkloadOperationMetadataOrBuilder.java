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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.assuredworkloads.v1;

public interface CreateWorkloadOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The display name of the workload.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name of the workload.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The parent of the workload.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. The parent of the workload.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Compliance controls that should be applied to the resources managed by
   * the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for complianceRegime.
   */
  int getComplianceRegimeValue();
  /**
   *
   *
   * <pre>
   * Optional. Compliance controls that should be applied to the resources managed by
   * the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The complianceRegime.
   */
  com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime getComplianceRegime();
}
