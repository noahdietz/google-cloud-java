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
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * TCPSocketAction describes an action based on opening a socket
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.TCPSocketAction}
 */
public final class TCPSocketAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.TCPSocketAction)
    TCPSocketActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TCPSocketAction.newBuilder() to construct.
  private TCPSocketAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TCPSocketAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TCPSocketAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_TCPSocketAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_TCPSocketAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.TCPSocketAction.class,
            com.google.cloud.run.v2.TCPSocketAction.Builder.class);
  }

  public static final int PORT_FIELD_NUMBER = 1;
  private int port_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Port number to access on the container. Must be in the range 1 to
   * 65535. If not specified, defaults to the exposed port of the container,
   * which is the value of container.ports[0].containerPort.
   * </pre>
   *
   * <code>int32 port = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
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
    if (port_ != 0) {
      output.writeInt32(1, port_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, port_);
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
    if (!(obj instanceof com.google.cloud.run.v2.TCPSocketAction)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.TCPSocketAction other = (com.google.cloud.run.v2.TCPSocketAction) obj;

    if (getPort() != other.getPort()) return false;
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
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.TCPSocketAction parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.TCPSocketAction prototype) {
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
   * TCPSocketAction describes an action based on opening a socket
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.TCPSocketAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.TCPSocketAction)
      com.google.cloud.run.v2.TCPSocketActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_TCPSocketAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_TCPSocketAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.TCPSocketAction.class,
              com.google.cloud.run.v2.TCPSocketAction.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.TCPSocketAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      port_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_TCPSocketAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TCPSocketAction getDefaultInstanceForType() {
      return com.google.cloud.run.v2.TCPSocketAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TCPSocketAction build() {
      com.google.cloud.run.v2.TCPSocketAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.TCPSocketAction buildPartial() {
      com.google.cloud.run.v2.TCPSocketAction result =
          new com.google.cloud.run.v2.TCPSocketAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.TCPSocketAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.port_ = port_;
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
      if (other instanceof com.google.cloud.run.v2.TCPSocketAction) {
        return mergeFrom((com.google.cloud.run.v2.TCPSocketAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.TCPSocketAction other) {
      if (other == com.google.cloud.run.v2.TCPSocketAction.getDefaultInstance()) return this;
      if (other.getPort() != 0) {
        setPort(other.getPort());
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
            case 8:
              {
                port_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int port_;
    /**
     *
     *
     * <pre>
     * Optional. Port number to access on the container. Must be in the range 1 to
     * 65535. If not specified, defaults to the exposed port of the container,
     * which is the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Port number to access on the container. Must be in the range 1 to
     * 65535. If not specified, defaults to the exposed port of the container,
     * which is the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Port number to access on the container. Must be in the range 1 to
     * 65535. If not specified, defaults to the exposed port of the container,
     * which is the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000001);
      port_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.TCPSocketAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.TCPSocketAction)
  private static final com.google.cloud.run.v2.TCPSocketAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.TCPSocketAction();
  }

  public static com.google.cloud.run.v2.TCPSocketAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TCPSocketAction> PARSER =
      new com.google.protobuf.AbstractParser<TCPSocketAction>() {
        @java.lang.Override
        public TCPSocketAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<TCPSocketAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TCPSocketAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.TCPSocketAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
