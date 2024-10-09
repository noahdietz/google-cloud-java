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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

public interface ListUserWorkloadsSecretsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsSecretsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Secrets returned by a ListUserWorkloadsSecretsRequest.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secrets = 1;
   * </code>
   */
  java.util.List<com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret>
      getUserWorkloadsSecretsList();
  /**
   *
   *
   * <pre>
   * The list of Secrets returned by a ListUserWorkloadsSecretsRequest.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secrets = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret getUserWorkloadsSecrets(
      int index);
  /**
   *
   *
   * <pre>
   * The list of Secrets returned by a ListUserWorkloadsSecretsRequest.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secrets = 1;
   * </code>
   */
  int getUserWorkloadsSecretsCount();
  /**
   *
   *
   * <pre>
   * The list of Secrets returned by a ListUserWorkloadsSecretsRequest.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secrets = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecretOrBuilder>
      getUserWorkloadsSecretsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of Secrets returned by a ListUserWorkloadsSecretsRequest.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secrets = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecretOrBuilder
      getUserWorkloadsSecretsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The page token used to query for the next page if one exists.
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
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
