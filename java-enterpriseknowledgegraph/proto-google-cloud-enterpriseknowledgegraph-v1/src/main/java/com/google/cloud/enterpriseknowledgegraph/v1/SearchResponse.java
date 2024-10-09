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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.enterpriseknowledgegraph.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [EnterpriseKnowledgeGraphService.Search][google.cloud.enterpriseknowledgegraph.v1.EnterpriseKnowledgeGraphService.Search].
 * </pre>
 *
 * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.SearchResponse}
 */
public final class SearchResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.enterpriseknowledgegraph.v1.SearchResponse)
    SearchResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchResponse.newBuilder() to construct.
  private SearchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
        .internal_static_google_cloud_enterpriseknowledgegraph_v1_SearchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
        .internal_static_google_cloud_enterpriseknowledgegraph_v1_SearchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.class,
            com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CONTEXT_FIELD_NUMBER = 1;
  private com.google.protobuf.Value context_;
  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   *
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   *
   * @return The context.
   */
  @java.lang.Override
  public com.google.protobuf.Value getContext() {
    return context_ == null ? com.google.protobuf.Value.getDefaultInstance() : context_;
  }
  /**
   *
   *
   * <pre>
   * The local context applicable for the response. See more details at
   * http://www.w3.org/TR/json-ld/#context-definitions.
   * </pre>
   *
   * <code>.google.protobuf.Value context = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getContextOrBuilder() {
    return context_ == null ? com.google.protobuf.Value.getDefaultInstance() : context_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.Value type_;
  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   *
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.protobuf.Value getType() {
    return type_ == null ? com.google.protobuf.Value.getDefaultInstance() : type_;
  }
  /**
   *
   *
   * <pre>
   * The schema type of top-level JSON-LD object, e.g. ItemList.
   * </pre>
   *
   * <code>.google.protobuf.Value type = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getTypeOrBuilder() {
    return type_ == null ? com.google.protobuf.Value.getDefaultInstance() : type_;
  }

  public static final int ITEM_LIST_ELEMENT_FIELD_NUMBER = 3;
  private com.google.protobuf.ListValue itemListElement_;
  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   *
   * @return Whether the itemListElement field is set.
   */
  @java.lang.Override
  public boolean hasItemListElement() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   *
   * @return The itemListElement.
   */
  @java.lang.Override
  public com.google.protobuf.ListValue getItemListElement() {
    return itemListElement_ == null
        ? com.google.protobuf.ListValue.getDefaultInstance()
        : itemListElement_;
  }
  /**
   *
   *
   * <pre>
   * The item list of search results.
   * </pre>
   *
   * <code>.google.protobuf.ListValue item_list_element = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ListValueOrBuilder getItemListElementOrBuilder() {
    return itemListElement_ == null
        ? com.google.protobuf.ListValue.getDefaultInstance()
        : itemListElement_;
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
      output.writeMessage(1, getContext());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getType());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getItemListElement());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getContext());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getType());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getItemListElement());
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
    if (!(obj instanceof com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse other =
        (com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse) obj;

    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext().equals(other.getContext())) return false;
    }
    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (!getType().equals(other.getType())) return false;
    }
    if (hasItemListElement() != other.hasItemListElement()) return false;
    if (hasItemListElement()) {
      if (!getItemListElement().equals(other.getItemListElement())) return false;
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
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    if (hasItemListElement()) {
      hash = (37 * hash) + ITEM_LIST_ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getItemListElement().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse parseFrom(
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
      com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse prototype) {
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
   * [EnterpriseKnowledgeGraphService.Search][google.cloud.enterpriseknowledgegraph.v1.EnterpriseKnowledgeGraphService.Search].
   * </pre>
   *
   * Protobuf type {@code google.cloud.enterpriseknowledgegraph.v1.SearchResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.enterpriseknowledgegraph.v1.SearchResponse)
      com.google.cloud.enterpriseknowledgegraph.v1.SearchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_SearchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_SearchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.class,
              com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.Builder.class);
    }

    // Construct using com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getContextFieldBuilder();
        getTypeFieldBuilder();
        getItemListElementFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      type_ = null;
      if (typeBuilder_ != null) {
        typeBuilder_.dispose();
        typeBuilder_ = null;
      }
      itemListElement_ = null;
      if (itemListElementBuilder_ != null) {
        itemListElementBuilder_.dispose();
        itemListElementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.ServiceProto
          .internal_static_google_cloud_enterpriseknowledgegraph_v1_SearchResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse getDefaultInstanceForType() {
      return com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse build() {
      com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse buildPartial() {
      com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse result =
          new com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.context_ = contextBuilder_ == null ? context_ : contextBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = typeBuilder_ == null ? type_ : typeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.itemListElement_ =
            itemListElementBuilder_ == null ? itemListElement_ : itemListElementBuilder_.build();
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse) {
        return mergeFrom((com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse other) {
      if (other == com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse.getDefaultInstance())
        return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      if (other.hasItemListElement()) {
        mergeItemListElement(other.getItemListElement());
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
                input.readMessage(getContextFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTypeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getItemListElementFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
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

    private com.google.protobuf.Value context_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        contextBuilder_;
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     *
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     *
     * @return The context.
     */
    public com.google.protobuf.Value getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? com.google.protobuf.Value.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public Builder setContext(com.google.protobuf.Value value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
      } else {
        contextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public Builder setContext(com.google.protobuf.Value.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public Builder mergeContext(com.google.protobuf.Value value) {
      if (contextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && context_ != null
            && context_ != com.google.protobuf.Value.getDefaultInstance()) {
          getContextBuilder().mergeFrom(value);
        } else {
          context_ = value;
        }
      } else {
        contextBuilder_.mergeFrom(value);
      }
      if (context_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public Builder clearContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public com.google.protobuf.Value.Builder getContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    public com.google.protobuf.ValueOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ? com.google.protobuf.Value.getDefaultInstance() : context_;
      }
    }
    /**
     *
     *
     * <pre>
     * The local context applicable for the response. See more details at
     * http://www.w3.org/TR/json-ld/#context-definitions.
     * </pre>
     *
     * <code>.google.protobuf.Value context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Value,
                com.google.protobuf.Value.Builder,
                com.google.protobuf.ValueOrBuilder>(
                getContext(), getParentForChildren(), isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private com.google.protobuf.Value type_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        typeBuilder_;
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     *
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     *
     * @return The type.
     */
    public com.google.protobuf.Value getType() {
      if (typeBuilder_ == null) {
        return type_ == null ? com.google.protobuf.Value.getDefaultInstance() : type_;
      } else {
        return typeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public Builder setType(com.google.protobuf.Value value) {
      if (typeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
      } else {
        typeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public Builder setType(com.google.protobuf.Value.Builder builderForValue) {
      if (typeBuilder_ == null) {
        type_ = builderForValue.build();
      } else {
        typeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public Builder mergeType(com.google.protobuf.Value value) {
      if (typeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && type_ != null
            && type_ != com.google.protobuf.Value.getDefaultInstance()) {
          getTypeBuilder().mergeFrom(value);
        } else {
          type_ = value;
        }
      } else {
        typeBuilder_.mergeFrom(value);
      }
      if (type_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = null;
      if (typeBuilder_ != null) {
        typeBuilder_.dispose();
        typeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public com.google.protobuf.Value.Builder getTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    public com.google.protobuf.ValueOrBuilder getTypeOrBuilder() {
      if (typeBuilder_ != null) {
        return typeBuilder_.getMessageOrBuilder();
      } else {
        return type_ == null ? com.google.protobuf.Value.getDefaultInstance() : type_;
      }
    }
    /**
     *
     *
     * <pre>
     * The schema type of top-level JSON-LD object, e.g. ItemList.
     * </pre>
     *
     * <code>.google.protobuf.Value type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        getTypeFieldBuilder() {
      if (typeBuilder_ == null) {
        typeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Value,
                com.google.protobuf.Value.Builder,
                com.google.protobuf.ValueOrBuilder>(getType(), getParentForChildren(), isClean());
        type_ = null;
      }
      return typeBuilder_;
    }

    private com.google.protobuf.ListValue itemListElement_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.ListValue,
            com.google.protobuf.ListValue.Builder,
            com.google.protobuf.ListValueOrBuilder>
        itemListElementBuilder_;
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     *
     * @return Whether the itemListElement field is set.
     */
    public boolean hasItemListElement() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     *
     * @return The itemListElement.
     */
    public com.google.protobuf.ListValue getItemListElement() {
      if (itemListElementBuilder_ == null) {
        return itemListElement_ == null
            ? com.google.protobuf.ListValue.getDefaultInstance()
            : itemListElement_;
      } else {
        return itemListElementBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public Builder setItemListElement(com.google.protobuf.ListValue value) {
      if (itemListElementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        itemListElement_ = value;
      } else {
        itemListElementBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public Builder setItemListElement(com.google.protobuf.ListValue.Builder builderForValue) {
      if (itemListElementBuilder_ == null) {
        itemListElement_ = builderForValue.build();
      } else {
        itemListElementBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public Builder mergeItemListElement(com.google.protobuf.ListValue value) {
      if (itemListElementBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && itemListElement_ != null
            && itemListElement_ != com.google.protobuf.ListValue.getDefaultInstance()) {
          getItemListElementBuilder().mergeFrom(value);
        } else {
          itemListElement_ = value;
        }
      } else {
        itemListElementBuilder_.mergeFrom(value);
      }
      if (itemListElement_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public Builder clearItemListElement() {
      bitField0_ = (bitField0_ & ~0x00000004);
      itemListElement_ = null;
      if (itemListElementBuilder_ != null) {
        itemListElementBuilder_.dispose();
        itemListElementBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public com.google.protobuf.ListValue.Builder getItemListElementBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getItemListElementFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    public com.google.protobuf.ListValueOrBuilder getItemListElementOrBuilder() {
      if (itemListElementBuilder_ != null) {
        return itemListElementBuilder_.getMessageOrBuilder();
      } else {
        return itemListElement_ == null
            ? com.google.protobuf.ListValue.getDefaultInstance()
            : itemListElement_;
      }
    }
    /**
     *
     *
     * <pre>
     * The item list of search results.
     * </pre>
     *
     * <code>.google.protobuf.ListValue item_list_element = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.ListValue,
            com.google.protobuf.ListValue.Builder,
            com.google.protobuf.ListValueOrBuilder>
        getItemListElementFieldBuilder() {
      if (itemListElementBuilder_ == null) {
        itemListElementBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.ListValue,
                com.google.protobuf.ListValue.Builder,
                com.google.protobuf.ListValueOrBuilder>(
                getItemListElement(), getParentForChildren(), isClean());
        itemListElement_ = null;
      }
      return itemListElementBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.enterpriseknowledgegraph.v1.SearchResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.enterpriseknowledgegraph.v1.SearchResponse)
  private static final com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse();
  }

  public static com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchResponse>() {
        @java.lang.Override
        public SearchResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.enterpriseknowledgegraph.v1.SearchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
