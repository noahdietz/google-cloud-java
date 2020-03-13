/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/servicedirectory/v1beta1/namespace.proto

package com.google.cloud.servicedirectory.v1beta1;

/**
 *
 *
 * <pre>
 * A container for [services][google.cloud.servicedirectory.v1beta1.Service].
 * Namespaces allow administrators to group services together and define
 * permissions for a collection of services.
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1beta1.Namespace}
 */
public final class Namespace extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1beta1.Namespace)
    NamespaceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Namespace.newBuilder() to construct.
  private Namespace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Namespace() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Namespace();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Namespace(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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

              name_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                labels_ =
                    com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
                  input.readMessage(
                      LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              labels_.getMutableMap().put(labels__.getKey(), labels__.getValue());
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.servicedirectory.v1beta1.NamespaceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetLabels();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1beta1.NamespaceProto
        .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1beta1.Namespace.class,
            com.google.cloud.servicedirectory.v1beta1.Namespace.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Immutable. The resource name for the namespace in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. The resource name for the namespace in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;

  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.servicedirectory.v1beta1.NamespaceProto
                .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public boolean containsLabels(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetLabels().getMap().containsKey(key);
  }
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Optional. Resource labels associated with this Namespace.
   * No more than 64 user labels can be associated with a given resource.  Label
   * keys and values can be no longer than 63 characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public java.lang.String getLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
          LabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, labels__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.servicedirectory.v1beta1.Namespace)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1beta1.Namespace other =
        (com.google.cloud.servicedirectory.v1beta1.Namespace) obj;

    if (!getName().equals(other.getName())) return false;
    if (!internalGetLabels().equals(other.internalGetLabels())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace parseFrom(
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

  public static Builder newBuilder(com.google.cloud.servicedirectory.v1beta1.Namespace prototype) {
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
   * A container for [services][google.cloud.servicedirectory.v1beta1.Service].
   * Namespaces allow administrators to group services together and define
   * permissions for a collection of services.
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1beta1.Namespace}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1beta1.Namespace)
      com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.servicedirectory.v1beta1.NamespaceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1beta1.NamespaceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1beta1.Namespace.class,
              com.google.cloud.servicedirectory.v1beta1.Namespace.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1beta1.Namespace.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1beta1.NamespaceProto
          .internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.Namespace getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.Namespace build() {
      com.google.cloud.servicedirectory.v1beta1.Namespace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.Namespace buildPartial() {
      com.google.cloud.servicedirectory.v1beta1.Namespace result =
          new com.google.cloud.servicedirectory.v1beta1.Namespace(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.labels_ = internalGetLabels();
      result.labels_.makeImmutable();
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.servicedirectory.v1beta1.Namespace) {
        return mergeFrom((com.google.cloud.servicedirectory.v1beta1.Namespace) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1beta1.Namespace other) {
      if (other == com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(other.internalGetLabels());
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.servicedirectory.v1beta1.Namespace parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.servicedirectory.v1beta1.Namespace) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. The resource name for the namespace in the format
     * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The resource name for the namespace in the format
     * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The resource name for the namespace in the format
     * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The resource name for the namespace in the format
     * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The resource name for the namespace in the format
     * 'projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;'.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      onChanged();
      ;
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public boolean containsLabels(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetLabels().getMap().containsKey(key);
    }
    /** Use {@link #getLabelsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.lang.String getLabelsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.lang.String getLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      internalGetMutableLabels().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder removeLabels(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableLabels().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabels() {
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder putLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableLabels().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource labels associated with this Namespace.
     * No more than 64 user labels can be associated with a given resource.  Label
     * keys and values can be no longer than 63 characters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder putAllLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1beta1.Namespace)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1beta1.Namespace)
  private static final com.google.cloud.servicedirectory.v1beta1.Namespace DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1beta1.Namespace();
  }

  public static com.google.cloud.servicedirectory.v1beta1.Namespace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Namespace> PARSER =
      new com.google.protobuf.AbstractParser<Namespace>() {
        @java.lang.Override
        public Namespace parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Namespace(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Namespace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Namespace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.Namespace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
