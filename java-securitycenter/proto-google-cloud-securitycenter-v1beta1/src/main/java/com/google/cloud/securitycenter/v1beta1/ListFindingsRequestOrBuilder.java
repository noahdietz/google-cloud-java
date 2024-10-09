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
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1beta1;

public interface ListFindingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.ListFindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the source the findings belong to. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To list across all
   * sources provide a source_id of `-`. For example:
   * organizations/{organization_id}/sources/-
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
   * Required. Name of the source the findings belong to. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To list across all
   * sources provide a source_id of `-`. For example:
   * organizations/{organization_id}/sources/-
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
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are not supported, and `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   *
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are not supported, and `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   *
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,source_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,source_properties.a_property" and "
   * name     desc  ,   source_properties.a_property  " are equivalent.
   * </pre>
   *
   * <code>string order_by = 3;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,source_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,source_properties.a_property" and "
   * name     desc  ,   source_properties.a_property  " are equivalent.
   * </pre>
   *
   * <code>string order_by = 3;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListFindingsResponse`; indicates
   * that this is a continuation of a prior `ListFindings` call, and
   * that the system should return the next page of data.
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
   * The value returned by the last `ListFindingsResponse`; indicates
   * that this is a continuation of a prior `ListFindings` call, and
   * that the system should return the next page of data.
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
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 7;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();
}
