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
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface GetModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.GetModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
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
   * Required. The name of the Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
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
