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
// source: google/cloud/documentai/v1beta3/evaluation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.documentai.v1beta3;

public interface EvaluationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.Evaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the evaluation.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}/evaluations/{evaluation}`
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
   * The resource name of the evaluation.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}/evaluations/{evaluation}`
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
   * The time that the evaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time that the evaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time that the evaluation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Counters for the documents used in the evaluation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Evaluation.Counters document_counters = 5;</code>
   *
   * @return Whether the documentCounters field is set.
   */
  boolean hasDocumentCounters();
  /**
   *
   *
   * <pre>
   * Counters for the documents used in the evaluation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Evaluation.Counters document_counters = 5;</code>
   *
   * @return The documentCounters.
   */
  com.google.cloud.documentai.v1beta3.Evaluation.Counters getDocumentCounters();
  /**
   *
   *
   * <pre>
   * Counters for the documents used in the evaluation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Evaluation.Counters document_counters = 5;</code>
   */
  com.google.cloud.documentai.v1beta3.Evaluation.CountersOrBuilder getDocumentCountersOrBuilder();

  /**
   *
   *
   * <pre>
   * Metrics for all the entities in aggregate.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics all_entities_metrics = 3;
   * </code>
   *
   * @return Whether the allEntitiesMetrics field is set.
   */
  boolean hasAllEntitiesMetrics();
  /**
   *
   *
   * <pre>
   * Metrics for all the entities in aggregate.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics all_entities_metrics = 3;
   * </code>
   *
   * @return The allEntitiesMetrics.
   */
  com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics getAllEntitiesMetrics();
  /**
   *
   *
   * <pre>
   * Metrics for all the entities in aggregate.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics all_entities_metrics = 3;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetricsOrBuilder
      getAllEntitiesMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Metrics across confidence levels, for different entities.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics&gt; entity_metrics = 4;
   * </code>
   */
  int getEntityMetricsCount();
  /**
   *
   *
   * <pre>
   * Metrics across confidence levels, for different entities.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics&gt; entity_metrics = 4;
   * </code>
   */
  boolean containsEntityMetrics(java.lang.String key);
  /** Use {@link #getEntityMetricsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics>
      getEntityMetrics();
  /**
   *
   *
   * <pre>
   * Metrics across confidence levels, for different entities.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics&gt; entity_metrics = 4;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics>
      getEntityMetricsMap();
  /**
   *
   *
   * <pre>
   * Metrics across confidence levels, for different entities.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics&gt; entity_metrics = 4;
   * </code>
   */
  /* nullable */
  com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics getEntityMetricsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics defaultValue);
  /**
   *
   *
   * <pre>
   * Metrics across confidence levels, for different entities.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics&gt; entity_metrics = 4;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.Evaluation.MultiConfidenceMetrics getEntityMetricsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * The KMS key name used for encryption.
   * </pre>
   *
   * <code>string kms_key_name = 6;</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * The KMS key name used for encryption.
   * </pre>
   *
   * <code>string kms_key_name = 6;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * The KMS key version with which data is encrypted.
   * </pre>
   *
   * <code>string kms_key_version_name = 7;</code>
   *
   * @return The kmsKeyVersionName.
   */
  java.lang.String getKmsKeyVersionName();
  /**
   *
   *
   * <pre>
   * The KMS key version with which data is encrypted.
   * </pre>
   *
   * <code>string kms_key_version_name = 7;</code>
   *
   * @return The bytes for kmsKeyVersionName.
   */
  com.google.protobuf.ByteString getKmsKeyVersionNameBytes();
}
