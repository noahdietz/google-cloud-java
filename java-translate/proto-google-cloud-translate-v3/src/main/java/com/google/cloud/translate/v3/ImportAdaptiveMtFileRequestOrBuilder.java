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
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.translate.v3;

public interface ImportAdaptiveMtFileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.ImportAdaptiveMtFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the file, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}`
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
   * Required. The resource name of the file, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}`
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
   * Inline file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.FileInputSource file_input_source = 2;</code>
   *
   * @return Whether the fileInputSource field is set.
   */
  boolean hasFileInputSource();
  /**
   *
   *
   * <pre>
   * Inline file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.FileInputSource file_input_source = 2;</code>
   *
   * @return The fileInputSource.
   */
  com.google.cloud.translate.v3.FileInputSource getFileInputSource();
  /**
   *
   *
   * <pre>
   * Inline file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.FileInputSource file_input_source = 2;</code>
   */
  com.google.cloud.translate.v3.FileInputSourceOrBuilder getFileInputSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsInputSource gcs_input_source = 3;</code>
   *
   * @return Whether the gcsInputSource field is set.
   */
  boolean hasGcsInputSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsInputSource gcs_input_source = 3;</code>
   *
   * @return The gcsInputSource.
   */
  com.google.cloud.translate.v3.GcsInputSource getGcsInputSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage file source.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsInputSource gcs_input_source = 3;</code>
   */
  com.google.cloud.translate.v3.GcsInputSourceOrBuilder getGcsInputSourceOrBuilder();

  com.google.cloud.translate.v3.ImportAdaptiveMtFileRequest.SourceCase getSourceCase();
}
