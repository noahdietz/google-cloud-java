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

public interface NetworkEndpointGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpointGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupAppEngine app_engine = 340788768;
   * </code>
   *
   * @return Whether the appEngine field is set.
   */
  boolean hasAppEngine();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupAppEngine app_engine = 340788768;
   * </code>
   *
   * @return The appEngine.
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupAppEngine getAppEngine();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupAppEngine app_engine = 340788768;
   * </code>
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupAppEngineOrBuilder getAppEngineOrBuilder();

  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NetworkEndpointGroupCloudFunction cloud_function = 519893666;
   * </code>
   *
   * @return Whether the cloudFunction field is set.
   */
  boolean hasCloudFunction();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NetworkEndpointGroupCloudFunction cloud_function = 519893666;
   * </code>
   *
   * @return The cloudFunction.
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunction getCloudFunction();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NetworkEndpointGroupCloudFunction cloud_function = 519893666;
   * </code>
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupCloudFunctionOrBuilder
      getCloudFunctionOrBuilder();

  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupCloudRun cloud_run = 111060353;
   * </code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupCloudRun cloud_run = 111060353;
   * </code>
   *
   * @return The cloudRun.
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupCloudRun getCloudRun();
  /**
   *
   *
   * <pre>
   * Only valid when networkEndpointType is SERVERLESS. Only one of cloudRun, appEngine or cloudFunction may be set.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupCloudRun cloud_run = 111060353;
   * </code>
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupCloudRunOrBuilder getCloudRunOrBuilder();

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
   * The default port used if the port number is not specified in the network endpoint. If the network endpoint type is either GCE_VM_IP, SERVERLESS or PRIVATE_SERVICE_CONNECT, this field must not be specified.
   * </pre>
   *
   * <code>optional int32 default_port = 423377855;</code>
   *
   * @return Whether the defaultPort field is set.
   */
  boolean hasDefaultPort();
  /**
   *
   *
   * <pre>
   * The default port used if the port number is not specified in the network endpoint. If the network endpoint type is either GCE_VM_IP, SERVERLESS or PRIVATE_SERVICE_CONNECT, this field must not be specified.
   * </pre>
   *
   * <code>optional int32 default_port = 423377855;</code>
   *
   * @return The defaultPort.
   */
  int getDefaultPort();

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
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
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
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
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
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
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
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * The URL of the network to which all network endpoints in the NEG belong. Uses default project network if unspecified.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * The URL of the network to which all network endpoints in the NEG belong. Uses default project network if unspecified.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The URL of the network to which all network endpoints in the NEG belong. Uses default project network if unspecified.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT, GCE_VM_IP_PORTMAP.
   * Check the NetworkEndpointType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_endpoint_type = 118301523;</code>
   *
   * @return Whether the networkEndpointType field is set.
   */
  boolean hasNetworkEndpointType();
  /**
   *
   *
   * <pre>
   * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT, GCE_VM_IP_PORTMAP.
   * Check the NetworkEndpointType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_endpoint_type = 118301523;</code>
   *
   * @return The networkEndpointType.
   */
  java.lang.String getNetworkEndpointType();
  /**
   *
   *
   * <pre>
   * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT, GCE_VM_IP_PORTMAP.
   * Check the NetworkEndpointType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_endpoint_type = 118301523;</code>
   *
   * @return The bytes for networkEndpointType.
   */
  com.google.protobuf.ByteString getNetworkEndpointTypeBytes();

  /**
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupPscData psc_data = 71937481;</code>
   *
   * @return Whether the pscData field is set.
   */
  boolean hasPscData();
  /**
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupPscData psc_data = 71937481;</code>
   *
   * @return The pscData.
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupPscData getPscData();
  /**
   * <code>optional .google.cloud.compute.v1.NetworkEndpointGroupPscData psc_data = 71937481;</code>
   */
  com.google.cloud.compute.v1.NetworkEndpointGroupPscDataOrBuilder getPscDataOrBuilder();

  /**
   *
   *
   * <pre>
   * The target service url used to set up private service connection to a Google API or a PSC Producer Service Attachment. An example value is: asia-northeast3-cloudkms.googleapis.com
   * </pre>
   *
   * <code>optional string psc_target_service = 269132134;</code>
   *
   * @return Whether the pscTargetService field is set.
   */
  boolean hasPscTargetService();
  /**
   *
   *
   * <pre>
   * The target service url used to set up private service connection to a Google API or a PSC Producer Service Attachment. An example value is: asia-northeast3-cloudkms.googleapis.com
   * </pre>
   *
   * <code>optional string psc_target_service = 269132134;</code>
   *
   * @return The pscTargetService.
   */
  java.lang.String getPscTargetService();
  /**
   *
   *
   * <pre>
   * The target service url used to set up private service connection to a Google API or a PSC Producer Service Attachment. An example value is: asia-northeast3-cloudkms.googleapis.com
   * </pre>
   *
   * <code>optional string psc_target_service = 269132134;</code>
   *
   * @return The bytes for pscTargetService.
   */
  com.google.protobuf.ByteString getPscTargetServiceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the region where the network endpoint group is located.
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
   * [Output Only] The URL of the region where the network endpoint group is located.
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
   * [Output Only] The URL of the region where the network endpoint group is located.
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
   * [Output only] Number of network endpoints in the network endpoint group.
   * </pre>
   *
   * <code>optional int32 size = 3530753;</code>
   *
   * @return Whether the size field is set.
   */
  boolean hasSize();
  /**
   *
   *
   * <pre>
   * [Output only] Number of network endpoints in the network endpoint group.
   * </pre>
   *
   * <code>optional int32 size = 3530753;</code>
   *
   * @return The size.
   */
  int getSize();

  /**
   *
   *
   * <pre>
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();
  /**
   *
   *
   * <pre>
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
