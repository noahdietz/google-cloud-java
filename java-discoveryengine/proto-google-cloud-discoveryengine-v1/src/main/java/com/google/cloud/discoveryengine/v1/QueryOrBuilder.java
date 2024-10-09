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
// source: google/cloud/discoveryengine/v1/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface QueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.Query)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * Plain text.
   * </pre>
   *
   * <code>string text = 2;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Unique Id for the query.
   * </pre>
   *
   * <code>string query_id = 1;</code>
   *
   * @return The queryId.
   */
  java.lang.String getQueryId();
  /**
   *
   *
   * <pre>
   * Unique Id for the query.
   * </pre>
   *
   * <code>string query_id = 1;</code>
   *
   * @return The bytes for queryId.
   */
  com.google.protobuf.ByteString getQueryIdBytes();

  com.google.cloud.discoveryengine.v1.Query.ContentCase getContentCase();
}
