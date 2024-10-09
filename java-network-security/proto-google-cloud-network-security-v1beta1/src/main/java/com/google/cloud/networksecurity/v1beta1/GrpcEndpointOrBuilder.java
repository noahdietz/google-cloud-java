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
// source: google/cloud/networksecurity/v1beta1/tls.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networksecurity.v1beta1;

public interface GrpcEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.GrpcEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The target URI of the gRPC endpoint. Only UDS path is supported,
   * and should start with "unix:".
   * </pre>
   *
   * <code>string target_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetUri.
   */
  java.lang.String getTargetUri();
  /**
   *
   *
   * <pre>
   * Required. The target URI of the gRPC endpoint. Only UDS path is supported,
   * and should start with "unix:".
   * </pre>
   *
   * <code>string target_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetUri.
   */
  com.google.protobuf.ByteString getTargetUriBytes();
}
