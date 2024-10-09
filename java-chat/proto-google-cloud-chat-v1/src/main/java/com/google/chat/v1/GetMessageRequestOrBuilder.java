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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface GetMessageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.GetMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the message.
   *
   * Format: `spaces/{space}/messages/{message}`
   *
   * If you've set a custom ID for your message, you can use the value from the
   * `clientAssignedMessageId` field for `{message}`. For details, see [Name a
   * message]
   * (https://developers.google.com/workspace/chat/create-messages#name_a_created_message).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the message.
   *
   * Format: `spaces/{space}/messages/{message}`
   *
   * If you've set a custom ID for your message, you can use the value from the
   * `clientAssignedMessageId` field for `{message}`. For details, see [Name a
   * message]
   * (https://developers.google.com/workspace/chat/create-messages#name_a_created_message).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
