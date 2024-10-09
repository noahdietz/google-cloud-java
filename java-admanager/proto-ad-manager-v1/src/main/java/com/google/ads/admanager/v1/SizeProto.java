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
// source: google/ads/admanager/v1/size.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public final class SizeProto {
  private SizeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_Size_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Size_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/ads/admanager/v1/size.proto\022\027go"
          + "ogle.ads.admanager.v1\032,google/ads/admana"
          + "ger/v1/size_type_enum.proto\032\037google/api/"
          + "field_behavior.proto\"w\n\004Size\022\022\n\005width\030\001 "
          + "\001(\005B\003\340A\002\022\023\n\006height\030\002 \001(\005B\003\340A\002\022F\n\tsize_ty"
          + "pe\030\003 \001(\0162..google.ads.admanager.v1.SizeT"
          + "ypeEnum.SizeTypeB\003\340A\002B\240\001\n\033com.google.ads"
          + ".admanager.v1B\tSizeProtoP\001Z@google.golan"
          + "g.org/genproto/googleapis/ads/admanager/"
          + "v1;admanager\252\002\027Google.Ads.AdManager.V1\312\002"
          + "\027Google\\Ads\\AdManager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.SizeTypeEnumProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_Size_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Size_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_Size_descriptor,
            new java.lang.String[] {
              "Width", "Height", "SizeType",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.SizeTypeEnumProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
