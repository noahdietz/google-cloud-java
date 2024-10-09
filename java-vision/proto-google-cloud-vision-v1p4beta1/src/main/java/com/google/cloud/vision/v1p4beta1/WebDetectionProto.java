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
// source: google/cloud/vision/v1p4beta1/web_detection.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1p4beta1;

public final class WebDetectionProto {
  private WebDetectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebEntity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebPage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebLabel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/vision/v1p4beta1/web_dete"
          + "ction.proto\022\035google.cloud.vision.v1p4bet"
          + "a1\"\214\007\n\014WebDetection\022K\n\014web_entities\030\001 \003("
          + "\01325.google.cloud.vision.v1p4beta1.WebDet"
          + "ection.WebEntity\022R\n\024full_matching_images"
          + "\030\002 \003(\01324.google.cloud.vision.v1p4beta1.W"
          + "ebDetection.WebImage\022U\n\027partial_matching"
          + "_images\030\003 \003(\01324.google.cloud.vision.v1p4"
          + "beta1.WebDetection.WebImage\022W\n\032pages_wit"
          + "h_matching_images\030\004 \003(\01323.google.cloud.v"
          + "ision.v1p4beta1.WebDetection.WebPage\022U\n\027"
          + "visually_similar_images\030\006 \003(\01324.google.c"
          + "loud.vision.v1p4beta1.WebDetection.WebIm"
          + "age\022O\n\021best_guess_labels\030\010 \003(\01324.google."
          + "cloud.vision.v1p4beta1.WebDetection.WebL"
          + "abel\032B\n\tWebEntity\022\021\n\tentity_id\030\001 \001(\t\022\r\n\005"
          + "score\030\002 \001(\002\022\023\n\013description\030\003 \001(\t\032&\n\010WebI"
          + "mage\022\013\n\003url\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\032\344\001\n\007Web"
          + "Page\022\013\n\003url\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\022\022\n\npage"
          + "_title\030\003 \001(\t\022R\n\024full_matching_images\030\004 \003"
          + "(\01324.google.cloud.vision.v1p4beta1.WebDe"
          + "tection.WebImage\022U\n\027partial_matching_ima"
          + "ges\030\005 \003(\01324.google.cloud.vision.v1p4beta"
          + "1.WebDetection.WebImage\0320\n\010WebLabel\022\r\n\005l"
          + "abel\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\tB}\n!com"
          + ".google.cloud.vision.v1p4beta1B\021WebDetec"
          + "tionProtoP\001Z9cloud.google.com/go/vision/"
          + "apiv1p4beta1/visionpb;visionpb\370\001\001\242\002\004GCVN"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor,
            new java.lang.String[] {
              "WebEntities",
              "FullMatchingImages",
              "PartialMatchingImages",
              "PagesWithMatchingImages",
              "VisuallySimilarImages",
              "BestGuessLabels",
            });
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebEntity_descriptor =
        internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebEntity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebEntity_descriptor,
            new java.lang.String[] {
              "EntityId", "Score", "Description",
            });
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebImage_descriptor =
        internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebImage_descriptor,
            new java.lang.String[] {
              "Url", "Score",
            });
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebPage_descriptor =
        internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebPage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebPage_descriptor,
            new java.lang.String[] {
              "Url", "Score", "PageTitle", "FullMatchingImages", "PartialMatchingImages",
            });
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebLabel_descriptor =
        internal_static_google_cloud_vision_v1p4beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebLabel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_WebDetection_WebLabel_descriptor,
            new java.lang.String[] {
              "Label", "LanguageCode",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
