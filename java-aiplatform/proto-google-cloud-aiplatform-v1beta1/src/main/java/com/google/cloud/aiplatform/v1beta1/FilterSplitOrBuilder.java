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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface FilterSplitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FilterSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to train the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string training_filter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The trainingFilter.
   */
  java.lang.String getTrainingFilter();
  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to train the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string training_filter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for trainingFilter.
   */
  com.google.protobuf.ByteString getTrainingFilterBytes();

  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to validate the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string validation_filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The validationFilter.
   */
  java.lang.String getValidationFilter();
  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to validate the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string validation_filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for validationFilter.
   */
  com.google.protobuf.ByteString getValidationFilterBytes();

  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to test the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string test_filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The testFilter.
   */
  java.lang.String getTestFilter();
  /**
   *
   *
   * <pre>
   * Required. A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to test the Model. A filter with same syntax
   * as the one used in
   * [DatasetService.ListDataItems][google.cloud.aiplatform.v1beta1.DatasetService.ListDataItems]
   * may be used. If a single DataItem is matched by more than one of the
   * FilterSplit filters, then it is assigned to the first set that applies to
   * it in the training, validation, test order.
   * </pre>
   *
   * <code>string test_filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for testFilter.
   */
  com.google.protobuf.ByteString getTestFilterBytes();
}
