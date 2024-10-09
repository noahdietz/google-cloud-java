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
// source: google/cloud/channel/v1/reports_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CloudChannelReportsService.ListReports][google.cloud.channel.v1.CloudChannelReportsService.ListReports].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListReportsResponse}
 */
@java.lang.Deprecated
public final class ListReportsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListReportsResponse)
    ListReportsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListReportsResponse.newBuilder() to construct.
  private ListReportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListReportsResponse() {
    reports_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListReportsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ReportsServiceProto
        .internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ReportsServiceProto
        .internal_static_google_cloud_channel_v1_ListReportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListReportsResponse.class,
            com.google.cloud.channel.v1.ListReportsResponse.Builder.class);
  }

  public static final int REPORTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.Report> reports_;
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.Report> getReportsList() {
    return reports_;
  }
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.ReportOrBuilder>
      getReportsOrBuilderList() {
    return reports_;
  }
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  @java.lang.Override
  public int getReportsCount() {
    return reports_.size();
  }
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Report getReports(int index) {
    return reports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The reports available to the partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ReportOrBuilder getReportsOrBuilder(int index) {
    return reports_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Pass this token to
   * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Pass this token to
   * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
   * to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < reports_.size(); i++) {
      output.writeMessage(1, reports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, reports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListReportsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListReportsResponse other =
        (com.google.cloud.channel.v1.ListReportsResponse) obj;

    if (!getReportsList().equals(other.getReportsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getReportsCount() > 0) {
      hash = (37 * hash) + REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getReportsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListReportsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.ListReportsResponse prototype) {
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
   * [CloudChannelReportsService.ListReports][google.cloud.channel.v1.CloudChannelReportsService.ListReports].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListReportsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListReportsResponse)
      com.google.cloud.channel.v1.ListReportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ListReportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListReportsResponse.class,
              com.google.cloud.channel.v1.ListReportsResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListReportsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
      } else {
        reports_ = null;
        reportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ReportsServiceProto
          .internal_static_google_cloud_channel_v1_ListReportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListReportsResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListReportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListReportsResponse build() {
      com.google.cloud.channel.v1.ListReportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListReportsResponse buildPartial() {
      com.google.cloud.channel.v1.ListReportsResponse result =
          new com.google.cloud.channel.v1.ListReportsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListReportsResponse result) {
      if (reportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reports_ = java.util.Collections.unmodifiableList(reports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reports_ = reports_;
      } else {
        result.reports_ = reportsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListReportsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.channel.v1.ListReportsResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListReportsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListReportsResponse other) {
      if (other == com.google.cloud.channel.v1.ListReportsResponse.getDefaultInstance())
        return this;
      if (reportsBuilder_ == null) {
        if (!other.reports_.isEmpty()) {
          if (reports_.isEmpty()) {
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReportsIsMutable();
            reports_.addAll(other.reports_);
          }
          onChanged();
        }
      } else {
        if (!other.reports_.isEmpty()) {
          if (reportsBuilder_.isEmpty()) {
            reportsBuilder_.dispose();
            reportsBuilder_ = null;
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getReportsFieldBuilder()
                    : null;
          } else {
            reportsBuilder_.addAllMessages(other.reports_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.channel.v1.Report m =
                    input.readMessage(
                        com.google.cloud.channel.v1.Report.parser(), extensionRegistry);
                if (reportsBuilder_ == null) {
                  ensureReportsIsMutable();
                  reports_.add(m);
                } else {
                  reportsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.channel.v1.Report> reports_ =
        java.util.Collections.emptyList();

    private void ensureReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reports_ = new java.util.ArrayList<com.google.cloud.channel.v1.Report>(reports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Report,
            com.google.cloud.channel.v1.Report.Builder,
            com.google.cloud.channel.v1.ReportOrBuilder>
        reportsBuilder_;

    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Report> getReportsList() {
      if (reportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reports_);
      } else {
        return reportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public int getReportsCount() {
      if (reportsBuilder_ == null) {
        return reports_.size();
      } else {
        return reportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public com.google.cloud.channel.v1.Report getReports(int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);
      } else {
        return reportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder setReports(int index, com.google.cloud.channel.v1.Report value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.set(index, value);
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder setReports(
        int index, com.google.cloud.channel.v1.Report.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.set(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder addReports(com.google.cloud.channel.v1.Report value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder addReports(int index, com.google.cloud.channel.v1.Report value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(index, value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder addReports(com.google.cloud.channel.v1.Report.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder addReports(
        int index, com.google.cloud.channel.v1.Report.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder addAllReports(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.Report> values) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, reports_);
        onChanged();
      } else {
        reportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder clearReports() {
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public Builder removeReports(int index) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.remove(index);
        onChanged();
      } else {
        reportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public com.google.cloud.channel.v1.Report.Builder getReportsBuilder(int index) {
      return getReportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public com.google.cloud.channel.v1.ReportOrBuilder getReportsOrBuilder(int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);
      } else {
        return reportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.ReportOrBuilder>
        getReportsOrBuilderList() {
      if (reportsBuilder_ != null) {
        return reportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reports_);
      }
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public com.google.cloud.channel.v1.Report.Builder addReportsBuilder() {
      return getReportsFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.Report.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public com.google.cloud.channel.v1.Report.Builder addReportsBuilder(int index) {
      return getReportsFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.Report.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The reports available to the partner.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Report reports = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Report.Builder> getReportsBuilderList() {
      return getReportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Report,
            com.google.cloud.channel.v1.Report.Builder,
            com.google.cloud.channel.v1.ReportOrBuilder>
        getReportsFieldBuilder() {
      if (reportsBuilder_ == null) {
        reportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.Report,
                com.google.cloud.channel.v1.Report.Builder,
                com.google.cloud.channel.v1.ReportOrBuilder>(
                reports_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        reports_ = null;
      }
      return reportsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Pass this token to
     * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pass this token to
     * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pass this token to
     * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pass this token to
     * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pass this token to
     * [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token]
     * to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListReportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListReportsResponse)
  private static final com.google.cloud.channel.v1.ListReportsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListReportsResponse();
  }

  public static com.google.cloud.channel.v1.ListReportsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReportsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListReportsResponse>() {
        @java.lang.Override
        public ListReportsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListReportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListReportsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
