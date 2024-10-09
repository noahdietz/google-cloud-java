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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface StatefulPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.StatefulPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;
   * </code>
   *
   * @return Whether the preservedState field is set.
   */
  boolean hasPreservedState();
  /**
   * <code>optional .google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;
   * </code>
   *
   * @return The preservedState.
   */
  com.google.cloud.compute.v1.StatefulPolicyPreservedState getPreservedState();
  /**
   * <code>optional .google.cloud.compute.v1.StatefulPolicyPreservedState preserved_state = 2634026;
   * </code>
   */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder getPreservedStateOrBuilder();
}
