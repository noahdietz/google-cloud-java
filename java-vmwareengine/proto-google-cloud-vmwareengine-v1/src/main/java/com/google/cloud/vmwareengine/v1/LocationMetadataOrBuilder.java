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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vmwareengine.v1;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the capabilities.
   */
  java.util.List<com.google.cloud.vmwareengine.v1.LocationMetadata.Capability>
      getCapabilitiesList();
  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of capabilities.
   */
  int getCapabilitiesCount();
  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The capabilities at the given index.
   */
  com.google.cloud.vmwareengine.v1.LocationMetadata.Capability getCapabilities(int index);
  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for capabilities.
   */
  java.util.List<java.lang.Integer> getCapabilitiesValueList();
  /**
   *
   *
   * <pre>
   * Output only. Capabilities of this location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.LocationMetadata.Capability capabilities = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capabilities at the given index.
   */
  int getCapabilitiesValue(int index);
}
