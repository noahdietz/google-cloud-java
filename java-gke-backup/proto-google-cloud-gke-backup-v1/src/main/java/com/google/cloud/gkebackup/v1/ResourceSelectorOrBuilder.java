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
// source: google/cloud/gkebackup/v1/restore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkebackup.v1;

public interface ResourceSelectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.ResourceSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their Kubernetes GroupKinds. If
   * specified, only resources of provided GroupKind will be selected.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.GroupKind group_kind = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the groupKind field is set.
   */
  boolean hasGroupKind();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their Kubernetes GroupKinds. If
   * specified, only resources of provided GroupKind will be selected.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.GroupKind group_kind = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The groupKind.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.GroupKind getGroupKind();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their Kubernetes GroupKinds. If
   * specified, only resources of provided GroupKind will be selected.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig.GroupKind group_kind = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfig.GroupKindOrBuilder getGroupKindOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their resource names. If specified,
   * only resources with the provided name will be selected.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their resource names. If specified,
   * only resources with the provided name will be selected.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their namespaces. This only applies to
   * namespace scoped resources and cannot be used for selecting
   * cluster scoped resources. If specified, only resources in the provided
   * namespace will be selected. If not specified, the filter will apply to
   * both cluster scoped and namespace scoped resources (e.g. name or label).
   * The [Namespace](https://pkg.go.dev/k8s.io/api/core/v1#Namespace) resource
   * itself will be restored if and only if any resources within the namespace
   * are restored.
   * </pre>
   *
   * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using their namespaces. This only applies to
   * namespace scoped resources and cannot be used for selecting
   * cluster scoped resources. If specified, only resources in the provided
   * namespace will be selected. If not specified, the filter will apply to
   * both cluster scoped and namespace scoped resources (e.g. name or label).
   * The [Namespace](https://pkg.go.dev/k8s.io/api/core/v1#Namespace) resource
   * itself will be restored if and only if any resources within the namespace
   * are restored.
   * </pre>
   *
   * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Optional. Selects resources using Kubernetes
   * [labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/).
   * If specified, a resource will be selected if and only if the resource
   * has all of the provided labels and all the label values match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using Kubernetes
   * [labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/).
   * If specified, a resource will be selected if and only if the resource
   * has all of the provided labels and all the label values match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using Kubernetes
   * [labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/).
   * If specified, a resource will be selected if and only if the resource
   * has all of the provided labels and all the label values match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Selects resources using Kubernetes
   * [labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/).
   * If specified, a resource will be selected if and only if the resource
   * has all of the provided labels and all the label values match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Selects resources using Kubernetes
   * [labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/).
   * If specified, a resource will be selected if and only if the resource
   * has all of the provided labels and all the label values match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
