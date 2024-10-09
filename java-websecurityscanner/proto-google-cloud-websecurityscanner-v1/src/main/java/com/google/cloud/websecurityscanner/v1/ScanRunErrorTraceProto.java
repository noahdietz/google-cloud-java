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
// source: google/cloud/websecurityscanner/v1/scan_run_error_trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1;

public final class ScanRunErrorTraceProto {
  private ScanRunErrorTraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1_ScanRunErrorTrace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanRunErrorTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/websecurityscanner/v1/sca"
          + "n_run_error_trace.proto\022\"google.cloud.we"
          + "bsecurityscanner.v1\032:google/cloud/websec"
          + "urityscanner/v1/scan_config_error.proto\""
          + "\215\003\n\021ScanRunErrorTrace\022H\n\004code\030\001 \001(\0162:.go"
          + "ogle.cloud.websecurityscanner.v1.ScanRun"
          + "ErrorTrace.Code\022N\n\021scan_config_error\030\002 \001"
          + "(\01323.google.cloud.websecurityscanner.v1."
          + "ScanConfigError\022#\n\033most_common_http_erro"
          + "r_code\030\003 \001(\005\"\270\001\n\004Code\022\024\n\020CODE_UNSPECIFIE"
          + "D\020\000\022\022\n\016INTERNAL_ERROR\020\001\022\025\n\021SCAN_CONFIG_I"
          + "SSUE\020\002\022\037\n\033AUTHENTICATION_CONFIG_ISSUE\020\003\022"
          + "\034\n\030TIMED_OUT_WHILE_SCANNING\020\004\022\026\n\022TOO_MAN"
          + "Y_REDIRECTS\020\005\022\030\n\024TOO_MANY_HTTP_ERRORS\020\006B"
          + "\214\002\n&com.google.cloud.websecurityscanner."
          + "v1B\026ScanRunErrorTraceProtoP\001ZVcloud.goog"
          + "le.com/go/websecurityscanner/apiv1/webse"
          + "curityscannerpb;websecurityscannerpb\252\002\"G"
          + "oogle.Cloud.WebSecurityScanner.V1\312\002\"Goog"
          + "le\\Cloud\\WebSecurityScanner\\V1\352\002%Google:"
          + ":Cloud::WebSecurityScanner::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.websecurityscanner.v1.ScanConfigErrorProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1_ScanRunErrorTrace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanRunErrorTrace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1_ScanRunErrorTrace_descriptor,
            new java.lang.String[] {
              "Code", "ScanConfigError", "MostCommonHttpErrorCode",
            });
    com.google.cloud.websecurityscanner.v1.ScanConfigErrorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
