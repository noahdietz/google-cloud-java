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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface StatefulPolicyPreservedStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.StatefulPolicyPreservedState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;
   * </code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;
   * </code>
   */
  boolean containsDisks(java.lang.String key);
  /** Use {@link #getDisksMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
      getDisks();
  /**
   *
   *
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
      getDisksMap();
  /**
   *
   *
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice defaultValue);
  /**
   *
   *
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;
   * </code>
   */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  int getExternalIPsCount();
  /**
   *
   *
   * <pre>
   * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  boolean containsExternalIPs(java.lang.String key);
  /** Use {@link #getExternalIPsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp>
      getExternalIPs();
  /**
   *
   *
   * <pre>
   * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp>
      getExternalIPsMap();
  /**
   *
   *
   * <pre>
   * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp getExternalIPsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp defaultValue);
  /**
   *
   *
   * <pre>
   * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; external_i_ps = 532687245;
   * </code>
   */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp getExternalIPsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  int getInternalIPsCount();
  /**
   *
   *
   * <pre>
   * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  boolean containsInternalIPs(java.lang.String key);
  /** Use {@link #getInternalIPsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp>
      getInternalIPs();
  /**
   *
   *
   * <pre>
   * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp>
      getInternalIPsMap();
  /**
   *
   *
   * <pre>
   * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp getInternalIPsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp defaultValue);
  /**
   *
   *
   * <pre>
   * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp&gt; internal_i_ps = 215731675;
   * </code>
   */
  com.google.cloud.compute.v1.StatefulPolicyPreservedStateNetworkIp getInternalIPsOrThrow(
      java.lang.String key);
}
