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
// source: google/ads/admanager/v1/custom_targeting_value_service.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class CustomTargetingValueServiceProto {
  private CustomTargetingValueServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetCustomTargetingValueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetCustomTargetingValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListCustomTargetingValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCustomTargetingValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListCustomTargetingValuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCustomTargetingValuesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/admanager/v1/custom_targeti"
          + "ng_value_service.proto\022\027google.ads.adman"
          + "ager.v1\032=google/ads/admanager/v1/custom_"
          + "targeting_value_messages.proto\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\"e\n\036GetCustomTa"
          + "rgetingValueRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A"
          + "/\n-admanager.googleapis.com/CustomTarget"
          + "ingValue\"\327\001\n ListCustomTargetingValuesRe"
          + "quest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+admanager"
          + ".googleapis.com/CustomTargetingKey\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001"
          + "(\tB\003\340A\001\022\021\n\004skip\030\006 \001(\005B\003\340A\001\"\240\001\n!ListCusto"
          + "mTargetingValuesResponse\022N\n\027custom_targe"
          + "ting_values\030\001 \003(\0132-.google.ads.admanager"
          + ".v1.CustomTargetingValue\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\375\003\n\033Custom"
          + "TargetingValueService\022\325\001\n\027GetCustomTarge"
          + "tingValue\0227.google.ads.admanager.v1.GetC"
          + "ustomTargetingValueRequest\032-.google.ads."
          + "admanager.v1.CustomTargetingValue\"R\332A\004na"
          + "me\202\323\344\223\002E\022C/v1/{name=networks/*/customTar"
          + "getingKeys/*/customTargetingValues/*}\022\350\001"
          + "\n\031ListCustomTargetingValues\0229.google.ads"
          + ".admanager.v1.ListCustomTargetingValuesR"
          + "equest\032:.google.ads.admanager.v1.ListCus"
          + "tomTargetingValuesResponse\"T\332A\006parent\202\323\344"
          + "\223\002E\022C/v1/{parent=networks/*/customTarget"
          + "ingKeys/*}/customTargetingValues\032\033\312A\030adm"
          + "anager.googleapis.comB\267\001\n\033com.google.ads"
          + ".admanager.v1B CustomTargetingValueServi"
          + "ceProtoP\001Z@google.golang.org/genproto/go"
          + "ogleapis/ads/admanager/v1;admanager\252\002\027Go"
          + "ogle.Ads.AdManager.V1\312\002\027Google\\Ads\\AdMan"
          + "ager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.CustomTargetingValueMessagesProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GetCustomTargetingValueRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GetCustomTargetingValueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetCustomTargetingValueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_ads_admanager_v1_ListCustomTargetingValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_ListCustomTargetingValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListCustomTargetingValuesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip",
            });
    internal_static_google_ads_admanager_v1_ListCustomTargetingValuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_ListCustomTargetingValuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListCustomTargetingValuesResponse_descriptor,
            new java.lang.String[] {
              "CustomTargetingValues", "NextPageToken", "TotalSize",
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
    com.google.ads.admanager.v1.CustomTargetingValueMessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
