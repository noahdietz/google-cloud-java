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
// source: google/devtools/clouddebugger/v2/controller.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Response for registering a debuggee.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.RegisterDebuggeeResponse}
 */
public final class RegisterDebuggeeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.RegisterDebuggeeResponse)
    RegisterDebuggeeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RegisterDebuggeeResponse.newBuilder() to construct.
  private RegisterDebuggeeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegisterDebuggeeResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegisterDebuggeeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouddebugger.v2.ControllerProto
        .internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.ControllerProto
        .internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.class,
            com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DEBUGGEE_FIELD_NUMBER = 1;
  private com.google.devtools.clouddebugger.v2.Debuggee debuggee_;
  /**
   *
   *
   * <pre>
   * Debuggee resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fields).
   * If the field `is_disabled` is set to `true`, the agent should disable
   * itself by removing all breakpoints and detaching from the application.
   * It should however continue to poll `RegisterDebuggee` until reenabled.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
   *
   * @return Whether the debuggee field is set.
   */
  @java.lang.Override
  public boolean hasDebuggee() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Debuggee resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fields).
   * If the field `is_disabled` is set to `true`, the agent should disable
   * itself by removing all breakpoints and detaching from the application.
   * It should however continue to poll `RegisterDebuggee` until reenabled.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
   *
   * @return The debuggee.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.Debuggee getDebuggee() {
    return debuggee_ == null
        ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance()
        : debuggee_;
  }
  /**
   *
   *
   * <pre>
   * Debuggee resource.
   * The field `id` is guaranteed to be set (in addition to the echoed fields).
   * If the field `is_disabled` is set to `true`, the agent should disable
   * itself by removing all breakpoints and detaching from the application.
   * It should however continue to poll `RegisterDebuggee` until reenabled.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeeOrBuilder() {
    return debuggee_ == null
        ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance()
        : debuggee_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getDebuggee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDebuggee());
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse other =
        (com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse) obj;

    if (hasDebuggee() != other.hasDebuggee()) return false;
    if (hasDebuggee()) {
      if (!getDebuggee().equals(other.getDebuggee())) return false;
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
    if (hasDebuggee()) {
      hash = (37 * hash) + DEBUGGEE_FIELD_NUMBER;
      hash = (53 * hash) + getDebuggee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse parseFrom(
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
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse prototype) {
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
   * Response for registering a debuggee.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.RegisterDebuggeeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.RegisterDebuggeeResponse)
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.ControllerProto
          .internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.ControllerProto
          .internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.class,
              com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDebuggeeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      debuggee_ = null;
      if (debuggeeBuilder_ != null) {
        debuggeeBuilder_.dispose();
        debuggeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.ControllerProto
          .internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse
        getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse build() {
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse buildPartial() {
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse result =
          new com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.debuggee_ = debuggeeBuilder_ == null ? debuggee_ : debuggeeBuilder_.build();
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
      if (other instanceof com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse other) {
      if (other
          == com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.getDefaultInstance())
        return this;
      if (other.hasDebuggee()) {
        mergeDebuggee(other.getDebuggee());
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
                input.readMessage(getDebuggeeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.devtools.clouddebugger.v2.Debuggee debuggee_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Debuggee,
            com.google.devtools.clouddebugger.v2.Debuggee.Builder,
            com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
        debuggeeBuilder_;
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     *
     * @return Whether the debuggee field is set.
     */
    public boolean hasDebuggee() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     *
     * @return The debuggee.
     */
    public com.google.devtools.clouddebugger.v2.Debuggee getDebuggee() {
      if (debuggeeBuilder_ == null) {
        return debuggee_ == null
            ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance()
            : debuggee_;
      } else {
        return debuggeeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public Builder setDebuggee(com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        debuggee_ = value;
      } else {
        debuggeeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public Builder setDebuggee(
        com.google.devtools.clouddebugger.v2.Debuggee.Builder builderForValue) {
      if (debuggeeBuilder_ == null) {
        debuggee_ = builderForValue.build();
      } else {
        debuggeeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public Builder mergeDebuggee(com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && debuggee_ != null
            && debuggee_ != com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance()) {
          getDebuggeeBuilder().mergeFrom(value);
        } else {
          debuggee_ = value;
        }
      } else {
        debuggeeBuilder_.mergeFrom(value);
      }
      if (debuggee_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public Builder clearDebuggee() {
      bitField0_ = (bitField0_ & ~0x00000001);
      debuggee_ = null;
      if (debuggeeBuilder_ != null) {
        debuggeeBuilder_.dispose();
        debuggeeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee.Builder getDebuggeeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDebuggeeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeeOrBuilder() {
      if (debuggeeBuilder_ != null) {
        return debuggeeBuilder_.getMessageOrBuilder();
      } else {
        return debuggee_ == null
            ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance()
            : debuggee_;
      }
    }
    /**
     *
     *
     * <pre>
     * Debuggee resource.
     * The field `id` is guaranteed to be set (in addition to the echoed fields).
     * If the field `is_disabled` is set to `true`, the agent should disable
     * itself by removing all breakpoints and detaching from the application.
     * It should however continue to poll `RegisterDebuggee` until reenabled.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Debuggee,
            com.google.devtools.clouddebugger.v2.Debuggee.Builder,
            com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
        getDebuggeeFieldBuilder() {
      if (debuggeeBuilder_ == null) {
        debuggeeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.clouddebugger.v2.Debuggee,
                com.google.devtools.clouddebugger.v2.Debuggee.Builder,
                com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>(
                getDebuggee(), getParentForChildren(), isClean());
        debuggee_ = null;
      }
      return debuggeeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.RegisterDebuggeeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.RegisterDebuggeeResponse)
  private static final com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse();
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterDebuggeeResponse> PARSER =
      new com.google.protobuf.AbstractParser<RegisterDebuggeeResponse>() {
        @java.lang.Override
        public RegisterDebuggeeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterDebuggeeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterDebuggeeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
