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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface ImportDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImportDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Dataset resource name, format:
   * projects/{project_id}/datasets/{dataset_id}
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
   * Required. Dataset resource name, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Specify the input source of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Specify the input source of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.datalabeling.v1beta1.InputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. Specify the input source of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Email of the user who started the import task and should be notified by
   * email. If empty no notification will be sent.
   * </pre>
   *
   * <code>string user_email_address = 3;</code>
   *
   * @return The userEmailAddress.
   */
  java.lang.String getUserEmailAddress();
  /**
   *
   *
   * <pre>
   * Email of the user who started the import task and should be notified by
   * email. If empty no notification will be sent.
   * </pre>
   *
   * <code>string user_email_address = 3;</code>
   *
   * @return The bytes for userEmailAddress.
   */
  com.google.protobuf.ByteString getUserEmailAddressBytes();
}
