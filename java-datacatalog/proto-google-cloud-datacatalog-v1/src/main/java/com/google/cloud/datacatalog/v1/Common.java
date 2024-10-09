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
// source: google/cloud/datacatalog/v1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_PersonalDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/datacatalog/v1/common.pro"
          + "to\022\033google.cloud.datacatalog.v1\032\037google/"
          + "protobuf/timestamp.proto\"Q\n\017PersonalDeta"
          + "ils\022\017\n\007starred\030\001 \001(\010\022-\n\tstar_time\030\002 \001(\0132"
          + "\032.google.protobuf.Timestamp*\314\001\n\020Integrat"
          + "edSystem\022!\n\035INTEGRATED_SYSTEM_UNSPECIFIE"
          + "D\020\000\022\014\n\010BIGQUERY\020\001\022\020\n\014CLOUD_PUBSUB\020\002\022\026\n\022D"
          + "ATAPROC_METASTORE\020\003\022\014\n\010DATAPLEX\020\004\022\021\n\rCLO"
          + "UD_SPANNER\020\006\022\022\n\016CLOUD_BIGTABLE\020\007\022\r\n\tCLOU"
          + "D_SQL\020\010\022\n\n\006LOOKER\020\t\022\r\n\tVERTEX_AI\020\n*j\n\016Ma"
          + "nagingSystem\022\037\n\033MANAGING_SYSTEM_UNSPECIF"
          + "IED\020\000\022\034\n\030MANAGING_SYSTEM_DATAPLEX\020\001\022\031\n\025M"
          + "ANAGING_SYSTEM_OTHER\020\002B\306\001\n\037com.google.cl"
          + "oud.datacatalog.v1P\001ZAcloud.google.com/g"
          + "o/datacatalog/apiv1/datacatalogpb;dataca"
          + "talogpb\370\001\001\252\002\033Google.Cloud.DataCatalog.V1"
          + "\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google:"
          + ":Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_PersonalDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_PersonalDetails_descriptor,
            new java.lang.String[] {
              "Starred", "StarTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
