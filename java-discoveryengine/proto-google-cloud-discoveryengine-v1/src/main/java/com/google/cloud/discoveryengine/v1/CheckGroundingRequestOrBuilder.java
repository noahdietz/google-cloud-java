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
// source: google/cloud/discoveryengine/v1/grounded_generation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface CheckGroundingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.CheckGroundingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the grounding config, such as
   * `projects/&#42;&#47;locations/global/groundingConfigs/default_grounding_config`.
   * </pre>
   *
   * <code>
   * string grounding_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The groundingConfig.
   */
  java.lang.String getGroundingConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the grounding config, such as
   * `projects/&#42;&#47;locations/global/groundingConfigs/default_grounding_config`.
   * </pre>
   *
   * <code>
   * string grounding_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for groundingConfig.
   */
  com.google.protobuf.ByteString getGroundingConfigBytes();

  /**
   *
   *
   * <pre>
   * Answer candidate to check. Can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>string answer_candidate = 2;</code>
   *
   * @return The answerCandidate.
   */
  java.lang.String getAnswerCandidate();
  /**
   *
   *
   * <pre>
   * Answer candidate to check. Can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>string answer_candidate = 2;</code>
   *
   * @return The bytes for answerCandidate.
   */
  com.google.protobuf.ByteString getAnswerCandidateBytes();

  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.GroundingFact facts = 3;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1.GroundingFact> getFactsList();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.GroundingFact facts = 3;</code>
   */
  com.google.cloud.discoveryengine.v1.GroundingFact getFacts(int index);
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.GroundingFact facts = 3;</code>
   */
  int getFactsCount();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.GroundingFact facts = 3;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1.GroundingFactOrBuilder>
      getFactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.GroundingFact facts = 3;</code>
   */
  com.google.cloud.discoveryengine.v1.GroundingFactOrBuilder getFactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.CheckGroundingSpec grounding_spec = 4;</code>
   *
   * @return Whether the groundingSpec field is set.
   */
  boolean hasGroundingSpec();
  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.CheckGroundingSpec grounding_spec = 4;</code>
   *
   * @return The groundingSpec.
   */
  com.google.cloud.discoveryengine.v1.CheckGroundingSpec getGroundingSpec();
  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.CheckGroundingSpec grounding_spec = 4;</code>
   */
  com.google.cloud.discoveryengine.v1.CheckGroundingSpecOrBuilder getGroundingSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 5;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 5;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 5;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 5;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);
}
