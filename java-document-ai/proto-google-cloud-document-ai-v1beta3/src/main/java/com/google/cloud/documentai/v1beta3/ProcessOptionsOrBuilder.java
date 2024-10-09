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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.documentai.v1beta3;

public interface ProcessOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ProcessOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Which pages to process (1-indexed).
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.IndividualPageSelector individual_page_selector = 5;
   * </code>
   *
   * @return Whether the individualPageSelector field is set.
   */
  boolean hasIndividualPageSelector();
  /**
   *
   *
   * <pre>
   * Which pages to process (1-indexed).
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.IndividualPageSelector individual_page_selector = 5;
   * </code>
   *
   * @return The individualPageSelector.
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions.IndividualPageSelector
      getIndividualPageSelector();
  /**
   *
   *
   * <pre>
   * Which pages to process (1-indexed).
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.IndividualPageSelector individual_page_selector = 5;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions.IndividualPageSelectorOrBuilder
      getIndividualPageSelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Only process certain pages from the start. Process all if the document
   * has fewer pages.
   * </pre>
   *
   * <code>int32 from_start = 6;</code>
   *
   * @return Whether the fromStart field is set.
   */
  boolean hasFromStart();
  /**
   *
   *
   * <pre>
   * Only process certain pages from the start. Process all if the document
   * has fewer pages.
   * </pre>
   *
   * <code>int32 from_start = 6;</code>
   *
   * @return The fromStart.
   */
  int getFromStart();

  /**
   *
   *
   * <pre>
   * Only process certain pages from the end, same as above.
   * </pre>
   *
   * <code>int32 from_end = 7;</code>
   *
   * @return Whether the fromEnd field is set.
   */
  boolean hasFromEnd();
  /**
   *
   *
   * <pre>
   * Only process certain pages from the end, same as above.
   * </pre>
   *
   * <code>int32 from_end = 7;</code>
   *
   * @return The fromEnd.
   */
  int getFromEnd();

  /**
   *
   *
   * <pre>
   * Only applicable to `OCR_PROCESSOR` and `FORM_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   *
   * @return Whether the ocrConfig field is set.
   */
  boolean hasOcrConfig();
  /**
   *
   *
   * <pre>
   * Only applicable to `OCR_PROCESSOR` and `FORM_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   *
   * @return The ocrConfig.
   */
  com.google.cloud.documentai.v1beta3.OcrConfig getOcrConfig();
  /**
   *
   *
   * <pre>
   * Only applicable to `OCR_PROCESSOR` and `FORM_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder getOcrConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Only applicable to `LAYOUT_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.LayoutConfig layout_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the layoutConfig field is set.
   */
  boolean hasLayoutConfig();
  /**
   *
   *
   * <pre>
   * Optional. Only applicable to `LAYOUT_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.LayoutConfig layout_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The layoutConfig.
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions.LayoutConfig getLayoutConfig();
  /**
   *
   *
   * <pre>
   * Optional. Only applicable to `LAYOUT_PARSER_PROCESSOR`.
   * Returns error if set on other processor types.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.ProcessOptions.LayoutConfig layout_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions.LayoutConfigOrBuilder
      getLayoutConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Override the schema of the
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]. Will
   * return an Invalid Argument error if this field is set when the underlying
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]
   * doesn't support schema override.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema schema_override = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the schemaOverride field is set.
   */
  boolean hasSchemaOverride();
  /**
   *
   *
   * <pre>
   * Optional. Override the schema of the
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]. Will
   * return an Invalid Argument error if this field is set when the underlying
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]
   * doesn't support schema override.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema schema_override = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The schemaOverride.
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema getSchemaOverride();
  /**
   *
   *
   * <pre>
   * Optional. Override the schema of the
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]. Will
   * return an Invalid Argument error if this field is set when the underlying
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]
   * doesn't support schema override.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema schema_override = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchemaOrBuilder getSchemaOverrideOrBuilder();

  com.google.cloud.documentai.v1beta3.ProcessOptions.PageRangeCase getPageRangeCase();
}
