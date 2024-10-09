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
// source: google/cloud/notebooks/v2/gce_setup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v2;

public interface ContainerImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.ContainerImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The repository.
   */
  java.lang.String getRepository();
  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString getRepositoryBytes();

  /**
   *
   *
   * <pre>
   * Optional. The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   *
   *
   * <pre>
   * Optional. The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString getTagBytes();
}
