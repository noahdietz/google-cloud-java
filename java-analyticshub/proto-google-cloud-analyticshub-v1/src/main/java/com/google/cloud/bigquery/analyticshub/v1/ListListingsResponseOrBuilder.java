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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.analyticshub.v1;

public interface ListListingsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.ListListingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.Listing listings = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.analyticshub.v1.Listing> getListingsList();
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.Listing listings = 1;</code>
   */
  com.google.cloud.bigquery.analyticshub.v1.Listing getListings(int index);
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.Listing listings = 1;</code>
   */
  int getListingsCount();
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.Listing listings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder>
      getListingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.Listing listings = 1;</code>
   */
  com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
