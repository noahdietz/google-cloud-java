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
// source: google/cloud/dataplex/v1/metadata.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Describes the access mechanism of the data within its storage location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.StorageAccess}
 */
public final class StorageAccess extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.StorageAccess)
    StorageAccessOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StorageAccess.newBuilder() to construct.
  private StorageAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StorageAccess() {
    read_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StorageAccess();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_StorageAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.StorageAccess.class,
            com.google.cloud.dataplex.v1.StorageAccess.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Access Mode determines how data stored within the Entity is read.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataplex.v1.StorageAccess.AccessMode}
   */
  public enum AccessMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Access mode unspecified.
     * </pre>
     *
     * <code>ACCESS_MODE_UNSPECIFIED = 0;</code>
     */
    ACCESS_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Default. Data is accessed directly using storage APIs.
     * </pre>
     *
     * <code>DIRECT = 1;</code>
     */
    DIRECT(1),
    /**
     *
     *
     * <pre>
     * Data is accessed through a managed interface using BigQuery APIs.
     * </pre>
     *
     * <code>MANAGED = 2;</code>
     */
    MANAGED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Access mode unspecified.
     * </pre>
     *
     * <code>ACCESS_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int ACCESS_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Default. Data is accessed directly using storage APIs.
     * </pre>
     *
     * <code>DIRECT = 1;</code>
     */
    public static final int DIRECT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Data is accessed through a managed interface using BigQuery APIs.
     * </pre>
     *
     * <code>MANAGED = 2;</code>
     */
    public static final int MANAGED_VALUE = 2;

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
    public static AccessMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccessMode forNumber(int value) {
      switch (value) {
        case 0:
          return ACCESS_MODE_UNSPECIFIED;
        case 1:
          return DIRECT;
        case 2:
          return MANAGED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccessMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AccessMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AccessMode>() {
          public AccessMode findValueByNumber(int number) {
            return AccessMode.forNumber(number);
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
      return com.google.cloud.dataplex.v1.StorageAccess.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccessMode[] VALUES = values();

    public static AccessMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AccessMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataplex.v1.StorageAccess.AccessMode)
  }

  public static final int READ_FIELD_NUMBER = 21;
  private int read_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Describes the read access mechanism of the data. Not user
   * settable.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for read.
   */
  @java.lang.Override
  public int getReadValue() {
    return read_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Describes the read access mechanism of the data. Not user
   * settable.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The read.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.StorageAccess.AccessMode getRead() {
    com.google.cloud.dataplex.v1.StorageAccess.AccessMode result =
        com.google.cloud.dataplex.v1.StorageAccess.AccessMode.forNumber(read_);
    return result == null
        ? com.google.cloud.dataplex.v1.StorageAccess.AccessMode.UNRECOGNIZED
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
    if (read_
        != com.google.cloud.dataplex.v1.StorageAccess.AccessMode.ACCESS_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(21, read_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (read_
        != com.google.cloud.dataplex.v1.StorageAccess.AccessMode.ACCESS_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(21, read_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.StorageAccess)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.StorageAccess other =
        (com.google.cloud.dataplex.v1.StorageAccess) obj;

    if (read_ != other.read_) return false;
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
    hash = (37 * hash) + READ_FIELD_NUMBER;
    hash = (53 * hash) + read_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.StorageAccess parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.StorageAccess prototype) {
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
   * Describes the access mechanism of the data within its storage location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.StorageAccess}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.StorageAccess)
      com.google.cloud.dataplex.v1.StorageAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_StorageAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.StorageAccess.class,
              com.google.cloud.dataplex.v1.StorageAccess.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.StorageAccess.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      read_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_StorageAccess_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.StorageAccess getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.StorageAccess.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.StorageAccess build() {
      com.google.cloud.dataplex.v1.StorageAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.StorageAccess buildPartial() {
      com.google.cloud.dataplex.v1.StorageAccess result =
          new com.google.cloud.dataplex.v1.StorageAccess(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.StorageAccess result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.read_ = read_;
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
      if (other instanceof com.google.cloud.dataplex.v1.StorageAccess) {
        return mergeFrom((com.google.cloud.dataplex.v1.StorageAccess) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.StorageAccess other) {
      if (other == com.google.cloud.dataplex.v1.StorageAccess.getDefaultInstance()) return this;
      if (other.read_ != 0) {
        setReadValue(other.getReadValue());
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
            case 168:
              {
                read_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 168
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

    private int read_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Describes the read access mechanism of the data. Not user
     * settable.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for read.
     */
    @java.lang.Override
    public int getReadValue() {
      return read_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Describes the read access mechanism of the data. Not user
     * settable.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for read to set.
     * @return This builder for chaining.
     */
    public Builder setReadValue(int value) {
      read_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Describes the read access mechanism of the data. Not user
     * settable.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The read.
     */
    @java.lang.Override
    public com.google.cloud.dataplex.v1.StorageAccess.AccessMode getRead() {
      com.google.cloud.dataplex.v1.StorageAccess.AccessMode result =
          com.google.cloud.dataplex.v1.StorageAccess.AccessMode.forNumber(read_);
      return result == null
          ? com.google.cloud.dataplex.v1.StorageAccess.AccessMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Describes the read access mechanism of the data. Not user
     * settable.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The read to set.
     * @return This builder for chaining.
     */
    public Builder setRead(com.google.cloud.dataplex.v1.StorageAccess.AccessMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      read_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Describes the read access mechanism of the data. Not user
     * settable.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.StorageAccess.AccessMode read = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRead() {
      bitField0_ = (bitField0_ & ~0x00000001);
      read_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.StorageAccess)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.StorageAccess)
  private static final com.google.cloud.dataplex.v1.StorageAccess DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.StorageAccess();
  }

  public static com.google.cloud.dataplex.v1.StorageAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageAccess> PARSER =
      new com.google.protobuf.AbstractParser<StorageAccess>() {
        @java.lang.Override
        public StorageAccess parsePartialFrom(
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

  public static com.google.protobuf.Parser<StorageAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageAccess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.StorageAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
