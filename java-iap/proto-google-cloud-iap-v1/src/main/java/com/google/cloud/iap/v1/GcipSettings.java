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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.iap.v1;

/**
 *
 *
 * <pre>
 * Allows customers to configure tenant_id for GCIP instance per-app.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.GcipSettings}
 */
public final class GcipSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.GcipSettings)
    GcipSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcipSettings.newBuilder() to construct.
  private GcipSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcipSettings() {
    tenantIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcipSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_GcipSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_GcipSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.GcipSettings.class,
            com.google.cloud.iap.v1.GcipSettings.Builder.class);
  }

  private int bitField0_;
  public static final int TENANT_IDS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList tenantIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * GCIP tenant ids that are linked to the IAP resource.
   * tenant_ids could be a string beginning with a number character to indicate
   * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
   * to indicate authenticating with GCIP agent flow.
   * If agent flow is used, tenant_ids should only contain one single element,
   * while for tenant flow, tenant_ids can contain multiple elements.
   * </pre>
   *
   * <code>repeated string tenant_ids = 1;</code>
   *
   * @return A list containing the tenantIds.
   */
  public com.google.protobuf.ProtocolStringList getTenantIdsList() {
    return tenantIds_;
  }
  /**
   *
   *
   * <pre>
   * GCIP tenant ids that are linked to the IAP resource.
   * tenant_ids could be a string beginning with a number character to indicate
   * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
   * to indicate authenticating with GCIP agent flow.
   * If agent flow is used, tenant_ids should only contain one single element,
   * while for tenant flow, tenant_ids can contain multiple elements.
   * </pre>
   *
   * <code>repeated string tenant_ids = 1;</code>
   *
   * @return The count of tenantIds.
   */
  public int getTenantIdsCount() {
    return tenantIds_.size();
  }
  /**
   *
   *
   * <pre>
   * GCIP tenant ids that are linked to the IAP resource.
   * tenant_ids could be a string beginning with a number character to indicate
   * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
   * to indicate authenticating with GCIP agent flow.
   * If agent flow is used, tenant_ids should only contain one single element,
   * while for tenant flow, tenant_ids can contain multiple elements.
   * </pre>
   *
   * <code>repeated string tenant_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The tenantIds at the given index.
   */
  public java.lang.String getTenantIds(int index) {
    return tenantIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * GCIP tenant ids that are linked to the IAP resource.
   * tenant_ids could be a string beginning with a number character to indicate
   * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
   * to indicate authenticating with GCIP agent flow.
   * If agent flow is used, tenant_ids should only contain one single element,
   * while for tenant flow, tenant_ids can contain multiple elements.
   * </pre>
   *
   * <code>repeated string tenant_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tenantIds at the given index.
   */
  public com.google.protobuf.ByteString getTenantIdsBytes(int index) {
    return tenantIds_.getByteString(index);
  }

  public static final int LOGIN_PAGE_URI_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue loginPageUri_;
  /**
   *
   *
   * <pre>
   * Login page URI associated with the GCIP tenants.
   * Typically, all resources within the same project share the same login page,
   * though it could be overridden at the sub resource level.
   * </pre>
   *
   * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
   *
   * @return Whether the loginPageUri field is set.
   */
  @java.lang.Override
  public boolean hasLoginPageUri() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Login page URI associated with the GCIP tenants.
   * Typically, all resources within the same project share the same login page,
   * though it could be overridden at the sub resource level.
   * </pre>
   *
   * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
   *
   * @return The loginPageUri.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getLoginPageUri() {
    return loginPageUri_ == null
        ? com.google.protobuf.StringValue.getDefaultInstance()
        : loginPageUri_;
  }
  /**
   *
   *
   * <pre>
   * Login page URI associated with the GCIP tenants.
   * Typically, all resources within the same project share the same login page,
   * though it could be overridden at the sub resource level.
   * </pre>
   *
   * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getLoginPageUriOrBuilder() {
    return loginPageUri_ == null
        ? com.google.protobuf.StringValue.getDefaultInstance()
        : loginPageUri_;
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
    for (int i = 0; i < tenantIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenantIds_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLoginPageUri());
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
      for (int i = 0; i < tenantIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(tenantIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTenantIdsList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLoginPageUri());
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
    if (!(obj instanceof com.google.cloud.iap.v1.GcipSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.GcipSettings other = (com.google.cloud.iap.v1.GcipSettings) obj;

    if (!getTenantIdsList().equals(other.getTenantIdsList())) return false;
    if (hasLoginPageUri() != other.hasLoginPageUri()) return false;
    if (hasLoginPageUri()) {
      if (!getLoginPageUri().equals(other.getLoginPageUri())) return false;
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
    if (getTenantIdsCount() > 0) {
      hash = (37 * hash) + TENANT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTenantIdsList().hashCode();
    }
    if (hasLoginPageUri()) {
      hash = (37 * hash) + LOGIN_PAGE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getLoginPageUri().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.GcipSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iap.v1.GcipSettings prototype) {
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
   * Allows customers to configure tenant_id for GCIP instance per-app.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.GcipSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.GcipSettings)
      com.google.cloud.iap.v1.GcipSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_GcipSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_GcipSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.GcipSettings.class,
              com.google.cloud.iap.v1.GcipSettings.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.GcipSettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLoginPageUriFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tenantIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      loginPageUri_ = null;
      if (loginPageUriBuilder_ != null) {
        loginPageUriBuilder_.dispose();
        loginPageUriBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_GcipSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.GcipSettings getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.GcipSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.GcipSettings build() {
      com.google.cloud.iap.v1.GcipSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.GcipSettings buildPartial() {
      com.google.cloud.iap.v1.GcipSettings result = new com.google.cloud.iap.v1.GcipSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.GcipSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        tenantIds_.makeImmutable();
        result.tenantIds_ = tenantIds_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.loginPageUri_ =
            loginPageUriBuilder_ == null ? loginPageUri_ : loginPageUriBuilder_.build();
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
      if (other instanceof com.google.cloud.iap.v1.GcipSettings) {
        return mergeFrom((com.google.cloud.iap.v1.GcipSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.GcipSettings other) {
      if (other == com.google.cloud.iap.v1.GcipSettings.getDefaultInstance()) return this;
      if (!other.tenantIds_.isEmpty()) {
        if (tenantIds_.isEmpty()) {
          tenantIds_ = other.tenantIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureTenantIdsIsMutable();
          tenantIds_.addAll(other.tenantIds_);
        }
        onChanged();
      }
      if (other.hasLoginPageUri()) {
        mergeLoginPageUri(other.getLoginPageUri());
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureTenantIdsIsMutable();
                tenantIds_.add(s);
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getLoginPageUriFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.LazyStringArrayList tenantIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureTenantIdsIsMutable() {
      if (!tenantIds_.isModifiable()) {
        tenantIds_ = new com.google.protobuf.LazyStringArrayList(tenantIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @return A list containing the tenantIds.
     */
    public com.google.protobuf.ProtocolStringList getTenantIdsList() {
      tenantIds_.makeImmutable();
      return tenantIds_;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @return The count of tenantIds.
     */
    public int getTenantIdsCount() {
      return tenantIds_.size();
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The tenantIds at the given index.
     */
    public java.lang.String getTenantIds(int index) {
      return tenantIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the tenantIds at the given index.
     */
    public com.google.protobuf.ByteString getTenantIdsBytes(int index) {
      return tenantIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The tenantIds to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTenantIdsIsMutable();
      tenantIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param value The tenantIds to add.
     * @return This builder for chaining.
     */
    public Builder addTenantIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTenantIdsIsMutable();
      tenantIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param values The tenantIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTenantIds(java.lang.Iterable<java.lang.String> values) {
      ensureTenantIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tenantIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTenantIds() {
      tenantIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCIP tenant ids that are linked to the IAP resource.
     * tenant_ids could be a string beginning with a number character to indicate
     * authenticating with GCIP tenant flow, or in the format of _&lt;ProjectNumber&gt;
     * to indicate authenticating with GCIP agent flow.
     * If agent flow is used, tenant_ids should only contain one single element,
     * while for tenant flow, tenant_ids can contain multiple elements.
     * </pre>
     *
     * <code>repeated string tenant_ids = 1;</code>
     *
     * @param value The bytes of the tenantIds to add.
     * @return This builder for chaining.
     */
    public Builder addTenantIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureTenantIdsIsMutable();
      tenantIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue loginPageUri_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue,
            com.google.protobuf.StringValue.Builder,
            com.google.protobuf.StringValueOrBuilder>
        loginPageUriBuilder_;
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     *
     * @return Whether the loginPageUri field is set.
     */
    public boolean hasLoginPageUri() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     *
     * @return The loginPageUri.
     */
    public com.google.protobuf.StringValue getLoginPageUri() {
      if (loginPageUriBuilder_ == null) {
        return loginPageUri_ == null
            ? com.google.protobuf.StringValue.getDefaultInstance()
            : loginPageUri_;
      } else {
        return loginPageUriBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public Builder setLoginPageUri(com.google.protobuf.StringValue value) {
      if (loginPageUriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loginPageUri_ = value;
      } else {
        loginPageUriBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public Builder setLoginPageUri(com.google.protobuf.StringValue.Builder builderForValue) {
      if (loginPageUriBuilder_ == null) {
        loginPageUri_ = builderForValue.build();
      } else {
        loginPageUriBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public Builder mergeLoginPageUri(com.google.protobuf.StringValue value) {
      if (loginPageUriBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && loginPageUri_ != null
            && loginPageUri_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getLoginPageUriBuilder().mergeFrom(value);
        } else {
          loginPageUri_ = value;
        }
      } else {
        loginPageUriBuilder_.mergeFrom(value);
      }
      if (loginPageUri_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public Builder clearLoginPageUri() {
      bitField0_ = (bitField0_ & ~0x00000002);
      loginPageUri_ = null;
      if (loginPageUriBuilder_ != null) {
        loginPageUriBuilder_.dispose();
        loginPageUriBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getLoginPageUriBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLoginPageUriFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getLoginPageUriOrBuilder() {
      if (loginPageUriBuilder_ != null) {
        return loginPageUriBuilder_.getMessageOrBuilder();
      } else {
        return loginPageUri_ == null
            ? com.google.protobuf.StringValue.getDefaultInstance()
            : loginPageUri_;
      }
    }
    /**
     *
     *
     * <pre>
     * Login page URI associated with the GCIP tenants.
     * Typically, all resources within the same project share the same login page,
     * though it could be overridden at the sub resource level.
     * </pre>
     *
     * <code>.google.protobuf.StringValue login_page_uri = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue,
            com.google.protobuf.StringValue.Builder,
            com.google.protobuf.StringValueOrBuilder>
        getLoginPageUriFieldBuilder() {
      if (loginPageUriBuilder_ == null) {
        loginPageUriBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.StringValue,
                com.google.protobuf.StringValue.Builder,
                com.google.protobuf.StringValueOrBuilder>(
                getLoginPageUri(), getParentForChildren(), isClean());
        loginPageUri_ = null;
      }
      return loginPageUriBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.GcipSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.GcipSettings)
  private static final com.google.cloud.iap.v1.GcipSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.GcipSettings();
  }

  public static com.google.cloud.iap.v1.GcipSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcipSettings> PARSER =
      new com.google.protobuf.AbstractParser<GcipSettings>() {
        @java.lang.Override
        public GcipSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcipSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcipSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.GcipSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
