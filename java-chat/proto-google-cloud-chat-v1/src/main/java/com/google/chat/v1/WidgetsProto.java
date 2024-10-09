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
// source: google/chat/v1/widgets.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public final class WidgetsProto {
  private WidgetsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_TextParagraph_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_TextParagraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_Button_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_Button_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_TextButton_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_TextButton_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_KeyValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_Image_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_ImageButton_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_ImageButton_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_OnClick_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_OnClick_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_OpenLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_OpenLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_FormAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_FormAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_WidgetMarkup_FormAction_ActionParameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_WidgetMarkup_FormAction_ActionParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\034google/chat/v1/widgets.proto\022\016google.c"
          + "hat.v1\"\365\016\n\014WidgetMarkup\022D\n\016text_paragrap"
          + "h\030\001 \001(\0132*.google.chat.v1.WidgetMarkup.Te"
          + "xtParagraphH\000\0223\n\005image\030\002 \001(\0132\".google.ch"
          + "at.v1.WidgetMarkup.ImageH\000\022:\n\tkey_value\030"
          + "\003 \001(\0132%.google.chat.v1.WidgetMarkup.KeyV"
          + "alueH\000\0224\n\007buttons\030\006 \003(\0132#.google.chat.v1"
          + ".WidgetMarkup.Button\032\035\n\rTextParagraph\022\014\n"
          + "\004text\030\001 \001(\t\032\222\001\n\006Button\022>\n\013text_button\030\001 "
          + "\001(\0132\'.google.chat.v1.WidgetMarkup.TextBu"
          + "ttonH\000\022@\n\014image_button\030\002 \001(\0132(.google.ch"
          + "at.v1.WidgetMarkup.ImageButtonH\000B\006\n\004type"
          + "\032R\n\nTextButton\022\014\n\004text\030\001 \001(\t\0226\n\010on_click"
          + "\030\002 \001(\0132$.google.chat.v1.WidgetMarkup.OnC"
          + "lick\032\251\002\n\010KeyValue\0221\n\004icon\030\001 \001(\0162!.google"
          + ".chat.v1.WidgetMarkup.IconH\000\022\022\n\010icon_url"
          + "\030\002 \001(\tH\000\022\021\n\ttop_label\030\003 \001(\t\022\017\n\007content\030\004"
          + " \001(\t\022\031\n\021content_multiline\030\t \001(\010\022\024\n\014botto"
          + "m_label\030\005 \001(\t\0226\n\010on_click\030\006 \001(\0132$.google"
          + ".chat.v1.WidgetMarkup.OnClick\0225\n\006button\030"
          + "\007 \001(\0132#.google.chat.v1.WidgetMarkup.Butt"
          + "onH\001B\007\n\005iconsB\t\n\007control\032h\n\005Image\022\021\n\tima"
          + "ge_url\030\001 \001(\t\0226\n\010on_click\030\002 \001(\0132$.google."
          + "chat.v1.WidgetMarkup.OnClick\022\024\n\014aspect_r"
          + "atio\030\003 \001(\001\032\243\001\n\013ImageButton\0221\n\004icon\030\001 \001(\016"
          + "2!.google.chat.v1.WidgetMarkup.IconH\000\022\022\n"
          + "\010icon_url\030\003 \001(\tH\000\0226\n\010on_click\030\002 \001(\0132$.go"
          + "ogle.chat.v1.WidgetMarkup.OnClick\022\014\n\004nam"
          + "e\030\004 \001(\tB\007\n\005icons\032\210\001\n\007OnClick\0229\n\006action\030\001"
          + " \001(\0132\'.google.chat.v1.WidgetMarkup.FormA"
          + "ctionH\000\022:\n\topen_link\030\002 \001(\0132%.google.chat"
          + ".v1.WidgetMarkup.OpenLinkH\000B\006\n\004data\032\027\n\010O"
          + "penLink\022\013\n\003url\030\001 \001(\t\032\244\001\n\nFormAction\022\032\n\022a"
          + "ction_method_name\030\001 \001(\t\022K\n\nparameters\030\002 "
          + "\003(\01327.google.chat.v1.WidgetMarkup.FormAc"
          + "tion.ActionParameter\032-\n\017ActionParameter\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\340\003\n\004Icon\022\024\n\020"
          + "ICON_UNSPECIFIED\020\000\022\014\n\010AIRPLANE\020\001\022\014\n\010BOOK"
          + "MARK\020\032\022\007\n\003BUS\020\031\022\007\n\003CAR\020\t\022\t\n\005CLOCK\020\002\022\034\n\030C"
          + "ONFIRMATION_NUMBER_ICON\020\014\022\n\n\006DOLLAR\020\016\022\017\n"
          + "\013DESCRIPTION\020\033\022\t\n\005EMAIL\020\n\022\023\n\017EVENT_PERFO"
          + "RMER\020\024\022\016\n\nEVENT_SEAT\020\025\022\022\n\016FLIGHT_ARRIVAL"
          + "\020\020\022\024\n\020FLIGHT_DEPARTURE\020\017\022\t\n\005HOTEL\020\006\022\023\n\017H"
          + "OTEL_ROOM_TYPE\020\021\022\n\n\006INVITE\020\023\022\013\n\007MAP_PIN\020"
          + "\003\022\016\n\nMEMBERSHIP\020\030\022\023\n\017MULTIPLE_PEOPLE\020\022\022\t"
          + "\n\005OFFER\020\036\022\n\n\006PERSON\020\013\022\t\n\005PHONE\020\r\022\023\n\017REST"
          + "AURANT_ICON\020\007\022\021\n\rSHOPPING_CART\020\010\022\010\n\004STAR"
          + "\020\005\022\t\n\005STORE\020\026\022\n\n\006TICKET\020\004\022\t\n\005TRAIN\020\027\022\020\n\014"
          + "VIDEO_CAMERA\020\034\022\016\n\nVIDEO_PLAY\020\035B\006\n\004dataB\245"
          + "\001\n\022com.google.chat.v1B\014WidgetsProtoP\001Z,c"
          + "loud.google.com/go/chat/apiv1/chatpb;cha"
          + "tpb\242\002\013DYNAPIProto\252\002\023Google.Apps.Chat.V1\312"
          + "\002\023Google\\Apps\\Chat\\V1\352\002\026Google::Apps::Ch"
          + "at::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_chat_v1_WidgetMarkup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_WidgetMarkup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_descriptor,
            new java.lang.String[] {
              "TextParagraph", "Image", "KeyValue", "Buttons", "Data",
            });
    internal_static_google_chat_v1_WidgetMarkup_TextParagraph_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(0);
    internal_static_google_chat_v1_WidgetMarkup_TextParagraph_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_TextParagraph_descriptor,
            new java.lang.String[] {
              "Text",
            });
    internal_static_google_chat_v1_WidgetMarkup_Button_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(1);
    internal_static_google_chat_v1_WidgetMarkup_Button_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_Button_descriptor,
            new java.lang.String[] {
              "TextButton", "ImageButton", "Type",
            });
    internal_static_google_chat_v1_WidgetMarkup_TextButton_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(2);
    internal_static_google_chat_v1_WidgetMarkup_TextButton_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_TextButton_descriptor,
            new java.lang.String[] {
              "Text", "OnClick",
            });
    internal_static_google_chat_v1_WidgetMarkup_KeyValue_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(3);
    internal_static_google_chat_v1_WidgetMarkup_KeyValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_KeyValue_descriptor,
            new java.lang.String[] {
              "Icon",
              "IconUrl",
              "TopLabel",
              "Content",
              "ContentMultiline",
              "BottomLabel",
              "OnClick",
              "Button",
              "Icons",
              "Control",
            });
    internal_static_google_chat_v1_WidgetMarkup_Image_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(4);
    internal_static_google_chat_v1_WidgetMarkup_Image_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_Image_descriptor,
            new java.lang.String[] {
              "ImageUrl", "OnClick", "AspectRatio",
            });
    internal_static_google_chat_v1_WidgetMarkup_ImageButton_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(5);
    internal_static_google_chat_v1_WidgetMarkup_ImageButton_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_ImageButton_descriptor,
            new java.lang.String[] {
              "Icon", "IconUrl", "OnClick", "Name", "Icons",
            });
    internal_static_google_chat_v1_WidgetMarkup_OnClick_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(6);
    internal_static_google_chat_v1_WidgetMarkup_OnClick_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_OnClick_descriptor,
            new java.lang.String[] {
              "Action", "OpenLink", "Data",
            });
    internal_static_google_chat_v1_WidgetMarkup_OpenLink_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(7);
    internal_static_google_chat_v1_WidgetMarkup_OpenLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_OpenLink_descriptor,
            new java.lang.String[] {
              "Url",
            });
    internal_static_google_chat_v1_WidgetMarkup_FormAction_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_descriptor.getNestedTypes().get(8);
    internal_static_google_chat_v1_WidgetMarkup_FormAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_FormAction_descriptor,
            new java.lang.String[] {
              "ActionMethodName", "Parameters",
            });
    internal_static_google_chat_v1_WidgetMarkup_FormAction_ActionParameter_descriptor =
        internal_static_google_chat_v1_WidgetMarkup_FormAction_descriptor.getNestedTypes().get(0);
    internal_static_google_chat_v1_WidgetMarkup_FormAction_ActionParameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_WidgetMarkup_FormAction_ActionParameter_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
