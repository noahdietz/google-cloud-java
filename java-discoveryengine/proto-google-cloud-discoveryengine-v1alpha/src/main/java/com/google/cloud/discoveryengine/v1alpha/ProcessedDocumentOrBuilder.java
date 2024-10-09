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
// source: google/cloud/discoveryengine/v1alpha/document.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface ProcessedDocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.ProcessedDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The JSON string representation of the processed document.
   * </pre>
   *
   * <code>string json_data = 2;</code>
   *
   * @return Whether the jsonData field is set.
   */
  boolean hasJsonData();
  /**
   *
   *
   * <pre>
   * The JSON string representation of the processed document.
   * </pre>
   *
   * <code>string json_data = 2;</code>
   *
   * @return The jsonData.
   */
  java.lang.String getJsonData();
  /**
   *
   *
   * <pre>
   * The JSON string representation of the processed document.
   * </pre>
   *
   * <code>string json_data = 2;</code>
   *
   * @return The bytes for jsonData.
   */
  com.google.protobuf.ByteString getJsonDataBytes();

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the referenced document, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;branches/&#42;&#47;documents/&#42;`.
   * </pre>
   *
   * <code>
   * string document = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The document.
   */
  java.lang.String getDocument();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the referenced document, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;branches/&#42;&#47;documents/&#42;`.
   * </pre>
   *
   * <code>
   * string document = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for document.
   */
  com.google.protobuf.ByteString getDocumentBytes();

  com.google.cloud.discoveryengine.v1alpha.ProcessedDocument.ProcessedDataFormatCase
      getProcessedDataFormatCase();
}
