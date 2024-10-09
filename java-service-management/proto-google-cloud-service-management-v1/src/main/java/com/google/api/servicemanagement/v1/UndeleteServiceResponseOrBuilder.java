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
// source: google/api/servicemanagement/v1/servicemanager.proto

// Protobuf Java Version: 3.25.5
package com.google.api.servicemanagement.v1;

public interface UndeleteServiceResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.UndeleteServiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ManagedService service = 1;</code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ManagedService service = 1;</code>
   *
   * @return The service.
   */
  com.google.api.servicemanagement.v1.ManagedService getService();
  /**
   *
   *
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  com.google.api.servicemanagement.v1.ManagedServiceOrBuilder getServiceOrBuilder();
}
