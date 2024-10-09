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
// source: google/cloud/securitycenter/v1/finding.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

public final class FindingOuterClass {
  private FindingOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_StaticMute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_StaticMute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_DynamicMuteRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_DynamicMuteRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v1/finding"
          + ".proto\022\036google.cloud.securitycenter.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032+google/cloud/securit"
          + "ycenter/v1/access.proto\0320google/cloud/se"
          + "curitycenter/v1/application.proto\0324googl"
          + "e/cloud/securitycenter/v1/attack_exposur"
          + "e.proto\032=google/cloud/securitycenter/v1/"
          + "backup_disaster_recovery.proto\0320google/c"
          + "loud/securitycenter/v1/cloud_armor.proto"
          + "\032;google/cloud/securitycenter/v1/cloud_d"
          + "lp_data_profile.proto\0329google/cloud/secu"
          + "ritycenter/v1/cloud_dlp_inspection.proto"
          + "\032/google/cloud/securitycenter/v1/complia"
          + "nce.proto\032/google/cloud/securitycenter/v"
          + "1/connection.proto\0324google/cloud/securit"
          + "ycenter/v1/contact_details.proto\032.google"
          + "/cloud/securitycenter/v1/container.proto"
          + "\032-google/cloud/securitycenter/v1/databas"
          + "e.proto\0321google/cloud/securitycenter/v1/"
          + "exfiltration.proto\0324google/cloud/securit"
          + "ycenter/v1/external_system.proto\032)google"
          + "/cloud/securitycenter/v1/file.proto\0325goo"
          + "gle/cloud/securitycenter/v1/group_member"
          + "ship.proto\0320google/cloud/securitycenter/"
          + "v1/iam_binding.proto\032.google/cloud/secur"
          + "itycenter/v1/indicator.proto\0323google/clo"
          + "ud/securitycenter/v1/kernel_rootkit.prot"
          + "o\032/google/cloud/securitycenter/v1/kubern"
          + "etes.proto\0322google/cloud/securitycenter/"
          + "v1/load_balancer.proto\032.google/cloud/sec"
          + "uritycenter/v1/log_entry.proto\0321google/c"
          + "loud/securitycenter/v1/mitre_attack.prot"
          + "o\032-google/cloud/securitycenter/v1/notebo"
          + "ok.proto\032/google/cloud/securitycenter/v1"
          + "/org_policy.proto\032,google/cloud/security"
          + "center/v1/process.proto\0323google/cloud/se"
          + "curitycenter/v1/security_marks.proto\0325go"
          + "ogle/cloud/securitycenter/v1/security_po"
          + "sture.proto\0326google/cloud/securitycenter"
          + "/v1/toxic_combination.proto\0322google/clou"
          + "d/securitycenter/v1/vulnerability.proto\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\213!\n\007Finding\022\014\n\004na"
          + "me\030\001 \001(\t\022\016\n\006parent\030\002 \001(\t\022\025\n\rresource_nam"
          + "e\030\003 \001(\t\022<\n\005state\030\004 \001(\0162-.google.cloud.se"
          + "curitycenter.v1.Finding.State\022\020\n\010categor"
          + "y\030\005 \001(\t\022\024\n\014external_uri\030\006 \001(\t\022X\n\021source_"
          + "properties\030\007 \003(\0132=.google.cloud.security"
          + "center.v1.Finding.SourcePropertiesEntry\022"
          + "J\n\016security_marks\030\010 \001(\0132-.google.cloud.s"
          + "ecuritycenter.v1.SecurityMarksB\003\340A\003\022.\n\ne"
          + "vent_time\030\t \001(\0132\032.google.protobuf.Timest"
          + "amp\022/\n\013create_time\030\n \001(\0132\032.google.protob"
          + "uf.Timestamp\022B\n\010severity\030\014 \001(\01620.google."
          + "cloud.securitycenter.v1.Finding.Severity"
          + "\022\026\n\016canonical_name\030\016 \001(\t\022:\n\004mute\030\017 \001(\0162,"
          + ".google.cloud.securitycenter.v1.Finding."
          + "Mute\022K\n\rfinding_class\030\021 \001(\01624.google.clo"
          + "ud.securitycenter.v1.Finding.FindingClas"
          + "s\022<\n\tindicator\030\022 \001(\0132).google.cloud.secu"
          + "ritycenter.v1.Indicator\022D\n\rvulnerability"
          + "\030\024 \001(\0132-.google.cloud.securitycenter.v1."
          + "Vulnerability\0229\n\020mute_update_time\030\025 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022[\n\020exte"
          + "rnal_systems\030\026 \003(\0132<.google.cloud.securi"
          + "tycenter.v1.Finding.ExternalSystemsEntry"
          + "B\003\340A\003\022A\n\014mitre_attack\030\031 \001(\0132+.google.clo"
          + "ud.securitycenter.v1.MitreAttack\0226\n\006acce"
          + "ss\030\032 \001(\0132&.google.cloud.securitycenter.v"
          + "1.Access\022?\n\013connections\030\037 \003(\0132*.google.c"
          + "loud.securitycenter.v1.Connection\022\026\n\016mut"
          + "e_initiator\030\034 \001(\t\022H\n\tmute_info\030= \001(\01320.g"
          + "oogle.cloud.securitycenter.v1.Finding.Mu"
          + "teInfoB\003\340A\003\022:\n\tprocesses\030\036 \003(\0132\'.google."
          + "cloud.securitycenter.v1.Process\022L\n\010conta"
          + "cts\030! \003(\01325.google.cloud.securitycenter."
          + "v1.Finding.ContactsEntryB\003\340A\003\022?\n\013complia"
          + "nces\030\" \003(\0132*.google.cloud.securitycenter"
          + ".v1.Compliance\022 \n\023parent_display_name\030$ "
          + "\001(\tB\003\340A\003\022\023\n\013description\030% \001(\t\022B\n\014exfiltr"
          + "ation\030& \001(\0132,.google.cloud.securitycente"
          + "r.v1.Exfiltration\022@\n\014iam_bindings\030\' \003(\0132"
          + "*.google.cloud.securitycenter.v1.IamBind"
          + "ing\022\022\n\nnext_steps\030( \001(\t\022\023\n\013module_name\030)"
          + " \001(\t\022=\n\ncontainers\030* \003(\0132).google.cloud."
          + "securitycenter.v1.Container\022>\n\nkubernete"
          + "s\030+ \001(\0132*.google.cloud.securitycenter.v1"
          + ".Kubernetes\022:\n\010database\030, \001(\0132(.google.c"
          + "loud.securitycenter.v1.Database\022G\n\017attac"
          + "k_exposure\030- \001(\0132..google.cloud.security"
          + "center.v1.AttackExposure\0223\n\005files\030. \003(\0132"
          + "$.google.cloud.securitycenter.v1.File\022P\n"
          + "\024cloud_dlp_inspection\0300 \001(\01322.google.clo"
          + "ud.securitycenter.v1.CloudDlpInspection\022"
          + "S\n\026cloud_dlp_data_profile\0301 \001(\01323.google"
          + ".cloud.securitycenter.v1.CloudDlpDataPro"
          + "file\022E\n\016kernel_rootkit\0302 \001(\0132-.google.cl"
          + "oud.securitycenter.v1.KernelRootkit\022?\n\014o"
          + "rg_policies\0303 \003(\0132).google.cloud.securit"
          + "ycenter.v1.OrgPolicy\022@\n\013application\0305 \001("
          + "\0132+.google.cloud.securitycenter.v1.Appli"
          + "cation\022X\n\030backup_disaster_recovery\0307 \001(\013"
          + "26.google.cloud.securitycenter.v1.Backup"
          + "DisasterRecovery\022I\n\020security_posture\0308 \001"
          + "(\0132/.google.cloud.securitycenter.v1.Secu"
          + "rityPosture\022=\n\013log_entries\0309 \003(\0132(.googl"
          + "e.cloud.securitycenter.v1.LogEntry\022D\n\016lo"
          + "ad_balancers\030: \003(\0132,.google.cloud.securi"
          + "tycenter.v1.LoadBalancer\022?\n\013cloud_armor\030"
          + "; \001(\0132*.google.cloud.securitycenter.v1.C"
          + "loudArmor\022:\n\010notebook\030? \001(\0132(.google.clo"
          + "ud.securitycenter.v1.Notebook\022K\n\021toxic_c"
          + "ombination\030@ \001(\01320.google.cloud.security"
          + "center.v1.ToxicCombination\022J\n\021group_memb"
          + "erships\030A \003(\0132/.google.cloud.securitycen"
          + "ter.v1.GroupMembership\032\223\003\n\010MuteInfo\022P\n\013s"
          + "tatic_mute\030\001 \001(\0132;.google.cloud.security"
          + "center.v1.Finding.MuteInfo.StaticMute\022`\n"
          + "\024dynamic_mute_records\030\002 \003(\0132B.google.clo"
          + "ud.securitycenter.v1.Finding.MuteInfo.Dy"
          + "namicMuteRecord\032y\n\nStaticMute\022;\n\005state\030\001"
          + " \001(\0162,.google.cloud.securitycenter.v1.Fi"
          + "nding.Mute\022.\n\napply_time\030\002 \001(\0132\032.google."
          + "protobuf.Timestamp\032X\n\021DynamicMuteRecord\022"
          + "\023\n\013mute_config\030\001 \001(\t\022.\n\nmatch_time\030\002 \001(\013"
          + "2\032.google.protobuf.Timestamp\032O\n\025SourcePr"
          + "opertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001("
          + "\0132\026.google.protobuf.Value:\0028\001\032f\n\024Externa"
          + "lSystemsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001("
          + "\0132..google.cloud.securitycenter.v1.Exter"
          + "nalSystem:\0028\001\032_\n\rContactsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022=\n\005value\030\002 \001(\0132..google.cloud.securi"
          + "tycenter.v1.ContactDetails:\0028\001\"8\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010IN"
          + "ACTIVE\020\002\"Q\n\010Severity\022\030\n\024SEVERITY_UNSPECI"
          + "FIED\020\000\022\014\n\010CRITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006MEDIUM"
          + "\020\003\022\007\n\003LOW\020\004\"C\n\004Mute\022\024\n\020MUTE_UNSPECIFIED\020"
          + "\000\022\t\n\005MUTED\020\001\022\013\n\007UNMUTED\020\002\022\r\n\tUNDEFINED\020\004"
          + "\"\260\001\n\014FindingClass\022\035\n\031FINDING_CLASS_UNSPE"
          + "CIFIED\020\000\022\n\n\006THREAT\020\001\022\021\n\rVULNERABILITY\020\002\022"
          + "\024\n\020MISCONFIGURATION\020\003\022\017\n\013OBSERVATION\020\004\022\r"
          + "\n\tSCC_ERROR\020\005\022\025\n\021POSTURE_VIOLATION\020\006\022\025\n\021"
          + "TOXIC_COMBINATION\020\007:\356\001\352A\352\001\n%securitycent"
          + "er.googleapis.com/Finding\022@organizations"
          + "/{organization}/sources/{source}/finding"
          + "s/{finding}\0224folders/{folder}/sources/{s"
          + "ource}/findings/{finding}\0226projects/{pro"
          + "ject}/sources/{source}/findings/{finding"
          + "}*\010findings2\007findingB\330\001\n\"com.google.clou"
          + "d.securitycenter.v1P\001ZJcloud.google.com/"
          + "go/securitycenter/apiv1/securitycenterpb"
          + ";securitycenterpb\252\002\036Google.Cloud.Securit"
          + "yCenter.V1\312\002\036Google\\Cloud\\SecurityCenter"
          + "\\V1\352\002!Google::Cloud::SecurityCenter::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.AccessProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ApplicationProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.AttackExposureProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.BackupDisasterRecoveryProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.CloudArmorProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.CloudDlpInspectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.FileProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.GroupMembershipProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.KernelRootkitProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.LoadBalancerProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.LogEntryProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.NotebookProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.OrgPolicyProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor(),
              com.google.cloud.securitycenter.v1.SecurityPostureProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ToxicCombinationProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ResourceName",
              "State",
              "Category",
              "ExternalUri",
              "SourceProperties",
              "SecurityMarks",
              "EventTime",
              "CreateTime",
              "Severity",
              "CanonicalName",
              "Mute",
              "FindingClass",
              "Indicator",
              "Vulnerability",
              "MuteUpdateTime",
              "ExternalSystems",
              "MitreAttack",
              "Access",
              "Connections",
              "MuteInitiator",
              "MuteInfo",
              "Processes",
              "Contacts",
              "Compliances",
              "ParentDisplayName",
              "Description",
              "Exfiltration",
              "IamBindings",
              "NextSteps",
              "ModuleName",
              "Containers",
              "Kubernetes",
              "Database",
              "AttackExposure",
              "Files",
              "CloudDlpInspection",
              "CloudDlpDataProfile",
              "KernelRootkit",
              "OrgPolicies",
              "Application",
              "BackupDisasterRecovery",
              "SecurityPosture",
              "LogEntries",
              "LoadBalancers",
              "CloudArmor",
              "Notebook",
              "ToxicCombination",
              "GroupMemberships",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_descriptor,
            new java.lang.String[] {
              "StaticMute", "DynamicMuteRecords",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_StaticMute_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_StaticMute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_StaticMute_descriptor,
            new java.lang.String[] {
              "State", "ApplyTime",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_DynamicMuteRecord_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_DynamicMuteRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_MuteInfo_DynamicMuteRecord_descriptor,
            new java.lang.String[] {
              "MuteConfig", "MatchTime",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor,
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
    com.google.cloud.securitycenter.v1.AccessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ApplicationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.AttackExposureProto.getDescriptor();
    com.google.cloud.securitycenter.v1.BackupDisasterRecoveryProto.getDescriptor();
    com.google.cloud.securitycenter.v1.CloudArmorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto.getDescriptor();
    com.google.cloud.securitycenter.v1.CloudDlpInspectionProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor();
    com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor();
    com.google.cloud.securitycenter.v1.FileProto.getDescriptor();
    com.google.cloud.securitycenter.v1.GroupMembershipProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.KernelRootkitProto.getDescriptor();
    com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor();
    com.google.cloud.securitycenter.v1.LoadBalancerProto.getDescriptor();
    com.google.cloud.securitycenter.v1.LogEntryProto.getDescriptor();
    com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor();
    com.google.cloud.securitycenter.v1.NotebookProto.getDescriptor();
    com.google.cloud.securitycenter.v1.OrgPolicyProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityPostureProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ToxicCombinationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
