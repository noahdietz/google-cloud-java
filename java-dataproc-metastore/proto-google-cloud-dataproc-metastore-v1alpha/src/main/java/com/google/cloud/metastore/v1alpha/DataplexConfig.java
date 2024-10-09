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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.metastore.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies how metastore metadata should be integrated with the Dataplex
 * service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.DataplexConfig}
 */
public final class DataplexConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.DataplexConfig)
    DataplexConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataplexConfig.newBuilder() to construct.
  private DataplexConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataplexConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataplexConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetLakeResources();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.DataplexConfig.class,
            com.google.cloud.metastore.v1alpha.DataplexConfig.Builder.class);
  }

  public static final int LAKE_RESOURCES_FIELD_NUMBER = 1;

  private static final class LakeResourcesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>newDefaultInstance(
                    com.google.cloud.metastore.v1alpha.MetastoreProto
                        .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_LakeResourcesEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.cloud.metastore.v1alpha.Lake.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
      lakeResources_;

  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
      internalGetLakeResources() {
    if (lakeResources_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LakeResourcesDefaultEntryHolder.defaultEntry);
    }
    return lakeResources_;
  }

  public int getLakeResourcesCount() {
    return internalGetLakeResources().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  @java.lang.Override
  public boolean containsLakeResources(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLakeResources().getMap().containsKey(key);
  }
  /** Use {@link #getLakeResourcesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
      getLakeResources() {
    return getLakeResourcesMap();
  }
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
      getLakeResourcesMap() {
    return internalGetLakeResources().getMap();
  }
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.metastore.v1alpha.Lake defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> map =
        internalGetLakeResources().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A reference to the Lake resources that this metastore service is attached
   * to. The key is the lake resource name. Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> map =
        internalGetLakeResources().getMap();
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
        output, internalGetLakeResources(), LakeResourcesDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> entry :
        internalGetLakeResources().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
          lakeResources__ =
              LakeResourcesDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, lakeResources__);
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.DataplexConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.DataplexConfig other =
        (com.google.cloud.metastore.v1alpha.DataplexConfig) obj;

    if (!internalGetLakeResources().equals(other.internalGetLakeResources())) return false;
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
    if (!internalGetLakeResources().getMap().isEmpty()) {
      hash = (37 * hash) + LAKE_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLakeResources().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.metastore.v1alpha.DataplexConfig prototype) {
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
   * Specifies how metastore metadata should be integrated with the Dataplex
   * service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.DataplexConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.DataplexConfig)
      com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetLakeResources();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLakeResources();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.DataplexConfig.class,
              com.google.cloud.metastore.v1alpha.DataplexConfig.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1alpha.DataplexConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableLakeResources().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataplexConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataplexConfig getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataplexConfig build() {
      com.google.cloud.metastore.v1alpha.DataplexConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataplexConfig buildPartial() {
      com.google.cloud.metastore.v1alpha.DataplexConfig result =
          new com.google.cloud.metastore.v1alpha.DataplexConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1alpha.DataplexConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lakeResources_ =
            internalGetLakeResources().build(LakeResourcesDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.cloud.metastore.v1alpha.DataplexConfig) {
        return mergeFrom((com.google.cloud.metastore.v1alpha.DataplexConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1alpha.DataplexConfig other) {
      if (other == com.google.cloud.metastore.v1alpha.DataplexConfig.getDefaultInstance())
        return this;
      internalGetMutableLakeResources().mergeFrom(other.internalGetLakeResources());
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
            case 10:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
                    lakeResources__ =
                        input.readMessage(
                            LakeResourcesDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableLakeResources()
                    .ensureBuilderMap()
                    .put(lakeResources__.getKey(), lakeResources__.getValue());
                bitField0_ |= 0x00000001;
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

    private static final class LakeResourcesConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String,
            com.google.cloud.metastore.v1alpha.LakeOrBuilder,
            com.google.cloud.metastore.v1alpha.Lake> {
      @java.lang.Override
      public com.google.cloud.metastore.v1alpha.Lake build(
          com.google.cloud.metastore.v1alpha.LakeOrBuilder val) {
        if (val instanceof com.google.cloud.metastore.v1alpha.Lake) {
          return (com.google.cloud.metastore.v1alpha.Lake) val;
        }
        return ((com.google.cloud.metastore.v1alpha.Lake.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
          defaultEntry() {
        return LakeResourcesDefaultEntryHolder.defaultEntry;
      }
    };

    private static final LakeResourcesConverter lakeResourcesConverter =
        new LakeResourcesConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.metastore.v1alpha.LakeOrBuilder,
            com.google.cloud.metastore.v1alpha.Lake,
            com.google.cloud.metastore.v1alpha.Lake.Builder>
        lakeResources_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.metastore.v1alpha.LakeOrBuilder,
            com.google.cloud.metastore.v1alpha.Lake,
            com.google.cloud.metastore.v1alpha.Lake.Builder>
        internalGetLakeResources() {
      if (lakeResources_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(lakeResourcesConverter);
      }
      return lakeResources_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.metastore.v1alpha.LakeOrBuilder,
            com.google.cloud.metastore.v1alpha.Lake,
            com.google.cloud.metastore.v1alpha.Lake.Builder>
        internalGetMutableLakeResources() {
      if (lakeResources_ == null) {
        lakeResources_ = new com.google.protobuf.MapFieldBuilder<>(lakeResourcesConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return lakeResources_;
    }

    public int getLakeResourcesCount() {
      return internalGetLakeResources().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    @java.lang.Override
    public boolean containsLakeResources(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLakeResources().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getLakeResourcesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
        getLakeResources() {
      return getLakeResourcesMap();
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
        getLakeResourcesMap() {
      return internalGetLakeResources().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.cloud.metastore.v1alpha.Lake defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.LakeOrBuilder> map =
          internalGetMutableLakeResources().ensureBuilderMap();
      return map.containsKey(key) ? lakeResourcesConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.Lake getLakeResourcesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.LakeOrBuilder> map =
          internalGetMutableLakeResources().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return lakeResourcesConverter.build(map.get(key));
    }

    public Builder clearLakeResources() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableLakeResources().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    public Builder removeLakeResources(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLakeResources().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake>
        getMutableLakeResources() {
      bitField0_ |= 0x00000001;
      return internalGetMutableLakeResources().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    public Builder putLakeResources(
        java.lang.String key, com.google.cloud.metastore.v1alpha.Lake value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLakeResources().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    public Builder putAllLakeResources(
        java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.cloud.metastore.v1alpha.Lake> e :
          values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableLakeResources().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A reference to the Lake resources that this metastore service is attached
     * to. The key is the lake resource name. Example:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.metastore.v1alpha.Lake&gt; lake_resources = 1;</code>
     */
    public com.google.cloud.metastore.v1alpha.Lake.Builder putLakeResourcesBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, com.google.cloud.metastore.v1alpha.LakeOrBuilder> builderMap =
          internalGetMutableLakeResources().ensureBuilderMap();
      com.google.cloud.metastore.v1alpha.LakeOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.cloud.metastore.v1alpha.Lake.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.cloud.metastore.v1alpha.Lake) {
        entry = ((com.google.cloud.metastore.v1alpha.Lake) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.cloud.metastore.v1alpha.Lake.Builder) entry;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.DataplexConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.DataplexConfig)
  private static final com.google.cloud.metastore.v1alpha.DataplexConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1alpha.DataplexConfig();
  }

  public static com.google.cloud.metastore.v1alpha.DataplexConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataplexConfig> PARSER =
      new com.google.protobuf.AbstractParser<DataplexConfig>() {
        @java.lang.Override
        public DataplexConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataplexConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataplexConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataplexConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
