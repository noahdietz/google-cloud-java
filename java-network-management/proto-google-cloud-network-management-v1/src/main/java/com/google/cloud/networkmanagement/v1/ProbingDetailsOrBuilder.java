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
// source: google/cloud/networkmanagement/v1/connectivity_test.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1;

public interface ProbingDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.ProbingDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The overall result of active probing.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProbingDetails.ProbingResult result = 1;</code>
   *
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   *
   *
   * <pre>
   * The overall result of active probing.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProbingDetails.ProbingResult result = 1;</code>
   *
   * @return The result.
   */
  com.google.cloud.networkmanagement.v1.ProbingDetails.ProbingResult getResult();

  /**
   *
   *
   * <pre>
   * The time that reachability was assessed through active probing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return Whether the verifyTime field is set.
   */
  boolean hasVerifyTime();
  /**
   *
   *
   * <pre>
   * The time that reachability was assessed through active probing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return The verifyTime.
   */
  com.google.protobuf.Timestamp getVerifyTime();
  /**
   *
   *
   * <pre>
   * The time that reachability was assessed through active probing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVerifyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Details about an internal failure or the cancellation of active probing.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Details about an internal failure or the cancellation of active probing.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Details about an internal failure or the cancellation of active probing.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The reason probing was aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProbingDetails.ProbingAbortCause abort_cause = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for abortCause.
   */
  int getAbortCauseValue();
  /**
   *
   *
   * <pre>
   * The reason probing was aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProbingDetails.ProbingAbortCause abort_cause = 4;
   * </code>
   *
   * @return The abortCause.
   */
  com.google.cloud.networkmanagement.v1.ProbingDetails.ProbingAbortCause getAbortCause();

  /**
   *
   *
   * <pre>
   * Number of probes sent.
   * </pre>
   *
   * <code>int32 sent_probe_count = 5;</code>
   *
   * @return The sentProbeCount.
   */
  int getSentProbeCount();

  /**
   *
   *
   * <pre>
   * Number of probes that reached the destination.
   * </pre>
   *
   * <code>int32 successful_probe_count = 6;</code>
   *
   * @return The successfulProbeCount.
   */
  int getSuccessfulProbeCount();

  /**
   *
   *
   * <pre>
   * The source and destination endpoints derived from the test input and used
   * for active probing.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint_info = 7;</code>
   *
   * @return Whether the endpointInfo field is set.
   */
  boolean hasEndpointInfo();
  /**
   *
   *
   * <pre>
   * The source and destination endpoints derived from the test input and used
   * for active probing.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint_info = 7;</code>
   *
   * @return The endpointInfo.
   */
  com.google.cloud.networkmanagement.v1.EndpointInfo getEndpointInfo();
  /**
   *
   *
   * <pre>
   * The source and destination endpoints derived from the test input and used
   * for active probing.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint_info = 7;</code>
   */
  com.google.cloud.networkmanagement.v1.EndpointInfoOrBuilder getEndpointInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Latency as measured by active probing in one direction:
   * from the source to the destination endpoint.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.LatencyDistribution probing_latency = 8;</code>
   *
   * @return Whether the probingLatency field is set.
   */
  boolean hasProbingLatency();
  /**
   *
   *
   * <pre>
   * Latency as measured by active probing in one direction:
   * from the source to the destination endpoint.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.LatencyDistribution probing_latency = 8;</code>
   *
   * @return The probingLatency.
   */
  com.google.cloud.networkmanagement.v1.LatencyDistribution getProbingLatency();
  /**
   *
   *
   * <pre>
   * Latency as measured by active probing in one direction:
   * from the source to the destination endpoint.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.LatencyDistribution probing_latency = 8;</code>
   */
  com.google.cloud.networkmanagement.v1.LatencyDistributionOrBuilder getProbingLatencyOrBuilder();

  /**
   *
   *
   * <pre>
   * The EdgeLocation from which a packet destined for/originating from the
   * internet will egress/ingress the Google network.
   * This will only be populated for a connectivity test which has an internet
   * destination/source address.
   * The absence of this field *must not* be used as an indication that the
   * destination/source is part of the Google network.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.ProbingDetails.EdgeLocation destination_egress_location = 9;
   * </code>
   *
   * @return Whether the destinationEgressLocation field is set.
   */
  boolean hasDestinationEgressLocation();
  /**
   *
   *
   * <pre>
   * The EdgeLocation from which a packet destined for/originating from the
   * internet will egress/ingress the Google network.
   * This will only be populated for a connectivity test which has an internet
   * destination/source address.
   * The absence of this field *must not* be used as an indication that the
   * destination/source is part of the Google network.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.ProbingDetails.EdgeLocation destination_egress_location = 9;
   * </code>
   *
   * @return The destinationEgressLocation.
   */
  com.google.cloud.networkmanagement.v1.ProbingDetails.EdgeLocation getDestinationEgressLocation();
  /**
   *
   *
   * <pre>
   * The EdgeLocation from which a packet destined for/originating from the
   * internet will egress/ingress the Google network.
   * This will only be populated for a connectivity test which has an internet
   * destination/source address.
   * The absence of this field *must not* be used as an indication that the
   * destination/source is part of the Google network.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.ProbingDetails.EdgeLocation destination_egress_location = 9;
   * </code>
   */
  com.google.cloud.networkmanagement.v1.ProbingDetails.EdgeLocationOrBuilder
      getDestinationEgressLocationOrBuilder();
}
