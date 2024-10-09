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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface MetadataLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.MetadataLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of metadata containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of metadata containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataType type = 1;</code>
   *
   * @return The type.
   */
  com.google.privacy.dlp.v2.MetadataType getType();

  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   *
   * @return Whether the storageLabel field is set.
   */
  boolean hasStorageLabel();
  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   *
   * @return The storageLabel.
   */
  com.google.privacy.dlp.v2.StorageMetadataLabel getStorageLabel();
  /**
   *
   *
   * <pre>
   * Storage metadata.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StorageMetadataLabel storage_label = 3;</code>
   */
  com.google.privacy.dlp.v2.StorageMetadataLabelOrBuilder getStorageLabelOrBuilder();

  com.google.privacy.dlp.v2.MetadataLocation.LabelCase getLabelCase();
}
