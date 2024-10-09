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
// source: google/cloud/run/v2/task_template.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

public final class TaskTemplateProto {
  private TaskTemplateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_TaskTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TaskTemplate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/run/v2/task_template.prot"
          + "o\022\023google.cloud.run.v2\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032!google/cloud/run/v2/k8s.min.proto\032)g"
          + "oogle/cloud/run/v2/vendor_settings.proto"
          + "\032\036google/protobuf/duration.proto\"\256\003\n\014Tas"
          + "kTemplate\0222\n\ncontainers\030\001 \003(\0132\036.google.c"
          + "loud.run.v2.Container\0221\n\007volumes\030\002 \003(\0132\033"
          + ".google.cloud.run.v2.VolumeB\003\340A\001\022\025\n\013max_"
          + "retries\030\003 \001(\005H\000\022/\n\007timeout\030\004 \001(\0132\031.googl"
          + "e.protobuf.DurationB\003\340A\001\022\034\n\017service_acco"
          + "unt\030\005 \001(\tB\003\340A\001\022M\n\025execution_environment\030"
          + "\006 \001(\0162).google.cloud.run.v2.ExecutionEnv"
          + "ironmentB\003\340A\001\022>\n\016encryption_key\030\007 \001(\tB&\372"
          + "A#\n!cloudkms.googleapis.com/CryptoKey\0227\n"
          + "\nvpc_access\030\010 \001(\0132\036.google.cloud.run.v2."
          + "VpcAccessB\003\340A\001B\t\n\007retriesBY\n\027com.google."
          + "cloud.run.v2B\021TaskTemplateProtoP\001Z)cloud"
          + ".google.com/go/run/apiv2/runpb;runpbb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.run.v2.K8sMinProto.getDescriptor(),
              com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_TaskTemplate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_TaskTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_TaskTemplate_descriptor,
            new java.lang.String[] {
              "Containers",
              "Volumes",
              "MaxRetries",
              "Timeout",
              "ServiceAccount",
              "ExecutionEnvironment",
              "EncryptionKey",
              "VpcAccess",
              "Retries",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.K8sMinProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
