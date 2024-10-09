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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface NormalizedPolylineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.NormalizedPolyline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.NormalizedVertex>
      getNormalizedVerticesList();
  /**
   *
   *
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedVertex getNormalizedVertices(int index);
  /**
   *
   *
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  int getNormalizedVerticesCount();
  /**
   *
   *
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder>
      getNormalizedVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The normalized polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}
