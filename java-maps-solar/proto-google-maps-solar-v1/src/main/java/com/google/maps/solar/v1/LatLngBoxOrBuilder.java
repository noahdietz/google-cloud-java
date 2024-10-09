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

public interface LatLngBoxOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.solar.v1.LatLngBox)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   *
   * @return Whether the sw field is set.
   */
  boolean hasSw();
  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   *
   * @return The sw.
   */
  com.google.type.LatLng getSw();
  /**
   *
   *
   * <pre>
   * The southwest corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng sw = 1;</code>
   */
  com.google.type.LatLngOrBuilder getSwOrBuilder();

  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   *
   * @return Whether the ne field is set.
   */
  boolean hasNe();
  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   *
   * @return The ne.
   */
  com.google.type.LatLng getNe();
  /**
   *
   *
   * <pre>
   * The northeast corner of the box.
   * </pre>
   *
   * <code>.google.type.LatLng ne = 2;</code>
   */
  com.google.type.LatLngOrBuilder getNeOrBuilder();
}
