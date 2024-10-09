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
// source: google/cloud/dialogflow/cx/v3beta1/playbook.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface PlaybookVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.PlaybookVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the playbook version.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;/versions/&lt;Version ID&gt;`.
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
   * The unique identifier of the playbook version.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/playbooks/&lt;Playbook ID&gt;/versions/&lt;Version ID&gt;`.
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
   * Optional. The description of the playbook version.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the playbook version.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the playbook when the playbook version is created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Playbook playbook = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the playbook field is set.
   */
  boolean hasPlaybook();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the playbook when the playbook version is created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Playbook playbook = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The playbook.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Playbook getPlaybook();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the playbook when the playbook version is created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Playbook playbook = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PlaybookOrBuilder getPlaybookOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the examples belonging to the playbook when the
   * playbook version is created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Example examples = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Example> getExamplesList();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the examples belonging to the playbook when the
   * playbook version is created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Example examples = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Example getExamples(int index);
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the examples belonging to the playbook when the
   * playbook version is created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Example examples = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getExamplesCount();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the examples belonging to the playbook when the
   * playbook version is created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Example examples = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ExampleOrBuilder>
      getExamplesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the examples belonging to the playbook when the
   * playbook version is created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Example examples = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ExampleOrBuilder getExamplesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Last time the playbook version was created or modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the playbook version was created or modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last time the playbook version was created or modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
