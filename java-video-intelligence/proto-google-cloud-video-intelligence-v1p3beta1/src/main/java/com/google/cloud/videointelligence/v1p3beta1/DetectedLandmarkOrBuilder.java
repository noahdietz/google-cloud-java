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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1p3beta1;

public interface DetectedLandmarkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.DetectedLandmark)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this landmark, for example, left_hand, right_shoulder.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of this landmark, for example, left_hand, right_shoulder.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   *
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   *
   *
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   *
   * @return The point.
   */
  com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex getPoint();
  /**
   *
   *
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder getPointOrBuilder();

  /**
   *
   *
   * <pre>
   * The confidence score of the detected landmark. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 3;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}
