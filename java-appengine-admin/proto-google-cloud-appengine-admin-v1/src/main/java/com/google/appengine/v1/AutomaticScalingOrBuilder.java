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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public interface AutomaticScalingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.AutomaticScaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time period that the
   * [Autoscaler](https://cloud.google.com/compute/docs/autoscaler/)
   * should wait before it starts collecting information from a new instance.
   * This prevents the autoscaler from collecting information when the instance
   * is initializing, during which the collected usage would not be reliable.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 1;</code>
   *
   * @return Whether the coolDownPeriod field is set.
   */
  boolean hasCoolDownPeriod();
  /**
   *
   *
   * <pre>
   * The time period that the
   * [Autoscaler](https://cloud.google.com/compute/docs/autoscaler/)
   * should wait before it starts collecting information from a new instance.
   * This prevents the autoscaler from collecting information when the instance
   * is initializing, during which the collected usage would not be reliable.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 1;</code>
   *
   * @return The coolDownPeriod.
   */
  com.google.protobuf.Duration getCoolDownPeriod();
  /**
   *
   *
   * <pre>
   * The time period that the
   * [Autoscaler](https://cloud.google.com/compute/docs/autoscaler/)
   * should wait before it starts collecting information from a new instance.
   * This prevents the autoscaler from collecting information when the instance
   * is initializing, during which the collected usage would not be reliable.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getCoolDownPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Target scaling by CPU usage.
   * </pre>
   *
   * <code>.google.appengine.v1.CpuUtilization cpu_utilization = 2;</code>
   *
   * @return Whether the cpuUtilization field is set.
   */
  boolean hasCpuUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by CPU usage.
   * </pre>
   *
   * <code>.google.appengine.v1.CpuUtilization cpu_utilization = 2;</code>
   *
   * @return The cpuUtilization.
   */
  com.google.appengine.v1.CpuUtilization getCpuUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by CPU usage.
   * </pre>
   *
   * <code>.google.appengine.v1.CpuUtilization cpu_utilization = 2;</code>
   */
  com.google.appengine.v1.CpuUtilizationOrBuilder getCpuUtilizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of concurrent requests an automatic scaling instance can accept
   * before the scheduler spawns a new instance.
   *
   * Defaults to a runtime-specific value.
   * </pre>
   *
   * <code>int32 max_concurrent_requests = 3;</code>
   *
   * @return The maxConcurrentRequests.
   */
  int getMaxConcurrentRequests();

  /**
   *
   *
   * <pre>
   * Maximum number of idle instances that should be maintained for this
   * version.
   * </pre>
   *
   * <code>int32 max_idle_instances = 4;</code>
   *
   * @return The maxIdleInstances.
   */
  int getMaxIdleInstances();

  /**
   *
   *
   * <pre>
   * Maximum number of instances that should be started to handle requests for
   * this version.
   * </pre>
   *
   * <code>int32 max_total_instances = 5;</code>
   *
   * @return The maxTotalInstances.
   */
  int getMaxTotalInstances();

  /**
   *
   *
   * <pre>
   * Maximum amount of time that a request should wait in the pending queue
   * before starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_pending_latency = 6;</code>
   *
   * @return Whether the maxPendingLatency field is set.
   */
  boolean hasMaxPendingLatency();
  /**
   *
   *
   * <pre>
   * Maximum amount of time that a request should wait in the pending queue
   * before starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_pending_latency = 6;</code>
   *
   * @return The maxPendingLatency.
   */
  com.google.protobuf.Duration getMaxPendingLatency();
  /**
   *
   *
   * <pre>
   * Maximum amount of time that a request should wait in the pending queue
   * before starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_pending_latency = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxPendingLatencyOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum number of idle instances that should be maintained for
   * this version. Only applicable for the default version of a service.
   * </pre>
   *
   * <code>int32 min_idle_instances = 7;</code>
   *
   * @return The minIdleInstances.
   */
  int getMinIdleInstances();

  /**
   *
   *
   * <pre>
   * Minimum number of running instances that should be maintained for this
   * version.
   * </pre>
   *
   * <code>int32 min_total_instances = 8;</code>
   *
   * @return The minTotalInstances.
   */
  int getMinTotalInstances();

  /**
   *
   *
   * <pre>
   * Minimum amount of time a request should wait in the pending queue before
   * starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_pending_latency = 9;</code>
   *
   * @return Whether the minPendingLatency field is set.
   */
  boolean hasMinPendingLatency();
  /**
   *
   *
   * <pre>
   * Minimum amount of time a request should wait in the pending queue before
   * starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_pending_latency = 9;</code>
   *
   * @return The minPendingLatency.
   */
  com.google.protobuf.Duration getMinPendingLatency();
  /**
   *
   *
   * <pre>
   * Minimum amount of time a request should wait in the pending queue before
   * starting a new instance to handle it.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_pending_latency = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinPendingLatencyOrBuilder();

  /**
   *
   *
   * <pre>
   * Target scaling by request utilization.
   * </pre>
   *
   * <code>.google.appengine.v1.RequestUtilization request_utilization = 10;</code>
   *
   * @return Whether the requestUtilization field is set.
   */
  boolean hasRequestUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by request utilization.
   * </pre>
   *
   * <code>.google.appengine.v1.RequestUtilization request_utilization = 10;</code>
   *
   * @return The requestUtilization.
   */
  com.google.appengine.v1.RequestUtilization getRequestUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by request utilization.
   * </pre>
   *
   * <code>.google.appengine.v1.RequestUtilization request_utilization = 10;</code>
   */
  com.google.appengine.v1.RequestUtilizationOrBuilder getRequestUtilizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Target scaling by disk usage.
   * </pre>
   *
   * <code>.google.appengine.v1.DiskUtilization disk_utilization = 11;</code>
   *
   * @return Whether the diskUtilization field is set.
   */
  boolean hasDiskUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by disk usage.
   * </pre>
   *
   * <code>.google.appengine.v1.DiskUtilization disk_utilization = 11;</code>
   *
   * @return The diskUtilization.
   */
  com.google.appengine.v1.DiskUtilization getDiskUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by disk usage.
   * </pre>
   *
   * <code>.google.appengine.v1.DiskUtilization disk_utilization = 11;</code>
   */
  com.google.appengine.v1.DiskUtilizationOrBuilder getDiskUtilizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Target scaling by network usage.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkUtilization network_utilization = 12;</code>
   *
   * @return Whether the networkUtilization field is set.
   */
  boolean hasNetworkUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by network usage.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkUtilization network_utilization = 12;</code>
   *
   * @return The networkUtilization.
   */
  com.google.appengine.v1.NetworkUtilization getNetworkUtilization();
  /**
   *
   *
   * <pre>
   * Target scaling by network usage.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkUtilization network_utilization = 12;</code>
   */
  com.google.appengine.v1.NetworkUtilizationOrBuilder getNetworkUtilizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Scheduler settings for standard environment.
   * </pre>
   *
   * <code>.google.appengine.v1.StandardSchedulerSettings standard_scheduler_settings = 20;</code>
   *
   * @return Whether the standardSchedulerSettings field is set.
   */
  boolean hasStandardSchedulerSettings();
  /**
   *
   *
   * <pre>
   * Scheduler settings for standard environment.
   * </pre>
   *
   * <code>.google.appengine.v1.StandardSchedulerSettings standard_scheduler_settings = 20;</code>
   *
   * @return The standardSchedulerSettings.
   */
  com.google.appengine.v1.StandardSchedulerSettings getStandardSchedulerSettings();
  /**
   *
   *
   * <pre>
   * Scheduler settings for standard environment.
   * </pre>
   *
   * <code>.google.appengine.v1.StandardSchedulerSettings standard_scheduler_settings = 20;</code>
   */
  com.google.appengine.v1.StandardSchedulerSettingsOrBuilder
      getStandardSchedulerSettingsOrBuilder();
}
