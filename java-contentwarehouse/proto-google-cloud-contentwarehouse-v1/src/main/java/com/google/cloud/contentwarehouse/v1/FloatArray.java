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
// source: google/cloud/contentwarehouse/v1/document.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Float values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.FloatArray}
 */
public final class FloatArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.FloatArray)
    FloatArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FloatArray.newBuilder() to construct.
  private FloatArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FloatArray() {
    values_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FloatArray();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_FloatArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.FloatArray.class,
            com.google.cloud.contentwarehouse.v1.FloatArray.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList values_ = emptyFloatList();
  /**
   *
   *
   * <pre>
   * List of float values.
   * </pre>
   *
   * <code>repeated float values = 1;</code>
   *
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float> getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * List of float values.
   * </pre>
   *
   * <code>repeated float values = 1;</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * List of float values.
   * </pre>
   *
   * <code>repeated float values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public float getValues(int index) {
    return values_.getFloat(index);
  }

  private int valuesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeFloatNoTag(values_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 4 * getValuesList().size();
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.FloatArray)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.FloatArray other =
        (com.google.cloud.contentwarehouse.v1.FloatArray) obj;

    if (!getValuesList().equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.FloatArray prototype) {
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
   * Float values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.FloatArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.FloatArray)
      com.google.cloud.contentwarehouse.v1.FloatArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_FloatArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.FloatArray.class,
              com.google.cloud.contentwarehouse.v1.FloatArray.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.FloatArray.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      values_ = emptyFloatList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_FloatArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.FloatArray getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.FloatArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.FloatArray build() {
      com.google.cloud.contentwarehouse.v1.FloatArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.FloatArray buildPartial() {
      com.google.cloud.contentwarehouse.v1.FloatArray result =
          new com.google.cloud.contentwarehouse.v1.FloatArray(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.FloatArray result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.FloatArray) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.FloatArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.FloatArray other) {
      if (other == com.google.cloud.contentwarehouse.v1.FloatArray.getDefaultInstance())
        return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          values_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
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
            case 13:
              {
                float v = input.readFloat();
                ensureValuesIsMutable();
                values_.addFloat(v);
                break;
              } // case 13
            case 10:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                int alloc = length > 4096 ? 4096 : length;
                ensureValuesIsMutable(alloc / 4);
                while (input.getBytesUntilLimit() > 0) {
                  values_.addFloat(input.readFloat());
                }
                input.popLimit(limit);
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

    private int bitField0_;

    private com.google.protobuf.Internal.FloatList values_ = emptyFloatList();

    private void ensureValuesIsMutable() {
      if (!values_.isModifiable()) {
        values_ = makeMutableCopy(values_);
      }
      bitField0_ |= 0x00000001;
    }

    private void ensureValuesIsMutable(int capacity) {
      if (!values_.isModifiable()) {
        values_ = makeMutableCopy(values_, capacity);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @return A list containing the values.
     */
    public java.util.List<java.lang.Float> getValuesList() {
      values_.makeImmutable();
      return values_;
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public float getValues(int index) {
      return values_.getFloat(index);
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, float value) {

      ensureValuesIsMutable();
      values_.setFloat(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(float value) {

      ensureValuesIsMutable();
      values_.addFloat(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<? extends java.lang.Float> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of float values.
     * </pre>
     *
     * <code>repeated float values = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.FloatArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.FloatArray)
  private static final com.google.cloud.contentwarehouse.v1.FloatArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.FloatArray();
  }

  public static com.google.cloud.contentwarehouse.v1.FloatArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatArray> PARSER =
      new com.google.protobuf.AbstractParser<FloatArray>() {
        @java.lang.Override
        public FloatArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<FloatArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.FloatArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
