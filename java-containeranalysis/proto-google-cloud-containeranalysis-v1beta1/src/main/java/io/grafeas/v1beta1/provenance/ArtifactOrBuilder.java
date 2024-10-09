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
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.provenance;

public interface ArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.provenance.Artifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   *
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   *
   *
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   *
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString getChecksumBytes();

  /**
   *
   *
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   *
   * @return The count of names.
   */
  int getNamesCount();
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   *
   *
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}
