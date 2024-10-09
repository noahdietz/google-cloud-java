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

public interface HealthCheckOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * How often (in seconds) to send a health check. The default value is 5 seconds.
   * </pre>
   *
   * <code>optional int32 check_interval_sec = 345561006;</code>
   *
   * @return Whether the checkIntervalSec field is set.
   */
  boolean hasCheckIntervalSec();
  /**
   *
   *
   * <pre>
   * How often (in seconds) to send a health check. The default value is 5 seconds.
   * </pre>
   *
   * <code>optional int32 check_interval_sec = 345561006;</code>
   *
   * @return The checkIntervalSec.
   */
  int getCheckIntervalSec();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in 3339 text format.
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
   * [Output Only] Creation timestamp in 3339 text format.
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
   * [Output Only] Creation timestamp in 3339 text format.
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
   * <code>optional .google.cloud.compute.v1.GRPCHealthCheck grpc_health_check = 85529574;</code>
   *
   * @return Whether the grpcHealthCheck field is set.
   */
  boolean hasGrpcHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.GRPCHealthCheck grpc_health_check = 85529574;</code>
   *
   * @return The grpcHealthCheck.
   */
  com.google.cloud.compute.v1.GRPCHealthCheck getGrpcHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.GRPCHealthCheck grpc_health_check = 85529574;</code>
   */
  com.google.cloud.compute.v1.GRPCHealthCheckOrBuilder getGrpcHealthCheckOrBuilder();

  /**
   *
   *
   * <pre>
   * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
   * </pre>
   *
   * <code>optional int32 healthy_threshold = 403212361;</code>
   *
   * @return Whether the healthyThreshold field is set.
   */
  boolean hasHealthyThreshold();
  /**
   *
   *
   * <pre>
   * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
   * </pre>
   *
   * <code>optional int32 healthy_threshold = 403212361;</code>
   *
   * @return The healthyThreshold.
   */
  int getHealthyThreshold();

  /**
   * <code>optional .google.cloud.compute.v1.HTTP2HealthCheck http2_health_check = 11360986;</code>
   *
   * @return Whether the http2HealthCheck field is set.
   */
  boolean hasHttp2HealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTP2HealthCheck http2_health_check = 11360986;</code>
   *
   * @return The http2HealthCheck.
   */
  com.google.cloud.compute.v1.HTTP2HealthCheck getHttp2HealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTP2HealthCheck http2_health_check = 11360986;</code>
   */
  com.google.cloud.compute.v1.HTTP2HealthCheckOrBuilder getHttp2HealthCheckOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.HTTPHealthCheck http_health_check = 412586940;</code>
   *
   * @return Whether the httpHealthCheck field is set.
   */
  boolean hasHttpHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTPHealthCheck http_health_check = 412586940;</code>
   *
   * @return The httpHealthCheck.
   */
  com.google.cloud.compute.v1.HTTPHealthCheck getHttpHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTPHealthCheck http_health_check = 412586940;</code>
   */
  com.google.cloud.compute.v1.HTTPHealthCheckOrBuilder getHttpHealthCheckOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.HTTPSHealthCheck https_health_check = 436046905;</code>
   *
   * @return Whether the httpsHealthCheck field is set.
   */
  boolean hasHttpsHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTPSHealthCheck https_health_check = 436046905;</code>
   *
   * @return The httpsHealthCheck.
   */
  com.google.cloud.compute.v1.HTTPSHealthCheck getHttpsHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.HTTPSHealthCheck https_health_check = 436046905;</code>
   */
  com.google.cloud.compute.v1.HTTPSHealthCheckOrBuilder getHttpsHealthCheckOrBuilder();

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
   * Type of the resource.
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
   * Type of the resource.
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
   * Type of the resource.
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
   * Configure logging on this health check.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckLogConfig log_config = 351299741;</code>
   *
   * @return Whether the logConfig field is set.
   */
  boolean hasLogConfig();
  /**
   *
   *
   * <pre>
   * Configure logging on this health check.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckLogConfig log_config = 351299741;</code>
   *
   * @return The logConfig.
   */
  com.google.cloud.compute.v1.HealthCheckLogConfig getLogConfig();
  /**
   *
   *
   * <pre>
   * Configure logging on this health check.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckLogConfig log_config = 351299741;</code>
   */
  com.google.cloud.compute.v1.HealthCheckLogConfigOrBuilder getLogConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
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
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
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
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
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
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
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
   * <code>optional .google.cloud.compute.v1.SSLHealthCheck ssl_health_check = 280032440;</code>
   *
   * @return Whether the sslHealthCheck field is set.
   */
  boolean hasSslHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.SSLHealthCheck ssl_health_check = 280032440;</code>
   *
   * @return The sslHealthCheck.
   */
  com.google.cloud.compute.v1.SSLHealthCheck getSslHealthCheck();
  /** <code>optional .google.cloud.compute.v1.SSLHealthCheck ssl_health_check = 280032440;</code> */
  com.google.cloud.compute.v1.SSLHealthCheckOrBuilder getSslHealthCheckOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.TCPHealthCheck tcp_health_check = 469980419;</code>
   *
   * @return Whether the tcpHealthCheck field is set.
   */
  boolean hasTcpHealthCheck();
  /**
   * <code>optional .google.cloud.compute.v1.TCPHealthCheck tcp_health_check = 469980419;</code>
   *
   * @return The tcpHealthCheck.
   */
  com.google.cloud.compute.v1.TCPHealthCheck getTcpHealthCheck();
  /** <code>optional .google.cloud.compute.v1.TCPHealthCheck tcp_health_check = 469980419;</code> */
  com.google.cloud.compute.v1.TCPHealthCheckOrBuilder getTcpHealthCheckOrBuilder();

  /**
   *
   *
   * <pre>
   * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
   * </pre>
   *
   * <code>optional int32 timeout_sec = 79994995;</code>
   *
   * @return Whether the timeoutSec field is set.
   */
  boolean hasTimeoutSec();
  /**
   *
   *
   * <pre>
   * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
   * </pre>
   *
   * <code>optional int32 timeout_sec = 79994995;</code>
   *
   * @return The timeoutSec.
   */
  int getTimeoutSec();

  /**
   *
   *
   * <pre>
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS, HTTP2 or GRPC. Exactly one of the protocol-specific health check fields must be specified, which must match type field.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS, HTTP2 or GRPC. Exactly one of the protocol-specific health check fields must be specified, which must match type field.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS, HTTP2 or GRPC. Exactly one of the protocol-specific health check fields must be specified, which must match type field.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
   * </pre>
   *
   * <code>optional int32 unhealthy_threshold = 227958480;</code>
   *
   * @return Whether the unhealthyThreshold field is set.
   */
  boolean hasUnhealthyThreshold();
  /**
   *
   *
   * <pre>
   * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
   * </pre>
   *
   * <code>optional int32 unhealthy_threshold = 227958480;</code>
   *
   * @return The unhealthyThreshold.
   */
  int getUnhealthyThreshold();
}
