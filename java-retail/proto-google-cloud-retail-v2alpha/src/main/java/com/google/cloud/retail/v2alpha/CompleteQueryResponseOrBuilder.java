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
// source: google/cloud/retail/v2alpha/completion_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public interface CompleteQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.CompleteQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Results of the matching suggestions. The result list is ordered and the
   * first result is top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult completion_results = 1;
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult>
      getCompletionResultsList();
  /**
   *
   *
   * <pre>
   * Results of the matching suggestions. The result list is ordered and the
   * first result is top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult completion_results = 1;
   * </code>
   */
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult getCompletionResults(
      int index);
  /**
   *
   *
   * <pre>
   * Results of the matching suggestions. The result list is ordered and the
   * first result is top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult completion_results = 1;
   * </code>
   */
  int getCompletionResultsCount();
  /**
   *
   *
   * <pre>
   * Results of the matching suggestions. The result list is ordered and the
   * first result is top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult completion_results = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResultOrBuilder>
      getCompletionResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of the matching suggestions. The result list is ordered and the
   * first result is top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult completion_results = 1;
   * </code>
   */
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResultOrBuilder
      getCompletionResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A unique complete token. This should be included in the
   * [UserEvent.completion_detail][google.cloud.retail.v2alpha.UserEvent.completion_detail]
   * for search events resulting from this completion, which enables accurate
   * attribution of complete model performance.
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
   * A unique complete token. This should be included in the
   * [UserEvent.completion_detail][google.cloud.retail.v2alpha.UserEvent.completion_detail]
   * for search events resulting from this completion, which enables accurate
   * attribution of complete model performance.
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
   * Deprecated. Matched recent searches of this user. The maximum number of
   * recent searches is 10. This field is a restricted feature. If you want to
   * enable it, contact Retail Search support.
   *
   * This feature is only available when
   * [CompleteQueryRequest.visitor_id][google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id]
   * field is set and [UserEvent][google.cloud.retail.v2alpha.UserEvent] is
   * imported. The recent searches satisfy the follow rules:
   *
   *  * They are ordered from latest to oldest.
   *
   *  * They are matched with
   *  [CompleteQueryRequest.query][google.cloud.retail.v2alpha.CompleteQueryRequest.query]
   *  case insensitively.
   *
   *  * They are transformed to lower case.
   *
   *  * They are UTF-8 safe.
   *
   * Recent searches are deduplicated. More recent searches will be reserved
   * when duplication happens.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult recent_search_results = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult>
      getRecentSearchResultsList();
  /**
   *
   *
   * <pre>
   * Deprecated. Matched recent searches of this user. The maximum number of
   * recent searches is 10. This field is a restricted feature. If you want to
   * enable it, contact Retail Search support.
   *
   * This feature is only available when
   * [CompleteQueryRequest.visitor_id][google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id]
   * field is set and [UserEvent][google.cloud.retail.v2alpha.UserEvent] is
   * imported. The recent searches satisfy the follow rules:
   *
   *  * They are ordered from latest to oldest.
   *
   *  * They are matched with
   *  [CompleteQueryRequest.query][google.cloud.retail.v2alpha.CompleteQueryRequest.query]
   *  case insensitively.
   *
   *  * They are transformed to lower case.
   *
   *  * They are UTF-8 safe.
   *
   * Recent searches are deduplicated. More recent searches will be reserved
   * when duplication happens.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult recent_search_results = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult getRecentSearchResults(
      int index);
  /**
   *
   *
   * <pre>
   * Deprecated. Matched recent searches of this user. The maximum number of
   * recent searches is 10. This field is a restricted feature. If you want to
   * enable it, contact Retail Search support.
   *
   * This feature is only available when
   * [CompleteQueryRequest.visitor_id][google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id]
   * field is set and [UserEvent][google.cloud.retail.v2alpha.UserEvent] is
   * imported. The recent searches satisfy the follow rules:
   *
   *  * They are ordered from latest to oldest.
   *
   *  * They are matched with
   *  [CompleteQueryRequest.query][google.cloud.retail.v2alpha.CompleteQueryRequest.query]
   *  case insensitively.
   *
   *  * They are transformed to lower case.
   *
   *  * They are UTF-8 safe.
   *
   * Recent searches are deduplicated. More recent searches will be reserved
   * when duplication happens.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult recent_search_results = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getRecentSearchResultsCount();
  /**
   *
   *
   * <pre>
   * Deprecated. Matched recent searches of this user. The maximum number of
   * recent searches is 10. This field is a restricted feature. If you want to
   * enable it, contact Retail Search support.
   *
   * This feature is only available when
   * [CompleteQueryRequest.visitor_id][google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id]
   * field is set and [UserEvent][google.cloud.retail.v2alpha.UserEvent] is
   * imported. The recent searches satisfy the follow rules:
   *
   *  * They are ordered from latest to oldest.
   *
   *  * They are matched with
   *  [CompleteQueryRequest.query][google.cloud.retail.v2alpha.CompleteQueryRequest.query]
   *  case insensitively.
   *
   *  * They are transformed to lower case.
   *
   *  * They are UTF-8 safe.
   *
   * Recent searches are deduplicated. More recent searches will be reserved
   * when duplication happens.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult recent_search_results = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<
          ? extends
              com.google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResultOrBuilder>
      getRecentSearchResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Deprecated. Matched recent searches of this user. The maximum number of
   * recent searches is 10. This field is a restricted feature. If you want to
   * enable it, contact Retail Search support.
   *
   * This feature is only available when
   * [CompleteQueryRequest.visitor_id][google.cloud.retail.v2alpha.CompleteQueryRequest.visitor_id]
   * field is set and [UserEvent][google.cloud.retail.v2alpha.UserEvent] is
   * imported. The recent searches satisfy the follow rules:
   *
   *  * They are ordered from latest to oldest.
   *
   *  * They are matched with
   *  [CompleteQueryRequest.query][google.cloud.retail.v2alpha.CompleteQueryRequest.query]
   *  case insensitively.
   *
   *  * They are transformed to lower case.
   *
   *  * They are UTF-8 safe.
   *
   * Recent searches are deduplicated. More recent searches will be reserved
   * when duplication happens.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResult recent_search_results = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.RecentSearchResultOrBuilder
      getRecentSearchResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A map of matched attribute suggestions. This field is only available for
   * "cloud-retail" dataset.
   *
   * Current supported keys:
   *
   * * `brands`
   *
   * * `categories`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult&gt; attribute_results = 4;
   * </code>
   */
  int getAttributeResultsCount();
  /**
   *
   *
   * <pre>
   * A map of matched attribute suggestions. This field is only available for
   * "cloud-retail" dataset.
   *
   * Current supported keys:
   *
   * * `brands`
   *
   * * `categories`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult&gt; attribute_results = 4;
   * </code>
   */
  boolean containsAttributeResults(java.lang.String key);
  /** Use {@link #getAttributeResultsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult>
      getAttributeResults();
  /**
   *
   *
   * <pre>
   * A map of matched attribute suggestions. This field is only available for
   * "cloud-retail" dataset.
   *
   * Current supported keys:
   *
   * * `brands`
   *
   * * `categories`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult&gt; attribute_results = 4;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult>
      getAttributeResultsMap();
  /**
   *
   *
   * <pre>
   * A map of matched attribute suggestions. This field is only available for
   * "cloud-retail" dataset.
   *
   * Current supported keys:
   *
   * * `brands`
   *
   * * `categories`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult&gt; attribute_results = 4;
   * </code>
   */
  /* nullable */
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult
      getAttributeResultsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult defaultValue);
  /**
   *
   *
   * <pre>
   * A map of matched attribute suggestions. This field is only available for
   * "cloud-retail" dataset.
   *
   * Current supported keys:
   *
   * * `brands`
   *
   * * `categories`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult&gt; attribute_results = 4;
   * </code>
   */
  com.google.cloud.retail.v2alpha.CompleteQueryResponse.AttributeResult getAttributeResultsOrThrow(
      java.lang.String key);
}
