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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.texttospeech.v1;

public interface SynthesizeSpeechRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.SynthesizeSpeechRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.SynthesisInput input = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   *
   *
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.SynthesisInput input = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The input.
   */
  com.google.cloud.texttospeech.v1.SynthesisInput getInput();
  /**
   *
   *
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.SynthesisInput input = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder getInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the voice field is set.
   */
  boolean hasVoice();
  /**
   *
   *
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The voice.
   */
  com.google.cloud.texttospeech.v1.VoiceSelectionParams getVoice();
  /**
   *
   *
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder getVoiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   *
   *
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audioConfig.
   */
  com.google.cloud.texttospeech.v1.AudioConfig getAudioConfig();
  /**
   *
   *
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.texttospeech.v1.AudioConfigOrBuilder getAudioConfigOrBuilder();
}
