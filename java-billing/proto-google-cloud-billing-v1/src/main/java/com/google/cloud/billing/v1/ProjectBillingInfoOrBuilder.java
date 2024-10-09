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
// source: google/cloud/billing/v1/cloud_billing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.billing.v1;

public interface ProjectBillingInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.ProjectBillingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the
   * billing information for project `tokyo-rain-123` would be
   * `projects/tokyo-rain-123/billingInfo`.
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
   * Output only. The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the
   * billing information for project `tokyo-rain-123` would be
   * `projects/tokyo-rain-123/billingInfo`.
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
   * Output only. The ID of the project that this `ProjectBillingInfo`
   * represents, such as `tokyo-rain-123`. This is a convenience field so that
   * you don't need to parse the `name` field to obtain a project ID.
   * </pre>
   *
   * <code>string project_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. The ID of the project that this `ProjectBillingInfo`
   * represents, such as `tokyo-rain-123`. This is a convenience field so that
   * you don't need to parse the `name` field to obtain a project ID.
   * </pre>
   *
   * <code>string project_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the billing account associated with the project, if
   * any. For example, `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account_name = 3;</code>
   *
   * @return The billingAccountName.
   */
  java.lang.String getBillingAccountName();
  /**
   *
   *
   * <pre>
   * The resource name of the billing account associated with the project, if
   * any. For example, `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account_name = 3;</code>
   *
   * @return The bytes for billingAccountName.
   */
  com.google.protobuf.ByteString getBillingAccountNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. True if the project is associated with an open billing
   * account, to which usage on the project is charged. False if the project is
   * associated with a closed billing account, or no billing account at all, and
   * therefore cannot use paid services.
   * </pre>
   *
   * <code>bool billing_enabled = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The billingEnabled.
   */
  boolean getBillingEnabled();
}
