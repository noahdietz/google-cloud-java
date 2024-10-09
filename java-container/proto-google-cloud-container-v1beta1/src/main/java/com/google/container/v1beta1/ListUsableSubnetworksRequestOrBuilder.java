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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface ListUsableSubnetworksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListUsableSubnetworksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent project where subnetworks are usable.
   * Specified in the format `projects/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent project where subnetworks are usable.
   * Specified in the format `projects/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Filtering currently only supports equality on the networkProjectId and must
   * be in the form: "networkProjectId=[PROJECTID]", where `networkProjectId`
   * is the project which owns the listed subnetworks. This defaults to the
   * parent project ID.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filtering currently only supports equality on the networkProjectId and must
   * be in the form: "networkProjectId=[PROJECTID]", where `networkProjectId`
   * is the project which owns the listed subnetworks. This defaults to the
   * parent project ID.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The max number of results per page that should be returned. If the number
   * of available results is larger than `page_size`, a `next_page_token` is
   * returned which can be used to get the next page of results in subsequent
   * requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Specifies a page token to use. Set this to the nextPageToken returned by
   * previous list requests to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Specifies a page token to use. Set this to the nextPageToken returned by
   * previous list requests to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
