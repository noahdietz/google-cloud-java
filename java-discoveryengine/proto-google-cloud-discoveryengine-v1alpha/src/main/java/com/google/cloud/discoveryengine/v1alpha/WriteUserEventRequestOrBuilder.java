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
// source: google/cloud/discoveryengine/v1alpha/user_event_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface WriteUserEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.WriteUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * If the write user event action is applied in
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] level, the
   * format is:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
   * If the write user event action is applied in [Location][] level, for
   * example, the event with
   * [Document][google.cloud.discoveryengine.v1alpha.Document] across multiple
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore], the format is:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * If the write user event action is applied in
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] level, the
   * format is:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}`.
   * If the write user event action is applied in [Location][] level, for
   * example, the event with
   * [Document][google.cloud.discoveryengine.v1alpha.Document] across multiple
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore], the format is:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * optional .google.cloud.discoveryengine.v1alpha.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * optional .google.cloud.discoveryengine.v1alpha.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEvent.
   */
  com.google.cloud.discoveryengine.v1alpha.UserEvent getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. User event to write.
   * </pre>
   *
   * <code>
   * optional .google.cloud.discoveryengine.v1alpha.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.UserEventOrBuilder getUserEventOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, the user event is written asynchronously after
   * validation, and the API responds without waiting for the write.
   * </pre>
   *
   * <code>bool write_async = 3;</code>
   *
   * @return The writeAsync.
   */
  boolean getWriteAsync();
}
