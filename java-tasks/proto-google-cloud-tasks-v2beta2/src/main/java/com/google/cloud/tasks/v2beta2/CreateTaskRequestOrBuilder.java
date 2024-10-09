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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tasks.v2beta2;

public interface CreateTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.CreateTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * The queue must already exist.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   *
   * The queue must already exist.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The task to add.
   *
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task
   * [name][google.cloud.tasks.v2beta2.Task.name]. If a name is not specified
   * then the system will generate a random unique task id, which will be set in
   * the task returned in the [response][google.cloud.tasks.v2beta2.Task.name].
   *
   * If [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] is not
   * set or is in the past then Cloud Tasks will set it to the current time.
   *
   * Task De-duplication:
   *
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or completed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1 hour after the original task was
   * deleted or completed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9 days after the original task was deleted or completed.
   *
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask]
   * calls have significantly increased latency. Using hashed strings for the
   * task id or for the prefix of the task id is recommended. Choosing task ids
   * that are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   *
   *
   * <pre>
   * Required. The task to add.
   *
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task
   * [name][google.cloud.tasks.v2beta2.Task.name]. If a name is not specified
   * then the system will generate a random unique task id, which will be set in
   * the task returned in the [response][google.cloud.tasks.v2beta2.Task.name].
   *
   * If [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] is not
   * set or is in the past then Cloud Tasks will set it to the current time.
   *
   * Task De-duplication:
   *
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or completed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1 hour after the original task was
   * deleted or completed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9 days after the original task was deleted or completed.
   *
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask]
   * calls have significantly increased latency. Using hashed strings for the
   * task id or for the prefix of the task id is recommended. Choosing task ids
   * that are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The task.
   */
  com.google.cloud.tasks.v2beta2.Task getTask();
  /**
   *
   *
   * <pre>
   * Required. The task to add.
   *
   * Task names have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
   * The user can optionally specify a task
   * [name][google.cloud.tasks.v2beta2.Task.name]. If a name is not specified
   * then the system will generate a random unique task id, which will be set in
   * the task returned in the [response][google.cloud.tasks.v2beta2.Task.name].
   *
   * If [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] is not
   * set or is in the past then Cloud Tasks will set it to the current time.
   *
   * Task De-duplication:
   *
   * Explicitly specifying a task ID enables task de-duplication.  If
   * a task's ID is identical to that of an existing task or a task
   * that was deleted or completed recently then the call will fail
   * with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS].
   * If the task's queue was created using Cloud Tasks, then another task with
   * the same name can't be created for ~1 hour after the original task was
   * deleted or completed. If the task's queue was created using queue.yaml or
   * queue.xml, then another task with the same name can't be created
   * for ~9 days after the original task was deleted or completed.
   *
   * Because there is an extra lookup cost to identify duplicate task
   * names, these [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask]
   * calls have significantly increased latency. Using hashed strings for the
   * task id or for the prefix of the task id is recommended. Choosing task ids
   * that are sequential or have sequential prefixes, for example using a
   * timestamp, causes an increase in latency and error rates in all
   * task commands. The infrastructure relies on an approximately
   * uniform distribution of task ids to store and serve tasks
   * efficiently.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.tasks.v2beta2.TaskOrBuilder getTaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 3;</code>
   *
   * @return The enum numeric value on the wire for responseView.
   */
  int getResponseViewValue();
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   *
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   *
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 3;</code>
   *
   * @return The responseView.
   */
  com.google.cloud.tasks.v2beta2.Task.View getResponseView();
}
