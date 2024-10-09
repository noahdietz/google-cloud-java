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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_stats.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitoringStatsProto {
  private ModelMonitoringStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_DistributionDataValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_DistributionDataValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringTabularStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringTabularStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_TabularStatsFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_TabularStatsFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1beta1/model_"
          + "monitoring_stats.proto\022\037google.cloud.aip"
          + "latform.v1beta1\032\034google/protobuf/struct."
          + "proto\032\037google/protobuf/timestamp.proto\"v"
          + "\n\024ModelMonitoringStats\022U\n\rtabular_stats\030"
          + "\001 \001(\0132<.google.cloud.aiplatform.v1beta1."
          + "ModelMonitoringTabularStatsH\000B\007\n\005stats\"\234"
          + "\005\n\035ModelMonitoringStatsDataPoint\022`\n\rcurr"
          + "ent_stats\030\001 \001(\0132I.google.cloud.aiplatfor"
          + "m.v1beta1.ModelMonitoringStatsDataPoint."
          + "TypedValue\022a\n\016baseline_stats\030\002 \001(\0132I.goo"
          + "gle.cloud.aiplatform.v1beta1.ModelMonito"
          + "ringStatsDataPoint.TypedValue\022\027\n\017thresho"
          + "ld_value\030\003 \001(\001\022\023\n\013has_anomaly\030\004 \001(\010\022\034\n\024m"
          + "odel_monitoring_job\030\005 \001(\t\022\020\n\010schedule\030\006 "
          + "\001(\t\022/\n\013create_time\030\007 \001(\0132\032.google.protob"
          + "uf.Timestamp\022\021\n\talgorithm\030\010 \001(\t\032\223\002\n\nType"
          + "dValue\022\026\n\014double_value\030\001 \001(\001H\000\022}\n\022distri"
          + "bution_value\030\002 \001(\0132_.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringStatsDataPoi"
          + "nt.TypedValue.DistributionDataValueH\000\032e\n"
          + "\025DistributionDataValue\022,\n\014distribution\030\001"
          + " \001(\0132\026.google.protobuf.Value\022\036\n\026distribu"
          + "tion_deviation\030\002 \001(\001B\007\n\005value\"\236\001\n\033ModelM"
          + "onitoringTabularStats\022\022\n\nstats_name\030\001 \001("
          + "\t\022\026\n\016objective_type\030\002 \001(\t\022S\n\013data_points"
          + "\030\003 \003(\0132>.google.cloud.aiplatform.v1beta1"
          + ".ModelMonitoringStatsDataPoint\"\271\002\n Searc"
          + "hModelMonitoringStatsFilter\022t\n\024tabular_s"
          + "tats_filter\030\001 \001(\0132T.google.cloud.aiplatf"
          + "orm.v1beta1.SearchModelMonitoringStatsFi"
          + "lter.TabularStatsFilterH\000\032\224\001\n\022TabularSta"
          + "tsFilter\022\022\n\nstats_name\030\001 \001(\t\022\026\n\016objectiv"
          + "e_type\030\002 \001(\t\022\034\n\024model_monitoring_job\030\003 \001"
          + "(\t\022!\n\031model_monitoring_schedule\030\004 \001(\t\022\021\n"
          + "\talgorithm\030\005 \001(\tB\010\n\006filterB\360\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\031ModelMonitor"
          + "ingStatsProtoP\001ZCcloud.google.com/go/aip"
          + "latform/apiv1beta1/aiplatformpb;aiplatfo"
          + "rmpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002"
          + "\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Googl"
          + "e::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStats_descriptor,
            new java.lang.String[] {
              "TabularStats", "Stats",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_descriptor,
            new java.lang.String[] {
              "CurrentStats",
              "BaselineStats",
              "ThresholdValue",
              "HasAnomaly",
              "ModelMonitoringJob",
              "Schedule",
              "CreateTime",
              "Algorithm",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_descriptor,
            new java.lang.String[] {
              "DoubleValue", "DistributionValue", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_DistributionDataValue_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_DistributionDataValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsDataPoint_TypedValue_DistributionDataValue_descriptor,
            new java.lang.String[] {
              "Distribution", "DistributionDeviation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringTabularStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringTabularStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringTabularStats_descriptor,
            new java.lang.String[] {
              "StatsName", "ObjectiveType", "DataPoints",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_descriptor,
            new java.lang.String[] {
              "TabularStatsFilter", "Filter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_TabularStatsFilter_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_TabularStatsFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchModelMonitoringStatsFilter_TabularStatsFilter_descriptor,
            new java.lang.String[] {
              "StatsName",
              "ObjectiveType",
              "ModelMonitoringJob",
              "ModelMonitoringSchedule",
              "Algorithm",
            });
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
