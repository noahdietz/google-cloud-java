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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Request to search for potentially sensitive info in a custom location.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.HybridInspectDlpJobRequest}
 */
public final class HybridInspectDlpJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.HybridInspectDlpJobRequest)
    HybridInspectDlpJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HybridInspectDlpJobRequest.newBuilder() to construct.
  private HybridInspectDlpJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HybridInspectDlpJobRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HybridInspectDlpJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_HybridInspectDlpJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_HybridInspectDlpJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.class,
            com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the job to execute a hybrid inspect on, for
   * example `projects/dlp-test-project/dlpJob/53234423`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the job to execute a hybrid inspect on, for
   * example `projects/dlp-test-project/dlpJob/53234423`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HYBRID_ITEM_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.HybridContentItem hybridItem_;
  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   *
   * @return Whether the hybridItem field is set.
   */
  @java.lang.Override
  public boolean hasHybridItem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   *
   * @return The hybridItem.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridContentItem getHybridItem() {
    return hybridItem_ == null
        ? com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()
        : hybridItem_;
  }
  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridContentItemOrBuilder getHybridItemOrBuilder() {
    return hybridItem_ == null
        ? com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()
        : hybridItem_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getHybridItem());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getHybridItem());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.HybridInspectDlpJobRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.HybridInspectDlpJobRequest other =
        (com.google.privacy.dlp.v2.HybridInspectDlpJobRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasHybridItem() != other.hasHybridItem()) return false;
    if (hasHybridItem()) {
      if (!getHybridItem().equals(other.getHybridItem())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasHybridItem()) {
      hash = (37 * hash) + HYBRID_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getHybridItem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.HybridInspectDlpJobRequest prototype) {
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
   * Request to search for potentially sensitive info in a custom location.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.HybridInspectDlpJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.HybridInspectDlpJobRequest)
      com.google.privacy.dlp.v2.HybridInspectDlpJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridInspectDlpJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridInspectDlpJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.class,
              com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHybridItemFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      hybridItem_ = null;
      if (hybridItemBuilder_ != null) {
        hybridItemBuilder_.dispose();
        hybridItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridInspectDlpJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridInspectDlpJobRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridInspectDlpJobRequest build() {
      com.google.privacy.dlp.v2.HybridInspectDlpJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridInspectDlpJobRequest buildPartial() {
      com.google.privacy.dlp.v2.HybridInspectDlpJobRequest result =
          new com.google.privacy.dlp.v2.HybridInspectDlpJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.HybridInspectDlpJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hybridItem_ = hybridItemBuilder_ == null ? hybridItem_ : hybridItemBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.privacy.dlp.v2.HybridInspectDlpJobRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.HybridInspectDlpJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.HybridInspectDlpJobRequest other) {
      if (other == com.google.privacy.dlp.v2.HybridInspectDlpJobRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHybridItem()) {
        mergeHybridItem(other.getHybridItem());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(getHybridItemFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the job to execute a hybrid inspect on, for
     * example `projects/dlp-test-project/dlpJob/53234423`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the job to execute a hybrid inspect on, for
     * example `projects/dlp-test-project/dlpJob/53234423`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the job to execute a hybrid inspect on, for
     * example `projects/dlp-test-project/dlpJob/53234423`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the job to execute a hybrid inspect on, for
     * example `projects/dlp-test-project/dlpJob/53234423`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the job to execute a hybrid inspect on, for
     * example `projects/dlp-test-project/dlpJob/53234423`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.HybridContentItem hybridItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.HybridContentItem,
            com.google.privacy.dlp.v2.HybridContentItem.Builder,
            com.google.privacy.dlp.v2.HybridContentItemOrBuilder>
        hybridItemBuilder_;
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     *
     * @return Whether the hybridItem field is set.
     */
    public boolean hasHybridItem() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     *
     * @return The hybridItem.
     */
    public com.google.privacy.dlp.v2.HybridContentItem getHybridItem() {
      if (hybridItemBuilder_ == null) {
        return hybridItem_ == null
            ? com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()
            : hybridItem_;
      } else {
        return hybridItemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public Builder setHybridItem(com.google.privacy.dlp.v2.HybridContentItem value) {
      if (hybridItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hybridItem_ = value;
      } else {
        hybridItemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public Builder setHybridItem(
        com.google.privacy.dlp.v2.HybridContentItem.Builder builderForValue) {
      if (hybridItemBuilder_ == null) {
        hybridItem_ = builderForValue.build();
      } else {
        hybridItemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public Builder mergeHybridItem(com.google.privacy.dlp.v2.HybridContentItem value) {
      if (hybridItemBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && hybridItem_ != null
            && hybridItem_ != com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()) {
          getHybridItemBuilder().mergeFrom(value);
        } else {
          hybridItem_ = value;
        }
      } else {
        hybridItemBuilder_.mergeFrom(value);
      }
      if (hybridItem_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public Builder clearHybridItem() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hybridItem_ = null;
      if (hybridItemBuilder_ != null) {
        hybridItemBuilder_.dispose();
        hybridItemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public com.google.privacy.dlp.v2.HybridContentItem.Builder getHybridItemBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHybridItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    public com.google.privacy.dlp.v2.HybridContentItemOrBuilder getHybridItemOrBuilder() {
      if (hybridItemBuilder_ != null) {
        return hybridItemBuilder_.getMessageOrBuilder();
      } else {
        return hybridItem_ == null
            ? com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()
            : hybridItem_;
      }
    }
    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.HybridContentItem,
            com.google.privacy.dlp.v2.HybridContentItem.Builder,
            com.google.privacy.dlp.v2.HybridContentItemOrBuilder>
        getHybridItemFieldBuilder() {
      if (hybridItemBuilder_ == null) {
        hybridItemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.HybridContentItem,
                com.google.privacy.dlp.v2.HybridContentItem.Builder,
                com.google.privacy.dlp.v2.HybridContentItemOrBuilder>(
                getHybridItem(), getParentForChildren(), isClean());
        hybridItem_ = null;
      }
      return hybridItemBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.HybridInspectDlpJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.HybridInspectDlpJobRequest)
  private static final com.google.privacy.dlp.v2.HybridInspectDlpJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.HybridInspectDlpJobRequest();
  }

  public static com.google.privacy.dlp.v2.HybridInspectDlpJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HybridInspectDlpJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<HybridInspectDlpJobRequest>() {
        @java.lang.Override
        public HybridInspectDlpJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<HybridInspectDlpJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HybridInspectDlpJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridInspectDlpJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
