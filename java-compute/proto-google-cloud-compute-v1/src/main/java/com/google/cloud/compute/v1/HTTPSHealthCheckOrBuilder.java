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

public interface HTTPSHealthCheckOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HTTPSHealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The value of the host header in the HTTPS health check request. If left empty (default value), the host header is set to the destination IP address to which health check packets are sent. The destination IP address depends on the type of load balancer. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#hc-packet-dest
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   *
   *
   * <pre>
   * The value of the host header in the HTTPS health check request. If left empty (default value), the host header is set to the destination IP address to which health check packets are sent. The destination IP address depends on the type of load balancer. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#hc-packet-dest
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * The value of the host header in the HTTPS health check request. If left empty (default value), the host header is set to the destination IP address to which health check packets are sent. The destination IP address depends on the type of load balancer. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#hc-packet-dest
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * The TCP port number to which the health check prober sends packets. The default value is 443. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   *
   *
   * <pre>
   * The TCP port number to which the health check prober sends packets. The default value is 443. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Not supported.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return Whether the portName field is set.
   */
  boolean hasPortName();
  /**
   *
   *
   * <pre>
   * Not supported.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   *
   *
   * <pre>
   * Not supported.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString getPortNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies how a port is selected for health checking. Can be one of the following values: USE_FIXED_PORT: Specifies a port number explicitly using the port field in the health check. Supported by backend services for passthrough load balancers and backend services for proxy load balancers. Not supported by target pools. The health check supports all backends supported by the backend service provided the backend can be health checked. For example, GCE_VM_IP network endpoint groups, GCE_VM_IP_PORT network endpoint groups, and instance group backends. USE_NAMED_PORT: Not supported. USE_SERVING_PORT: Provides an indirect method of specifying the health check port by referring to the backend service. Only supported by backend services for proxy load balancers. Not supported by target pools. Not supported by backend services for passthrough load balancers. Supports all backends that can be health checked; for example, GCE_VM_IP_PORT network endpoint groups and instance group backends. For GCE_VM_IP_PORT network endpoint group backends, the health check uses the port number specified for each endpoint in the network endpoint group. For instance group backends, the health check uses the port number determined by looking up the backend service's named port in the instance group's list of named ports.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return Whether the portSpecification field is set.
   */
  boolean hasPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how a port is selected for health checking. Can be one of the following values: USE_FIXED_PORT: Specifies a port number explicitly using the port field in the health check. Supported by backend services for passthrough load balancers and backend services for proxy load balancers. Not supported by target pools. The health check supports all backends supported by the backend service provided the backend can be health checked. For example, GCE_VM_IP network endpoint groups, GCE_VM_IP_PORT network endpoint groups, and instance group backends. USE_NAMED_PORT: Not supported. USE_SERVING_PORT: Provides an indirect method of specifying the health check port by referring to the backend service. Only supported by backend services for proxy load balancers. Not supported by target pools. Not supported by backend services for passthrough load balancers. Supports all backends that can be health checked; for example, GCE_VM_IP_PORT network endpoint groups and instance group backends. For GCE_VM_IP_PORT network endpoint group backends, the health check uses the port number specified for each endpoint in the network endpoint group. For instance group backends, the health check uses the port number determined by looking up the backend service's named port in the instance group's list of named ports.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The portSpecification.
   */
  java.lang.String getPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how a port is selected for health checking. Can be one of the following values: USE_FIXED_PORT: Specifies a port number explicitly using the port field in the health check. Supported by backend services for passthrough load balancers and backend services for proxy load balancers. Not supported by target pools. The health check supports all backends supported by the backend service provided the backend can be health checked. For example, GCE_VM_IP network endpoint groups, GCE_VM_IP_PORT network endpoint groups, and instance group backends. USE_NAMED_PORT: Not supported. USE_SERVING_PORT: Provides an indirect method of specifying the health check port by referring to the backend service. Only supported by backend services for proxy load balancers. Not supported by target pools. Not supported by backend services for passthrough load balancers. Supports all backends that can be health checked; for example, GCE_VM_IP_PORT network endpoint groups and instance group backends. For GCE_VM_IP_PORT network endpoint group backends, the health check uses the port number specified for each endpoint in the network endpoint group. For instance group backends, the health check uses the port number determined by looking up the backend service's named port in the instance group's list of named ports.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The bytes for portSpecification.
   */
  com.google.protobuf.ByteString getPortSpecificationBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return Whether the proxyHeader field is set.
   */
  boolean hasProxyHeader();
  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The proxyHeader.
   */
  java.lang.String getProxyHeader();
  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The bytes for proxyHeader.
   */
  com.google.protobuf.ByteString getProxyHeaderBytes();

  /**
   *
   *
   * <pre>
   * The request path of the HTTPS health check request. The default value is /. Must comply with RFC3986.
   * </pre>
   *
   * <code>optional string request_path = 229403605;</code>
   *
   * @return Whether the requestPath field is set.
   */
  boolean hasRequestPath();
  /**
   *
   *
   * <pre>
   * The request path of the HTTPS health check request. The default value is /. Must comply with RFC3986.
   * </pre>
   *
   * <code>optional string request_path = 229403605;</code>
   *
   * @return The requestPath.
   */
  java.lang.String getRequestPath();
  /**
   *
   *
   * <pre>
   * The request path of the HTTPS health check request. The default value is /. Must comply with RFC3986.
   * </pre>
   *
   * <code>optional string request_path = 229403605;</code>
   *
   * @return The bytes for requestPath.
   */
  com.google.protobuf.ByteString getRequestPathBytes();

  /**
   *
   *
   * <pre>
   * Creates a content-based HTTPS health check. In addition to the required HTTP 200 (OK) status code, you can configure the health check to pass only when the backend sends this specific ASCII response string within the first 1024 bytes of the HTTP response body. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#criteria-protocol-http
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   *
   *
   * <pre>
   * Creates a content-based HTTPS health check. In addition to the required HTTP 200 (OK) status code, you can configure the health check to pass only when the backend sends this specific ASCII response string within the first 1024 bytes of the HTTP response body. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#criteria-protocol-http
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return The response.
   */
  java.lang.String getResponse();
  /**
   *
   *
   * <pre>
   * Creates a content-based HTTPS health check. In addition to the required HTTP 200 (OK) status code, you can configure the health check to pass only when the backend sends this specific ASCII response string within the first 1024 bytes of the HTTP response body. For details, see: https://cloud.google.com/load-balancing/docs/health-check-concepts#criteria-protocol-http
   * </pre>
   *
   * <code>optional string response = 196547649;</code>
   *
   * @return The bytes for response.
   */
  com.google.protobuf.ByteString getResponseBytes();
}
