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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface ListConnectionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Connection connections = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Connection> getConnectionsList();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Connection connections = 1;</code>
   */
  com.google.privacy.dlp.v2.Connection getConnections(int index);
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Connection connections = 1;</code>
   */
  int getConnectionsCount();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Connection connections = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ConnectionOrBuilder>
      getConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Connection connections = 1;</code>
   */
  com.google.privacy.dlp.v2.ConnectionOrBuilder getConnectionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. An empty value means there are
   * no more results.
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
   * Token to retrieve the next page of results. An empty value means there are
   * no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
