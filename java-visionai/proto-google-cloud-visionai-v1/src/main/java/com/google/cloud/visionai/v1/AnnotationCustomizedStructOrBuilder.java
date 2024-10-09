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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface AnnotationCustomizedStructOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.AnnotationCustomizedStruct)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A map from elements' keys to element's annotation value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AnnotationValue&gt; elements = 2;</code>
   */
  int getElementsCount();
  /**
   *
   *
   * <pre>
   * A map from elements' keys to element's annotation value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AnnotationValue&gt; elements = 2;</code>
   */
  boolean containsElements(java.lang.String key);
  /** Use {@link #getElementsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.visionai.v1.AnnotationValue> getElements();
  /**
   *
   *
   * <pre>
   * A map from elements' keys to element's annotation value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AnnotationValue&gt; elements = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.visionai.v1.AnnotationValue> getElementsMap();
  /**
   *
   *
   * <pre>
   * A map from elements' keys to element's annotation value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AnnotationValue&gt; elements = 2;</code>
   */
  /* nullable */
  com.google.cloud.visionai.v1.AnnotationValue getElementsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.visionai.v1.AnnotationValue defaultValue);
  /**
   *
   *
   * <pre>
   * A map from elements' keys to element's annotation value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AnnotationValue&gt; elements = 2;</code>
   */
  com.google.cloud.visionai.v1.AnnotationValue getElementsOrThrow(java.lang.String key);
}
