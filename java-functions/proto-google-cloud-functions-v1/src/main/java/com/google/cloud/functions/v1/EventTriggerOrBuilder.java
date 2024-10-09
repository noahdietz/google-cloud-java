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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v1;

public interface EventTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.EventTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The type of event to observe. For example:
   * `providers/cloud.storage/eventTypes/object.change` and
   * `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Event types match pattern `providers/&#42;&#47;eventTypes/&#42;.*`.
   * The pattern contains:
   *
   * 1. namespace: For example, `cloud.storage` and
   *    `google.firebase.analytics`.
   * 2. resource type: The type of resource on which event occurs. For
   *    example, the Google Cloud Storage API includes the type `object`.
   * 3. action: The action that generates the event. For example, action for
   *    a Google Cloud Storage Object is 'change'.
   * These parts are lower case.
   * </pre>
   *
   * <code>string event_type = 1;</code>
   *
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   *
   *
   * <pre>
   * Required. The type of event to observe. For example:
   * `providers/cloud.storage/eventTypes/object.change` and
   * `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Event types match pattern `providers/&#42;&#47;eventTypes/&#42;.*`.
   * The pattern contains:
   *
   * 1. namespace: For example, `cloud.storage` and
   *    `google.firebase.analytics`.
   * 2. resource type: The type of resource on which event occurs. For
   *    example, the Google Cloud Storage API includes the type `object`.
   * 3. action: The action that generates the event. For example, action for
   *    a Google Cloud Storage Object is 'change'.
   * These parts are lower case.
   * </pre>
   *
   * <code>string event_type = 1;</code>
   *
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString getEventTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource(s) from which to observe events, for example,
   * `projects/_/buckets/myBucket`.
   *
   * Not all syntactically correct values are accepted by all services. For
   * example:
   *
   * 1. The authorization model must support it. Google Cloud Functions
   *    only allows EventTriggers to be deployed that observe resources in the
   *    same project as the `CloudFunction`.
   * 2. The resource type must match the pattern expected for an
   *    `event_type`. For example, an `EventTrigger` that has an
   *    `event_type` of "google.pubsub.topic.publish" should have a resource
   *    that matches Google Cloud Pub/Sub topics.
   *
   * Additionally, some services may support short names when creating an
   * `EventTrigger`. These will always be returned in the normalized "long"
   * format.
   *
   * See each *service's* documentation for supported formats.
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Required. The resource(s) from which to observe events, for example,
   * `projects/_/buckets/myBucket`.
   *
   * Not all syntactically correct values are accepted by all services. For
   * example:
   *
   * 1. The authorization model must support it. Google Cloud Functions
   *    only allows EventTriggers to be deployed that observe resources in the
   *    same project as the `CloudFunction`.
   * 2. The resource type must match the pattern expected for an
   *    `event_type`. For example, an `EventTrigger` that has an
   *    `event_type` of "google.pubsub.topic.publish" should have a resource
   *    that matches Google Cloud Pub/Sub topics.
   *
   * Additionally, some services may support short names when creating an
   * `EventTrigger`. These will always be returned in the normalized "long"
   * format.
   *
   * See each *service's* documentation for supported formats.
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The hostname of the service that should be observed.
   *
   * If no string is provided, the default service implementing the API will
   * be used. For example, `storage.googleapis.com` is the default for all
   * event types in the `google.storage` namespace.
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * The hostname of the service that should be observed.
   *
   * If no string is provided, the default service implementing the API will
   * be used. For example, `storage.googleapis.com` is the default for all
   * event types in the `google.storage` namespace.
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Specifies policy for failed executions.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.FailurePolicy failure_policy = 5;</code>
   *
   * @return Whether the failurePolicy field is set.
   */
  boolean hasFailurePolicy();
  /**
   *
   *
   * <pre>
   * Specifies policy for failed executions.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.FailurePolicy failure_policy = 5;</code>
   *
   * @return The failurePolicy.
   */
  com.google.cloud.functions.v1.FailurePolicy getFailurePolicy();
  /**
   *
   *
   * <pre>
   * Specifies policy for failed executions.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.FailurePolicy failure_policy = 5;</code>
   */
  com.google.cloud.functions.v1.FailurePolicyOrBuilder getFailurePolicyOrBuilder();
}
