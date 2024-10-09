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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface PrivacyMetricOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.PrivacyMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Numerical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.NumericalStatsConfig numerical_stats_config = 1;
   * </code>
   *
   * @return Whether the numericalStatsConfig field is set.
   */
  boolean hasNumericalStatsConfig();
  /**
   *
   *
   * <pre>
   * Numerical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.NumericalStatsConfig numerical_stats_config = 1;
   * </code>
   *
   * @return The numericalStatsConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.NumericalStatsConfig getNumericalStatsConfig();
  /**
   *
   *
   * <pre>
   * Numerical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.NumericalStatsConfig numerical_stats_config = 1;
   * </code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.NumericalStatsConfigOrBuilder
      getNumericalStatsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Categorical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.CategoricalStatsConfig categorical_stats_config = 2;
   * </code>
   *
   * @return Whether the categoricalStatsConfig field is set.
   */
  boolean hasCategoricalStatsConfig();
  /**
   *
   *
   * <pre>
   * Categorical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.CategoricalStatsConfig categorical_stats_config = 2;
   * </code>
   *
   * @return The categoricalStatsConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.CategoricalStatsConfig getCategoricalStatsConfig();
  /**
   *
   *
   * <pre>
   * Categorical stats
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.CategoricalStatsConfig categorical_stats_config = 2;
   * </code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.CategoricalStatsConfigOrBuilder
      getCategoricalStatsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * K-anonymity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KAnonymityConfig k_anonymity_config = 3;</code>
   *
   * @return Whether the kAnonymityConfig field is set.
   */
  boolean hasKAnonymityConfig();
  /**
   *
   *
   * <pre>
   * K-anonymity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KAnonymityConfig k_anonymity_config = 3;</code>
   *
   * @return The kAnonymityConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.KAnonymityConfig getKAnonymityConfig();
  /**
   *
   *
   * <pre>
   * K-anonymity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KAnonymityConfig k_anonymity_config = 3;</code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.KAnonymityConfigOrBuilder getKAnonymityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * l-diversity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.LDiversityConfig l_diversity_config = 4;</code>
   *
   * @return Whether the lDiversityConfig field is set.
   */
  boolean hasLDiversityConfig();
  /**
   *
   *
   * <pre>
   * l-diversity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.LDiversityConfig l_diversity_config = 4;</code>
   *
   * @return The lDiversityConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.LDiversityConfig getLDiversityConfig();
  /**
   *
   *
   * <pre>
   * l-diversity
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.LDiversityConfig l_diversity_config = 4;</code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.LDiversityConfigOrBuilder getLDiversityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * k-map
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig k_map_estimation_config = 5;
   * </code>
   *
   * @return Whether the kMapEstimationConfig field is set.
   */
  boolean hasKMapEstimationConfig();
  /**
   *
   *
   * <pre>
   * k-map
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig k_map_estimation_config = 5;
   * </code>
   *
   * @return The kMapEstimationConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig getKMapEstimationConfig();
  /**
   *
   *
   * <pre>
   * k-map
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig k_map_estimation_config = 5;
   * </code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfigOrBuilder
      getKMapEstimationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * delta-presence
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.PrivacyMetric.DeltaPresenceEstimationConfig delta_presence_estimation_config = 6;
   * </code>
   *
   * @return Whether the deltaPresenceEstimationConfig field is set.
   */
  boolean hasDeltaPresenceEstimationConfig();
  /**
   *
   *
   * <pre>
   * delta-presence
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.PrivacyMetric.DeltaPresenceEstimationConfig delta_presence_estimation_config = 6;
   * </code>
   *
   * @return The deltaPresenceEstimationConfig.
   */
  com.google.privacy.dlp.v2.PrivacyMetric.DeltaPresenceEstimationConfig
      getDeltaPresenceEstimationConfig();
  /**
   *
   *
   * <pre>
   * delta-presence
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.PrivacyMetric.DeltaPresenceEstimationConfig delta_presence_estimation_config = 6;
   * </code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric.DeltaPresenceEstimationConfigOrBuilder
      getDeltaPresenceEstimationConfigOrBuilder();

  com.google.privacy.dlp.v2.PrivacyMetric.TypeCase getTypeCase();
}
