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
// source: google/monitoring/dashboard/v1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.dashboard.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Aggregation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Aggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/monitoring/dashboard/v1/common."
          + "proto\022\036google.monitoring.dashboard.v1\032\036g"
          + "oogle/protobuf/duration.proto\032\032google/ty"
          + "pe/interval.proto\"\301\007\n\013Aggregation\0223\n\020ali"
          + "gnment_period\030\001 \001(\0132\031.google.protobuf.Du"
          + "ration\022O\n\022per_series_aligner\030\002 \001(\01623.goo"
          + "gle.monitoring.dashboard.v1.Aggregation."
          + "Aligner\022Q\n\024cross_series_reducer\030\004 \001(\01623."
          + "google.monitoring.dashboard.v1.Aggregati"
          + "on.Reducer\022\027\n\017group_by_fields\030\005 \003(\t\"\213\003\n\007"
          + "Aligner\022\016\n\nALIGN_NONE\020\000\022\017\n\013ALIGN_DELTA\020\001"
          + "\022\016\n\nALIGN_RATE\020\002\022\025\n\021ALIGN_INTERPOLATE\020\003\022"
          + "\024\n\020ALIGN_NEXT_OLDER\020\004\022\r\n\tALIGN_MIN\020\n\022\r\n\t"
          + "ALIGN_MAX\020\013\022\016\n\nALIGN_MEAN\020\014\022\017\n\013ALIGN_COU"
          + "NT\020\r\022\r\n\tALIGN_SUM\020\016\022\020\n\014ALIGN_STDDEV\020\017\022\024\n"
          + "\020ALIGN_COUNT_TRUE\020\020\022\025\n\021ALIGN_COUNT_FALSE"
          + "\020\030\022\027\n\023ALIGN_FRACTION_TRUE\020\021\022\027\n\023ALIGN_PER"
          + "CENTILE_99\020\022\022\027\n\023ALIGN_PERCENTILE_95\020\023\022\027\n"
          + "\023ALIGN_PERCENTILE_50\020\024\022\027\n\023ALIGN_PERCENTI"
          + "LE_05\020\025\022\030\n\024ALIGN_PERCENT_CHANGE\020\027\"\261\002\n\007Re"
          + "ducer\022\017\n\013REDUCE_NONE\020\000\022\017\n\013REDUCE_MEAN\020\001\022"
          + "\016\n\nREDUCE_MIN\020\002\022\016\n\nREDUCE_MAX\020\003\022\016\n\nREDUC"
          + "E_SUM\020\004\022\021\n\rREDUCE_STDDEV\020\005\022\020\n\014REDUCE_COU"
          + "NT\020\006\022\025\n\021REDUCE_COUNT_TRUE\020\007\022\026\n\022REDUCE_CO"
          + "UNT_FALSE\020\017\022\030\n\024REDUCE_FRACTION_TRUE\020\010\022\030\n"
          + "\024REDUCE_PERCENTILE_99\020\t\022\030\n\024REDUCE_PERCEN"
          + "TILE_95\020\n\022\030\n\024REDUCE_PERCENTILE_50\020\013\022\030\n\024R"
          + "EDUCE_PERCENTILE_05\020\014\"\263\003\n\024PickTimeSeries"
          + "Filter\022S\n\016ranking_method\030\001 \001(\0162;.google."
          + "monitoring.dashboard.v1.PickTimeSeriesFi"
          + "lter.Method\022\027\n\017num_time_series\030\002 \001(\005\022Q\n\t"
          + "direction\030\003 \001(\0162>.google.monitoring.dash"
          + "board.v1.PickTimeSeriesFilter.Direction\022"
          + "\'\n\010interval\030\004 \001(\0132\025.google.type.Interval"
          + "\"t\n\006Method\022\026\n\022METHOD_UNSPECIFIED\020\000\022\017\n\013ME"
          + "THOD_MEAN\020\001\022\016\n\nMETHOD_MAX\020\002\022\016\n\nMETHOD_MI"
          + "N\020\003\022\016\n\nMETHOD_SUM\020\004\022\021\n\rMETHOD_LATEST\020\005\";"
          + "\n\tDirection\022\031\n\025DIRECTION_UNSPECIFIED\020\000\022\007"
          + "\n\003TOP\020\001\022\n\n\006BOTTOM\020\002\"\320\001\n\033StatisticalTimeS"
          + "eriesFilter\022Z\n\016ranking_method\030\001 \001(\0162B.go"
          + "ogle.monitoring.dashboard.v1.Statistical"
          + "TimeSeriesFilter.Method\022\027\n\017num_time_seri"
          + "es\030\002 \001(\005\"<\n\006Method\022\026\n\022METHOD_UNSPECIFIED"
          + "\020\000\022\032\n\026METHOD_CLUSTER_OUTLIER\020\001B\364\001\n\"com.g"
          + "oogle.monitoring.dashboard.v1B\013CommonPro"
          + "toP\001ZFcloud.google.com/go/monitoring/das"
          + "hboard/apiv1/dashboardpb;dashboardpb\252\002$G"
          + "oogle.Cloud.Monitoring.Dashboard.V1\312\002$Go"
          + "ogle\\Cloud\\Monitoring\\Dashboard\\V1\352\002(Goo"
          + "gle::Cloud::Monitoring::Dashboard::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Aggregation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Aggregation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Aggregation_descriptor,
            new java.lang.String[] {
              "AlignmentPeriod", "PerSeriesAligner", "CrossSeriesReducer", "GroupByFields",
            });
    internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor,
            new java.lang.String[] {
              "RankingMethod", "NumTimeSeries", "Direction", "Interval",
            });
    internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_StatisticalTimeSeriesFilter_descriptor,
            new java.lang.String[] {
              "RankingMethod", "NumTimeSeries",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
