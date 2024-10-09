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
// source: google/cloud/netapp/v1/kms.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public interface CreateKmsConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.CreateKmsConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
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
   * Required. Value for parent.
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
   * Required. Id of the requesting KmsConfig. Must be unique within the parent
   * resource. Must contain only letters, numbers, underscore and hyphen, with
   * the first character a letter or underscore, the last a letter or underscore
   * or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string kms_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The kmsConfigId.
   */
  java.lang.String getKmsConfigId();
  /**
   *
   *
   * <pre>
   * Required. Id of the requesting KmsConfig. Must be unique within the parent
   * resource. Must contain only letters, numbers, underscore and hyphen, with
   * the first character a letter or underscore, the last a letter or underscore
   * or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string kms_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for kmsConfigId.
   */
  com.google.protobuf.ByteString getKmsConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new KmsConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.KmsConfig kms_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the kmsConfig field is set.
   */
  boolean hasKmsConfig();
  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new KmsConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.KmsConfig kms_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The kmsConfig.
   */
  com.google.cloud.netapp.v1.KmsConfig getKmsConfig();
  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new KmsConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.KmsConfig kms_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.KmsConfigOrBuilder getKmsConfigOrBuilder();
}
