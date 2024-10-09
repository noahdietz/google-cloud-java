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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface ViewEntityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ViewEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The SQL code which creates the view.
   * </pre>
   *
   * <code>string sql_code = 1;</code>
   *
   * @return The sqlCode.
   */
  java.lang.String getSqlCode();
  /**
   *
   *
   * <pre>
   * The SQL code which creates the view.
   * </pre>
   *
   * <code>string sql_code = 1;</code>
   *
   * @return The bytes for sqlCode.
   */
  com.google.protobuf.ByteString getSqlCodeBytes();

  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   *
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   *
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();

  /**
   *
   *
   * <pre>
   * View constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.ConstraintEntity constraints = 3;</code>
   */
  java.util.List<com.google.cloud.clouddms.v1.ConstraintEntity> getConstraintsList();
  /**
   *
   *
   * <pre>
   * View constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.ConstraintEntity constraints = 3;</code>
   */
  com.google.cloud.clouddms.v1.ConstraintEntity getConstraints(int index);
  /**
   *
   *
   * <pre>
   * View constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.ConstraintEntity constraints = 3;</code>
   */
  int getConstraintsCount();
  /**
   *
   *
   * <pre>
   * View constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.ConstraintEntity constraints = 3;</code>
   */
  java.util.List<? extends com.google.cloud.clouddms.v1.ConstraintEntityOrBuilder>
      getConstraintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * View constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.ConstraintEntity constraints = 3;</code>
   */
  com.google.cloud.clouddms.v1.ConstraintEntityOrBuilder getConstraintsOrBuilder(int index);
}
