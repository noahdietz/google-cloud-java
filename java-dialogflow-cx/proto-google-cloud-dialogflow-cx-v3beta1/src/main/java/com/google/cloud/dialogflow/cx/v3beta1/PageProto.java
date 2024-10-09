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
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public final class PageProto {
  private PageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Page_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_FillBehavior_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_FillBehavior_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_EventHandler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_EventHandler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRoute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRoute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetPageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetPageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreatePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreatePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdatePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdatePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeletePageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeletePageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_KnowledgeConnectorSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_KnowledgeConnectorSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/cx/v3beta1/pag"
          + "e.proto\022\"google.cloud.dialogflow.cx.v3be"
          + "ta1\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032:"
          + "google/cloud/dialogflow/cx/v3beta1/advan"
          + "ced_settings.proto\032>google/cloud/dialogf"
          + "low/cx/v3beta1/data_store_connection.pro"
          + "to\0324google/cloud/dialogflow/cx/v3beta1/f"
          + "ulfillment.proto\032\033google/protobuf/empty."
          + "proto\032 google/protobuf/field_mask.proto\032"
          + "\034google/protobuf/struct.proto\"\353\005\n\004Page\022\014"
          + "\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022"
          + "\023\n\013description\030\023 \001(\t\022J\n\021entry_fulfillmen"
          + "t\030\007 \001(\0132/.google.cloud.dialogflow.cx.v3b"
          + "eta1.Fulfillment\0226\n\004form\030\004 \001(\0132(.google."
          + "cloud.dialogflow.cx.v3beta1.Form\022T\n\027tran"
          + "sition_route_groups\030\013 \003(\tB3\372A0\n.dialogfl"
          + "ow.googleapis.com/TransitionRouteGroup\022N"
          + "\n\021transition_routes\030\t \003(\01323.google.cloud"
          + ".dialogflow.cx.v3beta1.TransitionRoute\022H"
          + "\n\016event_handlers\030\n \003(\01320.google.cloud.di"
          + "alogflow.cx.v3beta1.EventHandler\022O\n\021adva"
          + "nced_settings\030\r \001(\01324.google.cloud.dialo"
          + "gflow.cx.v3beta1.AdvancedSettings\022i\n\034kno"
          + "wledge_connector_settings\030\022 \001(\0132>.google"
          + ".cloud.dialogflow.cx.v3beta1.KnowledgeCo"
          + "nnectorSettingsB\003\340A\001:u\352Ar\n\036dialogflow.go"
          + "ogleapis.com/Page\022Pprojects/{project}/lo"
          + "cations/{location}/agents/{agent}/flows/"
          + "{flow}/pages/{page}\"\210\005\n\004Form\022F\n\nparamete"
          + "rs\030\001 \003(\01322.google.cloud.dialogflow.cx.v3"
          + "beta1.Form.Parameter\032\267\004\n\tParameter\022\031\n\014di"
          + "splay_name\030\001 \001(\tB\003\340A\002\022\020\n\010required\030\002 \001(\010\022"
          + "A\n\013entity_type\030\003 \001(\tB,\340A\002\372A&\n$dialogflow"
          + ".googleapis.com/EntityType\022\017\n\007is_list\030\004 "
          + "\001(\010\022[\n\rfill_behavior\030\007 \001(\0132?.google.clou"
          + "d.dialogflow.cx.v3beta1.Form.Parameter.F"
          + "illBehaviorB\003\340A\002\022-\n\rdefault_value\030\t \001(\0132"
          + "\026.google.protobuf.Value\022\016\n\006redact\030\013 \001(\010\022"
          + "O\n\021advanced_settings\030\014 \001(\01324.google.clou"
          + "d.dialogflow.cx.v3beta1.AdvancedSettings"
          + "\032\273\001\n\014FillBehavior\022X\n\032initial_prompt_fulf"
          + "illment\030\003 \001(\0132/.google.cloud.dialogflow."
          + "cx.v3beta1.FulfillmentB\003\340A\002\022Q\n\027reprompt_"
          + "event_handlers\030\005 \003(\01320.google.cloud.dial"
          + "ogflow.cx.v3beta1.EventHandler\"\311\002\n\014Event"
          + "Handler\022\021\n\004name\030\006 \001(\tB\003\340A\003\022\022\n\005event\030\004 \001("
          + "\tB\003\340A\002\022L\n\023trigger_fulfillment\030\005 \001(\0132/.go"
          + "ogle.cloud.dialogflow.cx.v3beta1.Fulfill"
          + "ment\022:\n\013target_page\030\002 \001(\tB#\372A \n\036dialogfl"
          + "ow.googleapis.com/PageH\000\022:\n\013target_flow\030"
          + "\003 \001(\tB#\372A \n\036dialogflow.googleapis.com/Fl"
          + "owH\000\022B\n\017target_playbook\030\007 \001(\tB\'\372A$\n\"dial"
          + "ogflow.googleapis.com/PlaybookH\000B\010\n\006targ"
          + "et\"\330\002\n\017TransitionRoute\022\021\n\004name\030\006 \001(\tB\003\340A"
          + "\003\022\030\n\013description\030\010 \001(\tB\003\340A\001\0225\n\006intent\030\001 "
          + "\001(\tB%\372A\"\n dialogflow.googleapis.com/Inte"
          + "nt\022\021\n\tcondition\030\002 \001(\t\022L\n\023trigger_fulfill"
          + "ment\030\003 \001(\0132/.google.cloud.dialogflow.cx."
          + "v3beta1.Fulfillment\022:\n\013target_page\030\004 \001(\t"
          + "B#\372A \n\036dialogflow.googleapis.com/PageH\000\022"
          + ":\n\013target_flow\030\005 \001(\tB#\372A \n\036dialogflow.go"
          + "ogleapis.com/FlowH\000B\010\n\006target\"\210\001\n\020ListPa"
          + "gesRequest\0226\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dial"
          + "ogflow.googleapis.com/Page\022\025\n\rlanguage_c"
          + "ode\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_tok"
          + "en\030\004 \001(\t\"e\n\021ListPagesResponse\0227\n\005pages\030\001"
          + " \003(\0132(.google.cloud.dialogflow.cx.v3beta"
          + "1.Page\022\027\n\017next_page_token\030\002 \001(\t\"]\n\016GetPa"
          + "geRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogf"
          + "low.googleapis.com/Page\022\025\n\rlanguage_code"
          + "\030\002 \001(\t\"\237\001\n\021CreatePageRequest\0226\n\006parent\030\001"
          + " \001(\tB&\340A\002\372A \022\036dialogflow.googleapis.com/"
          + "Page\022;\n\004page\030\002 \001(\0132(.google.cloud.dialog"
          + "flow.cx.v3beta1.PageB\003\340A\002\022\025\n\rlanguage_co"
          + "de\030\003 \001(\t\"\230\001\n\021UpdatePageRequest\022;\n\004page\030\001"
          + " \001(\0132(.google.cloud.dialogflow.cx.v3beta"
          + "1.PageB\003\340A\002\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013up"
          + "date_mask\030\003 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"X\n\021DeletePageRequest\0224\n\004name\030\001 \001(\tB&"
          + "\340A\002\372A \n\036dialogflow.googleapis.com/Page\022\r"
          + "\n\005force\030\002 \001(\010\"\333\002\n\032KnowledgeConnectorSett"
          + "ings\022\017\n\007enabled\030\001 \001(\010\022L\n\023trigger_fulfill"
          + "ment\030\003 \001(\0132/.google.cloud.dialogflow.cx."
          + "v3beta1.Fulfillment\022:\n\013target_page\030\004 \001(\t"
          + "B#\372A \n\036dialogflow.googleapis.com/PageH\000\022"
          + ":\n\013target_flow\030\005 \001(\tB#\372A \n\036dialogflow.go"
          + "ogleapis.com/FlowH\000\022\\\n\026data_store_connec"
          + "tions\030\006 \003(\01327.google.cloud.dialogflow.cx"
          + ".v3beta1.DataStoreConnectionB\003\340A\001B\010\n\006tar"
          + "get2\332\010\n\005Pages\022\312\001\n\tListPages\0224.google.clo"
          + "ud.dialogflow.cx.v3beta1.ListPagesReques"
          + "t\0325.google.cloud.dialogflow.cx.v3beta1.L"
          + "istPagesResponse\"P\332A\006parent\202\323\344\223\002A\022?/v3be"
          + "ta1/{parent=projects/*/locations/*/agent"
          + "s/*/flows/*}/pages\022\267\001\n\007GetPage\0222.google."
          + "cloud.dialogflow.cx.v3beta1.GetPageReque"
          + "st\032(.google.cloud.dialogflow.cx.v3beta1."
          + "Page\"N\332A\004name\202\323\344\223\002A\022?/v3beta1/{name=proj"
          + "ects/*/locations/*/agents/*/flows/*/page"
          + "s/*}\022\312\001\n\nCreatePage\0225.google.cloud.dialo"
          + "gflow.cx.v3beta1.CreatePageRequest\032(.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.Page\"[\332A"
          + "\013parent,page\202\323\344\223\002G\"?/v3beta1/{parent=pro"
          + "jects/*/locations/*/agents/*/flows/*}/pa"
          + "ges:\004page\022\324\001\n\nUpdatePage\0225.google.cloud."
          + "dialogflow.cx.v3beta1.UpdatePageRequest\032"
          + "(.google.cloud.dialogflow.cx.v3beta1.Pag"
          + "e\"e\332A\020page,update_mask\202\323\344\223\002L2D/v3beta1/{"
          + "page.name=projects/*/locations/*/agents/"
          + "*/flows/*/pages/*}:\004page\022\253\001\n\nDeletePage\022"
          + "5.google.cloud.dialogflow.cx.v3beta1.Del"
          + "etePageRequest\032\026.google.protobuf.Empty\"N"
          + "\332A\004name\202\323\344\223\002A*?/v3beta1/{name=projects/*"
          + "/locations/*/agents/*/flows/*/pages/*}\032x"
          + "\312A\031dialogflow.googleapis.com\322AYhttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/dialogflow"
          + "B\303\001\n&com.google.cloud.dialogflow.cx.v3be"
          + "ta1B\tPageProtoP\001Z6cloud.google.com/go/di"
          + "alogflow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF"
          + "\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1\352\002&"
          + "Google::Cloud::Dialogflow::CX::V3beta1b\006"
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
              com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnectionProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.FulfillmentProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Page_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Page_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Page_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "EntryFulfillment",
              "Form",
              "TransitionRouteGroups",
              "TransitionRoutes",
              "EventHandlers",
              "AdvancedSettings",
              "KnowledgeConnectorSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Form_descriptor,
            new java.lang.String[] {
              "Parameters",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Form_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "Required",
              "EntityType",
              "IsList",
              "FillBehavior",
              "DefaultValue",
              "Redact",
              "AdvancedSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_FillBehavior_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_FillBehavior_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Form_Parameter_FillBehavior_descriptor,
            new java.lang.String[] {
              "InitialPromptFulfillment", "RepromptEventHandlers",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_EventHandler_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_EventHandler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_EventHandler_descriptor,
            new java.lang.String[] {
              "Name",
              "Event",
              "TriggerFulfillment",
              "TargetPage",
              "TargetFlow",
              "TargetPlaybook",
              "Target",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRoute_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRoute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRoute_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Intent",
              "Condition",
              "TriggerFulfillment",
              "TargetPage",
              "TargetFlow",
              "Target",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListPagesResponse_descriptor,
            new java.lang.String[] {
              "Pages", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetPageRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetPageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetPageRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreatePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreatePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreatePageRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Page", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdatePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdatePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdatePageRequest_descriptor,
            new java.lang.String[] {
              "Page", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeletePageRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeletePageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeletePageRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_KnowledgeConnectorSettings_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_KnowledgeConnectorSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_KnowledgeConnectorSettings_descriptor,
            new java.lang.String[] {
              "Enabled",
              "TriggerFulfillment",
              "TargetPage",
              "TargetFlow",
              "DataStoreConnections",
              "Target",
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
    com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnectionProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.FulfillmentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
