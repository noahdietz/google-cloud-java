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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstancesBulkInsertOperationMetadata}
 */
public final class InstancesBulkInsertOperationMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)
    InstancesBulkInsertOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstancesBulkInsertOperationMetadata.newBuilder() to construct.
  private InstancesBulkInsertOperationMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstancesBulkInsertOperationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstancesBulkInsertOperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 167851162:
        return internalGetPerLocationStatus();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.class,
            com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.Builder.class);
  }

  public static final int PER_LOCATION_STATUS_FIELD_NUMBER = 167851162;

  private static final class PerLocationStatusDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
                    newDefaultInstance(
                        com.google.cloud.compute.v1.Compute
                            .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_PerLocationStatusEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.compute.v1.BulkInsertOperationStatus.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      perLocationStatus_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      internalGetPerLocationStatus() {
    if (perLocationStatus_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PerLocationStatusDefaultEntryHolder.defaultEntry);
    }
    return perLocationStatus_;
  }

  public int getPerLocationStatusCount() {
    return internalGetPerLocationStatus().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  @java.lang.Override
  public boolean containsPerLocationStatus(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetPerLocationStatus().getMap().containsKey(key);
  }
  /** Use {@link #getPerLocationStatusMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      getPerLocationStatus() {
    return getPerLocationStatusMap();
  }
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
      getPerLocationStatusMap() {
    return internalGetPerLocationStatus().getMap();
  }
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.compute.v1.BulkInsertOperationStatus
      getPerLocationStatusOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.compute.v1.BulkInsertOperationStatus defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus> map =
        internalGetPerLocationStatus().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Status information per location (location name is key). Example key: zones/us-central1-a
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.BulkInsertOperationStatus getPerLocationStatusOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus> map =
        internalGetPerLocationStatus().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetPerLocationStatus(),
        PerLocationStatusDefaultEntryHolder.defaultEntry,
        167851162);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<
            java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
        entry : internalGetPerLocationStatus().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
          perLocationStatus__ =
              PerLocationStatusDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(167851162, perLocationStatus__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata other =
        (com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata) obj;

    if (!internalGetPerLocationStatus().equals(other.internalGetPerLocationStatus())) return false;
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
    if (!internalGetPerLocationStatus().getMap().isEmpty()) {
      hash = (37 * hash) + PER_LOCATION_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPerLocationStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata parseFrom(
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
      com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstancesBulkInsertOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)
      com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 167851162:
          return internalGetPerLocationStatus();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 167851162:
          return internalGetMutablePerLocationStatus();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.class,
              com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutablePerLocationStatus().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesBulkInsertOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata build() {
      com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata buildPartial() {
      com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata result =
          new com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.perLocationStatus_ =
            internalGetPerLocationStatus().build(PerLocationStatusDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata) {
        return mergeFrom((com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata other) {
      if (other
          == com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata.getDefaultInstance())
        return this;
      internalGetMutablePerLocationStatus().mergeFrom(other.internalGetPerLocationStatus());
      bitField0_ |= 0x00000001;
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
            case 1342809298:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
                    perLocationStatus__ =
                        input.readMessage(
                            PerLocationStatusDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutablePerLocationStatus()
                    .ensureBuilderMap()
                    .put(perLocationStatus__.getKey(), perLocationStatus__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 1342809298
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

    private static final class PerLocationStatusConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String,
            com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder,
            com.google.cloud.compute.v1.BulkInsertOperationStatus> {
      @java.lang.Override
      public com.google.cloud.compute.v1.BulkInsertOperationStatus build(
          com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder val) {
        if (val instanceof com.google.cloud.compute.v1.BulkInsertOperationStatus) {
          return (com.google.cloud.compute.v1.BulkInsertOperationStatus) val;
        }
        return ((com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
          defaultEntry() {
        return PerLocationStatusDefaultEntryHolder.defaultEntry;
      }
    };

    private static final PerLocationStatusConverter perLocationStatusConverter =
        new PerLocationStatusConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder,
            com.google.cloud.compute.v1.BulkInsertOperationStatus,
            com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder>
        perLocationStatus_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder,
            com.google.cloud.compute.v1.BulkInsertOperationStatus,
            com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder>
        internalGetPerLocationStatus() {
      if (perLocationStatus_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(perLocationStatusConverter);
      }
      return perLocationStatus_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder,
            com.google.cloud.compute.v1.BulkInsertOperationStatus,
            com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder>
        internalGetMutablePerLocationStatus() {
      if (perLocationStatus_ == null) {
        perLocationStatus_ = new com.google.protobuf.MapFieldBuilder<>(perLocationStatusConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return perLocationStatus_;
    }

    public int getPerLocationStatusCount() {
      return internalGetPerLocationStatus().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    @java.lang.Override
    public boolean containsPerLocationStatus(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetPerLocationStatus().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getPerLocationStatusMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
        getPerLocationStatus() {
      return getPerLocationStatusMap();
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
        getPerLocationStatusMap() {
      return internalGetPerLocationStatus().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.compute.v1.BulkInsertOperationStatus
        getPerLocationStatusOrDefault(
            java.lang.String key,
            /* nullable */
            com.google.cloud.compute.v1.BulkInsertOperationStatus defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder>
          map = internalGetMutablePerLocationStatus().ensureBuilderMap();
      return map.containsKey(key) ? perLocationStatusConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.BulkInsertOperationStatus getPerLocationStatusOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder>
          map = internalGetMutablePerLocationStatus().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return perLocationStatusConverter.build(map.get(key));
    }

    public Builder clearPerLocationStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutablePerLocationStatus().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    public Builder removePerLocationStatus(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutablePerLocationStatus().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
        getMutablePerLocationStatus() {
      bitField0_ |= 0x00000001;
      return internalGetMutablePerLocationStatus().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    public Builder putPerLocationStatus(
        java.lang.String key, com.google.cloud.compute.v1.BulkInsertOperationStatus value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutablePerLocationStatus().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    public Builder putAllPerLocationStatus(
        java.util.Map<java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
            values) {
      for (java.util.Map.Entry<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatus>
          e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutablePerLocationStatus().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status information per location (location name is key). Example key: zones/us-central1-a
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.BulkInsertOperationStatus&gt; per_location_status = 167851162;
     * </code>
     */
    public com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder
        putPerLocationStatusBuilderIfAbsent(java.lang.String key) {
      java.util.Map<
              java.lang.String, com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder>
          builderMap = internalGetMutablePerLocationStatus().ensureBuilderMap();
      com.google.cloud.compute.v1.BulkInsertOperationStatusOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.cloud.compute.v1.BulkInsertOperationStatus.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.cloud.compute.v1.BulkInsertOperationStatus) {
        entry = ((com.google.cloud.compute.v1.BulkInsertOperationStatus) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.cloud.compute.v1.BulkInsertOperationStatus.Builder) entry;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancesBulkInsertOperationMetadata)
  private static final com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata();
  }

  public static com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesBulkInsertOperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<InstancesBulkInsertOperationMetadata>() {
        @java.lang.Override
        public InstancesBulkInsertOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesBulkInsertOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesBulkInsertOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancesBulkInsertOperationMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
