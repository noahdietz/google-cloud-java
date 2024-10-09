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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface ExampleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.Example)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The image payload, a container of the image bytes/uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePayload image_payload = 2;</code>
   *
   * @return Whether the imagePayload field is set.
   */
  boolean hasImagePayload();
  /**
   *
   *
   * <pre>
   * The image payload, a container of the image bytes/uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePayload image_payload = 2;</code>
   *
   * @return The imagePayload.
   */
  com.google.cloud.datalabeling.v1beta1.ImagePayload getImagePayload();
  /**
   *
   *
   * <pre>
   * The image payload, a container of the image bytes/uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePayload image_payload = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.ImagePayloadOrBuilder getImagePayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The text payload, a container of the text content.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextPayload text_payload = 6;</code>
   *
   * @return Whether the textPayload field is set.
   */
  boolean hasTextPayload();
  /**
   *
   *
   * <pre>
   * The text payload, a container of the text content.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextPayload text_payload = 6;</code>
   *
   * @return The textPayload.
   */
  com.google.cloud.datalabeling.v1beta1.TextPayload getTextPayload();
  /**
   *
   *
   * <pre>
   * The text payload, a container of the text content.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextPayload text_payload = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.TextPayloadOrBuilder getTextPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The video payload, a container of the video uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoPayload video_payload = 7;</code>
   *
   * @return Whether the videoPayload field is set.
   */
  boolean hasVideoPayload();
  /**
   *
   *
   * <pre>
   * The video payload, a container of the video uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoPayload video_payload = 7;</code>
   *
   * @return The videoPayload.
   */
  com.google.cloud.datalabeling.v1beta1.VideoPayload getVideoPayload();
  /**
   *
   *
   * <pre>
   * The video payload, a container of the video uri.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoPayload video_payload = 7;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoPayloadOrBuilder getVideoPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Name of the example, in format of:
   * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/
   * {annotated_dataset_id}/examples/{example_id}
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
   * Output only. Name of the example, in format of:
   * projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/
   * {annotated_dataset_id}/examples/{example_id}
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
   * Output only. Annotations for the piece of data in Example.
   * One piece of data can have multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Annotation annotations = 5;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Annotation> getAnnotationsList();
  /**
   *
   *
   * <pre>
   * Output only. Annotations for the piece of data in Example.
   * One piece of data can have multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Annotation annotations = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Annotation getAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Output only. Annotations for the piece of data in Example.
   * One piece of data can have multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Annotation annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Output only. Annotations for the piece of data in Example.
   * One piece of data can have multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Annotation annotations = 5;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotationOrBuilder>
      getAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Annotations for the piece of data in Example.
   * One piece of data can have multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Annotation annotations = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationOrBuilder getAnnotationsOrBuilder(int index);

  com.google.cloud.datalabeling.v1beta1.Example.PayloadCase getPayloadCase();
}
