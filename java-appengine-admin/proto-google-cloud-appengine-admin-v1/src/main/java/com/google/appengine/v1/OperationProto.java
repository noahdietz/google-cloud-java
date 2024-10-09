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
// source: google/appengine/v1/operation.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public final class OperationProto {
  private OperationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_OperationMetadataV1_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_OperationMetadataV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_CreateVersionMetadataV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/appengine/v1/operation.proto\022\023g"
          + "oogle.appengine.v1\032\037google/protobuf/time"
          + "stamp.proto\"\262\002\n\023OperationMetadataV1\022\016\n\006m"
          + "ethod\030\001 \001(\t\022/\n\013insert_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022,\n\010end_time\030\003 \001(\0132\032"
          + ".google.protobuf.Timestamp\022\014\n\004user\030\004 \001(\t"
          + "\022\016\n\006target\030\005 \001(\t\022\031\n\021ephemeral_message\030\006 "
          + "\001(\t\022\017\n\007warning\030\007 \003(\t\022O\n\027create_version_m"
          + "etadata\030\010 \001(\0132,.google.appengine.v1.Crea"
          + "teVersionMetadataV1H\000B\021\n\017method_metadata"
          + "\"1\n\027CreateVersionMetadataV1\022\026\n\016cloud_bui"
          + "ld_id\030\001 \001(\tB\277\001\n\027com.google.appengine.v1B"
          + "\016OperationProtoP\001Z;cloud.google.com/go/a"
          + "ppengine/apiv1/appenginepb;appenginepb\252\002"
          + "\031Google.Cloud.AppEngine.V1\312\002\031Google\\Clou"
          + "d\\AppEngine\\V1\352\002\034Google::Cloud::AppEngin"
          + "e::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_OperationMetadataV1_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_OperationMetadataV1_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_OperationMetadataV1_descriptor,
            new java.lang.String[] {
              "Method",
              "InsertTime",
              "EndTime",
              "User",
              "Target",
              "EphemeralMessage",
              "Warning",
              "CreateVersionMetadata",
              "MethodMetadata",
            });
    internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_CreateVersionMetadataV1_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_CreateVersionMetadataV1_descriptor,
            new java.lang.String[] {
              "CloudBuildId",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
