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
// source: google/cloud/retail/v2alpha/project.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public interface ProjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the retail project, such as
   * `projects/{project_id_or_number}/retailProject`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the retail project, such as
   * `projects/{project_id_or_number}/retailProject`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enrolledSolutions.
   */
  java.util.List<com.google.cloud.retail.v2alpha.SolutionType> getEnrolledSolutionsList();
  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of enrolledSolutions.
   */
  int getEnrolledSolutionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The enrolledSolutions at the given index.
   */
  com.google.cloud.retail.v2alpha.SolutionType getEnrolledSolutions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for enrolledSolutions.
   */
  java.util.List<java.lang.Integer> getEnrolledSolutionsValueList();
  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of enrolledSolutions at the given index.
   */
  int getEnrolledSolutionsValue(int index);
}
