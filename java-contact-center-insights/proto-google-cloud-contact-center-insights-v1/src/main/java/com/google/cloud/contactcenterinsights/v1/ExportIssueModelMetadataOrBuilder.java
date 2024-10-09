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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

public interface ExportIssueModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.ExportIssueModelMetadata)
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
   * The original export request.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExportIssueModelRequest request = 3;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   *
   *
   * <pre>
   * The original export request.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExportIssueModelRequest request = 3;</code>
   *
   * @return The request.
   */
  com.google.cloud.contactcenterinsights.v1.ExportIssueModelRequest getRequest();
  /**
   *
   *
   * <pre>
   * The original export request.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExportIssueModelRequest request = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.ExportIssueModelRequestOrBuilder getRequestOrBuilder();
}
