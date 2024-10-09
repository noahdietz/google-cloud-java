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
// source: google/apps/script/type/extension_point.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.script.type;

public final class ExtensionPoint {
  private ExtensionPoint() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_MenuItemExtensionPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_MenuItemExtensionPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_HomepageExtensionPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_UniversalActionExtensionPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/apps/script/type/extension_poin"
          + "t.proto\022\027google.apps.script.type\032\036google"
          + "/protobuf/wrappers.proto\"O\n\026MenuItemExte"
          + "nsionPoint\022\024\n\014run_function\030\001 \001(\t\022\r\n\005labe"
          + "l\030\002 \001(\t\022\020\n\010logo_url\030\003 \001(\t\"[\n\026HomepageExt"
          + "ensionPoint\022\024\n\014run_function\030\001 \001(\t\022+\n\007ena"
          + "bled\030\002 \001(\0132\032.google.protobuf.BoolValue\"j"
          + "\n\035UniversalActionExtensionPoint\022\r\n\005label"
          + "\030\001 \001(\t\022\023\n\topen_link\030\002 \001(\tH\000\022\026\n\014run_funct"
          + "ion\030\003 \001(\tH\000B\r\n\013action_typeB\250\001\n\033com.googl"
          + "e.apps.script.typeP\001Z6google.golang.org/"
          + "genproto/googleapis/apps/script/type\252\002\027G"
          + "oogle.Apps.Script.Type\312\002\027Google\\Apps\\Scr"
          + "ipt\\Type\352\002\032Google::Apps::Script::Typeb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_apps_script_type_MenuItemExtensionPoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_script_type_MenuItemExtensionPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_MenuItemExtensionPoint_descriptor,
            new java.lang.String[] {
              "RunFunction", "Label", "LogoUrl",
            });
    internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_script_type_HomepageExtensionPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_HomepageExtensionPoint_descriptor,
            new java.lang.String[] {
              "RunFunction", "Enabled",
            });
    internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_apps_script_type_UniversalActionExtensionPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor,
            new java.lang.String[] {
              "Label", "OpenLink", "RunFunction", "ActionType",
            });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
