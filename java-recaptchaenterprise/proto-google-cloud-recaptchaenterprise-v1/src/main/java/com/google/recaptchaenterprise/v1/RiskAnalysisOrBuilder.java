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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.5
package com.google.recaptchaenterprise.v1;

public interface RiskAnalysisOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.RiskAnalysis)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Legitimate event score from 0.0 to 1.0.
   * (1.0 means very likely legitimate traffic while 0.0 means very likely
   * non-legitimate traffic).
   * </pre>
   *
   * <code>float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the reasons.
   */
  java.util.List<com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason>
      getReasonsList();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of reasons.
   */
  int getReasonsCount();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The reasons at the given index.
   */
  com.google.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason getReasons(int index);
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for reasons.
   */
  java.util.List<java.lang.Integer> getReasonsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the risk analysis verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RiskAnalysis.ClassificationReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of reasons at the given index.
   */
  int getReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Output only. Extended verdict reasons to be used for experimentation only.
   * The set of possible reasons is subject to change.
   * </pre>
   *
   * <code>
   * repeated string extended_verdict_reasons = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the extendedVerdictReasons.
   */
  java.util.List<java.lang.String> getExtendedVerdictReasonsList();
  /**
   *
   *
   * <pre>
   * Output only. Extended verdict reasons to be used for experimentation only.
   * The set of possible reasons is subject to change.
   * </pre>
   *
   * <code>
   * repeated string extended_verdict_reasons = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of extendedVerdictReasons.
   */
  int getExtendedVerdictReasonsCount();
  /**
   *
   *
   * <pre>
   * Output only. Extended verdict reasons to be used for experimentation only.
   * The set of possible reasons is subject to change.
   * </pre>
   *
   * <code>
   * repeated string extended_verdict_reasons = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The extendedVerdictReasons at the given index.
   */
  java.lang.String getExtendedVerdictReasons(int index);
  /**
   *
   *
   * <pre>
   * Output only. Extended verdict reasons to be used for experimentation only.
   * The set of possible reasons is subject to change.
   * </pre>
   *
   * <code>
   * repeated string extended_verdict_reasons = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the extendedVerdictReasons at the given index.
   */
  com.google.protobuf.ByteString getExtendedVerdictReasonsBytes(int index);
}
