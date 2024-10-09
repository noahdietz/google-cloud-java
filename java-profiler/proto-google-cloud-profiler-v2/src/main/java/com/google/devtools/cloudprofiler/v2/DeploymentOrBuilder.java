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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.cloudprofiler.v2;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Project ID is the ID of a cloud project.
   * Validation regex: `^[a-z][-a-z0-9:.]{4,61}[a-z0-9]$`.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID is the ID of a cloud project.
   * Validation regex: `^[a-z][-a-z0-9:.]{4,61}[a-z0-9]$`.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Target is the service name used to group related deployments:
   * * Service name for App Engine Flex / Standard.
   * * Cluster and container name for GKE.
   * * User-specified string for direct Compute Engine profiling (e.g. Java).
   * * Job name for Dataflow.
   * Validation regex: `^[a-z0-9]([-a-z0-9_.]{0,253}[a-z0-9])?$`.
   * </pre>
   *
   * <code>string target = 2;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Target is the service name used to group related deployments:
   * * Service name for App Engine Flex / Standard.
   * * Cluster and container name for GKE.
   * * User-specified string for direct Compute Engine profiling (e.g. Java).
   * * Job name for Dataflow.
   * Validation regex: `^[a-z0-9]([-a-z0-9_.]{0,253}[a-z0-9])?$`.
   * </pre>
   *
   * <code>string target = 2;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Labels identify the deployment within the user universe and same target.
   * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * Value for an individual label must be &lt;= 512 bytes, the total
   * size of all label names and values must be &lt;= 1024 bytes.
   *
   * Label named "language" can be used to record the programming language of
   * the profiled deployment. The standard choices for the value include "java",
   * "go", "python", "ruby", "nodejs", "php", "dotnet".
   *
   * For deployments running on Google Cloud Platform, "zone" or "region" label
   * should be present describing the deployment location. An example of a zone
   * is "us-central1-a", an example of a region is "us-central1" or
   * "us-central".
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels identify the deployment within the user universe and same target.
   * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * Value for an individual label must be &lt;= 512 bytes, the total
   * size of all label names and values must be &lt;= 1024 bytes.
   *
   * Label named "language" can be used to record the programming language of
   * the profiled deployment. The standard choices for the value include "java",
   * "go", "python", "ruby", "nodejs", "php", "dotnet".
   *
   * For deployments running on Google Cloud Platform, "zone" or "region" label
   * should be present describing the deployment location. An example of a zone
   * is "us-central1-a", an example of a region is "us-central1" or
   * "us-central".
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels identify the deployment within the user universe and same target.
   * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * Value for an individual label must be &lt;= 512 bytes, the total
   * size of all label names and values must be &lt;= 1024 bytes.
   *
   * Label named "language" can be used to record the programming language of
   * the profiled deployment. The standard choices for the value include "java",
   * "go", "python", "ruby", "nodejs", "php", "dotnet".
   *
   * For deployments running on Google Cloud Platform, "zone" or "region" label
   * should be present describing the deployment location. An example of a zone
   * is "us-central1-a", an example of a region is "us-central1" or
   * "us-central".
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels identify the deployment within the user universe and same target.
   * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * Value for an individual label must be &lt;= 512 bytes, the total
   * size of all label names and values must be &lt;= 1024 bytes.
   *
   * Label named "language" can be used to record the programming language of
   * the profiled deployment. The standard choices for the value include "java",
   * "go", "python", "ruby", "nodejs", "php", "dotnet".
   *
   * For deployments running on Google Cloud Platform, "zone" or "region" label
   * should be present describing the deployment location. An example of a zone
   * is "us-central1-a", an example of a region is "us-central1" or
   * "us-central".
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
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
   * Labels identify the deployment within the user universe and same target.
   * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * Value for an individual label must be &lt;= 512 bytes, the total
   * size of all label names and values must be &lt;= 1024 bytes.
   *
   * Label named "language" can be used to record the programming language of
   * the profiled deployment. The standard choices for the value include "java",
   * "go", "python", "ruby", "nodejs", "php", "dotnet".
   *
   * For deployments running on Google Cloud Platform, "zone" or "region" label
   * should be present describing the deployment location. An example of a zone
   * is "us-central1-a", an example of a region is "us-central1" or
   * "us-central".
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
