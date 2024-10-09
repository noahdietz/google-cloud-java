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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface DateTimeRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.DateTimeRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Start date time.
   * </pre>
   *
   * <code>.google.type.DateTime start = 1;</code>
   *
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   *
   *
   * <pre>
   * Start date time.
   * </pre>
   *
   * <code>.google.type.DateTime start = 1;</code>
   *
   * @return The start.
   */
  com.google.type.DateTime getStart();
  /**
   *
   *
   * <pre>
   * Start date time.
   * </pre>
   *
   * <code>.google.type.DateTime start = 1;</code>
   */
  com.google.type.DateTimeOrBuilder getStartOrBuilder();

  /**
   *
   *
   * <pre>
   * End data time.
   * </pre>
   *
   * <code>.google.type.DateTime end = 2;</code>
   *
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   *
   *
   * <pre>
   * End data time.
   * </pre>
   *
   * <code>.google.type.DateTime end = 2;</code>
   *
   * @return The end.
   */
  com.google.type.DateTime getEnd();
  /**
   *
   *
   * <pre>
   * End data time.
   * </pre>
   *
   * <code>.google.type.DateTime end = 2;</code>
   */
  com.google.type.DateTimeOrBuilder getEndOrBuilder();
}
