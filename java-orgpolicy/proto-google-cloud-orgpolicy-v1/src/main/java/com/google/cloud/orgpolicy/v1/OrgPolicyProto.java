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
// source: google/cloud/orgpolicy/v1/orgpolicy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orgpolicy.v1;

public final class OrgPolicyProto {
  private OrgPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v1_Policy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v1_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v1_Policy_ListPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v1_Policy_ListPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v1_Policy_BooleanPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v1_Policy_BooleanPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v1_Policy_RestoreDefault_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v1_Policy_RestoreDefault_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/orgpolicy/v1/orgpolicy.pr"
          + "oto\022\031google.cloud.orgpolicy.v1\032\037google/p"
          + "rotobuf/timestamp.proto\"\213\005\n\006Policy\022\017\n\007ve"
          + "rsion\030\001 \001(\005\022\022\n\nconstraint\030\002 \001(\t\022\014\n\004etag\030"
          + "\003 \001(\014\022/\n\013update_time\030\004 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022C\n\013list_policy\030\005 \001(\0132,.go"
          + "ogle.cloud.orgpolicy.v1.Policy.ListPolic"
          + "yH\000\022I\n\016boolean_policy\030\006 \001(\0132/.google.clo"
          + "ud.orgpolicy.v1.Policy.BooleanPolicyH\000\022K"
          + "\n\017restore_default\030\007 \001(\01320.google.cloud.o"
          + "rgpolicy.v1.Policy.RestoreDefaultH\000\032\373\001\n\n"
          + "ListPolicy\022\026\n\016allowed_values\030\001 \003(\t\022\025\n\rde"
          + "nied_values\030\002 \003(\t\022J\n\nall_values\030\003 \001(\01626."
          + "google.cloud.orgpolicy.v1.Policy.ListPol"
          + "icy.AllValues\022\027\n\017suggested_value\030\004 \001(\t\022\033"
          + "\n\023inherit_from_parent\030\005 \001(\010\"<\n\tAllValues"
          + "\022\032\n\026ALL_VALUES_UNSPECIFIED\020\000\022\t\n\005ALLOW\020\001\022"
          + "\010\n\004DENY\020\002\032!\n\rBooleanPolicy\022\020\n\010enforced\030\001"
          + " \001(\010\032\020\n\016RestoreDefaultB\r\n\013policy_typeB\305\001"
          + "\n\035com.google.cloud.orgpolicy.v1B\016OrgPoli"
          + "cyProtoP\001Z;cloud.google.com/go/orgpolicy"
          + "/apiv1/orgpolicypb;orgpolicypb\252\002\031Google."
          + "Cloud.OrgPolicy.V1\312\002\031Google\\Cloud\\OrgPol"
          + "icy\\V1\352\002\034Google::Cloud::OrgPolicy::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_orgpolicy_v1_Policy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orgpolicy_v1_Policy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v1_Policy_descriptor,
            new java.lang.String[] {
              "Version",
              "Constraint",
              "Etag",
              "UpdateTime",
              "ListPolicy",
              "BooleanPolicy",
              "RestoreDefault",
              "PolicyType",
            });
    internal_static_google_cloud_orgpolicy_v1_Policy_ListPolicy_descriptor =
        internal_static_google_cloud_orgpolicy_v1_Policy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v1_Policy_ListPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v1_Policy_ListPolicy_descriptor,
            new java.lang.String[] {
              "AllowedValues", "DeniedValues", "AllValues", "SuggestedValue", "InheritFromParent",
            });
    internal_static_google_cloud_orgpolicy_v1_Policy_BooleanPolicy_descriptor =
        internal_static_google_cloud_orgpolicy_v1_Policy_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_orgpolicy_v1_Policy_BooleanPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v1_Policy_BooleanPolicy_descriptor,
            new java.lang.String[] {
              "Enforced",
            });
    internal_static_google_cloud_orgpolicy_v1_Policy_RestoreDefault_descriptor =
        internal_static_google_cloud_orgpolicy_v1_Policy_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_orgpolicy_v1_Policy_RestoreDefault_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v1_Policy_RestoreDefault_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
