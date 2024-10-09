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
// source: google/cloud/securitycenter/v1beta1/organization_settings.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1beta1;

public final class OrganizationSettingsOuterClass {
  private OrganizationSettingsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/securitycenter/v1beta1/or"
          + "ganization_settings.proto\022#google.cloud."
          + "securitycenter.v1beta1\032\031google/api/resou"
          + "rce.proto\"\224\004\n\024OrganizationSettings\022\014\n\004na"
          + "me\030\001 \001(\t\022\036\n\026enable_asset_discovery\030\002 \001(\010"
          + "\022n\n\026asset_discovery_config\030\003 \001(\0132N.googl"
          + "e.cloud.securitycenter.v1beta1.Organizat"
          + "ionSettings.AssetDiscoveryConfig\032\361\001\n\024Ass"
          + "etDiscoveryConfig\022\023\n\013project_ids\030\001 \003(\t\022t"
          + "\n\016inclusion_mode\030\002 \001(\0162\\.google.cloud.se"
          + "curitycenter.v1beta1.OrganizationSetting"
          + "s.AssetDiscoveryConfig.InclusionMode\"N\n\r"
          + "InclusionMode\022\036\n\032INCLUSION_MODE_UNSPECIF"
          + "IED\020\000\022\020\n\014INCLUDE_ONLY\020\001\022\013\n\007EXCLUDE\020\002:j\352A"
          + "g\n2securitycenter.googleapis.com/Organiz"
          + "ationSettings\0221organizations/{organizati"
          + "on}/organizationSettingsB|\n\'com.google.c"
          + "loud.securitycenter.v1beta1P\001ZOcloud.goo"
          + "gle.com/go/securitycenter/apiv1beta1/sec"
          + "uritycenterpb;securitycenterpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor,
            new java.lang.String[] {
              "Name", "EnableAssetDiscovery", "AssetDiscoveryConfig",
            });
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor =
        internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor,
            new java.lang.String[] {
              "ProjectIds", "InclusionMode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
