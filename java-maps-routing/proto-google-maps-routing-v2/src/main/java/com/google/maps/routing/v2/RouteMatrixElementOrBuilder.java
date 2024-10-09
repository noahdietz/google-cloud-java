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
// source: google/maps/routing/v2/routes_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routing.v2;

public interface RouteMatrixElementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.RouteMatrixElement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Zero-based index of the origin in the request.
   * </pre>
   *
   * <code>optional int32 origin_index = 1;</code>
   *
   * @return Whether the originIndex field is set.
   */
  boolean hasOriginIndex();
  /**
   *
   *
   * <pre>
   * Zero-based index of the origin in the request.
   * </pre>
   *
   * <code>optional int32 origin_index = 1;</code>
   *
   * @return The originIndex.
   */
  int getOriginIndex();

  /**
   *
   *
   * <pre>
   * Zero-based index of the destination in the request.
   * </pre>
   *
   * <code>optional int32 destination_index = 2;</code>
   *
   * @return Whether the destinationIndex field is set.
   */
  boolean hasDestinationIndex();
  /**
   *
   *
   * <pre>
   * Zero-based index of the destination in the request.
   * </pre>
   *
   * <code>optional int32 destination_index = 2;</code>
   *
   * @return The destinationIndex.
   */
  int getDestinationIndex();

  /**
   *
   *
   * <pre>
   * Error status code for this element.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Error status code for this element.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Error status code for this element.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the route was found or not. Independent of status.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteMatrixElementCondition condition = 9;</code>
   *
   * @return The enum numeric value on the wire for condition.
   */
  int getConditionValue();
  /**
   *
   *
   * <pre>
   * Indicates whether the route was found or not. Independent of status.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteMatrixElementCondition condition = 9;</code>
   *
   * @return The condition.
   */
  com.google.maps.routing.v2.RouteMatrixElementCondition getCondition();

  /**
   *
   *
   * <pre>
   * The travel distance of the route, in meters.
   * </pre>
   *
   * <code>int32 distance_meters = 4;</code>
   *
   * @return The distanceMeters.
   */
  int getDistanceMeters();

  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the route. If you set the
   * [routing_preference][google.maps.routing.v2.ComputeRouteMatrixRequest.routing_preference]
   * to `TRAFFIC_UNAWARE`, then this value is the same as `static_duration`. If
   * you set the `routing_preference` to either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the route. If you set the
   * [routing_preference][google.maps.routing.v2.ComputeRouteMatrixRequest.routing_preference]
   * to `TRAFFIC_UNAWARE`, then this value is the same as `static_duration`. If
   * you set the `routing_preference` to either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the route. If you set the
   * [routing_preference][google.maps.routing.v2.ComputeRouteMatrixRequest.routing_preference]
   * to `TRAFFIC_UNAWARE`, then this value is the same as `static_duration`. If
   * you set the `routing_preference` to either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The duration of traveling through the route without taking traffic
   * conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 6;</code>
   *
   * @return Whether the staticDuration field is set.
   */
  boolean hasStaticDuration();
  /**
   *
   *
   * <pre>
   * The duration of traveling through the route without taking traffic
   * conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 6;</code>
   *
   * @return The staticDuration.
   */
  com.google.protobuf.Duration getStaticDuration();
  /**
   *
   *
   * <pre>
   * The duration of traveling through the route without taking traffic
   * conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getStaticDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional information about the route. For example: restriction
   * information and toll information
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteTravelAdvisory travel_advisory = 7;</code>
   *
   * @return Whether the travelAdvisory field is set.
   */
  boolean hasTravelAdvisory();
  /**
   *
   *
   * <pre>
   * Additional information about the route. For example: restriction
   * information and toll information
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteTravelAdvisory travel_advisory = 7;</code>
   *
   * @return The travelAdvisory.
   */
  com.google.maps.routing.v2.RouteTravelAdvisory getTravelAdvisory();
  /**
   *
   *
   * <pre>
   * Additional information about the route. For example: restriction
   * information and toll information
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteTravelAdvisory travel_advisory = 7;</code>
   */
  com.google.maps.routing.v2.RouteTravelAdvisoryOrBuilder getTravelAdvisoryOrBuilder();

  /**
   *
   *
   * <pre>
   * In some cases when the server is not able to compute the route with the
   * given preferences for this particular origin/destination pair, it may
   * fall back to using a different mode of computation. When fallback mode is
   * used, this field contains detailed information about the fallback response.
   * Otherwise this field is unset.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackInfo fallback_info = 8;</code>
   *
   * @return Whether the fallbackInfo field is set.
   */
  boolean hasFallbackInfo();
  /**
   *
   *
   * <pre>
   * In some cases when the server is not able to compute the route with the
   * given preferences for this particular origin/destination pair, it may
   * fall back to using a different mode of computation. When fallback mode is
   * used, this field contains detailed information about the fallback response.
   * Otherwise this field is unset.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackInfo fallback_info = 8;</code>
   *
   * @return The fallbackInfo.
   */
  com.google.maps.routing.v2.FallbackInfo getFallbackInfo();
  /**
   *
   *
   * <pre>
   * In some cases when the server is not able to compute the route with the
   * given preferences for this particular origin/destination pair, it may
   * fall back to using a different mode of computation. When fallback mode is
   * used, this field contains detailed information about the fallback response.
   * Otherwise this field is unset.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackInfo fallback_info = 8;</code>
   */
  com.google.maps.routing.v2.FallbackInfoOrBuilder getFallbackInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteMatrixElement`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteMatrixElement.LocalizedValues localized_values = 10;</code>
   *
   * @return Whether the localizedValues field is set.
   */
  boolean hasLocalizedValues();
  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteMatrixElement`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteMatrixElement.LocalizedValues localized_values = 10;</code>
   *
   * @return The localizedValues.
   */
  com.google.maps.routing.v2.RouteMatrixElement.LocalizedValues getLocalizedValues();
  /**
   *
   *
   * <pre>
   * Text representations of properties of the `RouteMatrixElement`.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteMatrixElement.LocalizedValues localized_values = 10;</code>
   */
  com.google.maps.routing.v2.RouteMatrixElement.LocalizedValuesOrBuilder
      getLocalizedValuesOrBuilder();
}
