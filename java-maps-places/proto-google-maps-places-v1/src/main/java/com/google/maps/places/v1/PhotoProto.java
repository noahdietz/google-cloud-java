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
// source: google/maps/places/v1/photo.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public final class PhotoProto {
  private PhotoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Photo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Photo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/maps/places/v1/photo.proto\022\025goo"
          + "gle.maps.places.v1\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032\'"
          + "google/maps/places/v1/attribution.proto\""
          + "\326\001\n\005Photo\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\020\n\010width_px"
          + "\030\002 \001(\005\022\021\n\theight_px\030\003 \001(\005\022E\n\023author_attr"
          + "ibutions\030\004 \003(\0132(.google.maps.places.v1.A"
          + "uthorAttribution:N\352AK\n\033places.googleapis"
          + ".com/Photo\022\035places/{place}/photos/{photo"
          + "}*\006photos2\005photoB\236\001\n\031com.google.maps.pla"
          + "ces.v1B\nPhotoProtoP\001Z7cloud.google.com/g"
          + "o/maps/places/apiv1/placespb;placespb\370\001\001"
          + "\242\002\006GMPSV1\252\002\025Google.Maps.Places.V1\312\002\025Goog"
          + "le\\Maps\\Places\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.places.v1.AttributionProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_Photo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_Photo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Photo_descriptor,
            new java.lang.String[] {
              "Name", "WidthPx", "HeightPx", "AuthorAttributions",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.places.v1.AttributionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
