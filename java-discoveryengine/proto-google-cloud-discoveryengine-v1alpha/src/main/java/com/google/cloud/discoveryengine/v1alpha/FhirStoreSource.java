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
// source: google/cloud/discoveryengine/v1alpha/import_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Cloud FhirStore source import data from.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.FhirStoreSource}
 */
public final class FhirStoreSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.FhirStoreSource)
    FhirStoreSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FhirStoreSource.newBuilder() to construct.
  private FhirStoreSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FhirStoreSource() {
    fhirStore_ = "";
    gcsStagingDir_ = "";
    resourceTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FhirStoreSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.class,
            com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.Builder.class);
  }

  public static final int FHIR_STORE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fhirStore_ = "";
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the FHIR store to import data from, in
   * the format of
   * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
   * </pre>
   *
   * <code>
   * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The fhirStore.
   */
  @java.lang.Override
  public java.lang.String getFhirStore() {
    java.lang.Object ref = fhirStore_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fhirStore_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the FHIR store to import data from, in
   * the format of
   * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
   * </pre>
   *
   * <code>
   * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for fhirStore.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFhirStoreBytes() {
    java.lang.Object ref = fhirStore_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fhirStore_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_STAGING_DIR_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gcsStagingDir_ = "";
  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * FhirStore export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 2;</code>
   *
   * @return The gcsStagingDir.
   */
  @java.lang.Override
  public java.lang.String getGcsStagingDir() {
    java.lang.Object ref = gcsStagingDir_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsStagingDir_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * FhirStore export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 2;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcsStagingDirBytes() {
    java.lang.Object ref = gcsStagingDir_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcsStagingDir_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPES_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList resourceTypes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @return A list containing the resourceTypes.
   */
  public com.google.protobuf.ProtocolStringList getResourceTypesList() {
    return resourceTypes_;
  }
  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @return The count of resourceTypes.
   */
  public int getResourceTypesCount() {
    return resourceTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceTypes at the given index.
   */
  public java.lang.String getResourceTypes(int index) {
    return resourceTypes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The FHIR resource types to import. The resource types should be a subset of
   * all [supported FHIR resource
   * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
   * Default to all supported FHIR resource types if empty.
   * </pre>
   *
   * <code>repeated string resource_types = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceTypes at the given index.
   */
  public com.google.protobuf.ByteString getResourceTypesBytes(int index) {
    return resourceTypes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fhirStore_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fhirStore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsStagingDir_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gcsStagingDir_);
    }
    for (int i = 0; i < resourceTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resourceTypes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fhirStore_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fhirStore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsStagingDir_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gcsStagingDir_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resourceTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceTypesList().size();
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.FhirStoreSource)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.FhirStoreSource other =
        (com.google.cloud.discoveryengine.v1alpha.FhirStoreSource) obj;

    if (!getFhirStore().equals(other.getFhirStore())) return false;
    if (!getGcsStagingDir().equals(other.getGcsStagingDir())) return false;
    if (!getResourceTypesList().equals(other.getResourceTypesList())) return false;
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
    hash = (37 * hash) + FHIR_STORE_FIELD_NUMBER;
    hash = (53 * hash) + getFhirStore().hashCode();
    hash = (37 * hash) + GCS_STAGING_DIR_FIELD_NUMBER;
    hash = (53 * hash) + getGcsStagingDir().hashCode();
    if (getResourceTypesCount() > 0) {
      hash = (37 * hash) + RESOURCE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getResourceTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource parseFrom(
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
      com.google.cloud.discoveryengine.v1alpha.FhirStoreSource prototype) {
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
   * Cloud FhirStore source import data from.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.FhirStoreSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.FhirStoreSource)
      com.google.cloud.discoveryengine.v1alpha.FhirStoreSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.class,
              com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fhirStore_ = "";
      gcsStagingDir_ = "";
      resourceTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.FhirStoreSource getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.FhirStoreSource build() {
      com.google.cloud.discoveryengine.v1alpha.FhirStoreSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.FhirStoreSource buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.FhirStoreSource result =
          new com.google.cloud.discoveryengine.v1alpha.FhirStoreSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1alpha.FhirStoreSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fhirStore_ = fhirStore_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gcsStagingDir_ = gcsStagingDir_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        resourceTypes_.makeImmutable();
        result.resourceTypes_ = resourceTypes_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.FhirStoreSource) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.FhirStoreSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.FhirStoreSource other) {
      if (other == com.google.cloud.discoveryengine.v1alpha.FhirStoreSource.getDefaultInstance())
        return this;
      if (!other.getFhirStore().isEmpty()) {
        fhirStore_ = other.fhirStore_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGcsStagingDir().isEmpty()) {
        gcsStagingDir_ = other.gcsStagingDir_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.resourceTypes_.isEmpty()) {
        if (resourceTypes_.isEmpty()) {
          resourceTypes_ = other.resourceTypes_;
          bitField0_ |= 0x00000004;
        } else {
          ensureResourceTypesIsMutable();
          resourceTypes_.addAll(other.resourceTypes_);
        }
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
            case 10:
              {
                fhirStore_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                gcsStagingDir_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureResourceTypesIsMutable();
                resourceTypes_.add(s);
                break;
              } // case 26
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

    private java.lang.Object fhirStore_ = "";
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the FHIR store to import data from, in
     * the format of
     * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
     * </pre>
     *
     * <code>
     * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The fhirStore.
     */
    public java.lang.String getFhirStore() {
      java.lang.Object ref = fhirStore_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fhirStore_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the FHIR store to import data from, in
     * the format of
     * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
     * </pre>
     *
     * <code>
     * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for fhirStore.
     */
    public com.google.protobuf.ByteString getFhirStoreBytes() {
      java.lang.Object ref = fhirStore_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fhirStore_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the FHIR store to import data from, in
     * the format of
     * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
     * </pre>
     *
     * <code>
     * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The fhirStore to set.
     * @return This builder for chaining.
     */
    public Builder setFhirStore(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fhirStore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the FHIR store to import data from, in
     * the format of
     * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
     * </pre>
     *
     * <code>
     * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFhirStore() {
      fhirStore_ = getDefaultInstance().getFhirStore();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the FHIR store to import data from, in
     * the format of
     * `projects/{project}/locations/{location}/datasets/{dataset}/fhirStores/{fhir_store}`.
     * </pre>
     *
     * <code>
     * string fhir_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for fhirStore to set.
     * @return This builder for chaining.
     */
    public Builder setFhirStoreBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fhirStore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object gcsStagingDir_ = "";
    /**
     *
     *
     * <pre>
     * Intermediate Cloud Storage directory used for the import with a length
     * limit of 2,000 characters. Can be specified if one wants to have the
     * FhirStore export to a specific Cloud Storage directory.
     * </pre>
     *
     * <code>string gcs_staging_dir = 2;</code>
     *
     * @return The gcsStagingDir.
     */
    public java.lang.String getGcsStagingDir() {
      java.lang.Object ref = gcsStagingDir_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsStagingDir_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Intermediate Cloud Storage directory used for the import with a length
     * limit of 2,000 characters. Can be specified if one wants to have the
     * FhirStore export to a specific Cloud Storage directory.
     * </pre>
     *
     * <code>string gcs_staging_dir = 2;</code>
     *
     * @return The bytes for gcsStagingDir.
     */
    public com.google.protobuf.ByteString getGcsStagingDirBytes() {
      java.lang.Object ref = gcsStagingDir_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcsStagingDir_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Intermediate Cloud Storage directory used for the import with a length
     * limit of 2,000 characters. Can be specified if one wants to have the
     * FhirStore export to a specific Cloud Storage directory.
     * </pre>
     *
     * <code>string gcs_staging_dir = 2;</code>
     *
     * @param value The gcsStagingDir to set.
     * @return This builder for chaining.
     */
    public Builder setGcsStagingDir(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gcsStagingDir_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Intermediate Cloud Storage directory used for the import with a length
     * limit of 2,000 characters. Can be specified if one wants to have the
     * FhirStore export to a specific Cloud Storage directory.
     * </pre>
     *
     * <code>string gcs_staging_dir = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsStagingDir() {
      gcsStagingDir_ = getDefaultInstance().getGcsStagingDir();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Intermediate Cloud Storage directory used for the import with a length
     * limit of 2,000 characters. Can be specified if one wants to have the
     * FhirStore export to a specific Cloud Storage directory.
     * </pre>
     *
     * <code>string gcs_staging_dir = 2;</code>
     *
     * @param value The bytes for gcsStagingDir to set.
     * @return This builder for chaining.
     */
    public Builder setGcsStagingDirBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gcsStagingDir_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList resourceTypes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureResourceTypesIsMutable() {
      if (!resourceTypes_.isModifiable()) {
        resourceTypes_ = new com.google.protobuf.LazyStringArrayList(resourceTypes_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @return A list containing the resourceTypes.
     */
    public com.google.protobuf.ProtocolStringList getResourceTypesList() {
      resourceTypes_.makeImmutable();
      return resourceTypes_;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @return The count of resourceTypes.
     */
    public int getResourceTypesCount() {
      return resourceTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The resourceTypes at the given index.
     */
    public java.lang.String getResourceTypes(int index) {
      return resourceTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the resourceTypes at the given index.
     */
    public com.google.protobuf.ByteString getResourceTypesBytes(int index) {
      return resourceTypes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The resourceTypes to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceTypesIsMutable();
      resourceTypes_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param value The resourceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addResourceTypes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceTypesIsMutable();
      resourceTypes_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param values The resourceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceTypes(java.lang.Iterable<java.lang.String> values) {
      ensureResourceTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceTypes_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceTypes() {
      resourceTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FHIR resource types to import. The resource types should be a subset of
     * all [supported FHIR resource
     * types](https://cloud.google.com/generative-ai-app-builder/docs/fhir-schema-reference#resource-level-specification).
     * Default to all supported FHIR resource types if empty.
     * </pre>
     *
     * <code>repeated string resource_types = 3;</code>
     *
     * @param value The bytes of the resourceTypes to add.
     * @return This builder for chaining.
     */
    public Builder addResourceTypesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureResourceTypesIsMutable();
      resourceTypes_.add(value);
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.FhirStoreSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.FhirStoreSource)
  private static final com.google.cloud.discoveryengine.v1alpha.FhirStoreSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.FhirStoreSource();
  }

  public static com.google.cloud.discoveryengine.v1alpha.FhirStoreSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FhirStoreSource> PARSER =
      new com.google.protobuf.AbstractParser<FhirStoreSource>() {
        @java.lang.Override
        public FhirStoreSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<FhirStoreSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FhirStoreSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.FhirStoreSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
