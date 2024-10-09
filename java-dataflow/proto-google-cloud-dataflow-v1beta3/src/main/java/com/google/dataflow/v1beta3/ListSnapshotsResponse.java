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
// source: google/dataflow/v1beta3/snapshots.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * List of snapshots.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.ListSnapshotsResponse}
 */
public final class ListSnapshotsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.ListSnapshotsResponse)
    ListSnapshotsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSnapshotsResponse.newBuilder() to construct.
  private ListSnapshotsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSnapshotsResponse() {
    snapshots_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSnapshotsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.SnapshotsProto
        .internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.SnapshotsProto
        .internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.ListSnapshotsResponse.class,
            com.google.dataflow.v1beta3.ListSnapshotsResponse.Builder.class);
  }

  public static final int SNAPSHOTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.dataflow.v1beta3.Snapshot> snapshots_;
  /**
   *
   *
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.dataflow.v1beta3.Snapshot> getSnapshotsList() {
    return snapshots_;
  }
  /**
   *
   *
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.dataflow.v1beta3.SnapshotOrBuilder>
      getSnapshotsOrBuilderList() {
    return snapshots_;
  }
  /**
   *
   *
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  @java.lang.Override
  public int getSnapshotsCount() {
    return snapshots_.size();
  }
  /**
   *
   *
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.Snapshot getSnapshots(int index) {
    return snapshots_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Returned snapshots.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.SnapshotOrBuilder getSnapshotsOrBuilder(int index) {
    return snapshots_.get(index);
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
    for (int i = 0; i < snapshots_.size(); i++) {
      output.writeMessage(1, snapshots_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < snapshots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, snapshots_.get(i));
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
    if (!(obj instanceof com.google.dataflow.v1beta3.ListSnapshotsResponse)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.ListSnapshotsResponse other =
        (com.google.dataflow.v1beta3.ListSnapshotsResponse) obj;

    if (!getSnapshotsList().equals(other.getSnapshotsList())) return false;
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
    if (getSnapshotsCount() > 0) {
      hash = (37 * hash) + SNAPSHOTS_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.ListSnapshotsResponse prototype) {
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
   * List of snapshots.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.ListSnapshotsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.ListSnapshotsResponse)
      com.google.dataflow.v1beta3.ListSnapshotsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.SnapshotsProto
          .internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.SnapshotsProto
          .internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.ListSnapshotsResponse.class,
              com.google.dataflow.v1beta3.ListSnapshotsResponse.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.ListSnapshotsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (snapshotsBuilder_ == null) {
        snapshots_ = java.util.Collections.emptyList();
      } else {
        snapshots_ = null;
        snapshotsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.SnapshotsProto
          .internal_static_google_dataflow_v1beta3_ListSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ListSnapshotsResponse getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.ListSnapshotsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ListSnapshotsResponse build() {
      com.google.dataflow.v1beta3.ListSnapshotsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.ListSnapshotsResponse buildPartial() {
      com.google.dataflow.v1beta3.ListSnapshotsResponse result =
          new com.google.dataflow.v1beta3.ListSnapshotsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.dataflow.v1beta3.ListSnapshotsResponse result) {
      if (snapshotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          snapshots_ = java.util.Collections.unmodifiableList(snapshots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.snapshots_ = snapshots_;
      } else {
        result.snapshots_ = snapshotsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.dataflow.v1beta3.ListSnapshotsResponse result) {
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
      if (other instanceof com.google.dataflow.v1beta3.ListSnapshotsResponse) {
        return mergeFrom((com.google.dataflow.v1beta3.ListSnapshotsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.ListSnapshotsResponse other) {
      if (other == com.google.dataflow.v1beta3.ListSnapshotsResponse.getDefaultInstance())
        return this;
      if (snapshotsBuilder_ == null) {
        if (!other.snapshots_.isEmpty()) {
          if (snapshots_.isEmpty()) {
            snapshots_ = other.snapshots_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSnapshotsIsMutable();
            snapshots_.addAll(other.snapshots_);
          }
          onChanged();
        }
      } else {
        if (!other.snapshots_.isEmpty()) {
          if (snapshotsBuilder_.isEmpty()) {
            snapshotsBuilder_.dispose();
            snapshotsBuilder_ = null;
            snapshots_ = other.snapshots_;
            bitField0_ = (bitField0_ & ~0x00000001);
            snapshotsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSnapshotsFieldBuilder()
                    : null;
          } else {
            snapshotsBuilder_.addAllMessages(other.snapshots_);
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
                com.google.dataflow.v1beta3.Snapshot m =
                    input.readMessage(
                        com.google.dataflow.v1beta3.Snapshot.parser(), extensionRegistry);
                if (snapshotsBuilder_ == null) {
                  ensureSnapshotsIsMutable();
                  snapshots_.add(m);
                } else {
                  snapshotsBuilder_.addMessage(m);
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

    private java.util.List<com.google.dataflow.v1beta3.Snapshot> snapshots_ =
        java.util.Collections.emptyList();

    private void ensureSnapshotsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        snapshots_ = new java.util.ArrayList<com.google.dataflow.v1beta3.Snapshot>(snapshots_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.Snapshot,
            com.google.dataflow.v1beta3.Snapshot.Builder,
            com.google.dataflow.v1beta3.SnapshotOrBuilder>
        snapshotsBuilder_;

    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.Snapshot> getSnapshotsList() {
      if (snapshotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(snapshots_);
      } else {
        return snapshotsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public int getSnapshotsCount() {
      if (snapshotsBuilder_ == null) {
        return snapshots_.size();
      } else {
        return snapshotsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public com.google.dataflow.v1beta3.Snapshot getSnapshots(int index) {
      if (snapshotsBuilder_ == null) {
        return snapshots_.get(index);
      } else {
        return snapshotsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder setSnapshots(int index, com.google.dataflow.v1beta3.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.set(index, value);
        onChanged();
      } else {
        snapshotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder setSnapshots(
        int index, com.google.dataflow.v1beta3.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.set(index, builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(com.google.dataflow.v1beta3.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.add(value);
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(int index, com.google.dataflow.v1beta3.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.add(index, value);
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(com.google.dataflow.v1beta3.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.add(builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(
        int index, com.google.dataflow.v1beta3.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.add(index, builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder addAllSnapshots(
        java.lang.Iterable<? extends com.google.dataflow.v1beta3.Snapshot> values) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, snapshots_);
        onChanged();
      } else {
        snapshotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder clearSnapshots() {
      if (snapshotsBuilder_ == null) {
        snapshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        snapshotsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public Builder removeSnapshots(int index) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.remove(index);
        onChanged();
      } else {
        snapshotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public com.google.dataflow.v1beta3.Snapshot.Builder getSnapshotsBuilder(int index) {
      return getSnapshotsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public com.google.dataflow.v1beta3.SnapshotOrBuilder getSnapshotsOrBuilder(int index) {
      if (snapshotsBuilder_ == null) {
        return snapshots_.get(index);
      } else {
        return snapshotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public java.util.List<? extends com.google.dataflow.v1beta3.SnapshotOrBuilder>
        getSnapshotsOrBuilderList() {
      if (snapshotsBuilder_ != null) {
        return snapshotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(snapshots_);
      }
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public com.google.dataflow.v1beta3.Snapshot.Builder addSnapshotsBuilder() {
      return getSnapshotsFieldBuilder()
          .addBuilder(com.google.dataflow.v1beta3.Snapshot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public com.google.dataflow.v1beta3.Snapshot.Builder addSnapshotsBuilder(int index) {
      return getSnapshotsFieldBuilder()
          .addBuilder(index, com.google.dataflow.v1beta3.Snapshot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Returned snapshots.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.Snapshot snapshots = 1;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.Snapshot.Builder> getSnapshotsBuilderList() {
      return getSnapshotsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.Snapshot,
            com.google.dataflow.v1beta3.Snapshot.Builder,
            com.google.dataflow.v1beta3.SnapshotOrBuilder>
        getSnapshotsFieldBuilder() {
      if (snapshotsBuilder_ == null) {
        snapshotsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.dataflow.v1beta3.Snapshot,
                com.google.dataflow.v1beta3.Snapshot.Builder,
                com.google.dataflow.v1beta3.SnapshotOrBuilder>(
                snapshots_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        snapshots_ = null;
      }
      return snapshotsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.ListSnapshotsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.ListSnapshotsResponse)
  private static final com.google.dataflow.v1beta3.ListSnapshotsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.ListSnapshotsResponse();
  }

  public static com.google.dataflow.v1beta3.ListSnapshotsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSnapshotsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSnapshotsResponse>() {
        @java.lang.Override
        public ListSnapshotsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSnapshotsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSnapshotsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.ListSnapshotsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
