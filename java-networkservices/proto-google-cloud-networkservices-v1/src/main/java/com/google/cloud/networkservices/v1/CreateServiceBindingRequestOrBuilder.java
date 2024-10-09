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
// source: google/cloud/networkservices/v1/service_binding.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

public interface CreateServiceBindingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.CreateServiceBindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the ServiceBinding. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. The parent resource of the ServiceBinding. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. Short name of the ServiceBinding resource to be created.
   * </pre>
   *
   * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceBindingId.
   */
  java.lang.String getServiceBindingId();
  /**
   *
   *
   * <pre>
   * Required. Short name of the ServiceBinding resource to be created.
   * </pre>
   *
   * <code>string service_binding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceBindingId.
   */
  com.google.protobuf.ByteString getServiceBindingIdBytes();

  /**
   *
   *
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the serviceBinding field is set.
   */
  boolean hasServiceBinding();
  /**
   *
   *
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serviceBinding.
   */
  com.google.cloud.networkservices.v1.ServiceBinding getServiceBinding();
  /**
   *
   *
   * <pre>
   * Required. ServiceBinding resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.ServiceBinding service_binding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.ServiceBindingOrBuilder getServiceBindingOrBuilder();
}
