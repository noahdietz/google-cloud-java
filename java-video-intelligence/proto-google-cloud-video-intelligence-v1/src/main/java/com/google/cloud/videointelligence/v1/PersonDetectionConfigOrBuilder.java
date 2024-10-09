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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1;

public interface PersonDetectionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.PersonDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether bounding boxes are included in the person detection annotation
   * output.
   * </pre>
   *
   * <code>bool include_bounding_boxes = 1;</code>
   *
   * @return The includeBoundingBoxes.
   */
  boolean getIncludeBoundingBoxes();

  /**
   *
   *
   * <pre>
   * Whether to enable pose landmarks detection. Ignored if
   * 'include_bounding_boxes' is set to false.
   * </pre>
   *
   * <code>bool include_pose_landmarks = 2;</code>
   *
   * @return The includePoseLandmarks.
   */
  boolean getIncludePoseLandmarks();

  /**
   *
   *
   * <pre>
   * Whether to enable person attributes detection, such as cloth color (black,
   * blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair,
   * etc.
   * Ignored if 'include_bounding_boxes' is set to false.
   * </pre>
   *
   * <code>bool include_attributes = 3;</code>
   *
   * @return The includeAttributes.
   */
  boolean getIncludeAttributes();
}
