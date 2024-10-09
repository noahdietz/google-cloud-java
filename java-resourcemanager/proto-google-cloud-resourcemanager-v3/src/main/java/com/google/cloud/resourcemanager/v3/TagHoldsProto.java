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
// source: google/cloud/resourcemanager/v3/tag_holds.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.resourcemanager.v3;

public final class TagHoldsProto {
  private TagHoldsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_TagHold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_TagHold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagHoldRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagHoldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagHoldMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagHoldMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagHoldsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagHoldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/resourcemanager/v3/tag_ho"
          + "lds.proto\022\037google.cloud.resourcemanager."
          + "v3\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032#g"
          + "oogle/longrunning/operations.proto\032\033goog"
          + "le/protobuf/empty.proto\032\037google/protobuf"
          + "/timestamp.proto\"\361\001\n\007TagHold\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\003\022\023\n\006holder\030\002 \001(\tB\003\340A\002\022\023\n\006origin\030\003"
          + " \001(\tB\003\340A\001\022\026\n\thelp_link\030\004 \001(\tB\003\340A\001\0224\n\013cre"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003:[\352AX\n+cloudresourcemanager.googl"
          + "eapis.com/TagHold\022)tagValues/{tag_value}"
          + "/tagHolds/{tag_hold}\"\270\001\n\024CreateTagHoldRe"
          + "quest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\022+cloudreso"
          + "urcemanager.googleapis.com/TagHold\022?\n\010ta"
          + "g_hold\030\002 \001(\0132(.google.cloud.resourcemana"
          + "ger.v3.TagHoldB\003\340A\002\022\032\n\rvalidate_only\030\003 \001"
          + "(\010B\003\340A\001\"\027\n\025CreateTagHoldMetadata\"u\n\024Dele"
          + "teTagHoldRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+"
          + "cloudresourcemanager.googleapis.com/TagH"
          + "old\022\032\n\rvalidate_only\030\002 \001(\010B\003\340A\001\"\027\n\025Delet"
          + "eTagHoldMetadata\"\240\001\n\023ListTagHoldsRequest"
          + "\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\022+cloudresourcem"
          + "anager.googleapis.com/TagHold\022\026\n\tpage_si"
          + "ze\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023"
          + "\n\006filter\030\004 \001(\tB\003\340A\001\"l\n\024ListTagHoldsRespo"
          + "nse\022;\n\ttag_holds\030\001 \003(\0132(.google.cloud.re"
          + "sourcemanager.v3.TagHold\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t2\354\005\n\010TagHolds\022\317\001\n\rCreateTagHold"
          + "\0225.google.cloud.resourcemanager.v3.Creat"
          + "eTagHoldRequest\032\035.google.longrunning.Ope"
          + "ration\"h\312A \n\007TagHold\022\025CreateTagHoldMetad"
          + "ata\332A\017parent,tag_hold\202\323\344\223\002-\"!/v3/{parent"
          + "=tagValues/*}/tagHolds:\010tag_hold\022\310\001\n\rDel"
          + "eteTagHold\0225.google.cloud.resourcemanage"
          + "r.v3.DeleteTagHoldRequest\032\035.google.longr"
          + "unning.Operation\"a\312A.\n\025google.protobuf.E"
          + "mpty\022\025DeleteTagHoldMetadata\332A\004name\202\323\344\223\002#"
          + "*!/v3/{name=tagValues/*/tagHolds/*}\022\257\001\n\014"
          + "ListTagHolds\0224.google.cloud.resourcemana"
          + "ger.v3.ListTagHoldsRequest\0325.google.clou"
          + "d.resourcemanager.v3.ListTagHoldsRespons"
          + "e\"2\332A\006parent\202\323\344\223\002#\022!/v3/{parent=tagValue"
          + "s/*}/tagHolds\032\220\001\312A#cloudresourcemanager."
          + "googleapis.com\322Aghttps://www.googleapis."
          + "com/auth/cloud-platform,https://www.goog"
          + "leapis.com/auth/cloud-platform.read-only"
          + "B\356\001\n#com.google.cloud.resourcemanager.v3"
          + "B\rTagHoldsProtoP\001ZMcloud.google.com/go/r"
          + "esourcemanager/apiv3/resourcemanagerpb;r"
          + "esourcemanagerpb\252\002\037Google.Cloud.Resource"
          + "Manager.V3\312\002\037Google\\Cloud\\ResourceManage"
          + "r\\V3\352\002\"Google::Cloud::ResourceManager::V"
          + "3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_resourcemanager_v3_TagHold_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_TagHold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_TagHold_descriptor,
            new java.lang.String[] {
              "Name", "Holder", "Origin", "HelpLink", "CreateTime",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateTagHoldRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_CreateTagHoldRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagHoldRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TagHold", "ValidateOnly",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateTagHoldMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_CreateTagHoldMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagHoldMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldRequest_descriptor,
            new java.lang.String[] {
              "Name", "ValidateOnly",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagHoldMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_ListTagHoldsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_ListTagHoldsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagHoldsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagHoldsResponse_descriptor,
            new java.lang.String[] {
              "TagHolds", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
