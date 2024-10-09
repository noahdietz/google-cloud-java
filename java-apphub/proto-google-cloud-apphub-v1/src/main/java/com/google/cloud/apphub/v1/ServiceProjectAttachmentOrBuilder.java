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
// source: google/cloud/apphub/v1/service_project_attachment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apphub.v1;

public interface ServiceProjectAttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apphub.v1.ServiceProjectAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of a ServiceProjectAttachment. Format:
   * "projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}."
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of a ServiceProjectAttachment. Format:
   * "projects/{host-project-id}/locations/global/serviceProjectAttachments/{service-project-id}."
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Service project name in the format: "projects/abc" or
   * "projects/123". As input, project name with either project id or number are
   * accepted. As output, this field will contain project number.
   * </pre>
   *
   * <code>
   * string service_project = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceProject.
   */
  java.lang.String getServiceProject();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Service project name in the format: "projects/abc" or
   * "projects/123". As input, project name with either project id or number are
   * accepted. As output, this field will contain project number.
   * </pre>
   *
   * <code>
   * string service_project = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceProject.
   */
  com.google.protobuf.ByteString getServiceProjectBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier (in UUID4 format) for the
   * `ServiceProjectAttachment`.
   * </pre>
   *
   * <code>
   * string uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier (in UUID4 format) for the
   * `ServiceProjectAttachment`.
   * </pre>
   *
   * <code>
   * string uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. ServiceProjectAttachment state.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.ServiceProjectAttachment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. ServiceProjectAttachment state.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.ServiceProjectAttachment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.apphub.v1.ServiceProjectAttachment.State getState();
}
