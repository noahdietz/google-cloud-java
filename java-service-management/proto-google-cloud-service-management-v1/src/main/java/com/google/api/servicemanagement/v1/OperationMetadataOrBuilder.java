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
// source: google/api/servicemanagement/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.api.servicemanagement.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   *
   * @return A list containing the resourceNames.
   */
  java.util.List<java.lang.String> getResourceNamesList();
  /**
   *
   *
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   *
   * @return The count of resourceNames.
   */
  int getResourceNamesCount();
  /**
   *
   *
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  java.lang.String getResourceNames(int index);
  /**
   *
   *
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  com.google.protobuf.ByteString getResourceNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.OperationMetadata.Step> getStepsList();
  /**
   *
   *
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  com.google.api.servicemanagement.v1.OperationMetadata.Step getSteps(int index);
  /**
   *
   *
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  int getStepsCount();
  /**
   *
   *
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.OperationMetadata.StepOrBuilder>
      getStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  com.google.api.servicemanagement.v1.OperationMetadata.StepOrBuilder getStepsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Percentage of completion of this operation, ranging from 0 to 100.
   * </pre>
   *
   * <code>int32 progress_percentage = 3;</code>
   *
   * @return The progressPercentage.
   */
  int getProgressPercentage();

  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}
