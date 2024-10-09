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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.speech.v2;

public interface WordInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.WordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   *
   * @return Whether the startOffset field is set.
   */
  boolean hasStartOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   *
   * @return The startOffset.
   */
  com.google.protobuf.Duration getStartOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   *
   * @return Whether the endOffset field is set.
   */
  boolean hasEndOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   *
   * @return The endOffset.
   */
  com.google.protobuf.Duration getEndOffset();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if
   * [enable_word_time_offsets][google.cloud.speech.v2.RecognitionFeatures.enable_word_time_offsets]
   * is `true` and only in the top hypothesis. This is an experimental feature
   * and the accuracy of the time offset can vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   *
   * @return The word.
   */
  java.lang.String getWord();
  /**
   *
   *
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   *
   * @return The bytes for word.
   */
  com.google.protobuf.ByteString getWordBytes();

  /**
   *
   *
   * <pre>
   * The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is set only for the top alternative of a non-streaming
   * result or, of a streaming result where
   * [is_final][google.cloud.speech.v2.StreamingRecognitionResult.is_final] is
   * set to `true`. This field is not guaranteed to be accurate and users should
   * not rely on it to be always provided. The default of 0.0 is a sentinel
   * value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   *
   * @return The confidence.
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * A distinct label is assigned for every speaker within the audio. This field
   * specifies which one of those speakers was detected to have spoken this
   * word. `speaker_label` is set if
   * [SpeakerDiarizationConfig][google.cloud.speech.v2.SpeakerDiarizationConfig]
   * is given and only in the top alternative.
   * </pre>
   *
   * <code>string speaker_label = 6;</code>
   *
   * @return The speakerLabel.
   */
  java.lang.String getSpeakerLabel();
  /**
   *
   *
   * <pre>
   * A distinct label is assigned for every speaker within the audio. This field
   * specifies which one of those speakers was detected to have spoken this
   * word. `speaker_label` is set if
   * [SpeakerDiarizationConfig][google.cloud.speech.v2.SpeakerDiarizationConfig]
   * is given and only in the top alternative.
   * </pre>
   *
   * <code>string speaker_label = 6;</code>
   *
   * @return The bytes for speakerLabel.
   */
  com.google.protobuf.ByteString getSpeakerLabelBytes();
}
