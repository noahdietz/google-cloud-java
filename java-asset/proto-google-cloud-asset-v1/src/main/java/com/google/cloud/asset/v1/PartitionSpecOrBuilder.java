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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1;

public interface PartitionSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.PartitionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The partition key for BigQuery partitioned table.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
   *
   * @return The enum numeric value on the wire for partitionKey.
   */
  int getPartitionKeyValue();
  /**
   *
   *
   * <pre>
   * The partition key for BigQuery partitioned table.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.PartitionSpec.PartitionKey partition_key = 1;</code>
   *
   * @return The partitionKey.
   */
  com.google.cloud.asset.v1.PartitionSpec.PartitionKey getPartitionKey();
}
