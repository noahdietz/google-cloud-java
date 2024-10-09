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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for UpdateSubpropertyEventFilter RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest}
 */
public final class UpdateSubpropertyEventFilterRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest)
    UpdateSubpropertyEventFilterRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSubpropertyEventFilterRequest.newBuilder() to construct.
  private UpdateSubpropertyEventFilterRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSubpropertyEventFilterRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSubpropertyEventFilterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateSubpropertyEventFilterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateSubpropertyEventFilterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest.class,
            com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SUBPROPERTY_EVENT_FILTER_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.SubpropertyEventFilter subpropertyEventFilter_;
  /**
   *
   *
   * <pre>
   * Required. The subproperty event filter to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the subpropertyEventFilter field is set.
   */
  @java.lang.Override
  public boolean hasSubpropertyEventFilter() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The subproperty event filter to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The subpropertyEventFilter.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SubpropertyEventFilter getSubpropertyEventFilter() {
    return subpropertyEventFilter_ == null
        ? com.google.analytics.admin.v1alpha.SubpropertyEventFilter.getDefaultInstance()
        : subpropertyEventFilter_;
  }
  /**
   *
   *
   * <pre>
   * Required. The subproperty event filter to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder
      getSubpropertyEventFilterOrBuilder() {
    return subpropertyEventFilter_ == null
        ? com.google.analytics.admin.v1alpha.SubpropertyEventFilter.getDefaultInstance()
        : subpropertyEventFilter_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Field names must be in snake case
   * (for example, "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Field names must be in snake case
   * (for example, "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Field names must be in snake case
   * (for example, "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getSubpropertyEventFilter());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
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
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSubpropertyEventFilter());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest other =
        (com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest) obj;

    if (hasSubpropertyEventFilter() != other.hasSubpropertyEventFilter()) return false;
    if (hasSubpropertyEventFilter()) {
      if (!getSubpropertyEventFilter().equals(other.getSubpropertyEventFilter())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasSubpropertyEventFilter()) {
      hash = (37 * hash) + SUBPROPERTY_EVENT_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getSubpropertyEventFilter().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest prototype) {
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
   * Request message for UpdateSubpropertyEventFilter RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest)
      com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateSubpropertyEventFilterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateSubpropertyEventFilterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest.class,
              com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest.Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSubpropertyEventFilterFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subpropertyEventFilter_ = null;
      if (subpropertyEventFilterBuilder_ != null) {
        subpropertyEventFilterBuilder_.dispose();
        subpropertyEventFilterBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateSubpropertyEventFilterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest build() {
      com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest buildPartial() {
      com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest result =
          new com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subpropertyEventFilter_ =
            subpropertyEventFilterBuilder_ == null
                ? subpropertyEventFilter_
                : subpropertyEventFilterBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
              .getDefaultInstance()) return this;
      if (other.hasSubpropertyEventFilter()) {
        mergeSubpropertyEventFilter(other.getSubpropertyEventFilter());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getSubpropertyEventFilterFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.analytics.admin.v1alpha.SubpropertyEventFilter subpropertyEventFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SubpropertyEventFilter,
            com.google.analytics.admin.v1alpha.SubpropertyEventFilter.Builder,
            com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder>
        subpropertyEventFilterBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the subpropertyEventFilter field is set.
     */
    public boolean hasSubpropertyEventFilter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The subpropertyEventFilter.
     */
    public com.google.analytics.admin.v1alpha.SubpropertyEventFilter getSubpropertyEventFilter() {
      if (subpropertyEventFilterBuilder_ == null) {
        return subpropertyEventFilter_ == null
            ? com.google.analytics.admin.v1alpha.SubpropertyEventFilter.getDefaultInstance()
            : subpropertyEventFilter_;
      } else {
        return subpropertyEventFilterBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSubpropertyEventFilter(
        com.google.analytics.admin.v1alpha.SubpropertyEventFilter value) {
      if (subpropertyEventFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subpropertyEventFilter_ = value;
      } else {
        subpropertyEventFilterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSubpropertyEventFilter(
        com.google.analytics.admin.v1alpha.SubpropertyEventFilter.Builder builderForValue) {
      if (subpropertyEventFilterBuilder_ == null) {
        subpropertyEventFilter_ = builderForValue.build();
      } else {
        subpropertyEventFilterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSubpropertyEventFilter(
        com.google.analytics.admin.v1alpha.SubpropertyEventFilter value) {
      if (subpropertyEventFilterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && subpropertyEventFilter_ != null
            && subpropertyEventFilter_
                != com.google.analytics.admin.v1alpha.SubpropertyEventFilter.getDefaultInstance()) {
          getSubpropertyEventFilterBuilder().mergeFrom(value);
        } else {
          subpropertyEventFilter_ = value;
        }
      } else {
        subpropertyEventFilterBuilder_.mergeFrom(value);
      }
      if (subpropertyEventFilter_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSubpropertyEventFilter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subpropertyEventFilter_ = null;
      if (subpropertyEventFilterBuilder_ != null) {
        subpropertyEventFilterBuilder_.dispose();
        subpropertyEventFilterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SubpropertyEventFilter.Builder
        getSubpropertyEventFilterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubpropertyEventFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder
        getSubpropertyEventFilterOrBuilder() {
      if (subpropertyEventFilterBuilder_ != null) {
        return subpropertyEventFilterBuilder_.getMessageOrBuilder();
      } else {
        return subpropertyEventFilter_ == null
            ? com.google.analytics.admin.v1alpha.SubpropertyEventFilter.getDefaultInstance()
            : subpropertyEventFilter_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subproperty event filter to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SubpropertyEventFilter subproperty_event_filter = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SubpropertyEventFilter,
            com.google.analytics.admin.v1alpha.SubpropertyEventFilter.Builder,
            com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder>
        getSubpropertyEventFilterFieldBuilder() {
      if (subpropertyEventFilterBuilder_ == null) {
        subpropertyEventFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.SubpropertyEventFilter,
                com.google.analytics.admin.v1alpha.SubpropertyEventFilter.Builder,
                com.google.analytics.admin.v1alpha.SubpropertyEventFilterOrBuilder>(
                getSubpropertyEventFilter(), getParentForChildren(), isClean());
        subpropertyEventFilter_ = null;
      }
      return subpropertyEventFilterBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update. Field names must be in snake case
     * (for example, "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest)
  private static final com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest();
  }

  public static com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSubpropertyEventFilterRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSubpropertyEventFilterRequest>() {
        @java.lang.Override
        public UpdateSubpropertyEventFilterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSubpropertyEventFilterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSubpropertyEventFilterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UpdateSubpropertyEventFilterRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
