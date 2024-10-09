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
// source: google/ads/admanager/v1/contact_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public interface ContactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.Contact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the `Contact`.
   * Format: `networks/{network_code}/contacts/{contact_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the `Contact`.
   * Format: `networks/{network_code}/contacts/{contact_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The unique ID of the contact. This value is readonly and is
   * assigned by Google.
   * </pre>
   *
   * <code>int64 contact_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The contactId.
   */
  long getContactId();
}
