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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface SslConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.SslConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The ssl config type according to 'client_key',
   * 'client_certificate' and 'ca_certificate'.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SslConfig.SslType type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The ssl config type according to 'client_key',
   * 'client_certificate' and 'ca_certificate'.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.SslConfig.SslType type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.clouddms.v1.SslConfig.SslType getType();

  /**
   *
   *
   * <pre>
   * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key
   * associated with the Client Certificate. If this field is used then the
   * 'client_certificate' field is mandatory.
   * </pre>
   *
   * <code>string client_key = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The clientKey.
   */
  java.lang.String getClientKey();
  /**
   *
   *
   * <pre>
   * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key
   * associated with the Client Certificate. If this field is used then the
   * 'client_certificate' field is mandatory.
   * </pre>
   *
   * <code>string client_key = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for clientKey.
   */
  com.google.protobuf.ByteString getClientKeyBytes();

  /**
   *
   *
   * <pre>
   * Input only. The x509 PEM-encoded certificate that will be used by the
   * replica to authenticate against the source database server.If this field is
   * used then the 'client_key' field is mandatory.
   * </pre>
   *
   * <code>string client_certificate = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The clientCertificate.
   */
  java.lang.String getClientCertificate();
  /**
   *
   *
   * <pre>
   * Input only. The x509 PEM-encoded certificate that will be used by the
   * replica to authenticate against the source database server.If this field is
   * used then the 'client_key' field is mandatory.
   * </pre>
   *
   * <code>string client_certificate = 3 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for clientCertificate.
   */
  com.google.protobuf.ByteString getClientCertificateBytes();

  /**
   *
   *
   * <pre>
   * Required. Input only. The x509 PEM-encoded certificate of the CA that
   * signed the source database server's certificate. The replica will use this
   * certificate to verify it's connecting to the right host.
   * </pre>
   *
   * <code>
   * string ca_certificate = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The caCertificate.
   */
  java.lang.String getCaCertificate();
  /**
   *
   *
   * <pre>
   * Required. Input only. The x509 PEM-encoded certificate of the CA that
   * signed the source database server's certificate. The replica will use this
   * certificate to verify it's connecting to the right host.
   * </pre>
   *
   * <code>
   * string ca_certificate = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for caCertificate.
   */
  com.google.protobuf.ByteString getCaCertificateBytes();
}
