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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface AlloyDbSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.AlloyDbSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Input only. Initial user to setup during cluster creation.
   * Required.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.UserPassword initial_user = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the initialUser field is set.
   */
  boolean hasInitialUser();
  /**
   *
   *
   * <pre>
   * Required. Input only. Initial user to setup during cluster creation.
   * Required.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.UserPassword initial_user = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The initialUser.
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.UserPassword getInitialUser();
  /**
   *
   *
   * <pre>
   * Required. Input only. Initial user to setup during cluster creation.
   * Required.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.UserPassword initial_user = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.UserPasswordOrBuilder getInitialUserOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource link for the VPC network in which cluster resources
   * are created and from which they are accessible via Private IP. The network
   * must belong to the same project as the cluster. It is specified in the
   * form: "projects/{project_number}/global/networks/{network_id}". This is
   * required to create a cluster.
   * </pre>
   *
   * <code>string vpc_network = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vpcNetwork.
   */
  java.lang.String getVpcNetwork();
  /**
   *
   *
   * <pre>
   * Required. The resource link for the VPC network in which cluster resources
   * are created and from which they are accessible via Private IP. The network
   * must belong to the same project as the cluster. It is specified in the
   * form: "projects/{project_number}/global/networks/{network_id}". This is
   * required to create a cluster.
   * </pre>
   *
   * <code>string vpc_network = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vpcNetwork.
   */
  com.google.protobuf.ByteString getVpcNetworkBytes();

  /**
   *
   *
   * <pre>
   * Labels for the AlloyDB cluster created by DMS. An object containing a list
   * of 'key', 'value' pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for the AlloyDB cluster created by DMS. An object containing a list
   * of 'key', 'value' pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for the AlloyDB cluster created by DMS. An object containing a list
   * of 'key', 'value' pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for the AlloyDB cluster created by DMS. An object containing a list
   * of 'key', 'value' pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for the AlloyDB cluster created by DMS. An object containing a list
   * of 'key', 'value' pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.PrimaryInstanceSettings primary_instance_settings = 4;
   * </code>
   *
   * @return Whether the primaryInstanceSettings field is set.
   */
  boolean hasPrimaryInstanceSettings();
  /**
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.PrimaryInstanceSettings primary_instance_settings = 4;
   * </code>
   *
   * @return The primaryInstanceSettings.
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.PrimaryInstanceSettings getPrimaryInstanceSettings();
  /**
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.PrimaryInstanceSettings primary_instance_settings = 4;
   * </code>
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.PrimaryInstanceSettingsOrBuilder
      getPrimaryInstanceSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the data disks
   * and other persistent data resources of a cluster with a
   * customer-managed encryption key (CMEK). When this field is not
   * specified, the cluster will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AlloyDbSettings.EncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.AlloyDbSettings.EncryptionConfigOrBuilder
      getEncryptionConfigOrBuilder();
}
