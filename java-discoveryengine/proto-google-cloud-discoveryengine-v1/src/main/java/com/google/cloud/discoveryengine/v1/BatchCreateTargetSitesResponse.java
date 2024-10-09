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
// source: google/cloud/discoveryengine/v1/site_search_engine_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [SiteSearchEngineService.BatchCreateTargetSites][google.cloud.discoveryengine.v1.SiteSearchEngineService.BatchCreateTargetSites]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse}
 */
public final class BatchCreateTargetSitesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse)
    BatchCreateTargetSitesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateTargetSitesResponse.newBuilder() to construct.
  private BatchCreateTargetSitesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateTargetSitesResponse() {
    targetSites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateTargetSitesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_BatchCreateTargetSitesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_BatchCreateTargetSitesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse.class,
            com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse.Builder.class);
  }

  public static final int TARGET_SITES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> targetSites_;
  /**
   *
   *
   * <pre>
   * TargetSites created.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> getTargetSitesList() {
    return targetSites_;
  }
  /**
   *
   *
   * <pre>
   * TargetSites created.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
      getTargetSitesOrBuilderList() {
    return targetSites_;
  }
  /**
   *
   *
   * <pre>
   * TargetSites created.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public int getTargetSitesCount() {
    return targetSites_.size();
  }
  /**
   *
   *
   * <pre>
   * TargetSites created.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSite getTargetSites(int index) {
    return targetSites_.get(index);
  }
  /**
   *
   *
   * <pre>
   * TargetSites created.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSitesOrBuilder(
      int index) {
    return targetSites_.get(index);
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
    for (int i = 0; i < targetSites_.size(); i++) {
      output.writeMessage(1, targetSites_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < targetSites_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, targetSites_.get(i));
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse other =
        (com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse) obj;

    if (!getTargetSitesList().equals(other.getTargetSitesList())) return false;
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
    if (getTargetSitesCount() > 0) {
      hash = (37 * hash) + TARGET_SITES_FIELD_NUMBER;
      hash = (53 * hash) + getTargetSitesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse prototype) {
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
   * Response message for
   * [SiteSearchEngineService.BatchCreateTargetSites][google.cloud.discoveryengine.v1.SiteSearchEngineService.BatchCreateTargetSites]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse)
      com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_BatchCreateTargetSitesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_BatchCreateTargetSitesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse.class,
              com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (targetSitesBuilder_ == null) {
        targetSites_ = java.util.Collections.emptyList();
      } else {
        targetSites_ = null;
        targetSitesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_BatchCreateTargetSitesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse build() {
      com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse buildPartial() {
      com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse result =
          new com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse result) {
      if (targetSitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          targetSites_ = java.util.Collections.unmodifiableList(targetSites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetSites_ = targetSites_;
      } else {
        result.targetSites_ = targetSitesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse) {
        return mergeFrom(
            (com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse other) {
      if (other
          == com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
              .getDefaultInstance()) return this;
      if (targetSitesBuilder_ == null) {
        if (!other.targetSites_.isEmpty()) {
          if (targetSites_.isEmpty()) {
            targetSites_ = other.targetSites_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetSitesIsMutable();
            targetSites_.addAll(other.targetSites_);
          }
          onChanged();
        }
      } else {
        if (!other.targetSites_.isEmpty()) {
          if (targetSitesBuilder_.isEmpty()) {
            targetSitesBuilder_.dispose();
            targetSitesBuilder_ = null;
            targetSites_ = other.targetSites_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetSitesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTargetSitesFieldBuilder()
                    : null;
          } else {
            targetSitesBuilder_.addAllMessages(other.targetSites_);
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
            case 10:
              {
                com.google.cloud.discoveryengine.v1.TargetSite m =
                    input.readMessage(
                        com.google.cloud.discoveryengine.v1.TargetSite.parser(), extensionRegistry);
                if (targetSitesBuilder_ == null) {
                  ensureTargetSitesIsMutable();
                  targetSites_.add(m);
                } else {
                  targetSitesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> targetSites_ =
        java.util.Collections.emptyList();

    private void ensureTargetSitesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targetSites_ =
            new java.util.ArrayList<com.google.cloud.discoveryengine.v1.TargetSite>(targetSites_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        targetSitesBuilder_;

    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite> getTargetSitesList() {
      if (targetSitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targetSites_);
      } else {
        return targetSitesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public int getTargetSitesCount() {
      if (targetSitesBuilder_ == null) {
        return targetSites_.size();
      } else {
        return targetSitesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite getTargetSites(int index) {
      if (targetSitesBuilder_ == null) {
        return targetSites_.get(index);
      } else {
        return targetSitesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder setTargetSites(int index, com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.set(index, value);
        onChanged();
      } else {
        targetSitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder setTargetSites(
        int index, com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.add(value);
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(int index, com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetSitesIsMutable();
        targetSites_.add(index, value);
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(
        com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.add(builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addTargetSites(
        int index, com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetSitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder addAllTargetSites(
        java.lang.Iterable<? extends com.google.cloud.discoveryengine.v1.TargetSite> values) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targetSites_);
        onChanged();
      } else {
        targetSitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder clearTargetSites() {
      if (targetSitesBuilder_ == null) {
        targetSites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetSitesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public Builder removeTargetSites(int index) {
      if (targetSitesBuilder_ == null) {
        ensureTargetSitesIsMutable();
        targetSites_.remove(index);
        onChanged();
      } else {
        targetSitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder getTargetSitesBuilder(int index) {
      return getTargetSitesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSitesOrBuilder(
        int index) {
      if (targetSitesBuilder_ == null) {
        return targetSites_.get(index);
      } else {
        return targetSitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        getTargetSitesOrBuilderList() {
      if (targetSitesBuilder_ != null) {
        return targetSitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targetSites_);
      }
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder addTargetSitesBuilder() {
      return getTargetSitesFieldBuilder()
          .addBuilder(com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder addTargetSitesBuilder(int index) {
      return getTargetSitesFieldBuilder()
          .addBuilder(index, com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * TargetSites created.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.TargetSite target_sites = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.TargetSite.Builder>
        getTargetSitesBuilderList() {
      return getTargetSitesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        getTargetSitesFieldBuilder() {
      if (targetSitesBuilder_ == null) {
        targetSitesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.discoveryengine.v1.TargetSite,
                com.google.cloud.discoveryengine.v1.TargetSite.Builder,
                com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>(
                targetSites_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        targetSites_ = null;
      }
      return targetSitesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse)
  private static final com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse();
  }

  public static com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateTargetSitesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateTargetSitesResponse>() {
        @java.lang.Override
        public BatchCreateTargetSitesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateTargetSitesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateTargetSitesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.BatchCreateTargetSitesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
