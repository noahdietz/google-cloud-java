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
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.5
package com.google.webrisk.v1;

public interface RawIndicesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.RawIndices)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @return A list containing the indices.
   */
  java.util.List<java.lang.Integer> getIndicesList();
  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @return The count of indices.
   */
  int getIndicesCount();
  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  int getIndices(int index);
}
