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

public interface ListAssetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.ListAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the organization, folder, or project the assets belong
   * to. Format: "organizations/[organization-number]" (such as
   * "organizations/123"), "projects/[project-id]" (such as
   * "projects/my-project-id"), "projects/[project-number]" (such as
   * "projects/12345"), or "folders/[folder-number]" (such as "folders/12345").
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
   * Required. Name of the organization, folder, or project the assets belong
   * to. Format: "organizations/[organization-number]" (such as
   * "organizations/123"), "projects/[project-id]" (such as
   * "projects/my-project-id"), "projects/[project-number]" (such as
   * "projects/12345"), or "folders/[folder-number]" (such as "folders/12345").
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
   * Timestamp to take an asset snapshot. This can only be set to a timestamp
   * between the current time and the current time minus 35 days (inclusive).
   * If not specified, the current time will be used. Due to delays in resource
   * data collection and indexing, there is a volatile window during which
   * running the same query may get different results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Timestamp to take an asset snapshot. This can only be set to a timestamp
   * between the current time and the current time minus 35 days (inclusive).
   * If not specified, the current time will be used. Due to delays in resource
   * data collection and indexing, there is a volatile window during which
   * running the same query may get different results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Timestamp to take an asset snapshot. This can only be set to a timestamp
   * between the current time and the current time minus 35 days (inclusive).
   * If not specified, the current time will be used. Due to delays in resource
   * data collection and indexing, there is a volatile window during which
   * running the same query may get different results.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of asset types to take a snapshot for. For example:
   * "compute.googleapis.com/Disk".
   *
   * Regular expression is also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   *
   * If specified, only matching assets will be returned, otherwise, it will
   * snapshot all asset types. See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @return A list containing the assetTypes.
   */
  java.util.List<java.lang.String> getAssetTypesList();
  /**
   *
   *
   * <pre>
   * A list of asset types to take a snapshot for. For example:
   * "compute.googleapis.com/Disk".
   *
   * Regular expression is also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   *
   * If specified, only matching assets will be returned, otherwise, it will
   * snapshot all asset types. See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @return The count of assetTypes.
   */
  int getAssetTypesCount();
  /**
   *
   *
   * <pre>
   * A list of asset types to take a snapshot for. For example:
   * "compute.googleapis.com/Disk".
   *
   * Regular expression is also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   *
   * If specified, only matching assets will be returned, otherwise, it will
   * snapshot all asset types. See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The assetTypes at the given index.
   */
  java.lang.String getAssetTypes(int index);
  /**
   *
   *
   * <pre>
   * A list of asset types to take a snapshot for. For example:
   * "compute.googleapis.com/Disk".
   *
   * Regular expression is also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   *
   * If specified, only matching assets will be returned, otherwise, it will
   * snapshot all asset types. See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetTypes at the given index.
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name will
   * be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ContentType content_type = 4;</code>
   *
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name will
   * be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.ContentType content_type = 4;</code>
   *
   * @return The contentType.
   */
  com.google.cloud.asset.v1.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * The maximum number of assets to be returned in a single response. Default
   * is 100, minimum is 1, and maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The `next_page_token` returned from the previous `ListAssetsResponse`, or
   * unspecified for the first `ListAssetsRequest`. It is a continuation of a
   * prior `ListAssets` call, and the API should return the next page of assets.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The `next_page_token` returned from the previous `ListAssetsResponse`, or
   * unspecified for the first `ListAssetsRequest`. It is a continuation of a
   * prior `ListAssets` call, and the API should return the next page of assets.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it snapshots specified relationships. It returns an error if
   * any of the [relationship_types] doesn't belong to the supported
   * relationship types of the [asset_types] or if any of the [asset_types]
   * doesn't belong to the source types of the [relationship_types].
   * * Otherwise:
   * it snapshots the supported relationships for all [asset_types] or returns
   * an error if any of the [asset_types] has no relationship support.
   * An unspecified asset types field means all supported asset_types.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @return A list containing the relationshipTypes.
   */
  java.util.List<java.lang.String> getRelationshipTypesList();
  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it snapshots specified relationships. It returns an error if
   * any of the [relationship_types] doesn't belong to the supported
   * relationship types of the [asset_types] or if any of the [asset_types]
   * doesn't belong to the source types of the [relationship_types].
   * * Otherwise:
   * it snapshots the supported relationships for all [asset_types] or returns
   * an error if any of the [asset_types] has no relationship support.
   * An unspecified asset types field means all supported asset_types.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @return The count of relationshipTypes.
   */
  int getRelationshipTypesCount();
  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it snapshots specified relationships. It returns an error if
   * any of the [relationship_types] doesn't belong to the supported
   * relationship types of the [asset_types] or if any of the [asset_types]
   * doesn't belong to the source types of the [relationship_types].
   * * Otherwise:
   * it snapshots the supported relationships for all [asset_types] or returns
   * an error if any of the [asset_types] has no relationship support.
   * An unspecified asset types field means all supported asset_types.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The relationshipTypes at the given index.
   */
  java.lang.String getRelationshipTypes(int index);
  /**
   *
   *
   * <pre>
   * A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it snapshots specified relationships. It returns an error if
   * any of the [relationship_types] doesn't belong to the supported
   * relationship types of the [asset_types] or if any of the [asset_types]
   * doesn't belong to the source types of the [relationship_types].
   * * Otherwise:
   * it snapshots the supported relationships for all [asset_types] or returns
   * an error if any of the [asset_types] has no relationship support.
   * An unspecified asset types field means all supported asset_types.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview)
   * for all supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relationshipTypes at the given index.
   */
  com.google.protobuf.ByteString getRelationshipTypesBytes(int index);
}
