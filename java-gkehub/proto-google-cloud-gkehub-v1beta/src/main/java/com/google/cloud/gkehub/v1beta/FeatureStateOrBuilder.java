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
// source: google/cloud/gkehub/v1beta/feature.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkehub.v1beta;

public interface FeatureStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta.FeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The high-level, machine-readable status of this Feature.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.FeatureState.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * The high-level, machine-readable status of this Feature.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.FeatureState.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.cloud.gkehub.v1beta.FeatureState.Code getCode();

  /**
   *
   *
   * <pre>
   * A human-readable description of the current status.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A human-readable description of the current status.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
