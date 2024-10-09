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
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ReadFeatureValuesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Response header.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.Header header = 1;</code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   *
   *
   * <pre>
   * Response header.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.Header header = 1;</code>
   *
   * @return The header.
   */
  com.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.Header getHeader();
  /**
   *
   *
   * <pre>
   * Response header.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.Header header = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.HeaderOrBuilder
      getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Entity view with Feature values. This may be the entity in the
   * Featurestore if values for all Features were requested, or a projection
   * of the entity in the Featurestore if values for only some Features were
   * requested.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.EntityView entity_view = 2;
   * </code>
   *
   * @return Whether the entityView field is set.
   */
  boolean hasEntityView();
  /**
   *
   *
   * <pre>
   * Entity view with Feature values. This may be the entity in the
   * Featurestore if values for all Features were requested, or a projection
   * of the entity in the Featurestore if values for only some Features were
   * requested.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.EntityView entity_view = 2;
   * </code>
   *
   * @return The entityView.
   */
  com.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.EntityView getEntityView();
  /**
   *
   *
   * <pre>
   * Entity view with Feature values. This may be the entity in the
   * Featurestore if values for all Features were requested, or a projection
   * of the entity in the Featurestore if values for only some Features were
   * requested.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.EntityView entity_view = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ReadFeatureValuesResponse.EntityViewOrBuilder
      getEntityViewOrBuilder();
}
