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
// source: google/cloud/dialogflow/cx/v3beta1/tool_call.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface ToolCallOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ToolCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [tool][Tool] associated with this call.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/tools/&lt;Tool ID&gt;`.
   * </pre>
   *
   * <code>
   * string tool = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tool.
   */
  java.lang.String getTool();
  /**
   *
   *
   * <pre>
   * The [tool][Tool] associated with this call.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/tools/&lt;Tool ID&gt;`.
   * </pre>
   *
   * <code>
   * string tool = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tool.
   */
  com.google.protobuf.ByteString getToolBytes();

  /**
   *
   *
   * <pre>
   * The name of the tool's action associated with this call.
   * </pre>
   *
   * <code>string action = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * The name of the tool's action associated with this call.
   * </pre>
   *
   * <code>string action = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * The action's input parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the inputParameters field is set.
   */
  boolean hasInputParameters();
  /**
   *
   *
   * <pre>
   * The action's input parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The inputParameters.
   */
  com.google.protobuf.Struct getInputParameters();
  /**
   *
   *
   * <pre>
   * The action's input parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct input_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.StructOrBuilder getInputParametersOrBuilder();
}
