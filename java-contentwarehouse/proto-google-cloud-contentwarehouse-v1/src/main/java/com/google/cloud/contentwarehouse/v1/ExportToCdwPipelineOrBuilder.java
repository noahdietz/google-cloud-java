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
// source: google/cloud/contentwarehouse/v1/pipelines.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contentwarehouse.v1;

public interface ExportToCdwPipelineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.ExportToCdwPipeline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @return A list containing the documents.
   */
  java.util.List<java.lang.String> getDocumentsList();
  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @return The count of documents.
   */
  int getDocumentsCount();
  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The documents at the given index.
   */
  java.lang.String getDocuments(int index);
  /**
   *
   *
   * <pre>
   * The list of all the resource names of the documents to be processed.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string documents = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the documents at the given index.
   */
  com.google.protobuf.ByteString getDocumentsBytes(int index);

  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the exported documents before
   * being sent to CDW.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string export_folder_path = 2;</code>
   *
   * @return The exportFolderPath.
   */
  java.lang.String getExportFolderPath();
  /**
   *
   *
   * <pre>
   * The Cloud Storage folder path used to store the exported documents before
   * being sent to CDW.
   * Format: `gs://&lt;bucket-name&gt;/&lt;folder-name&gt;`.
   * </pre>
   *
   * <code>string export_folder_path = 2;</code>
   *
   * @return The bytes for exportFolderPath.
   */
  com.google.protobuf.ByteString getExportFolderPathBytes();

  /**
   *
   *
   * <pre>
   * Optional. The CDW dataset resource name. This field is optional. If not
   * set, the documents will be exported to Cloud Storage only. Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset
   * </pre>
   *
   * <code>string doc_ai_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The docAiDataset.
   */
  java.lang.String getDocAiDataset();
  /**
   *
   *
   * <pre>
   * Optional. The CDW dataset resource name. This field is optional. If not
   * set, the documents will be exported to Cloud Storage only. Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset
   * </pre>
   *
   * <code>string doc_ai_dataset = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for docAiDataset.
   */
  com.google.protobuf.ByteString getDocAiDatasetBytes();

  /**
   *
   *
   * <pre>
   * Ratio of training dataset split. When importing into Document AI Workbench,
   * documents will be automatically split into training and test split category
   * with the specified ratio. This field is required if doc_ai_dataset is set.
   * </pre>
   *
   * <code>float training_split_ratio = 4;</code>
   *
   * @return The trainingSplitRatio.
   */
  float getTrainingSplitRatio();
}
