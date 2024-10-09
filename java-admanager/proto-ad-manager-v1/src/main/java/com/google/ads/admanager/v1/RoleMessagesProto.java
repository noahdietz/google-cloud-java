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
// source: google/ads/admanager/v1/role_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class RoleMessagesProto {
  private RoleMessagesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_Role_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/admanager/v1/role_messages."
          + "proto\022\027google.ads.admanager.v1\032(google/a"
          + "ds/admanager/v1/role_enums.proto\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\"\233\002\n\004Role\022\021\n\004name\030\001 \001(\tB\003\340A\010"
          + "\022\024\n\007role_id\030\002 \001(\003B\003\340A\003\022\031\n\014display_name\030\003"
          + " \001(\tB\003\340A\002\022\030\n\013description\030\004 \001(\tB\003\340A\001\022\025\n\010b"
          + "uilt_in\030\005 \001(\010B\003\340A\003\022G\n\006status\030\006 \001(\01622.goo"
          + "gle.ads.admanager.v1.RoleStatusEnum.Role"
          + "StatusB\003\340A\003:U\352AR\n\035admanager.googleapis.c"
          + "om/Role\022$networks/{network_code}/roles/{"
          + "role}*\005roles2\004roleB\250\001\n\033com.google.ads.ad"
          + "manager.v1B\021RoleMessagesProtoP\001Z@google."
          + "golang.org/genproto/googleapis/ads/adman"
          + "ager/v1;admanager\252\002\027Google.Ads.AdManager"
          + ".V1\312\002\027Google\\Ads\\AdManager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.RoleEnumsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_Role_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Role_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_Role_descriptor,
            new java.lang.String[] {
              "Name", "RoleId", "DisplayName", "Description", "BuiltIn", "Status",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.RoleEnumsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
