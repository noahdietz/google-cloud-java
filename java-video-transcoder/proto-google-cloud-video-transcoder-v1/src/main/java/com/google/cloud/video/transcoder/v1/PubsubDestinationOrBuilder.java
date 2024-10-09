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
// source: google/cloud/video/transcoder/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.transcoder.v1;

public interface PubsubDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.PubsubDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the Pub/Sub topic to publish job completion notification
   * to. For example: `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The name of the Pub/Sub topic to publish job completion notification
   * to. For example: `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();
}
