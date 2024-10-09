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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkehub.configmanagement.v1beta;

public interface OperatorStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.OperatorState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The semenatic version number of the operator
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The semenatic version number of the operator
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * The state of the Operator's deployment
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
   *
   * @return The enum numeric value on the wire for deploymentState.
   */
  int getDeploymentStateValue();
  /**
   *
   *
   * <pre>
   * The state of the Operator's deployment
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
   *
   * @return The deploymentState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getDeploymentState();

  /**
   *
   *
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError> getErrorsList();
  /**
   *
   *
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.InstallError getErrors(int index);
  /**
   *
   *
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder getErrorsOrBuilder(
      int index);
}
