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
// source: google/cloud/resourcemanager/v3/organizations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.resourcemanager.v3;

public interface OrganizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.Organization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the organization. This is the
   * organization's relative path in the API. Its format is
   * "organizations/[organization_id]". For example, "organizations/1234".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the organization. This is the
   * organization's relative path in the API. Its format is
   * "organizations/[organization_id]". For example, "organizations/1234".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A human-readable string that refers to the organization in the
   * Google Cloud Console. This string is set by the server and cannot be
   * changed. The string will be set to the primary domain (for example,
   * "google.com") of the Google Workspace customer that owns the organization.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. A human-readable string that refers to the organization in the
   * Google Cloud Console. This string is set by the server and cannot be
   * changed. The string will be set to the primary domain (for example,
   * "google.com") of the Google Workspace customer that owns the organization.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * </pre>
   *
   * <code>string directory_customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return Whether the directoryCustomerId field is set.
   */
  boolean hasDirectoryCustomerId();
  /**
   *
   *
   * <pre>
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * </pre>
   *
   * <code>string directory_customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The directoryCustomerId.
   */
  java.lang.String getDirectoryCustomerId();
  /**
   *
   *
   * <pre>
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * </pre>
   *
   * <code>string directory_customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for directoryCustomerId.
   */
  com.google.protobuf.ByteString getDirectoryCustomerIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The organization's current lifecycle state.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Organization.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The organization's current lifecycle state.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Organization.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.resourcemanager.v3.Organization.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the Organization was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Organization resource. This may be sent on update and delete
   * requests to ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Organization resource. This may be sent on update and delete
   * requests to ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  com.google.cloud.resourcemanager.v3.Organization.OwnerCase getOwnerCase();
}
