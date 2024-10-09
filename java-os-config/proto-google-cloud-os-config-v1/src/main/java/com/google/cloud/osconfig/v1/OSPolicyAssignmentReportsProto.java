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
// source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.osconfig.v1;

public final class OSPolicyAssignmentReportsProto {
  private OSPolicyAssignmentReportsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/osconfig/v1/os_policy_ass"
          + "ignment_reports.proto\022\030google.cloud.osco"
          + "nfig.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032\037google/prot"
          + "obuf/timestamp.proto\"l\n\"GetOSPolicyAssig"
          + "nmentReportRequest\022F\n\004name\030\001 \001(\tB8\340A\002\372A2"
          + "\n0osconfig.googleapis.com/OSPolicyAssign"
          + "mentReport\"\251\001\n$ListOSPolicyAssignmentRep"
          + "ortsRequest\022J\n\006parent\030\001 \001(\tB:\340A\002\372A4\n2osc"
          + "onfig.googleapis.com/InstanceOSPolicyAss"
          + "ignment\022\021\n\tpage_size\030\002 \001(\005\022\016\n\006filter\030\003 \001"
          + "(\t\022\022\n\npage_token\030\004 \001(\t\"\232\001\n%ListOSPolicyA"
          + "ssignmentReportsResponse\022X\n\034os_policy_as"
          + "signment_reports\030\001 \003(\01322.google.cloud.os"
          + "config.v1.OSPolicyAssignmentReport\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"\315\016\n\030OSPolicyAssignme"
          + "ntReport\022\014\n\004name\030\001 \001(\t\022\020\n\010instance\030\002 \001(\t"
          + "\022M\n\024os_policy_assignment\030\003 \001(\tB/\372A,\n*osc"
          + "onfig.googleapis.com/OSPolicyAssignment\022"
          + "d\n\025os_policy_compliances\030\004 \003(\0132E.google."
          + "cloud.osconfig.v1.OSPolicyAssignmentRepo"
          + "rt.OSPolicyCompliance\022/\n\013update_time\030\005 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\023\n\013last_r"
          + "un_id\030\006 \001(\t\032\366\n\n\022OSPolicyCompliance\022\024\n\014os"
          + "_policy_id\030\001 \001(\t\022o\n\020compliance_state\030\002 \001"
          + "(\0162U.google.cloud.osconfig.v1.OSPolicyAs"
          + "signmentReport.OSPolicyCompliance.Compli"
          + "anceState\022\037\n\027compliance_state_reason\030\003 \001"
          + "(\t\022\210\001\n\036os_policy_resource_compliances\030\004 "
          + "\003(\0132`.google.cloud.osconfig.v1.OSPolicyA"
          + "ssignmentReport.OSPolicyCompliance.OSPol"
          + "icyResourceCompliance\032\352\007\n\032OSPolicyResour"
          + "ceCompliance\022\035\n\025os_policy_resource_id\030\001 "
          + "\001(\t\022\221\001\n\014config_steps\030\002 \003(\0132{.google.clou"
          + "d.osconfig.v1.OSPolicyAssignmentReport.O"
          + "SPolicyCompliance.OSPolicyResourceCompli"
          + "ance.OSPolicyResourceConfigStep\022\212\001\n\020comp"
          + "liance_state\030\003 \001(\0162p.google.cloud.osconf"
          + "ig.v1.OSPolicyAssignmentReport.OSPolicyC"
          + "ompliance.OSPolicyResourceCompliance.Com"
          + "plianceState\022\037\n\027compliance_state_reason\030"
          + "\004 \001(\t\022\223\001\n\024exec_resource_output\030\005 \001(\0132s.g"
          + "oogle.cloud.osconfig.v1.OSPolicyAssignme"
          + "ntReport.OSPolicyCompliance.OSPolicyReso"
          + "urceCompliance.ExecResourceOutputH\000\032\326\002\n\032"
          + "OSPolicyResourceConfigStep\022\217\001\n\004type\030\001 \001("
          + "\0162\200\001.google.cloud.osconfig.v1.OSPolicyAs"
          + "signmentReport.OSPolicyCompliance.OSPoli"
          + "cyResourceCompliance.OSPolicyResourceCon"
          + "figStep.Type\022\025\n\rerror_message\030\002 \001(\t\"\216\001\n\004"
          + "Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\016\n\nVALIDATION"
          + "\020\001\022\027\n\023DESIRED_STATE_CHECK\020\002\022\035\n\031DESIRED_S"
          + "TATE_ENFORCEMENT\020\003\022(\n$DESIRED_STATE_CHEC"
          + "K_POST_ENFORCEMENT\020\004\0320\n\022ExecResourceOutp"
          + "ut\022\032\n\022enforcement_output\030\002 \001(\014\"@\n\017Compli"
          + "anceState\022\013\n\007UNKNOWN\020\000\022\r\n\tCOMPLIANT\020\001\022\021\n"
          + "\rNON_COMPLIANT\020\002B\010\n\006output\"@\n\017Compliance"
          + "State\022\013\n\007UNKNOWN\020\000\022\r\n\tCOMPLIANT\020\001\022\021\n\rNON"
          + "_COMPLIANT\020\002:\234\001\352A\230\001\n0osconfig.googleapis"
          + ".com/OSPolicyAssignmentReport\022dprojects/"
          + "{project}/locations/{location}/instances"
          + "/{instance}/osPolicyAssignments/{assignm"
          + "ent}/reportB\345\002\n\034com.google.cloud.osconfi"
          + "g.v1B\036OSPolicyAssignmentReportsProtoP\001Z8"
          + "cloud.google.com/go/osconfig/apiv1/oscon"
          + "figpb;osconfigpb\252\002\030Google.Cloud.OsConfig"
          + ".V1\312\002\030Google\\Cloud\\OsConfig\\V1\352\002\033Google:"
          + ":Cloud::OsConfig::V1\352A\223\001\n2osconfig.googl"
          + "eapis.com/InstanceOSPolicyAssignment\022]pr"
          + "ojects/{project}/locations/{location}/in"
          + "stances/{instance}/osPolicyAssignments/{"
          + "assignment}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentReportRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "Filter", "PageToken",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor,
            new java.lang.String[] {
              "OsPolicyAssignmentReports", "NextPageToken",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_descriptor,
            new java.lang.String[] {
              "Name",
              "Instance",
              "OsPolicyAssignment",
              "OsPolicyCompliances",
              "UpdateTime",
              "LastRunId",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor,
            new java.lang.String[] {
              "OsPolicyId",
              "ComplianceState",
              "ComplianceStateReason",
              "OsPolicyResourceCompliances",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor,
            new java.lang.String[] {
              "OsPolicyResourceId",
              "ConfigSteps",
              "ComplianceState",
              "ComplianceStateReason",
              "ExecResourceOutput",
              "Output",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor,
            new java.lang.String[] {
              "Type", "ErrorMessage",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor,
            new java.lang.String[] {
              "EnforcementOutput",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
