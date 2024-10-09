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
// source: google/cloud/workstations/v1beta/workstations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.workstations.v1beta;

public interface ListWorkstationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.ListWorkstationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The requested workstations.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1beta.Workstation workstations = 1;</code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.Workstation> getWorkstationsList();
  /**
   *
   *
   * <pre>
   * The requested workstations.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1beta.Workstation workstations = 1;</code>
   */
  com.google.cloud.workstations.v1beta.Workstation getWorkstations(int index);
  /**
   *
   *
   * <pre>
   * The requested workstations.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1beta.Workstation workstations = 1;</code>
   */
  int getWorkstationsCount();
  /**
   *
   *
   * <pre>
   * The requested workstations.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1beta.Workstation workstations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.workstations.v1beta.WorkstationOrBuilder>
      getWorkstationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requested workstations.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1beta.Workstation workstations = 1;</code>
   */
  com.google.cloud.workstations.v1beta.WorkstationOrBuilder getWorkstationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Token to retrieve the next page of results, or empty if there are
   * no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Token to retrieve the next page of results, or empty if there are
   * no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Optional. Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Optional. Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Optional. Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
