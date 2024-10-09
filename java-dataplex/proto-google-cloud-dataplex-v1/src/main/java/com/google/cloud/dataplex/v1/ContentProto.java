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
// source: google/cloud/dataplex/v1/content.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreateContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeleteContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListContentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dataplex/v1/content.proto"
          + "\022\030google.cloud.dataplex.v1\032\034google/api/a"
          + "nnotations.proto\032\027google/api/client.prot"
          + "o\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032&google/cloud/data"
          + "plex/v1/analyze.proto\032\036google/iam/v1/iam"
          + "_policy.proto\032\032google/iam/v1/policy.prot"
          + "o\032\033google/protobuf/empty.proto\032 google/p"
          + "rotobuf/field_mask.proto\"\241\001\n\024CreateConte"
          + "ntRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034datap"
          + "lex.googleapis.com/Lake\0227\n\007content\030\002 \001(\013"
          + "2!.google.cloud.dataplex.v1.ContentB\003\340A\002"
          + "\022\032\n\rvalidate_only\030\003 \001(\010B\003\340A\001\"\241\001\n\024UpdateC"
          + "ontentRequest\0224\n\013update_mask\030\001 \001(\0132\032.goo"
          + "gle.protobuf.FieldMaskB\003\340A\002\0227\n\007content\030\002"
          + " \001(\0132!.google.cloud.dataplex.v1.ContentB"
          + "\003\340A\002\022\032\n\rvalidate_only\030\003 \001(\010B\003\340A\001\"M\n\024Dele"
          + "teContentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037"
          + "dataplex.googleapis.com/Content\"\220\001\n\022List"
          + "ContentRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034"
          + "dataplex.googleapis.com/Lake\022\026\n\tpage_siz"
          + "e\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\"b\n\023ListContentRespons"
          + "e\0222\n\007content\030\001 \003(\0132!.google.cloud.datapl"
          + "ex.v1.Content\022\027\n\017next_page_token\030\002 \001(\t\"\330"
          + "\001\n\021GetContentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372"
          + "A!\n\037dataplex.googleapis.com/Content\022J\n\004v"
          + "iew\030\002 \001(\01627.google.cloud.dataplex.v1.Get"
          + "ContentRequest.ContentViewB\003\340A\001\"@\n\013Conte"
          + "ntView\022\034\n\030CONTENT_VIEW_UNSPECIFIED\020\000\022\t\n\005"
          + "BASIC\020\001\022\010\n\004FULL\020\0022\255\020\n\016ContentService\022\200\002\n"
          + "\rCreateContent\022..google.cloud.dataplex.v"
          + "1.CreateContentRequest\032!.google.cloud.da"
          + "taplex.v1.Content\"\233\001\332A\016parent,content\202\323\344"
          + "\223\002\203\001\"8/v1/{parent=projects/*/locations/*"
          + "/lakes/*}/contentitems:\007contentZ>\"3/v1/{"
          + "parent=projects/*/locations/*/lakes/*}/c"
          + "ontent:\007content\022\227\002\n\rUpdateContent\022..goog"
          + "le.cloud.dataplex.v1.UpdateContentReques"
          + "t\032!.google.cloud.dataplex.v1.Content\"\262\001\332"
          + "A\023content,update_mask\202\323\344\223\002\225\0012A/v1/{conte"
          + "nt.name=projects/*/locations/*/lakes/*/c"
          + "ontentitems/**}:\007contentZG2</v1/{content"
          + ".name=projects/*/locations/*/lakes/*/con"
          + "tent/**}:\007content\022\332\001\n\rDeleteContent\022..go"
          + "ogle.cloud.dataplex.v1.DeleteContentRequ"
          + "est\032\026.google.protobuf.Empty\"\200\001\332A\004name\202\323\344"
          + "\223\002s*9/v1/{name=projects/*/locations/*/la"
          + "kes/*/contentitems/**}Z6*4/v1/{name=proj"
          + "ects/*/locations/*/lakes/*/content/**}\022\337"
          + "\001\n\nGetContent\022+.google.cloud.dataplex.v1"
          + ".GetContentRequest\032!.google.cloud.datapl"
          + "ex.v1.Content\"\200\001\332A\004name\202\323\344\223\002s\0229/v1/{name"
          + "=projects/*/locations/*/lakes/*/contenti"
          + "tems/**}Z6\0224/v1/{name=projects/*/locatio"
          + "ns/*/lakes/*/content/**}\022\363\001\n\014GetIamPolic"
          + "y\022\".google.iam.v1.GetIamPolicyRequest\032\025."
          + "google.iam.v1.Policy\"\247\001\332A\010resource\202\323\344\223\002\225"
          + "\001\022J/v1/{resource=projects/*/locations/*/"
          + "lakes/*/contentitems/**}:getIamPolicyZG\022"
          + "E/v1/{resource=projects/*/locations/*/la"
          + "kes/*/content/**}:getIamPolicy\022\356\001\n\014SetIa"
          + "mPolicy\022\".google.iam.v1.SetIamPolicyRequ"
          + "est\032\025.google.iam.v1.Policy\"\242\001\202\323\344\223\002\233\001\"J/v"
          + "1/{resource=projects/*/locations/*/lakes"
          + "/*/contentitems/**}:setIamPolicy:\001*ZJ\"E/"
          + "v1/{resource=projects/*/locations/*/lake"
          + "s/*/content/**}:setIamPolicy:\001*\022\232\002\n\022Test"
          + "IamPermissions\022(.google.iam.v1.TestIamPe"
          + "rmissionsRequest\032).google.iam.v1.TestIam"
          + "PermissionsResponse\"\256\001\202\323\344\223\002\247\001\"P/v1/{reso"
          + "urce=projects/*/locations/*/lakes/*/cont"
          + "entitems/**}:testIamPermissions:\001*ZP\"K/v"
          + "1/{resource=projects/*/locations/*/lakes"
          + "/*/content/**}:testIamPermissions:\001*\022\355\001\n"
          + "\013ListContent\022,.google.cloud.dataplex.v1."
          + "ListContentRequest\032-.google.cloud.datapl"
          + "ex.v1.ListContentResponse\"\200\001\332A\006parent\202\323\344"
          + "\223\002q\0228/v1/{parent=projects/*/locations/*/"
          + "lakes/*}/contentitemsZ5\0223/v1/{parent=pro"
          + "jects/*/locations/*/lakes/*}/content\032K\312A"
          + "\027dataplex.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformBh\n\034com"
          + ".google.cloud.dataplex.v1B\014ContentProtoP"
          + "\001Z8cloud.google.com/go/dataplex/apiv1/da"
          + "taplexpb;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.AnalyzeProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_CreateContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_CreateContentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Content", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Content", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DeleteContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DeleteContentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_ListContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListContentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_ListContentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListContentResponse_descriptor,
            new java.lang.String[] {
              "Content", "NextPageToken",
            });
    internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
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
    com.google.cloud.dataplex.v1.AnalyzeProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
