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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datafusion.v1beta1;

public interface ListAvailableVersionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  java.util.List<com.google.cloud.datafusion.v1beta1.Version> getAvailableVersionsList();
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.Version getAvailableVersions(int index);
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  int getAvailableVersionsCount();
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datafusion.v1beta1.VersionOrBuilder>
      getAvailableVersionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.VersionOrBuilder getAvailableVersionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
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
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
