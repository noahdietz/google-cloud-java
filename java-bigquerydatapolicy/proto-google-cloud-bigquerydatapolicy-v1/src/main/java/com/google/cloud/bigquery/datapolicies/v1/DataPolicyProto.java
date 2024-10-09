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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datapolicies.v1;

public final class DataPolicyProto {
  private DataPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_CreateDataPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_CreateDataPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_UpdateDataPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_UpdateDataPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_RenameDataPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_RenameDataPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_DeleteDataPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_DeleteDataPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_GetDataPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_GetDataPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_DataPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_DataPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datapolicies_v1_DataMaskingPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datapolicies_v1_DataMaskingPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/bigquery/datapolicies/v1/"
          + "datapolicy.proto\022%google.cloud.bigquery."
          + "datapolicies.v1\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032\036google/iam/v1/iam_policy.pro"
          + "to\032\032google/iam/v1/policy.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\"\254\001\n\027CreateDataPolicyReques"
          + "t\022D\n\006parent\030\001 \001(\tB4\340A\002\372A.\022,bigquerydatap"
          + "olicy.googleapis.com/DataPolicy\022K\n\013data_"
          + "policy\030\002 \001(\01321.google.cloud.bigquery.dat"
          + "apolicies.v1.DataPolicyB\003\340A\002\"\227\001\n\027UpdateD"
          + "ataPolicyRequest\022K\n\013data_policy\030\001 \001(\01321."
          + "google.cloud.bigquery.datapolicies.v1.Da"
          + "taPolicyB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMask\"M\n\027RenameDataPoli"
          + "cyRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\037\n\022new_data"
          + "_policy_id\030\002 \001(\tB\003\340A\002\"]\n\027DeleteDataPolic"
          + "yRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372A.\n,bigquery"
          + "datapolicy.googleapis.com/DataPolicy\"Z\n\024"
          + "GetDataPolicyRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372"
          + "A.\n,bigquerydatapolicy.googleapis.com/Da"
          + "taPolicy\"\226\001\n\027ListDataPoliciesRequest\022D\n\006"
          + "parent\030\001 \001(\tB4\340A\002\372A.\022,bigquerydatapolicy"
          + ".googleapis.com/DataPolicy\022\021\n\tpage_size\030"
          + "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001("
          + "\t\"}\n\030ListDataPoliciesResponse\022H\n\rdata_po"
          + "licies\030\001 \003(\01321.google.cloud.bigquery.dat"
          + "apolicies.v1.DataPolicy\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\"\204\004\n\nDataPolicy\022\024\n\npolicy_tag\030\004 "
          + "\001(\tH\000\022W\n\023data_masking_policy\030\005 \001(\01328.goo"
          + "gle.cloud.bigquery.datapolicies.v1.DataM"
          + "askingPolicyH\001\022\021\n\004name\030\001 \001(\tB\003\340A\003\022Z\n\020dat"
          + "a_policy_type\030\002 \001(\0162@.google.cloud.bigqu"
          + "ery.datapolicies.v1.DataPolicy.DataPolic"
          + "yType\022\026\n\016data_policy_id\030\003 \001(\t\"m\n\016DataPol"
          + "icyType\022 \n\034DATA_POLICY_TYPE_UNSPECIFIED\020"
          + "\000\022 \n\034COLUMN_LEVEL_SECURITY_POLICY\020\003\022\027\n\023D"
          + "ATA_MASKING_POLICY\020\002:u\352Ar\n,bigquerydatap"
          + "olicy.googleapis.com/DataPolicy\022Bproject"
          + "s/{project}/locations/{location}/dataPol"
          + "icies/{data_policy}B\020\n\016matching_labelB\010\n"
          + "\006policy\"\375\002\n\021DataMaskingPolicy\022n\n\025predefi"
          + "ned_expression\030\001 \001(\0162M.google.cloud.bigq"
          + "uery.datapolicies.v1.DataMaskingPolicy.P"
          + "redefinedExpressionH\000\022\021\n\007routine\030\003 \001(\tH\000"
          + "\"\316\001\n\024PredefinedExpression\022%\n!PREDEFINED_"
          + "EXPRESSION_UNSPECIFIED\020\000\022\n\n\006SHA256\020\003\022\017\n\013"
          + "ALWAYS_NULL\020\005\022\031\n\025DEFAULT_MASKING_VALUE\020\007"
          + "\022\030\n\024LAST_FOUR_CHARACTERS\020\t\022\031\n\025FIRST_FOUR"
          + "_CHARACTERS\020\n\022\016\n\nEMAIL_MASK\020\014\022\022\n\016DATE_YE"
          + "AR_MASK\020\rB\024\n\022masking_expression2\220\017\n\021Data"
          + "PolicyService\022\341\001\n\020CreateDataPolicy\022>.goo"
          + "gle.cloud.bigquery.datapolicies.v1.Creat"
          + "eDataPolicyRequest\0321.google.cloud.bigque"
          + "ry.datapolicies.v1.DataPolicy\"Z\332A\022parent"
          + ",data_policy\202\323\344\223\002?\"0/v1/{parent=projects"
          + "/*/locations/*}/dataPolicies:\013data_polic"
          + "y\022\362\001\n\020UpdateDataPolicy\022>.google.cloud.bi"
          + "gquery.datapolicies.v1.UpdateDataPolicyR"
          + "equest\0321.google.cloud.bigquery.datapolic"
          + "ies.v1.DataPolicy\"k\332A\027data_policy,update"
          + "_mask\202\323\344\223\002K2</v1/{data_policy.name=proje"
          + "cts/*/locations/*/dataPolicies/*}:\013data_"
          + "policy\022\343\001\n\020RenameDataPolicy\022>.google.clo"
          + "ud.bigquery.datapolicies.v1.RenameDataPo"
          + "licyRequest\0321.google.cloud.bigquery.data"
          + "policies.v1.DataPolicy\"\\\332A\027name,new_data"
          + "_policy_id\202\323\344\223\002<\"7/v1/{name=projects/*/l"
          + "ocations/*/dataPolicies/*}:rename:\001*\022\253\001\n"
          + "\020DeleteDataPolicy\022>.google.cloud.bigquer"
          + "y.datapolicies.v1.DeleteDataPolicyReques"
          + "t\032\026.google.protobuf.Empty\"?\332A\004name\202\323\344\223\0022"
          + "*0/v1/{name=projects/*/locations/*/dataP"
          + "olicies/*}\022\300\001\n\rGetDataPolicy\022;.google.cl"
          + "oud.bigquery.datapolicies.v1.GetDataPoli"
          + "cyRequest\0321.google.cloud.bigquery.datapo"
          + "licies.v1.DataPolicy\"?\332A\004name\202\323\344\223\0022\0220/v1"
          + "/{name=projects/*/locations/*/dataPolici"
          + "es/*}\022\326\001\n\020ListDataPolicies\022>.google.clou"
          + "d.bigquery.datapolicies.v1.ListDataPolic"
          + "iesRequest\032?.google.cloud.bigquery.datap"
          + "olicies.v1.ListDataPoliciesResponse\"A\332A\006"
          + "parent\202\323\344\223\0022\0220/v1/{parent=projects/*/loc"
          + "ations/*}/dataPolicies\022\227\001\n\014GetIamPolicy\022"
          + "\".google.iam.v1.GetIamPolicyRequest\032\025.go"
          + "ogle.iam.v1.Policy\"L\202\323\344\223\002F\"A/v1/{resourc"
          + "e=projects/*/locations/*/dataPolicies/*}"
          + ":getIamPolicy:\001*\022\227\001\n\014SetIamPolicy\022\".goog"
          + "le.iam.v1.SetIamPolicyRequest\032\025.google.i"
          + "am.v1.Policy\"L\202\323\344\223\002F\"A/v1/{resource=proj"
          + "ects/*/locations/*/dataPolicies/*}:setIa"
          + "mPolicy:\001*\022\275\001\n\022TestIamPermissions\022(.goog"
          + "le.iam.v1.TestIamPermissionsRequest\032).go"
          + "ogle.iam.v1.TestIamPermissionsResponse\"R"
          + "\202\323\344\223\002L\"G/v1/{resource=projects/*/locatio"
          + "ns/*/dataPolicies/*}:testIamPermissions:"
          + "\001*\032~\312A!bigquerydatapolicy.googleapis.com"
          + "\322AWhttps://www.googleapis.com/auth/bigqu"
          + "ery,https://www.googleapis.com/auth/clou"
          + "d-platformB\211\002\n)com.google.cloud.bigquery"
          + ".datapolicies.v1B\017DataPolicyProtoP\001ZMclo"
          + "ud.google.com/go/bigquery/datapolicies/a"
          + "piv1/datapoliciespb;datapoliciespb\252\002%Goo"
          + "gle.Cloud.BigQuery.DataPolicies.V1\312\002%Goo"
          + "gle\\Cloud\\BigQuery\\DataPolicies\\V1\352\002)Goo"
          + "gle::Cloud::Bigquery::DataPolicies::V1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_CreateDataPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datapolicies_v1_CreateDataPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_CreateDataPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DataPolicy",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_UpdateDataPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datapolicies_v1_UpdateDataPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_UpdateDataPolicyRequest_descriptor,
            new java.lang.String[] {
              "DataPolicy", "UpdateMask",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_RenameDataPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datapolicies_v1_RenameDataPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_RenameDataPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name", "NewDataPolicyId",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_DeleteDataPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datapolicies_v1_DeleteDataPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_DeleteDataPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_GetDataPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datapolicies_v1_GetDataPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_GetDataPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor,
            new java.lang.String[] {
              "DataPolicies", "NextPageToken",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_DataPolicy_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_datapolicies_v1_DataPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_DataPolicy_descriptor,
            new java.lang.String[] {
              "PolicyTag",
              "DataMaskingPolicy",
              "Name",
              "DataPolicyType",
              "DataPolicyId",
              "MatchingLabel",
              "Policy",
            });
    internal_static_google_cloud_bigquery_datapolicies_v1_DataMaskingPolicy_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_bigquery_datapolicies_v1_DataMaskingPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datapolicies_v1_DataMaskingPolicy_descriptor,
            new java.lang.String[] {
              "PredefinedExpression", "Routine", "MaskingExpression",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
