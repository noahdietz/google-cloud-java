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
// source: google/cloud/security/privateca/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1;

public interface FetchCaCertsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.FetchCaCertsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The PEM encoded CA certificate chains of all certificate authorities in
   * this [CaPool][google.cloud.security.privateca.v1.CaPool] in the ENABLED,
   * DISABLED, or STAGED states.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain ca_certs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain>
      getCaCertsList();
  /**
   *
   *
   * <pre>
   * The PEM encoded CA certificate chains of all certificate authorities in
   * this [CaPool][google.cloud.security.privateca.v1.CaPool] in the ENABLED,
   * DISABLED, or STAGED states.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain ca_certs = 1;
   * </code>
   */
  com.google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain getCaCerts(int index);
  /**
   *
   *
   * <pre>
   * The PEM encoded CA certificate chains of all certificate authorities in
   * this [CaPool][google.cloud.security.privateca.v1.CaPool] in the ENABLED,
   * DISABLED, or STAGED states.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain ca_certs = 1;
   * </code>
   */
  int getCaCertsCount();
  /**
   *
   *
   * <pre>
   * The PEM encoded CA certificate chains of all certificate authorities in
   * this [CaPool][google.cloud.security.privateca.v1.CaPool] in the ENABLED,
   * DISABLED, or STAGED states.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain ca_certs = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChainOrBuilder>
      getCaCertsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The PEM encoded CA certificate chains of all certificate authorities in
   * this [CaPool][google.cloud.security.privateca.v1.CaPool] in the ENABLED,
   * DISABLED, or STAGED states.
   * </pre>
   *
   * <code>repeated .google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChain ca_certs = 1;
   * </code>
   */
  com.google.cloud.security.privateca.v1.FetchCaCertsResponse.CertChainOrBuilder
      getCaCertsOrBuilder(int index);
}
