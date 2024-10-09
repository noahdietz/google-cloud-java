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
// source: google/iam/credentials/v1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.iam.credentials.v1;

public interface SignBlobResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.SignBlobResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   *
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * The ID of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   *
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * The signed blob.
   * </pre>
   *
   * <code>bytes signed_blob = 4;</code>
   *
   * @return The signedBlob.
   */
  com.google.protobuf.ByteString getSignedBlob();
}
