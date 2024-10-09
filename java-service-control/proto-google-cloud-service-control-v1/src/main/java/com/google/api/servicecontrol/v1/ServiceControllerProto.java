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
// source: google/api/servicecontrol/v1/service_controller.proto

// Protobuf Java Version: 3.25.5
package com.google.api.servicecontrol.v1;

public final class ServiceControllerProto {
  private ServiceControllerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/api/servicecontrol/v1/service_c"
          + "ontroller.proto\022\034google.api.servicecontr"
          + "ol.v1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032.google/api/service"
          + "control/v1/check_error.proto\032,google/api"
          + "/servicecontrol/v1/operation.proto\032\027goog"
          + "le/rpc/status.proto\"{\n\014CheckRequest\022\024\n\014s"
          + "ervice_name\030\001 \001(\t\022:\n\toperation\030\002 \001(\0132\'.g"
          + "oogle.api.servicecontrol.v1.Operation\022\031\n"
          + "\021service_config_id\030\004 \001(\t\"\374\004\n\rCheckRespon"
          + "se\022\024\n\014operation_id\030\001 \001(\t\022>\n\014check_errors"
          + "\030\002 \003(\0132(.google.api.servicecontrol.v1.Ch"
          + "eckError\022\031\n\021service_config_id\030\005 \001(\t\022\032\n\022s"
          + "ervice_rollout_id\030\013 \001(\t\022I\n\ncheck_info\030\006 "
          + "\001(\01325.google.api.servicecontrol.v1.Check"
          + "Response.CheckInfo\032\213\001\n\tCheckInfo\022\030\n\020unus"
          + "ed_arguments\030\001 \003(\t\022O\n\rconsumer_info\030\002 \001("
          + "\01328.google.api.servicecontrol.v1.CheckRe"
          + "sponse.ConsumerInfo\022\023\n\013api_key_uid\030\005 \001(\t"
          + "\032\204\002\n\014ConsumerInfo\022\026\n\016project_number\030\001 \001("
          + "\003\022S\n\004type\030\002 \001(\0162E.google.api.servicecont"
          + "rol.v1.CheckResponse.ConsumerInfo.Consum"
          + "erType\022\027\n\017consumer_number\030\003 \001(\003\"n\n\014Consu"
          + "merType\022\035\n\031CONSUMER_TYPE_UNSPECIFIED\020\000\022\013"
          + "\n\007PROJECT\020\001\022\n\n\006FOLDER\020\002\022\020\n\014ORGANIZATION\020"
          + "\003\022\024\n\020SERVICE_SPECIFIC\020\004\"}\n\rReportRequest"
          + "\022\024\n\014service_name\030\001 \001(\t\022;\n\noperations\030\002 \003"
          + "(\0132\'.google.api.servicecontrol.v1.Operat"
          + "ion\022\031\n\021service_config_id\030\003 \001(\t\"\341\001\n\016Repor"
          + "tResponse\022O\n\rreport_errors\030\001 \003(\01328.googl"
          + "e.api.servicecontrol.v1.ReportResponse.R"
          + "eportError\022\031\n\021service_config_id\030\002 \001(\t\022\032\n"
          + "\022service_rollout_id\030\004 \001(\t\032G\n\013ReportError"
          + "\022\024\n\014operation_id\030\001 \001(\t\022\"\n\006status\030\002 \001(\0132\022"
          + ".google.rpc.Status2\274\003\n\021ServiceController"
          + "\022\216\001\n\005Check\022*.google.api.servicecontrol.v"
          + "1.CheckRequest\032+.google.api.servicecontr"
          + "ol.v1.CheckResponse\",\202\323\344\223\002&\"!/v1/service"
          + "s/{service_name}:check:\001*\022\222\001\n\006Report\022+.g"
          + "oogle.api.servicecontrol.v1.ReportReques"
          + "t\032,.google.api.servicecontrol.v1.ReportR"
          + "esponse\"-\202\323\344\223\002\'\"\"/v1/services/{service_n"
          + "ame}:report:\001*\032\200\001\312A\035servicecontrol.googl"
          + "eapis.com\322A]https://www.googleapis.com/a"
          + "uth/cloud-platform,https://www.googleapi"
          + "s.com/auth/servicecontrolB\370\001\n com.google"
          + ".api.servicecontrol.v1B\026ServiceControlle"
          + "rProtoP\001ZJcloud.google.com/go/servicecon"
          + "trol/apiv1/servicecontrolpb;servicecontr"
          + "olpb\370\001\001\242\002\004GASC\252\002\036Google.Cloud.ServiceCon"
          + "trol.V1\312\002\036Google\\Cloud\\ServiceControl\\V1"
          + "\352\002!Google::Cloud::ServiceControl::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.servicecontrol.v1.CheckErrorProto.getDescriptor(),
              com.google.api.servicecontrol.v1.OperationProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor,
            new java.lang.String[] {
              "ServiceName", "Operation", "ServiceConfigId",
            });
    internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicecontrol_v1_CheckResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor,
            new java.lang.String[] {
              "OperationId", "CheckErrors", "ServiceConfigId", "ServiceRolloutId", "CheckInfo",
            });
    internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor =
        internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor,
            new java.lang.String[] {
              "UnusedArguments", "ConsumerInfo", "ApiKeyUid",
            });
    internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor =
        internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor,
            new java.lang.String[] {
              "ProjectNumber", "Type", "ConsumerNumber",
            });
    internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicecontrol_v1_ReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor,
            new java.lang.String[] {
              "ServiceName", "Operations", "ServiceConfigId",
            });
    internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_servicecontrol_v1_ReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor,
            new java.lang.String[] {
              "ReportErrors", "ServiceConfigId", "ServiceRolloutId",
            });
    internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor =
        internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor,
            new java.lang.String[] {
              "OperationId", "Status",
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
    com.google.api.servicecontrol.v1.CheckErrorProto.getDescriptor();
    com.google.api.servicecontrol.v1.OperationProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
