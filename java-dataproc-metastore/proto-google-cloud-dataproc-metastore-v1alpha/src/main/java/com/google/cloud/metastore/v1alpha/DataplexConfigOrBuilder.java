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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.metastore.v1alpha;

public interface DataplexConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.DataplexConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  int getLakeResourcesCount();
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  boolean containsLakeResources(java.lang.String key);
  /** Use {@link #getLakeResourcesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> getLakeResources();
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> getLakeResourcesMap();
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  /* nullable */
  com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.metastore.v1alpha.Lake defaultValue);
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrThrow(java.lang.String key);
}
