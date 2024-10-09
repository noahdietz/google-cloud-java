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
// source: google/shopping/css/v1/accounts.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.css.v1;

public interface ListChildAccountsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.ListChildAccountsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent account. Must be a CSS group or domain.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent account. Must be a CSS group or domain.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * If set, only the MC accounts with the given label ID will be returned.
   * </pre>
   *
   * <code>optional int64 label_id = 2;</code>
   *
   * @return Whether the labelId field is set.
   */
  boolean hasLabelId();
  /**
   *
   *
   * <pre>
   * If set, only the MC accounts with the given label ID will be returned.
   * </pre>
   *
   * <code>optional int64 label_id = 2;</code>
   *
   * @return The labelId.
   */
  long getLabelId();

  /**
   *
   *
   * <pre>
   * If set, only the MC accounts with the given name (case sensitive) will be
   * returned.
   * </pre>
   *
   * <code>optional string full_name = 3;</code>
   *
   * @return Whether the fullName field is set.
   */
  boolean hasFullName();
  /**
   *
   *
   * <pre>
   * If set, only the MC accounts with the given name (case sensitive) will be
   * returned.
   * </pre>
   *
   * <code>optional string full_name = 3;</code>
   *
   * @return The fullName.
   */
  java.lang.String getFullName();
  /**
   *
   *
   * <pre>
   * If set, only the MC accounts with the given name (case sensitive) will be
   * returned.
   * </pre>
   *
   * <code>optional string full_name = 3;</code>
   *
   * @return The bytes for fullName.
   */
  com.google.protobuf.ByteString getFullNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of accounts to return. The service may return
   * fewer than this value. If unspecified, at most 50 accounts will be
   * returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListChildAccounts` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListChildAccounts` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListChildAccounts` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListChildAccounts` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
