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
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface DataplexExternalTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DataplexExternalTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service in which the external table is registered.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
   *
   * @return The enum numeric value on the wire for system.
   */
  int getSystemValue();
  /**
   *
   *
   * <pre>
   * Service in which the external table is registered.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem system = 1;</code>
   *
   * @return The system.
   */
  com.google.cloud.datacatalog.v1.IntegratedSystem getSystem();

  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the external table.
   * </pre>
   *
   * <code>string fully_qualified_name = 28;</code>
   *
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the external table.
   * </pre>
   *
   * <code>string fully_qualified_name = 28;</code>
   *
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString getFullyQualifiedNameBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud resource name of the external table.
   * </pre>
   *
   * <code>string google_cloud_resource = 3;</code>
   *
   * @return The googleCloudResource.
   */
  java.lang.String getGoogleCloudResource();
  /**
   *
   *
   * <pre>
   * Google Cloud resource name of the external table.
   * </pre>
   *
   * <code>string google_cloud_resource = 3;</code>
   *
   * @return The bytes for googleCloudResource.
   */
  com.google.protobuf.ByteString getGoogleCloudResourceBytes();

  /**
   *
   *
   * <pre>
   * Name of the Data Catalog entry representing the external table.
   * </pre>
   *
   * <code>string data_catalog_entry = 4;</code>
   *
   * @return The dataCatalogEntry.
   */
  java.lang.String getDataCatalogEntry();
  /**
   *
   *
   * <pre>
   * Name of the Data Catalog entry representing the external table.
   * </pre>
   *
   * <code>string data_catalog_entry = 4;</code>
   *
   * @return The bytes for dataCatalogEntry.
   */
  com.google.protobuf.ByteString getDataCatalogEntryBytes();
}
