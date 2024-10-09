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
// source: google/cloud/discoveryengine/v1/recommendation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface RecommendResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.RecommendResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of recommended Documents. The order represents the ranking (from the
   * most relevant Document to the least).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult results = 1;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult>
      getResultsList();
  /**
   *
   *
   * <pre>
   * A list of recommended Documents. The order represents the ranking (from the
   * most relevant Document to the least).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult results = 1;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult getResults(int index);
  /**
   *
   *
   * <pre>
   * A list of recommended Documents. The order represents the ranking (from the
   * most relevant Document to the least).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult results = 1;
   * </code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * A list of recommended Documents. The order represents the ranking (from the
   * most relevant Document to the least).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult results = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of recommended Documents. The order represents the ranking (from the
   * most relevant Document to the least).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResult results = 1;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.RecommendResponse.RecommendationResultOrBuilder
      getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A unique attribution token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this recommendation, which enables accurate attribution of recommendation
   * model performance.
   * </pre>
   *
   * <code>string attribution_token = 2;</code>
   *
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();
  /**
   *
   *
   * <pre>
   * A unique attribution token. This should be included in the
   * [UserEvent][google.cloud.discoveryengine.v1.UserEvent] logs resulting from
   * this recommendation, which enables accurate attribution of recommendation
   * model performance.
   * </pre>
   *
   * <code>string attribution_token = 2;</code>
   *
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString getAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * IDs of documents in the request that were missing from the default Branch
   * associated with the requested ServingConfig.
   * </pre>
   *
   * <code>repeated string missing_ids = 3;</code>
   *
   * @return A list containing the missingIds.
   */
  java.util.List<java.lang.String> getMissingIdsList();
  /**
   *
   *
   * <pre>
   * IDs of documents in the request that were missing from the default Branch
   * associated with the requested ServingConfig.
   * </pre>
   *
   * <code>repeated string missing_ids = 3;</code>
   *
   * @return The count of missingIds.
   */
  int getMissingIdsCount();
  /**
   *
   *
   * <pre>
   * IDs of documents in the request that were missing from the default Branch
   * associated with the requested ServingConfig.
   * </pre>
   *
   * <code>repeated string missing_ids = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The missingIds at the given index.
   */
  java.lang.String getMissingIds(int index);
  /**
   *
   *
   * <pre>
   * IDs of documents in the request that were missing from the default Branch
   * associated with the requested ServingConfig.
   * </pre>
   *
   * <code>repeated string missing_ids = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the missingIds at the given index.
   */
  com.google.protobuf.ByteString getMissingIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * True if
   * [RecommendRequest.validate_only][google.cloud.discoveryengine.v1.RecommendRequest.validate_only]
   * was set.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
