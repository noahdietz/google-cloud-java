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
// source: google/cloud/discoveryengine/v1beta/evaluation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public interface EvaluationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.Evaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The full resource name of the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation], in the format
   * of `projects/{project}/locations/{location}/evaluations/{evaluation}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The full resource name of the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation], in the format
   * of `projects/{project}/locations/{location}/evaluations/{evaluation}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The specification of the evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Evaluation.EvaluationSpec evaluation_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the evaluationSpec field is set.
   */
  boolean hasEvaluationSpec();
  /**
   *
   *
   * <pre>
   * Required. The specification of the evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Evaluation.EvaluationSpec evaluation_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The evaluationSpec.
   */
  com.google.cloud.discoveryengine.v1beta.Evaluation.EvaluationSpec getEvaluationSpec();
  /**
   *
   *
   * <pre>
   * Required. The specification of the evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Evaluation.EvaluationSpec evaluation_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.Evaluation.EvaluationSpecOrBuilder
      getEvaluationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The metrics produced by the evaluation, averaged across all
   * [SampleQuery][google.cloud.discoveryengine.v1beta.SampleQuery]s in the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet].
   *
   * Only populated when the evaluation's state is SUCCEEDED.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.QualityMetrics quality_metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the qualityMetrics field is set.
   */
  boolean hasQualityMetrics();
  /**
   *
   *
   * <pre>
   * Output only. The metrics produced by the evaluation, averaged across all
   * [SampleQuery][google.cloud.discoveryengine.v1beta.SampleQuery]s in the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet].
   *
   * Only populated when the evaluation's state is SUCCEEDED.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.QualityMetrics quality_metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The qualityMetrics.
   */
  com.google.cloud.discoveryengine.v1beta.QualityMetrics getQualityMetrics();
  /**
   *
   *
   * <pre>
   * Output only. The metrics produced by the evaluation, averaged across all
   * [SampleQuery][google.cloud.discoveryengine.v1beta.SampleQuery]s in the
   * [SampleQuerySet][google.cloud.discoveryengine.v1beta.SampleQuerySet].
   *
   * Only populated when the evaluation's state is SUCCEEDED.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.QualityMetrics quality_metrics = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.QualityMetricsOrBuilder getQualityMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Evaluation.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the evaluation.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Evaluation.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.discoveryengine.v1beta.Evaluation.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during evaluation. Only populated when
   * the evaluation's state is FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during evaluation. Only populated when
   * the evaluation's state is FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during evaluation. Only populated when
   * the evaluation's state is FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was created
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was created
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was created
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was completed
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was completed
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [Evaluation][google.cloud.discoveryengine.v1beta.Evaluation] was completed
   * at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status error_samples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Status> getErrorSamplesList();
  /**
   *
   *
   * <pre>
   * Output only. A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status error_samples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Status getErrorSamples(int index);
  /**
   *
   *
   * <pre>
   * Output only. A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status error_samples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorSamplesCount();
  /**
   *
   *
   * <pre>
   * Output only. A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status error_samples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status error_samples = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index);
}
