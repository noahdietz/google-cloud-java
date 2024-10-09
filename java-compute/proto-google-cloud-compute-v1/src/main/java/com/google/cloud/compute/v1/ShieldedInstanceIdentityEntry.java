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
 * A Shielded Instance Identity Entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceIdentityEntry}
 */
public final class ShieldedInstanceIdentityEntry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
    ShieldedInstanceIdentityEntryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShieldedInstanceIdentityEntry.newBuilder() to construct.
  private ShieldedInstanceIdentityEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShieldedInstanceIdentityEntry() {
    ekCert_ = "";
    ekPub_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ShieldedInstanceIdentityEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.class,
            com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.Builder.class);
  }

  private int bitField0_;
  public static final int EK_CERT_FIELD_NUMBER = 450178589;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ekCert_ = "";
  /**
   *
   *
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   *
   * @return Whether the ekCert field is set.
   */
  @java.lang.Override
  public boolean hasEkCert() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   *
   * @return The ekCert.
   */
  @java.lang.Override
  public java.lang.String getEkCert() {
    java.lang.Object ref = ekCert_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekCert_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded X.509 certificate. This field can be empty.
   * </pre>
   *
   * <code>optional string ek_cert = 450178589;</code>
   *
   * @return The bytes for ekCert.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkCertBytes() {
    java.lang.Object ref = ekCert_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekCert_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EK_PUB_FIELD_NUMBER = 308947940;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ekPub_ = "";
  /**
   *
   *
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   *
   * @return Whether the ekPub field is set.
   */
  @java.lang.Override
  public boolean hasEkPub() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   *
   * @return The ekPub.
   */
  @java.lang.Override
  public java.lang.String getEkPub() {
    java.lang.Object ref = ekPub_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekPub_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A PEM-encoded public key.
   * </pre>
   *
   * <code>optional string ek_pub = 308947940;</code>
   *
   * @return The bytes for ekPub.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkPubBytes() {
    java.lang.Object ref = ekPub_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekPub_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 308947940, ekPub_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 450178589, ekCert_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(308947940, ekPub_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(450178589, ekCert_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry other =
        (com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) obj;

    if (hasEkCert() != other.hasEkCert()) return false;
    if (hasEkCert()) {
      if (!getEkCert().equals(other.getEkCert())) return false;
    }
    if (hasEkPub() != other.hasEkPub()) return false;
    if (hasEkPub()) {
      if (!getEkPub().equals(other.getEkPub())) return false;
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
    if (hasEkCert()) {
      hash = (37 * hash) + EK_CERT_FIELD_NUMBER;
      hash = (53 * hash) + getEkCert().hashCode();
    }
    if (hasEkPub()) {
      hash = (37 * hash) + EK_PUB_FIELD_NUMBER;
      hash = (53 * hash) + getEkPub().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry parseFrom(
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
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry prototype) {
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
   * A Shielded Instance Identity Entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceIdentityEntry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.class,
              com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ekCert_ = "";
      ekPub_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceIdentityEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry build() {
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry buildPartial() {
      com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry result =
          new com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ekCert_ = ekCert_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ekPub_ = ekPub_;
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
      if (other instanceof com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) {
        return mergeFrom((com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry other) {
      if (other == com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry.getDefaultInstance())
        return this;
      if (other.hasEkCert()) {
        ekCert_ = other.ekCert_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEkPub()) {
        ekPub_ = other.ekPub_;
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
            case -1823383774:
              {
                ekPub_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1823383774
            case -693538582:
              {
                ekCert_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -693538582
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

    private java.lang.Object ekCert_ = "";
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @return Whether the ekCert field is set.
     */
    public boolean hasEkCert() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @return The ekCert.
     */
    public java.lang.String getEkCert() {
      java.lang.Object ref = ekCert_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekCert_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @return The bytes for ekCert.
     */
    public com.google.protobuf.ByteString getEkCertBytes() {
      java.lang.Object ref = ekCert_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekCert_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @param value The ekCert to set.
     * @return This builder for chaining.
     */
    public Builder setEkCert(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ekCert_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkCert() {
      ekCert_ = getDefaultInstance().getEkCert();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded X.509 certificate. This field can be empty.
     * </pre>
     *
     * <code>optional string ek_cert = 450178589;</code>
     *
     * @param value The bytes for ekCert to set.
     * @return This builder for chaining.
     */
    public Builder setEkCertBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ekCert_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ekPub_ = "";
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @return Whether the ekPub field is set.
     */
    public boolean hasEkPub() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @return The ekPub.
     */
    public java.lang.String getEkPub() {
      java.lang.Object ref = ekPub_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekPub_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @return The bytes for ekPub.
     */
    public com.google.protobuf.ByteString getEkPubBytes() {
      java.lang.Object ref = ekPub_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekPub_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @param value The ekPub to set.
     * @return This builder for chaining.
     */
    public Builder setEkPub(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ekPub_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkPub() {
      ekPub_ = getDefaultInstance().getEkPub();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A PEM-encoded public key.
     * </pre>
     *
     * <code>optional string ek_pub = 308947940;</code>
     *
     * @param value The bytes for ekPub to set.
     * @return This builder for chaining.
     */
    public Builder setEkPubBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ekPub_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ShieldedInstanceIdentityEntry)
  private static final com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry();
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> PARSER =
      new com.google.protobuf.AbstractParser<ShieldedInstanceIdentityEntry>() {
        @java.lang.Override
        public ShieldedInstanceIdentityEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShieldedInstanceIdentityEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
