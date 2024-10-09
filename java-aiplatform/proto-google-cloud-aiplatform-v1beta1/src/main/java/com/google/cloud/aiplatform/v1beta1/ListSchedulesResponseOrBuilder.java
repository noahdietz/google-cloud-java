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
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ListSchedulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListSchedulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Schedule schedules = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Schedule> getSchedulesList();
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Schedule schedules = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Schedule getSchedules(int index);
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Schedule schedules = 1;</code>
   */
  int getSchedulesCount();
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Schedule schedules = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder>
      getSchedulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Schedule schedules = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder getSchedulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1beta1.ListSchedulesRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1beta1.ListSchedulesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
