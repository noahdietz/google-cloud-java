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
// source: google/monitoring/v3/alert.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public final class AlertProto {
  private AlertProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_Link_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_ForecastOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_ForecastOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationChannelStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationChannelStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/monitoring/v3/alert.proto\022\024goog"
          + "le.monitoring.v3\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032!go"
          + "ogle/monitoring/v3/common.proto\032*google/"
          + "monitoring/v3/mutation_record.proto\032\036goo"
          + "gle/protobuf/duration.proto\032\036google/prot"
          + "obuf/wrappers.proto\032\027google/rpc/status.p"
          + "roto\"\214$\n\013AlertPolicy\022\014\n\004name\030\001 \001(\t\022\024\n\014di"
          + "splay_name\030\002 \001(\t\022F\n\rdocumentation\030\r \001(\0132"
          + "/.google.monitoring.v3.AlertPolicy.Docum"
          + "entation\022F\n\013user_labels\030\020 \003(\01321.google.m"
          + "onitoring.v3.AlertPolicy.UserLabelsEntry"
          + "\022?\n\nconditions\030\014 \003(\0132+.google.monitoring"
          + ".v3.AlertPolicy.Condition\022I\n\010combiner\030\006 "
          + "\001(\01627.google.monitoring.v3.AlertPolicy.C"
          + "onditionCombinerType\022+\n\007enabled\030\021 \001(\0132\032."
          + "google.protobuf.BoolValue\022$\n\010validity\030\022 "
          + "\001(\0132\022.google.rpc.Status\022\035\n\025notification_"
          + "channels\030\016 \003(\t\022=\n\017creation_record\030\n \001(\0132"
          + "$.google.monitoring.v3.MutationRecord\022=\n"
          + "\017mutation_record\030\013 \001(\0132$.google.monitori"
          + "ng.v3.MutationRecord\022G\n\016alert_strategy\030\025"
          + " \001(\0132/.google.monitoring.v3.AlertPolicy."
          + "AlertStrategy\022A\n\010severity\030\026 \001(\0162*.google"
          + ".monitoring.v3.AlertPolicy.SeverityB\003\340A\001"
          + "\032\276\001\n\rDocumentation\022\017\n\007content\030\001 \001(\t\022\021\n\tm"
          + "ime_type\030\002 \001(\t\022\024\n\007subject\030\003 \001(\tB\003\340A\001\022H\n\005"
          + "links\030\004 \003(\01324.google.monitoring.v3.Alert"
          + "Policy.Documentation.LinkB\003\340A\001\032)\n\004Link\022\024"
          + "\n\014display_name\030\001 \001(\t\022\013\n\003url\030\002 \001(\t\032\367\025\n\tCo"
          + "ndition\022\014\n\004name\030\014 \001(\t\022\024\n\014display_name\030\006 "
          + "\001(\t\022Z\n\023condition_threshold\030\001 \001(\0132;.googl"
          + "e.monitoring.v3.AlertPolicy.Condition.Me"
          + "tricThresholdH\000\022U\n\020condition_absent\030\002 \001("
          + "\01329.google.monitoring.v3.AlertPolicy.Con"
          + "dition.MetricAbsenceH\000\022U\n\025condition_matc"
          + "hed_log\030\024 \001(\01324.google.monitoring.v3.Ale"
          + "rtPolicy.Condition.LogMatchH\000\022{\n#conditi"
          + "on_monitoring_query_language\030\023 \001(\0132L.goo"
          + "gle.monitoring.v3.AlertPolicy.Condition."
          + "MonitoringQueryLanguageConditionH\000\022{\n#co"
          + "ndition_prometheus_query_language\030\025 \001(\0132"
          + "L.google.monitoring.v3.AlertPolicy.Condi"
          + "tion.PrometheusQueryLanguageConditionH\000\032"
          + "5\n\007Trigger\022\017\n\005count\030\001 \001(\005H\000\022\021\n\007percent\030\002"
          + " \001(\001H\000B\006\n\004type\032\236\005\n\017MetricThreshold\022\023\n\006fi"
          + "lter\030\002 \001(\tB\003\340A\002\0227\n\014aggregations\030\010 \003(\0132!."
          + "google.monitoring.v3.Aggregation\022\032\n\022deno"
          + "minator_filter\030\t \001(\t\022C\n\030denominator_aggr"
          + "egations\030\n \003(\0132!.google.monitoring.v3.Ag"
          + "gregation\022e\n\020forecast_options\030\014 \001(\0132K.go"
          + "ogle.monitoring.v3.AlertPolicy.Condition"
          + ".MetricThreshold.ForecastOptions\0228\n\ncomp"
          + "arison\030\004 \001(\0162$.google.monitoring.v3.Comp"
          + "arisonType\022\027\n\017threshold_value\030\005 \001(\001\022+\n\010d"
          + "uration\030\006 \001(\0132\031.google.protobuf.Duration"
          + "\022D\n\007trigger\030\007 \001(\01323.google.monitoring.v3"
          + ".AlertPolicy.Condition.Trigger\022b\n\027evalua"
          + "tion_missing_data\030\013 \001(\0162A.google.monitor"
          + "ing.v3.AlertPolicy.Condition.EvaluationM"
          + "issingData\032K\n\017ForecastOptions\0228\n\020forecas"
          + "t_horizon\030\001 \001(\0132\031.google.protobuf.Durati"
          + "onB\003\340A\002\032\320\001\n\rMetricAbsence\022\023\n\006filter\030\001 \001("
          + "\tB\003\340A\002\0227\n\014aggregations\030\005 \003(\0132!.google.mo"
          + "nitoring.v3.Aggregation\022+\n\010duration\030\002 \001("
          + "\0132\031.google.protobuf.Duration\022D\n\007trigger\030"
          + "\003 \001(\01323.google.monitoring.v3.AlertPolicy"
          + ".Condition.Trigger\032\274\001\n\010LogMatch\022\023\n\006filte"
          + "r\030\001 \001(\tB\003\340A\002\022c\n\020label_extractors\030\002 \003(\0132I"
          + ".google.monitoring.v3.AlertPolicy.Condit"
          + "ion.LogMatch.LabelExtractorsEntry\0326\n\024Lab"
          + "elExtractorsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\032\210\002\n MonitoringQueryLanguageCon"
          + "dition\022\r\n\005query\030\001 \001(\t\022+\n\010duration\030\002 \001(\0132"
          + "\031.google.protobuf.Duration\022D\n\007trigger\030\003 "
          + "\001(\01323.google.monitoring.v3.AlertPolicy.C"
          + "ondition.Trigger\022b\n\027evaluation_missing_d"
          + "ata\030\004 \001(\0162A.google.monitoring.v3.AlertPo"
          + "licy.Condition.EvaluationMissingData\032\365\002\n"
          + " PrometheusQueryLanguageCondition\022\022\n\005que"
          + "ry\030\001 \001(\tB\003\340A\002\0220\n\010duration\030\002 \001(\0132\031.google"
          + ".protobuf.DurationB\003\340A\001\022;\n\023evaluation_in"
          + "terval\030\003 \001(\0132\031.google.protobuf.DurationB"
          + "\003\340A\001\022m\n\006labels\030\004 \003(\0132X.google.monitoring"
          + ".v3.AlertPolicy.Condition.PrometheusQuer"
          + "yLanguageCondition.LabelsEntryB\003\340A\001\022\027\n\nr"
          + "ule_group\030\005 \001(\tB\003\340A\001\022\027\n\nalert_rule\030\006 \001(\t"
          + "B\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001\"\255\001\n\025EvaluationMissingData\022\'"
          + "\n#EVALUATION_MISSING_DATA_UNSPECIFIED\020\000\022"
          + "$\n EVALUATION_MISSING_DATA_INACTIVE\020\001\022\"\n"
          + "\036EVALUATION_MISSING_DATA_ACTIVE\020\002\022!\n\035EVA"
          + "LUATION_MISSING_DATA_NO_OP\020\003:\227\002\352A\223\002\n.mon"
          + "itoring.googleapis.com/AlertPolicyCondit"
          + "ion\022Fprojects/{project}/alertPolicies/{a"
          + "lert_policy}/conditions/{condition}\022Porg"
          + "anizations/{organization}/alertPolicies/"
          + "{alert_policy}/conditions/{condition}\022Df"
          + "olders/{folder}/alertPolicies/{alert_pol"
          + "icy}/conditions/{condition}\022\001*B\013\n\tcondit"
          + "ion\032\327\003\n\rAlertStrategy\022f\n\027notification_ra"
          + "te_limit\030\001 \001(\0132E.google.monitoring.v3.Al"
          + "ertPolicy.AlertStrategy.NotificationRate"
          + "Limit\022-\n\nauto_close\030\003 \001(\0132\031.google.proto"
          + "buf.Duration\022r\n\035notification_channel_str"
          + "ategy\030\004 \003(\0132K.google.monitoring.v3.Alert"
          + "Policy.AlertStrategy.NotificationChannel"
          + "Strategy\032B\n\025NotificationRateLimit\022)\n\006per"
          + "iod\030\001 \001(\0132\031.google.protobuf.Duration\032w\n\033"
          + "NotificationChannelStrategy\022\"\n\032notificat"
          + "ion_channel_names\030\001 \003(\t\0224\n\021renotify_inte"
          + "rval\030\002 \001(\0132\031.google.protobuf.Duration\0321\n"
          + "\017UserLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"a\n\025ConditionCombinerType\022\027\n\023COM"
          + "BINE_UNSPECIFIED\020\000\022\007\n\003AND\020\001\022\006\n\002OR\020\002\022\036\n\032A"
          + "ND_WITH_MATCHING_RESOURCE\020\003\"J\n\010Severity\022"
          + "\030\n\024SEVERITY_UNSPECIFIED\020\000\022\014\n\010CRITICAL\020\001\022"
          + "\t\n\005ERROR\020\002\022\013\n\007WARNING\020\003:\311\001\352A\305\001\n%monitori"
          + "ng.googleapis.com/AlertPolicy\022/projects/"
          + "{project}/alertPolicies/{alert_policy}\0229"
          + "organizations/{organization}/alertPolici"
          + "es/{alert_policy}\022-folders/{folder}/aler"
          + "tPolicies/{alert_policy}\022\001*B\305\001\n\030com.goog"
          + "le.monitoring.v3B\nAlertProtoP\001ZAcloud.go"
          + "ogle.com/go/monitoring/apiv3/v2/monitori"
          + "ngpb;monitoringpb\252\002\032Google.Cloud.Monitor"
          + "ing.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Go"
          + "ogle::Cloud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.MutationRecordProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_AlertPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Documentation",
              "UserLabels",
              "Conditions",
              "Combiner",
              "Enabled",
              "Validity",
              "NotificationChannels",
              "CreationRecord",
              "MutationRecord",
              "AlertStrategy",
              "Severity",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "Subject", "Links",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_Link_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_Link_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Documentation_Link_descriptor,
            new java.lang.String[] {
              "DisplayName", "Url",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ConditionThreshold",
              "ConditionAbsent",
              "ConditionMatchedLog",
              "ConditionMonitoringQueryLanguage",
              "ConditionPrometheusQueryLanguage",
              "Condition",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor,
            new java.lang.String[] {
              "Count", "Percent", "Type",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor,
            new java.lang.String[] {
              "Filter",
              "Aggregations",
              "DenominatorFilter",
              "DenominatorAggregations",
              "ForecastOptions",
              "Comparison",
              "ThresholdValue",
              "Duration",
              "Trigger",
              "EvaluationMissingData",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_ForecastOptions_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_ForecastOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_ForecastOptions_descriptor,
            new java.lang.String[] {
              "ForecastHorizon",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor,
            new java.lang.String[] {
              "Filter", "Aggregations", "Duration", "Trigger",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor,
            new java.lang.String[] {
              "Filter", "LabelExtractors",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor,
            new java.lang.String[] {
              "Query", "Duration", "Trigger", "EvaluationMissingData",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_descriptor,
            new java.lang.String[] {
              "Query", "Duration", "EvaluationInterval", "Labels", "RuleGroup", "AlertRule",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_LabelsEntry_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_PrometheusQueryLanguageCondition_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor,
            new java.lang.String[] {
              "NotificationRateLimit", "AutoClose", "NotificationChannelStrategy",
            });
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor,
            new java.lang.String[] {
              "Period",
            });
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationChannelStrategy_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationChannelStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationChannelStrategy_descriptor,
            new java.lang.String[] {
              "NotificationChannelNames", "RenotifyInterval",
            });
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor,
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
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MutationRecordProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
