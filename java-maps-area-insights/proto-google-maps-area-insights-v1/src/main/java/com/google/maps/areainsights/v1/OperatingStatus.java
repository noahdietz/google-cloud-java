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
// source: google/maps/areainsights/v1/area_insights_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.areainsights.v1;

/**
 *
 *
 * <pre>
 * Operating status of the place.
 * </pre>
 *
 * Protobuf enum {@code google.maps.areainsights.v1.OperatingStatus}
 */
public enum OperatingStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not Specified.
   * </pre>
   *
   * <code>OPERATING_STATUS_UNSPECIFIED = 0;</code>
   */
  OPERATING_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The place is operational and its open during its defined hours.
   * </pre>
   *
   * <code>OPERATING_STATUS_OPERATIONAL = 1;</code>
   */
  OPERATING_STATUS_OPERATIONAL(1),
  /**
   *
   *
   * <pre>
   * The Place is no longer in business.
   * </pre>
   *
   * <code>OPERATING_STATUS_PERMANENTLY_CLOSED = 3;</code>
   */
  OPERATING_STATUS_PERMANENTLY_CLOSED(3),
  /**
   *
   *
   * <pre>
   * The Place is temporarily closed and expected to reopen in the future.
   * </pre>
   *
   * <code>OPERATING_STATUS_TEMPORARILY_CLOSED = 4;</code>
   */
  OPERATING_STATUS_TEMPORARILY_CLOSED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not Specified.
   * </pre>
   *
   * <code>OPERATING_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int OPERATING_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The place is operational and its open during its defined hours.
   * </pre>
   *
   * <code>OPERATING_STATUS_OPERATIONAL = 1;</code>
   */
  public static final int OPERATING_STATUS_OPERATIONAL_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The Place is no longer in business.
   * </pre>
   *
   * <code>OPERATING_STATUS_PERMANENTLY_CLOSED = 3;</code>
   */
  public static final int OPERATING_STATUS_PERMANENTLY_CLOSED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The Place is temporarily closed and expected to reopen in the future.
   * </pre>
   *
   * <code>OPERATING_STATUS_TEMPORARILY_CLOSED = 4;</code>
   */
  public static final int OPERATING_STATUS_TEMPORARILY_CLOSED_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OperatingStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperatingStatus forNumber(int value) {
    switch (value) {
      case 0:
        return OPERATING_STATUS_UNSPECIFIED;
      case 1:
        return OPERATING_STATUS_OPERATIONAL;
      case 3:
        return OPERATING_STATUS_PERMANENTLY_CLOSED;
      case 4:
        return OPERATING_STATUS_TEMPORARILY_CLOSED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperatingStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OperatingStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<OperatingStatus>() {
        public OperatingStatus findValueByNumber(int number) {
          return OperatingStatus.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final OperatingStatus[] VALUES = values();

  public static OperatingStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OperatingStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.areainsights.v1.OperatingStatus)
}
