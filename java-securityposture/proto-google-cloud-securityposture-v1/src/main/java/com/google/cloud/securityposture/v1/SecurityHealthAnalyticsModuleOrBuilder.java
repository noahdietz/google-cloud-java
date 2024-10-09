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
// source: google/cloud/securityposture/v1/sha_constraints.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securityposture.v1;

public interface SecurityHealthAnalyticsModuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.SecurityHealthAnalyticsModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
   * </pre>
   *
   * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The moduleName.
   */
  java.lang.String getModuleName();
  /**
   *
   *
   * <pre>
   * Required. The name of the module eg: BIGQUERY_TABLE_CMEK_DISABLED.
   * </pre>
   *
   * <code>string module_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for moduleName.
   */
  com.google.protobuf.ByteString getModuleNameBytes();

  /**
   *
   *
   * <pre>
   * The state of enablement for the module at its level of the resource
   * hierarchy.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
   *
   * @return The enum numeric value on the wire for moduleEnablementState.
   */
  int getModuleEnablementStateValue();
  /**
   *
   *
   * <pre>
   * The state of enablement for the module at its level of the resource
   * hierarchy.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.EnablementState module_enablement_state = 2;</code>
   *
   * @return The moduleEnablementState.
   */
  com.google.cloud.securityposture.v1.EnablementState getModuleEnablementState();
}
