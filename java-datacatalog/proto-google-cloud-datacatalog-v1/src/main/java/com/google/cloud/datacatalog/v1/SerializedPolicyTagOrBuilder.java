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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface SerializedPolicyTagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SerializedPolicyTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the policy tag.
   *
   * This field is ignored when calling `ImportTaxonomies`.
   * </pre>
   *
   * <code>string policy_tag = 1;</code>
   *
   * @return The policyTag.
   */
  java.lang.String getPolicyTag();
  /**
   *
   *
   * <pre>
   * Resource name of the policy tag.
   *
   * This field is ignored when calling `ImportTaxonomies`.
   * </pre>
   *
   * <code>string policy_tag = 1;</code>
   *
   * @return The bytes for policyTag.
   */
  com.google.protobuf.ByteString getPolicyTagBytes();

  /**
   *
   *
   * <pre>
   * Required. Display name of the policy tag. At most 200 bytes when encoded
   * in UTF-8.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Display name of the policy tag. At most 200 bytes when encoded
   * in UTF-8.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Description of the serialized policy tag. At most
   * 2000 bytes when encoded in UTF-8. If not set, defaults to an
   * empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the serialized policy tag. At most
   * 2000 bytes when encoded in UTF-8. If not set, defaults to an
   * empty description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Children of the policy tag, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.SerializedPolicyTag> getChildPolicyTagsList();
  /**
   *
   *
   * <pre>
   * Children of the policy tag, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  com.google.cloud.datacatalog.v1.SerializedPolicyTag getChildPolicyTags(int index);
  /**
   *
   *
   * <pre>
   * Children of the policy tag, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  int getChildPolicyTagsCount();
  /**
   *
   *
   * <pre>
   * Children of the policy tag, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.SerializedPolicyTagOrBuilder>
      getChildPolicyTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Children of the policy tag, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedPolicyTag child_policy_tags = 4;</code>
   */
  com.google.cloud.datacatalog.v1.SerializedPolicyTagOrBuilder getChildPolicyTagsOrBuilder(
      int index);
}
