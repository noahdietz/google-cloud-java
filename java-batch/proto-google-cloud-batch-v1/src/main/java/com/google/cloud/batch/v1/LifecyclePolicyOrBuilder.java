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
// source: google/cloud/batch/v1/task.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1;

public interface LifecyclePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.LifecyclePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Action to execute when ActionCondition is true.
   * When RETRY_TASK is specified, we will retry failed tasks
   * if we notice any exit code match and fail tasks if no match is found.
   * Likewise, when FAIL_TASK is specified, we will fail tasks
   * if we notice any exit code match and retry tasks if no match is found.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LifecyclePolicy.Action action = 1;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * Action to execute when ActionCondition is true.
   * When RETRY_TASK is specified, we will retry failed tasks
   * if we notice any exit code match and fail tasks if no match is found.
   * Likewise, when FAIL_TASK is specified, we will fail tasks
   * if we notice any exit code match and retry tasks if no match is found.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LifecyclePolicy.Action action = 1;</code>
   *
   * @return The action.
   */
  com.google.cloud.batch.v1.LifecyclePolicy.Action getAction();

  /**
   *
   *
   * <pre>
   * Conditions that decide why a task failure is dealt with a specific action.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LifecyclePolicy.ActionCondition action_condition = 2;</code>
   *
   * @return Whether the actionCondition field is set.
   */
  boolean hasActionCondition();
  /**
   *
   *
   * <pre>
   * Conditions that decide why a task failure is dealt with a specific action.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LifecyclePolicy.ActionCondition action_condition = 2;</code>
   *
   * @return The actionCondition.
   */
  com.google.cloud.batch.v1.LifecyclePolicy.ActionCondition getActionCondition();
  /**
   *
   *
   * <pre>
   * Conditions that decide why a task failure is dealt with a specific action.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.LifecyclePolicy.ActionCondition action_condition = 2;</code>
   */
  com.google.cloud.batch.v1.LifecyclePolicy.ActionConditionOrBuilder getActionConditionOrBuilder();
}
