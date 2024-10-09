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
// source: google/cloud/securitycenter/v1/vulnerability.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

public interface CveOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Cve)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier for the vulnerability. e.g. CVE-2021-34527
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The unique identifier for the vulnerability. e.g. CVE-2021-34527
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.Reference> getReferencesList();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v1.Reference getReferences(int index);
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  int getReferencesCount();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.ReferenceOrBuilder>
      getReferencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v1.ReferenceOrBuilder getReferencesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   *
   * @return Whether the cvssv3 field is set.
   */
  boolean hasCvssv3();
  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   *
   * @return The cvssv3.
   */
  com.google.cloud.securitycenter.v1.Cvssv3 getCvssv3();
  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   */
  com.google.cloud.securitycenter.v1.Cvssv3OrBuilder getCvssv3OrBuilder();

  /**
   *
   *
   * <pre>
   * Whether upstream fix is available for the CVE.
   * </pre>
   *
   * <code>bool upstream_fix_available = 4;</code>
   *
   * @return The upstreamFixAvailable.
   */
  boolean getUpstreamFixAvailable();

  /**
   *
   *
   * <pre>
   * The potential impact of the vulnerability if it was to be exploited.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cve.RiskRating impact = 5;</code>
   *
   * @return The enum numeric value on the wire for impact.
   */
  int getImpactValue();
  /**
   *
   *
   * <pre>
   * The potential impact of the vulnerability if it was to be exploited.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cve.RiskRating impact = 5;</code>
   *
   * @return The impact.
   */
  com.google.cloud.securitycenter.v1.Cve.RiskRating getImpact();

  /**
   *
   *
   * <pre>
   * The exploitation activity of the vulnerability in the wild.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cve.ExploitationActivity exploitation_activity = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for exploitationActivity.
   */
  int getExploitationActivityValue();
  /**
   *
   *
   * <pre>
   * The exploitation activity of the vulnerability in the wild.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cve.ExploitationActivity exploitation_activity = 6;
   * </code>
   *
   * @return The exploitationActivity.
   */
  com.google.cloud.securitycenter.v1.Cve.ExploitationActivity getExploitationActivity();

  /**
   *
   *
   * <pre>
   * Whether or not the vulnerability has been observed in the wild.
   * </pre>
   *
   * <code>bool observed_in_the_wild = 7;</code>
   *
   * @return The observedInTheWild.
   */
  boolean getObservedInTheWild();

  /**
   *
   *
   * <pre>
   * Whether or not the vulnerability was zero day when the finding was
   * published.
   * </pre>
   *
   * <code>bool zero_day = 8;</code>
   *
   * @return The zeroDay.
   */
  boolean getZeroDay();

  /**
   *
   *
   * <pre>
   * Date the first publicly available exploit or PoC was released.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp exploit_release_date = 9;</code>
   *
   * @return Whether the exploitReleaseDate field is set.
   */
  boolean hasExploitReleaseDate();
  /**
   *
   *
   * <pre>
   * Date the first publicly available exploit or PoC was released.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp exploit_release_date = 9;</code>
   *
   * @return The exploitReleaseDate.
   */
  com.google.protobuf.Timestamp getExploitReleaseDate();
  /**
   *
   *
   * <pre>
   * Date the first publicly available exploit or PoC was released.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp exploit_release_date = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExploitReleaseDateOrBuilder();
}
