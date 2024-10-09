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
// source: google/cloud/baremetalsolution/v2/osimage.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.baremetalsolution.v2;

public interface ListOSImagesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.ListOSImagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The OS images available.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.OSImage os_images = 1;</code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.OSImage> getOsImagesList();
  /**
   *
   *
   * <pre>
   * The OS images available.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.OSImage os_images = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.OSImage getOsImages(int index);
  /**
   *
   *
   * <pre>
   * The OS images available.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.OSImage os_images = 1;</code>
   */
  int getOsImagesCount();
  /**
   *
   *
   * <pre>
   * The OS images available.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.OSImage os_images = 1;</code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.OSImageOrBuilder>
      getOsImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The OS images available.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.OSImage os_images = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.OSImageOrBuilder getOsImagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
