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
// source: google/cloud/discoveryengine/v1alpha/completion.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface CompletionSuggestionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.CompletionSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Global score of this suggestion. Control how this suggestion would be
   * scored / ranked.
   * </pre>
   *
   * <code>double global_score = 2;</code>
   *
   * @return Whether the globalScore field is set.
   */
  boolean hasGlobalScore();
  /**
   *
   *
   * <pre>
   * Global score of this suggestion. Control how this suggestion would be
   * scored / ranked.
   * </pre>
   *
   * <code>double global_score = 2;</code>
   *
   * @return The globalScore.
   */
  double getGlobalScore();

  /**
   *
   *
   * <pre>
   * Frequency of this suggestion. Will be used to rank suggestions when score
   * is not available.
   * </pre>
   *
   * <code>int64 frequency = 3;</code>
   *
   * @return Whether the frequency field is set.
   */
  boolean hasFrequency();
  /**
   *
   *
   * <pre>
   * Frequency of this suggestion. Will be used to rank suggestions when score
   * is not available.
   * </pre>
   *
   * <code>int64 frequency = 3;</code>
   *
   * @return The frequency.
   */
  long getFrequency();

  /**
   *
   *
   * <pre>
   * Required. The suggestion text.
   * </pre>
   *
   * <code>string suggestion = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The suggestion.
   */
  java.lang.String getSuggestion();
  /**
   *
   *
   * <pre>
   * Required. The suggestion text.
   * </pre>
   *
   * <code>string suggestion = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for suggestion.
   */
  com.google.protobuf.ByteString getSuggestionBytes();

  /**
   *
   *
   * <pre>
   * BCP-47 language code of this suggestion.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * BCP-47 language code of this suggestion.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * If two suggestions have the same groupId, they will not be
   * returned together. Instead the one ranked higher will be returned. This can
   * be used to deduplicate semantically identical suggestions.
   * </pre>
   *
   * <code>string group_id = 5;</code>
   *
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   *
   *
   * <pre>
   * If two suggestions have the same groupId, they will not be
   * returned together. Instead the one ranked higher will be returned. This can
   * be used to deduplicate semantically identical suggestions.
   * </pre>
   *
   * <code>string group_id = 5;</code>
   *
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString getGroupIdBytes();

  /**
   *
   *
   * <pre>
   * The score of this suggestion within its group.
   * </pre>
   *
   * <code>double group_score = 6;</code>
   *
   * @return The groupScore.
   */
  double getGroupScore();

  /**
   *
   *
   * <pre>
   * Alternative matching phrases for this suggestion.
   * </pre>
   *
   * <code>repeated string alternative_phrases = 7;</code>
   *
   * @return A list containing the alternativePhrases.
   */
  java.util.List<java.lang.String> getAlternativePhrasesList();
  /**
   *
   *
   * <pre>
   * Alternative matching phrases for this suggestion.
   * </pre>
   *
   * <code>repeated string alternative_phrases = 7;</code>
   *
   * @return The count of alternativePhrases.
   */
  int getAlternativePhrasesCount();
  /**
   *
   *
   * <pre>
   * Alternative matching phrases for this suggestion.
   * </pre>
   *
   * <code>repeated string alternative_phrases = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The alternativePhrases at the given index.
   */
  java.lang.String getAlternativePhrases(int index);
  /**
   *
   *
   * <pre>
   * Alternative matching phrases for this suggestion.
   * </pre>
   *
   * <code>repeated string alternative_phrases = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the alternativePhrases at the given index.
   */
  com.google.protobuf.ByteString getAlternativePhrasesBytes(int index);

  com.google.cloud.discoveryengine.v1alpha.CompletionSuggestion.RankingInfoCase
      getRankingInfoCase();
}
