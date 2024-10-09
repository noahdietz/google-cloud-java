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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkemulticloud.v1;

public interface AttachedOidcConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AttachedOidcConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
   * </pre>
   *
   * <code>string issuer_url = 1;</code>
   *
   * @return The issuerUrl.
   */
  java.lang.String getIssuerUrl();
  /**
   *
   *
   * <pre>
   * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
   * </pre>
   *
   * <code>string issuer_url = 1;</code>
   *
   * @return The bytes for issuerUrl.
   */
  com.google.protobuf.ByteString getIssuerUrlBytes();

  /**
   *
   *
   * <pre>
   * Optional. OIDC verification keys in JWKS format (RFC 7517).
   * It contains a list of OIDC verification keys that can be used to verify
   * OIDC JWTs.
   *
   * This field is required for cluster that doesn't have a publicly available
   * discovery endpoint. When provided, it will be directly used
   * to verify the OIDC JWT asserted by the IDP.
   * </pre>
   *
   * <code>bytes jwks = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The jwks.
   */
  com.google.protobuf.ByteString getJwks();
}
