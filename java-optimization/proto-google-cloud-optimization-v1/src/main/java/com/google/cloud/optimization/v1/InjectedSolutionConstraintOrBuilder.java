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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.optimization.v1;

public interface InjectedSolutionConstraintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.InjectedSolutionConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Routes of the solution to inject. Some routes may be omitted from the
   * original solution. The routes and skipped shipments must satisfy the basic
   * validity assumptions listed for `injected_first_solution_routes`.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.ShipmentRoute> getRoutesList();
  /**
   *
   *
   * <pre>
   * Routes of the solution to inject. Some routes may be omitted from the
   * original solution. The routes and skipped shipments must satisfy the basic
   * validity assumptions listed for `injected_first_solution_routes`.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  com.google.cloud.optimization.v1.ShipmentRoute getRoutes(int index);
  /**
   *
   *
   * <pre>
   * Routes of the solution to inject. Some routes may be omitted from the
   * original solution. The routes and skipped shipments must satisfy the basic
   * validity assumptions listed for `injected_first_solution_routes`.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  int getRoutesCount();
  /**
   *
   *
   * <pre>
   * Routes of the solution to inject. Some routes may be omitted from the
   * original solution. The routes and skipped shipments must satisfy the basic
   * validity assumptions listed for `injected_first_solution_routes`.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.ShipmentRouteOrBuilder>
      getRoutesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Routes of the solution to inject. Some routes may be omitted from the
   * original solution. The routes and skipped shipments must satisfy the basic
   * validity assumptions listed for `injected_first_solution_routes`.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  com.google.cloud.optimization.v1.ShipmentRouteOrBuilder getRoutesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Skipped shipments of the solution to inject. Some may be omitted from the
   * original solution. See the `routes` field.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 2;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.SkippedShipment> getSkippedShipmentsList();
  /**
   *
   *
   * <pre>
   * Skipped shipments of the solution to inject. Some may be omitted from the
   * original solution. See the `routes` field.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 2;</code>
   */
  com.google.cloud.optimization.v1.SkippedShipment getSkippedShipments(int index);
  /**
   *
   *
   * <pre>
   * Skipped shipments of the solution to inject. Some may be omitted from the
   * original solution. See the `routes` field.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 2;</code>
   */
  int getSkippedShipmentsCount();
  /**
   *
   *
   * <pre>
   * Skipped shipments of the solution to inject. Some may be omitted from the
   * original solution. See the `routes` field.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 2;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.SkippedShipmentOrBuilder>
      getSkippedShipmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Skipped shipments of the solution to inject. Some may be omitted from the
   * original solution. See the `routes` field.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 2;</code>
   */
  com.google.cloud.optimization.v1.SkippedShipmentOrBuilder getSkippedShipmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For zero or more groups of vehicles, specifies when and how much to relax
   * constraints. If this field is empty, all non-empty vehicle routes are
   * fully constrained.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation constraint_relaxations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation>
      getConstraintRelaxationsList();
  /**
   *
   *
   * <pre>
   * For zero or more groups of vehicles, specifies when and how much to relax
   * constraints. If this field is empty, all non-empty vehicle routes are
   * fully constrained.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation constraint_relaxations = 3;
   * </code>
   */
  com.google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation
      getConstraintRelaxations(int index);
  /**
   *
   *
   * <pre>
   * For zero or more groups of vehicles, specifies when and how much to relax
   * constraints. If this field is empty, all non-empty vehicle routes are
   * fully constrained.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation constraint_relaxations = 3;
   * </code>
   */
  int getConstraintRelaxationsCount();
  /**
   *
   *
   * <pre>
   * For zero or more groups of vehicles, specifies when and how much to relax
   * constraints. If this field is empty, all non-empty vehicle routes are
   * fully constrained.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation constraint_relaxations = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.optimization.v1.InjectedSolutionConstraint
                  .ConstraintRelaxationOrBuilder>
      getConstraintRelaxationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * For zero or more groups of vehicles, specifies when and how much to relax
   * constraints. If this field is empty, all non-empty vehicle routes are
   * fully constrained.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxation constraint_relaxations = 3;
   * </code>
   */
  com.google.cloud.optimization.v1.InjectedSolutionConstraint.ConstraintRelaxationOrBuilder
      getConstraintRelaxationsOrBuilder(int index);
}
