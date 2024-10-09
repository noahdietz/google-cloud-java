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
// source: google/cloud/speech/v2/locations_metadata.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.speech.v2;

public final class LocationsMetadataProto {
  private LocationsMetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_ModelFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_ModelFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_ModelFeatures_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_ModelFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_ModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_ModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_ModelMetadata_ModelFeaturesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_ModelMetadata_ModelFeaturesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_LanguageMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_LanguageMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_LanguageMetadata_ModelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_LanguageMetadata_ModelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_AccessMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_AccessMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v2_LocationsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v2_LocationsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/speech/v2/locations_metad"
          + "ata.proto\022\026google.cloud.speech.v2\"6\n\014Mod"
          + "elFeature\022\017\n\007feature\030\001 \001(\t\022\025\n\rrelease_st"
          + "ate\030\002 \001(\t\"L\n\rModelFeatures\022;\n\rmodel_feat"
          + "ure\030\001 \003(\0132$.google.cloud.speech.v2.Model"
          + "Feature\"\276\001\n\rModelMetadata\022P\n\016model_featu"
          + "res\030\001 \003(\01328.google.cloud.speech.v2.Model"
          + "Metadata.ModelFeaturesEntry\032[\n\022ModelFeat"
          + "uresEntry\022\013\n\003key\030\001 \001(\t\0224\n\005value\030\002 \001(\0132%."
          + "google.cloud.speech.v2.ModelFeatures:\0028\001"
          + "\"\256\001\n\020LanguageMetadata\022D\n\006models\030\001 \003(\01324."
          + "google.cloud.speech.v2.LanguageMetadata."
          + "ModelsEntry\032T\n\013ModelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "4\n\005value\030\002 \001(\0132%.google.cloud.speech.v2."
          + "ModelMetadata:\0028\001\"\310\001\n\016AccessMetadata\022N\n\017"
          + "constraint_type\030\001 \001(\01625.google.cloud.spe"
          + "ech.v2.AccessMetadata.ConstraintType\"f\n\016"
          + "ConstraintType\022\037\n\033CONSTRAINT_TYPE_UNSPEC"
          + "IFIED\020\000\0223\n/RESOURCE_LOCATIONS_ORG_POLICY"
          + "_CREATE_CONSTRAINT\020\001\"\221\001\n\021LocationsMetada"
          + "ta\022;\n\tlanguages\030\001 \001(\0132(.google.cloud.spe"
          + "ech.v2.LanguageMetadata\022?\n\017access_metada"
          + "ta\030\002 \001(\0132&.google.cloud.speech.v2.Access"
          + "MetadataBj\n\032com.google.cloud.speech.v2B\026"
          + "LocationsMetadataProtoP\001Z2cloud.google.c"
          + "om/go/speech/apiv2/speechpb;speechpbb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_speech_v2_ModelFeature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v2_ModelFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_ModelFeature_descriptor,
            new java.lang.String[] {
              "Feature", "ReleaseState",
            });
    internal_static_google_cloud_speech_v2_ModelFeatures_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v2_ModelFeatures_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_ModelFeatures_descriptor,
            new java.lang.String[] {
              "ModelFeature",
            });
    internal_static_google_cloud_speech_v2_ModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v2_ModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_ModelMetadata_descriptor,
            new java.lang.String[] {
              "ModelFeatures",
            });
    internal_static_google_cloud_speech_v2_ModelMetadata_ModelFeaturesEntry_descriptor =
        internal_static_google_cloud_speech_v2_ModelMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v2_ModelMetadata_ModelFeaturesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_ModelMetadata_ModelFeaturesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_speech_v2_LanguageMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v2_LanguageMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_LanguageMetadata_descriptor,
            new java.lang.String[] {
              "Models",
            });
    internal_static_google_cloud_speech_v2_LanguageMetadata_ModelsEntry_descriptor =
        internal_static_google_cloud_speech_v2_LanguageMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v2_LanguageMetadata_ModelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_LanguageMetadata_ModelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_speech_v2_AccessMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v2_AccessMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_AccessMetadata_descriptor,
            new java.lang.String[] {
              "ConstraintType",
            });
    internal_static_google_cloud_speech_v2_LocationsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v2_LocationsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v2_LocationsMetadata_descriptor,
            new java.lang.String[] {
              "Languages", "AccessMetadata",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
