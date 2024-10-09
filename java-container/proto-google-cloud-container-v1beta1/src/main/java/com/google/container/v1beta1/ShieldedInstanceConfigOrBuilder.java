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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface ShieldedInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ShieldedInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by
   * verifying the digital signature of all boot components, and halting the
   * boot process if signature verification fails.
   * </pre>
   *
   * <code>bool enable_secure_boot = 1;</code>
   *
   * @return The enableSecureBoot.
   */
  boolean getEnableSecureBoot();

  /**
   *
   *
   * <pre>
   * Defines whether the instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the instance.
   * The attestation is performed against the integrity policy baseline. This
   * baseline is initially derived from the implicitly trusted boot image when
   * the instance is created.
   * </pre>
   *
   * <code>bool enable_integrity_monitoring = 2;</code>
   *
   * @return The enableIntegrityMonitoring.
   */
  boolean getEnableIntegrityMonitoring();
}
