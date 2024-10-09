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
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.translate.v3beta1;

public interface BatchTranslateDocumentMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.BatchTranslateDocumentMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.BatchTranslateDocumentMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.BatchTranslateDocumentMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.translate.v3beta1.BatchTranslateDocumentMetadata.State getState();

  /**
   *
   *
   * <pre>
   * Total number of pages to translate in all documents so far. Documents
   * without clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 total_pages = 2;</code>
   *
   * @return The totalPages.
   */
  long getTotalPages();

  /**
   *
   *
   * <pre>
   * Number of successfully translated pages in all documents so far. Documents
   * without clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 translated_pages = 3;</code>
   *
   * @return The translatedPages.
   */
  long getTranslatedPages();

  /**
   *
   *
   * <pre>
   * Number of pages that failed to process in all documents so far. Documents
   * without clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 failed_pages = 4;</code>
   *
   * @return The failedPages.
   */
  long getFailedPages();

  /**
   *
   *
   * <pre>
   * Number of billable pages in documents with clear page definition (such as
   * PDF, DOCX, PPTX) so far.
   * </pre>
   *
   * <code>int64 total_billable_pages = 5;</code>
   *
   * @return The totalBillablePages.
   */
  long getTotalBillablePages();

  /**
   *
   *
   * <pre>
   * Total number of characters (Unicode codepoints) in all documents so far.
   * </pre>
   *
   * <code>int64 total_characters = 6;</code>
   *
   * @return The totalCharacters.
   */
  long getTotalCharacters();

  /**
   *
   *
   * <pre>
   * Number of successfully translated characters (Unicode codepoints) in all
   * documents so far.
   * </pre>
   *
   * <code>int64 translated_characters = 7;</code>
   *
   * @return The translatedCharacters.
   */
  long getTranslatedCharacters();

  /**
   *
   *
   * <pre>
   * Number of characters that have failed to process (Unicode codepoints) in
   * all documents so far.
   * </pre>
   *
   * <code>int64 failed_characters = 8;</code>
   *
   * @return The failedCharacters.
   */
  long getFailedCharacters();

  /**
   *
   *
   * <pre>
   * Number of billable characters (Unicode codepoints) in documents without
   * clear page definition (such as XLSX) so far.
   * </pre>
   *
   * <code>int64 total_billable_characters = 9;</code>
   *
   * @return The totalBillableCharacters.
   */
  long getTotalBillableCharacters();

  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 10;</code>
   *
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();
  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 10;</code>
   *
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();
}
