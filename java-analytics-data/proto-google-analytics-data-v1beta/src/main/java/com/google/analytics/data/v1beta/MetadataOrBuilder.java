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
// source: google/analytics/data/v1beta/analytics_data_api.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1beta;

public interface MetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.DimensionMetadata dimensions = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.DimensionMetadata> getDimensionsList();
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.DimensionMetadata dimensions = 1;</code>
   */
  com.google.analytics.data.v1beta.DimensionMetadata getDimensions(int index);
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.DimensionMetadata dimensions = 1;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.DimensionMetadata dimensions = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.DimensionMetadataOrBuilder>
      getDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.DimensionMetadata dimensions = 1;</code>
   */
  com.google.analytics.data.v1beta.DimensionMetadataOrBuilder getDimensionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricMetadata metrics = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.MetricMetadata> getMetricsList();
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricMetadata metrics = 2;</code>
   */
  com.google.analytics.data.v1beta.MetricMetadata getMetrics(int index);
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricMetadata metrics = 2;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricMetadata metrics = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.MetricMetadataOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricMetadata metrics = 2;</code>
   */
  com.google.analytics.data.v1beta.MetricMetadataOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The comparison descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.ComparisonMetadata comparisons = 4;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.ComparisonMetadata> getComparisonsList();
  /**
   *
   *
   * <pre>
   * The comparison descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.ComparisonMetadata comparisons = 4;</code>
   */
  com.google.analytics.data.v1beta.ComparisonMetadata getComparisons(int index);
  /**
   *
   *
   * <pre>
   * The comparison descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.ComparisonMetadata comparisons = 4;</code>
   */
  int getComparisonsCount();
  /**
   *
   *
   * <pre>
   * The comparison descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.ComparisonMetadata comparisons = 4;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.ComparisonMetadataOrBuilder>
      getComparisonsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The comparison descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.ComparisonMetadata comparisons = 4;</code>
   */
  com.google.analytics.data.v1beta.ComparisonMetadataOrBuilder getComparisonsOrBuilder(int index);
}
