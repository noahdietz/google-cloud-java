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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1beta;

public interface CreateConversionEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.CreateConversionEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversionEvent field is set.
   */
  boolean hasConversionEvent();
  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversionEvent.
   */
  com.google.analytics.admin.v1beta.ConversionEvent getConversionEvent();
  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1beta.ConversionEventOrBuilder getConversionEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent property where this conversion
   * event will be created. Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent property where this conversion
   * event will be created. Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
