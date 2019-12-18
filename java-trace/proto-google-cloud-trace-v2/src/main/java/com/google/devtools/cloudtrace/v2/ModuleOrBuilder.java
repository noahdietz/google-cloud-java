/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public interface ModuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   *
   * @return Whether the module field is set.
   */
  boolean hasModule();
  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   *
   * @return The module.
   */
  com.google.devtools.cloudtrace.v2.TruncatableString getModule();
  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getModuleOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   *
   * @return Whether the buildId field is set.
   */
  boolean hasBuildId();
  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   *
   * @return The buildId.
   */
  com.google.devtools.cloudtrace.v2.TruncatableString getBuildId();
  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getBuildIdOrBuilder();
}
