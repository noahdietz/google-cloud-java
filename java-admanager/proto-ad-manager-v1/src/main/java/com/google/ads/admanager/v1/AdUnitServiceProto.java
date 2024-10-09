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
// source: google/ads/admanager/v1/ad_unit_service.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class AdUnitServiceProto {
  private AdUnitServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetAdUnitRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetAdUnitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListAdUnitsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListAdUnitsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListAdUnitsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListAdUnitsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListAdUnitSizesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListAdUnitSizesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListAdUnitSizesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListAdUnitSizesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/admanager/v1/ad_unit_servic"
          + "e.proto\022\027google.ads.admanager.v1\032.google"
          + "/ads/admanager/v1/ad_unit_messages.proto"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\"I\n\020G"
          + "etAdUnitRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037a"
          + "dmanager.googleapis.com/AdUnit\"\276\001\n\022ListA"
          + "dUnitsRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n a"
          + "dmanager.googleapis.com/Network\022\026\n\tpage_"
          + "size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001"
          + "\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB"
          + "\003\340A\001\022\021\n\004skip\030\006 \001(\005B\003\340A\001\"u\n\023ListAdUnitsRe"
          + "sponse\0221\n\010ad_units\030\001 \003(\0132\037.google.ads.ad"
          + "manager.v1.AdUnit\022\027\n\017next_page_token\030\002 \001"
          + "(\t\022\022\n\ntotal_size\030\003 \001(\005\"\302\001\n\026ListAdUnitSiz"
          + "esRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n adman"
          + "ager.googleapis.com/Network\022\026\n\tpage_size"
          + "\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006"
          + "filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001"
          + "\022\021\n\004skip\030\006 \001(\005B\003\340A\001\"\202\001\n\027ListAdUnitSizesR"
          + "esponse\022:\n\rad_unit_sizes\030\001 \003(\0132#.google."
          + "ads.admanager.v1.AdUnitSize\022\027\n\017next_page"
          + "_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\200\004\n\rAdU"
          + "nitService\022\207\001\n\tGetAdUnit\022).google.ads.ad"
          + "manager.v1.GetAdUnitRequest\032\037.google.ads"
          + ".admanager.v1.AdUnit\".\332A\004name\202\323\344\223\002!\022\037/v1"
          + "/{name=networks/*/adUnits/*}\022\232\001\n\013ListAdU"
          + "nits\022+.google.ads.admanager.v1.ListAdUni"
          + "tsRequest\032,.google.ads.admanager.v1.List"
          + "AdUnitsResponse\"0\332A\006parent\202\323\344\223\002!\022\037/v1/{p"
          + "arent=networks/*}/adUnits\022\252\001\n\017ListAdUnit"
          + "Sizes\022/.google.ads.admanager.v1.ListAdUn"
          + "itSizesRequest\0320.google.ads.admanager.v1"
          + ".ListAdUnitSizesResponse\"4\332A\006parent\202\323\344\223\002"
          + "%\022#/v1/{parent=networks/*}/adUnitSizes\032\033"
          + "\312A\030admanager.googleapis.comB\251\001\n\033com.goog"
          + "le.ads.admanager.v1B\022AdUnitServiceProtoP"
          + "\001Z@google.golang.org/genproto/googleapis"
          + "/ads/admanager/v1;admanager\252\002\027Google.Ads"
          + ".AdManager.V1\312\002\027Google\\Ads\\AdManager\\V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.AdUnitMessagesProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GetAdUnitRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GetAdUnitRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetAdUnitRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_ads_admanager_v1_ListAdUnitsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_ListAdUnitsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListAdUnitsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip",
            });
    internal_static_google_ads_admanager_v1_ListAdUnitsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_ListAdUnitsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListAdUnitsResponse_descriptor,
            new java.lang.String[] {
              "AdUnits", "NextPageToken", "TotalSize",
            });
    internal_static_google_ads_admanager_v1_ListAdUnitSizesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_admanager_v1_ListAdUnitSizesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListAdUnitSizesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip",
            });
    internal_static_google_ads_admanager_v1_ListAdUnitSizesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_admanager_v1_ListAdUnitSizesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListAdUnitSizesResponse_descriptor,
            new java.lang.String[] {
              "AdUnitSizes", "NextPageToken", "TotalSize",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.AdUnitMessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
