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
public interface ListReportsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListReportsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Report> getReportsList();
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  com.google.cloud.channel.v1.Report getReports(int index);
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  int getReportsCount();
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ReportOrBuilder> getReportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  com.google.cloud.channel.v1.ReportOrBuilder getReportsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pass this token to
   * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
   * to retrieve the next page of results.
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
   * Pass this token to
   * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
