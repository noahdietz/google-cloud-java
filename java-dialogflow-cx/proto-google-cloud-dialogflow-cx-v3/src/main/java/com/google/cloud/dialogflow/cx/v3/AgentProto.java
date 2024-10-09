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
// source: google/cloud/dialogflow/cx/v3/agent.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GenAppBuilderSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_GenAppBuilderSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_AnswerFeedbackSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_AnswerFeedbackSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Agent_PersonalizationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Agent_PersonalizationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetGenerativeSettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetGenerativeSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateGenerativeSettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateGenerativeSettingsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/cx/v3/agent.pr"
          + "oto\022\035google.cloud.dialogflow.cx.v3\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0325google/cl"
          + "oud/dialogflow/cx/v3/advanced_settings.p"
          + "roto\0320google/cloud/dialogflow/cx/v3/audi"
          + "o_config.proto\032(google/cloud/dialogflow/"
          + "cx/v3/flow.proto\0327google/cloud/dialogflo"
          + "w/cx/v3/generative_settings.proto\032#googl"
          + "e/longrunning/operations.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\032\034google/protobuf/struct.pr"
          + "oto\"8\n\024SpeechToTextSettings\022 \n\030enable_sp"
          + "eech_adaptation\030\001 \001(\010\"\242\r\n\005Agent\022\014\n\004name\030"
          + "\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022%\n\025defa"
          + "ult_language_code\030\003 \001(\tB\006\340A\002\340A\005\022 \n\030suppo"
          + "rted_language_codes\030\004 \003(\t\022\026\n\ttime_zone\030\005"
          + " \001(\tB\003\340A\002\022\023\n\013description\030\006 \001(\t\022\022\n\navatar"
          + "_uri\030\007 \001(\t\022T\n\027speech_to_text_settings\030\r "
          + "\001(\01323.google.cloud.dialogflow.cx.v3.Spee"
          + "chToTextSettings\022:\n\nstart_flow\030\020 \001(\tB&\340A"
          + "\005\372A \n\036dialogflow.googleapis.com/Flow\022J\n\021"
          + "security_settings\030\021 \001(\tB/\372A,\n*dialogflow"
          + ".googleapis.com/SecuritySettings\022&\n\032enab"
          + "le_stackdriver_logging\030\022 \001(\010B\002\030\001\022\037\n\027enab"
          + "le_spell_correction\030\024 \001(\010\022+\n\036enable_mult"
          + "i_language_training\030( \001(\010B\003\340A\001\022\016\n\006locked"
          + "\030\033 \001(\010\022J\n\021advanced_settings\030\026 \001(\0132/.goog"
          + "le.cloud.dialogflow.cx.v3.AdvancedSettin"
          + "gs\022]\n\030git_integration_settings\030\036 \001(\0132;.g"
          + "oogle.cloud.dialogflow.cx.v3.Agent.GitIn"
          + "tegrationSettings\022T\n\027text_to_speech_sett"
          + "ings\030\037 \001(\01323.google.cloud.dialogflow.cx."
          + "v3.TextToSpeechSettings\022a\n\030gen_app_build"
          + "er_settings\030! \001(\0132:.google.cloud.dialogf"
          + "low.cx.v3.Agent.GenAppBuilderSettingsH\000\210"
          + "\001\001\022b\n\030answer_feedback_settings\030& \001(\0132;.g"
          + "oogle.cloud.dialogflow.cx.v3.Agent.Answe"
          + "rFeedbackSettingsB\003\340A\001\022c\n\030personalizatio"
          + "n_settings\030* \001(\0132<.google.cloud.dialogfl"
          + "ow.cx.v3.Agent.PersonalizationSettingsB\003"
          + "\340A\001\032\220\002\n\026GitIntegrationSettings\022e\n\017github"
          + "_settings\030\001 \001(\0132J.google.cloud.dialogflo"
          + "w.cx.v3.Agent.GitIntegrationSettings.Git"
          + "hubSettingsH\000\032\177\n\016GithubSettings\022\024\n\014displ"
          + "ay_name\030\001 \001(\t\022\026\n\016repository_uri\030\002 \001(\t\022\027\n"
          + "\017tracking_branch\030\003 \001(\t\022\024\n\014access_token\030\004"
          + " \001(\t\022\020\n\010branches\030\005 \003(\tB\016\n\014git_settings\032,"
          + "\n\025GenAppBuilderSettings\022\023\n\006engine\030\001 \001(\tB"
          + "\003\340A\002\032=\n\026AnswerFeedbackSettings\022#\n\026enable"
          + "_answer_feedback\030\001 \001(\010B\003\340A\001\032Z\n\027Personali"
          + "zationSettings\022?\n\031default_end_user_metad"
          + "ata\030\001 \001(\0132\027.google.protobuf.StructB\003\340A\001:"
          + "\\\352AY\n\037dialogflow.googleapis.com/Agent\0226p"
          + "rojects/{project}/locations/{location}/a"
          + "gents/{agent}B\033\n\031_gen_app_builder_settin"
          + "gs\"s\n\021ListAgentsRequest\0227\n\006parent\030\001 \001(\tB"
          + "\'\340A\002\372A!\022\037dialogflow.googleapis.com/Agent"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\""
          + "c\n\022ListAgentsResponse\0224\n\006agents\030\001 \003(\0132$."
          + "google.cloud.dialogflow.cx.v3.Agent\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"H\n\017GetAgentRequest\022"
          + "5\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.google"
          + "apis.com/Agent\"\207\001\n\022CreateAgentRequest\0227\n"
          + "\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.google"
          + "apis.com/Agent\0228\n\005agent\030\002 \001(\0132$.google.c"
          + "loud.dialogflow.cx.v3.AgentB\003\340A\002\"\177\n\022Upda"
          + "teAgentRequest\0228\n\005agent\030\001 \001(\0132$.google.c"
          + "loud.dialogflow.cx.v3.AgentB\003\340A\002\022/\n\013upda"
          + "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas"
          + "k\"K\n\022DeleteAgentRequest\0225\n\004name\030\001 \001(\tB\'\340"
          + "A\002\372A!\n\037dialogflow.googleapis.com/Agent\"\230"
          + "\004\n\022ExportAgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002"
          + "\372A!\n\037dialogflow.googleapis.com/Agent\022\026\n\t"
          + "agent_uri\030\002 \001(\tB\003\340A\001\022V\n\013data_format\030\003 \001("
          + "\0162<.google.cloud.dialogflow.cx.v3.Export"
          + "AgentRequest.DataFormatB\003\340A\001\022B\n\013environm"
          + "ent\030\005 \001(\tB-\340A\001\372A\'\n%dialogflow.googleapis"
          + ".com/Environment\022^\n\017git_destination\030\006 \001("
          + "\0132@.google.cloud.dialogflow.cx.v3.Export"
          + "AgentRequest.GitDestinationB\003\340A\001\022-\n incl"
          + "ude_bigquery_export_settings\030\007 \001(\010B\003\340A\001\032"
          + "A\n\016GitDestination\022\027\n\017tracking_branch\030\001 \001"
          + "(\t\022\026\n\016commit_message\030\002 \001(\t\"E\n\nDataFormat"
          + "\022\033\n\027DATA_FORMAT_UNSPECIFIED\020\000\022\010\n\004BLOB\020\001\022"
          + "\020\n\014JSON_PACKAGE\020\004\"b\n\023ExportAgentResponse"
          + "\022\023\n\tagent_uri\030\001 \001(\tH\000\022\027\n\ragent_content\030\002"
          + " \001(\014H\000\022\024\n\ncommit_sha\030\003 \001(\tH\000B\007\n\005agent\"\240\003"
          + "\n\023RestoreAgentRequest\0225\n\004name\030\001 \001(\tB\'\340A\002"
          + "\372A!\n\037dialogflow.googleapis.com/Agent\022\023\n\t"
          + "agent_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001(\014"
          + "H\000\022R\n\ngit_source\030\006 \001(\0132<.google.cloud.di"
          + "alogflow.cx.v3.RestoreAgentRequest.GitSo"
          + "urceH\000\022X\n\016restore_option\030\005 \001(\0162@.google."
          + "cloud.dialogflow.cx.v3.RestoreAgentReque"
          + "st.RestoreOption\032$\n\tGitSource\022\027\n\017trackin"
          + "g_branch\030\001 \001(\t\"G\n\rRestoreOption\022\036\n\032RESTO"
          + "RE_OPTION_UNSPECIFIED\020\000\022\010\n\004KEEP\020\001\022\014\n\010FAL"
          + "LBACK\020\002B\007\n\005agent\"d\n\024ValidateAgentRequest"
          + "\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googl"
          + "eapis.com/Agent\022\025\n\rlanguage_code\030\002 \001(\t\"\177"
          + "\n\037GetAgentValidationResultRequest\022E\n\004nam"
          + "e\030\001 \001(\tB7\340A\002\372A1\n/dialogflow.googleapis.c"
          + "om/AgentValidationResult\022\025\n\rlanguage_cod"
          + "e\030\002 \001(\t\"\372\001\n\025AgentValidationResult\022\014\n\004nam"
          + "e\030\001 \001(\t\022T\n\027flow_validation_results\030\002 \003(\013"
          + "23.google.cloud.dialogflow.cx.v3.FlowVal"
          + "idationResult:}\352Az\n/dialogflow.googleapi"
          + "s.com/AgentValidationResult\022Gprojects/{p"
          + "roject}/locations/{location}/agents/{age"
          + "nt}/validationResult\"\203\001\n\034GetGenerativeSe"
          + "ttingsRequest\022G\n\004name\030\001 \001(\tB9\340A\002\372A3\n1dia"
          + "logflow.googleapis.com/AgentGenerativeSe"
          + "ttings\022\032\n\rlanguage_code\030\002 \001(\tB\003\340A\002\"\254\001\n\037U"
          + "pdateGenerativeSettingsRequest\022S\n\023genera"
          + "tive_settings\030\001 \001(\01321.google.cloud.dialo"
          + "gflow.cx.v3.GenerativeSettingsB\003\340A\002\0224\n\013u"
          + "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field"
          + "MaskB\003\340A\0012\242\022\n\006Agents\022\256\001\n\nListAgents\0220.go"
          + "ogle.cloud.dialogflow.cx.v3.ListAgentsRe"
          + "quest\0321.google.cloud.dialogflow.cx.v3.Li"
          + "stAgentsResponse\";\332A\006parent\202\323\344\223\002,\022*/v3/{"
          + "parent=projects/*/locations/*}/agents\022\233\001"
          + "\n\010GetAgent\022..google.cloud.dialogflow.cx."
          + "v3.GetAgentRequest\032$.google.cloud.dialog"
          + "flow.cx.v3.Agent\"9\332A\004name\202\323\344\223\002,\022*/v3/{na"
          + "me=projects/*/locations/*/agents/*}\022\260\001\n\013"
          + "CreateAgent\0221.google.cloud.dialogflow.cx"
          + ".v3.CreateAgentRequest\032$.google.cloud.di"
          + "alogflow.cx.v3.Agent\"H\332A\014parent,agent\202\323\344"
          + "\223\0023\"*/v3/{parent=projects/*/locations/*}"
          + "/agents:\005agent\022\273\001\n\013UpdateAgent\0221.google."
          + "cloud.dialogflow.cx.v3.UpdateAgentReques"
          + "t\032$.google.cloud.dialogflow.cx.v3.Agent\""
          + "S\332A\021agent,update_mask\202\323\344\223\002920/v3/{agent."
          + "name=projects/*/locations/*/agents/*}:\005a"
          + "gent\022\223\001\n\013DeleteAgent\0221.google.cloud.dial"
          + "ogflow.cx.v3.DeleteAgentRequest\032\026.google"
          + ".protobuf.Empty\"9\332A\004name\202\323\344\223\002,**/v3/{nam"
          + "e=projects/*/locations/*/agents/*}\022\315\001\n\013E"
          + "xportAgent\0221.google.cloud.dialogflow.cx."
          + "v3.ExportAgentRequest\032\035.google.longrunni"
          + "ng.Operation\"l\312A-\n\023ExportAgentResponse\022\026"
          + "google.protobuf.Struct\202\323\344\223\0026\"1/v3/{name="
          + "projects/*/locations/*/agents/*}:export:"
          + "\001*\022\322\001\n\014RestoreAgent\0222.google.cloud.dialo"
          + "gflow.cx.v3.RestoreAgentRequest\032\035.google"
          + ".longrunning.Operation\"o\312A/\n\025google.prot"
          + "obuf.Empty\022\026google.protobuf.Struct\202\323\344\223\0027"
          + "\"2/v3/{name=projects/*/locations/*/agent"
          + "s/*}:restore:\001*\022\272\001\n\rValidateAgent\0223.goog"
          + "le.cloud.dialogflow.cx.v3.ValidateAgentR"
          + "equest\0324.google.cloud.dialogflow.cx.v3.A"
          + "gentValidationResult\">\202\323\344\223\0028\"3/v3/{name="
          + "projects/*/locations/*/agents/*}:validat"
          + "e:\001*\022\334\001\n\030GetAgentValidationResult\022>.goog"
          + "le.cloud.dialogflow.cx.v3.GetAgentValida"
          + "tionResultRequest\0324.google.cloud.dialogf"
          + "low.cx.v3.AgentValidationResult\"J\332A\004name"
          + "\202\323\344\223\002=\022;/v3/{name=projects/*/locations/*"
          + "/agents/*/validationResult}\022\343\001\n\025GetGener"
          + "ativeSettings\022;.google.cloud.dialogflow."
          + "cx.v3.GetGenerativeSettingsRequest\0321.goo"
          + "gle.cloud.dialogflow.cx.v3.GenerativeSet"
          + "tings\"Z\332A\022name,language_code\202\323\344\223\002?\022=/v3/"
          + "{name=projects/*/locations/*/agents/*/ge"
          + "nerativeSettings}\022\240\002\n\030UpdateGenerativeSe"
          + "ttings\022>.google.cloud.dialogflow.cx.v3.U"
          + "pdateGenerativeSettingsRequest\0321.google."
          + "cloud.dialogflow.cx.v3.GenerativeSetting"
          + "s\"\220\001\332A\037generative_settings,update_mask\202\323"
          + "\344\223\002h2Q/v3/{generative_settings.name=proj"
          + "ects/*/locations/*/agents/*/generativeSe"
          + "ttings}:\023generative_settings\032x\312A\031dialogf"
          + "low.googleapis.com\322AYhttps://www.googlea"
          + "pis.com/auth/cloud-platform,https://www."
          + "googleapis.com/auth/dialogflowB\260\001\n!com.g"
          + "oogle.cloud.dialogflow.cx.v3B\nAgentProto"
          + "P\001Z1cloud.google.com/go/dialogflow/cx/ap"
          + "iv3/cxpb;cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dia"
          + "logflow.Cx.V3\352\002!Google::Cloud::Dialogflo"
          + "w::CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.AudioConfigProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.GenerativeSettingsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SpeechToTextSettings_descriptor,
            new java.lang.String[] {
              "EnableSpeechAdaptation",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "SpeechToTextSettings",
              "StartFlow",
              "SecuritySettings",
              "EnableStackdriverLogging",
              "EnableSpellCorrection",
              "EnableMultiLanguageTraining",
              "Locked",
              "AdvancedSettings",
              "GitIntegrationSettings",
              "TextToSpeechSettings",
              "GenAppBuilderSettings",
              "AnswerFeedbackSettings",
              "PersonalizationSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor,
            new java.lang.String[] {
              "GithubSettings", "GitSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_GitIntegrationSettings_GithubSettings_descriptor,
            new java.lang.String[] {
              "DisplayName", "RepositoryUri", "TrackingBranch", "AccessToken", "Branches",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GenAppBuilderSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_GenAppBuilderSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_GenAppBuilderSettings_descriptor,
            new java.lang.String[] {
              "Engine",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_AnswerFeedbackSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_AnswerFeedbackSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_AnswerFeedbackSettings_descriptor,
            new java.lang.String[] {
              "EnableAnswerFeedback",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Agent_PersonalizationSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Agent_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_Agent_PersonalizationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Agent_PersonalizationSettings_descriptor,
            new java.lang.String[] {
              "DefaultEndUserMetadata",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "AgentUri",
              "DataFormat",
              "Environment",
              "GitDestination",
              "IncludeBigqueryExportSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentRequest_GitDestination_descriptor,
            new java.lang.String[] {
              "TrackingBranch", "CommitMessage",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "CommitSha", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "AgentUri", "AgentContent", "GitSource", "RestoreOption", "Agent",
            });
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_RestoreAgentRequest_GitSource_descriptor,
            new java.lang.String[] {
              "TrackingBranch",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ValidateAgentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetAgentValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "FlowValidationResults",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetGenerativeSettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3_GetGenerativeSettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetGenerativeSettingsRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateGenerativeSettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateGenerativeSettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateGenerativeSettingsRequest_descriptor,
            new java.lang.String[] {
              "GenerativeSettings", "UpdateMask",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.GenerativeSettingsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
