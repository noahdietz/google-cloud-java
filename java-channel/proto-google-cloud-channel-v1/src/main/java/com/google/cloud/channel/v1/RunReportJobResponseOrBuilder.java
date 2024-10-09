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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

@java.lang.Deprecated
public interface RunReportJobResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.RunReportJobResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Pass `report_job.name` to
   * [FetchReportResultsRequest.report_job][google.cloud.channel.v1.FetchReportResultsRequest.report_job]
   * to retrieve the report's results.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportJob report_job = 1;</code>
   *
   * @return Whether the reportJob field is set.
   */
  boolean hasReportJob();
  /**
   *
   *
   * <pre>
   * Pass `report_job.name` to
   * [FetchReportResultsRequest.report_job][google.cloud.channel.v1.FetchReportResultsRequest.report_job]
   * to retrieve the report's results.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportJob report_job = 1;</code>
   *
   * @return The reportJob.
   */
  com.google.cloud.channel.v1.ReportJob getReportJob();
  /**
   *
   *
   * <pre>
   * Pass `report_job.name` to
   * [FetchReportResultsRequest.report_job][google.cloud.channel.v1.FetchReportResultsRequest.report_job]
   * to retrieve the report's results.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportJob report_job = 1;</code>
   */
  com.google.cloud.channel.v1.ReportJobOrBuilder getReportJobOrBuilder();

  /**
   *
   *
   * <pre>
   * The metadata for the report's results (display name, columns, row count,
   * and date range). If you view this before the operation finishes,
   * you may see incomplete data.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 2;</code>
   *
   * @return Whether the reportMetadata field is set.
   */
  boolean hasReportMetadata();
  /**
   *
   *
   * <pre>
   * The metadata for the report's results (display name, columns, row count,
   * and date range). If you view this before the operation finishes,
   * you may see incomplete data.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 2;</code>
   *
   * @return The reportMetadata.
   */
  com.google.cloud.channel.v1.ReportResultsMetadata getReportMetadata();
  /**
   *
   *
   * <pre>
   * The metadata for the report's results (display name, columns, row count,
   * and date range). If you view this before the operation finishes,
   * you may see incomplete data.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 2;</code>
   */
  com.google.cloud.channel.v1.ReportResultsMetadataOrBuilder getReportMetadataOrBuilder();
}
