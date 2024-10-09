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
// source: google/appengine/v1/audit_data.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Detailed information about UpdateService call.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.UpdateServiceMethod}
 */
public final class UpdateServiceMethod extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.UpdateServiceMethod)
    UpdateServiceMethodOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateServiceMethod.newBuilder() to construct.
  private UpdateServiceMethod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateServiceMethod() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateServiceMethod();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AuditDataProto
        .internal_static_google_appengine_v1_UpdateServiceMethod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AuditDataProto
        .internal_static_google_appengine_v1_UpdateServiceMethod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.UpdateServiceMethod.class,
            com.google.appengine.v1.UpdateServiceMethod.Builder.class);
  }

  private int bitField0_;
  public static final int REQUEST_FIELD_NUMBER = 1;
  private com.google.appengine.v1.UpdateServiceRequest request_;
  /**
   *
   *
   * <pre>
   * Update service request.
   * </pre>
   *
   * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
   *
   * @return Whether the request field is set.
   */
  @java.lang.Override
  public boolean hasRequest() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Update service request.
   * </pre>
   *
   * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
   *
   * @return The request.
   */
  @java.lang.Override
  public com.google.appengine.v1.UpdateServiceRequest getRequest() {
    return request_ == null
        ? com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()
        : request_;
  }
  /**
   *
   *
   * <pre>
   * Update service request.
   * </pre>
   *
   * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.UpdateServiceRequestOrBuilder getRequestOrBuilder() {
    return request_ == null
        ? com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()
        : request_;
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
      output.writeMessage(1, getRequest());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRequest());
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
    if (!(obj instanceof com.google.appengine.v1.UpdateServiceMethod)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.UpdateServiceMethod other =
        (com.google.appengine.v1.UpdateServiceMethod) obj;

    if (hasRequest() != other.hasRequest()) return false;
    if (hasRequest()) {
      if (!getRequest().equals(other.getRequest())) return false;
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
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.UpdateServiceMethod parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.UpdateServiceMethod prototype) {
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
   * Detailed information about UpdateService call.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.UpdateServiceMethod}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.UpdateServiceMethod)
      com.google.appengine.v1.UpdateServiceMethodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AuditDataProto
          .internal_static_google_appengine_v1_UpdateServiceMethod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AuditDataProto
          .internal_static_google_appengine_v1_UpdateServiceMethod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.UpdateServiceMethod.class,
              com.google.appengine.v1.UpdateServiceMethod.Builder.class);
    }

    // Construct using com.google.appengine.v1.UpdateServiceMethod.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRequestFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AuditDataProto
          .internal_static_google_appengine_v1_UpdateServiceMethod_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateServiceMethod getDefaultInstanceForType() {
      return com.google.appengine.v1.UpdateServiceMethod.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateServiceMethod build() {
      com.google.appengine.v1.UpdateServiceMethod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateServiceMethod buildPartial() {
      com.google.appengine.v1.UpdateServiceMethod result =
          new com.google.appengine.v1.UpdateServiceMethod(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.UpdateServiceMethod result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.request_ = requestBuilder_ == null ? request_ : requestBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.appengine.v1.UpdateServiceMethod) {
        return mergeFrom((com.google.appengine.v1.UpdateServiceMethod) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.UpdateServiceMethod other) {
      if (other == com.google.appengine.v1.UpdateServiceMethod.getDefaultInstance()) return this;
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
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
                input.readMessage(getRequestFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.appengine.v1.UpdateServiceRequest request_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.UpdateServiceRequest,
            com.google.appengine.v1.UpdateServiceRequest.Builder,
            com.google.appengine.v1.UpdateServiceRequestOrBuilder>
        requestBuilder_;
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     *
     * @return Whether the request field is set.
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     *
     * @return The request.
     */
    public com.google.appengine.v1.UpdateServiceRequest getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null
            ? com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()
            : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public Builder setRequest(com.google.appengine.v1.UpdateServiceRequest value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
      } else {
        requestBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public Builder setRequest(
        com.google.appengine.v1.UpdateServiceRequest.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public Builder mergeRequest(com.google.appengine.v1.UpdateServiceRequest value) {
      if (requestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && request_ != null
            && request_ != com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()) {
          getRequestBuilder().mergeFrom(value);
        } else {
          request_ = value;
        }
      } else {
        requestBuilder_.mergeFrom(value);
      }
      if (request_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public Builder clearRequest() {
      bitField0_ = (bitField0_ & ~0x00000001);
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public com.google.appengine.v1.UpdateServiceRequest.Builder getRequestBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    public com.google.appengine.v1.UpdateServiceRequestOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null
            ? com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()
            : request_;
      }
    }
    /**
     *
     *
     * <pre>
     * Update service request.
     * </pre>
     *
     * <code>.google.appengine.v1.UpdateServiceRequest request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.UpdateServiceRequest,
            com.google.appengine.v1.UpdateServiceRequest.Builder,
            com.google.appengine.v1.UpdateServiceRequestOrBuilder>
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.appengine.v1.UpdateServiceRequest,
                com.google.appengine.v1.UpdateServiceRequest.Builder,
                com.google.appengine.v1.UpdateServiceRequestOrBuilder>(
                getRequest(), getParentForChildren(), isClean());
        request_ = null;
      }
      return requestBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.UpdateServiceMethod)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.UpdateServiceMethod)
  private static final com.google.appengine.v1.UpdateServiceMethod DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.UpdateServiceMethod();
  }

  public static com.google.appengine.v1.UpdateServiceMethod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateServiceMethod> PARSER =
      new com.google.protobuf.AbstractParser<UpdateServiceMethod>() {
        @java.lang.Override
        public UpdateServiceMethod parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateServiceMethod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateServiceMethod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.UpdateServiceMethod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
