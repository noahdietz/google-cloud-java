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
// source: google/cloud/securitycenter/v1/log_entry.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * An individual entry in a log.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.LogEntry}
 */
public final class LogEntry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.LogEntry)
    LogEntryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogEntry.newBuilder() to construct.
  private LogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogEntry() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.LogEntryProto
        .internal_static_google_cloud_securitycenter_v1_LogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.LogEntryProto
        .internal_static_google_cloud_securitycenter_v1_LogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.LogEntry.class,
            com.google.cloud.securitycenter.v1.LogEntry.Builder.class);
  }

  private int logEntryCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object logEntry_;

  public enum LogEntryCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CLOUD_LOGGING_ENTRY(1),
    LOGENTRY_NOT_SET(0);
    private final int value;

    private LogEntryCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogEntryCase valueOf(int value) {
      return forNumber(value);
    }

    public static LogEntryCase forNumber(int value) {
      switch (value) {
        case 1:
          return CLOUD_LOGGING_ENTRY;
        case 0:
          return LOGENTRY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public LogEntryCase getLogEntryCase() {
    return LogEntryCase.forNumber(logEntryCase_);
  }

  public static final int CLOUD_LOGGING_ENTRY_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * An individual entry in a log stored in Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
   *
   * @return Whether the cloudLoggingEntry field is set.
   */
  @java.lang.Override
  public boolean hasCloudLoggingEntry() {
    return logEntryCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * An individual entry in a log stored in Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
   *
   * @return The cloudLoggingEntry.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CloudLoggingEntry getCloudLoggingEntry() {
    if (logEntryCase_ == 1) {
      return (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_;
    }
    return com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * An individual entry in a log stored in Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CloudLoggingEntryOrBuilder
      getCloudLoggingEntryOrBuilder() {
    if (logEntryCase_ == 1) {
      return (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_;
    }
    return com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
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
    if (logEntryCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logEntryCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.LogEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.LogEntry other =
        (com.google.cloud.securitycenter.v1.LogEntry) obj;

    if (!getLogEntryCase().equals(other.getLogEntryCase())) return false;
    switch (logEntryCase_) {
      case 1:
        if (!getCloudLoggingEntry().equals(other.getCloudLoggingEntry())) return false;
        break;
      case 0:
      default:
    }
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
    switch (logEntryCase_) {
      case 1:
        hash = (37 * hash) + CLOUD_LOGGING_ENTRY_FIELD_NUMBER;
        hash = (53 * hash) + getCloudLoggingEntry().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.LogEntry parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.LogEntry prototype) {
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
   * An individual entry in a log.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.LogEntry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.LogEntry)
      com.google.cloud.securitycenter.v1.LogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.LogEntryProto
          .internal_static_google_cloud_securitycenter_v1_LogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.LogEntryProto
          .internal_static_google_cloud_securitycenter_v1_LogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.LogEntry.class,
              com.google.cloud.securitycenter.v1.LogEntry.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.LogEntry.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (cloudLoggingEntryBuilder_ != null) {
        cloudLoggingEntryBuilder_.clear();
      }
      logEntryCase_ = 0;
      logEntry_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.LogEntryProto
          .internal_static_google_cloud_securitycenter_v1_LogEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.LogEntry getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.LogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.LogEntry build() {
      com.google.cloud.securitycenter.v1.LogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.LogEntry buildPartial() {
      com.google.cloud.securitycenter.v1.LogEntry result =
          new com.google.cloud.securitycenter.v1.LogEntry(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.LogEntry result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.securitycenter.v1.LogEntry result) {
      result.logEntryCase_ = logEntryCase_;
      result.logEntry_ = this.logEntry_;
      if (logEntryCase_ == 1 && cloudLoggingEntryBuilder_ != null) {
        result.logEntry_ = cloudLoggingEntryBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.LogEntry) {
        return mergeFrom((com.google.cloud.securitycenter.v1.LogEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.LogEntry other) {
      if (other == com.google.cloud.securitycenter.v1.LogEntry.getDefaultInstance()) return this;
      switch (other.getLogEntryCase()) {
        case CLOUD_LOGGING_ENTRY:
          {
            mergeCloudLoggingEntry(other.getCloudLoggingEntry());
            break;
          }
        case LOGENTRY_NOT_SET:
          {
            break;
          }
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
            case 10:
              {
                input.readMessage(
                    getCloudLoggingEntryFieldBuilder().getBuilder(), extensionRegistry);
                logEntryCase_ = 1;
                break;
              } // case 10
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

    private int logEntryCase_ = 0;
    private java.lang.Object logEntry_;

    public LogEntryCase getLogEntryCase() {
      return LogEntryCase.forNumber(logEntryCase_);
    }

    public Builder clearLogEntry() {
      logEntryCase_ = 0;
      logEntry_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.CloudLoggingEntry,
            com.google.cloud.securitycenter.v1.CloudLoggingEntry.Builder,
            com.google.cloud.securitycenter.v1.CloudLoggingEntryOrBuilder>
        cloudLoggingEntryBuilder_;
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     *
     * @return Whether the cloudLoggingEntry field is set.
     */
    @java.lang.Override
    public boolean hasCloudLoggingEntry() {
      return logEntryCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     *
     * @return The cloudLoggingEntry.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudLoggingEntry getCloudLoggingEntry() {
      if (cloudLoggingEntryBuilder_ == null) {
        if (logEntryCase_ == 1) {
          return (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_;
        }
        return com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
      } else {
        if (logEntryCase_ == 1) {
          return cloudLoggingEntryBuilder_.getMessage();
        }
        return com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    public Builder setCloudLoggingEntry(
        com.google.cloud.securitycenter.v1.CloudLoggingEntry value) {
      if (cloudLoggingEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        logEntry_ = value;
        onChanged();
      } else {
        cloudLoggingEntryBuilder_.setMessage(value);
      }
      logEntryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    public Builder setCloudLoggingEntry(
        com.google.cloud.securitycenter.v1.CloudLoggingEntry.Builder builderForValue) {
      if (cloudLoggingEntryBuilder_ == null) {
        logEntry_ = builderForValue.build();
        onChanged();
      } else {
        cloudLoggingEntryBuilder_.setMessage(builderForValue.build());
      }
      logEntryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    public Builder mergeCloudLoggingEntry(
        com.google.cloud.securitycenter.v1.CloudLoggingEntry value) {
      if (cloudLoggingEntryBuilder_ == null) {
        if (logEntryCase_ == 1
            && logEntry_
                != com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance()) {
          logEntry_ =
              com.google.cloud.securitycenter.v1.CloudLoggingEntry.newBuilder(
                      (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          logEntry_ = value;
        }
        onChanged();
      } else {
        if (logEntryCase_ == 1) {
          cloudLoggingEntryBuilder_.mergeFrom(value);
        } else {
          cloudLoggingEntryBuilder_.setMessage(value);
        }
      }
      logEntryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    public Builder clearCloudLoggingEntry() {
      if (cloudLoggingEntryBuilder_ == null) {
        if (logEntryCase_ == 1) {
          logEntryCase_ = 0;
          logEntry_ = null;
          onChanged();
        }
      } else {
        if (logEntryCase_ == 1) {
          logEntryCase_ = 0;
          logEntry_ = null;
        }
        cloudLoggingEntryBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.CloudLoggingEntry.Builder
        getCloudLoggingEntryBuilder() {
      return getCloudLoggingEntryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CloudLoggingEntryOrBuilder
        getCloudLoggingEntryOrBuilder() {
      if ((logEntryCase_ == 1) && (cloudLoggingEntryBuilder_ != null)) {
        return cloudLoggingEntryBuilder_.getMessageOrBuilder();
      } else {
        if (logEntryCase_ == 1) {
          return (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_;
        }
        return com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An individual entry in a log stored in Cloud Logging.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.CloudLoggingEntry cloud_logging_entry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.CloudLoggingEntry,
            com.google.cloud.securitycenter.v1.CloudLoggingEntry.Builder,
            com.google.cloud.securitycenter.v1.CloudLoggingEntryOrBuilder>
        getCloudLoggingEntryFieldBuilder() {
      if (cloudLoggingEntryBuilder_ == null) {
        if (!(logEntryCase_ == 1)) {
          logEntry_ = com.google.cloud.securitycenter.v1.CloudLoggingEntry.getDefaultInstance();
        }
        cloudLoggingEntryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.CloudLoggingEntry,
                com.google.cloud.securitycenter.v1.CloudLoggingEntry.Builder,
                com.google.cloud.securitycenter.v1.CloudLoggingEntryOrBuilder>(
                (com.google.cloud.securitycenter.v1.CloudLoggingEntry) logEntry_,
                getParentForChildren(),
                isClean());
        logEntry_ = null;
      }
      logEntryCase_ = 1;
      onChanged();
      return cloudLoggingEntryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.LogEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.LogEntry)
  private static final com.google.cloud.securitycenter.v1.LogEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.LogEntry();
  }

  public static com.google.cloud.securitycenter.v1.LogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogEntry> PARSER =
      new com.google.protobuf.AbstractParser<LogEntry>() {
        @java.lang.Override
        public LogEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.LogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
