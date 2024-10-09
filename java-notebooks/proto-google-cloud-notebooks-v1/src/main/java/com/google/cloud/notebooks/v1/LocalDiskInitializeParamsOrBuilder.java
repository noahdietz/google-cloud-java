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
// source: google/cloud/notebooks/v1/runtime.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v1;

public interface LocalDiskInitializeParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.LocalDiskInitializeParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Provide this property when creating the disk.
   * </pre>
   *
   * <code>string description = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Provide this property when creating the disk.
   * </pre>
   *
   * <code>string description = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the disk name. If not specified, the default is to use the name
   * of the instance. If the disk with the instance name exists already in the
   * given zone/region, a new name will be automatically generated.
   * </pre>
   *
   * <code>string disk_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskName.
   */
  java.lang.String getDiskName();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the disk name. If not specified, the default is to use the name
   * of the instance. If the disk with the instance name exists already in the
   * given zone/region, a new name will be automatically generated.
   * </pre>
   *
   * <code>string disk_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for diskName.
   */
  com.google.protobuf.ByteString getDiskNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk
   * will be the same size as the image (usually 10GB). If specified, the size
   * must be equal to or larger than 10GB. Default 100 GB.
   * </pre>
   *
   * <code>int64 disk_size_gb = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Input only. The type of the boot disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.LocalDiskInitializeParams.DiskType disk_type = 4 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for diskType.
   */
  int getDiskTypeValue();
  /**
   *
   *
   * <pre>
   * Input only. The type of the boot disk attached to this instance, defaults to
   * standard persistent disk (`PD_STANDARD`).
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.LocalDiskInitializeParams.DiskType disk_type = 4 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The diskType.
   */
  com.google.cloud.notebooks.v1.LocalDiskInitializeParams.DiskType getDiskType();

  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this disk. These can be later modified by the
   * disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this disk. These can be later modified by the
   * disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this disk. These can be later modified by the
   * disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels to apply to this disk. These can be later modified by the
   * disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels to apply to this disk. These can be later modified by the
   * disks.setLabels method. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
