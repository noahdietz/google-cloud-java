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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * Schema file format.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datastream.v1alpha1.SchemaFileFormat}
 */
public enum SchemaFileFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified schema file format.
   * </pre>
   *
   * <code>SCHEMA_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  SCHEMA_FILE_FORMAT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Do not attach schema file.
   * </pre>
   *
   * <code>NO_SCHEMA_FILE = 1;</code>
   */
  NO_SCHEMA_FILE(1),
  /**
   *
   *
   * <pre>
   * Avro schema format.
   * </pre>
   *
   * <code>AVRO_SCHEMA_FILE = 2;</code>
   */
  AVRO_SCHEMA_FILE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified schema file format.
   * </pre>
   *
   * <code>SCHEMA_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int SCHEMA_FILE_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Do not attach schema file.
   * </pre>
   *
   * <code>NO_SCHEMA_FILE = 1;</code>
   */
  public static final int NO_SCHEMA_FILE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Avro schema format.
   * </pre>
   *
   * <code>AVRO_SCHEMA_FILE = 2;</code>
   */
  public static final int AVRO_SCHEMA_FILE_VALUE = 2;

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
  public static SchemaFileFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SchemaFileFormat forNumber(int value) {
    switch (value) {
      case 0:
        return SCHEMA_FILE_FORMAT_UNSPECIFIED;
      case 1:
        return NO_SCHEMA_FILE;
      case 2:
        return AVRO_SCHEMA_FILE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SchemaFileFormat> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SchemaFileFormat> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SchemaFileFormat>() {
        public SchemaFileFormat findValueByNumber(int number) {
          return SchemaFileFormat.forNumber(number);
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
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final SchemaFileFormat[] VALUES = values();

  public static SchemaFileFormat valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SchemaFileFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datastream.v1alpha1.SchemaFileFormat)
}
