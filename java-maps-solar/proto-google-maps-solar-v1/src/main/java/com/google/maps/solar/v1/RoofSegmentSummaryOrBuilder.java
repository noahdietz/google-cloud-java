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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.solar.v1;

public interface RoofSegmentSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.solar.v1.RoofSegmentSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Angle of the roof segment relative to the theoretical ground plane.
   * 0 = parallel to the ground, 90 = perpendicular to the ground.
   * </pre>
   *
   * <code>optional float pitch_degrees = 2;</code>
   *
   * @return Whether the pitchDegrees field is set.
   */
  boolean hasPitchDegrees();
  /**
   *
   *
   * <pre>
   * Angle of the roof segment relative to the theoretical ground plane.
   * 0 = parallel to the ground, 90 = perpendicular to the ground.
   * </pre>
   *
   * <code>optional float pitch_degrees = 2;</code>
   *
   * @return The pitchDegrees.
   */
  float getPitchDegrees();

  /**
   *
   *
   * <pre>
   * Compass direction the roof segment is pointing in. 0 = North, 90 =
   * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
   * near 0), azimuth is not well defined, so for consistency, we define it
   * arbitrarily to be 0 (North).
   * </pre>
   *
   * <code>optional float azimuth_degrees = 3;</code>
   *
   * @return Whether the azimuthDegrees field is set.
   */
  boolean hasAzimuthDegrees();
  /**
   *
   *
   * <pre>
   * Compass direction the roof segment is pointing in. 0 = North, 90 =
   * East, 180 = South. For a "flat" roof segment (`pitch_degrees` very
   * near 0), azimuth is not well defined, so for consistency, we define it
   * arbitrarily to be 0 (North).
   * </pre>
   *
   * <code>optional float azimuth_degrees = 3;</code>
   *
   * @return The azimuthDegrees.
   */
  float getAzimuthDegrees();

  /**
   *
   *
   * <pre>
   * The total number of panels on this segment.
   * </pre>
   *
   * <code>int32 panels_count = 7;</code>
   *
   * @return The panelsCount.
   */
  int getPanelsCount();

  /**
   *
   *
   * <pre>
   * How much sunlight energy this part of the layout captures over the
   * course of a year, in DC kWh, assuming the panels described above.
   * </pre>
   *
   * <code>float yearly_energy_dc_kwh = 8;</code>
   *
   * @return The yearlyEnergyDcKwh.
   */
  float getYearlyEnergyDcKwh();

  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the corresponding `RoofSegmentSizeAndSunshineStats`.
   * </pre>
   *
   * <code>optional int32 segment_index = 9;</code>
   *
   * @return Whether the segmentIndex field is set.
   */
  boolean hasSegmentIndex();
  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the corresponding `RoofSegmentSizeAndSunshineStats`.
   * </pre>
   *
   * <code>optional int32 segment_index = 9;</code>
   *
   * @return The segmentIndex.
   */
  int getSegmentIndex();
}
