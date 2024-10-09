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
// source: google/cloud/video/livestream/v1/outputs.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.livestream.v1;

public interface ElementaryStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.ElementaryStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique key for this elementary stream. The key must be 1-63
   * characters in length. The key must begin and end with a letter (regardless
   * of case) or a number, but can contain dashes or underscores in between.
   * </pre>
   *
   * <code>string key = 4;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * A unique key for this elementary stream. The key must be 1-63
   * characters in length. The key must begin and end with a letter (regardless
   * of case) or a number, but can contain dashes or underscores in between.
   * </pre>
   *
   * <code>string key = 4;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Encoding of a video stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream video_stream = 1;</code>
   *
   * @return Whether the videoStream field is set.
   */
  boolean hasVideoStream();
  /**
   *
   *
   * <pre>
   * Encoding of a video stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream video_stream = 1;</code>
   *
   * @return The videoStream.
   */
  com.google.cloud.video.livestream.v1.VideoStream getVideoStream();
  /**
   *
   *
   * <pre>
   * Encoding of a video stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoStream video_stream = 1;</code>
   */
  com.google.cloud.video.livestream.v1.VideoStreamOrBuilder getVideoStreamOrBuilder();

  /**
   *
   *
   * <pre>
   * Encoding of an audio stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioStream audio_stream = 2;</code>
   *
   * @return Whether the audioStream field is set.
   */
  boolean hasAudioStream();
  /**
   *
   *
   * <pre>
   * Encoding of an audio stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioStream audio_stream = 2;</code>
   *
   * @return The audioStream.
   */
  com.google.cloud.video.livestream.v1.AudioStream getAudioStream();
  /**
   *
   *
   * <pre>
   * Encoding of an audio stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioStream audio_stream = 2;</code>
   */
  com.google.cloud.video.livestream.v1.AudioStreamOrBuilder getAudioStreamOrBuilder();

  /**
   *
   *
   * <pre>
   * Encoding of a text stream. For example, closed captions or subtitles.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.TextStream text_stream = 3;</code>
   *
   * @return Whether the textStream field is set.
   */
  boolean hasTextStream();
  /**
   *
   *
   * <pre>
   * Encoding of a text stream. For example, closed captions or subtitles.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.TextStream text_stream = 3;</code>
   *
   * @return The textStream.
   */
  com.google.cloud.video.livestream.v1.TextStream getTextStream();
  /**
   *
   *
   * <pre>
   * Encoding of a text stream. For example, closed captions or subtitles.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.TextStream text_stream = 3;</code>
   */
  com.google.cloud.video.livestream.v1.TextStreamOrBuilder getTextStreamOrBuilder();

  com.google.cloud.video.livestream.v1.ElementaryStream.ElementaryStreamCase
      getElementaryStreamCase();
}
