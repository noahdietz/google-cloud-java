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
// source: google/cloud/discoveryengine/v1alpha/project.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public final class ProjectProto {
  private ProjectProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Project_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTerms_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTerms_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTermsMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTermsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/discoveryengine/v1alpha/p"
          + "roject.proto\022$google.cloud.discoveryengi"
          + "ne.v1alpha\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\354\005\n\007Project\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\022B\n\031provisio"
          + "n_completion_time\030\003 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\022b\n\021service_terms_map\030\004 "
          + "\003(\0132B.google.cloud.discoveryengine.v1alp"
          + "ha.Project.ServiceTermsMapEntryB\003\340A\003\032\272\002\n"
          + "\014ServiceTerms\022\n\n\002id\030\001 \001(\t\022\017\n\007version\030\002 \001"
          + "(\t\022O\n\005state\030\004 \001(\0162@.google.cloud.discove"
          + "ryengine.v1alpha.Project.ServiceTerms.St"
          + "ate\022/\n\013accept_time\030\005 \001(\0132\032.google.protob"
          + "uf.Timestamp\0220\n\014decline_time\030\006 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"Y\n\005State\022\025\n\021STATE"
          + "_UNSPECIFIED\020\000\022\022\n\016TERMS_ACCEPTED\020\001\022\021\n\rTE"
          + "RMS_PENDING\020\002\022\022\n\016TERMS_DECLINED\020\003\032r\n\024Ser"
          + "viceTermsMapEntry\022\013\n\003key\030\001 \001(\t\022I\n\005value\030"
          + "\002 \001(\0132:.google.cloud.discoveryengine.v1a"
          + "lpha.Project.ServiceTerms:\0028\001:?\352A<\n&disc"
          + "overyengine.googleapis.com/Project\022\022proj"
          + "ects/{project}B\230\002\n(com.google.cloud.disc"
          + "overyengine.v1alphaB\014ProjectProtoP\001ZRclo"
          + "ud.google.com/go/discoveryengine/apiv1al"
          + "pha/discoveryenginepb;discoveryenginepb\242"
          + "\002\017DISCOVERYENGINE\252\002$Google.Cloud.Discove"
          + "ryEngine.V1Alpha\312\002$Google\\Cloud\\Discover"
          + "yEngine\\V1alpha\352\002\'Google::Cloud::Discove"
          + "ryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Project_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Project_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Project_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "ProvisionCompletionTime", "ServiceTermsMap",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTerms_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Project_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTerms_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTerms_descriptor,
            new java.lang.String[] {
              "Id", "Version", "State", "AcceptTime", "DeclineTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTermsMapEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Project_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTermsMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Project_ServiceTermsMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
