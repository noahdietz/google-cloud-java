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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1;

public interface EntityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.Entity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string entity_id = 1;</code>
   *
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   *
   *
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string entity_id = 1;</code>
   *
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString getEntityIdBytes();

  /**
   *
   *
   * <pre>
   * Textual description, e.g., `Fixed-gear bicycle`.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Textual description, e.g., `Fixed-gear bicycle`.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Language code for `description` in BCP-47 format.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language code for `description` in BCP-47 format.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
