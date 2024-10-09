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
// source: google/cloud/netapp/v1/backup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public interface CreateBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.CreateBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The NetApp backupVault to create the backups of, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;backupVaults/{backup_vault_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The NetApp backupVault to create the backups of, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;backupVaults/{backup_vault_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified backupVault.
   * Must contain only letters, numbers, underscore and hyphen, with the first
   * character a letter or underscore, the last a letter or underscore or a
   * number, and a 63 character maximum.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified backupVault.
   * Must contain only letters, numbers, underscore and hyphen, with the first
   * character a letter or underscore, the last a letter or underscore or a
   * number, and a 63 character maximum.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A backup resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Required. A backup resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backup.
   */
  com.google.cloud.netapp.v1.Backup getBackup();
  /**
   *
   *
   * <pre>
   * Required. A backup resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.BackupOrBuilder getBackupOrBuilder();
}
