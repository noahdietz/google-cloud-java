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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface AutopilotCompatibilityIssueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.AutopilotCompatibilityIssue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The last time when this issue was observed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_observation = 1;</code>
   *
   * @return Whether the lastObservation field is set.
   */
  boolean hasLastObservation();
  /**
   *
   *
   * <pre>
   * The last time when this issue was observed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_observation = 1;</code>
   *
   * @return The lastObservation.
   */
  com.google.protobuf.Timestamp getLastObservation();
  /**
   *
   *
   * <pre>
   * The last time when this issue was observed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_observation = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastObservationOrBuilder();

  /**
   *
   *
   * <pre>
   * The constraint type of the issue.
   * </pre>
   *
   * <code>string constraint_type = 2;</code>
   *
   * @return The constraintType.
   */
  java.lang.String getConstraintType();
  /**
   *
   *
   * <pre>
   * The constraint type of the issue.
   * </pre>
   *
   * <code>string constraint_type = 2;</code>
   *
   * @return The bytes for constraintType.
   */
  com.google.protobuf.ByteString getConstraintTypeBytes();

  /**
   *
   *
   * <pre>
   * The incompatibility type of this issue.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutopilotCompatibilityIssue.IssueType incompatibility_type = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for incompatibilityType.
   */
  int getIncompatibilityTypeValue();
  /**
   *
   *
   * <pre>
   * The incompatibility type of this issue.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutopilotCompatibilityIssue.IssueType incompatibility_type = 3;
   * </code>
   *
   * @return The incompatibilityType.
   */
  com.google.container.v1beta1.AutopilotCompatibilityIssue.IssueType getIncompatibilityType();

  /**
   *
   *
   * <pre>
   * The name of the resources which are subject to this issue.
   * </pre>
   *
   * <code>repeated string subjects = 4;</code>
   *
   * @return A list containing the subjects.
   */
  java.util.List<java.lang.String> getSubjectsList();
  /**
   *
   *
   * <pre>
   * The name of the resources which are subject to this issue.
   * </pre>
   *
   * <code>repeated string subjects = 4;</code>
   *
   * @return The count of subjects.
   */
  int getSubjectsCount();
  /**
   *
   *
   * <pre>
   * The name of the resources which are subject to this issue.
   * </pre>
   *
   * <code>repeated string subjects = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The subjects at the given index.
   */
  java.lang.String getSubjects(int index);
  /**
   *
   *
   * <pre>
   * The name of the resources which are subject to this issue.
   * </pre>
   *
   * <code>repeated string subjects = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subjects at the given index.
   */
  com.google.protobuf.ByteString getSubjectsBytes(int index);

  /**
   *
   *
   * <pre>
   * A URL to a public documnetation, which addresses resolving this issue.
   * </pre>
   *
   * <code>string documentation_url = 5;</code>
   *
   * @return The documentationUrl.
   */
  java.lang.String getDocumentationUrl();
  /**
   *
   *
   * <pre>
   * A URL to a public documnetation, which addresses resolving this issue.
   * </pre>
   *
   * <code>string documentation_url = 5;</code>
   *
   * @return The bytes for documentationUrl.
   */
  com.google.protobuf.ByteString getDocumentationUrlBytes();

  /**
   *
   *
   * <pre>
   * The description of the issue.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the issue.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
