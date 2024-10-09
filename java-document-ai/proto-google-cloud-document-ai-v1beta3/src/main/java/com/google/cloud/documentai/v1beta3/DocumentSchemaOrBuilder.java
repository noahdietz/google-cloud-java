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
// source: google/cloud/documentai/v1beta3/document_schema.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.documentai.v1beta3;

public interface DocumentSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.DocumentSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Display name to show to users.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name to show to users.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Description of the schema.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the schema.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Entity types of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentSchema.EntityType entity_types = 3;
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.DocumentSchema.EntityType>
      getEntityTypesList();
  /**
   *
   *
   * <pre>
   * Entity types of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentSchema.EntityType entity_types = 3;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema.EntityType getEntityTypes(int index);
  /**
   *
   *
   * <pre>
   * Entity types of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentSchema.EntityType entity_types = 3;
   * </code>
   */
  int getEntityTypesCount();
  /**
   *
   *
   * <pre>
   * Entity types of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentSchema.EntityType entity_types = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta3.DocumentSchema.EntityTypeOrBuilder>
      getEntityTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Entity types of the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.DocumentSchema.EntityType entity_types = 3;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema.EntityTypeOrBuilder getEntityTypesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Metadata of the schema.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema.Metadata metadata = 4;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the schema.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema.Metadata metadata = 4;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema.Metadata getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the schema.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentSchema.Metadata metadata = 4;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema.MetadataOrBuilder getMetadataOrBuilder();
}
