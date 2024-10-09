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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * This is an error detail intended to be used with INVALID_ARGUMENT errors.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.QueryErrorList}
 */
public final class QueryErrorList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.QueryErrorList)
    QueryErrorListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryErrorList.newBuilder() to construct.
  private QueryErrorList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryErrorList() {
    errors_ = java.util.Collections.emptyList();
    errorSummary_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryErrorList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_QueryErrorList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.QueryErrorList.class,
            com.google.monitoring.v3.QueryErrorList.Builder.class);
  }

  public static final int ERRORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.monitoring.v3.QueryError> errors_;
  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.monitoring.v3.QueryError> getErrorsList() {
    return errors_;
  }
  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.monitoring.v3.QueryErrorOrBuilder>
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.QueryError getErrors(int index) {
    return errors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.QueryErrorOrBuilder getErrorsOrBuilder(int index) {
    return errors_.get(index);
  }

  public static final int ERROR_SUMMARY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object errorSummary_ = "";
  /**
   *
   *
   * <pre>
   * A summary of all the errors.
   * </pre>
   *
   * <code>string error_summary = 2;</code>
   *
   * @return The errorSummary.
   */
  @java.lang.Override
  public java.lang.String getErrorSummary() {
    java.lang.Object ref = errorSummary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorSummary_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A summary of all the errors.
   * </pre>
   *
   * <code>string error_summary = 2;</code>
   *
   * @return The bytes for errorSummary.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrorSummaryBytes() {
    java.lang.Object ref = errorSummary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      errorSummary_ = b;
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
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(1, errors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorSummary_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorSummary_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, errors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorSummary_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorSummary_);
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
    if (!(obj instanceof com.google.monitoring.v3.QueryErrorList)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.QueryErrorList other = (com.google.monitoring.v3.QueryErrorList) obj;

    if (!getErrorsList().equals(other.getErrorsList())) return false;
    if (!getErrorSummary().equals(other.getErrorSummary())) return false;
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
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (37 * hash) + ERROR_SUMMARY_FIELD_NUMBER;
    hash = (53 * hash) + getErrorSummary().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.QueryErrorList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.QueryErrorList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.QueryErrorList parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.QueryErrorList prototype) {
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
   * This is an error detail intended to be used with INVALID_ARGUMENT errors.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.QueryErrorList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.QueryErrorList)
      com.google.monitoring.v3.QueryErrorListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_QueryErrorList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_QueryErrorList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.QueryErrorList.class,
              com.google.monitoring.v3.QueryErrorList.Builder.class);
    }

    // Construct using com.google.monitoring.v3.QueryErrorList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
      } else {
        errors_ = null;
        errorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      errorSummary_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_QueryErrorList_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryErrorList getDefaultInstanceForType() {
      return com.google.monitoring.v3.QueryErrorList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryErrorList build() {
      com.google.monitoring.v3.QueryErrorList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.QueryErrorList buildPartial() {
      com.google.monitoring.v3.QueryErrorList result =
          new com.google.monitoring.v3.QueryErrorList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.monitoring.v3.QueryErrorList result) {
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.monitoring.v3.QueryErrorList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorSummary_ = errorSummary_;
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
      if (other instanceof com.google.monitoring.v3.QueryErrorList) {
        return mergeFrom((com.google.monitoring.v3.QueryErrorList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.QueryErrorList other) {
      if (other == com.google.monitoring.v3.QueryErrorList.getDefaultInstance()) return this;
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getErrorsFieldBuilder()
                    : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
        }
      }
      if (!other.getErrorSummary().isEmpty()) {
        errorSummary_ = other.errorSummary_;
        bitField0_ |= 0x00000002;
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
                com.google.monitoring.v3.QueryError m =
                    input.readMessage(
                        com.google.monitoring.v3.QueryError.parser(), extensionRegistry);
                if (errorsBuilder_ == null) {
                  ensureErrorsIsMutable();
                  errors_.add(m);
                } else {
                  errorsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                errorSummary_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.monitoring.v3.QueryError> errors_ =
        java.util.Collections.emptyList();

    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errors_ = new java.util.ArrayList<com.google.monitoring.v3.QueryError>(errors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.QueryError,
            com.google.monitoring.v3.QueryError.Builder,
            com.google.monitoring.v3.QueryErrorOrBuilder>
        errorsBuilder_;

    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.QueryError> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public com.google.monitoring.v3.QueryError getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder setErrors(int index, com.google.monitoring.v3.QueryError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder setErrors(
        int index, com.google.monitoring.v3.QueryError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder addErrors(com.google.monitoring.v3.QueryError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder addErrors(int index, com.google.monitoring.v3.QueryError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder addErrors(com.google.monitoring.v3.QueryError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder addErrors(
        int index, com.google.monitoring.v3.QueryError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.monitoring.v3.QueryError> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public com.google.monitoring.v3.QueryError.Builder getErrorsBuilder(int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public com.google.monitoring.v3.QueryErrorOrBuilder getErrorsOrBuilder(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public java.util.List<? extends com.google.monitoring.v3.QueryErrorOrBuilder>
        getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public com.google.monitoring.v3.QueryError.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder()
          .addBuilder(com.google.monitoring.v3.QueryError.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public com.google.monitoring.v3.QueryError.Builder addErrorsBuilder(int index) {
      return getErrorsFieldBuilder()
          .addBuilder(index, com.google.monitoring.v3.QueryError.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Errors in parsing the time series query language text. The number of errors
     * in the response may be limited.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.QueryError.Builder> getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.QueryError,
            com.google.monitoring.v3.QueryError.Builder,
            com.google.monitoring.v3.QueryErrorOrBuilder>
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.monitoring.v3.QueryError,
                com.google.monitoring.v3.QueryError.Builder,
                com.google.monitoring.v3.QueryErrorOrBuilder>(
                errors_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        errors_ = null;
      }
      return errorsBuilder_;
    }

    private java.lang.Object errorSummary_ = "";
    /**
     *
     *
     * <pre>
     * A summary of all the errors.
     * </pre>
     *
     * <code>string error_summary = 2;</code>
     *
     * @return The errorSummary.
     */
    public java.lang.String getErrorSummary() {
      java.lang.Object ref = errorSummary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorSummary_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A summary of all the errors.
     * </pre>
     *
     * <code>string error_summary = 2;</code>
     *
     * @return The bytes for errorSummary.
     */
    public com.google.protobuf.ByteString getErrorSummaryBytes() {
      java.lang.Object ref = errorSummary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        errorSummary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A summary of all the errors.
     * </pre>
     *
     * <code>string error_summary = 2;</code>
     *
     * @param value The errorSummary to set.
     * @return This builder for chaining.
     */
    public Builder setErrorSummary(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      errorSummary_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary of all the errors.
     * </pre>
     *
     * <code>string error_summary = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearErrorSummary() {
      errorSummary_ = getDefaultInstance().getErrorSummary();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A summary of all the errors.
     * </pre>
     *
     * <code>string error_summary = 2;</code>
     *
     * @param value The bytes for errorSummary to set.
     * @return This builder for chaining.
     */
    public Builder setErrorSummaryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      errorSummary_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.QueryErrorList)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.QueryErrorList)
  private static final com.google.monitoring.v3.QueryErrorList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.QueryErrorList();
  }

  public static com.google.monitoring.v3.QueryErrorList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryErrorList> PARSER =
      new com.google.protobuf.AbstractParser<QueryErrorList>() {
        @java.lang.Override
        public QueryErrorList parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryErrorList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryErrorList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.QueryErrorList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
