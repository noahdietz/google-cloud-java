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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.migrationcenter.v1;

public interface GuestConfigDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GuestConfigDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * OS issue (typically /etc/issue in Linux).
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The issue.
   */
  java.lang.String getIssue();
  /**
   *
   *
   * <pre>
   * OS issue (typically /etc/issue in Linux).
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The bytes for issue.
   */
  com.google.protobuf.ByteString getIssueBytes();

  /**
   *
   *
   * <pre>
   * Mount list (Linux fstab).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.FstabEntryList fstab = 2;</code>
   *
   * @return Whether the fstab field is set.
   */
  boolean hasFstab();
  /**
   *
   *
   * <pre>
   * Mount list (Linux fstab).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.FstabEntryList fstab = 2;</code>
   *
   * @return The fstab.
   */
  com.google.cloud.migrationcenter.v1.FstabEntryList getFstab();
  /**
   *
   *
   * <pre>
   * Mount list (Linux fstab).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.FstabEntryList fstab = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.FstabEntryListOrBuilder getFstabOrBuilder();

  /**
   *
   *
   * <pre>
   * Hosts file (/etc/hosts).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.HostsEntryList hosts = 3;</code>
   *
   * @return Whether the hosts field is set.
   */
  boolean hasHosts();
  /**
   *
   *
   * <pre>
   * Hosts file (/etc/hosts).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.HostsEntryList hosts = 3;</code>
   *
   * @return The hosts.
   */
  com.google.cloud.migrationcenter.v1.HostsEntryList getHosts();
  /**
   *
   *
   * <pre>
   * Hosts file (/etc/hosts).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.HostsEntryList hosts = 3;</code>
   */
  com.google.cloud.migrationcenter.v1.HostsEntryListOrBuilder getHostsOrBuilder();

  /**
   *
   *
   * <pre>
   * NFS exports.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NfsExportList nfs_exports = 4;</code>
   *
   * @return Whether the nfsExports field is set.
   */
  boolean hasNfsExports();
  /**
   *
   *
   * <pre>
   * NFS exports.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NfsExportList nfs_exports = 4;</code>
   *
   * @return The nfsExports.
   */
  com.google.cloud.migrationcenter.v1.NfsExportList getNfsExports();
  /**
   *
   *
   * <pre>
   * NFS exports.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NfsExportList nfs_exports = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.NfsExportListOrBuilder getNfsExportsOrBuilder();

  /**
   *
   *
   * <pre>
   * Security-Enhanced Linux (SELinux) mode.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestConfigDetails.SeLinuxMode selinux_mode = 5;</code>
   *
   * @return The enum numeric value on the wire for selinuxMode.
   */
  int getSelinuxModeValue();
  /**
   *
   *
   * <pre>
   * Security-Enhanced Linux (SELinux) mode.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestConfigDetails.SeLinuxMode selinux_mode = 5;</code>
   *
   * @return The selinuxMode.
   */
  com.google.cloud.migrationcenter.v1.GuestConfigDetails.SeLinuxMode getSelinuxMode();
}
