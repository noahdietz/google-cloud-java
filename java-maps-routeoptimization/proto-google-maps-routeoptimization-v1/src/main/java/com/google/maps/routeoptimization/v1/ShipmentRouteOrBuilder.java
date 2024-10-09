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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routeoptimization.v1;

public interface ShipmentRouteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routeoptimization.v1.ShipmentRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Vehicle performing the route, identified by its index in the source
   * `ShipmentModel`.
   * </pre>
   *
   * <code>int32 vehicle_index = 1;</code>
   *
   * @return The vehicleIndex.
   */
  int getVehicleIndex();

  /**
   *
   *
   * <pre>
   * Label of the vehicle performing this route, equal to
   * `ShipmentModel.vehicles(vehicle_index).label`, if specified.
   * </pre>
   *
   * <code>string vehicle_label = 2;</code>
   *
   * @return The vehicleLabel.
   */
  java.lang.String getVehicleLabel();
  /**
   *
   *
   * <pre>
   * Label of the vehicle performing this route, equal to
   * `ShipmentModel.vehicles(vehicle_index).label`, if specified.
   * </pre>
   *
   * <code>string vehicle_label = 2;</code>
   *
   * @return The bytes for vehicleLabel.
   */
  com.google.protobuf.ByteString getVehicleLabelBytes();

  /**
   *
   *
   * <pre>
   * Time at which the vehicle starts its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_start_time = 5;</code>
   *
   * @return Whether the vehicleStartTime field is set.
   */
  boolean hasVehicleStartTime();
  /**
   *
   *
   * <pre>
   * Time at which the vehicle starts its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_start_time = 5;</code>
   *
   * @return The vehicleStartTime.
   */
  com.google.protobuf.Timestamp getVehicleStartTime();
  /**
   *
   *
   * <pre>
   * Time at which the vehicle starts its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVehicleStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time at which the vehicle finishes its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_end_time = 6;</code>
   *
   * @return Whether the vehicleEndTime field is set.
   */
  boolean hasVehicleEndTime();
  /**
   *
   *
   * <pre>
   * Time at which the vehicle finishes its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_end_time = 6;</code>
   *
   * @return The vehicleEndTime.
   */
  com.google.protobuf.Timestamp getVehicleEndTime();
  /**
   *
   *
   * <pre>
   * Time at which the vehicle finishes its route.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp vehicle_end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVehicleEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Ordered sequence of visits representing a route.
   * visits[i] is the i-th visit in the route.
   * If this field is empty, the vehicle is considered as unused.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Visit visits = 7;</code>
   */
  java.util.List<com.google.maps.routeoptimization.v1.ShipmentRoute.Visit> getVisitsList();
  /**
   *
   *
   * <pre>
   * Ordered sequence of visits representing a route.
   * visits[i] is the i-th visit in the route.
   * If this field is empty, the vehicle is considered as unused.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Visit visits = 7;</code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.Visit getVisits(int index);
  /**
   *
   *
   * <pre>
   * Ordered sequence of visits representing a route.
   * visits[i] is the i-th visit in the route.
   * If this field is empty, the vehicle is considered as unused.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Visit visits = 7;</code>
   */
  int getVisitsCount();
  /**
   *
   *
   * <pre>
   * Ordered sequence of visits representing a route.
   * visits[i] is the i-th visit in the route.
   * If this field is empty, the vehicle is considered as unused.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Visit visits = 7;</code>
   */
  java.util.List<? extends com.google.maps.routeoptimization.v1.ShipmentRoute.VisitOrBuilder>
      getVisitsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Ordered sequence of visits representing a route.
   * visits[i] is the i-th visit in the route.
   * If this field is empty, the vehicle is considered as unused.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Visit visits = 7;</code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.VisitOrBuilder getVisitsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Ordered list of transitions for the route.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Transition transitions = 8;
   * </code>
   */
  java.util.List<com.google.maps.routeoptimization.v1.ShipmentRoute.Transition>
      getTransitionsList();
  /**
   *
   *
   * <pre>
   * Ordered list of transitions for the route.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Transition transitions = 8;
   * </code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.Transition getTransitions(int index);
  /**
   *
   *
   * <pre>
   * Ordered list of transitions for the route.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Transition transitions = 8;
   * </code>
   */
  int getTransitionsCount();
  /**
   *
   *
   * <pre>
   * Ordered list of transitions for the route.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Transition transitions = 8;
   * </code>
   */
  java.util.List<? extends com.google.maps.routeoptimization.v1.ShipmentRoute.TransitionOrBuilder>
      getTransitionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Ordered list of transitions for the route.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Transition transitions = 8;
   * </code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.TransitionOrBuilder getTransitionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * When
   * [OptimizeToursRequest.consider_road_traffic][google.maps.routeoptimization.v1.OptimizeToursRequest.consider_road_traffic],
   * is set to true, this field indicates that inconsistencies in route timings
   * are predicted using traffic-based travel duration estimates. There may be
   * insufficient time to complete traffic-adjusted travel, delays, and breaks
   * between visits, before the first visit, or after the last visit, while
   * still satisfying the visit and vehicle time windows. For example,
   *
   * ```
   *   start_time(previous_visit) + duration(previous_visit) +
   *   travel_duration(previous_visit, next_visit) &gt; start_time(next_visit)
   * ```
   *
   * Arrival at next_visit will likely happen later than its current
   * time window due the increased estimate of travel time
   * `travel_duration(previous_visit, next_visit)` due to traffic. Also, a break
   * may be forced to overlap with a visit due to an increase in travel time
   * estimates and visit or break time window restrictions.
   * </pre>
   *
   * <code>bool has_traffic_infeasibilities = 9;</code>
   *
   * @return The hasTrafficInfeasibilities.
   */
  boolean getHasTrafficInfeasibilities();

  /**
   *
   *
   * <pre>
   * The encoded polyline representation of the route.
   * This field is only populated if
   * [OptimizeToursRequest.populate_polylines][google.maps.routeoptimization.v1.OptimizeToursRequest.populate_polylines]
   * is set to true.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.ShipmentRoute.EncodedPolyline route_polyline = 10;
   * </code>
   *
   * @return Whether the routePolyline field is set.
   */
  boolean hasRoutePolyline();
  /**
   *
   *
   * <pre>
   * The encoded polyline representation of the route.
   * This field is only populated if
   * [OptimizeToursRequest.populate_polylines][google.maps.routeoptimization.v1.OptimizeToursRequest.populate_polylines]
   * is set to true.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.ShipmentRoute.EncodedPolyline route_polyline = 10;
   * </code>
   *
   * @return The routePolyline.
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.EncodedPolyline getRoutePolyline();
  /**
   *
   *
   * <pre>
   * The encoded polyline representation of the route.
   * This field is only populated if
   * [OptimizeToursRequest.populate_polylines][google.maps.routeoptimization.v1.OptimizeToursRequest.populate_polylines]
   * is set to true.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.ShipmentRoute.EncodedPolyline route_polyline = 10;
   * </code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.EncodedPolylineOrBuilder
      getRoutePolylineOrBuilder();

  /**
   *
   *
   * <pre>
   * Breaks scheduled for the vehicle performing this route.
   * The `breaks` sequence represents time intervals, each starting at the
   * corresponding `start_time` and lasting `duration` seconds.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Break breaks = 11;</code>
   */
  java.util.List<com.google.maps.routeoptimization.v1.ShipmentRoute.Break> getBreaksList();
  /**
   *
   *
   * <pre>
   * Breaks scheduled for the vehicle performing this route.
   * The `breaks` sequence represents time intervals, each starting at the
   * corresponding `start_time` and lasting `duration` seconds.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Break breaks = 11;</code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.Break getBreaks(int index);
  /**
   *
   *
   * <pre>
   * Breaks scheduled for the vehicle performing this route.
   * The `breaks` sequence represents time intervals, each starting at the
   * corresponding `start_time` and lasting `duration` seconds.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Break breaks = 11;</code>
   */
  int getBreaksCount();
  /**
   *
   *
   * <pre>
   * Breaks scheduled for the vehicle performing this route.
   * The `breaks` sequence represents time intervals, each starting at the
   * corresponding `start_time` and lasting `duration` seconds.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Break breaks = 11;</code>
   */
  java.util.List<? extends com.google.maps.routeoptimization.v1.ShipmentRoute.BreakOrBuilder>
      getBreaksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Breaks scheduled for the vehicle performing this route.
   * The `breaks` sequence represents time intervals, each starting at the
   * corresponding `start_time` and lasting `duration` seconds.
   * </pre>
   *
   * <code>repeated .google.maps.routeoptimization.v1.ShipmentRoute.Break breaks = 11;</code>
   */
  com.google.maps.routeoptimization.v1.ShipmentRoute.BreakOrBuilder getBreaksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Duration, distance and load metrics for this route. The fields of
   * [AggregatedMetrics][google.maps.routeoptimization.v1.AggregatedMetrics] are
   * summed over all
   * [ShipmentRoute.transitions][google.maps.routeoptimization.v1.ShipmentRoute.transitions]
   * or
   * [ShipmentRoute.visits][google.maps.routeoptimization.v1.ShipmentRoute.visits],
   * depending on the context.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.AggregatedMetrics metrics = 12;</code>
   *
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   *
   *
   * <pre>
   * Duration, distance and load metrics for this route. The fields of
   * [AggregatedMetrics][google.maps.routeoptimization.v1.AggregatedMetrics] are
   * summed over all
   * [ShipmentRoute.transitions][google.maps.routeoptimization.v1.ShipmentRoute.transitions]
   * or
   * [ShipmentRoute.visits][google.maps.routeoptimization.v1.ShipmentRoute.visits],
   * depending on the context.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.AggregatedMetrics metrics = 12;</code>
   *
   * @return The metrics.
   */
  com.google.maps.routeoptimization.v1.AggregatedMetrics getMetrics();
  /**
   *
   *
   * <pre>
   * Duration, distance and load metrics for this route. The fields of
   * [AggregatedMetrics][google.maps.routeoptimization.v1.AggregatedMetrics] are
   * summed over all
   * [ShipmentRoute.transitions][google.maps.routeoptimization.v1.ShipmentRoute.transitions]
   * or
   * [ShipmentRoute.visits][google.maps.routeoptimization.v1.ShipmentRoute.visits],
   * depending on the context.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.AggregatedMetrics metrics = 12;</code>
   */
  com.google.maps.routeoptimization.v1.AggregatedMetricsOrBuilder getMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Cost of the route, broken down by cost-related request fields.
   * The keys are proto paths, relative to the input OptimizeToursRequest, e.g.
   * "model.shipments.pickups.cost", and the values are the total cost
   * generated by the corresponding cost field, aggregated over the whole route.
   * In other words, costs["model.shipments.pickups.cost"] is the sum of all
   * pickup costs over the route. All costs defined in the model are reported in
   * detail here with the exception of costs related to TransitionAttributes
   * that are only reported in an aggregated way as of 2022/01.
   * </pre>
   *
   * <code>map&lt;string, double&gt; route_costs = 17;</code>
   */
  int getRouteCostsCount();
  /**
   *
   *
   * <pre>
   * Cost of the route, broken down by cost-related request fields.
   * The keys are proto paths, relative to the input OptimizeToursRequest, e.g.
   * "model.shipments.pickups.cost", and the values are the total cost
   * generated by the corresponding cost field, aggregated over the whole route.
   * In other words, costs["model.shipments.pickups.cost"] is the sum of all
   * pickup costs over the route. All costs defined in the model are reported in
   * detail here with the exception of costs related to TransitionAttributes
   * that are only reported in an aggregated way as of 2022/01.
   * </pre>
   *
   * <code>map&lt;string, double&gt; route_costs = 17;</code>
   */
  boolean containsRouteCosts(java.lang.String key);
  /** Use {@link #getRouteCostsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Double> getRouteCosts();
  /**
   *
   *
   * <pre>
   * Cost of the route, broken down by cost-related request fields.
   * The keys are proto paths, relative to the input OptimizeToursRequest, e.g.
   * "model.shipments.pickups.cost", and the values are the total cost
   * generated by the corresponding cost field, aggregated over the whole route.
   * In other words, costs["model.shipments.pickups.cost"] is the sum of all
   * pickup costs over the route. All costs defined in the model are reported in
   * detail here with the exception of costs related to TransitionAttributes
   * that are only reported in an aggregated way as of 2022/01.
   * </pre>
   *
   * <code>map&lt;string, double&gt; route_costs = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.Double> getRouteCostsMap();
  /**
   *
   *
   * <pre>
   * Cost of the route, broken down by cost-related request fields.
   * The keys are proto paths, relative to the input OptimizeToursRequest, e.g.
   * "model.shipments.pickups.cost", and the values are the total cost
   * generated by the corresponding cost field, aggregated over the whole route.
   * In other words, costs["model.shipments.pickups.cost"] is the sum of all
   * pickup costs over the route. All costs defined in the model are reported in
   * detail here with the exception of costs related to TransitionAttributes
   * that are only reported in an aggregated way as of 2022/01.
   * </pre>
   *
   * <code>map&lt;string, double&gt; route_costs = 17;</code>
   */
  double getRouteCostsOrDefault(java.lang.String key, double defaultValue);
  /**
   *
   *
   * <pre>
   * Cost of the route, broken down by cost-related request fields.
   * The keys are proto paths, relative to the input OptimizeToursRequest, e.g.
   * "model.shipments.pickups.cost", and the values are the total cost
   * generated by the corresponding cost field, aggregated over the whole route.
   * In other words, costs["model.shipments.pickups.cost"] is the sum of all
   * pickup costs over the route. All costs defined in the model are reported in
   * detail here with the exception of costs related to TransitionAttributes
   * that are only reported in an aggregated way as of 2022/01.
   * </pre>
   *
   * <code>map&lt;string, double&gt; route_costs = 17;</code>
   */
  double getRouteCostsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Total cost of the route. The sum of all costs in the cost map.
   * </pre>
   *
   * <code>double route_total_cost = 18;</code>
   *
   * @return The routeTotalCost.
   */
  double getRouteTotalCost();
}
