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
// source: google/cloud/aiplatform/v1/hyperparameter_tuning_job.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public final class HyperparameterTuningJobProto {
  private HyperparameterTuningJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1/hyperparame"
          + "ter_tuning_job.proto\022\032google.cloud.aipla"
          + "tform.v1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032+google/clo"
          + "ud/aiplatform/v1/custom_job.proto\0320googl"
          + "e/cloud/aiplatform/v1/encryption_spec.pr"
          + "oto\032*google/cloud/aiplatform/v1/job_stat"
          + "e.proto\032&google/cloud/aiplatform/v1/stud"
          + "y.proto\032\037google/protobuf/timestamp.proto"
          + "\032\027google/rpc/status.proto\"\263\010\n\027Hyperparam"
          + "eterTuningJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014disp"
          + "lay_name\030\002 \001(\tB\003\340A\002\022>\n\nstudy_spec\030\004 \001(\0132"
          + "%.google.cloud.aiplatform.v1.StudySpecB\003"
          + "\340A\002\022\034\n\017max_trial_count\030\005 \001(\005B\003\340A\002\022!\n\024par"
          + "allel_trial_count\030\006 \001(\005B\003\340A\002\022\036\n\026max_fail"
          + "ed_trial_count\030\007 \001(\005\022F\n\016trial_job_spec\030\010"
          + " \001(\0132).google.cloud.aiplatform.v1.Custom"
          + "JobSpecB\003\340A\002\0226\n\006trials\030\t \003(\0132!.google.cl"
          + "oud.aiplatform.v1.TrialB\003\340A\003\0228\n\005state\030\n "
          + "\001(\0162$.google.cloud.aiplatform.v1.JobStat"
          + "eB\003\340A\003\0224\n\013create_time\030\013 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0223\n\nstart_time\030\014 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end"
          + "_time\030\r \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\0224\n\013update_time\030\016 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022&\n\005error\030\017 \001(\0132\022.goog"
          + "le.rpc.StatusB\003\340A\003\022O\n\006labels\030\020 \003(\0132?.goo"
          + "gle.cloud.aiplatform.v1.HyperparameterTu"
          + "ningJob.LabelsEntry\022C\n\017encryption_spec\030\021"
          + " \001(\0132*.google.cloud.aiplatform.v1.Encryp"
          + "tionSpec\022\032\n\rsatisfies_pzs\030\023 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\024 \001(\010B\003\340A\003\032-\n\013LabelsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\225\001\352A\221\001\n1"
          + "aiplatform.googleapis.com/Hyperparameter"
          + "TuningJob\022\\projects/{project}/locations/"
          + "{location}/hyperparameterTuningJobs/{hyp"
          + "erparameter_tuning_job}B\332\001\n\036com.google.c"
          + "loud.aiplatform.v1B\034HyperparameterTuning"
          + "JobProtoP\001Z>cloud.google.com/go/aiplatfo"
          + "rm/apiv1/aiplatformpb;aiplatformpb\252\002\032Goo"
          + "gle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\A"
          + "IPlatform\\V1\352\002\035Google::Cloud::AIPlatform"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.CustomJobProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.StudyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "StudySpec",
              "MaxTrialCount",
              "ParallelTrialCount",
              "MaxFailedTrialCount",
              "TrialJobSpec",
              "Trials",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_HyperparameterTuningJob_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1.CustomJobProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.StudyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
