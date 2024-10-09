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
// source: google/api/servicecontrol/v1/metric_value.proto

// Protobuf Java Version: 3.25.5
package com.google.api.servicecontrol.v1;

public interface MetricValueSetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.MetricValueSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The metric name defined in the service configuration.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   *
   *
   * <pre>
   * The metric name defined in the service configuration.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString getMetricNameBytes();

  /**
   *
   *
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  java.util.List<com.google.api.servicecontrol.v1.MetricValue> getMetricValuesList();
  /**
   *
   *
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  com.google.api.servicecontrol.v1.MetricValue getMetricValues(int index);
  /**
   *
   *
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  int getMetricValuesCount();
  /**
   *
   *
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v1.MetricValueOrBuilder>
      getMetricValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The values in this metric.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValue metric_values = 2;</code>
   */
  com.google.api.servicecontrol.v1.MetricValueOrBuilder getMetricValuesOrBuilder(int index);
}
