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
// source: google/cloud/retail/v2/import_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2;

/**
 *
 *
 * <pre>
 * Response of the
 * [ImportProductsRequest][google.cloud.retail.v2.ImportProductsRequest]. If the
 * long running operation is done, then this message is returned by the
 * google.longrunning.Operations.response field if the operation was successful.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.ImportProductsResponse}
 */
public final class ImportProductsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.ImportProductsResponse)
    ImportProductsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportProductsResponse.newBuilder() to construct.
  private ImportProductsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportProductsResponse() {
    errorSamples_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportProductsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2.ImportConfigProto
        .internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ImportConfigProto
        .internal_static_google_cloud_retail_v2_ImportProductsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.ImportProductsResponse.class,
            com.google.cloud.retail.v2.ImportProductsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_SAMPLES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.rpc.Status> errorSamples_;
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getErrorSamplesList() {
    return errorSamples_;
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList() {
    return errorSamples_;
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public int getErrorSamplesCount() {
    return errorSamples_.size();
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getErrorSamples(int index) {
    return errorSamples_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index) {
    return errorSamples_.get(index);
  }

  public static final int ERRORS_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2.ImportErrorsConfig errorsConfig_;
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
   *
   * @return Whether the errorsConfig field is set.
   */
  @java.lang.Override
  public boolean hasErrorsConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
   *
   * @return The errorsConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig() {
    return errorsConfig_ == null
        ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()
        : errorsConfig_;
  }
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder() {
    return errorsConfig_ == null
        ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()
        : errorsConfig_;
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
    for (int i = 0; i < errorSamples_.size(); i++) {
      output.writeMessage(1, errorSamples_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getErrorsConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errorSamples_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, errorSamples_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getErrorsConfig());
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
    if (!(obj instanceof com.google.cloud.retail.v2.ImportProductsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.ImportProductsResponse other =
        (com.google.cloud.retail.v2.ImportProductsResponse) obj;

    if (!getErrorSamplesList().equals(other.getErrorSamplesList())) return false;
    if (hasErrorsConfig() != other.hasErrorsConfig()) return false;
    if (hasErrorsConfig()) {
      if (!getErrorsConfig().equals(other.getErrorsConfig())) return false;
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
    if (getErrorSamplesCount() > 0) {
      hash = (37 * hash) + ERROR_SAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getErrorSamplesList().hashCode();
    }
    if (hasErrorsConfig()) {
      hash = (37 * hash) + ERRORS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2.ImportProductsResponse prototype) {
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
   * Response of the
   * [ImportProductsRequest][google.cloud.retail.v2.ImportProductsRequest]. If the
   * long running operation is done, then this message is returned by the
   * google.longrunning.Operations.response field if the operation was successful.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.ImportProductsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.ImportProductsResponse)
      com.google.cloud.retail.v2.ImportProductsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2.ImportConfigProto
          .internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ImportConfigProto
          .internal_static_google_cloud_retail_v2_ImportProductsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.ImportProductsResponse.class,
              com.google.cloud.retail.v2.ImportProductsResponse.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.ImportProductsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getErrorSamplesFieldBuilder();
        getErrorsConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (errorSamplesBuilder_ == null) {
        errorSamples_ = java.util.Collections.emptyList();
      } else {
        errorSamples_ = null;
        errorSamplesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      errorsConfig_ = null;
      if (errorsConfigBuilder_ != null) {
        errorsConfigBuilder_.dispose();
        errorsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2.ImportConfigProto
          .internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportProductsResponse getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.ImportProductsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportProductsResponse build() {
      com.google.cloud.retail.v2.ImportProductsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.ImportProductsResponse buildPartial() {
      com.google.cloud.retail.v2.ImportProductsResponse result =
          new com.google.cloud.retail.v2.ImportProductsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.retail.v2.ImportProductsResponse result) {
      if (errorSamplesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errorSamples_ = java.util.Collections.unmodifiableList(errorSamples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errorSamples_ = errorSamples_;
      } else {
        result.errorSamples_ = errorSamplesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.retail.v2.ImportProductsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorsConfig_ =
            errorsConfigBuilder_ == null ? errorsConfig_ : errorsConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2.ImportProductsResponse) {
        return mergeFrom((com.google.cloud.retail.v2.ImportProductsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.ImportProductsResponse other) {
      if (other == com.google.cloud.retail.v2.ImportProductsResponse.getDefaultInstance())
        return this;
      if (errorSamplesBuilder_ == null) {
        if (!other.errorSamples_.isEmpty()) {
          if (errorSamples_.isEmpty()) {
            errorSamples_ = other.errorSamples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorSamplesIsMutable();
            errorSamples_.addAll(other.errorSamples_);
          }
          onChanged();
        }
      } else {
        if (!other.errorSamples_.isEmpty()) {
          if (errorSamplesBuilder_.isEmpty()) {
            errorSamplesBuilder_.dispose();
            errorSamplesBuilder_ = null;
            errorSamples_ = other.errorSamples_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorSamplesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getErrorSamplesFieldBuilder()
                    : null;
          } else {
            errorSamplesBuilder_.addAllMessages(other.errorSamples_);
          }
        }
      }
      if (other.hasErrorsConfig()) {
        mergeErrorsConfig(other.getErrorsConfig());
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
                com.google.rpc.Status m =
                    input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
                if (errorSamplesBuilder_ == null) {
                  ensureErrorSamplesIsMutable();
                  errorSamples_.add(m);
                } else {
                  errorSamplesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getErrorsConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.util.List<com.google.rpc.Status> errorSamples_ = java.util.Collections.emptyList();

    private void ensureErrorSamplesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errorSamples_ = new java.util.ArrayList<com.google.rpc.Status>(errorSamples_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorSamplesBuilder_;

    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<com.google.rpc.Status> getErrorSamplesList() {
      if (errorSamplesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errorSamples_);
      } else {
        return errorSamplesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public int getErrorSamplesCount() {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.size();
      } else {
        return errorSamplesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status getErrorSamples(int index) {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.get(index);
      } else {
        return errorSamplesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder setErrorSamples(int index, com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.set(index, value);
        onChanged();
      } else {
        errorSamplesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder setErrorSamples(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.add(value);
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(int index, com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.add(index, value);
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.add(builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addAllErrorSamples(java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, errorSamples_);
        onChanged();
      } else {
        errorSamplesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder clearErrorSamples() {
      if (errorSamplesBuilder_ == null) {
        errorSamples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorSamplesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder removeErrorSamples(int index) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.remove(index);
        onChanged();
      } else {
        errorSamplesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder getErrorSamplesBuilder(int index) {
      return getErrorSamplesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index) {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.get(index);
      } else {
        return errorSamplesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList() {
      if (errorSamplesBuilder_ != null) {
        return errorSamplesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errorSamples_);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder addErrorSamplesBuilder() {
      return getErrorSamplesFieldBuilder().addBuilder(com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder addErrorSamplesBuilder(int index) {
      return getErrorSamplesFieldBuilder()
          .addBuilder(index, com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> getErrorSamplesBuilderList() {
      return getErrorSamplesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorSamplesFieldBuilder() {
      if (errorSamplesBuilder_ == null) {
        errorSamplesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                errorSamples_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        errorSamples_ = null;
      }
      return errorSamplesBuilder_;
    }

    private com.google.cloud.retail.v2.ImportErrorsConfig errorsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ImportErrorsConfig,
            com.google.cloud.retail.v2.ImportErrorsConfig.Builder,
            com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder>
        errorsConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     *
     * @return Whether the errorsConfig field is set.
     */
    public boolean hasErrorsConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     *
     * @return The errorsConfig.
     */
    public com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig() {
      if (errorsConfigBuilder_ == null) {
        return errorsConfig_ == null
            ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()
            : errorsConfig_;
      } else {
        return errorsConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public Builder setErrorsConfig(com.google.cloud.retail.v2.ImportErrorsConfig value) {
      if (errorsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorsConfig_ = value;
      } else {
        errorsConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public Builder setErrorsConfig(
        com.google.cloud.retail.v2.ImportErrorsConfig.Builder builderForValue) {
      if (errorsConfigBuilder_ == null) {
        errorsConfig_ = builderForValue.build();
      } else {
        errorsConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public Builder mergeErrorsConfig(com.google.cloud.retail.v2.ImportErrorsConfig value) {
      if (errorsConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && errorsConfig_ != null
            && errorsConfig_
                != com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()) {
          getErrorsConfigBuilder().mergeFrom(value);
        } else {
          errorsConfig_ = value;
        }
      } else {
        errorsConfigBuilder_.mergeFrom(value);
      }
      if (errorsConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public Builder clearErrorsConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      errorsConfig_ = null;
      if (errorsConfigBuilder_ != null) {
        errorsConfigBuilder_.dispose();
        errorsConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public com.google.cloud.retail.v2.ImportErrorsConfig.Builder getErrorsConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorsConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    public com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder() {
      if (errorsConfigBuilder_ != null) {
        return errorsConfigBuilder_.getMessageOrBuilder();
      } else {
        return errorsConfig_ == null
            ? com.google.cloud.retail.v2.ImportErrorsConfig.getDefaultInstance()
            : errorsConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Echoes the destination for the complete errors in the request if set.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ImportErrorsConfig,
            com.google.cloud.retail.v2.ImportErrorsConfig.Builder,
            com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder>
        getErrorsConfigFieldBuilder() {
      if (errorsConfigBuilder_ == null) {
        errorsConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2.ImportErrorsConfig,
                com.google.cloud.retail.v2.ImportErrorsConfig.Builder,
                com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder>(
                getErrorsConfig(), getParentForChildren(), isClean());
        errorsConfig_ = null;
      }
      return errorsConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.ImportProductsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.ImportProductsResponse)
  private static final com.google.cloud.retail.v2.ImportProductsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.ImportProductsResponse();
  }

  public static com.google.cloud.retail.v2.ImportProductsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportProductsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportProductsResponse>() {
        @java.lang.Override
        public ImportProductsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportProductsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportProductsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.ImportProductsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
