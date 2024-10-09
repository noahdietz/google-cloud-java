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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface CreateTimeSeriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new data to be added to a list of time series.
   * Adds at most one data point to each of several time series.  The new data
   * point must be more recent than any other point in its time series.  Each
   * `TimeSeries` value must fully specify a unique time series by supplying
   * all label values for the metric and the monitored resource.
   *
   * The maximum number of `TimeSeries` objects per `Create` request is 200.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.TimeSeries time_series = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.monitoring.v3.TimeSeries> getTimeSeriesList();
  /**
   *
   *
   * <pre>
   * Required. The new data to be added to a list of time series.
   * Adds at most one data point to each of several time series.  The new data
   * point must be more recent than any other point in its time series.  Each
   * `TimeSeries` value must fully specify a unique time series by supplying
   * all label values for the metric and the monitored resource.
   *
   * The maximum number of `TimeSeries` objects per `Create` request is 200.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.TimeSeries time_series = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.TimeSeries getTimeSeries(int index);
  /**
   *
   *
   * <pre>
   * Required. The new data to be added to a list of time series.
   * Adds at most one data point to each of several time series.  The new data
   * point must be more recent than any other point in its time series.  Each
   * `TimeSeries` value must fully specify a unique time series by supplying
   * all label values for the metric and the monitored resource.
   *
   * The maximum number of `TimeSeries` objects per `Create` request is 200.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.TimeSeries time_series = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getTimeSeriesCount();
  /**
   *
   *
   * <pre>
   * Required. The new data to be added to a list of time series.
   * Adds at most one data point to each of several time series.  The new data
   * point must be more recent than any other point in its time series.  Each
   * `TimeSeries` value must fully specify a unique time series by supplying
   * all label values for the metric and the monitored resource.
   *
   * The maximum number of `TimeSeries` objects per `Create` request is 200.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.TimeSeries time_series = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.monitoring.v3.TimeSeriesOrBuilder>
      getTimeSeriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The new data to be added to a list of time series.
   * Adds at most one data point to each of several time series.  The new data
   * point must be more recent than any other point in its time series.  Each
   * `TimeSeries` value must fully specify a unique time series by supplying
   * all label values for the metric and the monitored resource.
   *
   * The maximum number of `TimeSeries` objects per `Create` request is 200.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.TimeSeries time_series = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder(int index);
}
