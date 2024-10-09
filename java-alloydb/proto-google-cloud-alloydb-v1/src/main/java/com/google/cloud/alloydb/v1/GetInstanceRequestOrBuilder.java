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
// source: google/cloud/alloydb/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1;

public interface GetInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.GetInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the resource. For the required format, see the
   * comment on the Instance.name field.
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
   * Required. The name of the resource. For the required format, see the
   * comment on the Instance.name field.
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
   * The view of the instance to return.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.InstanceView view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * The view of the instance to return.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1.InstanceView view = 2;</code>
   *
   * @return The view.
   */
  com.google.cloud.alloydb.v1.InstanceView getView();
}
