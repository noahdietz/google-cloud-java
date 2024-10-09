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
// source: google/cloud/recommender/v1/insight_type_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.recommender.v1;

public final class InsightTypeConfigProto {
  private InsightTypeConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_InsightTypeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_InsightTypeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_InsightTypeConfig_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_InsightTypeConfig_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_InsightTypeGenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_InsightTypeGenerationConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/recommender/v1/insight_ty"
          + "pe_config.proto\022\033google.cloud.recommende"
          + "r.v1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032\034google/protobu"
          + "f/struct.proto\032\037google/protobuf/timestam"
          + "p.proto\"\261\005\n\021InsightTypeConfig\022\014\n\004name\030\001 "
          + "\001(\t\022`\n\036insight_type_generation_config\030\002 "
          + "\001(\01328.google.cloud.recommender.v1.Insigh"
          + "tTypeGenerationConfig\022\014\n\004etag\030\003 \001(\t\022/\n\013u"
          + "pdate_time\030\004 \001(\0132\032.google.protobuf.Times"
          + "tamp\022\033\n\013revision_id\030\005 \001(\tB\006\340A\005\340A\003\022T\n\013ann"
          + "otations\030\006 \003(\0132?.google.cloud.recommende"
          + "r.v1.InsightTypeConfig.AnnotationsEntry\022"
          + "\024\n\014display_name\030\007 \001(\t\0322\n\020AnnotationsEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\257\002\352A\253\002"
          + "\n,recommender.googleapis.com/InsightType"
          + "Config\022Jprojects/{project}/locations/{lo"
          + "cation}/insightTypes/{insight_type}/conf"
          + "ig\022Torganizations/{organization}/locatio"
          + "ns/{location}/insightTypes/{insight_type"
          + "}/config\022YbillingAccounts/{billing_accou"
          + "nt}/locations/{location}/insightTypes/{i"
          + "nsight_type}/config\"F\n\033InsightTypeGenera"
          + "tionConfig\022\'\n\006params\030\001 \001(\0132\027.google.prot"
          + "obuf.StructB\243\001\n\037com.google.cloud.recomme"
          + "nder.v1B\026InsightTypeConfigProtoP\001ZAcloud"
          + ".google.com/go/recommender/apiv1/recomme"
          + "nderpb;recommenderpb\242\002\004CREC\252\002\033Google.Clo"
          + "ud.Recommender.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_recommender_v1_InsightTypeConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1_InsightTypeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_InsightTypeConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "InsightTypeGenerationConfig",
              "Etag",
              "UpdateTime",
              "RevisionId",
              "Annotations",
              "DisplayName",
            });
    internal_static_google_cloud_recommender_v1_InsightTypeConfig_AnnotationsEntry_descriptor =
        internal_static_google_cloud_recommender_v1_InsightTypeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_InsightTypeConfig_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_InsightTypeConfig_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_InsightTypeGenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1_InsightTypeGenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_InsightTypeGenerationConfig_descriptor,
            new java.lang.String[] {
              "Params",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
