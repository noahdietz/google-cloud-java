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
 * Details about a relationship column.
 * </pre>
 *
 * Protobuf type {@code google.area120.tables.v1alpha1.RelationshipDetails}
 */
public final class RelationshipDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.area120.tables.v1alpha1.RelationshipDetails)
    RelationshipDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RelationshipDetails.newBuilder() to construct.
  private RelationshipDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RelationshipDetails() {
    linkedTable_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RelationshipDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_RelationshipDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_RelationshipDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.area120.tables.v1alpha1.RelationshipDetails.class,
            com.google.area120.tables.v1alpha1.RelationshipDetails.Builder.class);
  }

  public static final int LINKED_TABLE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object linkedTable_ = "";
  /**
   *
   *
   * <pre>
   * The name of the table this relationship is linked to.
   * </pre>
   *
   * <code>string linked_table = 1;</code>
   *
   * @return The linkedTable.
   */
  @java.lang.Override
  public java.lang.String getLinkedTable() {
    java.lang.Object ref = linkedTable_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      linkedTable_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the table this relationship is linked to.
   * </pre>
   *
   * <code>string linked_table = 1;</code>
   *
   * @return The bytes for linkedTable.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLinkedTableBytes() {
    java.lang.Object ref = linkedTable_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      linkedTable_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(linkedTable_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, linkedTable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(linkedTable_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, linkedTable_);
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
    if (!(obj instanceof com.google.area120.tables.v1alpha1.RelationshipDetails)) {
      return super.equals(obj);
    }
    com.google.area120.tables.v1alpha1.RelationshipDetails other =
        (com.google.area120.tables.v1alpha1.RelationshipDetails) obj;

    if (!getLinkedTable().equals(other.getLinkedTable())) return false;
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
    hash = (37 * hash) + LINKED_TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getLinkedTable().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails parseFrom(
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
      com.google.area120.tables.v1alpha1.RelationshipDetails prototype) {
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
   * Details about a relationship column.
   * </pre>
   *
   * Protobuf type {@code google.area120.tables.v1alpha1.RelationshipDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.area120.tables.v1alpha1.RelationshipDetails)
      com.google.area120.tables.v1alpha1.RelationshipDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_RelationshipDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_RelationshipDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.area120.tables.v1alpha1.RelationshipDetails.class,
              com.google.area120.tables.v1alpha1.RelationshipDetails.Builder.class);
    }

    // Construct using com.google.area120.tables.v1alpha1.RelationshipDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      linkedTable_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_RelationshipDetails_descriptor;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.RelationshipDetails getDefaultInstanceForType() {
      return com.google.area120.tables.v1alpha1.RelationshipDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.RelationshipDetails build() {
      com.google.area120.tables.v1alpha1.RelationshipDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.RelationshipDetails buildPartial() {
      com.google.area120.tables.v1alpha1.RelationshipDetails result =
          new com.google.area120.tables.v1alpha1.RelationshipDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.area120.tables.v1alpha1.RelationshipDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.linkedTable_ = linkedTable_;
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
      if (other instanceof com.google.area120.tables.v1alpha1.RelationshipDetails) {
        return mergeFrom((com.google.area120.tables.v1alpha1.RelationshipDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.area120.tables.v1alpha1.RelationshipDetails other) {
      if (other == com.google.area120.tables.v1alpha1.RelationshipDetails.getDefaultInstance())
        return this;
      if (!other.getLinkedTable().isEmpty()) {
        linkedTable_ = other.linkedTable_;
        bitField0_ |= 0x00000001;
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
                linkedTable_ = input.readStringRequireUtf8();
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

    private java.lang.Object linkedTable_ = "";
    /**
     *
     *
     * <pre>
     * The name of the table this relationship is linked to.
     * </pre>
     *
     * <code>string linked_table = 1;</code>
     *
     * @return The linkedTable.
     */
    public java.lang.String getLinkedTable() {
      java.lang.Object ref = linkedTable_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        linkedTable_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the table this relationship is linked to.
     * </pre>
     *
     * <code>string linked_table = 1;</code>
     *
     * @return The bytes for linkedTable.
     */
    public com.google.protobuf.ByteString getLinkedTableBytes() {
      java.lang.Object ref = linkedTable_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        linkedTable_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the table this relationship is linked to.
     * </pre>
     *
     * <code>string linked_table = 1;</code>
     *
     * @param value The linkedTable to set.
     * @return This builder for chaining.
     */
    public Builder setLinkedTable(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      linkedTable_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the table this relationship is linked to.
     * </pre>
     *
     * <code>string linked_table = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLinkedTable() {
      linkedTable_ = getDefaultInstance().getLinkedTable();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the table this relationship is linked to.
     * </pre>
     *
     * <code>string linked_table = 1;</code>
     *
     * @param value The bytes for linkedTable to set.
     * @return This builder for chaining.
     */
    public Builder setLinkedTableBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      linkedTable_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.area120.tables.v1alpha1.RelationshipDetails)
  }

  // @@protoc_insertion_point(class_scope:google.area120.tables.v1alpha1.RelationshipDetails)
  private static final com.google.area120.tables.v1alpha1.RelationshipDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.area120.tables.v1alpha1.RelationshipDetails();
  }

  public static com.google.area120.tables.v1alpha1.RelationshipDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationshipDetails> PARSER =
      new com.google.protobuf.AbstractParser<RelationshipDetails>() {
        @java.lang.Override
        public RelationshipDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationshipDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationshipDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.area120.tables.v1alpha1.RelationshipDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
