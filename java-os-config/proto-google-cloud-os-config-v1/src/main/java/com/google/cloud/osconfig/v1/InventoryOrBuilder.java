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
// source: google/cloud/osconfig/v1/inventory.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.osconfig.v1;

public interface InventoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.Inventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The `Inventory` API resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/inventory`
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The `Inventory` API resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/inventory`
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   *
   * @return Whether the osInfo field is set.
   */
  boolean hasOsInfo();
  /**
   *
   *
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   *
   * @return The osInfo.
   */
  com.google.cloud.osconfig.v1.Inventory.OsInfo getOsInfo();
  /**
   *
   *
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   */
  com.google.cloud.osconfig.v1.Inventory.OsInfoOrBuilder getOsInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  boolean containsItems(java.lang.String key);
  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1.Inventory.Item> getItems();
  /**
   *
   *
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1.Inventory.Item> getItemsMap();
  /**
   *
   *
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  /* nullable */
  com.google.cloud.osconfig.v1.Inventory.Item getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.osconfig.v1.Inventory.Item defaultValue);
  /**
   *
   *
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  com.google.cloud.osconfig.v1.Inventory.Item getItemsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
