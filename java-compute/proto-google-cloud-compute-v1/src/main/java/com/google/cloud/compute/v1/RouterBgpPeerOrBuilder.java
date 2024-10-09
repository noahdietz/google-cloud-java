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

public interface RouterBgpPeerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterBgpPeer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement.
   * Check the AdvertiseMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string advertise_mode = 312134331;</code>
   *
   * @return Whether the advertiseMode field is set.
   */
  boolean hasAdvertiseMode();
  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement.
   * Check the AdvertiseMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string advertise_mode = 312134331;</code>
   *
   * @return The advertiseMode.
   */
  java.lang.String getAdvertiseMode();
  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement.
   * Check the AdvertiseMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string advertise_mode = 312134331;</code>
   *
   * @return The bytes for advertiseMode.
   */
  com.google.protobuf.ByteString getAdvertiseModeBytes();

  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode, which currently supports the following option: - ALL_SUBNETS: Advertises all of the router's own VPC subnets. This excludes any routes learned for subnets that use VPC Network Peering. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * Check the AdvertisedGroups enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string advertised_groups = 21065526;</code>
   *
   * @return A list containing the advertisedGroups.
   */
  java.util.List<java.lang.String> getAdvertisedGroupsList();
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode, which currently supports the following option: - ALL_SUBNETS: Advertises all of the router's own VPC subnets. This excludes any routes learned for subnets that use VPC Network Peering. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * Check the AdvertisedGroups enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string advertised_groups = 21065526;</code>
   *
   * @return The count of advertisedGroups.
   */
  int getAdvertisedGroupsCount();
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode, which currently supports the following option: - ALL_SUBNETS: Advertises all of the router's own VPC subnets. This excludes any routes learned for subnets that use VPC Network Peering. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * Check the AdvertisedGroups enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string advertised_groups = 21065526;</code>
   *
   * @param index The index of the element to return.
   * @return The advertisedGroups at the given index.
   */
  java.lang.String getAdvertisedGroups(int index);
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode, which currently supports the following option: - ALL_SUBNETS: Advertises all of the router's own VPC subnets. This excludes any routes learned for subnets that use VPC Network Peering. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * Check the AdvertisedGroups enum for the list of possible values.
   * </pre>
   *
   * <code>repeated string advertised_groups = 21065526;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the advertisedGroups at the given index.
   */
  com.google.protobuf.ByteString getAdvertisedGroupsBytes(int index);

  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange> getAdvertisedIpRangesList();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  com.google.cloud.compute.v1.RouterAdvertisedIpRange getAdvertisedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  int getAdvertisedIpRangesCount();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterAdvertisedIpRangeOrBuilder>
      getAdvertisedIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  com.google.cloud.compute.v1.RouterAdvertisedIpRangeOrBuilder getAdvertisedIpRangesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
   * </pre>
   *
   * <code>optional uint32 advertised_route_priority = 186486332;</code>
   *
   * @return Whether the advertisedRoutePriority field is set.
   */
  boolean hasAdvertisedRoutePriority();
  /**
   *
   *
   * <pre>
   * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
   * </pre>
   *
   * <code>optional uint32 advertised_route_priority = 186486332;</code>
   *
   * @return The advertisedRoutePriority.
   */
  int getAdvertisedRoutePriority();

  /**
   *
   *
   * <pre>
   * BFD configuration for the BGP peering.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgpPeerBfd bfd = 97440;</code>
   *
   * @return Whether the bfd field is set.
   */
  boolean hasBfd();
  /**
   *
   *
   * <pre>
   * BFD configuration for the BGP peering.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgpPeerBfd bfd = 97440;</code>
   *
   * @return The bfd.
   */
  com.google.cloud.compute.v1.RouterBgpPeerBfd getBfd();
  /**
   *
   *
   * <pre>
   * BFD configuration for the BGP peering.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgpPeerBfd bfd = 97440;</code>
   */
  com.google.cloud.compute.v1.RouterBgpPeerBfdOrBuilder getBfdOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of user-defined custom learned route IP address ranges for a BGP session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange custom_learned_ip_ranges = 481363012;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange>
      getCustomLearnedIpRangesList();
  /**
   *
   *
   * <pre>
   * A list of user-defined custom learned route IP address ranges for a BGP session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange custom_learned_ip_ranges = 481363012;
   * </code>
   */
  com.google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange getCustomLearnedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * A list of user-defined custom learned route IP address ranges for a BGP session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange custom_learned_ip_ranges = 481363012;
   * </code>
   */
  int getCustomLearnedIpRangesCount();
  /**
   *
   *
   * <pre>
   * A list of user-defined custom learned route IP address ranges for a BGP session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange custom_learned_ip_ranges = 481363012;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRangeOrBuilder>
      getCustomLearnedIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of user-defined custom learned route IP address ranges for a BGP session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRange custom_learned_ip_ranges = 481363012;
   * </code>
   */
  com.google.cloud.compute.v1.RouterBgpPeerCustomLearnedIpRangeOrBuilder
      getCustomLearnedIpRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The user-defined custom learned route priority for a BGP session. This value is applied to all custom learned route ranges for the session. You can choose a value from `0` to `65335`. If you don't provide a value, Google Cloud assigns a priority of `100` to the ranges.
   * </pre>
   *
   * <code>optional int32 custom_learned_route_priority = 330412356;</code>
   *
   * @return Whether the customLearnedRoutePriority field is set.
   */
  boolean hasCustomLearnedRoutePriority();
  /**
   *
   *
   * <pre>
   * The user-defined custom learned route priority for a BGP session. This value is applied to all custom learned route ranges for the session. You can choose a value from `0` to `65335`. If you don't provide a value, Google Cloud assigns a priority of `100` to the ranges.
   * </pre>
   *
   * <code>optional int32 custom_learned_route_priority = 330412356;</code>
   *
   * @return The customLearnedRoutePriority.
   */
  int getCustomLearnedRoutePriority();

  /**
   *
   *
   * <pre>
   * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   *
   *
   * <pre>
   * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return The enable.
   */
  java.lang.String getEnable();
  /**
   *
   *
   * <pre>
   * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return The bytes for enable.
   */
  com.google.protobuf.ByteString getEnableBytes();

  /**
   *
   *
   * <pre>
   * Enable IPv4 traffic over BGP Peer. It is enabled by default if the peerIpAddress is version 4.
   * </pre>
   *
   * <code>optional bool enable_ipv4 = 181467937;</code>
   *
   * @return Whether the enableIpv4 field is set.
   */
  boolean hasEnableIpv4();
  /**
   *
   *
   * <pre>
   * Enable IPv4 traffic over BGP Peer. It is enabled by default if the peerIpAddress is version 4.
   * </pre>
   *
   * <code>optional bool enable_ipv4 = 181467937;</code>
   *
   * @return The enableIpv4.
   */
  boolean getEnableIpv4();

  /**
   *
   *
   * <pre>
   * Enable IPv6 traffic over BGP Peer. It is enabled by default if the peerIpAddress is version 6.
   * </pre>
   *
   * <code>optional bool enable_ipv6 = 181467939;</code>
   *
   * @return Whether the enableIpv6 field is set.
   */
  boolean hasEnableIpv6();
  /**
   *
   *
   * <pre>
   * Enable IPv6 traffic over BGP Peer. It is enabled by default if the peerIpAddress is version 6.
   * </pre>
   *
   * <code>optional bool enable_ipv6 = 181467939;</code>
   *
   * @return The enableIpv6.
   */
  boolean getEnableIpv6();

  /**
   *
   *
   * <pre>
   * List of export policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_EXPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string export_policies = 134084987;</code>
   *
   * @return A list containing the exportPolicies.
   */
  java.util.List<java.lang.String> getExportPoliciesList();
  /**
   *
   *
   * <pre>
   * List of export policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_EXPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string export_policies = 134084987;</code>
   *
   * @return The count of exportPolicies.
   */
  int getExportPoliciesCount();
  /**
   *
   *
   * <pre>
   * List of export policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_EXPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string export_policies = 134084987;</code>
   *
   * @param index The index of the element to return.
   * @return The exportPolicies at the given index.
   */
  java.lang.String getExportPolicies(int index);
  /**
   *
   *
   * <pre>
   * List of export policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_EXPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string export_policies = 134084987;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exportPolicies at the given index.
   */
  com.google.protobuf.ByteString getExportPoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * List of import policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_IMPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string import_policies = 451147946;</code>
   *
   * @return A list containing the importPolicies.
   */
  java.util.List<java.lang.String> getImportPoliciesList();
  /**
   *
   *
   * <pre>
   * List of import policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_IMPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string import_policies = 451147946;</code>
   *
   * @return The count of importPolicies.
   */
  int getImportPoliciesCount();
  /**
   *
   *
   * <pre>
   * List of import policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_IMPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string import_policies = 451147946;</code>
   *
   * @param index The index of the element to return.
   * @return The importPolicies at the given index.
   */
  java.lang.String getImportPolicies(int index);
  /**
   *
   *
   * <pre>
   * List of import policies applied to this peer, in the order they must be evaluated. The name must correspond to an existing policy that has ROUTE_POLICY_TYPE_IMPORT type. Note that Route Policies are currently available in preview. Please use Beta API to use Route Policies.
   * </pre>
   *
   * <code>repeated string import_policies = 451147946;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the importPolicies at the given index.
   */
  com.google.protobuf.ByteString getImportPoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * Name of the interface the BGP peer is associated with.
   * </pre>
   *
   * <code>optional string interface_name = 437854673;</code>
   *
   * @return Whether the interfaceName field is set.
   */
  boolean hasInterfaceName();
  /**
   *
   *
   * <pre>
   * Name of the interface the BGP peer is associated with.
   * </pre>
   *
   * <code>optional string interface_name = 437854673;</code>
   *
   * @return The interfaceName.
   */
  java.lang.String getInterfaceName();
  /**
   *
   *
   * <pre>
   * Name of the interface the BGP peer is associated with.
   * </pre>
   *
   * <code>optional string interface_name = 437854673;</code>
   *
   * @return The bytes for interfaceName.
   */
  com.google.protobuf.ByteString getInterfaceNameBytes();

  /**
   *
   *
   * <pre>
   * IP address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * IPv4 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv4_nexthop_address = 5703377;</code>
   *
   * @return Whether the ipv4NexthopAddress field is set.
   */
  boolean hasIpv4NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv4 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv4_nexthop_address = 5703377;</code>
   *
   * @return The ipv4NexthopAddress.
   */
  java.lang.String getIpv4NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv4 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv4_nexthop_address = 5703377;</code>
   *
   * @return The bytes for ipv4NexthopAddress.
   */
  com.google.protobuf.ByteString getIpv4NexthopAddressBytes();

  /**
   *
   *
   * <pre>
   * IPv6 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv6_nexthop_address = 27968211;</code>
   *
   * @return Whether the ipv6NexthopAddress field is set.
   */
  boolean hasIpv6NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv6 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv6_nexthop_address = 27968211;</code>
   *
   * @return The ipv6NexthopAddress.
   */
  java.lang.String getIpv6NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv6 address of the interface inside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string ipv6_nexthop_address = 27968211;</code>
   *
   * @return The bytes for ipv6NexthopAddress.
   */
  com.google.protobuf.ByteString getIpv6NexthopAddressBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return Whether the managementType field is set.
   */
  boolean hasManagementType();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return The managementType.
   */
  java.lang.String getManagementType();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * Check the ManagementType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string management_type = 173703606;</code>
   *
   * @return The bytes for managementType.
   */
  com.google.protobuf.ByteString getManagementTypeBytes();

  /**
   *
   *
   * <pre>
   * Present if MD5 authentication is enabled for the peering. Must be the name of one of the entries in the Router.md5_authentication_keys. The field must comply with RFC1035.
   * </pre>
   *
   * <code>optional string md5_authentication_key_name = 281075345;</code>
   *
   * @return Whether the md5AuthenticationKeyName field is set.
   */
  boolean hasMd5AuthenticationKeyName();
  /**
   *
   *
   * <pre>
   * Present if MD5 authentication is enabled for the peering. Must be the name of one of the entries in the Router.md5_authentication_keys. The field must comply with RFC1035.
   * </pre>
   *
   * <code>optional string md5_authentication_key_name = 281075345;</code>
   *
   * @return The md5AuthenticationKeyName.
   */
  java.lang.String getMd5AuthenticationKeyName();
  /**
   *
   *
   * <pre>
   * Present if MD5 authentication is enabled for the peering. Must be the name of one of the entries in the Router.md5_authentication_keys. The field must comply with RFC1035.
   * </pre>
   *
   * <code>optional string md5_authentication_key_name = 281075345;</code>
   *
   * @return The bytes for md5AuthenticationKeyName.
   */
  com.google.protobuf.ByteString getMd5AuthenticationKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
   * </pre>
   *
   * <code>optional uint32 peer_asn = 69573151;</code>
   *
   * @return Whether the peerAsn field is set.
   */
  boolean hasPeerAsn();
  /**
   *
   *
   * <pre>
   * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
   * </pre>
   *
   * <code>optional uint32 peer_asn = 69573151;</code>
   *
   * @return The peerAsn.
   */
  int getPeerAsn();

  /**
   *
   *
   * <pre>
   * IP address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return Whether the peerIpAddress field is set.
   */
  boolean hasPeerIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return The peerIpAddress.
   */
  java.lang.String getPeerIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return The bytes for peerIpAddress.
   */
  com.google.protobuf.ByteString getPeerIpAddressBytes();

  /**
   *
   *
   * <pre>
   * IPv4 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv4_nexthop_address = 469221774;</code>
   *
   * @return Whether the peerIpv4NexthopAddress field is set.
   */
  boolean hasPeerIpv4NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv4 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv4_nexthop_address = 469221774;</code>
   *
   * @return The peerIpv4NexthopAddress.
   */
  java.lang.String getPeerIpv4NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv4 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv4_nexthop_address = 469221774;</code>
   *
   * @return The bytes for peerIpv4NexthopAddress.
   */
  com.google.protobuf.ByteString getPeerIpv4NexthopAddressBytes();

  /**
   *
   *
   * <pre>
   * IPv6 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv6_nexthop_address = 491486608;</code>
   *
   * @return Whether the peerIpv6NexthopAddress field is set.
   */
  boolean hasPeerIpv6NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv6 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv6_nexthop_address = 491486608;</code>
   *
   * @return The peerIpv6NexthopAddress.
   */
  java.lang.String getPeerIpv6NexthopAddress();
  /**
   *
   *
   * <pre>
   * IPv6 address of the BGP interface outside Google Cloud Platform.
   * </pre>
   *
   * <code>optional string peer_ipv6_nexthop_address = 491486608;</code>
   *
   * @return The bytes for peerIpv6NexthopAddress.
   */
  com.google.protobuf.ByteString getPeerIpv6NexthopAddressBytes();

  /**
   *
   *
   * <pre>
   * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
   * </pre>
   *
   * <code>optional string router_appliance_instance = 468312989;</code>
   *
   * @return Whether the routerApplianceInstance field is set.
   */
  boolean hasRouterApplianceInstance();
  /**
   *
   *
   * <pre>
   * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
   * </pre>
   *
   * <code>optional string router_appliance_instance = 468312989;</code>
   *
   * @return The routerApplianceInstance.
   */
  java.lang.String getRouterApplianceInstance();
  /**
   *
   *
   * <pre>
   * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
   * </pre>
   *
   * <code>optional string router_appliance_instance = 468312989;</code>
   *
   * @return The bytes for routerApplianceInstance.
   */
  com.google.protobuf.ByteString getRouterApplianceInstanceBytes();
}
