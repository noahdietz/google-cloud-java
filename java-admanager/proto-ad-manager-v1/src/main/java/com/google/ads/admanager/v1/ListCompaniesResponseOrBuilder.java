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
// source: google/ads/admanager/v1/company_service.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public interface ListCompaniesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.ListCompaniesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `Company` objects from the specified network.
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Company companies = 1;</code>
   */
  java.util.List<com.google.ads.admanager.v1.Company> getCompaniesList();
  /**
   *
   *
   * <pre>
   * The `Company` objects from the specified network.
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Company companies = 1;</code>
   */
  com.google.ads.admanager.v1.Company getCompanies(int index);
  /**
   *
   *
   * <pre>
   * The `Company` objects from the specified network.
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Company companies = 1;</code>
   */
  int getCompaniesCount();
  /**
   *
   *
   * <pre>
   * The `Company` objects from the specified network.
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Company companies = 1;</code>
   */
  java.util.List<? extends com.google.ads.admanager.v1.CompanyOrBuilder>
      getCompaniesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The `Company` objects from the specified network.
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Company companies = 1;</code>
   */
  com.google.ads.admanager.v1.CompanyOrBuilder getCompaniesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Total number of `Company` objects.
   * If a filter was included in the request, this reflects the total number
   * after the filtering is applied.
   *
   * `total_size` will not be calculated in the response unless it has been
   * included in a response field mask. The response field mask can be provided
   * to the method by using the URL parameter `$fields` or `fields`, or by using
   * the HTTP/gRPC header `X-Goog-FieldMask`.
   *
   * For more information, see
   * https://developers.google.com/ad-manager/api/beta/field-masks
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
