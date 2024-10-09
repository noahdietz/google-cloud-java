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

public interface VpnTunnelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnTunnel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Detailed status message for the VPN tunnel.
   * </pre>
   *
   * <code>optional string detailed_status = 333501025;</code>
   *
   * @return Whether the detailedStatus field is set.
   */
  boolean hasDetailedStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] Detailed status message for the VPN tunnel.
   * </pre>
   *
   * <code>optional string detailed_status = 333501025;</code>
   *
   * @return The detailedStatus.
   */
  java.lang.String getDetailedStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] Detailed status message for the VPN tunnel.
   * </pre>
   *
   * <code>optional string detailed_status = 333501025;</code>
   *
   * @return The bytes for detailedStatus.
   */
  com.google.protobuf.ByteString getDetailedStatusBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
   * </pre>
   *
   * <code>optional int32 ike_version = 218376220;</code>
   *
   * @return Whether the ikeVersion field is set.
   */
  boolean hasIkeVersion();
  /**
   *
   *
   * <pre>
   * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
   * </pre>
   *
   * <code>optional int32 ike_version = 218376220;</code>
   *
   * @return The ikeVersion.
   */
  int getIkeVersion();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return Whether the labelFingerprint field is set.
   */
  boolean hasLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string local_traffic_selector = 317314613;</code>
   *
   * @return A list containing the localTrafficSelector.
   */
  java.util.List<java.lang.String> getLocalTrafficSelectorList();
  /**
   *
   *
   * <pre>
   * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string local_traffic_selector = 317314613;</code>
   *
   * @return The count of localTrafficSelector.
   */
  int getLocalTrafficSelectorCount();
  /**
   *
   *
   * <pre>
   * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string local_traffic_selector = 317314613;</code>
   *
   * @param index The index of the element to return.
   * @return The localTrafficSelector at the given index.
   */
  java.lang.String getLocalTrafficSelector(int index);
  /**
   *
   *
   * <pre>
   * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string local_traffic_selector = 317314613;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the localTrafficSelector at the given index.
   */
  com.google.protobuf.ByteString getLocalTrafficSelectorBytes(int index);

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return Whether the peerExternalGateway field is set.
   */
  boolean hasPeerExternalGateway();
  /**
   *
   *
   * <pre>
   * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return The peerExternalGateway.
   */
  java.lang.String getPeerExternalGateway();
  /**
   *
   *
   * <pre>
   * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return The bytes for peerExternalGateway.
   */
  com.google.protobuf.ByteString getPeerExternalGatewayBytes();

  /**
   *
   *
   * <pre>
   * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. Possible values are: `0`, `1`, `2`, `3`. The number of IDs in use depends on the external VPN gateway redundancy type.
   * </pre>
   *
   * <code>optional int32 peer_external_gateway_interface = 452768391;</code>
   *
   * @return Whether the peerExternalGatewayInterface field is set.
   */
  boolean hasPeerExternalGatewayInterface();
  /**
   *
   *
   * <pre>
   * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. Possible values are: `0`, `1`, `2`, `3`. The number of IDs in use depends on the external VPN gateway redundancy type.
   * </pre>
   *
   * <code>optional int32 peer_external_gateway_interface = 452768391;</code>
   *
   * @return The peerExternalGatewayInterface.
   */
  int getPeerExternalGatewayInterface();

  /**
   *
   *
   * <pre>
   * URL of the peer side HA VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer Google Cloud VPN gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return Whether the peerGcpGateway field is set.
   */
  boolean hasPeerGcpGateway();
  /**
   *
   *
   * <pre>
   * URL of the peer side HA VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer Google Cloud VPN gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return The peerGcpGateway.
   */
  java.lang.String getPeerGcpGateway();
  /**
   *
   *
   * <pre>
   * URL of the peer side HA VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer Google Cloud VPN gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return The bytes for peerGcpGateway.
   */
  com.google.protobuf.ByteString getPeerGcpGatewayBytes();

  /**
   *
   *
   * <pre>
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * </pre>
   *
   * <code>optional string peer_ip = 383249700;</code>
   *
   * @return Whether the peerIp field is set.
   */
  boolean hasPeerIp();
  /**
   *
   *
   * <pre>
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * </pre>
   *
   * <code>optional string peer_ip = 383249700;</code>
   *
   * @return The peerIp.
   */
  java.lang.String getPeerIp();
  /**
   *
   *
   * <pre>
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * </pre>
   *
   * <code>optional string peer_ip = 383249700;</code>
   *
   * @return The bytes for peerIp.
   */
  com.google.protobuf.ByteString getPeerIpBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string remote_traffic_selector = 358887098;</code>
   *
   * @return A list containing the remoteTrafficSelector.
   */
  java.util.List<java.lang.String> getRemoteTrafficSelectorList();
  /**
   *
   *
   * <pre>
   * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string remote_traffic_selector = 358887098;</code>
   *
   * @return The count of remoteTrafficSelector.
   */
  int getRemoteTrafficSelectorCount();
  /**
   *
   *
   * <pre>
   * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string remote_traffic_selector = 358887098;</code>
   *
   * @param index The index of the element to return.
   * @return The remoteTrafficSelector at the given index.
   */
  java.lang.String getRemoteTrafficSelector(int index);
  /**
   *
   *
   * <pre>
   * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string remote_traffic_selector = 358887098;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the remoteTrafficSelector at the given index.
   */
  com.google.protobuf.ByteString getRemoteTrafficSelectorBytes(int index);

  /**
   *
   *
   * <pre>
   * URL of the router resource to be used for dynamic routing.
   * </pre>
   *
   * <code>optional string router = 148608841;</code>
   *
   * @return Whether the router field is set.
   */
  boolean hasRouter();
  /**
   *
   *
   * <pre>
   * URL of the router resource to be used for dynamic routing.
   * </pre>
   *
   * <code>optional string router = 148608841;</code>
   *
   * @return The router.
   */
  java.lang.String getRouter();
  /**
   *
   *
   * <pre>
   * URL of the router resource to be used for dynamic routing.
   * </pre>
   *
   * <code>optional string router = 148608841;</code>
   *
   * @return The bytes for router.
   */
  com.google.protobuf.ByteString getRouterBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return Whether the sharedSecret field is set.
   */
  boolean hasSharedSecret();
  /**
   *
   *
   * <pre>
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return The sharedSecret.
   */
  java.lang.String getSharedSecret();
  /**
   *
   *
   * <pre>
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return The bytes for sharedSecret.
   */
  com.google.protobuf.ByteString getSharedSecretBytes();

  /**
   *
   *
   * <pre>
   * Hash of the shared secret.
   * </pre>
   *
   * <code>optional string shared_secret_hash = 398881891;</code>
   *
   * @return Whether the sharedSecretHash field is set.
   */
  boolean hasSharedSecretHash();
  /**
   *
   *
   * <pre>
   * Hash of the shared secret.
   * </pre>
   *
   * <code>optional string shared_secret_hash = 398881891;</code>
   *
   * @return The sharedSecretHash.
   */
  java.lang.String getSharedSecretHash();
  /**
   *
   *
   * <pre>
   * Hash of the shared secret.
   * </pre>
   *
   * <code>optional string shared_secret_hash = 398881891;</code>
   *
   * @return The bytes for sharedSecretHash.
   */
  com.google.protobuf.ByteString getSharedSecretHashBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();

  /**
   *
   *
   * <pre>
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
   * </pre>
   *
   * <code>optional string target_vpn_gateway = 532512843;</code>
   *
   * @return Whether the targetVpnGateway field is set.
   */
  boolean hasTargetVpnGateway();
  /**
   *
   *
   * <pre>
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
   * </pre>
   *
   * <code>optional string target_vpn_gateway = 532512843;</code>
   *
   * @return The targetVpnGateway.
   */
  java.lang.String getTargetVpnGateway();
  /**
   *
   *
   * <pre>
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
   * </pre>
   *
   * <code>optional string target_vpn_gateway = 532512843;</code>
   *
   * @return The bytes for targetVpnGateway.
   */
  com.google.protobuf.ByteString getTargetVpnGatewayBytes();

  /**
   *
   *
   * <pre>
   * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
   * </pre>
   *
   * <code>optional string vpn_gateway = 406684153;</code>
   *
   * @return Whether the vpnGateway field is set.
   */
  boolean hasVpnGateway();
  /**
   *
   *
   * <pre>
   * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
   * </pre>
   *
   * <code>optional string vpn_gateway = 406684153;</code>
   *
   * @return The vpnGateway.
   */
  java.lang.String getVpnGateway();
  /**
   *
   *
   * <pre>
   * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
   * </pre>
   *
   * <code>optional string vpn_gateway = 406684153;</code>
   *
   * @return The bytes for vpnGateway.
   */
  com.google.protobuf.ByteString getVpnGatewayBytes();

  /**
   *
   *
   * <pre>
   * The interface ID of the VPN gateway with which this VPN tunnel is associated. Possible values are: `0`, `1`.
   * </pre>
   *
   * <code>optional int32 vpn_gateway_interface = 95979123;</code>
   *
   * @return Whether the vpnGatewayInterface field is set.
   */
  boolean hasVpnGatewayInterface();
  /**
   *
   *
   * <pre>
   * The interface ID of the VPN gateway with which this VPN tunnel is associated. Possible values are: `0`, `1`.
   * </pre>
   *
   * <code>optional int32 vpn_gateway_interface = 95979123;</code>
   *
   * @return The vpnGatewayInterface.
   */
  int getVpnGatewayInterface();
}
