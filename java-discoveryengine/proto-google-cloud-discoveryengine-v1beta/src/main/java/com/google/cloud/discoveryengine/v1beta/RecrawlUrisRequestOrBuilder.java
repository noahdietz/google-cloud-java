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
// source: google/cloud/discoveryengine/v1beta/site_search_engine_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public interface RecrawlUrisRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.RecrawlUrisRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
   * such as
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The siteSearchEngine.
   */
  java.lang.String getSiteSearchEngine();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1beta.SiteSearchEngine],
   * such as
   * `projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;&#47;siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for siteSearchEngine.
   */
  com.google.protobuf.ByteString getSiteSearchEngineBytes();

  /**
   *
   *
   * <pre>
   * Required. List of URIs to crawl. At most 10K URIs are supported, otherwise
   * an INVALID_ARGUMENT error is thrown. Each URI should match at least one
   * [TargetSite][google.cloud.discoveryengine.v1beta.TargetSite] in
   * `site_search_engine`.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String> getUrisList();
  /**
   *
   *
   * <pre>
   * Required. List of URIs to crawl. At most 10K URIs are supported, otherwise
   * an INVALID_ARGUMENT error is thrown. Each URI should match at least one
   * [TargetSite][google.cloud.discoveryengine.v1beta.TargetSite] in
   * `site_search_engine`.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of uris.
   */
  int getUrisCount();
  /**
   *
   *
   * <pre>
   * Required. List of URIs to crawl. At most 10K URIs are supported, otherwise
   * an INVALID_ARGUMENT error is thrown. Each URI should match at least one
   * [TargetSite][google.cloud.discoveryengine.v1beta.TargetSite] in
   * `site_search_engine`.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);
  /**
   *
   *
   * <pre>
   * Required. List of URIs to crawl. At most 10K URIs are supported, otherwise
   * an INVALID_ARGUMENT error is thrown. Each URI should match at least one
   * [TargetSite][google.cloud.discoveryengine.v1beta.TargetSite] in
   * `site_search_engine`.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString getUrisBytes(int index);
}
