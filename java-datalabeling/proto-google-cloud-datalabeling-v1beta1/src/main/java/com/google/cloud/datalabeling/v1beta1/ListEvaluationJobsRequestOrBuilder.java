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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface ListEvaluationJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Evaluation job resource parent. Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Required. Evaluation job resource parent. Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Optional. You can filter the jobs to list by model_id (also known as
   * model_name, as described in
   * [EvaluationJob.modelVersion][google.cloud.datalabeling.v1beta1.EvaluationJob.model_version]) or by
   * evaluation job state (as described in [EvaluationJob.state][google.cloud.datalabeling.v1beta1.EvaluationJob.state]). To filter
   * by both criteria, use the `AND` operator or the `OR` operator. For example,
   * you can use the following string for your filter:
   * "evaluation&lt;span&gt;_&lt;/span&gt;job.model_id = &lt;var&gt;{model_name}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.state = &lt;var&gt;{evaluation_job_state}&lt;/var&gt;"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. You can filter the jobs to list by model_id (also known as
   * model_name, as described in
   * [EvaluationJob.modelVersion][google.cloud.datalabeling.v1beta1.EvaluationJob.model_version]) or by
   * evaluation job state (as described in [EvaluationJob.state][google.cloud.datalabeling.v1beta1.EvaluationJob.state]). To filter
   * by both criteria, use the `AND` operator or the `OR` operator. For example,
   * you can use the following string for your filter:
   * "evaluation&lt;span&gt;_&lt;/span&gt;job.model_id = &lt;var&gt;{model_name}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.state = &lt;var&gt;{evaluation_job_state}&lt;/var&gt;"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.next_page_token] in the response
   * to the previous request. The request returns the first page if this is
   * empty.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.next_page_token] in the response
   * to the previous request. The request returns the first page if this is
   * empty.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
