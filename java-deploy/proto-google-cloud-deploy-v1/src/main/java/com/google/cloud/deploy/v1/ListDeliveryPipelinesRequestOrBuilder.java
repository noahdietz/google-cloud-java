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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface ListDeliveryPipelinesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.ListDeliveryPipelinesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of pipelines. Format must
   * be `projects/{project_id}/locations/{location_name}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of pipelines. Format must
   * be `projects/{project_id}/locations/{location_name}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of pipelines to return. The service may return
   * fewer than this value. If unspecified, at most 50 pipelines will
   * be returned. The maximum value is 1000; values above 1000 will be set
   * to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListDeliveryPipelines` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other provided parameters match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListDeliveryPipelines` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other provided parameters match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter pipelines to be returned. See https://google.aip.dev/160 for more
   * details.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter pipelines to be returned. See https://google.aip.dev/160 for more
   * details.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Field to sort by. See https://google.aip.dev/132#ordering for more details.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Field to sort by. See https://google.aip.dev/132#ordering for more details.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
