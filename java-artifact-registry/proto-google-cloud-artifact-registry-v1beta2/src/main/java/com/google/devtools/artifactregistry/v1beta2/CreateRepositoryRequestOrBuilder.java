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
// source: google/devtools/artifactregistry/v1beta2/repository.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.artifactregistry.v1beta2;

public interface CreateRepositoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource where the repository will be created.
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
   * Required. The name of the parent resource where the repository will be created.
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
   * The repository id to use for this repository.
   * </pre>
   *
   * <code>string repository_id = 2;</code>
   *
   * @return The repositoryId.
   */
  java.lang.String getRepositoryId();
  /**
   *
   *
   * <pre>
   * The repository id to use for this repository.
   * </pre>
   *
   * <code>string repository_id = 2;</code>
   *
   * @return The bytes for repositoryId.
   */
  com.google.protobuf.ByteString getRepositoryIdBytes();

  /**
   *
   *
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   *
   *
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   *
   * @return The repository.
   */
  com.google.devtools.artifactregistry.v1beta2.Repository getRepository();
  /**
   *
   *
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder getRepositoryOrBuilder();
}
