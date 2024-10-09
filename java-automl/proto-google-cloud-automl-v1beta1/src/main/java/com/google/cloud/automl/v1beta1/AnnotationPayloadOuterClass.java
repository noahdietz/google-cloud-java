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
// source: google/cloud/automl/v1beta1/annotation_payload.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1beta1;

public final class AnnotationPayloadOuterClass {
  private AnnotationPayloadOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_AnnotationPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/automl/v1beta1/annotation"
          + "_payload.proto\022\033google.cloud.automl.v1be"
          + "ta1\0320google/cloud/automl/v1beta1/classif"
          + "ication.proto\032+google/cloud/automl/v1bet"
          + "a1/detection.proto\032(google/cloud/automl/"
          + "v1beta1/tables.proto\0321google/cloud/autom"
          + "l/v1beta1/text_extraction.proto\0320google/"
          + "cloud/automl/v1beta1/text_sentiment.prot"
          + "o\032-google/cloud/automl/v1beta1/translati"
          + "on.proto\"\346\005\n\021AnnotationPayload\022I\n\013transl"
          + "ation\030\002 \001(\01322.google.cloud.automl.v1beta"
          + "1.TranslationAnnotationH\000\022O\n\016classificat"
          + "ion\030\003 \001(\01325.google.cloud.automl.v1beta1."
          + "ClassificationAnnotationH\000\022]\n\026image_obje"
          + "ct_detection\030\004 \001(\0132;.google.cloud.automl"
          + ".v1beta1.ImageObjectDetectionAnnotationH"
          + "\000\022Z\n\024video_classification\030\t \001(\0132:.google"
          + ".cloud.automl.v1beta1.VideoClassificatio"
          + "nAnnotationH\000\022[\n\025video_object_tracking\030\010"
          + " \001(\0132:.google.cloud.automl.v1beta1.Video"
          + "ObjectTrackingAnnotationH\000\022P\n\017text_extra"
          + "ction\030\006 \001(\01325.google.cloud.automl.v1beta"
          + "1.TextExtractionAnnotationH\000\022N\n\016text_sen"
          + "timent\030\007 \001(\01324.google.cloud.automl.v1bet"
          + "a1.TextSentimentAnnotationH\000\022?\n\006tables\030\n"
          + " \001(\0132-.google.cloud.automl.v1beta1.Table"
          + "sAnnotationH\000\022\032\n\022annotation_spec_id\030\001 \001("
          + "\t\022\024\n\014display_name\030\005 \001(\tB\010\n\006detailB\233\001\n\037co"
          + "m.google.cloud.automl.v1beta1P\001Z7cloud.g"
          + "oogle.com/go/automl/apiv1beta1/automlpb;"
          + "automlpb\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002"
          + "\036Google::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Detection.getDescriptor(),
              com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
              com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor(),
              com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_AnnotationPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor,
            new java.lang.String[] {
              "Translation",
              "Classification",
              "ImageObjectDetection",
              "VideoClassification",
              "VideoObjectTracking",
              "TextExtraction",
              "TextSentiment",
              "Tables",
              "AnnotationSpecId",
              "DisplayName",
              "Detail",
            });
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Detection.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
