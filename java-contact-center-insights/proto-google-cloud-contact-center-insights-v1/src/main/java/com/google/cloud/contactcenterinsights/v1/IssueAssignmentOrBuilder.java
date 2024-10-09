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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

public interface IssueAssignmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.IssueAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the assigned issue.
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The issue.
   */
  java.lang.String getIssue();
  /**
   *
   *
   * <pre>
   * Resource name of the assigned issue.
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The bytes for issue.
   */
  com.google.protobuf.ByteString getIssueBytes();

  /**
   *
   *
   * <pre>
   * Score indicating the likelihood of the issue assignment.
   * currently bounded on [0,1].
   * </pre>
   *
   * <code>double score = 2;</code>
   *
   * @return The score.
   */
  double getScore();

  /**
   *
   *
   * <pre>
   * Immutable. Display name of the assigned issue. This field is set at time of
   * analyis and immutable since then.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Immutable. Display name of the assigned issue. This field is set at time of
   * analyis and immutable since then.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
