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

public interface AnalyzeAssetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.AnalyzeAssetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The status of analysis on all search capabilities.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus analysis_status = 1;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus>
      getAnalysisStatusList();
  /**
   *
   *
   * <pre>
   * The status of analysis on all search capabilities.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus analysis_status = 1;
   * </code>
   */
  com.google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus getAnalysisStatus(int index);
  /**
   *
   *
   * <pre>
   * The status of analysis on all search capabilities.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus analysis_status = 1;
   * </code>
   */
  int getAnalysisStatusCount();
  /**
   *
   *
   * <pre>
   * The status of analysis on all search capabilities.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus analysis_status = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatusOrBuilder>
      getAnalysisStatusOrBuilderList();
  /**
   *
   *
   * <pre>
   * The status of analysis on all search capabilities.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatus analysis_status = 1;
   * </code>
   */
  com.google.cloud.visionai.v1.AnalyzeAssetMetadata.AnalysisStatusOrBuilder
      getAnalysisStatusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
