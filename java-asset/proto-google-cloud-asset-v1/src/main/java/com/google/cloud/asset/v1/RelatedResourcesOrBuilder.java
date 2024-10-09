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
// source: google/cloud/asset/v1/assets.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1;

public interface RelatedResourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.RelatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1.RelatedResource> getRelatedResourcesList();
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  com.google.cloud.asset.v1.RelatedResource getRelatedResources(int index);
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  int getRelatedResourcesCount();
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.RelatedResourceOrBuilder>
      getRelatedResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  com.google.cloud.asset.v1.RelatedResourceOrBuilder getRelatedResourcesOrBuilder(int index);
}
