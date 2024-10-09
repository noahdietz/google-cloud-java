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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1beta;

public interface ContinuousBackupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.ContinuousBackupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether ContinuousBackup is enabled.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Whether ContinuousBackup is enabled.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * The number of days that are eligible to restore from using PITR. To support
   * the entire recovery window, backups and logs are retained for one day more
   * than the recovery window. If not set, defaults to 14 days.
   * </pre>
   *
   * <code>int32 recovery_window_days = 4;</code>
   *
   * @return The recoveryWindowDays.
   */
  int getRecoveryWindowDays();

  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 3;</code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 3;</code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.alloydb.v1beta.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 3;</code>
   */
  com.google.cloud.alloydb.v1beta.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();
}
