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
// source: google/cloud/networkconnectivity/v1alpha1/hub.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkconnectivity.v1alpha1;

public interface RouterApplianceInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of the virtual machine resource
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The virtualMachine.
   */
  java.lang.String getVirtualMachine();
  /**
   *
   *
   * <pre>
   * The URI of the virtual machine resource
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for virtualMachine.
   */
  com.google.protobuf.ByteString getVirtualMachineBytes();

  /**
   *
   *
   * <pre>
   * The IP address of the network interface to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * The IP address of the network interface to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   * <code>string network_interface = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface
   *     is deprecated. See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
   * @return The networkInterface.
   */
  @java.lang.Deprecated
  java.lang.String getNetworkInterface();
  /**
   * <code>string network_interface = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface
   *     is deprecated. See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
   * @return The bytes for networkInterface.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNetworkInterfaceBytes();
}
