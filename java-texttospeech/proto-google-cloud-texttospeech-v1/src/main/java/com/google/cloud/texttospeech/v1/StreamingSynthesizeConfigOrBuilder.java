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

public interface StreamingSynthesizeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.StreamingSynthesizeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * .google.cloud.texttospeech.v1.VoiceSelectionParams voice = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder getVoiceOrBuilder();
}
