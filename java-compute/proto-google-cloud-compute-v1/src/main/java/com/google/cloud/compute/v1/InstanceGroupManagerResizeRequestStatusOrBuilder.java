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

public interface InstanceGroupManagerResizeRequestStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the last_attempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * [Output only] Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the last_attempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   *
   * @return The error.
   */
  com.google.cloud.compute.v1.Error getError();
  /**
   *
   *
   * <pre>
   * [Output only] Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the last_attempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Error error = 96784904;</code>
   */
  com.google.cloud.compute.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it's still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the "error" field only.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt last_attempt = 434771492;
   * </code>
   *
   * @return Whether the lastAttempt field is set.
   */
  boolean hasLastAttempt();
  /**
   *
   *
   * <pre>
   * [Output only] Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it's still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the "error" field only.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt last_attempt = 434771492;
   * </code>
   *
   * @return The lastAttempt.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt getLastAttempt();
  /**
   *
   *
   * <pre>
   * [Output only] Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it's still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the "error" field only.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttempt last_attempt = 434771492;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestStatusLastAttemptOrBuilder
      getLastAttemptOrBuilder();
}
