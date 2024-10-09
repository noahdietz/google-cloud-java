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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface FetchFeatureValuesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;
   * </code>
   *
   * @return Whether the keyValues field is set.
   */
  boolean hasKeyValues();
  /**
   *
   *
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;
   * </code>
   *
   * @return The keyValues.
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList
      getKeyValues();
  /**
   *
   *
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairListOrBuilder
      getKeyValuesOrBuilder();

  /**
   *
   *
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   *
   * @return Whether the protoStruct field is set.
   */
  boolean hasProtoStruct();
  /**
   *
   *
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   *
   * @return The protoStruct.
   */
  com.google.protobuf.Struct getProtoStruct();
  /**
   *
   *
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getProtoStructOrBuilder();

  /**
   *
   *
   * <pre>
   * The data key associated with this response.
   * Will only be populated for
   * [FeatureOnlineStoreService.StreamingFetchFeatureValues][google.cloud.aiplatform.v1beta1.FeatureOnlineStoreService.StreamingFetchFeatureValues]
   * RPCs.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_key = 4;</code>
   *
   * @return Whether the dataKey field is set.
   */
  boolean hasDataKey();
  /**
   *
   *
   * <pre>
   * The data key associated with this response.
   * Will only be populated for
   * [FeatureOnlineStoreService.StreamingFetchFeatureValues][google.cloud.aiplatform.v1beta1.FeatureOnlineStoreService.StreamingFetchFeatureValues]
   * RPCs.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_key = 4;</code>
   *
   * @return The dataKey.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey getDataKey();
  /**
   *
   *
   * <pre>
   * The data key associated with this response.
   * Will only be populated for
   * [FeatureOnlineStoreService.StreamingFetchFeatureValues][google.cloud.aiplatform.v1beta1.FeatureOnlineStoreService.StreamingFetchFeatureValues]
   * RPCs.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_key = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKeyOrBuilder getDataKeyOrBuilder();

  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FormatCase getFormatCase();
}
