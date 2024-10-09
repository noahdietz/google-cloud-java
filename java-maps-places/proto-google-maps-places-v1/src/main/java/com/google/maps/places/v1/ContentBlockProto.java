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
// source: google/maps/places/v1/content_block.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public final class ContentBlockProto {
  private ContentBlockProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_ContentBlock_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_ContentBlock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/maps/places/v1/content_block.pr"
          + "oto\022\025google.maps.places.v1\032%google/maps/"
          + "places/v1/reference.proto\032 google/type/l"
          + "ocalized_text.proto\"\201\001\n\014ContentBlock\022\r\n\005"
          + "topic\030\001 \001(\t\022+\n\007content\030\002 \001(\0132\032.google.ty"
          + "pe.LocalizedText\0225\n\nreferences\030\003 \001(\0132!.g"
          + "oogle.maps.places.v1.ReferencesB\245\001\n\031com."
          + "google.maps.places.v1B\021ContentBlockProto"
          + "P\001Z7cloud.google.com/go/maps/places/apiv"
          + "1/placespb;placespb\370\001\001\242\002\006GMPSV1\252\002\025Google"
          + ".Maps.Places.V1\312\002\025Google\\Maps\\Places\\V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.maps.places.v1.ReferenceProto.getDescriptor(),
              com.google.type.LocalizedTextProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_ContentBlock_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_ContentBlock_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_ContentBlock_descriptor,
            new java.lang.String[] {
              "Topic", "Content", "References",
            });
    com.google.maps.places.v1.ReferenceProto.getDescriptor();
    com.google.type.LocalizedTextProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
