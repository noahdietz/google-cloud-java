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
// source: google/cloud/edgenetwork/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.edgenetwork.v1;

public interface InterconnectDiagnosticsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.InterconnectDiagnostics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The MAC address of the Interconnect's bundle interface.
   * </pre>
   *
   * <code>string mac_address = 1;</code>
   *
   * @return The macAddress.
   */
  java.lang.String getMacAddress();
  /**
   *
   *
   * <pre>
   * The MAC address of the Interconnect's bundle interface.
   * </pre>
   *
   * <code>string mac_address = 1;</code>
   *
   * @return The bytes for macAddress.
   */
  com.google.protobuf.ByteString getMacAddressBytes();

  /**
   *
   *
   * <pre>
   * A list of LinkLayerAddress, describing the ip address and corresponding
   * link-layer address of the neighbors for this interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.LinkLayerAddress link_layer_addresses = 2;</code>
   */
  java.util.List<com.google.cloud.edgenetwork.v1.LinkLayerAddress> getLinkLayerAddressesList();
  /**
   *
   *
   * <pre>
   * A list of LinkLayerAddress, describing the ip address and corresponding
   * link-layer address of the neighbors for this interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.LinkLayerAddress link_layer_addresses = 2;</code>
   */
  com.google.cloud.edgenetwork.v1.LinkLayerAddress getLinkLayerAddresses(int index);
  /**
   *
   *
   * <pre>
   * A list of LinkLayerAddress, describing the ip address and corresponding
   * link-layer address of the neighbors for this interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.LinkLayerAddress link_layer_addresses = 2;</code>
   */
  int getLinkLayerAddressesCount();
  /**
   *
   *
   * <pre>
   * A list of LinkLayerAddress, describing the ip address and corresponding
   * link-layer address of the neighbors for this interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.LinkLayerAddress link_layer_addresses = 2;</code>
   */
  java.util.List<? extends com.google.cloud.edgenetwork.v1.LinkLayerAddressOrBuilder>
      getLinkLayerAddressesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of LinkLayerAddress, describing the ip address and corresponding
   * link-layer address of the neighbors for this interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.LinkLayerAddress link_layer_addresses = 2;</code>
   */
  com.google.cloud.edgenetwork.v1.LinkLayerAddressOrBuilder getLinkLayerAddressesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of LinkStatus objects, used to describe the status for each link on
   * the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus links = 3;
   * </code>
   */
  java.util.List<com.google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus> getLinksList();
  /**
   *
   *
   * <pre>
   * A list of LinkStatus objects, used to describe the status for each link on
   * the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus links = 3;
   * </code>
   */
  com.google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus getLinks(int index);
  /**
   *
   *
   * <pre>
   * A list of LinkStatus objects, used to describe the status for each link on
   * the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus links = 3;
   * </code>
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * A list of LinkStatus objects, used to describe the status for each link on
   * the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus links = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatusOrBuilder>
      getLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of LinkStatus objects, used to describe the status for each link on
   * the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatus links = 3;
   * </code>
   */
  com.google.cloud.edgenetwork.v1.InterconnectDiagnostics.LinkStatusOrBuilder getLinksOrBuilder(
      int index);
}
