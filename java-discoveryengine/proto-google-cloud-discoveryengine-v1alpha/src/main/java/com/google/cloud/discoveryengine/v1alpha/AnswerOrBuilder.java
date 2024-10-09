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
// source: google/cloud/discoveryengine/v1alpha/answer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface AnswerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Answer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/{project}/locations/global/collections/{collection}/engines/{engine}/sessions/&#42;&#47;answers/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/{project}/locations/global/collections/{collection}/engines/{engine}/sessions/&#42;&#47;answers/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The state of the answer generation.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Answer.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the answer generation.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Answer.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.State getState();

  /**
   *
   *
   * <pre>
   * The textual answer.
   * </pre>
   *
   * <code>string answer_text = 3;</code>
   *
   * @return The answerText.
   */
  java.lang.String getAnswerText();
  /**
   *
   *
   * <pre>
   * The textual answer.
   * </pre>
   *
   * <code>string answer_text = 3;</code>
   *
   * @return The bytes for answerText.
   */
  com.google.protobuf.ByteString getAnswerTextBytes();

  /**
   *
   *
   * <pre>
   * Citations.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Citation citations = 4;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Answer.Citation> getCitationsList();
  /**
   *
   *
   * <pre>
   * Citations.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Citation citations = 4;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.Citation getCitations(int index);
  /**
   *
   *
   * <pre>
   * Citations.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Citation citations = 4;</code>
   */
  int getCitationsCount();
  /**
   *
   *
   * <pre>
   * Citations.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Citation citations = 4;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.Answer.CitationOrBuilder>
      getCitationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Citations.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Citation citations = 4;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.CitationOrBuilder getCitationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * References.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Reference references = 5;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Answer.Reference> getReferencesList();
  /**
   *
   *
   * <pre>
   * References.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Reference references = 5;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.Reference getReferences(int index);
  /**
   *
   *
   * <pre>
   * References.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Reference references = 5;</code>
   */
  int getReferencesCount();
  /**
   *
   *
   * <pre>
   * References.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Reference references = 5;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.Answer.ReferenceOrBuilder>
      getReferencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * References.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Reference references = 5;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.ReferenceOrBuilder getReferencesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Suggested related questions.
   * </pre>
   *
   * <code>repeated string related_questions = 6;</code>
   *
   * @return A list containing the relatedQuestions.
   */
  java.util.List<java.lang.String> getRelatedQuestionsList();
  /**
   *
   *
   * <pre>
   * Suggested related questions.
   * </pre>
   *
   * <code>repeated string related_questions = 6;</code>
   *
   * @return The count of relatedQuestions.
   */
  int getRelatedQuestionsCount();
  /**
   *
   *
   * <pre>
   * Suggested related questions.
   * </pre>
   *
   * <code>repeated string related_questions = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The relatedQuestions at the given index.
   */
  java.lang.String getRelatedQuestions(int index);
  /**
   *
   *
   * <pre>
   * Suggested related questions.
   * </pre>
   *
   * <code>repeated string related_questions = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relatedQuestions at the given index.
   */
  com.google.protobuf.ByteString getRelatedQuestionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Answer generation steps.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Step steps = 7;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Answer.Step> getStepsList();
  /**
   *
   *
   * <pre>
   * Answer generation steps.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Step steps = 7;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.Step getSteps(int index);
  /**
   *
   *
   * <pre>
   * Answer generation steps.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Step steps = 7;</code>
   */
  int getStepsCount();
  /**
   *
   *
   * <pre>
   * Answer generation steps.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Step steps = 7;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1alpha.Answer.StepOrBuilder>
      getStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Answer generation steps.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1alpha.Answer.Step steps = 7;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.StepOrBuilder getStepsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Query understanding information.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Answer.QueryUnderstandingInfo query_understanding_info = 10;
   * </code>
   *
   * @return Whether the queryUnderstandingInfo field is set.
   */
  boolean hasQueryUnderstandingInfo();
  /**
   *
   *
   * <pre>
   * Query understanding information.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Answer.QueryUnderstandingInfo query_understanding_info = 10;
   * </code>
   *
   * @return The queryUnderstandingInfo.
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.QueryUnderstandingInfo
      getQueryUnderstandingInfo();
  /**
   *
   *
   * <pre>
   * Query understanding information.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Answer.QueryUnderstandingInfo query_understanding_info = 10;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.QueryUnderstandingInfoOrBuilder
      getQueryUnderstandingInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional answer-skipped reasons. This provides the reason for ignored
   * cases. If nothing is skipped, this field is not set.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason answer_skipped_reasons = 11;
   * </code>
   *
   * @return A list containing the answerSkippedReasons.
   */
  java.util.List<com.google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason>
      getAnswerSkippedReasonsList();
  /**
   *
   *
   * <pre>
   * Additional answer-skipped reasons. This provides the reason for ignored
   * cases. If nothing is skipped, this field is not set.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason answer_skipped_reasons = 11;
   * </code>
   *
   * @return The count of answerSkippedReasons.
   */
  int getAnswerSkippedReasonsCount();
  /**
   *
   *
   * <pre>
   * Additional answer-skipped reasons. This provides the reason for ignored
   * cases. If nothing is skipped, this field is not set.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason answer_skipped_reasons = 11;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The answerSkippedReasons at the given index.
   */
  com.google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason getAnswerSkippedReasons(
      int index);
  /**
   *
   *
   * <pre>
   * Additional answer-skipped reasons. This provides the reason for ignored
   * cases. If nothing is skipped, this field is not set.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason answer_skipped_reasons = 11;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for answerSkippedReasons.
   */
  java.util.List<java.lang.Integer> getAnswerSkippedReasonsValueList();
  /**
   *
   *
   * <pre>
   * Additional answer-skipped reasons. This provides the reason for ignored
   * cases. If nothing is skipped, this field is not set.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1alpha.Answer.AnswerSkippedReason answer_skipped_reasons = 11;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of answerSkippedReasons at the given index.
   */
  int getAnswerSkippedReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Output only. Answer creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Answer creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Answer creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Answer completed timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Answer completed timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Answer completed timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();
}
