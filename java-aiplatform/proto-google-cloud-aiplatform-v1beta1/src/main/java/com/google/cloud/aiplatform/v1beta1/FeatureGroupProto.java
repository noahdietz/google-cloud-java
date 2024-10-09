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
// source: google/cloud/aiplatform/v1beta1/feature_group.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureGroupProto {
  private FeatureGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_TimeSeries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_TimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1beta1/featur"
          + "e_group.proto\022\037google.cloud.aiplatform.v"
          + "1beta1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032(google/cloud"
          + "/aiplatform/v1beta1/io.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\342\006\n\014FeatureGroup\022K"
          + "\n\tbig_query\030\007 \001(\01326.google.cloud.aiplatf"
          + "orm.v1beta1.FeatureGroup.BigQueryH\000\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\010\0224\n\013create_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t"
          + "ime\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022\021\n\004etag\030\004 \001(\tB\003\340A\001\022N\n\006labels\030\005 \003(\01329."
          + "google.cloud.aiplatform.v1beta1.FeatureG"
          + "roup.LabelsEntryB\003\340A\001\022\030\n\013description\030\006 \001"
          + "(\tB\003\340A\001\032\274\002\n\010BigQuery\022Q\n\020big_query_source"
          + "\030\001 \001(\0132/.google.cloud.aiplatform.v1beta1"
          + ".BigQuerySourceB\006\340A\005\340A\002\022\036\n\021entity_id_col"
          + "umns\030\002 \003(\tB\003\340A\001\022\037\n\022static_data_source\030\003 "
          + "\001(\010B\003\340A\001\022[\n\013time_series\030\004 \001(\0132A.google.c"
          + "loud.aiplatform.v1beta1.FeatureGroup.Big"
          + "Query.TimeSeriesB\003\340A\001\022\022\n\005dense\030\005 \001(\010B\003\340A"
          + "\001\032+\n\nTimeSeries\022\035\n\020timestamp_column\030\001 \001("
          + "\tB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001:\220\001\352A\214\001\n&aiplatform.googlea"
          + "pis.com/FeatureGroup\022Eprojects/{project}"
          + "/locations/{location}/featureGroups/{fea"
          + "ture_group}*\rfeatureGroups2\014featureGroup"
          + "B\010\n\006sourceB\350\001\n#com.google.cloud.aiplatfo"
          + "rm.v1beta1B\021FeatureGroupProtoP\001ZCcloud.g"
          + "oogle.com/go/aiplatform/apiv1beta1/aipla"
          + "tformpb;aiplatformpb\252\002\037Google.Cloud.AIPl"
          + "atform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform"
          + "\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1"
          + "beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_descriptor,
            new java.lang.String[] {
              "BigQuery",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "Description",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_descriptor,
            new java.lang.String[] {
              "BigQuerySource", "EntityIdColumns", "StaticDataSource", "TimeSeries", "Dense",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_TimeSeries_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_TimeSeries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_BigQuery_TimeSeries_descriptor,
            new java.lang.String[] {
              "TimestampColumn",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureGroup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
