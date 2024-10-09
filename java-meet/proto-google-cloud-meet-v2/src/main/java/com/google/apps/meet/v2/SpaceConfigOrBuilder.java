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
// source: google/apps/meet/v2/resource.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.meet.v2;

public interface SpaceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2.SpaceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Access type of the meeting space that determines who can join without
   * knocking. Default: The user's default access settings.  Controlled by the
   * user's admin for enterprise users or RESTRICTED.
   * </pre>
   *
   * <code>.google.apps.meet.v2.SpaceConfig.AccessType access_type = 1;</code>
   *
   * @return The enum numeric value on the wire for accessType.
   */
  int getAccessTypeValue();
  /**
   *
   *
   * <pre>
   * Access type of the meeting space that determines who can join without
   * knocking. Default: The user's default access settings.  Controlled by the
   * user's admin for enterprise users or RESTRICTED.
   * </pre>
   *
   * <code>.google.apps.meet.v2.SpaceConfig.AccessType access_type = 1;</code>
   *
   * @return The accessType.
   */
  com.google.apps.meet.v2.SpaceConfig.AccessType getAccessType();

  /**
   *
   *
   * <pre>
   * Defines the entry points that can be used to join meetings hosted in this
   * meeting space.
   * Default: EntryPointAccess.ALL
   * </pre>
   *
   * <code>.google.apps.meet.v2.SpaceConfig.EntryPointAccess entry_point_access = 2;</code>
   *
   * @return The enum numeric value on the wire for entryPointAccess.
   */
  int getEntryPointAccessValue();
  /**
   *
   *
   * <pre>
   * Defines the entry points that can be used to join meetings hosted in this
   * meeting space.
   * Default: EntryPointAccess.ALL
   * </pre>
   *
   * <code>.google.apps.meet.v2.SpaceConfig.EntryPointAccess entry_point_access = 2;</code>
   *
   * @return The entryPointAccess.
   */
  com.google.apps.meet.v2.SpaceConfig.EntryPointAccess getEntryPointAccess();
}
