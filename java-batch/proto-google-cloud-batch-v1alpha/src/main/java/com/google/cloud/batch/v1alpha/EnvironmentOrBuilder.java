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
// source: google/cloud/batch/v1alpha/task.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1alpha;

public interface EnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.Environment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  int getVariablesCount();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  boolean containsVariables(java.lang.String key);
  /** Use {@link #getVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getVariables();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getVariablesMap();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  /* nullable */
  java.lang.String getVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  java.lang.String getVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A map of environment variable names to Secret Manager secret names.
   * The VM will access the named secrets to set the value of each environment
   * variable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; secret_variables = 2;</code>
   */
  int getSecretVariablesCount();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to Secret Manager secret names.
   * The VM will access the named secrets to set the value of each environment
   * variable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; secret_variables = 2;</code>
   */
  boolean containsSecretVariables(java.lang.String key);
  /** Use {@link #getSecretVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSecretVariables();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to Secret Manager secret names.
   * The VM will access the named secrets to set the value of each environment
   * variable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; secret_variables = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSecretVariablesMap();
  /**
   *
   *
   * <pre>
   * A map of environment variable names to Secret Manager secret names.
   * The VM will access the named secrets to set the value of each environment
   * variable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; secret_variables = 2;</code>
   */
  /* nullable */
  java.lang.String getSecretVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map of environment variable names to Secret Manager secret names.
   * The VM will access the named secrets to set the value of each environment
   * variable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; secret_variables = 2;</code>
   */
  java.lang.String getSecretVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * An encrypted JSON dictionary where the key/value pairs correspond to
   * environment variable names and their values.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment.KMSEnvMap encrypted_variables = 3;</code>
   *
   * @return Whether the encryptedVariables field is set.
   */
  boolean hasEncryptedVariables();
  /**
   *
   *
   * <pre>
   * An encrypted JSON dictionary where the key/value pairs correspond to
   * environment variable names and their values.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment.KMSEnvMap encrypted_variables = 3;</code>
   *
   * @return The encryptedVariables.
   */
  com.google.cloud.batch.v1alpha.Environment.KMSEnvMap getEncryptedVariables();
  /**
   *
   *
   * <pre>
   * An encrypted JSON dictionary where the key/value pairs correspond to
   * environment variable names and their values.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.Environment.KMSEnvMap encrypted_variables = 3;</code>
   */
  com.google.cloud.batch.v1alpha.Environment.KMSEnvMapOrBuilder getEncryptedVariablesOrBuilder();
}
