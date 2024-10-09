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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * The configuration setting for Task Logs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig}
 */
public final class TaskLogsRetentionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig)
    TaskLogsRetentionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TaskLogsRetentionConfig.newBuilder() to construct.
  private TaskLogsRetentionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TaskLogsRetentionConfig() {
    storageMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TaskLogsRetentionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_TaskLogsRetentionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_TaskLogsRetentionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.class,
            com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.Builder
                .class);
  }

  /**
   *
   *
   * <pre>
   * The definition of task_logs_storage_mode.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode}
   */
  public enum TaskLogsStorageMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * This configuration is not specified by the user.
     * </pre>
     *
     * <code>TASK_LOGS_STORAGE_MODE_UNSPECIFIED = 0;</code>
     */
    TASK_LOGS_STORAGE_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Store task logs in Cloud Logging and in the environment's Cloud Storage
     * bucket.
     * </pre>
     *
     * <code>CLOUD_LOGGING_AND_CLOUD_STORAGE = 1;</code>
     */
    CLOUD_LOGGING_AND_CLOUD_STORAGE(1),
    /**
     *
     *
     * <pre>
     * Store task logs in Cloud Logging only.
     * </pre>
     *
     * <code>CLOUD_LOGGING_ONLY = 2;</code>
     */
    CLOUD_LOGGING_ONLY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * This configuration is not specified by the user.
     * </pre>
     *
     * <code>TASK_LOGS_STORAGE_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int TASK_LOGS_STORAGE_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Store task logs in Cloud Logging and in the environment's Cloud Storage
     * bucket.
     * </pre>
     *
     * <code>CLOUD_LOGGING_AND_CLOUD_STORAGE = 1;</code>
     */
    public static final int CLOUD_LOGGING_AND_CLOUD_STORAGE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Store task logs in Cloud Logging only.
     * </pre>
     *
     * <code>CLOUD_LOGGING_ONLY = 2;</code>
     */
    public static final int CLOUD_LOGGING_ONLY_VALUE = 2;

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
    public static TaskLogsStorageMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TaskLogsStorageMode forNumber(int value) {
      switch (value) {
        case 0:
          return TASK_LOGS_STORAGE_MODE_UNSPECIFIED;
        case 1:
          return CLOUD_LOGGING_AND_CLOUD_STORAGE;
        case 2:
          return CLOUD_LOGGING_ONLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TaskLogsStorageMode>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TaskLogsStorageMode>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TaskLogsStorageMode>() {
              public TaskLogsStorageMode findValueByNumber(int number) {
                return TaskLogsStorageMode.forNumber(number);
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
      return com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
          .getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final TaskLogsStorageMode[] VALUES = values();

    public static TaskLogsStorageMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TaskLogsStorageMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode)
  }

  public static final int STORAGE_MODE_FIELD_NUMBER = 2;
  private int storageMode_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The mode of storage for Airflow workers task logs.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for storageMode.
   */
  @java.lang.Override
  public int getStorageModeValue() {
    return storageMode_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The mode of storage for Airflow workers task logs.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The storageMode.
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
          .TaskLogsStorageMode
      getStorageMode() {
    com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode
        result =
            com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
                .TaskLogsStorageMode.forNumber(storageMode_);
    return result == null
        ? com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
            .TaskLogsStorageMode.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (storageMode_
        != com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
            .TaskLogsStorageMode.TASK_LOGS_STORAGE_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, storageMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (storageMode_
        != com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
            .TaskLogsStorageMode.TASK_LOGS_STORAGE_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, storageMode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig other =
        (com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig) obj;

    if (storageMode_ != other.storageMode_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STORAGE_MODE_FIELD_NUMBER;
    hash = (53 * hash) + storageMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The configuration setting for Task Logs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig)
      com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_TaskLogsRetentionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_TaskLogsRetentionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.class,
              com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      storageMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_TaskLogsRetentionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig build() {
      com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
        buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig result =
          new com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.storageMode_ = storageMode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
              .getDefaultInstance()) return this;
      if (other.storageMode_ != 0) {
        setStorageModeValue(other.getStorageModeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16:
              {
                storageMode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int storageMode_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The mode of storage for Airflow workers task logs.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for storageMode.
     */
    @java.lang.Override
    public int getStorageModeValue() {
      return storageMode_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of storage for Airflow workers task logs.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for storageMode to set.
     * @return This builder for chaining.
     */
    public Builder setStorageModeValue(int value) {
      storageMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of storage for Airflow workers task logs.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The storageMode.
     */
    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
            .TaskLogsStorageMode
        getStorageMode() {
      com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode
          result =
              com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
                  .TaskLogsStorageMode.forNumber(storageMode_);
      return result == null
          ? com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
              .TaskLogsStorageMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of storage for Airflow workers task logs.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The storageMode to set.
     * @return This builder for chaining.
     */
    public Builder setStorageMode(
        com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
                .TaskLogsStorageMode
            value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      storageMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The mode of storage for Airflow workers task logs.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig.TaskLogsStorageMode storage_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStorageMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      storageMode_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig)
  private static final com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskLogsRetentionConfig> PARSER =
      new com.google.protobuf.AbstractParser<TaskLogsRetentionConfig>() {
        @java.lang.Override
        public TaskLogsRetentionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<TaskLogsRetentionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskLogsRetentionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.TaskLogsRetentionConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
