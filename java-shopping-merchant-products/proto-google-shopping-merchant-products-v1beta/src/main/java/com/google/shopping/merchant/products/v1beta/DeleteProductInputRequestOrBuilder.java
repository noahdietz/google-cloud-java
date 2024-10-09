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
// source: google/shopping/merchant/products/v1beta/productinputs.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.products.v1beta;

public interface DeleteProductInputRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.products.v1beta.DeleteProductInputRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the product input resource to delete.
   * Format: accounts/{account}/productInputs/{product}
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
   * Required. The name of the product input resource to delete.
   * Format: accounts/{account}/productInputs/{product}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The primary or supplemental data source from which the product
   * input should be deleted. Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * Required. The primary or supplemental data source from which the product
   * input should be deleted. Format:
   * `accounts/{account}/dataSources/{datasource}`.
   * </pre>
   *
   * <code>string data_source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();
}
