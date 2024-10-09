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
// source: google/cloud/aiplatform/v1/explanation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface AttributionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Attribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Model predicted output if the input instance is constructed
   * from the baselines of all the features defined in
   * [ExplanationMetadata.inputs][google.cloud.aiplatform.v1.ExplanationMetadata.inputs].
   * The field name of the output is determined by the key in
   * [ExplanationMetadata.outputs][google.cloud.aiplatform.v1.ExplanationMetadata.outputs].
   *
   * If the Model's predicted output has multiple dimensions (rank &gt; 1), this is
   * the value in the output located by
   * [output_index][google.cloud.aiplatform.v1.Attribution.output_index].
   *
   * If there are multiple baselines, their output values are averaged.
   * </pre>
   *
   * <code>double baseline_output_value = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The baselineOutputValue.
   */
  double getBaselineOutputValue();

  /**
   *
   *
   * <pre>
   * Output only. Model predicted output on the corresponding [explanation
   * instance][ExplainRequest.instances]. The field name of the output is
   * determined by the key in
   * [ExplanationMetadata.outputs][google.cloud.aiplatform.v1.ExplanationMetadata.outputs].
   *
   * If the Model predicted output has multiple dimensions, this is the value in
   * the output located by
   * [output_index][google.cloud.aiplatform.v1.Attribution.output_index].
   * </pre>
   *
   * <code>double instance_output_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceOutputValue.
   */
  double getInstanceOutputValue();

  /**
   *
   *
   * <pre>
   * Output only. Attributions of each explained feature. Features are extracted
   * from the [prediction
   * instances][google.cloud.aiplatform.v1.ExplainRequest.instances] according
   * to [explanation metadata for
   * inputs][google.cloud.aiplatform.v1.ExplanationMetadata.inputs].
   *
   * The value is a struct, whose keys are the name of the feature. The values
   * are how much the feature in the
   * [instance][google.cloud.aiplatform.v1.ExplainRequest.instances] contributed
   * to the predicted result.
   *
   * The format of the value is determined by the feature's input format:
   *
   *   * If the feature is a scalar value, the attribution value is a
   *     [floating number][google.protobuf.Value.number_value].
   *
   *   * If the feature is an array of scalar values, the attribution value is
   *     an [array][google.protobuf.Value.list_value].
   *
   *   * If the feature is a struct, the attribution value is a
   *     [struct][google.protobuf.Value.struct_value]. The keys in the
   *     attribution value struct are the same as the keys in the feature
   *     struct. The formats of the values in the attribution struct are
   *     determined by the formats of the values in the feature struct.
   *
   * The
   * [ExplanationMetadata.feature_attributions_schema_uri][google.cloud.aiplatform.v1.ExplanationMetadata.feature_attributions_schema_uri]
   * field, pointed to by the
   * [ExplanationSpec][google.cloud.aiplatform.v1.ExplanationSpec] field of the
   * [Endpoint.deployed_models][google.cloud.aiplatform.v1.Endpoint.deployed_models]
   * object, points to the schema file that describes the features and their
   * attribution values (if it is populated).
   * </pre>
   *
   * <code>
   * .google.protobuf.Value feature_attributions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the featureAttributions field is set.
   */
  boolean hasFeatureAttributions();
  /**
   *
   *
   * <pre>
   * Output only. Attributions of each explained feature. Features are extracted
   * from the [prediction
   * instances][google.cloud.aiplatform.v1.ExplainRequest.instances] according
   * to [explanation metadata for
   * inputs][google.cloud.aiplatform.v1.ExplanationMetadata.inputs].
   *
   * The value is a struct, whose keys are the name of the feature. The values
   * are how much the feature in the
   * [instance][google.cloud.aiplatform.v1.ExplainRequest.instances] contributed
   * to the predicted result.
   *
   * The format of the value is determined by the feature's input format:
   *
   *   * If the feature is a scalar value, the attribution value is a
   *     [floating number][google.protobuf.Value.number_value].
   *
   *   * If the feature is an array of scalar values, the attribution value is
   *     an [array][google.protobuf.Value.list_value].
   *
   *   * If the feature is a struct, the attribution value is a
   *     [struct][google.protobuf.Value.struct_value]. The keys in the
   *     attribution value struct are the same as the keys in the feature
   *     struct. The formats of the values in the attribution struct are
   *     determined by the formats of the values in the feature struct.
   *
   * The
   * [ExplanationMetadata.feature_attributions_schema_uri][google.cloud.aiplatform.v1.ExplanationMetadata.feature_attributions_schema_uri]
   * field, pointed to by the
   * [ExplanationSpec][google.cloud.aiplatform.v1.ExplanationSpec] field of the
   * [Endpoint.deployed_models][google.cloud.aiplatform.v1.Endpoint.deployed_models]
   * object, points to the schema file that describes the features and their
   * attribution values (if it is populated).
   * </pre>
   *
   * <code>
   * .google.protobuf.Value feature_attributions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The featureAttributions.
   */
  com.google.protobuf.Value getFeatureAttributions();
  /**
   *
   *
   * <pre>
   * Output only. Attributions of each explained feature. Features are extracted
   * from the [prediction
   * instances][google.cloud.aiplatform.v1.ExplainRequest.instances] according
   * to [explanation metadata for
   * inputs][google.cloud.aiplatform.v1.ExplanationMetadata.inputs].
   *
   * The value is a struct, whose keys are the name of the feature. The values
   * are how much the feature in the
   * [instance][google.cloud.aiplatform.v1.ExplainRequest.instances] contributed
   * to the predicted result.
   *
   * The format of the value is determined by the feature's input format:
   *
   *   * If the feature is a scalar value, the attribution value is a
   *     [floating number][google.protobuf.Value.number_value].
   *
   *   * If the feature is an array of scalar values, the attribution value is
   *     an [array][google.protobuf.Value.list_value].
   *
   *   * If the feature is a struct, the attribution value is a
   *     [struct][google.protobuf.Value.struct_value]. The keys in the
   *     attribution value struct are the same as the keys in the feature
   *     struct. The formats of the values in the attribution struct are
   *     determined by the formats of the values in the feature struct.
   *
   * The
   * [ExplanationMetadata.feature_attributions_schema_uri][google.cloud.aiplatform.v1.ExplanationMetadata.feature_attributions_schema_uri]
   * field, pointed to by the
   * [ExplanationSpec][google.cloud.aiplatform.v1.ExplanationSpec] field of the
   * [Endpoint.deployed_models][google.cloud.aiplatform.v1.Endpoint.deployed_models]
   * object, points to the schema file that describes the features and their
   * attribution values (if it is populated).
   * </pre>
   *
   * <code>
   * .google.protobuf.Value feature_attributions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ValueOrBuilder getFeatureAttributionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The index that locates the explained prediction output.
   *
   * If the prediction output is a scalar value, output_index is not populated.
   * If the prediction output has multiple dimensions, the length of the
   * output_index list is the same as the number of dimensions of the output.
   * The i-th element in output_index is the element index of the i-th dimension
   * of the output vector. Indices start from 0.
   * </pre>
   *
   * <code>repeated int32 output_index = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the outputIndex.
   */
  java.util.List<java.lang.Integer> getOutputIndexList();
  /**
   *
   *
   * <pre>
   * Output only. The index that locates the explained prediction output.
   *
   * If the prediction output is a scalar value, output_index is not populated.
   * If the prediction output has multiple dimensions, the length of the
   * output_index list is the same as the number of dimensions of the output.
   * The i-th element in output_index is the element index of the i-th dimension
   * of the output vector. Indices start from 0.
   * </pre>
   *
   * <code>repeated int32 output_index = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of outputIndex.
   */
  int getOutputIndexCount();
  /**
   *
   *
   * <pre>
   * Output only. The index that locates the explained prediction output.
   *
   * If the prediction output is a scalar value, output_index is not populated.
   * If the prediction output has multiple dimensions, the length of the
   * output_index list is the same as the number of dimensions of the output.
   * The i-th element in output_index is the element index of the i-th dimension
   * of the output vector. Indices start from 0.
   * </pre>
   *
   * <code>repeated int32 output_index = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The outputIndex at the given index.
   */
  int getOutputIndex(int index);

  /**
   *
   *
   * <pre>
   * Output only. The display name of the output identified by
   * [output_index][google.cloud.aiplatform.v1.Attribution.output_index]. For
   * example, the predicted class name by a multi-classification Model.
   *
   * This field is only populated iff the Model predicts display names as a
   * separate field along with the explained output. The predicted display name
   * must has the same shape of the explained output, and can be located using
   * output_index.
   * </pre>
   *
   * <code>string output_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The outputDisplayName.
   */
  java.lang.String getOutputDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of the output identified by
   * [output_index][google.cloud.aiplatform.v1.Attribution.output_index]. For
   * example, the predicted class name by a multi-classification Model.
   *
   * This field is only populated iff the Model predicts display names as a
   * separate field along with the explained output. The predicted display name
   * must has the same shape of the explained output, and can be located using
   * output_index.
   * </pre>
   *
   * <code>string output_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for outputDisplayName.
   */
  com.google.protobuf.ByteString getOutputDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Error of
   * [feature_attributions][google.cloud.aiplatform.v1.Attribution.feature_attributions]
   * caused by approximation used in the explanation method. Lower value means
   * more precise attributions.
   *
   * * For Sampled Shapley
   * [attribution][google.cloud.aiplatform.v1.ExplanationParameters.sampled_shapley_attribution],
   * increasing
   * [path_count][google.cloud.aiplatform.v1.SampledShapleyAttribution.path_count]
   * might reduce the error.
   * * For Integrated Gradients
   * [attribution][google.cloud.aiplatform.v1.ExplanationParameters.integrated_gradients_attribution],
   * increasing
   * [step_count][google.cloud.aiplatform.v1.IntegratedGradientsAttribution.step_count]
   * might reduce the error.
   * * For [XRAI
   * attribution][google.cloud.aiplatform.v1.ExplanationParameters.xrai_attribution],
   * increasing
   * [step_count][google.cloud.aiplatform.v1.XraiAttribution.step_count] might
   * reduce the error.
   *
   * See [this introduction](/vertex-ai/docs/explainable-ai/overview)
   * for more information.
   * </pre>
   *
   * <code>double approximation_error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The approximationError.
   */
  double getApproximationError();

  /**
   *
   *
   * <pre>
   * Output only. Name of the explain output. Specified as the key in
   * [ExplanationMetadata.outputs][google.cloud.aiplatform.v1.ExplanationMetadata.outputs].
   * </pre>
   *
   * <code>string output_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The outputName.
   */
  java.lang.String getOutputName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the explain output. Specified as the key in
   * [ExplanationMetadata.outputs][google.cloud.aiplatform.v1.ExplanationMetadata.outputs].
   * </pre>
   *
   * <code>string output_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for outputName.
   */
  com.google.protobuf.ByteString getOutputNameBytes();
}
