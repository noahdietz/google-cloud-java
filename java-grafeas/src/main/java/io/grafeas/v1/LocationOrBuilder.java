/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/package.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface LocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated.
   * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The cpeUri.
   */
  java.lang.String getCpeUri();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The bytes for cpeUri.
   */
  com.google.protobuf.ByteString getCpeUriBytes();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   *
   * @return The version.
   */
  io.grafeas.v1.Version getVersion();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   */
  io.grafeas.v1.VersionOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();
}
