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
// source: google/cloud/apigeeconnect/v1/tether.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apigeeconnect.v1;

public interface PayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeconnect.v1.Payload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   *
   * @return Whether the httpRequest field is set.
   */
  boolean hasHttpRequest();
  /**
   *
   *
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   *
   * @return The httpRequest.
   */
  com.google.cloud.apigeeconnect.v1.HttpRequest getHttpRequest();
  /**
   *
   *
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   */
  com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder getHttpRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   *
   * @return Whether the streamInfo field is set.
   */
  boolean hasStreamInfo();
  /**
   *
   *
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   *
   * @return The streamInfo.
   */
  com.google.cloud.apigeeconnect.v1.StreamInfo getStreamInfo();
  /**
   *
   *
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   */
  com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder getStreamInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   *
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   *
   *
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   *
   * @return The action.
   */
  com.google.cloud.apigeeconnect.v1.Action getAction();

  com.google.cloud.apigeeconnect.v1.Payload.KindCase getKindCase();
}
