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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Target scaling by disk usage.
 * Only applicable in the App Engine flexible environment.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.DiskUtilization}
 */
public final class DiskUtilization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.DiskUtilization)
    DiskUtilizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiskUtilization.newBuilder() to construct.
  private DiskUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiskUtilization() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiskUtilization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_DiskUtilization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.DiskUtilization.class,
            com.google.appengine.v1.DiskUtilization.Builder.class);
  }

  public static final int TARGET_WRITE_BYTES_PER_SECOND_FIELD_NUMBER = 14;
  private int targetWriteBytesPerSecond_ = 0;
  /**
   *
   *
   * <pre>
   * Target bytes written per second.
   * </pre>
   *
   * <code>int32 target_write_bytes_per_second = 14;</code>
   *
   * @return The targetWriteBytesPerSecond.
   */
  @java.lang.Override
  public int getTargetWriteBytesPerSecond() {
    return targetWriteBytesPerSecond_;
  }

  public static final int TARGET_WRITE_OPS_PER_SECOND_FIELD_NUMBER = 15;
  private int targetWriteOpsPerSecond_ = 0;
  /**
   *
   *
   * <pre>
   * Target ops written per second.
   * </pre>
   *
   * <code>int32 target_write_ops_per_second = 15;</code>
   *
   * @return The targetWriteOpsPerSecond.
   */
  @java.lang.Override
  public int getTargetWriteOpsPerSecond() {
    return targetWriteOpsPerSecond_;
  }

  public static final int TARGET_READ_BYTES_PER_SECOND_FIELD_NUMBER = 16;
  private int targetReadBytesPerSecond_ = 0;
  /**
   *
   *
   * <pre>
   * Target bytes read per second.
   * </pre>
   *
   * <code>int32 target_read_bytes_per_second = 16;</code>
   *
   * @return The targetReadBytesPerSecond.
   */
  @java.lang.Override
  public int getTargetReadBytesPerSecond() {
    return targetReadBytesPerSecond_;
  }

  public static final int TARGET_READ_OPS_PER_SECOND_FIELD_NUMBER = 17;
  private int targetReadOpsPerSecond_ = 0;
  /**
   *
   *
   * <pre>
   * Target ops read per seconds.
   * </pre>
   *
   * <code>int32 target_read_ops_per_second = 17;</code>
   *
   * @return The targetReadOpsPerSecond.
   */
  @java.lang.Override
  public int getTargetReadOpsPerSecond() {
    return targetReadOpsPerSecond_;
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
    if (targetWriteBytesPerSecond_ != 0) {
      output.writeInt32(14, targetWriteBytesPerSecond_);
    }
    if (targetWriteOpsPerSecond_ != 0) {
      output.writeInt32(15, targetWriteOpsPerSecond_);
    }
    if (targetReadBytesPerSecond_ != 0) {
      output.writeInt32(16, targetReadBytesPerSecond_);
    }
    if (targetReadOpsPerSecond_ != 0) {
      output.writeInt32(17, targetReadOpsPerSecond_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetWriteBytesPerSecond_ != 0) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(14, targetWriteBytesPerSecond_);
    }
    if (targetWriteOpsPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(15, targetWriteOpsPerSecond_);
    }
    if (targetReadBytesPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(16, targetReadBytesPerSecond_);
    }
    if (targetReadOpsPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(17, targetReadOpsPerSecond_);
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
    if (!(obj instanceof com.google.appengine.v1.DiskUtilization)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.DiskUtilization other = (com.google.appengine.v1.DiskUtilization) obj;

    if (getTargetWriteBytesPerSecond() != other.getTargetWriteBytesPerSecond()) return false;
    if (getTargetWriteOpsPerSecond() != other.getTargetWriteOpsPerSecond()) return false;
    if (getTargetReadBytesPerSecond() != other.getTargetReadBytesPerSecond()) return false;
    if (getTargetReadOpsPerSecond() != other.getTargetReadOpsPerSecond()) return false;
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
    hash = (37 * hash) + TARGET_WRITE_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetWriteBytesPerSecond();
    hash = (37 * hash) + TARGET_WRITE_OPS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetWriteOpsPerSecond();
    hash = (37 * hash) + TARGET_READ_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetReadBytesPerSecond();
    hash = (37 * hash) + TARGET_READ_OPS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetReadOpsPerSecond();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.DiskUtilization parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DiskUtilization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.DiskUtilization prototype) {
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
   * Target scaling by disk usage.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.DiskUtilization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.DiskUtilization)
      com.google.appengine.v1.DiskUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_DiskUtilization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.DiskUtilization.class,
              com.google.appengine.v1.DiskUtilization.Builder.class);
    }

    // Construct using com.google.appengine.v1.DiskUtilization.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetWriteBytesPerSecond_ = 0;
      targetWriteOpsPerSecond_ = 0;
      targetReadBytesPerSecond_ = 0;
      targetReadOpsPerSecond_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_DiskUtilization_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.DiskUtilization getDefaultInstanceForType() {
      return com.google.appengine.v1.DiskUtilization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.DiskUtilization build() {
      com.google.appengine.v1.DiskUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.DiskUtilization buildPartial() {
      com.google.appengine.v1.DiskUtilization result =
          new com.google.appengine.v1.DiskUtilization(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.DiskUtilization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetWriteBytesPerSecond_ = targetWriteBytesPerSecond_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetWriteOpsPerSecond_ = targetWriteOpsPerSecond_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.targetReadBytesPerSecond_ = targetReadBytesPerSecond_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.targetReadOpsPerSecond_ = targetReadOpsPerSecond_;
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
      if (other instanceof com.google.appengine.v1.DiskUtilization) {
        return mergeFrom((com.google.appengine.v1.DiskUtilization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.DiskUtilization other) {
      if (other == com.google.appengine.v1.DiskUtilization.getDefaultInstance()) return this;
      if (other.getTargetWriteBytesPerSecond() != 0) {
        setTargetWriteBytesPerSecond(other.getTargetWriteBytesPerSecond());
      }
      if (other.getTargetWriteOpsPerSecond() != 0) {
        setTargetWriteOpsPerSecond(other.getTargetWriteOpsPerSecond());
      }
      if (other.getTargetReadBytesPerSecond() != 0) {
        setTargetReadBytesPerSecond(other.getTargetReadBytesPerSecond());
      }
      if (other.getTargetReadOpsPerSecond() != 0) {
        setTargetReadOpsPerSecond(other.getTargetReadOpsPerSecond());
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
            case 112:
              {
                targetWriteBytesPerSecond_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
            case 120:
              {
                targetWriteOpsPerSecond_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
            case 128:
              {
                targetReadBytesPerSecond_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 128
            case 136:
              {
                targetReadOpsPerSecond_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 136
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

    private int targetWriteBytesPerSecond_;
    /**
     *
     *
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     *
     * @return The targetWriteBytesPerSecond.
     */
    @java.lang.Override
    public int getTargetWriteBytesPerSecond() {
      return targetWriteBytesPerSecond_;
    }
    /**
     *
     *
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     *
     * @param value The targetWriteBytesPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setTargetWriteBytesPerSecond(int value) {

      targetWriteBytesPerSecond_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetWriteBytesPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetWriteBytesPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetWriteOpsPerSecond_;
    /**
     *
     *
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     *
     * @return The targetWriteOpsPerSecond.
     */
    @java.lang.Override
    public int getTargetWriteOpsPerSecond() {
      return targetWriteOpsPerSecond_;
    }
    /**
     *
     *
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     *
     * @param value The targetWriteOpsPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setTargetWriteOpsPerSecond(int value) {

      targetWriteOpsPerSecond_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetWriteOpsPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetWriteOpsPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetReadBytesPerSecond_;
    /**
     *
     *
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     *
     * @return The targetReadBytesPerSecond.
     */
    @java.lang.Override
    public int getTargetReadBytesPerSecond() {
      return targetReadBytesPerSecond_;
    }
    /**
     *
     *
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     *
     * @param value The targetReadBytesPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setTargetReadBytesPerSecond(int value) {

      targetReadBytesPerSecond_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetReadBytesPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000004);
      targetReadBytesPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetReadOpsPerSecond_;
    /**
     *
     *
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     *
     * @return The targetReadOpsPerSecond.
     */
    @java.lang.Override
    public int getTargetReadOpsPerSecond() {
      return targetReadOpsPerSecond_;
    }
    /**
     *
     *
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     *
     * @param value The targetReadOpsPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setTargetReadOpsPerSecond(int value) {

      targetReadOpsPerSecond_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetReadOpsPerSecond() {
      bitField0_ = (bitField0_ & ~0x00000008);
      targetReadOpsPerSecond_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.DiskUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.DiskUtilization)
  private static final com.google.appengine.v1.DiskUtilization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.DiskUtilization();
  }

  public static com.google.appengine.v1.DiskUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskUtilization> PARSER =
      new com.google.protobuf.AbstractParser<DiskUtilization>() {
        @java.lang.Override
        public DiskUtilization parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiskUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskUtilization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.DiskUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
