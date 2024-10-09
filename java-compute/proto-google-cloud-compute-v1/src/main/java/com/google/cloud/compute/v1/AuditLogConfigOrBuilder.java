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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface AuditLogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AuditLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @return A list containing the exemptedMembers.
   */
  java.util.List<java.lang.String> getExemptedMembersList();
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @return The count of exemptedMembers.
   */
  int getExemptedMembersCount();
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @param index The index of the element to return.
   * @return The exemptedMembers at the given index.
   */
  java.lang.String getExemptedMembers(int index);
  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exemptedMembers at the given index.
   */
  com.google.protobuf.ByteString getExemptedMembersBytes(int index);

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional bool ignore_child_exemptions = 70141850;</code>
   *
   * @return Whether the ignoreChildExemptions field is set.
   */
  boolean hasIgnoreChildExemptions();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional bool ignore_child_exemptions = 70141850;</code>
   *
   * @return The ignoreChildExemptions.
   */
  boolean getIgnoreChildExemptions();

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return Whether the logType field is set.
   */
  boolean hasLogType();
  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return The logType.
   */
  java.lang.String getLogType();
  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return The bytes for logType.
   */
  com.google.protobuf.ByteString getLogTypeBytes();
}
