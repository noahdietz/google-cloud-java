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
// source: google/cloud/securitycenter/v1p1beta1/resource.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1p1beta1;

public interface ResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
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
   * The full resource name of the resource. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
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
   * The full resource name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The full resource name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The human readable name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project_display_name = 3;</code>
   *
   * @return The projectDisplayName.
   */
  java.lang.String getProjectDisplayName();
  /**
   *
   *
   * <pre>
   * The human readable name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project_display_name = 3;</code>
   *
   * @return The bytes for projectDisplayName.
   */
  com.google.protobuf.ByteString getProjectDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The full resource name of resource's parent.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The full resource name of resource's parent.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The human readable name of resource's parent.
   * </pre>
   *
   * <code>string parent_display_name = 5;</code>
   *
   * @return The parentDisplayName.
   */
  java.lang.String getParentDisplayName();
  /**
   *
   *
   * <pre>
   * The human readable name of resource's parent.
   * </pre>
   *
   * <code>string parent_display_name = 5;</code>
   *
   * @return The bytes for parentDisplayName.
   */
  com.google.protobuf.ByteString getParentDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets ancestry.
   * The first folder is the deepest nested folder, and the last folder is the
   * folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v1p1beta1.Folder folders = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.v1p1beta1.Folder> getFoldersList();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets ancestry.
   * The first folder is the deepest nested folder, and the last folder is the
   * folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v1p1beta1.Folder folders = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1p1beta1.Folder getFolders(int index);
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets ancestry.
   * The first folder is the deepest nested folder, and the last folder is the
   * folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v1p1beta1.Folder folders = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getFoldersCount();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets ancestry.
   * The first folder is the deepest nested folder, and the last folder is the
   * folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v1p1beta1.Folder folders = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1p1beta1.FolderOrBuilder>
      getFoldersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets ancestry.
   * The first folder is the deepest nested folder, and the last folder is the
   * folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v1p1beta1.Folder folders = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1p1beta1.FolderOrBuilder getFoldersOrBuilder(int index);
}
