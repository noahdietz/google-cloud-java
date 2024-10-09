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
// source: google/cloud/kms/v1/ekm_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.kms.v1;

public interface ListEkmConnectionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListEkmConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  java.util.List<com.google.cloud.kms.v1.EkmConnection> getEkmConnectionsList();
  /**
   *
   *
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  com.google.cloud.kms.v1.EkmConnection getEkmConnections(int index);
  /**
   *
   *
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  int getEkmConnectionsCount();
  /**
   *
   *
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  java.util.List<? extends com.google.cloud.kms.v1.EkmConnectionOrBuilder>
      getEkmConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [EkmConnections][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>repeated .google.cloud.kms.v1.EkmConnection ekm_connections = 1;</code>
   */
  com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in
   * [ListEkmConnectionsRequest.page_token][google.cloud.kms.v1.ListEkmConnectionsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of [EkmConnections][google.cloud.kms.v1.EkmConnection]
   * that matched the query.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
