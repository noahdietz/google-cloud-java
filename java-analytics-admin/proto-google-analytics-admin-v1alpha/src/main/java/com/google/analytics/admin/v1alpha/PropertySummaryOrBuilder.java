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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

public interface PropertySummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.PropertySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of property referred to by this property summary
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * Resource name of property referred to by this property summary
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Display name for the property referred to in this property summary.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name for the property referred to in this property summary.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The property's property type.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.PropertyType property_type = 3;</code>
   *
   * @return The enum numeric value on the wire for propertyType.
   */
  int getPropertyTypeValue();
  /**
   *
   *
   * <pre>
   * The property's property type.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.PropertyType property_type = 3;</code>
   *
   * @return The propertyType.
   */
  com.google.analytics.admin.v1alpha.PropertyType getPropertyType();

  /**
   *
   *
   * <pre>
   * Resource name of this property's logical parent.
   *
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/200"
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of this property's logical parent.
   *
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/200"
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
