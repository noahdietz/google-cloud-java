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
// source: google/cloud/discoveryengine/v1alpha/acl_config_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class AclConfigServiceProto {
  private AclConfigServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetAclConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetAclConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateAclConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateAclConfigRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/discoveryengine/v1alpha/a"
          + "cl_config_service.proto\022$google.cloud.di"
          + "scoveryengine.v1alpha\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\0325google/cloud/discovery"
          + "engine/v1alpha/acl_config.proto\"U\n\023GetAc"
          + "lConfigRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(di"
          + "scoveryengine.googleapis.com/AclConfig\"b"
          + "\n\026UpdateAclConfigRequest\022H\n\nacl_config\030\001"
          + " \001(\0132/.google.cloud.discoveryengine.v1al"
          + "pha.AclConfigB\003\340A\0022\370\003\n\020AclConfigService\022"
          + "\321\001\n\017UpdateAclConfig\022<.google.cloud.disco"
          + "veryengine.v1alpha.UpdateAclConfigReques"
          + "t\032/.google.cloud.discoveryengine.v1alpha"
          + ".AclConfig\"O\202\323\344\223\002I2;/v1alpha/{acl_config"
          + ".name=projects/*/locations/*/aclConfig}:"
          + "\nacl_config\022\273\001\n\014GetAclConfig\0229.google.cl"
          + "oud.discoveryengine.v1alpha.GetAclConfig"
          + "Request\032/.google.cloud.discoveryengine.v"
          + "1alpha.AclConfig\"?\332A\004name\202\323\344\223\0022\0220/v1alph"
          + "a/{name=projects/*/locations/*/aclConfig"
          + "}\032R\312A\036discoveryengine.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformB\241\002\n(com.google.cloud.discoveryengi"
          + "ne.v1alphaB\025AclConfigServiceProtoP\001ZRclo"
          + "ud.google.com/go/discoveryengine/apiv1al"
          + "pha/discoveryenginepb;discoveryenginepb\242"
          + "\002\017DISCOVERYENGINE\252\002$Google.Cloud.Discove"
          + "ryEngine.V1Alpha\312\002$Google\\Cloud\\Discover"
          + "yEngine\\V1alpha\352\002\'Google::Cloud::Discove"
          + "ryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.AclConfigProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetAclConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GetAclConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetAclConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateAclConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateAclConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateAclConfigRequest_descriptor,
            new java.lang.String[] {
              "AclConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.AclConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
