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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.5
package com.google.iam.admin.v1;

public interface QueryAuditableServicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.QueryAuditableServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The auditable services for a resource.
   * </pre>
   *
   * <code>
   * repeated .google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService services = 1;
   * </code>
   */
  java.util.List<com.google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService>
      getServicesList();
  /**
   *
   *
   * <pre>
   * The auditable services for a resource.
   * </pre>
   *
   * <code>
   * repeated .google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService services = 1;
   * </code>
   */
  com.google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService getServices(int index);
  /**
   *
   *
   * <pre>
   * The auditable services for a resource.
   * </pre>
   *
   * <code>
   * repeated .google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService services = 1;
   * </code>
   */
  int getServicesCount();
  /**
   *
   *
   * <pre>
   * The auditable services for a resource.
   * </pre>
   *
   * <code>
   * repeated .google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService services = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.iam.admin.v1.QueryAuditableServicesResponse.AuditableServiceOrBuilder>
      getServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The auditable services for a resource.
   * </pre>
   *
   * <code>
   * repeated .google.iam.admin.v1.QueryAuditableServicesResponse.AuditableService services = 1;
   * </code>
   */
  com.google.iam.admin.v1.QueryAuditableServicesResponse.AuditableServiceOrBuilder
      getServicesOrBuilder(int index);
}
