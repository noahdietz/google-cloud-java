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
// source: google/cloud/securitycenter/v2/process.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public final class ProcessProto {
  private ProcessProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Process_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Process_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_EnvironmentVariable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_EnvironmentVariable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v2/process"
          + ".proto\022\036google.cloud.securitycenter.v2\032)"
          + "google/cloud/securitycenter/v2/file.prot"
          + "o\"\365\002\n\007Process\022\014\n\004name\030\001 \001(\t\0224\n\006binary\030\002 "
          + "\001(\0132$.google.cloud.securitycenter.v2.Fil"
          + "e\0227\n\tlibraries\030\003 \003(\0132$.google.cloud.secu"
          + "ritycenter.v2.File\0224\n\006script\030\004 \001(\0132$.goo"
          + "gle.cloud.securitycenter.v2.File\022\014\n\004args"
          + "\030\005 \003(\t\022\033\n\023arguments_truncated\030\006 \001(\010\022J\n\re"
          + "nv_variables\030\007 \003(\01323.google.cloud.securi"
          + "tycenter.v2.EnvironmentVariable\022\037\n\027env_v"
          + "ariables_truncated\030\010 \001(\010\022\013\n\003pid\030\t \001(\003\022\022\n"
          + "\nparent_pid\030\n \001(\003\"0\n\023EnvironmentVariable"
          + "\022\014\n\004name\030\001 \001(\t\022\013\n\003val\030\002 \001(\tB\346\001\n\"com.goog"
          + "le.cloud.securitycenter.v2B\014ProcessProto"
          + "P\001ZJcloud.google.com/go/securitycenter/a"
          + "piv2/securitycenterpb;securitycenterpb\252\002"
          + "\036Google.Cloud.SecurityCenter.V2\312\002\036Google"
          + "\\Cloud\\SecurityCenter\\V2\352\002!Google::Cloud"
          + "::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.securitycenter.v2.FileProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_Process_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Process_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Process_descriptor,
            new java.lang.String[] {
              "Name",
              "Binary",
              "Libraries",
              "Script",
              "Args",
              "ArgumentsTruncated",
              "EnvVariables",
              "EnvVariablesTruncated",
              "Pid",
              "ParentPid",
            });
    internal_static_google_cloud_securitycenter_v2_EnvironmentVariable_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_EnvironmentVariable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_EnvironmentVariable_descriptor,
            new java.lang.String[] {
              "Name", "Val",
            });
    com.google.cloud.securitycenter.v2.FileProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
