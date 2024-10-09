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
// source: google/cloud/securitycenter/v2/cloud_dlp_data_profile.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public interface CloudDlpDataProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.CloudDlpDataProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the data profile, for example,
   * `projects/123/locations/europe/tableProfiles/8383929`.
   * </pre>
   *
   * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The dataProfile.
   */
  java.lang.String getDataProfile();
  /**
   *
   *
   * <pre>
   * Name of the data profile, for example,
   * `projects/123/locations/europe/tableProfiles/8383929`.
   * </pre>
   *
   * <code>string data_profile = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for dataProfile.
   */
  com.google.protobuf.ByteString getDataProfileBytes();

  /**
   *
   *
   * <pre>
   * The resource hierarchy level at which the data profile was generated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.CloudDlpDataProfile.ParentType parent_type = 2;</code>
   *
   * @return The enum numeric value on the wire for parentType.
   */
  int getParentTypeValue();
  /**
   *
   *
   * <pre>
   * The resource hierarchy level at which the data profile was generated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.CloudDlpDataProfile.ParentType parent_type = 2;</code>
   *
   * @return The parentType.
   */
  com.google.cloud.securitycenter.v2.CloudDlpDataProfile.ParentType getParentType();
}
