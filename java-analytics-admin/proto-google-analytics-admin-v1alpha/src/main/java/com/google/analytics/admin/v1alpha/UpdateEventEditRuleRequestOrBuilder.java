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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

public interface UpdateEventEditRuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateEventEditRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The EventEditRule to update.
   * The resource's `name` field is used to identify the EventEditRule to be
   * updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.EventEditRule event_edit_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the eventEditRule field is set.
   */
  boolean hasEventEditRule();
  /**
   *
   *
   * <pre>
   * Required. The EventEditRule to update.
   * The resource's `name` field is used to identify the EventEditRule to be
   * updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.EventEditRule event_edit_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The eventEditRule.
   */
  com.google.analytics.admin.v1alpha.EventEditRule getEventEditRule();
  /**
   *
   *
   * <pre>
   * Required. The EventEditRule to update.
   * The resource's `name` field is used to identify the EventEditRule to be
   * updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.EventEditRule event_edit_rule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.EventEditRuleOrBuilder getEventEditRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
