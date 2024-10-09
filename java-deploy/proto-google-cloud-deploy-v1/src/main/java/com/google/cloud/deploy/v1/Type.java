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
// source: google/cloud/deploy/v1/log_enums.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Type indicates the type of the log entry and can be used as a filter.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.deploy.v1.Type}
 */
public enum Type implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Type is unspecified.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A Pub/Sub notification failed to be sent.
   * </pre>
   *
   * <code>TYPE_PUBSUB_NOTIFICATION_FAILURE = 1;</code>
   */
  TYPE_PUBSUB_NOTIFICATION_FAILURE(1),
  /**
   *
   *
   * <pre>
   * Resource state changed.
   * </pre>
   *
   * <code>TYPE_RESOURCE_STATE_CHANGE = 3;</code>
   */
  TYPE_RESOURCE_STATE_CHANGE(3),
  /**
   *
   *
   * <pre>
   * A process aborted.
   * </pre>
   *
   * <code>TYPE_PROCESS_ABORTED = 4;</code>
   */
  TYPE_PROCESS_ABORTED(4),
  /**
   *
   *
   * <pre>
   * Restriction check failed.
   * </pre>
   *
   * <code>TYPE_RESTRICTION_VIOLATED = 5;</code>
   */
  TYPE_RESTRICTION_VIOLATED(5),
  /**
   *
   *
   * <pre>
   * Resource deleted.
   * </pre>
   *
   * <code>TYPE_RESOURCE_DELETED = 6;</code>
   */
  TYPE_RESOURCE_DELETED(6),
  /**
   *
   *
   * <pre>
   * Rollout updated.
   * </pre>
   *
   * <code>TYPE_ROLLOUT_UPDATE = 7;</code>
   */
  TYPE_ROLLOUT_UPDATE(7),
  /**
   *
   *
   * <pre>
   * Deploy Policy evaluation.
   * </pre>
   *
   * <code>TYPE_DEPLOY_POLICY_EVALUATION = 8;</code>
   */
  TYPE_DEPLOY_POLICY_EVALUATION(8),
  /**
   *
   *
   * <pre>
   * Deprecated: This field is never used. Use release_render log type instead.
   * </pre>
   *
   * <code>TYPE_RENDER_STATUES_CHANGE = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  TYPE_RENDER_STATUES_CHANGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Type is unspecified.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A Pub/Sub notification failed to be sent.
   * </pre>
   *
   * <code>TYPE_PUBSUB_NOTIFICATION_FAILURE = 1;</code>
   */
  public static final int TYPE_PUBSUB_NOTIFICATION_FAILURE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Resource state changed.
   * </pre>
   *
   * <code>TYPE_RESOURCE_STATE_CHANGE = 3;</code>
   */
  public static final int TYPE_RESOURCE_STATE_CHANGE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * A process aborted.
   * </pre>
   *
   * <code>TYPE_PROCESS_ABORTED = 4;</code>
   */
  public static final int TYPE_PROCESS_ABORTED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Restriction check failed.
   * </pre>
   *
   * <code>TYPE_RESTRICTION_VIOLATED = 5;</code>
   */
  public static final int TYPE_RESTRICTION_VIOLATED_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Resource deleted.
   * </pre>
   *
   * <code>TYPE_RESOURCE_DELETED = 6;</code>
   */
  public static final int TYPE_RESOURCE_DELETED_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Rollout updated.
   * </pre>
   *
   * <code>TYPE_ROLLOUT_UPDATE = 7;</code>
   */
  public static final int TYPE_ROLLOUT_UPDATE_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Deploy Policy evaluation.
   * </pre>
   *
   * <code>TYPE_DEPLOY_POLICY_EVALUATION = 8;</code>
   */
  public static final int TYPE_DEPLOY_POLICY_EVALUATION_VALUE = 8;
  /**
   *
   *
   * <pre>
   * Deprecated: This field is never used. Use release_render log type instead.
   * </pre>
   *
   * <code>TYPE_RENDER_STATUES_CHANGE = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int TYPE_RENDER_STATUES_CHANGE_VALUE = 2;

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
  public static Type valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Type forNumber(int value) {
    switch (value) {
      case 0:
        return TYPE_UNSPECIFIED;
      case 1:
        return TYPE_PUBSUB_NOTIFICATION_FAILURE;
      case 3:
        return TYPE_RESOURCE_STATE_CHANGE;
      case 4:
        return TYPE_PROCESS_ABORTED;
      case 5:
        return TYPE_RESTRICTION_VIOLATED;
      case 6:
        return TYPE_RESOURCE_DELETED;
      case 7:
        return TYPE_ROLLOUT_UPDATE;
      case 8:
        return TYPE_DEPLOY_POLICY_EVALUATION;
      case 2:
        return TYPE_RENDER_STATUES_CHANGE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Type>() {
        public Type findValueByNumber(int number) {
          return Type.forNumber(number);
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
    return com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Type[] VALUES = values();

  public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Type(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.deploy.v1.Type)
}
