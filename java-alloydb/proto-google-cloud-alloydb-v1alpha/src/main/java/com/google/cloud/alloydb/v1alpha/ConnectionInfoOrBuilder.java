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
// source: google/cloud/alloydb/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public interface ConnectionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.ConnectionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the ConnectionInfo singleton resource, e.g.:
   * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
   * This field currently has no semantic meaning.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the ConnectionInfo singleton resource, e.g.:
   * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
   * This field currently has no semantic meaning.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The private network IP address for the Instance. This is the
   * default IP for the instance and is always created (even if enable_public_ip
   * is set). This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Output only. The private network IP address for the Instance. This is the
   * default IP for the instance and is always created (even if enable_public_ip
   * is set). This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Output only. The public IP addresses for the Instance. This is available
   * ONLY when enable_public_ip is set. This is the connection endpoint for an
   * end-user application.
   * </pre>
   *
   * <code>
   * string public_ip_address = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The publicIpAddress.
   */
  java.lang.String getPublicIpAddress();
  /**
   *
   *
   * <pre>
   * Output only. The public IP addresses for the Instance. This is available
   * ONLY when enable_public_ip is set. This is the connection endpoint for an
   * end-user application.
   * </pre>
   *
   * <code>
   * string public_ip_address = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for publicIpAddress.
   */
  com.google.protobuf.ByteString getPublicIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>
   * repeated string pem_certificate_chain = 3 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1alpha.ConnectionInfo.pem_certificate_chain is deprecated.
   *     See google/cloud/alloydb/v1alpha/resources.proto;l=1032
   * @return A list containing the pemCertificateChain.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getPemCertificateChainList();
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>
   * repeated string pem_certificate_chain = 3 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1alpha.ConnectionInfo.pem_certificate_chain is deprecated.
   *     See google/cloud/alloydb/v1alpha/resources.proto;l=1032
   * @return The count of pemCertificateChain.
   */
  @java.lang.Deprecated
  int getPemCertificateChainCount();
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>
   * repeated string pem_certificate_chain = 3 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1alpha.ConnectionInfo.pem_certificate_chain is deprecated.
   *     See google/cloud/alloydb/v1alpha/resources.proto;l=1032
   * @param index The index of the element to return.
   * @return The pemCertificateChain at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getPemCertificateChain(int index);
  /**
   *
   *
   * <pre>
   * Output only. The pem-encoded chain that may be used to verify the X.509
   * certificate. Expected to be in issuer-to-root order according to RFC 5246.
   * </pre>
   *
   * <code>
   * repeated string pem_certificate_chain = 3 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.alloydb.v1alpha.ConnectionInfo.pem_certificate_chain is deprecated.
   *     See google/cloud/alloydb/v1alpha/resources.proto;l=1032
   * @param index The index of the value to return.
   * @return The bytes of the pemCertificateChain at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getPemCertificateChainBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The unique ID of the Instance.
   * </pre>
   *
   * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceUid.
   */
  java.lang.String getInstanceUid();
  /**
   *
   *
   * <pre>
   * Output only. The unique ID of the Instance.
   * </pre>
   *
   * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceUid.
   */
  com.google.protobuf.ByteString getInstanceUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The DNS name to use with PSC for the Instance.
   * </pre>
   *
   * <code>string psc_dns_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pscDnsName.
   */
  java.lang.String getPscDnsName();
  /**
   *
   *
   * <pre>
   * Output only. The DNS name to use with PSC for the Instance.
   * </pre>
   *
   * <code>string psc_dns_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pscDnsName.
   */
  com.google.protobuf.ByteString getPscDnsNameBytes();
}
