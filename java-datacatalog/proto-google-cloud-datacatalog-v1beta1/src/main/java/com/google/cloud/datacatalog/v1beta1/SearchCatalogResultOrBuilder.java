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
// source: google/cloud/datacatalog/v1beta1/search.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface SearchCatalogResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SearchCatalogResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the search result. This field can be used to determine which Get
   * method to call to fetch the full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
   *
   * @return The enum numeric value on the wire for searchResultType.
   */
  int getSearchResultTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the search result. This field can be used to determine which Get
   * method to call to fetch the full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SearchResultType search_result_type = 1;</code>
   *
   * @return The searchResultType.
   */
  com.google.cloud.datacatalog.v1beta1.SearchResultType getSearchResultType();

  /**
   *
   *
   * <pre>
   * Sub-type of the search result. This is a dot-delimited description of the
   * resource's full type, and is the same as the value callers would provide in
   * the "type" search facet.  Examples: `entry.table`, `entry.dataStream`,
   * `tagTemplate`.
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   *
   * @return The searchResultSubtype.
   */
  java.lang.String getSearchResultSubtype();
  /**
   *
   *
   * <pre>
   * Sub-type of the search result. This is a dot-delimited description of the
   * resource's full type, and is the same as the value callers would provide in
   * the "type" search facet.  Examples: `entry.table`, `entry.dataStream`,
   * `tagTemplate`.
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   *
   * @return The bytes for searchResultSubtype.
   */
  com.google.protobuf.ByteString getSearchResultSubtypeBytes();

  /**
   *
   *
   * <pre>
   * The relative resource name of the resource in URL format.
   * Examples:
   *
   *  * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`
   *  * `projects/{project_id}/tagTemplates/{tag_template_id}`
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   *
   * @return The relativeResourceName.
   */
  java.lang.String getRelativeResourceName();
  /**
   *
   *
   * <pre>
   * The relative resource name of the resource in URL format.
   * Examples:
   *
   *  * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`
   *  * `projects/{project_id}/tagTemplates/{tag_template_id}`
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   *
   * @return The bytes for relativeResourceName.
   */
  com.google.protobuf.ByteString getRelativeResourceNameBytes();

  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Example:
   *
   *  * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   *
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Example:
   *
   *  * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   *
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * Last-modified timestamp of the entry from the managing system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   *
   * @return Whether the modifyTime field is set.
   */
  boolean hasModifyTime();
  /**
   *
   *
   * <pre>
   * Last-modified timestamp of the entry from the managing system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   *
   * @return The modifyTime.
   */
  com.google.protobuf.Timestamp getModifyTime();
  /**
   *
   *
   * <pre>
   * Last-modified timestamp of the entry from the managing system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifyTimeOrBuilder();
}
