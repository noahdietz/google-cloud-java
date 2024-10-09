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
// source: google/cloud/netapp/v1/snapshot.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public final class SnapshotProto {
  private SnapshotProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Snapshot_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Snapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/netapp/v1/snapshot.proto\022"
          + "\026google.cloud.netapp.v1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032 google/protobuf/field_mask.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\227\001\n\024ListS"
          + "napshotsRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022"
          + "\036netapp.googleapis.com/Snapshot\022\021\n\tpage_"
          + "size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\020\n\010order_"
          + "by\030\004 \001(\t\022\016\n\006filter\030\005 \001(\t\"z\n\025ListSnapshot"
          + "sResponse\0223\n\tsnapshots\030\001 \003(\0132 .google.cl"
          + "oud.netapp.v1.Snapshot\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"J\n\022GetSnaps"
          + "hotRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036netapp"
          + ".googleapis.com/Snapshot\"\242\001\n\025CreateSnaps"
          + "hotRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036neta"
          + "pp.googleapis.com/Snapshot\0227\n\010snapshot\030\002"
          + " \001(\0132 .google.cloud.netapp.v1.SnapshotB\003"
          + "\340A\002\022\030\n\013snapshot_id\030\003 \001(\tB\003\340A\002\"M\n\025DeleteS"
          + "napshotRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036ne"
          + "tapp.googleapis.com/Snapshot\"\206\001\n\025UpdateS"
          + "napshotRequest\0224\n\013update_mask\030\001 \001(\0132\032.go"
          + "ogle.protobuf.FieldMaskB\003\340A\002\0227\n\010snapshot"
          + "\030\002 \001(\0132 .google.cloud.netapp.v1.Snapshot"
          + "B\003\340A\002\"\277\004\n\010Snapshot\022\021\n\004name\030\001 \001(\tB\003\340A\010\022:\n"
          + "\005state\030\002 \001(\0162&.google.cloud.netapp.v1.Sn"
          + "apshot.StateB\003\340A\003\022\032\n\rstate_details\030\003 \001(\t"
          + "B\003\340A\003\022\023\n\013description\030\004 \001(\t\022\027\n\nused_bytes"
          + "\030\005 \001(\001B\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\022<\n\006labels\030\007 \003("
          + "\0132,.google.cloud.netapp.v1.Snapshot.Labe"
          + "lsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\"l\n\005State\022\025\n\021STATE_UNSPECI"
          + "FIED\020\000\022\t\n\005READY\020\001\022\014\n\010CREATING\020\002\022\014\n\010DELET"
          + "ING\020\003\022\014\n\010UPDATING\020\004\022\014\n\010DISABLED\020\005\022\t\n\005ERR"
          + "OR\020\006:\210\001\352A\204\001\n\036netapp.googleapis.com/Snaps"
          + "hot\022Mprojects/{project}/locations/{locat"
          + "ion}/volumes/{volume}/snapshots/{snapsho"
          + "t}*\tsnapshots2\010snapshotB\257\001\n\032com.google.c"
          + "loud.netapp.v1B\rSnapshotProtoP\001Z2cloud.g"
          + "oogle.com/go/netapp/apiv1/netapppb;netap"
          + "ppb\252\002\026Google.Cloud.NetApp.V1\312\002\026Google\\Cl"
          + "oud\\NetApp\\V1\352\002\031Google::Cloud::NetApp::V"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "OrderBy", "Filter",
            });
    internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor,
            new java.lang.String[] {
              "Snapshots", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_GetSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Snapshot", "SnapshotId",
            });
    internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Snapshot",
            });
    internal_static_google_cloud_netapp_v1_Snapshot_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_Snapshot_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Snapshot_descriptor,
            new java.lang.String[] {
              "Name", "State", "StateDetails", "Description", "UsedBytes", "CreateTime", "Labels",
            });
    internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor =
        internal_static_google_cloud_netapp_v1_Snapshot_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
