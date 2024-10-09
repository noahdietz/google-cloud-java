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
// source: google/area120/tables/v1alpha1/tables.proto

// Protobuf Java Version: 3.25.5
package com.google.area120.tables.v1alpha1;

/**
 *
 *
 * <pre>
 * A single row in a table.
 * </pre>
 *
 * Protobuf type {@code google.area120.tables.v1alpha1.Row}
 */
public final class Row extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.area120.tables.v1alpha1.Row)
    RowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Row() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Row();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_Row_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetValues();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.area120.tables.v1alpha1.Row.class,
            com.google.area120.tables.v1alpha1.Row.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The resource name of the row.
   * Row names have the form `tables/{table}/rows/{row}`.
   * The name is ignored when creating a row.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
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
   * The resource name of the row.
   * Row names have the form `tables/{table}/rows/{row}`.
   * The name is ignored when creating a row.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int VALUES_FIELD_NUMBER = 2;

  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.protobuf.Value>newDefaultInstance(
                    com.google.area120.tables.v1alpha1.TablesProto
                        .internal_static_google_area120_tables_v1alpha1_Row_ValuesEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.protobuf.Value.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value> values_;

  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Value>
      internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }

  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  @java.lang.Override
  public boolean containsValues(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetValues().getMap().containsKey(key);
  }
  /** Use {@link #getValuesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Value> getValues() {
    return getValuesMap();
  }
  /**
   *
   *
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.Value> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   *
   *
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.protobuf.Value getValuesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.protobuf.Value> map = internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Value getValuesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.protobuf.Value> map = internalGetValues().getMap();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetValues(), ValuesDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> entry :
        internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value> values__ =
          ValuesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, values__);
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
    if (!(obj instanceof com.google.area120.tables.v1alpha1.Row)) {
      return super.equals(obj);
    }
    com.google.area120.tables.v1alpha1.Row other = (com.google.area120.tables.v1alpha1.Row) obj;

    if (!getName().equals(other.getName())) return false;
    if (!internalGetValues().equals(other.internalGetValues())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.Row parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.Row parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.Row parseFrom(
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

  public static Builder newBuilder(com.google.area120.tables.v1alpha1.Row prototype) {
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
   * A single row in a table.
   * </pre>
   *
   * Protobuf type {@code google.area120.tables.v1alpha1.Row}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.area120.tables.v1alpha1.Row)
      com.google.area120.tables.v1alpha1.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_Row_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetValues();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableValues();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.area120.tables.v1alpha1.Row.class,
              com.google.area120.tables.v1alpha1.Row.Builder.class);
    }

    // Construct using com.google.area120.tables.v1alpha1.Row.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      internalGetMutableValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_Row_descriptor;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Row getDefaultInstanceForType() {
      return com.google.area120.tables.v1alpha1.Row.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Row build() {
      com.google.area120.tables.v1alpha1.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Row buildPartial() {
      com.google.area120.tables.v1alpha1.Row result =
          new com.google.area120.tables.v1alpha1.Row(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.area120.tables.v1alpha1.Row result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.values_ = internalGetValues().build(ValuesDefaultEntryHolder.defaultEntry);
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
      if (other instanceof com.google.area120.tables.v1alpha1.Row) {
        return mergeFrom((com.google.area120.tables.v1alpha1.Row) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.area120.tables.v1alpha1.Row other) {
      if (other == com.google.area120.tables.v1alpha1.Row.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableValues().mergeFrom(other.internalGetValues());
      bitField0_ |= 0x00000002;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value> values__ =
                    input.readMessage(
                        ValuesDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableValues()
                    .ensureBuilderMap()
                    .put(values__.getKey(), values__.getValue());
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the row.
     * Row names have the form `tables/{table}/rows/{row}`.
     * The name is ignored when creating a row.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The resource name of the row.
     * Row names have the form `tables/{table}/rows/{row}`.
     * The name is ignored when creating a row.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The resource name of the row.
     * Row names have the form `tables/{table}/rows/{row}`.
     * The name is ignored when creating a row.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the row.
     * Row names have the form `tables/{table}/rows/{row}`.
     * The name is ignored when creating a row.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the row.
     * Row names have the form `tables/{table}/rows/{row}`.
     * The name is ignored when creating a row.
     * </pre>
     *
     * <code>string name = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private static final class ValuesConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String, com.google.protobuf.ValueOrBuilder, com.google.protobuf.Value> {
      @java.lang.Override
      public com.google.protobuf.Value build(com.google.protobuf.ValueOrBuilder val) {
        if (val instanceof com.google.protobuf.Value) {
          return (com.google.protobuf.Value) val;
        }
        return ((com.google.protobuf.Value.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Value>
          defaultEntry() {
        return ValuesDefaultEntryHolder.defaultEntry;
      }
    };

    private static final ValuesConverter valuesConverter = new ValuesConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        values_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        internalGetValues() {
      if (values_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(valuesConverter);
      }
      return values_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.protobuf.ValueOrBuilder,
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder>
        internalGetMutableValues() {
      if (values_ == null) {
        values_ = new com.google.protobuf.MapFieldBuilder<>(valuesConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return values_;
    }

    public int getValuesCount() {
      return internalGetValues().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    @java.lang.Override
    public boolean containsValues(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetValues().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getValuesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getValues() {
      return getValuesMap();
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getValuesMap() {
      return internalGetValues().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.protobuf.Value getValuesOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.protobuf.Value defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> map =
          internalGetMutableValues().ensureBuilderMap();
      return map.containsKey(key) ? valuesConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Value getValuesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> map =
          internalGetMutableValues().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return valuesConverter.build(map.get(key));
    }

    public Builder clearValues() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableValues().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    public Builder removeValues(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableValues().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getMutableValues() {
      bitField0_ |= 0x00000002;
      return internalGetMutableValues().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    public Builder putValues(java.lang.String key, com.google.protobuf.Value value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableValues().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    public Builder putAllValues(java.util.Map<java.lang.String, com.google.protobuf.Value> values) {
      for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Value> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableValues().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The values of the row. This is a map of column key to value.
     * Key is user entered name(default) or the internal column id based on
     * the view in the request.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
     */
    public com.google.protobuf.Value.Builder putValuesBuilderIfAbsent(java.lang.String key) {
      java.util.Map<java.lang.String, com.google.protobuf.ValueOrBuilder> builderMap =
          internalGetMutableValues().ensureBuilderMap();
      com.google.protobuf.ValueOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.google.protobuf.Value.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.google.protobuf.Value) {
        entry = ((com.google.protobuf.Value) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.protobuf.Value.Builder) entry;
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

    // @@protoc_insertion_point(builder_scope:google.area120.tables.v1alpha1.Row)
  }

  // @@protoc_insertion_point(class_scope:google.area120.tables.v1alpha1.Row)
  private static final com.google.area120.tables.v1alpha1.Row DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.area120.tables.v1alpha1.Row();
  }

  public static com.google.area120.tables.v1alpha1.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row> PARSER =
      new com.google.protobuf.AbstractParser<Row>() {
        @java.lang.Override
        public Row parsePartialFrom(
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

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.area120.tables.v1alpha1.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
