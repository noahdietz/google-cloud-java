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
// source: google/cloud/run/v2/revision_template.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

public interface RevisionTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.RevisionTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The unique name for the revision. If this field is omitted, it
   * will be automatically generated based on the Service name.
   * </pre>
   *
   * <code>
   * string revision = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   *
   *
   * <pre>
   * Optional. The unique name for the revision. If this field is omitted, it
   * will be automatically generated based on the Service name.
   * </pre>
   *
   * <code>
   * string revision = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 RevisionTemplate.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 RevisionTemplate.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 RevisionTemplate.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 RevisionTemplate.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels.
   *
   * &lt;p&gt;Cloud Run API v2 does not support labels with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system labels in v1 now have a
   * corresponding field in v2 RevisionTemplate.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that may be set by external tools to
   * store and arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system annotations in v1 now
   * have a corresponding field in v2 RevisionTemplate.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that may be set by external tools to
   * store and arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system annotations in v1 now
   * have a corresponding field in v2 RevisionTemplate.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that may be set by external tools to
   * store and arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system annotations in v1 now
   * have a corresponding field in v2 RevisionTemplate.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that may be set by external tools to
   * store and arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system annotations in v1 now
   * have a corresponding field in v2 RevisionTemplate.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Unstructured key value map that may be set by external tools to
   * store and arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects.
   *
   * &lt;p&gt;Cloud Run API v2 does not support annotations with `run.googleapis.com`,
   * `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev`
   * namespaces, and they will be rejected. All system annotations in v1 now
   * have a corresponding field in v2 RevisionTemplate.
   *
   * &lt;p&gt;This field follows Kubernetes annotations' namespacing, limits, and
   * rules.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Scaling settings for this Revision.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.RevisionScaling scaling = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scaling field is set.
   */
  boolean hasScaling();
  /**
   *
   *
   * <pre>
   * Optional. Scaling settings for this Revision.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.RevisionScaling scaling = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scaling.
   */
  com.google.cloud.run.v2.RevisionScaling getScaling();
  /**
   *
   *
   * <pre>
   * Optional. Scaling settings for this Revision.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.RevisionScaling scaling = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.RevisionScalingOrBuilder getScalingOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Revision. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the vpcAccess field is set.
   */
  boolean hasVpcAccess();
  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Revision. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The vpcAccess.
   */
  com.google.cloud.run.v2.VpcAccess getVpcAccess();
  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Revision. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.VpcAccessOrBuilder getVpcAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Email address of the IAM service account associated with the
   * revision of the service. The service account represents the identity of the
   * running revision, and determines what permissions the revision has. If not
   * provided, the revision will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. Email address of the IAM service account associated with the
   * revision of the service. The service account represents the identity of the
   * running revision, and determines what permissions the revision has. If not
   * provided, the revision will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  java.util.List<com.google.cloud.run.v2.Container> getContainersList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  com.google.cloud.run.v2.Container getContainers(int index);
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  int getContainersCount();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ContainerOrBuilder> getContainersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  com.google.cloud.run.v2.ContainerOrBuilder getContainersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.run.v2.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.run.v2.VolumeOrBuilder> getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The sandbox environment to host this Revision.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionEnvironment execution_environment = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for executionEnvironment.
   */
  int getExecutionEnvironmentValue();
  /**
   *
   *
   * <pre>
   * Optional. The sandbox environment to host this Revision.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionEnvironment execution_environment = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionEnvironment.
   */
  com.google.cloud.run.v2.ExecutionEnvironment getExecutionEnvironment();

  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 14 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();
  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 14 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString getEncryptionKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Sets the maximum number of requests that each serving instance
   * can receive. If not specified or 0, defaults to 80 when requested
   * `CPU &gt;= 1` and defaults to 1 when requested `CPU &lt; 1`.
   * </pre>
   *
   * <code>int32 max_instance_request_concurrency = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maxInstanceRequestConcurrency.
   */
  int getMaxInstanceRequestConcurrency();

  /**
   *
   *
   * <pre>
   * Optional. Enables service mesh connectivity.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ServiceMesh service_mesh = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceMesh field is set.
   */
  boolean hasServiceMesh();
  /**
   *
   *
   * <pre>
   * Optional. Enables service mesh connectivity.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ServiceMesh service_mesh = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceMesh.
   */
  com.google.cloud.run.v2.ServiceMesh getServiceMesh();
  /**
   *
   *
   * <pre>
   * Optional. Enables service mesh connectivity.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ServiceMesh service_mesh = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.ServiceMeshOrBuilder getServiceMeshOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Enable session affinity.
   * </pre>
   *
   * <code>bool session_affinity = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sessionAffinity.
   */
  boolean getSessionAffinity();

  /**
   *
   *
   * <pre>
   * Optional. Disables health checking containers during deployment.
   * </pre>
   *
   * <code>bool health_check_disabled = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The healthCheckDisabled.
   */
  boolean getHealthCheckDisabled();

  /**
   *
   *
   * <pre>
   * Optional. The node selector for the revision template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   *
   *
   * <pre>
   * Optional. The node selector for the revision template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nodeSelector.
   */
  com.google.cloud.run.v2.NodeSelector getNodeSelector();
  /**
   *
   *
   * <pre>
   * Optional. The node selector for the revision template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.NodeSelectorOrBuilder getNodeSelectorOrBuilder();
}
