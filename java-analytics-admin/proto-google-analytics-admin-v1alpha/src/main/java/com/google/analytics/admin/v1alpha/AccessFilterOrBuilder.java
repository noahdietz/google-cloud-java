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
// source: google/analytics/admin/v1alpha/access_report.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

public interface AccessFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AccessFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessStringFilter string_filter = 2;</code>
   *
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessStringFilter string_filter = 2;</code>
   *
   * @return The stringFilter.
   */
  com.google.analytics.admin.v1alpha.AccessStringFilter getStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessStringFilter string_filter = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AccessStringFilterOrBuilder getStringFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessInListFilter in_list_filter = 3;</code>
   *
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessInListFilter in_list_filter = 3;</code>
   *
   * @return The inListFilter.
   */
  com.google.analytics.admin.v1alpha.AccessInListFilter getInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessInListFilter in_list_filter = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AccessInListFilterOrBuilder getInListFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessNumericFilter numeric_filter = 4;</code>
   *
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessNumericFilter numeric_filter = 4;</code>
   *
   * @return The numericFilter.
   */
  com.google.analytics.admin.v1alpha.AccessNumericFilter getNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessNumericFilter numeric_filter = 4;</code>
   */
  com.google.analytics.admin.v1alpha.AccessNumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessBetweenFilter between_filter = 5;</code>
   *
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessBetweenFilter between_filter = 5;</code>
   *
   * @return The betweenFilter.
   */
  com.google.analytics.admin.v1alpha.AccessBetweenFilter getBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessBetweenFilter between_filter = 5;</code>
   */
  com.google.analytics.admin.v1alpha.AccessBetweenFilterOrBuilder getBetweenFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The dimension name or metric name.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   *
   *
   * <pre>
   * The dimension name or metric name.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString getFieldNameBytes();

  com.google.analytics.admin.v1alpha.AccessFilter.OneFilterCase getOneFilterCase();
}
