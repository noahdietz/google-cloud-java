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
// source: google/cloud/security/privateca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1beta1;

public interface CertificateRevocationListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.CertificateRevocationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource path for this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] in
   * the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;
   *    certificateRevocationLists/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource path for this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] in
   * the format
   * `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;&#47;
   *    certificateRevocationLists/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The CRL sequence number that appears in pem_crl.
   * </pre>
   *
   * <code>int64 sequence_number = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sequenceNumber.
   */
  long getSequenceNumber();

  /**
   *
   *
   * <pre>
   * Output only. The revoked serial numbers that appear in pem_crl.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate revoked_certificates = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          com.google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate>
      getRevokedCertificatesList();
  /**
   *
   *
   * <pre>
   * Output only. The revoked serial numbers that appear in pem_crl.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate revoked_certificates = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate
      getRevokedCertificates(int index);
  /**
   *
   *
   * <pre>
   * Output only. The revoked serial numbers that appear in pem_crl.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate revoked_certificates = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRevokedCertificatesCount();
  /**
   *
   *
   * <pre>
   * Output only. The revoked serial numbers that appear in pem_crl.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate revoked_certificates = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.security.privateca.v1beta1.CertificateRevocationList
                  .RevokedCertificateOrBuilder>
      getRevokedCertificatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The revoked serial numbers that appear in pem_crl.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificate revoked_certificates = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateRevocationList.RevokedCertificateOrBuilder
      getRevokedCertificatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded X.509 CRL.
   * </pre>
   *
   * <code>string pem_crl = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pemCrl.
   */
  java.lang.String getPemCrl();
  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded X.509 CRL.
   * </pre>
   *
   * <code>string pem_crl = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pemCrl.
   */
  com.google.protobuf.ByteString getPemCrlBytes();

  /**
   *
   *
   * <pre>
   * Output only. The location where 'pem_crl' can be accessed.
   * </pre>
   *
   * <code>string access_url = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The accessUrl.
   */
  java.lang.String getAccessUrl();
  /**
   *
   *
   * <pre>
   * Output only. The location where 'pem_crl' can be accessed.
   * </pre>
   *
   * <code>string access_url = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for accessUrl.
   */
  com.google.protobuf.ByteString getAccessUrlBytes();

  /**
   *
   *
   * <pre>
   * Output only. The [State][google.cloud.security.privateca.v1beta1.CertificateRevocationList.State] for this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateRevocationList.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The [State][google.cloud.security.privateca.v1beta1.CertificateRevocationList.State] for this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateRevocationList.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateRevocationList.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateRevocationList][google.cloud.security.privateca.v1beta1.CertificateRevocationList] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
