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
// source: google/analytics/data/v1beta/data.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1beta;

public interface MetricOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.Metric)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the metric. See the [API
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
   * for the list of metric names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
   * for the list of metric names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
   * for the list of metric names supported by the `runFunnelReport`
   * method.
   *
   * If `expression` is specified, `name` can be any string that you would like
   * within the allowed character set. For example if `expression` is
   * `screenPageViews/sessions`, you could call that metric's name =
   * `viewsPerSession`. Metric names that you choose must match the regular
   * expression `^[a-zA-Z0-9_]$`.
   *
   * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
   * `expression`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the metric. See the [API
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
   * for the list of metric names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
   * for the list of metric names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
   * for the list of metric names supported by the `runFunnelReport`
   * method.
   *
   * If `expression` is specified, `name` can be any string that you would like
   * within the allowed character set. For example if `expression` is
   * `screenPageViews/sessions`, you could call that metric's name =
   * `viewsPerSession`. Metric names that you choose must match the regular
   * expression `^[a-zA-Z0-9_]$`.
   *
   * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
   * `expression`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A mathematical expression for derived metrics. For example, the metric
   * Event count per user is `eventCount/totalUsers`.
   * </pre>
   *
   * <code>string expression = 2;</code>
   *
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   *
   *
   * <pre>
   * A mathematical expression for derived metrics. For example, the metric
   * Event count per user is `eventCount/totalUsers`.
   * </pre>
   *
   * <code>string expression = 2;</code>
   *
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString getExpressionBytes();

  /**
   *
   *
   * <pre>
   * Indicates if a metric is invisible in the report response. If a metric is
   * invisible, the metric will not produce a column in the response, but can be
   * used in `metricFilter`, `orderBys`, or a metric `expression`.
   * </pre>
   *
   * <code>bool invisible = 3;</code>
   *
   * @return The invisible.
   */
  boolean getInvisible();
}
