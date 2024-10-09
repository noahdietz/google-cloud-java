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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public interface DailyScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.DailySchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The maximum number of Snapshots to keep for the hourly schedule
   * </pre>
   *
   * <code>optional double snapshots_to_keep = 1;</code>
   *
   * @return Whether the snapshotsToKeep field is set.
   */
  boolean hasSnapshotsToKeep();
  /**
   *
   *
   * <pre>
   * The maximum number of Snapshots to keep for the hourly schedule
   * </pre>
   *
   * <code>optional double snapshots_to_keep = 1;</code>
   *
   * @return The snapshotsToKeep.
   */
  double getSnapshotsToKeep();

  /**
   *
   *
   * <pre>
   * Set the minute of the hour to start the snapshot (0-59), defaults to the
   * top of the hour (0).
   * </pre>
   *
   * <code>optional double minute = 2;</code>
   *
   * @return Whether the minute field is set.
   */
  boolean hasMinute();
  /**
   *
   *
   * <pre>
   * Set the minute of the hour to start the snapshot (0-59), defaults to the
   * top of the hour (0).
   * </pre>
   *
   * <code>optional double minute = 2;</code>
   *
   * @return The minute.
   */
  double getMinute();

  /**
   *
   *
   * <pre>
   * Set the hour to start the snapshot (0-23), defaults to midnight (0).
   * </pre>
   *
   * <code>optional double hour = 3;</code>
   *
   * @return Whether the hour field is set.
   */
  boolean hasHour();
  /**
   *
   *
   * <pre>
   * Set the hour to start the snapshot (0-23), defaults to midnight (0).
   * </pre>
   *
   * <code>optional double hour = 3;</code>
   *
   * @return The hour.
   */
  double getHour();
}
