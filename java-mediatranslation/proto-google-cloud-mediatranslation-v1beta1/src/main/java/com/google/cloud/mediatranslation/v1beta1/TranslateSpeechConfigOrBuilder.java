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
// source: google/cloud/mediatranslation/v1beta1/media_translation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.mediatranslation.v1beta1;

public interface TranslateSpeechConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.mediatranslation.v1beta1.TranslateSpeechConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Encoding of audio data.
   * Supported formats:
   *
   * - `linear16`
   *
   *   Uncompressed 16-bit signed little-endian samples (Linear PCM).
   *
   * - `flac`
   *
   *   `flac` (Free Lossless Audio Codec) is the recommended encoding
   *   because it is lossless--therefore recognition is not compromised--and
   *   requires only about half the bandwidth of `linear16`.
   *
   * - `mulaw`
   *
   *   8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   *
   * - `amr`
   *
   *   Adaptive Multi-Rate Narrowband codec. `sample_rate_hertz` must be 8000.
   *
   * - `amr-wb`
   *
   *   Adaptive Multi-Rate Wideband codec. `sample_rate_hertz` must be 16000.
   *
   * - `ogg-opus`
   *
   *   Opus encoded audio frames in [Ogg](https://wikipedia.org/wiki/Ogg)
   *   container. `sample_rate_hertz` must be one of 8000, 12000, 16000, 24000,
   *   or 48000.
   *
   * - `mp3`
   *
   *   MP3 audio. Support all standard MP3 bitrates (which range from 32-320
   *   kbps). When using this encoding, `sample_rate_hertz` has to match the
   *   sample rate of the file being used.
   * </pre>
   *
   * <code>string audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The audioEncoding.
   */
  java.lang.String getAudioEncoding();
  /**
   *
   *
   * <pre>
   * Required. Encoding of audio data.
   * Supported formats:
   *
   * - `linear16`
   *
   *   Uncompressed 16-bit signed little-endian samples (Linear PCM).
   *
   * - `flac`
   *
   *   `flac` (Free Lossless Audio Codec) is the recommended encoding
   *   because it is lossless--therefore recognition is not compromised--and
   *   requires only about half the bandwidth of `linear16`.
   *
   * - `mulaw`
   *
   *   8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   *
   * - `amr`
   *
   *   Adaptive Multi-Rate Narrowband codec. `sample_rate_hertz` must be 8000.
   *
   * - `amr-wb`
   *
   *   Adaptive Multi-Rate Wideband codec. `sample_rate_hertz` must be 16000.
   *
   * - `ogg-opus`
   *
   *   Opus encoded audio frames in [Ogg](https://wikipedia.org/wiki/Ogg)
   *   container. `sample_rate_hertz` must be one of 8000, 12000, 16000, 24000,
   *   or 48000.
   *
   * - `mp3`
   *
   *   MP3 audio. Support all standard MP3 bitrates (which range from 32-320
   *   kbps). When using this encoding, `sample_rate_hertz` has to match the
   *   sample rate of the file being used.
   * </pre>
   *
   * <code>string audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for audioEncoding.
   */
  com.google.protobuf.ByteString getAudioEncodingBytes();

  /**
   *
   *
   * <pre>
   * Required. Source language code (BCP-47) of the input audio.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. Source language code (BCP-47) of the input audio.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Target language code (BCP-47) of the output.
   * </pre>
   *
   * <code>string target_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetLanguageCode.
   */
  java.lang.String getTargetLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. Target language code (BCP-47) of the output.
   * </pre>
   *
   * <code>string target_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetLanguageCode.
   */
  com.google.protobuf.ByteString getTargetLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Sample rate in Hertz of the audio data. Valid values are:
   * 8000-48000. 16000 is optimal. For best results, set the sampling rate of
   * the audio source to 16000 Hz. If that's not possible, use the native sample
   * rate of the audio source (instead of re-sampling).
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Optional. `google-provided-model/video` and
   * `google-provided-model/enhanced-phone-call` are premium models.
   * `google-provided-model/phone-call` is not premium model.
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. `google-provided-model/video` and
   * `google-provided-model/enhanced-phone-call` are premium models.
   * `google-provided-model/phone-call` is not premium model.
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();
}
