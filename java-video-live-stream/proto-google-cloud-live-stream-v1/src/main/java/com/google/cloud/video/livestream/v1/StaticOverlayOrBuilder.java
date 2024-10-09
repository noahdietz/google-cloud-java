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
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.livestream.v1;

public interface StaticOverlayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.StaticOverlay)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Asset to use for the overlaid image.
   * The asset must be represented in the form of:
   * `projects/{project}/locations/{location}/assets/{assetId}`.
   * The asset's resource type must be image.
   * </pre>
   *
   * <code>
   * string asset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Required. Asset to use for the overlaid image.
   * The asset must be represented in the form of:
   * `projects/{project}/locations/{location}/assets/{assetId}`.
   * The asset's resource type must be image.
   * </pre>
   *
   * <code>
   * string asset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * Optional. Normalized image resolution, based on output video resolution.
   * Valid values are [0.0, 1.0]. To respect the original image aspect ratio,
   * set either `w` or `h` to 0. To use the original image resolution, set both
   * `w` and `h` to 0. The default is {0, 0}.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedResolution resolution = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the resolution field is set.
   */
  boolean hasResolution();
  /**
   *
   *
   * <pre>
   * Optional. Normalized image resolution, based on output video resolution.
   * Valid values are [0.0, 1.0]. To respect the original image aspect ratio,
   * set either `w` or `h` to 0. To use the original image resolution, set both
   * `w` and `h` to 0. The default is {0, 0}.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedResolution resolution = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The resolution.
   */
  com.google.cloud.video.livestream.v1.NormalizedResolution getResolution();
  /**
   *
   *
   * <pre>
   * Optional. Normalized image resolution, based on output video resolution.
   * Valid values are [0.0, 1.0]. To respect the original image aspect ratio,
   * set either `w` or `h` to 0. To use the original image resolution, set both
   * `w` and `h` to 0. The default is {0, 0}.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedResolution resolution = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.video.livestream.v1.NormalizedResolutionOrBuilder getResolutionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Position of the image in terms of normalized coordinates of the
   * upper-left corner of the image, based on output video resolution. For
   * example, use the x and y coordinates {0, 0} to position the top-left corner
   * of the overlay animation in the top-left corner of the output video.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedCoordinate position = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   *
   *
   * <pre>
   * Optional. Position of the image in terms of normalized coordinates of the
   * upper-left corner of the image, based on output video resolution. For
   * example, use the x and y coordinates {0, 0} to position the top-left corner
   * of the overlay animation in the top-left corner of the output video.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedCoordinate position = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The position.
   */
  com.google.cloud.video.livestream.v1.NormalizedCoordinate getPosition();
  /**
   *
   *
   * <pre>
   * Optional. Position of the image in terms of normalized coordinates of the
   * upper-left corner of the image, based on output video resolution. For
   * example, use the x and y coordinates {0, 0} to position the top-left corner
   * of the overlay animation in the top-left corner of the output video.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.NormalizedCoordinate position = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.video.livestream.v1.NormalizedCoordinateOrBuilder getPositionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Target image opacity. Valid values are from `1.0` (solid,
   * default) to `0.0` (transparent), exclusive. Set this to a value greater
   * than `0.0`.
   * </pre>
   *
   * <code>double opacity = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The opacity.
   */
  double getOpacity();
}
