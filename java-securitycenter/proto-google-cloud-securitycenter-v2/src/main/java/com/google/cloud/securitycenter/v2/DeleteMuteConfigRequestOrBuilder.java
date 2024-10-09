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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public interface DeleteMuteConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.DeleteMuteConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the mute config to delete. The following list shows some
   * examples of the format:
   *
   * + `organizations/{organization}/muteConfigs/{config_id}`
   * +
   * `organizations/{organization}/locations/{location}/muteConfigs/{config_id}`
   * + `folders/{folder}/muteConfigs/{config_id}`
   * + `folders/{folder}/locations/{location}/muteConfigs/{config_id}`
   * + `projects/{project}/muteConfigs/{config_id}`
   * + `projects/{project}/locations/{location}/muteConfigs/{config_id}`
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
   * Required. Name of the mute config to delete. The following list shows some
   * examples of the format:
   *
   * + `organizations/{organization}/muteConfigs/{config_id}`
   * +
   * `organizations/{organization}/locations/{location}/muteConfigs/{config_id}`
   * + `folders/{folder}/muteConfigs/{config_id}`
   * + `folders/{folder}/locations/{location}/muteConfigs/{config_id}`
   * + `projects/{project}/muteConfigs/{config_id}`
   * + `projects/{project}/locations/{location}/muteConfigs/{config_id}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
