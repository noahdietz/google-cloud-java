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
// source: google/cloud/securitycenter/v2/notification_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public final class NotificationConfigProto {
  private NotificationConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_NotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_NotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_NotificationConfig_StreamingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_NotificationConfig_StreamingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/securitycenter/v2/notific"
          + "ation_config.proto\022\036google.cloud.securit"
          + "ycenter.v2\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\"\211\005\n\022Notif"
          + "icationConfig\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\023\n\013desc"
          + "ription\030\002 \001(\t\0226\n\014pubsub_topic\030\003 \001(\tB \372A\035"
          + "\n\033pubsub.googleapis.com/Topic\022\034\n\017service"
          + "_account\030\004 \001(\tB\003\340A\003\022^\n\020streaming_config\030"
          + "\005 \001(\0132B.google.cloud.securitycenter.v2.N"
          + "otificationConfig.StreamingConfigH\000\032!\n\017S"
          + "treamingConfig\022\016\n\006filter\030\001 \001(\t:\340\002\352A\334\002\n0s"
          + "ecuritycenter.googleapis.com/Notificatio"
          + "nConfig\022[organizations/{organization}/lo"
          + "cations/{location}/notificationConfigs/{"
          + "notification_config}\022Ofolders/{folder}/l"
          + "ocations/{location}/notificationConfigs/"
          + "{notification_config}\022Qprojects/{project"
          + "}/locations/{location}/notificationConfi"
          + "gs/{notification_config}*\023notificationCo"
          + "nfigs2\022notificationConfigB\017\n\rnotify_conf"
          + "igB\264\002\n\"com.google.cloud.securitycenter.v"
          + "2B\027NotificationConfigProtoP\001ZJcloud.goog"
          + "le.com/go/securitycenter/apiv2/securityc"
          + "enterpb;securitycenterpb\252\002\036Google.Cloud."
          + "SecurityCenter.V2\312\002\036Google\\Cloud\\Securit"
          + "yCenter\\V2\352\002!Google::Cloud::SecurityCent"
          + "er::V2\352A@\n\033pubsub.googleapis.com/Topic\022!"
          + "projects/{project}/topics/{topic}b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_NotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_NotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_NotificationConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "PubsubTopic",
              "ServiceAccount",
              "StreamingConfig",
              "NotifyConfig",
            });
    internal_static_google_cloud_securitycenter_v2_NotificationConfig_StreamingConfig_descriptor =
        internal_static_google_cloud_securitycenter_v2_NotificationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_NotificationConfig_StreamingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_NotificationConfig_StreamingConfig_descriptor,
            new java.lang.String[] {
              "Filter",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
