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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration options for Istio addon.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.IstioConfig}
 */
public final class IstioConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.IstioConfig)
    IstioConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IstioConfig.newBuilder() to construct.
  private IstioConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IstioConfig() {
    auth_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IstioConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_IstioConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_IstioConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.IstioConfig.class,
            com.google.container.v1beta1.IstioConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Istio auth mode, https://istio.io/docs/concepts/security/mutual-tls.html
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.IstioConfig.IstioAuthMode}
   */
  public enum IstioAuthMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * auth not enabled
     * </pre>
     *
     * <code>AUTH_NONE = 0;</code>
     */
    AUTH_NONE(0),
    /**
     *
     *
     * <pre>
     * auth mutual TLS enabled
     * </pre>
     *
     * <code>AUTH_MUTUAL_TLS = 1;</code>
     */
    AUTH_MUTUAL_TLS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * auth not enabled
     * </pre>
     *
     * <code>AUTH_NONE = 0;</code>
     */
    public static final int AUTH_NONE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * auth mutual TLS enabled
     * </pre>
     *
     * <code>AUTH_MUTUAL_TLS = 1;</code>
     */
    public static final int AUTH_MUTUAL_TLS_VALUE = 1;

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
    public static IstioAuthMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IstioAuthMode forNumber(int value) {
      switch (value) {
        case 0:
          return AUTH_NONE;
        case 1:
          return AUTH_MUTUAL_TLS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IstioAuthMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<IstioAuthMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IstioAuthMode>() {
          public IstioAuthMode findValueByNumber(int number) {
            return IstioAuthMode.forNumber(number);
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
      return com.google.container.v1beta1.IstioConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final IstioAuthMode[] VALUES = values();

    public static IstioAuthMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IstioAuthMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.IstioConfig.IstioAuthMode)
  }

  public static final int DISABLED_FIELD_NUMBER = 1;
  private boolean disabled_ = false;
  /**
   *
   *
   * <pre>
   * Whether Istio is enabled for this cluster.
   * </pre>
   *
   * <code>bool disabled = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.disabled is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=1600
   * @return The disabled.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public boolean getDisabled() {
    return disabled_;
  }

  public static final int AUTH_FIELD_NUMBER = 2;
  private int auth_ = 0;
  /**
   *
   *
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=1603
   * @return The enum numeric value on the wire for auth.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public int getAuthValue() {
    return auth_;
  }
  /**
   *
   *
   * <pre>
   * The specified Istio auth mode, either none, or mutual TLS.
   * </pre>
   *
   * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=1603
   * @return The auth.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.container.v1beta1.IstioConfig.IstioAuthMode getAuth() {
    com.google.container.v1beta1.IstioConfig.IstioAuthMode result =
        com.google.container.v1beta1.IstioConfig.IstioAuthMode.forNumber(auth_);
    return result == null
        ? com.google.container.v1beta1.IstioConfig.IstioAuthMode.UNRECOGNIZED
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
    if (disabled_ != false) {
      output.writeBool(1, disabled_);
    }
    if (auth_ != com.google.container.v1beta1.IstioConfig.IstioAuthMode.AUTH_NONE.getNumber()) {
      output.writeEnum(2, auth_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, disabled_);
    }
    if (auth_ != com.google.container.v1beta1.IstioConfig.IstioAuthMode.AUTH_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, auth_);
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
    if (!(obj instanceof com.google.container.v1beta1.IstioConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.IstioConfig other = (com.google.container.v1beta1.IstioConfig) obj;

    if (getDisabled() != other.getDisabled()) return false;
    if (auth_ != other.auth_) return false;
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
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDisabled());
    hash = (37 * hash) + AUTH_FIELD_NUMBER;
    hash = (53 * hash) + auth_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.IstioConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.IstioConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.IstioConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.IstioConfig prototype) {
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
   * Configuration options for Istio addon.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.IstioConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.IstioConfig)
      com.google.container.v1beta1.IstioConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_IstioConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_IstioConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.IstioConfig.class,
              com.google.container.v1beta1.IstioConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.IstioConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      disabled_ = false;
      auth_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_IstioConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.IstioConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.IstioConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.IstioConfig build() {
      com.google.container.v1beta1.IstioConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.IstioConfig buildPartial() {
      com.google.container.v1beta1.IstioConfig result =
          new com.google.container.v1beta1.IstioConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.IstioConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disabled_ = disabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.auth_ = auth_;
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
      if (other instanceof com.google.container.v1beta1.IstioConfig) {
        return mergeFrom((com.google.container.v1beta1.IstioConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.IstioConfig other) {
      if (other == com.google.container.v1beta1.IstioConfig.getDefaultInstance()) return this;
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
      }
      if (other.auth_ != 0) {
        setAuthValue(other.getAuthValue());
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
                disabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                auth_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean disabled_;
    /**
     *
     *
     * <pre>
     * Whether Istio is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.disabled is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1600
     * @return The disabled.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether Istio is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.disabled is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1600
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setDisabled(boolean value) {

      disabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether Istio is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.disabled is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1600
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearDisabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      disabled_ = false;
      onChanged();
      return this;
    }

    private int auth_ = 0;
    /**
     *
     *
     * <pre>
     * The specified Istio auth mode, either none, or mutual TLS.
     * </pre>
     *
     * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1603
     * @return The enum numeric value on the wire for auth.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public int getAuthValue() {
      return auth_;
    }
    /**
     *
     *
     * <pre>
     * The specified Istio auth mode, either none, or mutual TLS.
     * </pre>
     *
     * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1603
     * @param value The enum numeric value on the wire for auth to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setAuthValue(int value) {
      auth_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The specified Istio auth mode, either none, or mutual TLS.
     * </pre>
     *
     * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1603
     * @return The auth.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.container.v1beta1.IstioConfig.IstioAuthMode getAuth() {
      com.google.container.v1beta1.IstioConfig.IstioAuthMode result =
          com.google.container.v1beta1.IstioConfig.IstioAuthMode.forNumber(auth_);
      return result == null
          ? com.google.container.v1beta1.IstioConfig.IstioAuthMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The specified Istio auth mode, either none, or mutual TLS.
     * </pre>
     *
     * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1603
     * @param value The auth to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setAuth(com.google.container.v1beta1.IstioConfig.IstioAuthMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      auth_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The specified Istio auth mode, either none, or mutual TLS.
     * </pre>
     *
     * <code>.google.container.v1beta1.IstioConfig.IstioAuthMode auth = 2 [deprecated = true];
     * </code>
     *
     * @deprecated google.container.v1beta1.IstioConfig.auth is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1603
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearAuth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      auth_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.IstioConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.IstioConfig)
  private static final com.google.container.v1beta1.IstioConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.IstioConfig();
  }

  public static com.google.container.v1beta1.IstioConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IstioConfig> PARSER =
      new com.google.protobuf.AbstractParser<IstioConfig>() {
        @java.lang.Override
        public IstioConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<IstioConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IstioConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.IstioConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
