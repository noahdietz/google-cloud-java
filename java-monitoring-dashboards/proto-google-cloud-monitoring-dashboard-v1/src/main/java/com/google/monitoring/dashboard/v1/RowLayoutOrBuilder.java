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
// source: google/monitoring/dashboard/v1/layouts.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.dashboard.v1;

public interface RowLayoutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.RowLayout)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The rows of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.RowLayout.Row rows = 1;</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.RowLayout.Row> getRowsList();
  /**
   *
   *
   * <pre>
   * The rows of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.RowLayout.Row rows = 1;</code>
   */
  com.google.monitoring.dashboard.v1.RowLayout.Row getRows(int index);
  /**
   *
   *
   * <pre>
   * The rows of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.RowLayout.Row rows = 1;</code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * The rows of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.RowLayout.Row rows = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.RowLayout.RowOrBuilder>
      getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The rows of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.RowLayout.Row rows = 1;</code>
   */
  com.google.monitoring.dashboard.v1.RowLayout.RowOrBuilder getRowsOrBuilder(int index);
}
