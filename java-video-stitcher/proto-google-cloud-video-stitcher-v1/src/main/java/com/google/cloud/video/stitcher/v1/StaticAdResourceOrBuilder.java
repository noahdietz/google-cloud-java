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
// source: google/cloud/video/stitcher/v1/companions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.stitcher.v1;

public interface StaticAdResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.StaticAdResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI to the static file for the ad resource.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI to the static file for the ad resource.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Describes the MIME type of the ad resource.
   * </pre>
   *
   * <code>string creative_type = 2;</code>
   *
   * @return The creativeType.
   */
  java.lang.String getCreativeType();
  /**
   *
   *
   * <pre>
   * Describes the MIME type of the ad resource.
   * </pre>
   *
   * <code>string creative_type = 2;</code>
   *
   * @return The bytes for creativeType.
   */
  com.google.protobuf.ByteString getCreativeTypeBytes();
}
