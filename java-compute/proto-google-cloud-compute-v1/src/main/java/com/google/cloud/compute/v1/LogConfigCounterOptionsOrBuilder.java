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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface LogConfigCounterOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LogConfigCounterOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.LogConfigCounterOptionsCustomField custom_fields = 249651015;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.LogConfigCounterOptionsCustomField>
      getCustomFieldsList();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.LogConfigCounterOptionsCustomField custom_fields = 249651015;
   * </code>
   */
  com.google.cloud.compute.v1.LogConfigCounterOptionsCustomField getCustomFields(int index);
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.LogConfigCounterOptionsCustomField custom_fields = 249651015;
   * </code>
   */
  int getCustomFieldsCount();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.LogConfigCounterOptionsCustomField custom_fields = 249651015;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LogConfigCounterOptionsCustomFieldOrBuilder>
      getCustomFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.LogConfigCounterOptionsCustomField custom_fields = 249651015;
   * </code>
   */
  com.google.cloud.compute.v1.LogConfigCounterOptionsCustomFieldOrBuilder getCustomFieldsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string field = 97427706;</code>
   *
   * @return Whether the field field is set.
   */
  boolean hasField();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string field = 97427706;</code>
   *
   * @return The field.
   */
  java.lang.String getField();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string field = 97427706;</code>
   *
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString getFieldBytes();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string metric = 533067184;</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();
}
