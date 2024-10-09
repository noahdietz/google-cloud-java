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
// source: google/cloud/automl/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

public interface DeployModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.DeployModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Object Detection.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata image_object_detection_model_deployment_metadata = 2;
   * </code>
   *
   * @return Whether the imageObjectDetectionModelDeploymentMetadata field is set.
   */
  boolean hasImageObjectDetectionModelDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Object Detection.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata image_object_detection_model_deployment_metadata = 2;
   * </code>
   *
   * @return The imageObjectDetectionModelDeploymentMetadata.
   */
  com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      getImageObjectDetectionModelDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Object Detection.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata image_object_detection_model_deployment_metadata = 2;
   * </code>
   */
  com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadataOrBuilder
      getImageObjectDetectionModelDeploymentMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageClassificationModelDeploymentMetadata image_classification_model_deployment_metadata = 4;
   * </code>
   *
   * @return Whether the imageClassificationModelDeploymentMetadata field is set.
   */
  boolean hasImageClassificationModelDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageClassificationModelDeploymentMetadata image_classification_model_deployment_metadata = 4;
   * </code>
   *
   * @return The imageClassificationModelDeploymentMetadata.
   */
  com.google.cloud.automl.v1.ImageClassificationModelDeploymentMetadata
      getImageClassificationModelDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Model deployment metadata specific to Image Classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1.ImageClassificationModelDeploymentMetadata image_classification_model_deployment_metadata = 4;
   * </code>
   */
  com.google.cloud.automl.v1.ImageClassificationModelDeploymentMetadataOrBuilder
      getImageClassificationModelDeploymentMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the model to deploy.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the model to deploy.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  com.google.cloud.automl.v1.DeployModelRequest.ModelDeploymentMetadataCase
      getModelDeploymentMetadataCase();
}
