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
// source: google/cloud/websecurityscanner/v1beta/scan_run_warning_trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1beta;

public interface ScanRunWarningTraceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates the warning code.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Indicates the warning code.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.cloud.websecurityscanner.v1beta.ScanRunWarningTrace.Code getCode();
}
