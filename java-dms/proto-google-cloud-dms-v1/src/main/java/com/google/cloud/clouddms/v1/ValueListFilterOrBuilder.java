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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface ValueListFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ValueListFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Indicates whether the filter matches rows with values that are
   * present in the list or those with values not present in it.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for valuePresentList.
   */
  int getValuePresentListValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates whether the filter matches rows with values that are
   * present in the list or those with values not present in it.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The valuePresentList.
   */
  com.google.cloud.clouddms.v1.ValuePresentInList getValuePresentList();

  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Whether to ignore case when filtering by values. Defaults to
   * false
   * </pre>
   *
   * <code>bool ignore_case = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ignoreCase.
   */
  boolean getIgnoreCase();
}
