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
// source: google/cloud/contentwarehouse/v1/document_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contentwarehouse.v1;

public interface FetchAclResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.FetchAclResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IAM policy.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 1;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.contentwarehouse.v1.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder getMetadataOrBuilder();
}
