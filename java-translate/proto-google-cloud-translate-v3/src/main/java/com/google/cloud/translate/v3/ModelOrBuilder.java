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
// source: google/cloud/translate/v3/automl_translation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.translate.v3;

public interface ModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the model, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the model, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the model to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The name of the model to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The dataset from which the model is trained, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string dataset = 3;</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * The dataset from which the model is trained, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string dataset = 3;</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The BCP-47 language code of the source language.
   * </pre>
   *
   * <code>string source_language_code = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   *
   *
   * <pre>
   * Output only. The BCP-47 language code of the source language.
   * </pre>
   *
   * <code>string source_language_code = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The BCP-47 language code of the target language.
   * </pre>
   *
   * <code>string target_language_code = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The targetLanguageCode.
   */
  java.lang.String getTargetLanguageCode();
  /**
   *
   *
   * <pre>
   * Output only. The BCP-47 language code of the target language.
   * </pre>
   *
   * <code>string target_language_code = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for targetLanguageCode.
   */
  com.google.protobuf.ByteString getTargetLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Number of examples (sentence pairs) used to train the model.
   * </pre>
   *
   * <code>int32 train_example_count = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The trainExampleCount.
   */
  int getTrainExampleCount();

  /**
   *
   *
   * <pre>
   * Output only. Number of examples (sentence pairs) used to validate the
   * model.
   * </pre>
   *
   * <code>int32 validate_example_count = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The validateExampleCount.
   */
  int getValidateExampleCount();

  /**
   *
   *
   * <pre>
   * Output only. Number of examples (sentence pairs) used to test the model.
   * </pre>
   *
   * <code>int32 test_example_count = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The testExampleCount.
   */
  int getTestExampleCount();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model resource was created, which is also
   * when the training started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model resource was created, which is also
   * when the training started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the model resource was created, which is also
   * when the training started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
