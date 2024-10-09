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
// source: google/cloud/iot/v1/device_manager.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.iot.v1;

public interface ListDevicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ListDevicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The device registry path. Required. For example,
   * `projects/my-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The device registry path. Required. For example,
   * `projects/my-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * A list of device numeric IDs. If empty, this field is ignored. Maximum
   * IDs: 10,000.
   * </pre>
   *
   * <code>repeated uint64 device_num_ids = 2;</code>
   *
   * @return A list containing the deviceNumIds.
   */
  java.util.List<java.lang.Long> getDeviceNumIdsList();
  /**
   *
   *
   * <pre>
   * A list of device numeric IDs. If empty, this field is ignored. Maximum
   * IDs: 10,000.
   * </pre>
   *
   * <code>repeated uint64 device_num_ids = 2;</code>
   *
   * @return The count of deviceNumIds.
   */
  int getDeviceNumIdsCount();
  /**
   *
   *
   * <pre>
   * A list of device numeric IDs. If empty, this field is ignored. Maximum
   * IDs: 10,000.
   * </pre>
   *
   * <code>repeated uint64 device_num_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The deviceNumIds at the given index.
   */
  long getDeviceNumIds(int index);

  /**
   *
   *
   * <pre>
   * A list of device string IDs. For example, `['device0', 'device12']`.
   * If empty, this field is ignored. Maximum IDs: 10,000
   * </pre>
   *
   * <code>repeated string device_ids = 3;</code>
   *
   * @return A list containing the deviceIds.
   */
  java.util.List<java.lang.String> getDeviceIdsList();
  /**
   *
   *
   * <pre>
   * A list of device string IDs. For example, `['device0', 'device12']`.
   * If empty, this field is ignored. Maximum IDs: 10,000
   * </pre>
   *
   * <code>repeated string device_ids = 3;</code>
   *
   * @return The count of deviceIds.
   */
  int getDeviceIdsCount();
  /**
   *
   *
   * <pre>
   * A list of device string IDs. For example, `['device0', 'device12']`.
   * If empty, this field is ignored. Maximum IDs: 10,000
   * </pre>
   *
   * <code>repeated string device_ids = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The deviceIds at the given index.
   */
  java.lang.String getDeviceIds(int index);
  /**
   *
   *
   * <pre>
   * A list of device string IDs. For example, `['device0', 'device12']`.
   * If empty, this field is ignored. Maximum IDs: 10,000
   * </pre>
   *
   * <code>repeated string device_ids = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deviceIds at the given index.
   */
  com.google.protobuf.ByteString getDeviceIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The fields of the `Device` resource to be returned in the response. The
   * fields `id` and `num_id` are always returned, along with any
   * other fields specified in snake_case format, for example:
   * `last_heartbeat_time`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 4;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * The fields of the `Device` resource to be returned in the response. The
   * fields `id` and `num_id` are always returned, along with any
   * other fields specified in snake_case format, for example:
   * `last_heartbeat_time`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 4;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * The fields of the `Device` resource to be returned in the response. The
   * fields `id` and `num_id` are always returned, along with any
   * other fields specified in snake_case format, for example:
   * `last_heartbeat_time`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Options related to gateways.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayListOptions gateway_list_options = 6;</code>
   *
   * @return Whether the gatewayListOptions field is set.
   */
  boolean hasGatewayListOptions();
  /**
   *
   *
   * <pre>
   * Options related to gateways.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayListOptions gateway_list_options = 6;</code>
   *
   * @return The gatewayListOptions.
   */
  com.google.cloud.iot.v1.GatewayListOptions getGatewayListOptions();
  /**
   *
   *
   * <pre>
   * Options related to gateways.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayListOptions gateway_list_options = 6;</code>
   */
  com.google.cloud.iot.v1.GatewayListOptionsOrBuilder getGatewayListOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum number of devices to return in the response. If this value
   * is zero, the service will select a default size. A call may return fewer
   * objects than requested. A non-empty `next_page_token` in the response
   * indicates that more data is available.
   * </pre>
   *
   * <code>int32 page_size = 100;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListDevicesResponse`; indicates
   * that this is a continuation of a prior `ListDevices` call and
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 101;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value returned by the last `ListDevicesResponse`; indicates
   * that this is a continuation of a prior `ListDevices` call and
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 101;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
