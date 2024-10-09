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
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.build;

public interface BuildSignatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.build.BuildSignature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Public key of the builder which can be used to verify that the related
   * findings are valid and unchanged. If `key_type` is empty, this defaults
   * to PEM encoded public keys.
   *
   * This field may be empty if `key_id` references an external key.
   *
   * For Cloud Build based signatures, this is a PEM encoded public
   * key. To verify the Cloud Build signature, place the contents of
   * this field into a file (public.pem). The signature field is base64-decoded
   * into its binary representation in signature.bin, and the provenance bytes
   * from `BuildDetails` are base64-decoded into a binary representation in
   * signed.bin. OpenSSL can then verify the signature:
   * `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
   * </pre>
   *
   * <code>string public_key = 1;</code>
   *
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   *
   *
   * <pre>
   * Public key of the builder which can be used to verify that the related
   * findings are valid and unchanged. If `key_type` is empty, this defaults
   * to PEM encoded public keys.
   *
   * This field may be empty if `key_id` references an external key.
   *
   * For Cloud Build based signatures, this is a PEM encoded public
   * key. To verify the Cloud Build signature, place the contents of
   * this field into a file (public.pem). The signature field is base64-decoded
   * into its binary representation in signature.bin, and the provenance bytes
   * from `BuildDetails` are base64-decoded into a binary representation in
   * signed.bin. OpenSSL can then verify the signature:
   * `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
   * </pre>
   *
   * <code>string public_key = 1;</code>
   *
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString getPublicKeyBytes();

  /**
   *
   *
   * <pre>
   * Required. Signature of the related `BuildProvenance`. In JSON, this is
   * base-64 encoded.
   * </pre>
   *
   * <code>bytes signature = 2;</code>
   *
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   *
   *
   * <pre>
   * An ID for the key used to sign. This could be either an ID for the key
   * stored in `public_key` (such as the ID or fingerprint for a PGP key, or the
   * CN for a cert), or a reference to an external key (such as a reference to a
   * key in Cloud Key Management Service).
   * </pre>
   *
   * <code>string key_id = 3;</code>
   *
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * An ID for the key used to sign. This could be either an ID for the key
   * stored in `public_key` (such as the ID or fingerprint for a PGP key, or the
   * CN for a cert), or a reference to an external key (such as a reference to a
   * key in Cloud Key Management Service).
   * </pre>
   *
   * <code>string key_id = 3;</code>
   *
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the key, either stored in `public_key` or referenced in
   * `key_id`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature.KeyType key_type = 4;</code>
   *
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the key, either stored in `public_key` or referenced in
   * `key_id`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature.KeyType key_type = 4;</code>
   *
   * @return The keyType.
   */
  io.grafeas.v1beta1.build.BuildSignature.KeyType getKeyType();
}
