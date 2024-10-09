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
// source: google/shopping/merchant/inventories/v1beta/localinventory.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.inventories.v1beta;

public interface InsertLocalInventoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.InsertLocalInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The account and product where this inventory will be inserted.
   * Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Local inventory information of the product. If the product
   * already has a `LocalInventory` resource for the same `storeCode`, full
   * replacement of the `LocalInventory` resource is performed.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the localInventory field is set.
   */
  boolean hasLocalInventory();
  /**
   *
   *
   * <pre>
   * Required. Local inventory information of the product. If the product
   * already has a `LocalInventory` resource for the same `storeCode`, full
   * replacement of the `LocalInventory` resource is performed.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The localInventory.
   */
  com.google.shopping.merchant.inventories.v1beta.LocalInventory getLocalInventory();
  /**
   *
   *
   * <pre>
   * Required. Local inventory information of the product. If the product
   * already has a `LocalInventory` resource for the same `storeCode`, full
   * replacement of the `LocalInventory` resource is performed.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.inventories.v1beta.LocalInventory local_inventory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.inventories.v1beta.LocalInventoryOrBuilder
      getLocalInventoryOrBuilder();
}
