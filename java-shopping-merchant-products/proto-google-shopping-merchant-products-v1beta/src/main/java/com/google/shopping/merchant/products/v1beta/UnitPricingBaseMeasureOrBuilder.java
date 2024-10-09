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
// source: google/shopping/merchant/products/v1beta/products_common.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.products.v1beta;

public interface UnitPricingBaseMeasureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.products.v1beta.UnitPricingBaseMeasure)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The denominator of the unit price.
   * </pre>
   *
   * <code>int64 value = 1;</code>
   *
   * @return The value.
   */
  long getValue();

  /**
   *
   *
   * <pre>
   * The unit of the denominator.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The unit.
   */
  java.lang.String getUnit();
  /**
   *
   *
   * <pre>
   * The unit of the denominator.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The bytes for unit.
   */
  com.google.protobuf.ByteString getUnitBytes();
}
