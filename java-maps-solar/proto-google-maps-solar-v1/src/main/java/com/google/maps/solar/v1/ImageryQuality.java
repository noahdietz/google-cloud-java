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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.solar.v1;

/**
 *
 *
 * <pre>
 * The quality of the imagery used to compute some API result.
 *
 * Note: Regardless of imagery quality level, DSM outputs always have a
 * resolution of 0.1 m/pixel, monthly flux outputs always have a resolution of
 * 0.5 m/pixel, and hourly shade outputs always have a resolution of 1 m/pixel.
 * </pre>
 *
 * Protobuf enum {@code google.maps.solar.v1.ImageryQuality}
 */
public enum ImageryQuality implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No quality is known.
   * </pre>
   *
   * <code>IMAGERY_QUALITY_UNSPECIFIED = 0;</code>
   */
  IMAGERY_QUALITY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.1 m/pixel.
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  HIGH(1),
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.25 m/pixel.
   * </pre>
   *
   * <code>MEDIUM = 2;</code>
   */
  MEDIUM(2),
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.5 m/pixel.
   * </pre>
   *
   * <code>LOW = 3;</code>
   */
  LOW(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No quality is known.
   * </pre>
   *
   * <code>IMAGERY_QUALITY_UNSPECIFIED = 0;</code>
   */
  public static final int IMAGERY_QUALITY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.1 m/pixel.
   * </pre>
   *
   * <code>HIGH = 1;</code>
   */
  public static final int HIGH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.25 m/pixel.
   * </pre>
   *
   * <code>MEDIUM = 2;</code>
   */
  public static final int MEDIUM_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The underlying imagery and DSM data were processed at 0.5 m/pixel.
   * </pre>
   *
   * <code>LOW = 3;</code>
   */
  public static final int LOW_VALUE = 3;

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
  public static ImageryQuality valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImageryQuality forNumber(int value) {
    switch (value) {
      case 0:
        return IMAGERY_QUALITY_UNSPECIFIED;
      case 1:
        return HIGH;
      case 2:
        return MEDIUM;
      case 3:
        return LOW;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImageryQuality> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ImageryQuality> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ImageryQuality>() {
        public ImageryQuality findValueByNumber(int number) {
          return ImageryQuality.forNumber(number);
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
    return com.google.maps.solar.v1.SolarServiceProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ImageryQuality[] VALUES = values();

  public static ImageryQuality valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImageryQuality(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.solar.v1.ImageryQuality)
}
