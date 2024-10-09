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
// source: google/chat/v1/membership.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface ListMembershipsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ListMembershipsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unordered list. List of memberships in the requested (or first) page.
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 1 [(.google.api.field_behavior) = UNORDERED_LIST];
   * </code>
   */
  java.util.List<com.google.chat.v1.Membership> getMembershipsList();
  /**
   *
   *
   * <pre>
   * Unordered list. List of memberships in the requested (or first) page.
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 1 [(.google.api.field_behavior) = UNORDERED_LIST];
   * </code>
   */
  com.google.chat.v1.Membership getMemberships(int index);
  /**
   *
   *
   * <pre>
   * Unordered list. List of memberships in the requested (or first) page.
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 1 [(.google.api.field_behavior) = UNORDERED_LIST];
   * </code>
   */
  int getMembershipsCount();
  /**
   *
   *
   * <pre>
   * Unordered list. List of memberships in the requested (or first) page.
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 1 [(.google.api.field_behavior) = UNORDERED_LIST];
   * </code>
   */
  java.util.List<? extends com.google.chat.v1.MembershipOrBuilder> getMembershipsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Unordered list. List of memberships in the requested (or first) page.
   * </pre>
   *
   * <code>
   * repeated .google.chat.v1.Membership memberships = 1 [(.google.api.field_behavior) = UNORDERED_LIST];
   * </code>
   */
  com.google.chat.v1.MembershipOrBuilder getMembershipsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that you can send as `pageToken` to retrieve the next page of
   * results. If empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that you can send as `pageToken` to retrieve the next page of
   * results. If empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
