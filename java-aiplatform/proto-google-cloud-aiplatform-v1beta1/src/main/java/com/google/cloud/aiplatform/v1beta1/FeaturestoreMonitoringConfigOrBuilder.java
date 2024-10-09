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
// source: google/cloud/aiplatform/v1beta1/featurestore_monitoring.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface FeaturestoreMonitoringConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The config for Snapshot Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.SnapshotAnalysis snapshot_analysis = 1;
   * </code>
   *
   * @return Whether the snapshotAnalysis field is set.
   */
  boolean hasSnapshotAnalysis();
  /**
   *
   *
   * <pre>
   * The config for Snapshot Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.SnapshotAnalysis snapshot_analysis = 1;
   * </code>
   *
   * @return The snapshotAnalysis.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.SnapshotAnalysis
      getSnapshotAnalysis();
  /**
   *
   *
   * <pre>
   * The config for Snapshot Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.SnapshotAnalysis snapshot_analysis = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.SnapshotAnalysisOrBuilder
      getSnapshotAnalysisOrBuilder();

  /**
   *
   *
   * <pre>
   * The config for ImportFeatures Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ImportFeaturesAnalysis import_features_analysis = 2;
   * </code>
   *
   * @return Whether the importFeaturesAnalysis field is set.
   */
  boolean hasImportFeaturesAnalysis();
  /**
   *
   *
   * <pre>
   * The config for ImportFeatures Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ImportFeaturesAnalysis import_features_analysis = 2;
   * </code>
   *
   * @return The importFeaturesAnalysis.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ImportFeaturesAnalysis
      getImportFeaturesAnalysis();
  /**
   *
   *
   * <pre>
   * The config for ImportFeatures Analysis Based Feature Monitoring.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ImportFeaturesAnalysis import_features_analysis = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ImportFeaturesAnalysisOrBuilder
      getImportFeaturesAnalysisOrBuilder();

  /**
   *
   *
   * <pre>
   * Threshold for numerical features of anomaly detection.
   * This is shared by all objectives of Featurestore Monitoring for numerical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * DOUBLE or INT64).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig numerical_threshold_config = 3;
   * </code>
   *
   * @return Whether the numericalThresholdConfig field is set.
   */
  boolean hasNumericalThresholdConfig();
  /**
   *
   *
   * <pre>
   * Threshold for numerical features of anomaly detection.
   * This is shared by all objectives of Featurestore Monitoring for numerical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * DOUBLE or INT64).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig numerical_threshold_config = 3;
   * </code>
   *
   * @return The numericalThresholdConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig
      getNumericalThresholdConfig();
  /**
   *
   *
   * <pre>
   * Threshold for numerical features of anomaly detection.
   * This is shared by all objectives of Featurestore Monitoring for numerical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * DOUBLE or INT64).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig numerical_threshold_config = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfigOrBuilder
      getNumericalThresholdConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Threshold for categorical features of anomaly detection.
   * This is shared by all types of Featurestore Monitoring for categorical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL or STRING).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig categorical_threshold_config = 4;
   * </code>
   *
   * @return Whether the categoricalThresholdConfig field is set.
   */
  boolean hasCategoricalThresholdConfig();
  /**
   *
   *
   * <pre>
   * Threshold for categorical features of anomaly detection.
   * This is shared by all types of Featurestore Monitoring for categorical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL or STRING).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig categorical_threshold_config = 4;
   * </code>
   *
   * @return The categoricalThresholdConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig
      getCategoricalThresholdConfig();
  /**
   *
   *
   * <pre>
   * Threshold for categorical features of anomaly detection.
   * This is shared by all types of Featurestore Monitoring for categorical
   * features (i.e. Features with type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL or STRING).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfig categorical_threshold_config = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig.ThresholdConfigOrBuilder
      getCategoricalThresholdConfigOrBuilder();
}
