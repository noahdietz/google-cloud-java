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
// source: google/cloud/iot/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.iot.v1;

public interface MqttConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.MqttConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   *
   * @return The enum numeric value on the wire for mqttEnabledState.
   */
  int getMqttEnabledStateValue();
  /**
   *
   *
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   *
   * @return The mqttEnabledState.
   */
  com.google.cloud.iot.v1.MqttState getMqttEnabledState();
}
