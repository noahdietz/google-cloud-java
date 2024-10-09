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
// source: google/dataflow/v1beta3/metrics.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public final class MetricsProto {
  private MetricsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_MetricStructuredName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_MetricStructuredName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_MetricStructuredName_ContextEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_MetricStructuredName_ContextEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_MetricUpdate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_MetricUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_GetJobMetricsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_GetJobMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_JobMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_JobMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_GetJobExecutionDetailsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_GetJobExecutionDetailsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_ProgressTimeseries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_ProgressTimeseries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_ProgressTimeseries_Point_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_ProgressTimeseries_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StageSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StageSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_JobExecutionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_JobExecutionDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_GetStageExecutionDetailsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_GetStageExecutionDetailsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_WorkItemDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_WorkItemDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_WorkerDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_WorkerDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StageExecutionDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/dataflow/v1beta3/metrics.proto\022"
          + "\027google.dataflow.v1beta3\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\261\001\n\024MetricStructu"
          + "redName\022\016\n\006origin\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022K\n"
          + "\007context\030\003 \003(\0132:.google.dataflow.v1beta3"
          + ".MetricStructuredName.ContextEntry\032.\n\014Co"
          + "ntextEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\"\300\003\n\014MetricUpdate\022;\n\004name\030\001 \001(\0132-.goog"
          + "le.dataflow.v1beta3.MetricStructuredName"
          + "\022\014\n\004kind\030\002 \001(\t\022\022\n\ncumulative\030\003 \001(\010\022&\n\006sc"
          + "alar\030\004 \001(\0132\026.google.protobuf.Value\022(\n\010me"
          + "an_sum\030\005 \001(\0132\026.google.protobuf.Value\022*\n\n"
          + "mean_count\030\006 \001(\0132\026.google.protobuf.Value"
          + "\022#\n\003set\030\007 \001(\0132\026.google.protobuf.Value\022,\n"
          + "\014distribution\030\013 \001(\0132\026.google.protobuf.Va"
          + "lue\022%\n\005gauge\030\014 \001(\0132\026.google.protobuf.Val"
          + "ue\022(\n\010internal\030\010 \001(\0132\026.google.protobuf.V"
          + "alue\022/\n\013update_time\030\t \001(\0132\032.google.proto"
          + "buf.Timestamp\"|\n\024GetJobMetricsRequest\022\022\n"
          + "\nproject_id\030\001 \001(\t\022\016\n\006job_id\030\002 \001(\t\022.\n\nsta"
          + "rt_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "p\022\020\n\010location\030\004 \001(\t\"u\n\nJobMetrics\022/\n\013met"
          + "ric_time\030\001 \001(\0132\032.google.protobuf.Timesta"
          + "mp\0226\n\007metrics\030\002 \003(\0132%.google.dataflow.v1"
          + "beta3.MetricUpdate\"|\n\035GetJobExecutionDet"
          + "ailsRequest\022\022\n\nproject_id\030\001 \001(\t\022\016\n\006job_i"
          + "d\030\002 \001(\t\022\020\n\010location\030\003 \001(\t\022\021\n\tpage_size\030\004"
          + " \001(\005\022\022\n\npage_token\030\005 \001(\t\"\270\001\n\022ProgressTim"
          + "eseries\022\030\n\020current_progress\030\001 \001(\001\022F\n\013dat"
          + "a_points\030\002 \003(\01321.google.dataflow.v1beta3"
          + ".ProgressTimeseries.Point\032@\n\005Point\022(\n\004ti"
          + "me\030\001 \001(\0132\032.google.protobuf.Timestamp\022\r\n\005"
          + "value\030\002 \001(\001\"\255\002\n\014StageSummary\022\020\n\010stage_id"
          + "\030\001 \001(\t\0226\n\005state\030\002 \001(\0162\'.google.dataflow."
          + "v1beta3.ExecutionState\022.\n\nstart_time\030\003 \001"
          + "(\0132\032.google.protobuf.Timestamp\022,\n\010end_ti"
          + "me\030\004 \001(\0132\032.google.protobuf.Timestamp\022=\n\010"
          + "progress\030\005 \001(\0132+.google.dataflow.v1beta3"
          + ".ProgressTimeseries\0226\n\007metrics\030\006 \003(\0132%.g"
          + "oogle.dataflow.v1beta3.MetricUpdate\"e\n\023J"
          + "obExecutionDetails\0225\n\006stages\030\001 \003(\0132%.goo"
          + "gle.dataflow.v1beta3.StageSummary\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"\356\001\n\037GetStageExecution"
          + "DetailsRequest\022\022\n\nproject_id\030\001 \001(\t\022\016\n\006jo"
          + "b_id\030\002 \001(\t\022\020\n\010location\030\003 \001(\t\022\020\n\010stage_id"
          + "\030\004 \001(\t\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npage_token\030"
          + "\006 \001(\t\022.\n\nstart_time\030\007 \001(\0132\032.google.proto"
          + "buf.Timestamp\022,\n\010end_time\030\010 \001(\0132\032.google"
          + ".protobuf.Timestamp\"\303\002\n\017WorkItemDetails\022"
          + "\017\n\007task_id\030\001 \001(\t\022\022\n\nattempt_id\030\002 \001(\t\022.\n\n"
          + "start_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tamp\022,\n\010end_time\030\004 \001(\0132\032.google.protobuf"
          + ".Timestamp\0226\n\005state\030\005 \001(\0162\'.google.dataf"
          + "low.v1beta3.ExecutionState\022=\n\010progress\030\006"
          + " \001(\0132+.google.dataflow.v1beta3.ProgressT"
          + "imeseries\0226\n\007metrics\030\007 \003(\0132%.google.data"
          + "flow.v1beta3.MetricUpdate\"b\n\rWorkerDetai"
          + "ls\022\023\n\013worker_name\030\001 \001(\t\022<\n\nwork_items\030\002 "
          + "\003(\0132(.google.dataflow.v1beta3.WorkItemDe"
          + "tails\"i\n\025StageExecutionDetails\0227\n\007worker"
          + "s\030\001 \003(\0132&.google.dataflow.v1beta3.Worker"
          + "Details\022\027\n\017next_page_token\030\002 \001(\t*\305\001\n\016Exe"
          + "cutionState\022\033\n\027EXECUTION_STATE_UNKNOWN\020\000"
          + "\022\037\n\033EXECUTION_STATE_NOT_STARTED\020\001\022\033\n\027EXE"
          + "CUTION_STATE_RUNNING\020\002\022\035\n\031EXECUTION_STAT"
          + "E_SUCCEEDED\020\003\022\032\n\026EXECUTION_STATE_FAILED\020"
          + "\004\022\035\n\031EXECUTION_STATE_CANCELLED\020\0052\237\007\n\016Met"
          + "ricsV1Beta3\022\351\001\n\rGetJobMetrics\022-.google.d"
          + "ataflow.v1beta3.GetJobMetricsRequest\032#.g"
          + "oogle.dataflow.v1beta3.JobMetrics\"\203\001\202\323\344\223"
          + "\002}\022F/v1b3/projects/{project_id}/location"
          + "s/{location}/jobs/{job_id}/metricsZ3\0221/v"
          + "1b3/projects/{project_id}/jobs/{job_id}/"
          + "metrics\022\327\001\n\026GetJobExecutionDetails\0226.goo"
          + "gle.dataflow.v1beta3.GetJobExecutionDeta"
          + "ilsRequest\032,.google.dataflow.v1beta3.Job"
          + "ExecutionDetails\"W\202\323\344\223\002Q\022O/v1b3/projects"
          + "/{project_id}/locations/{location}/jobs/"
          + "{job_id}/executionDetails\022\357\001\n\030GetStageEx"
          + "ecutionDetails\0228.google.dataflow.v1beta3"
          + ".GetStageExecutionDetailsRequest\032..googl"
          + "e.dataflow.v1beta3.StageExecutionDetails"
          + "\"i\202\323\344\223\002c\022a/v1b3/projects/{project_id}/lo"
          + "cations/{location}/jobs/{job_id}/stages/"
          + "{stage_id}/executionDetails\032\324\001\312A\027dataflo"
          + "w.googleapis.com\322A\266\001https://www.googleap"
          + "is.com/auth/cloud-platform,https://www.g"
          + "oogleapis.com/auth/compute,https://www.g"
          + "oogleapis.com/auth/compute.readonly,http"
          + "s://www.googleapis.com/auth/userinfo.ema"
          + "ilB\317\001\n\033com.google.dataflow.v1beta3B\014Metr"
          + "icsProtoP\001Z=cloud.google.com/go/dataflow"
          + "/apiv1beta3/dataflowpb;dataflowpb\252\002\035Goog"
          + "le.Cloud.Dataflow.V1Beta3\312\002\035Google\\Cloud"
          + "\\Dataflow\\V1beta3\352\002 Google::Cloud::Dataf"
          + "low::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_dataflow_v1beta3_MetricStructuredName_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_dataflow_v1beta3_MetricStructuredName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_MetricStructuredName_descriptor,
            new java.lang.String[] {
              "Origin", "Name", "Context",
            });
    internal_static_google_dataflow_v1beta3_MetricStructuredName_ContextEntry_descriptor =
        internal_static_google_dataflow_v1beta3_MetricStructuredName_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_dataflow_v1beta3_MetricStructuredName_ContextEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_MetricStructuredName_ContextEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_dataflow_v1beta3_MetricUpdate_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_dataflow_v1beta3_MetricUpdate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_MetricUpdate_descriptor,
            new java.lang.String[] {
              "Name",
              "Kind",
              "Cumulative",
              "Scalar",
              "MeanSum",
              "MeanCount",
              "Set",
              "Distribution",
              "Gauge",
              "Internal",
              "UpdateTime",
            });
    internal_static_google_dataflow_v1beta3_GetJobMetricsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_dataflow_v1beta3_GetJobMetricsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_GetJobMetricsRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "JobId", "StartTime", "Location",
            });
    internal_static_google_dataflow_v1beta3_JobMetrics_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_dataflow_v1beta3_JobMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_JobMetrics_descriptor,
            new java.lang.String[] {
              "MetricTime", "Metrics",
            });
    internal_static_google_dataflow_v1beta3_GetJobExecutionDetailsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_dataflow_v1beta3_GetJobExecutionDetailsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_GetJobExecutionDetailsRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "JobId", "Location", "PageSize", "PageToken",
            });
    internal_static_google_dataflow_v1beta3_ProgressTimeseries_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_dataflow_v1beta3_ProgressTimeseries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_ProgressTimeseries_descriptor,
            new java.lang.String[] {
              "CurrentProgress", "DataPoints",
            });
    internal_static_google_dataflow_v1beta3_ProgressTimeseries_Point_descriptor =
        internal_static_google_dataflow_v1beta3_ProgressTimeseries_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_dataflow_v1beta3_ProgressTimeseries_Point_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_ProgressTimeseries_Point_descriptor,
            new java.lang.String[] {
              "Time", "Value",
            });
    internal_static_google_dataflow_v1beta3_StageSummary_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_dataflow_v1beta3_StageSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StageSummary_descriptor,
            new java.lang.String[] {
              "StageId", "State", "StartTime", "EndTime", "Progress", "Metrics",
            });
    internal_static_google_dataflow_v1beta3_JobExecutionDetails_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_dataflow_v1beta3_JobExecutionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_JobExecutionDetails_descriptor,
            new java.lang.String[] {
              "Stages", "NextPageToken",
            });
    internal_static_google_dataflow_v1beta3_GetStageExecutionDetailsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_dataflow_v1beta3_GetStageExecutionDetailsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_GetStageExecutionDetailsRequest_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "JobId",
              "Location",
              "StageId",
              "PageSize",
              "PageToken",
              "StartTime",
              "EndTime",
            });
    internal_static_google_dataflow_v1beta3_WorkItemDetails_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_dataflow_v1beta3_WorkItemDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_WorkItemDetails_descriptor,
            new java.lang.String[] {
              "TaskId", "AttemptId", "StartTime", "EndTime", "State", "Progress", "Metrics",
            });
    internal_static_google_dataflow_v1beta3_WorkerDetails_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_dataflow_v1beta3_WorkerDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_WorkerDetails_descriptor,
            new java.lang.String[] {
              "WorkerName", "WorkItems",
            });
    internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_dataflow_v1beta3_StageExecutionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StageExecutionDetails_descriptor,
            new java.lang.String[] {
              "Workers", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
