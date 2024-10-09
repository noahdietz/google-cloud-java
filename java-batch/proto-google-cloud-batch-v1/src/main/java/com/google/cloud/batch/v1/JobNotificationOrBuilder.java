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
// source: google/cloud/batch/v1/job.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1;

public interface JobNotificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.JobNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Pub/Sub topic where notifications for the job, like state
   * changes, will be published. If undefined, no Pub/Sub notifications
   * are sent for this job.
   *
   * Specify the topic using the following format:
   * `projects/{project}/topics/{topic}`.
   * Notably, if you want to specify a Pub/Sub topic that is in a
   * different project than the job, your administrator must grant your
   * project's Batch service agent permission to publish to that topic.
   *
   * For more information about configuring Pub/Sub notifications for
   * a job, see
   * https://cloud.google.com/batch/docs/enable-notifications.
   * </pre>
   *
   * <code>string pubsub_topic = 1;</code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();
  /**
   *
   *
   * <pre>
   * The Pub/Sub topic where notifications for the job, like state
   * changes, will be published. If undefined, no Pub/Sub notifications
   * are sent for this job.
   *
   * Specify the topic using the following format:
   * `projects/{project}/topics/{topic}`.
   * Notably, if you want to specify a Pub/Sub topic that is in a
   * different project than the job, your administrator must grant your
   * project's Batch service agent permission to publish to that topic.
   *
   * For more information about configuring Pub/Sub notifications for
   * a job, see
   * https://cloud.google.com/batch/docs/enable-notifications.
   * </pre>
   *
   * <code>string pubsub_topic = 1;</code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   *
   * @return The message.
   */
  com.google.cloud.batch.v1.JobNotification.Message getMessage();
  /**
   *
   *
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   */
  com.google.cloud.batch.v1.JobNotification.MessageOrBuilder getMessageOrBuilder();
}
