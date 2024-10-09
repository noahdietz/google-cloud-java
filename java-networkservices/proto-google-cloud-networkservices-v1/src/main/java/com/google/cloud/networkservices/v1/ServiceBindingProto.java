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
// source: google/cloud/networkservices/v1/service_binding.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

public final class ServiceBindingProto {
  private ServiceBindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_ServiceBinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_ServiceBinding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_ServiceBinding_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_ServiceBinding_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_ListServiceBindingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_ListServiceBindingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_ListServiceBindingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_ListServiceBindingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_GetServiceBindingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_GetServiceBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkservices_v1_DeleteServiceBindingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1_DeleteServiceBindingRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/networkservices/v1/servic"
          + "e_binding.proto\022\037google.cloud.networkser"
          + "vices.v1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\277\003\n\016ServiceBinding"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\030\n\013description\030\002 \001(\t"
          + "B\003\340A\001\0224\n\013create_time\030\003 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022\024\n\007ser"
          + "vice\030\005 \001(\tB\003\340A\002\022P\n\006labels\030\007 \003(\0132;.google"
          + ".cloud.networkservices.v1.ServiceBinding"
          + ".LabelsEntryB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:}\352Az\n-networkse"
          + "rvices.googleapis.com/ServiceBinding\022Ipr"
          + "ojects/{project}/locations/{location}/se"
          + "rviceBindings/{service_binding}\"\212\001\n\032List"
          + "ServiceBindingsRequest\022E\n\006parent\030\001 \001(\tB5"
          + "\340A\002\372A/\022-networkservices.googleapis.com/S"
          + "erviceBinding\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\"\201\001\n\033ListServiceBindingsResp"
          + "onse\022I\n\020service_bindings\030\001 \003(\0132/.google."
          + "cloud.networkservices.v1.ServiceBinding\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"_\n\030GetServiceBi"
          + "ndingRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-netw"
          + "orkservices.googleapis.com/ServiceBindin"
          + "g\"\324\001\n\033CreateServiceBindingRequest\022E\n\006par"
          + "ent\030\001 \001(\tB5\340A\002\372A/\022-networkservices.googl"
          + "eapis.com/ServiceBinding\022\037\n\022service_bind"
          + "ing_id\030\002 \001(\tB\003\340A\002\022M\n\017service_binding\030\003 \001"
          + "(\0132/.google.cloud.networkservices.v1.Ser"
          + "viceBindingB\003\340A\002\"b\n\033DeleteServiceBinding"
          + "Request\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-networkse"
          + "rvices.googleapis.com/ServiceBindingB\364\001\n"
          + "#com.google.cloud.networkservices.v1B\023Se"
          + "rviceBindingProtoP\001ZMcloud.google.com/go"
          + "/networkservices/apiv1/networkservicespb"
          + ";networkservicespb\252\002\037Google.Cloud.Networ"
          + "kServices.V1\312\002\037Google\\Cloud\\NetworkServi"
          + "ces\\V1\352\002\"Google::Cloud::NetworkServices:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkservices_v1_ServiceBinding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkservices_v1_ServiceBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_ServiceBinding_descriptor,
            new java.lang.String[] {
              "Name", "Description", "CreateTime", "UpdateTime", "Service", "Labels",
            });
    internal_static_google_cloud_networkservices_v1_ServiceBinding_LabelsEntry_descriptor =
        internal_static_google_cloud_networkservices_v1_ServiceBinding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networkservices_v1_ServiceBinding_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_ServiceBinding_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networkservices_v1_ListServiceBindingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkservices_v1_ListServiceBindingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_ListServiceBindingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_networkservices_v1_ListServiceBindingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkservices_v1_ListServiceBindingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_ListServiceBindingsResponse_descriptor,
            new java.lang.String[] {
              "ServiceBindings", "NextPageToken",
            });
    internal_static_google_cloud_networkservices_v1_GetServiceBindingRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkservices_v1_GetServiceBindingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_GetServiceBindingRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_CreateServiceBindingRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServiceBindingId", "ServiceBinding",
            });
    internal_static_google_cloud_networkservices_v1_DeleteServiceBindingRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkservices_v1_DeleteServiceBindingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkservices_v1_DeleteServiceBindingRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
