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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface VmSelectionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.VmSelectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Platform zone the VM is located.
   * </pre>
   *
   * <code>string vm_zone = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmZone.
   */
  java.lang.String getVmZone();
  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Platform zone the VM is located.
   * </pre>
   *
   * <code>string vm_zone = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vmZone.
   */
  com.google.protobuf.ByteString getVmZoneBytes();
}
