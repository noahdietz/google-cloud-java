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
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public interface ComputationTopologyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ComputationTopology)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The system stage name.
   * </pre>
   *
   * <code>string system_stage_name = 1;</code>
   *
   * @return The systemStageName.
   */
  java.lang.String getSystemStageName();
  /**
   *
   *
   * <pre>
   * The system stage name.
   * </pre>
   *
   * <code>string system_stage_name = 1;</code>
   *
   * @return The bytes for systemStageName.
   */
  com.google.protobuf.ByteString getSystemStageNameBytes();

  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 5;</code>
   *
   * @return The computationId.
   */
  java.lang.String getComputationId();
  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 5;</code>
   *
   * @return The bytes for computationId.
   */
  com.google.protobuf.ByteString getComputationIdBytes();

  /**
   *
   *
   * <pre>
   * The key ranges processed by the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeLocation key_ranges = 2;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.KeyRangeLocation> getKeyRangesList();
  /**
   *
   *
   * <pre>
   * The key ranges processed by the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeLocation key_ranges = 2;</code>
   */
  com.google.dataflow.v1beta3.KeyRangeLocation getKeyRanges(int index);
  /**
   *
   *
   * <pre>
   * The key ranges processed by the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeLocation key_ranges = 2;</code>
   */
  int getKeyRangesCount();
  /**
   *
   *
   * <pre>
   * The key ranges processed by the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeLocation key_ranges = 2;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.KeyRangeLocationOrBuilder>
      getKeyRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The key ranges processed by the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeLocation key_ranges = 2;</code>
   */
  com.google.dataflow.v1beta3.KeyRangeLocationOrBuilder getKeyRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The inputs to the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation inputs = 3;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.StreamLocation> getInputsList();
  /**
   *
   *
   * <pre>
   * The inputs to the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation inputs = 3;</code>
   */
  com.google.dataflow.v1beta3.StreamLocation getInputs(int index);
  /**
   *
   *
   * <pre>
   * The inputs to the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation inputs = 3;</code>
   */
  int getInputsCount();
  /**
   *
   *
   * <pre>
   * The inputs to the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation inputs = 3;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.StreamLocationOrBuilder>
      getInputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The inputs to the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation inputs = 3;</code>
   */
  com.google.dataflow.v1beta3.StreamLocationOrBuilder getInputsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The outputs from the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation outputs = 4;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.StreamLocation> getOutputsList();
  /**
   *
   *
   * <pre>
   * The outputs from the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation outputs = 4;</code>
   */
  com.google.dataflow.v1beta3.StreamLocation getOutputs(int index);
  /**
   *
   *
   * <pre>
   * The outputs from the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation outputs = 4;</code>
   */
  int getOutputsCount();
  /**
   *
   *
   * <pre>
   * The outputs from the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation outputs = 4;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.StreamLocationOrBuilder>
      getOutputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The outputs from the computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StreamLocation outputs = 4;</code>
   */
  com.google.dataflow.v1beta3.StreamLocationOrBuilder getOutputsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The state family values.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StateFamilyConfig state_families = 7;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.StateFamilyConfig> getStateFamiliesList();
  /**
   *
   *
   * <pre>
   * The state family values.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StateFamilyConfig state_families = 7;</code>
   */
  com.google.dataflow.v1beta3.StateFamilyConfig getStateFamilies(int index);
  /**
   *
   *
   * <pre>
   * The state family values.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StateFamilyConfig state_families = 7;</code>
   */
  int getStateFamiliesCount();
  /**
   *
   *
   * <pre>
   * The state family values.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StateFamilyConfig state_families = 7;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.StateFamilyConfigOrBuilder>
      getStateFamiliesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The state family values.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.StateFamilyConfig state_families = 7;</code>
   */
  com.google.dataflow.v1beta3.StateFamilyConfigOrBuilder getStateFamiliesOrBuilder(int index);
}
