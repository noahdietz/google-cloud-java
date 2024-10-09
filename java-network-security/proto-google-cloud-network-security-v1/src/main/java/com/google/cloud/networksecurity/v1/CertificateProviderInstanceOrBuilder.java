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
// source: google/cloud/networksecurity/v1/tls.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networksecurity.v1;

public interface CertificateProviderInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.CertificateProviderInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Plugin instance name, used to locate and load CertificateProvider instance
   * configuration. Set to "google_cloud_private_spiffe" to use Certificate
   * Authority Service certificate provider instance.
   * </pre>
   *
   * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pluginInstance.
   */
  java.lang.String getPluginInstance();
  /**
   *
   *
   * <pre>
   * Required. Plugin instance name, used to locate and load CertificateProvider instance
   * configuration. Set to "google_cloud_private_spiffe" to use Certificate
   * Authority Service certificate provider instance.
   * </pre>
   *
   * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for pluginInstance.
   */
  com.google.protobuf.ByteString getPluginInstanceBytes();
}
