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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v1;

public interface ListFunctionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.ListFunctionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project and location from which the function should be listed,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * If you want to list functions in all locations, use "-" in place of a
   * location. When listing functions in all locations, if one or more
   * location(s) are unreachable, the response will contain functions from all
   * reachable locations along with the names of any unreachable locations.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The project and location from which the function should be listed,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * If you want to list functions in all locations, use "-" in place of a
   * location. When listing functions in all locations, if one or more
   * location(s) are unreachable, the response will contain functions from all
   * reachable locations along with the names of any unreachable locations.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of functions to return per call.
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
   * The value returned by the last
   * `ListFunctionsResponse`; indicates that
   * this is a continuation of a prior `ListFunctions` call, and that the
   * system should return the next page of data.
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
   * The value returned by the last
   * `ListFunctionsResponse`; indicates that
   * this is a continuation of a prior `ListFunctions` call, and that the
   * system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
