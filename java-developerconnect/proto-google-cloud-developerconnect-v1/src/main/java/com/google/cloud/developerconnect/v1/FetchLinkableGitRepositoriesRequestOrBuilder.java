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
// source: google/cloud/developerconnect/v1/developer_connect.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.developerconnect.v1;

public interface FetchLinkableGitRepositoriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.developerconnect.v1.FetchLinkableGitRepositoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Connection.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;`.
   * </pre>
   *
   * <code>
   * string connection = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The connection.
   */
  java.lang.String getConnection();
  /**
   *
   *
   * <pre>
   * Required. The name of the Connection.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;`.
   * </pre>
   *
   * <code>
   * string connection = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for connection.
   */
  com.google.protobuf.ByteString getConnectionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Number of results to return in the list. Defaults to 20.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Page start.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Page start.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
