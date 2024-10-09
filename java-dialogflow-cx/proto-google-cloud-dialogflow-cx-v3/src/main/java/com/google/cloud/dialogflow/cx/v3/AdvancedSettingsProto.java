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
// source: google/cloud/dialogflow/cx/v3/advanced_settings.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class AdvancedSettingsProto {
  private AdvancedSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_ModelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_ModelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_DtmfSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_DtmfSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/dialogflow/cx/v3/advanced"
          + "_settings.proto\022\035google.cloud.dialogflow"
          + ".cx.v3\032\037google/api/field_behavior.proto\032"
          + "\'google/cloud/dialogflow/cx/v3/gcs.proto"
          + "\032\036google/protobuf/duration.proto\"\334\007\n\020Adv"
          + "ancedSettings\022S\n\034audio_export_gcs_destin"
          + "ation\030\002 \001(\0132-.google.cloud.dialogflow.cx"
          + ".v3.GcsDestination\022W\n\017speech_settings\030\003 "
          + "\001(\0132>.google.cloud.dialogflow.cx.v3.Adva"
          + "ncedSettings.SpeechSettings\022S\n\rdtmf_sett"
          + "ings\030\005 \001(\0132<.google.cloud.dialogflow.cx."
          + "v3.AdvancedSettings.DtmfSettings\022Y\n\020logg"
          + "ing_settings\030\006 \001(\0132?.google.cloud.dialog"
          + "flow.cx.v3.AdvancedSettings.LoggingSetti"
          + "ngs\032\230\002\n\016SpeechSettings\022\036\n\026endpointer_sen"
          + "sitivity\030\001 \001(\005\0224\n\021no_speech_timeout\030\002 \001("
          + "\0132\031.google.protobuf.Duration\022%\n\035use_time"
          + "out_based_endpointing\030\003 \001(\010\022Z\n\006models\030\005 "
          + "\003(\0132J.google.cloud.dialogflow.cx.v3.Adva"
          + "ncedSettings.SpeechSettings.ModelsEntry\032"
          + "-\n\013ModelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\032\312\001\n\014DtmfSettings\022\017\n\007enabled\030\001 \001(\010"
          + "\022\022\n\nmax_digits\030\002 \001(\005\022\024\n\014finish_digit\030\003 \001"
          + "(\t\022>\n\033interdigit_timeout_duration\030\006 \001(\0132"
          + "\031.google.protobuf.Duration\022?\n\034endpointin"
          + "g_timeout_duration\030\007 \001(\0132\031.google.protob"
          + "uf.Duration\032\201\001\n\017LoggingSettings\022\"\n\032enabl"
          + "e_stackdriver_logging\030\002 \001(\010\022\"\n\032enable_in"
          + "teraction_logging\030\003 \001(\010\022&\n\036enable_consen"
          + "t_based_redaction\030\004 \001(\010B\273\001\n!com.google.c"
          + "loud.dialogflow.cx.v3B\025AdvancedSettingsP"
          + "rotoP\001Z1cloud.google.com/go/dialogflow/c"
          + "x/apiv3/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud"
          + ".Dialogflow.Cx.V3\352\002!Google::Cloud::Dialo"
          + "gflow::CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.GcsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor,
            new java.lang.String[] {
              "AudioExportGcsDestination", "SpeechSettings", "DtmfSettings", "LoggingSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_descriptor,
            new java.lang.String[] {
              "EndpointerSensitivity", "NoSpeechTimeout", "UseTimeoutBasedEndpointing", "Models",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_ModelsEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_ModelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_SpeechSettings_ModelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_DtmfSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_DtmfSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_DtmfSettings_descriptor,
            new java.lang.String[] {
              "Enabled",
              "MaxDigits",
              "FinishDigit",
              "InterdigitTimeoutDuration",
              "EndpointingTimeoutDuration",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AdvancedSettings_LoggingSettings_descriptor,
            new java.lang.String[] {
              "EnableStackdriverLogging", "EnableInteractionLogging", "EnableConsentBasedRedaction",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.GcsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
