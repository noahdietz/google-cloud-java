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
// source: google/cloud/networkmanagement/v1/trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1;

public interface ForwardingRuleInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.ForwardingRuleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Protocol defined in the forwarding rule that matches the test.
   * </pre>
   *
   * <code>string matched_protocol = 3;</code>
   *
   * @return The matchedProtocol.
   */
  java.lang.String getMatchedProtocol();
  /**
   *
   *
   * <pre>
   * Protocol defined in the forwarding rule that matches the test.
   * </pre>
   *
   * <code>string matched_protocol = 3;</code>
   *
   * @return The bytes for matchedProtocol.
   */
  com.google.protobuf.ByteString getMatchedProtocolBytes();

  /**
   *
   *
   * <pre>
   * Port range defined in the forwarding rule that matches the test.
   * </pre>
   *
   * <code>string matched_port_range = 6;</code>
   *
   * @return The matchedPortRange.
   */
  java.lang.String getMatchedPortRange();
  /**
   *
   *
   * <pre>
   * Port range defined in the forwarding rule that matches the test.
   * </pre>
   *
   * <code>string matched_port_range = 6;</code>
   *
   * @return The bytes for matchedPortRange.
   */
  com.google.protobuf.ByteString getMatchedPortRangeBytes();

  /**
   *
   *
   * <pre>
   * VIP of the forwarding rule.
   * </pre>
   *
   * <code>string vip = 4;</code>
   *
   * @return The vip.
   */
  java.lang.String getVip();
  /**
   *
   *
   * <pre>
   * VIP of the forwarding rule.
   * </pre>
   *
   * <code>string vip = 4;</code>
   *
   * @return The bytes for vip.
   */
  com.google.protobuf.ByteString getVipBytes();

  /**
   *
   *
   * <pre>
   * Target type of the forwarding rule.
   * </pre>
   *
   * <code>string target = 5;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Target type of the forwarding rule.
   * </pre>
   *
   * <code>string target = 5;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Network URI. Only valid for Internal Load Balancer.
   * </pre>
   *
   * <code>string network_uri = 7;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * Network URI. Only valid for Internal Load Balancer.
   * </pre>
   *
   * <code>string network_uri = 7;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();
}
