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
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataform.v1alpha2;

public interface QueryCompilationResultActionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of compilation result actions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResultAction compilation_result_actions = 1;
   * </code>
   */
  java.util.List<com.google.cloud.dataform.v1alpha2.CompilationResultAction>
      getCompilationResultActionsList();
  /**
   *
   *
   * <pre>
   * List of compilation result actions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResultAction compilation_result_actions = 1;
   * </code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultAction getCompilationResultActions(int index);
  /**
   *
   *
   * <pre>
   * List of compilation result actions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResultAction compilation_result_actions = 1;
   * </code>
   */
  int getCompilationResultActionsCount();
  /**
   *
   *
   * <pre>
   * List of compilation result actions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResultAction compilation_result_actions = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1alpha2.CompilationResultActionOrBuilder>
      getCompilationResultActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of compilation result actions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResultAction compilation_result_actions = 1;
   * </code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResultActionOrBuilder
      getCompilationResultActionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
