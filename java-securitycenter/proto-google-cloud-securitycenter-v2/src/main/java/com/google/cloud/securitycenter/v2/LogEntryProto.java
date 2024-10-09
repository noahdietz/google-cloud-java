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
// source: google/cloud/securitycenter/v2/log_entry.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public final class LogEntryProto {
  private LogEntryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_LogEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_LogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_CloudLoggingEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_CloudLoggingEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/securitycenter/v2/log_ent"
          + "ry.proto\022\036google.cloud.securitycenter.v2"
          + "\032\037google/protobuf/timestamp.proto\"i\n\010Log"
          + "Entry\022P\n\023cloud_logging_entry\030\001 \001(\01321.goo"
          + "gle.cloud.securitycenter.v2.CloudLogging"
          + "EntryH\000B\013\n\tlog_entry\"\201\001\n\021CloudLoggingEnt"
          + "ry\022\021\n\tinsert_id\030\001 \001(\t\022\016\n\006log_id\030\002 \001(\t\022\032\n"
          + "\022resource_container\030\003 \001(\t\022-\n\ttimestamp\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\347\001\n\"com"
          + ".google.cloud.securitycenter.v2B\rLogEntr"
          + "yProtoP\001ZJcloud.google.com/go/securityce"
          + "nter/apiv2/securitycenterpb;securitycent"
          + "erpb\252\002\036Google.Cloud.SecurityCenter.V2\312\002\036"
          + "Google\\Cloud\\SecurityCenter\\V2\352\002!Google:"
          + ":Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_LogEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_LogEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_LogEntry_descriptor,
            new java.lang.String[] {
              "CloudLoggingEntry", "LogEntry",
            });
    internal_static_google_cloud_securitycenter_v2_CloudLoggingEntry_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_CloudLoggingEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_CloudLoggingEntry_descriptor,
            new java.lang.String[] {
              "InsertId", "LogId", "ResourceContainer", "Timestamp",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
