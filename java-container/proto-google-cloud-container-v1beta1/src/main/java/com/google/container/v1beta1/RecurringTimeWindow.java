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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Represents an arbitrary window of time that recurs.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.RecurringTimeWindow}
 */
public final class RecurringTimeWindow extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.RecurringTimeWindow)
    RecurringTimeWindowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecurringTimeWindow.newBuilder() to construct.
  private RecurringTimeWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecurringTimeWindow() {
    recurrence_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecurringTimeWindow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_RecurringTimeWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_RecurringTimeWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.RecurringTimeWindow.class,
            com.google.container.v1beta1.RecurringTimeWindow.Builder.class);
  }

  private int bitField0_;
  public static final int WINDOW_FIELD_NUMBER = 1;
  private com.google.container.v1beta1.TimeWindow window_;
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  @java.lang.Override
  public boolean hasWindow() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   *
   * @return The window.
   */
  @java.lang.Override
  public com.google.container.v1beta1.TimeWindow getWindow() {
    return window_ == null ? com.google.container.v1beta1.TimeWindow.getDefaultInstance() : window_;
  }
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.TimeWindowOrBuilder getWindowOrBuilder() {
    return window_ == null ? com.google.container.v1beta1.TimeWindow.getDefaultInstance() : window_;
  }

  public static final int RECURRENCE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object recurrence_ = "";
  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   *
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   *
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   *
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   *
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   *
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   *
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The recurrence.
   */
  @java.lang.Override
  public java.lang.String getRecurrence() {
    java.lang.Object ref = recurrence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recurrence_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   *
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   *
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   *
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   *
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   *
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   *
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The bytes for recurrence.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecurrenceBytes() {
    java.lang.Object ref = recurrence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      recurrence_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getWindow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recurrence_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recurrence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWindow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recurrence_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recurrence_);
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
    if (!(obj instanceof com.google.container.v1beta1.RecurringTimeWindow)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.RecurringTimeWindow other =
        (com.google.container.v1beta1.RecurringTimeWindow) obj;

    if (hasWindow() != other.hasWindow()) return false;
    if (hasWindow()) {
      if (!getWindow().equals(other.getWindow())) return false;
    }
    if (!getRecurrence().equals(other.getRecurrence())) return false;
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
    if (hasWindow()) {
      hash = (37 * hash) + WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getWindow().hashCode();
    }
    hash = (37 * hash) + RECURRENCE_FIELD_NUMBER;
    hash = (53 * hash) + getRecurrence().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.RecurringTimeWindow parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.RecurringTimeWindow prototype) {
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
   * Represents an arbitrary window of time that recurs.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.RecurringTimeWindow}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.RecurringTimeWindow)
      com.google.container.v1beta1.RecurringTimeWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RecurringTimeWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RecurringTimeWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.RecurringTimeWindow.class,
              com.google.container.v1beta1.RecurringTimeWindow.Builder.class);
    }

    // Construct using com.google.container.v1beta1.RecurringTimeWindow.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWindowFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      recurrence_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_RecurringTimeWindow_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.RecurringTimeWindow getDefaultInstanceForType() {
      return com.google.container.v1beta1.RecurringTimeWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.RecurringTimeWindow build() {
      com.google.container.v1beta1.RecurringTimeWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.RecurringTimeWindow buildPartial() {
      com.google.container.v1beta1.RecurringTimeWindow result =
          new com.google.container.v1beta1.RecurringTimeWindow(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.RecurringTimeWindow result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.window_ = windowBuilder_ == null ? window_ : windowBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recurrence_ = recurrence_;
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
      if (other instanceof com.google.container.v1beta1.RecurringTimeWindow) {
        return mergeFrom((com.google.container.v1beta1.RecurringTimeWindow) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.RecurringTimeWindow other) {
      if (other == com.google.container.v1beta1.RecurringTimeWindow.getDefaultInstance())
        return this;
      if (other.hasWindow()) {
        mergeWindow(other.getWindow());
      }
      if (!other.getRecurrence().isEmpty()) {
        recurrence_ = other.recurrence_;
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
                input.readMessage(getWindowFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                recurrence_ = input.readStringRequireUtf8();
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

    private com.google.container.v1beta1.TimeWindow window_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.TimeWindow,
            com.google.container.v1beta1.TimeWindow.Builder,
            com.google.container.v1beta1.TimeWindowOrBuilder>
        windowBuilder_;
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     *
     * @return Whether the window field is set.
     */
    public boolean hasWindow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     *
     * @return The window.
     */
    public com.google.container.v1beta1.TimeWindow getWindow() {
      if (windowBuilder_ == null) {
        return window_ == null
            ? com.google.container.v1beta1.TimeWindow.getDefaultInstance()
            : window_;
      } else {
        return windowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.container.v1beta1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        window_ = value;
      } else {
        windowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.container.v1beta1.TimeWindow.Builder builderForValue) {
      if (windowBuilder_ == null) {
        window_ = builderForValue.build();
      } else {
        windowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public Builder mergeWindow(com.google.container.v1beta1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && window_ != null
            && window_ != com.google.container.v1beta1.TimeWindow.getDefaultInstance()) {
          getWindowBuilder().mergeFrom(value);
        } else {
          window_ = value;
        }
      } else {
        windowBuilder_.mergeFrom(value);
      }
      if (window_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public Builder clearWindow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public com.google.container.v1beta1.TimeWindow.Builder getWindowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWindowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    public com.google.container.v1beta1.TimeWindowOrBuilder getWindowOrBuilder() {
      if (windowBuilder_ != null) {
        return windowBuilder_.getMessageOrBuilder();
      } else {
        return window_ == null
            ? com.google.container.v1beta1.TimeWindow.getDefaultInstance()
            : window_;
      }
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.TimeWindow,
            com.google.container.v1beta1.TimeWindow.Builder,
            com.google.container.v1beta1.TimeWindowOrBuilder>
        getWindowFieldBuilder() {
      if (windowBuilder_ == null) {
        windowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1beta1.TimeWindow,
                com.google.container.v1beta1.TimeWindow.Builder,
                com.google.container.v1beta1.TimeWindowOrBuilder>(
                getWindow(), getParentForChildren(), isClean());
        window_ = null;
      }
      return windowBuilder_;
    }

    private java.lang.Object recurrence_ = "";
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     *
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     *
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     *
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     *
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     *
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     *
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return The recurrence.
     */
    public java.lang.String getRecurrence() {
      java.lang.Object ref = recurrence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recurrence_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     *
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     *
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     *
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     *
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     *
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     *
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return The bytes for recurrence.
     */
    public com.google.protobuf.ByteString getRecurrenceBytes() {
      java.lang.Object ref = recurrence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        recurrence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     *
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     *
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     *
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     *
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     *
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     *
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @param value The recurrence to set.
     * @return This builder for chaining.
     */
    public Builder setRecurrence(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      recurrence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     *
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     *
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     *
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     *
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     *
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     *
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRecurrence() {
      recurrence_ = getDefaultInstance().getRecurrence();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     *
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     *
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     *
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     *
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     *
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     *
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @param value The bytes for recurrence to set.
     * @return This builder for chaining.
     */
    public Builder setRecurrenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      recurrence_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.RecurringTimeWindow)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.RecurringTimeWindow)
  private static final com.google.container.v1beta1.RecurringTimeWindow DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.RecurringTimeWindow();
  }

  public static com.google.container.v1beta1.RecurringTimeWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecurringTimeWindow> PARSER =
      new com.google.protobuf.AbstractParser<RecurringTimeWindow>() {
        @java.lang.Override
        public RecurringTimeWindow parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecurringTimeWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecurringTimeWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.RecurringTimeWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
