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
// source: google/cloud/gkeconnect/gateway/v1beta1/control.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkeconnect.gateway.v1beta1;

public interface GenerateCredentialsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkeconnect.gateway.v1beta1.GenerateCredentialsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A full YAML kubeconfig in serialized format.
   * </pre>
   *
   * <code>bytes kubeconfig = 1;</code>
   *
   * @return The kubeconfig.
   */
  com.google.protobuf.ByteString getKubeconfig();

  /**
   *
   *
   * <pre>
   * The generated URI of the cluster as accessed through the Connect Gateway
   * API.
   * </pre>
   *
   * <code>string endpoint = 2;</code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * The generated URI of the cluster as accessed through the Connect Gateway
   * API.
   * </pre>
   *
   * <code>string endpoint = 2;</code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();
}
