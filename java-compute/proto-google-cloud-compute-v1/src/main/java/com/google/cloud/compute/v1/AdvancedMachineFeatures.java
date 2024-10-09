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
 * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AdvancedMachineFeatures}
 */
public final class AdvancedMachineFeatures extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AdvancedMachineFeatures)
    AdvancedMachineFeaturesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AdvancedMachineFeatures.newBuilder() to construct.
  private AdvancedMachineFeatures(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AdvancedMachineFeatures() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AdvancedMachineFeatures();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AdvancedMachineFeatures_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AdvancedMachineFeatures_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AdvancedMachineFeatures.class,
            com.google.cloud.compute.v1.AdvancedMachineFeatures.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_NESTED_VIRTUALIZATION_FIELD_NUMBER = 16639365;
  private boolean enableNestedVirtualization_ = false;
  /**
   *
   *
   * <pre>
   * Whether to enable nested virtualization or not (default is false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 16639365;</code>
   *
   * @return Whether the enableNestedVirtualization field is set.
   */
  @java.lang.Override
  public boolean hasEnableNestedVirtualization() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether to enable nested virtualization or not (default is false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 16639365;</code>
   *
   * @return The enableNestedVirtualization.
   */
  @java.lang.Override
  public boolean getEnableNestedVirtualization() {
    return enableNestedVirtualization_;
  }

  public static final int ENABLE_UEFI_NETWORKING_FIELD_NUMBER = 334485668;
  private boolean enableUefiNetworking_ = false;
  /**
   *
   *
   * <pre>
   * Whether to enable UEFI networking for instance creation.
   * </pre>
   *
   * <code>optional bool enable_uefi_networking = 334485668;</code>
   *
   * @return Whether the enableUefiNetworking field is set.
   */
  @java.lang.Override
  public boolean hasEnableUefiNetworking() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Whether to enable UEFI networking for instance creation.
   * </pre>
   *
   * <code>optional bool enable_uefi_networking = 334485668;</code>
   *
   * @return The enableUefiNetworking.
   */
  @java.lang.Override
  public boolean getEnableUefiNetworking() {
    return enableUefiNetworking_;
  }

  public static final int THREADS_PER_CORE_FIELD_NUMBER = 352611671;
  private int threadsPerCore_ = 0;
  /**
   *
   *
   * <pre>
   * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int32 threads_per_core = 352611671;</code>
   *
   * @return Whether the threadsPerCore field is set.
   */
  @java.lang.Override
  public boolean hasThreadsPerCore() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int32 threads_per_core = 352611671;</code>
   *
   * @return The threadsPerCore.
   */
  @java.lang.Override
  public int getThreadsPerCore() {
    return threadsPerCore_;
  }

  public static final int VISIBLE_CORE_COUNT_FIELD_NUMBER = 193198684;
  private int visibleCoreCount_ = 0;
  /**
   *
   *
   * <pre>
   * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
   * </pre>
   *
   * <code>optional int32 visible_core_count = 193198684;</code>
   *
   * @return Whether the visibleCoreCount field is set.
   */
  @java.lang.Override
  public boolean hasVisibleCoreCount() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
   * </pre>
   *
   * <code>optional int32 visible_core_count = 193198684;</code>
   *
   * @return The visibleCoreCount.
   */
  @java.lang.Override
  public int getVisibleCoreCount() {
    return visibleCoreCount_;
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
      output.writeBool(16639365, enableNestedVirtualization_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(193198684, visibleCoreCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(334485668, enableUefiNetworking_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(352611671, threadsPerCore_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              16639365, enableNestedVirtualization_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(193198684, visibleCoreCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(334485668, enableUefiNetworking_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(352611671, threadsPerCore_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AdvancedMachineFeatures)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AdvancedMachineFeatures other =
        (com.google.cloud.compute.v1.AdvancedMachineFeatures) obj;

    if (hasEnableNestedVirtualization() != other.hasEnableNestedVirtualization()) return false;
    if (hasEnableNestedVirtualization()) {
      if (getEnableNestedVirtualization() != other.getEnableNestedVirtualization()) return false;
    }
    if (hasEnableUefiNetworking() != other.hasEnableUefiNetworking()) return false;
    if (hasEnableUefiNetworking()) {
      if (getEnableUefiNetworking() != other.getEnableUefiNetworking()) return false;
    }
    if (hasThreadsPerCore() != other.hasThreadsPerCore()) return false;
    if (hasThreadsPerCore()) {
      if (getThreadsPerCore() != other.getThreadsPerCore()) return false;
    }
    if (hasVisibleCoreCount() != other.hasVisibleCoreCount()) return false;
    if (hasVisibleCoreCount()) {
      if (getVisibleCoreCount() != other.getVisibleCoreCount()) return false;
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
    if (hasEnableNestedVirtualization()) {
      hash = (37 * hash) + ENABLE_NESTED_VIRTUALIZATION_FIELD_NUMBER;
      hash =
          (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableNestedVirtualization());
    }
    if (hasEnableUefiNetworking()) {
      hash = (37 * hash) + ENABLE_UEFI_NETWORKING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableUefiNetworking());
    }
    if (hasThreadsPerCore()) {
      hash = (37 * hash) + THREADS_PER_CORE_FIELD_NUMBER;
      hash = (53 * hash) + getThreadsPerCore();
    }
    if (hasVisibleCoreCount()) {
      hash = (37 * hash) + VISIBLE_CORE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getVisibleCoreCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.AdvancedMachineFeatures prototype) {
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
   * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AdvancedMachineFeatures}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AdvancedMachineFeatures)
      com.google.cloud.compute.v1.AdvancedMachineFeaturesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AdvancedMachineFeatures_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AdvancedMachineFeatures_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AdvancedMachineFeatures.class,
              com.google.cloud.compute.v1.AdvancedMachineFeatures.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AdvancedMachineFeatures.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableNestedVirtualization_ = false;
      enableUefiNetworking_ = false;
      threadsPerCore_ = 0;
      visibleCoreCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AdvancedMachineFeatures_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AdvancedMachineFeatures getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AdvancedMachineFeatures.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AdvancedMachineFeatures build() {
      com.google.cloud.compute.v1.AdvancedMachineFeatures result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AdvancedMachineFeatures buildPartial() {
      com.google.cloud.compute.v1.AdvancedMachineFeatures result =
          new com.google.cloud.compute.v1.AdvancedMachineFeatures(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AdvancedMachineFeatures result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableNestedVirtualization_ = enableNestedVirtualization_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableUefiNetworking_ = enableUefiNetworking_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.threadsPerCore_ = threadsPerCore_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.visibleCoreCount_ = visibleCoreCount_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.compute.v1.AdvancedMachineFeatures) {
        return mergeFrom((com.google.cloud.compute.v1.AdvancedMachineFeatures) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AdvancedMachineFeatures other) {
      if (other == com.google.cloud.compute.v1.AdvancedMachineFeatures.getDefaultInstance())
        return this;
      if (other.hasEnableNestedVirtualization()) {
        setEnableNestedVirtualization(other.getEnableNestedVirtualization());
      }
      if (other.hasEnableUefiNetworking()) {
        setEnableUefiNetworking(other.getEnableUefiNetworking());
      }
      if (other.hasThreadsPerCore()) {
        setThreadsPerCore(other.getThreadsPerCore());
      }
      if (other.hasVisibleCoreCount()) {
        setVisibleCoreCount(other.getVisibleCoreCount());
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
            case 133114920:
              {
                enableNestedVirtualization_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 133114920
            case 1545589472:
              {
                visibleCoreCount_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 1545589472
            case -1619081952:
              {
                enableUefiNetworking_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case -1619081952
            case -1474073928:
              {
                threadsPerCore_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case -1474073928
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

    private boolean enableNestedVirtualization_;
    /**
     *
     *
     * <pre>
     * Whether to enable nested virtualization or not (default is false).
     * </pre>
     *
     * <code>optional bool enable_nested_virtualization = 16639365;</code>
     *
     * @return Whether the enableNestedVirtualization field is set.
     */
    @java.lang.Override
    public boolean hasEnableNestedVirtualization() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether to enable nested virtualization or not (default is false).
     * </pre>
     *
     * <code>optional bool enable_nested_virtualization = 16639365;</code>
     *
     * @return The enableNestedVirtualization.
     */
    @java.lang.Override
    public boolean getEnableNestedVirtualization() {
      return enableNestedVirtualization_;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable nested virtualization or not (default is false).
     * </pre>
     *
     * <code>optional bool enable_nested_virtualization = 16639365;</code>
     *
     * @param value The enableNestedVirtualization to set.
     * @return This builder for chaining.
     */
    public Builder setEnableNestedVirtualization(boolean value) {

      enableNestedVirtualization_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable nested virtualization or not (default is false).
     * </pre>
     *
     * <code>optional bool enable_nested_virtualization = 16639365;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableNestedVirtualization() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableNestedVirtualization_ = false;
      onChanged();
      return this;
    }

    private boolean enableUefiNetworking_;
    /**
     *
     *
     * <pre>
     * Whether to enable UEFI networking for instance creation.
     * </pre>
     *
     * <code>optional bool enable_uefi_networking = 334485668;</code>
     *
     * @return Whether the enableUefiNetworking field is set.
     */
    @java.lang.Override
    public boolean hasEnableUefiNetworking() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Whether to enable UEFI networking for instance creation.
     * </pre>
     *
     * <code>optional bool enable_uefi_networking = 334485668;</code>
     *
     * @return The enableUefiNetworking.
     */
    @java.lang.Override
    public boolean getEnableUefiNetworking() {
      return enableUefiNetworking_;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable UEFI networking for instance creation.
     * </pre>
     *
     * <code>optional bool enable_uefi_networking = 334485668;</code>
     *
     * @param value The enableUefiNetworking to set.
     * @return This builder for chaining.
     */
    public Builder setEnableUefiNetworking(boolean value) {

      enableUefiNetworking_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable UEFI networking for instance creation.
     * </pre>
     *
     * <code>optional bool enable_uefi_networking = 334485668;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableUefiNetworking() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableUefiNetworking_ = false;
      onChanged();
      return this;
    }

    private int threadsPerCore_;
    /**
     *
     *
     * <pre>
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int32 threads_per_core = 352611671;</code>
     *
     * @return Whether the threadsPerCore field is set.
     */
    @java.lang.Override
    public boolean hasThreadsPerCore() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int32 threads_per_core = 352611671;</code>
     *
     * @return The threadsPerCore.
     */
    @java.lang.Override
    public int getThreadsPerCore() {
      return threadsPerCore_;
    }
    /**
     *
     *
     * <pre>
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int32 threads_per_core = 352611671;</code>
     *
     * @param value The threadsPerCore to set.
     * @return This builder for chaining.
     */
    public Builder setThreadsPerCore(int value) {

      threadsPerCore_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int32 threads_per_core = 352611671;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThreadsPerCore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      threadsPerCore_ = 0;
      onChanged();
      return this;
    }

    private int visibleCoreCount_;
    /**
     *
     *
     * <pre>
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * </pre>
     *
     * <code>optional int32 visible_core_count = 193198684;</code>
     *
     * @return Whether the visibleCoreCount field is set.
     */
    @java.lang.Override
    public boolean hasVisibleCoreCount() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * </pre>
     *
     * <code>optional int32 visible_core_count = 193198684;</code>
     *
     * @return The visibleCoreCount.
     */
    @java.lang.Override
    public int getVisibleCoreCount() {
      return visibleCoreCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * </pre>
     *
     * <code>optional int32 visible_core_count = 193198684;</code>
     *
     * @param value The visibleCoreCount to set.
     * @return This builder for chaining.
     */
    public Builder setVisibleCoreCount(int value) {

      visibleCoreCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * </pre>
     *
     * <code>optional int32 visible_core_count = 193198684;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVisibleCoreCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      visibleCoreCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AdvancedMachineFeatures)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AdvancedMachineFeatures)
  private static final com.google.cloud.compute.v1.AdvancedMachineFeatures DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AdvancedMachineFeatures();
  }

  public static com.google.cloud.compute.v1.AdvancedMachineFeatures getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvancedMachineFeatures> PARSER =
      new com.google.protobuf.AbstractParser<AdvancedMachineFeatures>() {
        @java.lang.Override
        public AdvancedMachineFeatures parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdvancedMachineFeatures> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvancedMachineFeatures> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AdvancedMachineFeatures getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
