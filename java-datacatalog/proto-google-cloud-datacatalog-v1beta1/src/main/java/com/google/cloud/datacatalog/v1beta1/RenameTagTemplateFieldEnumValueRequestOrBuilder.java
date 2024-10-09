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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface RenameTagTemplateFieldEnumValueRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.RenameTagTemplateFieldEnumValueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the enum field value. Example:
   *
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}/enumValues/{enum_value_display_name}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the enum field value. Example:
   *
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}/enumValues/{enum_value_display_name}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new display name of the enum value. For example,
   * `my_new_enum_value`.
   * </pre>
   *
   * <code>string new_enum_value_display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The newEnumValueDisplayName.
   */
  java.lang.String getNewEnumValueDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The new display name of the enum value. For example,
   * `my_new_enum_value`.
   * </pre>
   *
   * <code>string new_enum_value_display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for newEnumValueDisplayName.
   */
  com.google.protobuf.ByteString getNewEnumValueDisplayNameBytes();
}
