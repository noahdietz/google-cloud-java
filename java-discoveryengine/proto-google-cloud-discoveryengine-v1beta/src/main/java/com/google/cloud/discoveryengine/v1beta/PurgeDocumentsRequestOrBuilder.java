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
// source: google/cloud/discoveryengine/v1beta/purge_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public interface PurgeDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * Supported `data_schema`:
   * * `document_id`: One valid
   * [Document.id][google.cloud.discoveryengine.v1beta.Document.id] per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 5;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * Supported `data_schema`:
   * * `document_id`: One valid
   * [Document.id][google.cloud.discoveryengine.v1beta.Document.id] per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 5;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.discoveryengine.v1beta.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * Supported `data_schema`:
   * * `document_id`: One valid
   * [Document.id][google.cloud.discoveryengine.v1beta.Document.id] per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 5;</code>
   */
  com.google.cloud.discoveryengine.v1beta.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Inline source for the input content for purge.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.InlineSource inline_source = 6;
   * </code>
   *
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   *
   *
   * <pre>
   * Inline source for the input content for purge.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.InlineSource inline_source = 6;
   * </code>
   *
   * @return The inlineSource.
   */
  com.google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.InlineSource getInlineSource();
  /**
   *
   *
   * <pre>
   * Inline source for the input content for purge.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.InlineSource inline_source = 6;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.InlineSourceOrBuilder
      getInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Filter matching documents to purge. Only currently supported
   * value is
   * `*` (all items).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. Filter matching documents to purge. Only currently supported
   * value is
   * `*` (all items).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the purge.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PurgeErrorConfig error_config = 7;</code>
   *
   * @return Whether the errorConfig field is set.
   */
  boolean hasErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the purge.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PurgeErrorConfig error_config = 7;</code>
   *
   * @return The errorConfig.
   */
  com.google.cloud.discoveryengine.v1beta.PurgeErrorConfig getErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the purge.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PurgeErrorConfig error_config = 7;</code>
   */
  com.google.cloud.discoveryengine.v1beta.PurgeErrorConfigOrBuilder getErrorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Actually performs the purge. If `force` is set to false, return the
   * expected purge count without deleting any documents.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();

  com.google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest.SourceCase getSourceCase();
}
