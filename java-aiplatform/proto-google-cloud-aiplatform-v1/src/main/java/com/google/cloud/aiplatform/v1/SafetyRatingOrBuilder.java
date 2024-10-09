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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface SafetyRatingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SafetyRating)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * Output only. Harm category.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.HarmCategory category = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The category.
   */
  com.google.cloud.aiplatform.v1.HarmCategory getCategory();

  /**
   *
   *
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for probability.
   */
  int getProbabilityValue();
  /**
   *
   *
   * <pre>
   * Output only. Harm probability levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmProbability probability = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The probability.
   */
  com.google.cloud.aiplatform.v1.SafetyRating.HarmProbability getProbability();

  /**
   *
   *
   * <pre>
   * Output only. Harm probability score.
   * </pre>
   *
   * <code>float probability_score = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The probabilityScore.
   */
  float getProbabilityScore();

  /**
   *
   *
   * <pre>
   * Output only. Harm severity levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmSeverity severity = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Output only. Harm severity levels in the content.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SafetyRating.HarmSeverity severity = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The severity.
   */
  com.google.cloud.aiplatform.v1.SafetyRating.HarmSeverity getSeverity();

  /**
   *
   *
   * <pre>
   * Output only. Harm severity score.
   * </pre>
   *
   * <code>float severity_score = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The severityScore.
   */
  float getSeverityScore();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether the content was filtered out because of this
   * rating.
   * </pre>
   *
   * <code>bool blocked = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The blocked.
   */
  boolean getBlocked();
}
