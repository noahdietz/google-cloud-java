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
// source: google/cloud/discoveryengine/v1beta/sample_query_set_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public final class SampleQuerySetServiceProto {
  private SampleQuerySetServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetSampleQuerySetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetSampleQuerySetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQuerySetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQuerySetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQuerySetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQuerySetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQuerySetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQuerySetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/discoveryengine/v1beta/sa"
          + "mple_query_set_service.proto\022#google.clo"
          + "ud.discoveryengine.v1beta\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032:google/cloud/disco"
          + "veryengine/v1beta/sample_query_set.proto"
          + "\032\033google/protobuf/empty.proto\032 google/pr"
          + "otobuf/field_mask.proto\"_\n\030GetSampleQuer"
          + "ySetRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-disco"
          + "veryengine.googleapis.com/SampleQuerySet"
          + "\"\204\001\n\032ListSampleQuerySetsRequest\022?\n\006paren"
          + "t\030\001 \001(\tB/\340A\002\372A)\n\'discoveryengine.googlea"
          + "pis.com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\np"
          + "age_token\030\003 \001(\t\"\206\001\n\033ListSampleQuerySetsR"
          + "esponse\022N\n\021sample_query_sets\030\001 \003(\01323.goo"
          + "gle.cloud.discoveryengine.v1beta.SampleQ"
          + "uerySet\022\027\n\017next_page_token\030\002 \001(\t\"\324\001\n\033Cre"
          + "ateSampleQuerySetRequest\022?\n\006parent\030\001 \001(\t"
          + "B/\340A\002\372A)\n\'discoveryengine.googleapis.com"
          + "/Location\022R\n\020sample_query_set\030\002 \001(\01323.go"
          + "ogle.cloud.discoveryengine.v1beta.Sample"
          + "QuerySetB\003\340A\002\022 \n\023sample_query_set_id\030\003 \001"
          + "(\tB\003\340A\002\"\242\001\n\033UpdateSampleQuerySetRequest\022"
          + "R\n\020sample_query_set\030\001 \001(\01323.google.cloud"
          + ".discoveryengine.v1beta.SampleQuerySetB\003"
          + "\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.protob"
          + "uf.FieldMask\"b\n\033DeleteSampleQuerySetRequ"
          + "est\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-discoveryengi"
          + "ne.googleapis.com/SampleQuerySet2\202\n\n\025Sam"
          + "pleQuerySetService\022\317\001\n\021GetSampleQuerySet"
          + "\022=.google.cloud.discoveryengine.v1beta.G"
          + "etSampleQuerySetRequest\0323.google.cloud.d"
          + "iscoveryengine.v1beta.SampleQuerySet\"F\332A"
          + "\004name\202\323\344\223\0029\0227/v1beta/{name=projects/*/lo"
          + "cations/*/sampleQuerySets/*}\022\342\001\n\023ListSam"
          + "pleQuerySets\022?.google.cloud.discoveryeng"
          + "ine.v1beta.ListSampleQuerySetsRequest\032@."
          + "google.cloud.discoveryengine.v1beta.List"
          + "SampleQuerySetsResponse\"H\332A\006parent\202\323\344\223\0029"
          + "\0227/v1beta/{parent=projects/*/locations/*"
          + "}/sampleQuerySets\022\216\002\n\024CreateSampleQueryS"
          + "et\022@.google.cloud.discoveryengine.v1beta"
          + ".CreateSampleQuerySetRequest\0323.google.cl"
          + "oud.discoveryengine.v1beta.SampleQuerySe"
          + "t\"\177\332A+parent,sample_query_set,sample_que"
          + "ry_set_id\202\323\344\223\002K\"7/v1beta/{parent=project"
          + "s/*/locations/*}/sampleQuerySets:\020sample"
          + "_query_set\022\221\002\n\024UpdateSampleQuerySet\022@.go"
          + "ogle.cloud.discoveryengine.v1beta.Update"
          + "SampleQuerySetRequest\0323.google.cloud.dis"
          + "coveryengine.v1beta.SampleQuerySet\"\201\001\332A\034"
          + "sample_query_set,update_mask\202\323\344\223\002\\2H/v1b"
          + "eta/{sample_query_set.name=projects/*/lo"
          + "cations/*/sampleQuerySets/*}:\020sample_que"
          + "ry_set\022\270\001\n\024DeleteSampleQuerySet\022@.google"
          + ".cloud.discoveryengine.v1beta.DeleteSamp"
          + "leQuerySetRequest\032\026.google.protobuf.Empt"
          + "y\"F\332A\004name\202\323\344\223\0029*7/v1beta/{name=projects"
          + "/*/locations/*/sampleQuerySets/*}\032R\312A\036di"
          + "scoveryengine.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\241\002"
          + "\n\'com.google.cloud.discoveryengine.v1bet"
          + "aB\032SampleQuerySetServiceProtoP\001ZQcloud.g"
          + "oogle.com/go/discoveryengine/apiv1beta/d"
          + "iscoveryenginepb;discoveryenginepb\242\002\017DIS"
          + "COVERYENGINE\252\002#Google.Cloud.DiscoveryEng"
          + "ine.V1Beta\312\002#Google\\Cloud\\DiscoveryEngin"
          + "e\\V1beta\352\002&Google::Cloud::DiscoveryEngin"
          + "e::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SampleQuerySetProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetSampleQuerySetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_GetSampleQuerySetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetSampleQuerySetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSampleQuerySetsResponse_descriptor,
            new java.lang.String[] {
              "SampleQuerySets", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQuerySetRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQuerySetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQuerySetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SampleQuerySet", "SampleQuerySetId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQuerySetRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQuerySetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQuerySetRequest_descriptor,
            new java.lang.String[] {
              "SampleQuerySet", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQuerySetRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQuerySetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQuerySetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SampleQuerySetProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
