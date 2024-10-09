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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vmmigration.v1;

public interface DatacenterConnectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.DatacenterConnector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The time the connector was created (as an API call, not when
   * it was actually installed).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the connector was created (as an API call, not when
   * it was actually installed).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the connector was created (as an API call, not when
   * it was actually installed).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last time the connector was updated with an API call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the connector was updated with an API call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the connector was updated with an API call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The connector's name.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The connector's name.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. A unique key for this connector. This key is internal to the OVA
   * connector and is supplied with its creation during the registration process
   * and can not be modified.
   * </pre>
   *
   * <code>string registration_id = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The registrationId.
   */
  java.lang.String getRegistrationId();
  /**
   *
   *
   * <pre>
   * Immutable. A unique key for this connector. This key is internal to the OVA
   * connector and is supplied with its creation during the registration process
   * and can not be modified.
   * </pre>
   *
   * <code>string registration_id = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for registrationId.
   */
  com.google.protobuf.ByteString getRegistrationIdBytes();

  /**
   *
   *
   * <pre>
   * The service account to use in the connector when communicating with the
   * cloud.
   * </pre>
   *
   * <code>string service_account = 5;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account to use in the connector when communicating with the
   * cloud.
   * </pre>
   *
   * <code>string service_account = 5;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The version running in the DatacenterConnector. This is supplied by the OVA
   * connector during the registration process and can not be modified.
   * </pre>
   *
   * <code>string version = 6;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version running in the DatacenterConnector. This is supplied by the OVA
   * connector during the registration process and can not be modified.
   * </pre>
   *
   * <code>string version = 6;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The communication channel between the datacenter connector and
   * Google Cloud.
   * </pre>
   *
   * <code>string bucket = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Output only. The communication channel between the datacenter connector and
   * Google Cloud.
   * </pre>
   *
   * <code>string bucket = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the DatacenterConnector, as determined by the health
   * checks.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.DatacenterConnector.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the DatacenterConnector, as determined by the health
   * checks.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.DatacenterConnector.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.vmmigration.v1.DatacenterConnector.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time the state was last set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the state was last set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the state was last set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Provides details on the state of the Datacenter Connector in
   * case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Provides details on the state of the Datacenter Connector in
   * case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Provides details on the state of the Datacenter Connector in
   * case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Appliance OVA version.
   * This is the OVA which is manually installed by the user and contains the
   * infrastructure for the automatically updatable components on the appliance.
   * </pre>
   *
   * <code>
   * string appliance_infrastructure_version = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The applianceInfrastructureVersion.
   */
  java.lang.String getApplianceInfrastructureVersion();
  /**
   *
   *
   * <pre>
   * Output only. Appliance OVA version.
   * This is the OVA which is manually installed by the user and contains the
   * infrastructure for the automatically updatable components on the appliance.
   * </pre>
   *
   * <code>
   * string appliance_infrastructure_version = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for applianceInfrastructureVersion.
   */
  com.google.protobuf.ByteString getApplianceInfrastructureVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Appliance last installed update bundle version.
   * This is the version of the automatically updatable components on the
   * appliance.
   * </pre>
   *
   * <code>string appliance_software_version = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The applianceSoftwareVersion.
   */
  java.lang.String getApplianceSoftwareVersion();
  /**
   *
   *
   * <pre>
   * Output only. Appliance last installed update bundle version.
   * This is the version of the automatically updatable components on the
   * appliance.
   * </pre>
   *
   * <code>string appliance_software_version = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for applianceSoftwareVersion.
   */
  com.google.protobuf.ByteString getApplianceSoftwareVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The available versions for updating this appliance.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.AvailableUpdates available_versions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the availableVersions field is set.
   */
  boolean hasAvailableVersions();
  /**
   *
   *
   * <pre>
   * Output only. The available versions for updating this appliance.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.AvailableUpdates available_versions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The availableVersions.
   */
  com.google.cloud.vmmigration.v1.AvailableUpdates getAvailableVersions();
  /**
   *
   *
   * <pre>
   * Output only. The available versions for updating this appliance.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.AvailableUpdates available_versions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmmigration.v1.AvailableUpdatesOrBuilder getAvailableVersionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The status of the current / last upgradeAppliance operation.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.UpgradeStatus upgrade_status = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the upgradeStatus field is set.
   */
  boolean hasUpgradeStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the current / last upgradeAppliance operation.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.UpgradeStatus upgrade_status = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The upgradeStatus.
   */
  com.google.cloud.vmmigration.v1.UpgradeStatus getUpgradeStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the current / last upgradeAppliance operation.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.UpgradeStatus upgrade_status = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmmigration.v1.UpgradeStatusOrBuilder getUpgradeStatusOrBuilder();
}
