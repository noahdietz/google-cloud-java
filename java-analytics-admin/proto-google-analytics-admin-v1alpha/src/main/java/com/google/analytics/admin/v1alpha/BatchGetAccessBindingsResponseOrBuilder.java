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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

public interface BatchGetAccessBindingsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.BatchGetAccessBindingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The requested access bindings.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.AccessBinding> getAccessBindingsList();
  /**
   *
   *
   * <pre>
   * The requested access bindings.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  com.google.analytics.admin.v1alpha.AccessBinding getAccessBindings(int index);
  /**
   *
   *
   * <pre>
   * The requested access bindings.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  int getAccessBindingsCount();
  /**
   *
   *
   * <pre>
   * The requested access bindings.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.AccessBindingOrBuilder>
      getAccessBindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requested access bindings.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessBinding access_bindings = 1;</code>
   */
  com.google.analytics.admin.v1alpha.AccessBindingOrBuilder getAccessBindingsOrBuilder(int index);
}
