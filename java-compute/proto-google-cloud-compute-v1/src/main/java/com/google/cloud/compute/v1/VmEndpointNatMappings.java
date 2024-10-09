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
 * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.VmEndpointNatMappings}
 */
public final class VmEndpointNatMappings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.VmEndpointNatMappings)
    VmEndpointNatMappingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VmEndpointNatMappings.newBuilder() to construct.
  private VmEndpointNatMappings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VmEndpointNatMappings() {
    instanceName_ = "";
    interfaceNatMappings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VmEndpointNatMappings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VmEndpointNatMappings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VmEndpointNatMappings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.VmEndpointNatMappings.class,
            com.google.cloud.compute.v1.VmEndpointNatMappings.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_NAME_FIELD_NUMBER = 227947509;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceName_ = "";
  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return Whether the instanceName field is set.
   */
  @java.lang.Override
  public boolean hasInstanceName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return The instanceName.
   */
  @java.lang.Override
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the VM instance which the endpoint belongs to
   * </pre>
   *
   * <code>optional string instance_name = 227947509;</code>
   *
   * @return The bytes for instanceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTERFACE_NAT_MAPPINGS_FIELD_NUMBER = 256196617;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
      interfaceNatMappings_;
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
      getInterfaceNatMappingsList() {
    return interfaceNatMappings_;
  }
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>
      getInterfaceNatMappingsOrBuilderList() {
    return interfaceNatMappings_;
  }
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  @java.lang.Override
  public int getInterfaceNatMappingsCount() {
    return interfaceNatMappings_.size();
  }
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
      getInterfaceNatMappings(int index) {
    return interfaceNatMappings_.get(index);
  }
  /**
   * <code>
   * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder
      getInterfaceNatMappingsOrBuilder(int index) {
    return interfaceNatMappings_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227947509, instanceName_);
    }
    for (int i = 0; i < interfaceNatMappings_.size(); i++) {
      output.writeMessage(256196617, interfaceNatMappings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227947509, instanceName_);
    }
    for (int i = 0; i < interfaceNatMappings_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              256196617, interfaceNatMappings_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.VmEndpointNatMappings)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.VmEndpointNatMappings other =
        (com.google.cloud.compute.v1.VmEndpointNatMappings) obj;

    if (hasInstanceName() != other.hasInstanceName()) return false;
    if (hasInstanceName()) {
      if (!getInstanceName().equals(other.getInstanceName())) return false;
    }
    if (!getInterfaceNatMappingsList().equals(other.getInterfaceNatMappingsList())) return false;
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
    if (hasInstanceName()) {
      hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceName().hashCode();
    }
    if (getInterfaceNatMappingsCount() > 0) {
      hash = (37 * hash) + INTERFACE_NAT_MAPPINGS_FIELD_NUMBER;
      hash = (53 * hash) + getInterfaceNatMappingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.VmEndpointNatMappings prototype) {
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
   * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.VmEndpointNatMappings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.VmEndpointNatMappings)
      com.google.cloud.compute.v1.VmEndpointNatMappingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VmEndpointNatMappings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VmEndpointNatMappings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.VmEndpointNatMappings.class,
              com.google.cloud.compute.v1.VmEndpointNatMappings.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.VmEndpointNatMappings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instanceName_ = "";
      if (interfaceNatMappingsBuilder_ == null) {
        interfaceNatMappings_ = java.util.Collections.emptyList();
      } else {
        interfaceNatMappings_ = null;
        interfaceNatMappingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VmEndpointNatMappings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VmEndpointNatMappings getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.VmEndpointNatMappings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VmEndpointNatMappings build() {
      com.google.cloud.compute.v1.VmEndpointNatMappings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VmEndpointNatMappings buildPartial() {
      com.google.cloud.compute.v1.VmEndpointNatMappings result =
          new com.google.cloud.compute.v1.VmEndpointNatMappings(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.VmEndpointNatMappings result) {
      if (interfaceNatMappingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          interfaceNatMappings_ = java.util.Collections.unmodifiableList(interfaceNatMappings_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.interfaceNatMappings_ = interfaceNatMappings_;
      } else {
        result.interfaceNatMappings_ = interfaceNatMappingsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.VmEndpointNatMappings result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceName_ = instanceName_;
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
      if (other instanceof com.google.cloud.compute.v1.VmEndpointNatMappings) {
        return mergeFrom((com.google.cloud.compute.v1.VmEndpointNatMappings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.VmEndpointNatMappings other) {
      if (other == com.google.cloud.compute.v1.VmEndpointNatMappings.getDefaultInstance())
        return this;
      if (other.hasInstanceName()) {
        instanceName_ = other.instanceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (interfaceNatMappingsBuilder_ == null) {
        if (!other.interfaceNatMappings_.isEmpty()) {
          if (interfaceNatMappings_.isEmpty()) {
            interfaceNatMappings_ = other.interfaceNatMappings_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInterfaceNatMappingsIsMutable();
            interfaceNatMappings_.addAll(other.interfaceNatMappings_);
          }
          onChanged();
        }
      } else {
        if (!other.interfaceNatMappings_.isEmpty()) {
          if (interfaceNatMappingsBuilder_.isEmpty()) {
            interfaceNatMappingsBuilder_.dispose();
            interfaceNatMappingsBuilder_ = null;
            interfaceNatMappings_ = other.interfaceNatMappings_;
            bitField0_ = (bitField0_ & ~0x00000002);
            interfaceNatMappingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInterfaceNatMappingsFieldBuilder()
                    : null;
          } else {
            interfaceNatMappingsBuilder_.addAllMessages(other.interfaceNatMappings_);
          }
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
            case 1823580074:
              {
                instanceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1823580074
            case 2049572938:
              {
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings m =
                    input.readMessage(
                        com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
                            .parser(),
                        extensionRegistry);
                if (interfaceNatMappingsBuilder_ == null) {
                  ensureInterfaceNatMappingsIsMutable();
                  interfaceNatMappings_.add(m);
                } else {
                  interfaceNatMappingsBuilder_.addMessage(m);
                }
                break;
              } // case 2049572938
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

    private java.lang.Object instanceName_ = "";
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @return Whether the instanceName field is set.
     */
    public boolean hasInstanceName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @return The instanceName.
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @return The bytes for instanceName.
     */
    public com.google.protobuf.ByteString getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @param value The instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceName() {
      instanceName_ = getDefaultInstance().getInstanceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the VM instance which the endpoint belongs to
     * </pre>
     *
     * <code>optional string instance_name = 227947509;</code>
     *
     * @param value The bytes for instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
        interfaceNatMappings_ = java.util.Collections.emptyList();

    private void ensureInterfaceNatMappingsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        interfaceNatMappings_ =
            new java.util.ArrayList<
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>(
                interfaceNatMappings_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings,
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder,
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>
        interfaceNatMappingsBuilder_;

    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
        getInterfaceNatMappingsList() {
      if (interfaceNatMappingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(interfaceNatMappings_);
      } else {
        return interfaceNatMappingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public int getInterfaceNatMappingsCount() {
      if (interfaceNatMappingsBuilder_ == null) {
        return interfaceNatMappings_.size();
      } else {
        return interfaceNatMappingsBuilder_.getCount();
      }
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
        getInterfaceNatMappings(int index) {
      if (interfaceNatMappingsBuilder_ == null) {
        return interfaceNatMappings_.get(index);
      } else {
        return interfaceNatMappingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder setInterfaceNatMappings(
        int index, com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings value) {
      if (interfaceNatMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.set(index, value);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder setInterfaceNatMappings(
        int index,
        com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
            builderForValue) {
      if (interfaceNatMappingsBuilder_ == null) {
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.set(index, builderForValue.build());
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder addInterfaceNatMappings(
        com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings value) {
      if (interfaceNatMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.add(value);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder addInterfaceNatMappings(
        int index, com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings value) {
      if (interfaceNatMappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.add(index, value);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder addInterfaceNatMappings(
        com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
            builderForValue) {
      if (interfaceNatMappingsBuilder_ == null) {
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.add(builderForValue.build());
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder addInterfaceNatMappings(
        int index,
        com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
            builderForValue) {
      if (interfaceNatMappingsBuilder_ == null) {
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.add(index, builderForValue.build());
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder addAllInterfaceNatMappings(
        java.lang.Iterable<
                ? extends com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>
            values) {
      if (interfaceNatMappingsBuilder_ == null) {
        ensureInterfaceNatMappingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, interfaceNatMappings_);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder clearInterfaceNatMappings() {
      if (interfaceNatMappingsBuilder_ == null) {
        interfaceNatMappings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public Builder removeInterfaceNatMappings(int index) {
      if (interfaceNatMappingsBuilder_ == null) {
        ensureInterfaceNatMappingsIsMutable();
        interfaceNatMappings_.remove(index);
        onChanged();
      } else {
        interfaceNatMappingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
        getInterfaceNatMappingsBuilder(int index) {
      return getInterfaceNatMappingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder
        getInterfaceNatMappingsOrBuilder(int index) {
      if (interfaceNatMappingsBuilder_ == null) {
        return interfaceNatMappings_.get(index);
      } else {
        return interfaceNatMappingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public java.util.List<
            ? extends
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>
        getInterfaceNatMappingsOrBuilderList() {
      if (interfaceNatMappingsBuilder_ != null) {
        return interfaceNatMappingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(interfaceNatMappings_);
      }
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
        addInterfaceNatMappingsBuilder() {
      return getInterfaceNatMappingsFieldBuilder()
          .addBuilder(
              com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
                  .getDefaultInstance());
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder
        addInterfaceNatMappingsBuilder(int index) {
      return getInterfaceNatMappingsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
                  .getDefaultInstance());
    }
    /**
     * <code>
     * repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface_nat_mappings = 256196617;
     * </code>
     */
    public java.util.List<
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder>
        getInterfaceNatMappingsBuilderList() {
      return getInterfaceNatMappingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings,
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder,
            com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>
        getInterfaceNatMappingsFieldBuilder() {
      if (interfaceNatMappingsBuilder_ == null) {
        interfaceNatMappingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings,
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings.Builder,
                com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsOrBuilder>(
                interfaceNatMappings_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        interfaceNatMappings_ = null;
      }
      return interfaceNatMappingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.VmEndpointNatMappings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.VmEndpointNatMappings)
  private static final com.google.cloud.compute.v1.VmEndpointNatMappings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.VmEndpointNatMappings();
  }

  public static com.google.cloud.compute.v1.VmEndpointNatMappings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmEndpointNatMappings> PARSER =
      new com.google.protobuf.AbstractParser<VmEndpointNatMappings>() {
        @java.lang.Override
        public VmEndpointNatMappings parsePartialFrom(
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

  public static com.google.protobuf.Parser<VmEndpointNatMappings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmEndpointNatMappings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.VmEndpointNatMappings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
