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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.migrationcenter.v1;

public interface SettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The preference set used by default for a project.
   * </pre>
   *
   * <code>string preference_set = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The preferenceSet.
   */
  java.lang.String getPreferenceSet();
  /**
   *
   *
   * <pre>
   * The preference set used by default for a project.
   * </pre>
   *
   * <code>string preference_set = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for preferenceSet.
   */
  com.google.protobuf.ByteString getPreferenceSetBytes();
}
