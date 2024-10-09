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
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.api.serviceusage.v1beta1;

public interface ConsumerQuotaMetricOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ConsumerQuotaMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the quota settings on this metric for this consumer.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus`
   *
   * The resource name is intended to be opaque and should not be parsed for
   * its component strings, since its representation could change in the future.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the quota settings on this metric for this consumer.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus`
   *
   * The resource name is intended to be opaque and should not be parsed for
   * its component strings, since its representation could change in the future.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the metric.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 4;</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * The name of the metric.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 4;</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();

  /**
   *
   *
   * <pre>
   * The display name of the metric.
   *
   * An example name would be:
   * `CPUs`
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the metric.
   *
   * An example name would be:
   * `CPUs`
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The consumer quota for each quota limit defined on the metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit consumer_quota_limits = 3;
   * </code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaLimit>
      getConsumerQuotaLimitsList();
  /**
   *
   *
   * <pre>
   * The consumer quota for each quota limit defined on the metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit consumer_quota_limits = 3;
   * </code>
   */
  com.google.api.serviceusage.v1beta1.ConsumerQuotaLimit getConsumerQuotaLimits(int index);
  /**
   *
   *
   * <pre>
   * The consumer quota for each quota limit defined on the metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit consumer_quota_limits = 3;
   * </code>
   */
  int getConsumerQuotaLimitsCount();
  /**
   *
   *
   * <pre>
   * The consumer quota for each quota limit defined on the metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit consumer_quota_limits = 3;
   * </code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.ConsumerQuotaLimitOrBuilder>
      getConsumerQuotaLimitsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The consumer quota for each quota limit defined on the metric.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit consumer_quota_limits = 3;
   * </code>
   */
  com.google.api.serviceusage.v1beta1.ConsumerQuotaLimitOrBuilder getConsumerQuotaLimitsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The quota limits targeting the descendant containers of the
   * consumer in request.
   *
   * If the consumer in request is of type `organizations`
   * or `folders`, the field will list per-project limits in the metric; if the
   * consumer in request is of type `project`, the field will be empty.
   *
   * The `quota_buckets` field of each descendant consumer quota limit will not
   * be populated.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit descendant_consumer_quota_limits = 6;
   * </code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.ConsumerQuotaLimit>
      getDescendantConsumerQuotaLimitsList();
  /**
   *
   *
   * <pre>
   * The quota limits targeting the descendant containers of the
   * consumer in request.
   *
   * If the consumer in request is of type `organizations`
   * or `folders`, the field will list per-project limits in the metric; if the
   * consumer in request is of type `project`, the field will be empty.
   *
   * The `quota_buckets` field of each descendant consumer quota limit will not
   * be populated.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit descendant_consumer_quota_limits = 6;
   * </code>
   */
  com.google.api.serviceusage.v1beta1.ConsumerQuotaLimit getDescendantConsumerQuotaLimits(
      int index);
  /**
   *
   *
   * <pre>
   * The quota limits targeting the descendant containers of the
   * consumer in request.
   *
   * If the consumer in request is of type `organizations`
   * or `folders`, the field will list per-project limits in the metric; if the
   * consumer in request is of type `project`, the field will be empty.
   *
   * The `quota_buckets` field of each descendant consumer quota limit will not
   * be populated.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit descendant_consumer_quota_limits = 6;
   * </code>
   */
  int getDescendantConsumerQuotaLimitsCount();
  /**
   *
   *
   * <pre>
   * The quota limits targeting the descendant containers of the
   * consumer in request.
   *
   * If the consumer in request is of type `organizations`
   * or `folders`, the field will list per-project limits in the metric; if the
   * consumer in request is of type `project`, the field will be empty.
   *
   * The `quota_buckets` field of each descendant consumer quota limit will not
   * be populated.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit descendant_consumer_quota_limits = 6;
   * </code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.ConsumerQuotaLimitOrBuilder>
      getDescendantConsumerQuotaLimitsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The quota limits targeting the descendant containers of the
   * consumer in request.
   *
   * If the consumer in request is of type `organizations`
   * or `folders`, the field will list per-project limits in the metric; if the
   * consumer in request is of type `project`, the field will be empty.
   *
   * The `quota_buckets` field of each descendant consumer quota limit will not
   * be populated.
   * </pre>
   *
   * <code>
   * repeated .google.api.serviceusage.v1beta1.ConsumerQuotaLimit descendant_consumer_quota_limits = 6;
   * </code>
   */
  com.google.api.serviceusage.v1beta1.ConsumerQuotaLimitOrBuilder
      getDescendantConsumerQuotaLimitsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The units in which the metric value is reported.
   * </pre>
   *
   * <code>string unit = 5;</code>
   *
   * @return The unit.
   */
  java.lang.String getUnit();
  /**
   *
   *
   * <pre>
   * The units in which the metric value is reported.
   * </pre>
   *
   * <code>string unit = 5;</code>
   *
   * @return The bytes for unit.
   */
  com.google.protobuf.ByteString getUnitBytes();
}
