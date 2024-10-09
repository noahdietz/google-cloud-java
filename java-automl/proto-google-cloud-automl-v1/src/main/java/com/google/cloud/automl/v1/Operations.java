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
// source: google/cloud/automl/v1/operations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

public final class Operations {
  private Operations() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DeleteOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1/operations.prot"
          + "o\022\026google.cloud.automl.v1\032\037google/cloud/"
          + "automl/v1/io.proto\032\037google/protobuf/time"
          + "stamp.proto\032\027google/rpc/status.proto\"\311\007\n"
          + "\021OperationMetadata\022I\n\016delete_details\030\010 \001"
          + "(\0132/.google.cloud.automl.v1.DeleteOperat"
          + "ionMetadataH\000\022T\n\024deploy_model_details\030\030 "
          + "\001(\01324.google.cloud.automl.v1.DeployModel"
          + "OperationMetadataH\000\022X\n\026undeploy_model_de"
          + "tails\030\031 \001(\01326.google.cloud.automl.v1.Und"
          + "eployModelOperationMetadataH\000\022T\n\024create_"
          + "model_details\030\n \001(\01324.google.cloud.autom"
          + "l.v1.CreateModelOperationMetadataH\000\022X\n\026c"
          + "reate_dataset_details\030\036 \001(\01326.google.clo"
          + "ud.automl.v1.CreateDatasetOperationMetad"
          + "ataH\000\022R\n\023import_data_details\030\017 \001(\01323.goo"
          + "gle.cloud.automl.v1.ImportDataOperationM"
          + "etadataH\000\022V\n\025batch_predict_details\030\020 \001(\013"
          + "25.google.cloud.automl.v1.BatchPredictOp"
          + "erationMetadataH\000\022R\n\023export_data_details"
          + "\030\025 \001(\01323.google.cloud.automl.v1.ExportDa"
          + "taOperationMetadataH\000\022T\n\024export_model_de"
          + "tails\030\026 \001(\01324.google.cloud.automl.v1.Exp"
          + "ortModelOperationMetadataH\000\022\030\n\020progress_"
          + "percent\030\r \001(\005\022,\n\020partial_failures\030\002 \003(\0132"
          + "\022.google.rpc.Status\022/\n\013create_time\030\003 \001(\013"
          + "2\032.google.protobuf.Timestamp\022/\n\013update_t"
          + "ime\030\004 \001(\0132\032.google.protobuf.TimestampB\t\n"
          + "\007details\"\031\n\027DeleteOperationMetadata\"\036\n\034D"
          + "eployModelOperationMetadata\" \n\036UndeployM"
          + "odelOperationMetadata\" \n\036CreateDatasetOp"
          + "erationMetadata\"\036\n\034CreateModelOperationM"
          + "etadata\"\035\n\033ImportDataOperationMetadata\"\307"
          + "\001\n\033ExportDataOperationMetadata\022]\n\013output"
          + "_info\030\001 \001(\0132H.google.cloud.automl.v1.Exp"
          + "ortDataOperationMetadata.ExportDataOutpu"
          + "tInfo\032I\n\024ExportDataOutputInfo\022\036\n\024gcs_out"
          + "put_directory\030\001 \001(\tH\000B\021\n\017output_location"
          + "\"\226\002\n\035BatchPredictOperationMetadata\022E\n\014in"
          + "put_config\030\001 \001(\0132/.google.cloud.automl.v"
          + "1.BatchPredictInputConfig\022a\n\013output_info"
          + "\030\002 \001(\0132L.google.cloud.automl.v1.BatchPre"
          + "dictOperationMetadata.BatchPredictOutput"
          + "Info\032K\n\026BatchPredictOutputInfo\022\036\n\024gcs_ou"
          + "tput_directory\030\001 \001(\tH\000B\021\n\017output_locatio"
          + "n\"\266\001\n\034ExportModelOperationMetadata\022_\n\013ou"
          + "tput_info\030\002 \001(\0132J.google.cloud.automl.v1"
          + ".ExportModelOperationMetadata.ExportMode"
          + "lOutputInfo\0325\n\025ExportModelOutputInfo\022\034\n\024"
          + "gcs_output_directory\030\001 \001(\tB\240\001\n\032com.googl"
          + "e.cloud.automl.v1P\001Z2cloud.google.com/go"
          + "/automl/apiv1/automlpb;automlpb\252\002\026Google"
          + ".Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V"
          + "1\352\002\031Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1.Io.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "DeleteDetails",
              "DeployModelDetails",
              "UndeployModelDetails",
              "CreateModelDetails",
              "CreateDatasetDetails",
              "ImportDataDetails",
              "BatchPredictDetails",
              "ExportDataDetails",
              "ExportModelDetails",
              "ProgressPercent",
              "PartialFailures",
              "CreateTime",
              "UpdateTime",
              "Details",
            });
    internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_DeleteOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor,
            new java.lang.String[] {
              "OutputInfo",
            });
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "OutputLocation",
            });
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor,
            new java.lang.String[] {
              "InputConfig", "OutputInfo",
            });
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "OutputLocation",
            });
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "OutputInfo",
            });
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor =
        internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory",
            });
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
