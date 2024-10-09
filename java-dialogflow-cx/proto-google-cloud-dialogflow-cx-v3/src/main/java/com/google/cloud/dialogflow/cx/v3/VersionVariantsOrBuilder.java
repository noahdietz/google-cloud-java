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
// source: google/cloud/dialogflow/cx/v3/experiment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface VersionVariantsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.VersionVariants)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of flow version variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.VersionVariants.Variant variants = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.VersionVariants.Variant> getVariantsList();
  /**
   *
   *
   * <pre>
   * A list of flow version variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.VersionVariants.Variant variants = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.VersionVariants.Variant getVariants(int index);
  /**
   *
   *
   * <pre>
   * A list of flow version variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.VersionVariants.Variant variants = 1;</code>
   */
  int getVariantsCount();
  /**
   *
   *
   * <pre>
   * A list of flow version variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.VersionVariants.Variant variants = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.VersionVariants.VariantOrBuilder>
      getVariantsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of flow version variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.VersionVariants.Variant variants = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.VersionVariants.VariantOrBuilder getVariantsOrBuilder(
      int index);
}
