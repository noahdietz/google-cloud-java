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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.FileContentBuffer}
 */
public final class FileContentBuffer extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.FileContentBuffer)
    FileContentBufferOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FileContentBuffer.newBuilder() to construct.
  private FileContentBuffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FileContentBuffer() {
    content_ = "";
    fileType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FileContentBuffer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_FileContentBuffer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_FileContentBuffer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.FileContentBuffer.class,
            com.google.cloud.compute.v1.FileContentBuffer.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The file type of source file.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.FileContentBuffer.FileType}
   */
  public enum FileType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_FILE_TYPE = 0;</code>
     */
    UNDEFINED_FILE_TYPE(0),
    /** <code>BIN = 65767;</code> */
    BIN(65767),
    /** <code>UNDEFINED = 137851184;</code> */
    UNDEFINED(137851184),
    /** <code>X509 = 2674086;</code> */
    X509(2674086),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_FILE_TYPE = 0;</code>
     */
    public static final int UNDEFINED_FILE_TYPE_VALUE = 0;
    /** <code>BIN = 65767;</code> */
    public static final int BIN_VALUE = 65767;
    /** <code>UNDEFINED = 137851184;</code> */
    public static final int UNDEFINED_VALUE = 137851184;
    /** <code>X509 = 2674086;</code> */
    public static final int X509_VALUE = 2674086;

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
    public static FileType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FileType forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_FILE_TYPE;
        case 65767:
          return BIN;
        case 137851184:
          return UNDEFINED;
        case 2674086:
          return X509;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FileType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<FileType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
          public FileType findValueByNumber(int number) {
            return FileType.forNumber(number);
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
      return com.google.cloud.compute.v1.FileContentBuffer.getDescriptor().getEnumTypes().get(0);
    }

    private static final FileType[] VALUES = values();

    public static FileType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FileType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.FileContentBuffer.FileType)
  }

  private int bitField0_;
  public static final int CONTENT_FIELD_NUMBER = 414659705;

  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   *
   *
   * <pre>
   * The raw content in the secure keys file.
   * </pre>
   *
   * <code>optional string content = 414659705;</code>
   *
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The raw content in the secure keys file.
   * </pre>
   *
   * <code>optional string content = 414659705;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The raw content in the secure keys file.
   * </pre>
   *
   * <code>optional string content = 414659705;</code>
   *
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_TYPE_FIELD_NUMBER = 294346781;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fileType_ = "";
  /**
   *
   *
   * <pre>
   * The file type of source file.
   * Check the FileType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string file_type = 294346781;</code>
   *
   * @return Whether the fileType field is set.
   */
  @java.lang.Override
  public boolean hasFileType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The file type of source file.
   * Check the FileType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string file_type = 294346781;</code>
   *
   * @return The fileType.
   */
  @java.lang.Override
  public java.lang.String getFileType() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The file type of source file.
   * Check the FileType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string file_type = 294346781;</code>
   *
   * @return The bytes for fileType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFileTypeBytes() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fileType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 294346781, fileType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 414659705, content_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(294346781, fileType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(414659705, content_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.FileContentBuffer)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.FileContentBuffer other =
        (com.google.cloud.compute.v1.FileContentBuffer) obj;

    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent().equals(other.getContent())) return false;
    }
    if (hasFileType() != other.hasFileType()) return false;
    if (hasFileType()) {
      if (!getFileType().equals(other.getFileType())) return false;
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
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    if (hasFileType()) {
      hash = (37 * hash) + FILE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFileType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.FileContentBuffer parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.FileContentBuffer prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.FileContentBuffer}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.FileContentBuffer)
      com.google.cloud.compute.v1.FileContentBufferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FileContentBuffer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FileContentBuffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.FileContentBuffer.class,
              com.google.cloud.compute.v1.FileContentBuffer.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.FileContentBuffer.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      content_ = "";
      fileType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_FileContentBuffer_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FileContentBuffer getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.FileContentBuffer.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FileContentBuffer build() {
      com.google.cloud.compute.v1.FileContentBuffer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FileContentBuffer buildPartial() {
      com.google.cloud.compute.v1.FileContentBuffer result =
          new com.google.cloud.compute.v1.FileContentBuffer(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.FileContentBuffer result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileType_ = fileType_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.FileContentBuffer) {
        return mergeFrom((com.google.cloud.compute.v1.FileContentBuffer) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.FileContentBuffer other) {
      if (other == com.google.cloud.compute.v1.FileContentBuffer.getDefaultInstance()) return this;
      if (other.hasContent()) {
        content_ = other.content_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFileType()) {
        fileType_ = other.fileType_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case -1940193046:
              {
                fileType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1940193046
            case -977689654:
              {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -977689654
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

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The raw content in the secure keys file.
     * </pre>
     *
     * <code>optional string content = 414659705;</code>
     *
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fileType_ = "";
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @return Whether the fileType field is set.
     */
    public boolean hasFileType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @return The fileType.
     */
    public java.lang.String getFileType() {
      java.lang.Object ref = fileType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @return The bytes for fileType.
     */
    public com.google.protobuf.ByteString getFileTypeBytes() {
      java.lang.Object ref = fileType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fileType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @param value The fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fileType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFileType() {
      fileType_ = getDefaultInstance().getFileType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The file type of source file.
     * Check the FileType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string file_type = 294346781;</code>
     *
     * @param value The bytes for fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fileType_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.FileContentBuffer)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.FileContentBuffer)
  private static final com.google.cloud.compute.v1.FileContentBuffer DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.FileContentBuffer();
  }

  public static com.google.cloud.compute.v1.FileContentBuffer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileContentBuffer> PARSER =
      new com.google.protobuf.AbstractParser<FileContentBuffer>() {
        @java.lang.Override
        public FileContentBuffer parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileContentBuffer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileContentBuffer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.FileContentBuffer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
