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

public interface ConfigSyncStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.ConfigSyncState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version of ConfigSync deployed
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncVersion version = 1;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * The version of ConfigSync deployed
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncVersion version = 1;</code>
   *
   * @return The version.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncVersion getVersion();
  /**
   *
   *
   * <pre>
   * The version of ConfigSync deployed
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncVersion version = 1;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncVersionOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the deployment of ConfigSync, including the version
   * of the various Pods deployed
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSyncDeploymentState deployment_state = 2;
   * </code>
   *
   * @return Whether the deploymentState field is set.
   */
  boolean hasDeploymentState();
  /**
   *
   *
   * <pre>
   * Information about the deployment of ConfigSync, including the version
   * of the various Pods deployed
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSyncDeploymentState deployment_state = 2;
   * </code>
   *
   * @return The deploymentState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncDeploymentState getDeploymentState();
  /**
   *
   *
   * <pre>
   * Information about the deployment of ConfigSync, including the version
   * of the various Pods deployed
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.ConfigSyncDeploymentState deployment_state = 2;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncDeploymentStateOrBuilder
      getDeploymentStateOrBuilder();

  /**
   *
   *
   * <pre>
   * The state of ConfigSync's process to sync configs to a cluster
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.SyncState sync_state = 3;</code>
   *
   * @return Whether the syncState field is set.
   */
  boolean hasSyncState();
  /**
   *
   *
   * <pre>
   * The state of ConfigSync's process to sync configs to a cluster
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.SyncState sync_state = 3;</code>
   *
   * @return The syncState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.SyncState getSyncState();
  /**
   *
   *
   * <pre>
   * The state of ConfigSync's process to sync configs to a cluster
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.SyncState sync_state = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.SyncStateOrBuilder getSyncStateOrBuilder();
}
