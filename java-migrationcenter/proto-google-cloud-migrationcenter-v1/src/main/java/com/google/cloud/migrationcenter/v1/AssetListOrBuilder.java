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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.migrationcenter.v1;

public interface AssetListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.AssetList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the assetIds.
   */
  java.util.List<java.lang.String> getAssetIdsList();
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of assetIds.
   */
  int getAssetIdsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The assetIds at the given index.
   */
  java.lang.String getAssetIds(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetIds at the given index.
   */
  com.google.protobuf.ByteString getAssetIdsBytes(int index);
}
