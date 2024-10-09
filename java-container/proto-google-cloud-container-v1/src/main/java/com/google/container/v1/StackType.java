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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Possible values for IP stack type
 * </pre>
 *
 * Protobuf enum {@code google.container.v1.StackType}
 */
public enum StackType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value, will be defaulted as IPV4 only
   * </pre>
   *
   * <code>STACK_TYPE_UNSPECIFIED = 0;</code>
   */
  STACK_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Cluster is IPV4 only
   * </pre>
   *
   * <code>IPV4 = 1;</code>
   */
  IPV4(1),
  /**
   *
   *
   * <pre>
   * Cluster can use both IPv4 and IPv6
   * </pre>
   *
   * <code>IPV4_IPV6 = 2;</code>
   */
  IPV4_IPV6(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value, will be defaulted as IPV4 only
   * </pre>
   *
   * <code>STACK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int STACK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Cluster is IPV4 only
   * </pre>
   *
   * <code>IPV4 = 1;</code>
   */
  public static final int IPV4_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Cluster can use both IPv4 and IPv6
   * </pre>
   *
   * <code>IPV4_IPV6 = 2;</code>
   */
  public static final int IPV4_IPV6_VALUE = 2;

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
  public static StackType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StackType forNumber(int value) {
    switch (value) {
      case 0:
        return STACK_TYPE_UNSPECIFIED;
      case 1:
        return IPV4;
      case 2:
        return IPV4_IPV6;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StackType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<StackType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<StackType>() {
        public StackType findValueByNumber(int number) {
          return StackType.forNumber(number);
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
    return com.google.container.v1.ClusterServiceProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final StackType[] VALUES = values();

  public static StackType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StackType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1.StackType)
}
