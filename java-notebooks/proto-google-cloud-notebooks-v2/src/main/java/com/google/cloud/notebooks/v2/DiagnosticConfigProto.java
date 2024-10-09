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
// source: google/cloud/notebooks/v2/diagnostic_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v2;

public final class DiagnosticConfigProto {
  private DiagnosticConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_DiagnosticConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_DiagnosticConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/notebooks/v2/diagnostic_c"
          + "onfig.proto\022\031google.cloud.notebooks.v2\032\037"
          + "google/api/field_behavior.proto\"\273\001\n\020Diag"
          + "nosticConfig\022\027\n\ngcs_bucket\030\001 \001(\tB\003\340A\002\022\032\n"
          + "\rrelative_path\030\002 \001(\tB\003\340A\001\022\037\n\022enable_repa"
          + "ir_flag\030\003 \001(\010B\003\340A\001\022\'\n\032enable_packet_capt"
          + "ure_flag\030\004 \001(\010B\003\340A\001\022(\n\033enable_copy_home_"
          + "files_flag\030\005 \001(\010B\003\340A\001B\314\001\n\035com.google.clo"
          + "ud.notebooks.v2B\025DiagnosticConfigProtoP\001"
          + "Z;cloud.google.com/go/notebooks/apiv2/no"
          + "tebookspb;notebookspb\252\002\031Google.Cloud.Not"
          + "ebooks.V2\312\002\031Google\\Cloud\\Notebooks\\V2\352\002\034"
          + "Google::Cloud::Notebooks::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v2_DiagnosticConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v2_DiagnosticConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_DiagnosticConfig_descriptor,
            new java.lang.String[] {
              "GcsBucket",
              "RelativePath",
              "EnableRepairFlag",
              "EnablePacketCaptureFlag",
              "EnableCopyHomeFilesFlag",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
