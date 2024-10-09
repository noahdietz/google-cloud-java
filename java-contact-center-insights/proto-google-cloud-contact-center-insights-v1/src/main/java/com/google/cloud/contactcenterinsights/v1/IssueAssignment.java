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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Information about the issue.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueAssignment}
 */
public final class IssueAssignment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.IssueAssignment)
    IssueAssignmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IssueAssignment.newBuilder() to construct.
  private IssueAssignment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IssueAssignment() {
    issue_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IssueAssignment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueAssignment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueAssignment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.class,
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder.class);
  }

  public static final int ISSUE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object issue_ = "";
  /**
   *
   *
   * <pre>
   * Resource name of the assigned issue.
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The issue.
   */
  @java.lang.Override
  public java.lang.String getIssue() {
    java.lang.Object ref = issue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issue_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the assigned issue.
   * </pre>
   *
   * <code>string issue = 1;</code>
   *
   * @return The bytes for issue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIssueBytes() {
    java.lang.Object ref = issue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      issue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private double score_ = 0D;
  /**
   *
   *
   * <pre>
   * Score indicating the likelihood of the issue assignment.
   * currently bounded on [0,1].
   * </pre>
   *
   * <code>double score = 2;</code>
   *
   * @return The score.
   */
  @java.lang.Override
  public double getScore() {
    return score_;
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * Immutable. Display name of the assigned issue. This field is set at time of
   * analyis and immutable since then.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Display name of the assigned issue. This field is set at time of
   * analyis and immutable since then.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issue_);
    }
    if (java.lang.Double.doubleToRawLongBits(score_) != 0) {
      output.writeDouble(2, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, displayName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issue_);
    }
    if (java.lang.Double.doubleToRawLongBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, displayName_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.IssueAssignment)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.IssueAssignment other =
        (com.google.cloud.contactcenterinsights.v1.IssueAssignment) obj;

    if (!getIssue().equals(other.getIssue())) return false;
    if (java.lang.Double.doubleToLongBits(getScore())
        != java.lang.Double.doubleToLongBits(other.getScore())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
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
    hash = (37 * hash) + ISSUE_FIELD_NUMBER;
    hash = (53 * hash) + getIssue().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getScore()));
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.IssueAssignment prototype) {
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
   * Information about the issue.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueAssignment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.IssueAssignment)
      com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueAssignment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueAssignment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.IssueAssignment.class,
              com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.IssueAssignment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      issue_ = "";
      score_ = 0D;
      displayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueAssignment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment build() {
      com.google.cloud.contactcenterinsights.v1.IssueAssignment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment buildPartial() {
      com.google.cloud.contactcenterinsights.v1.IssueAssignment result =
          new com.google.cloud.contactcenterinsights.v1.IssueAssignment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.IssueAssignment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.issue_ = issue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.score_ = score_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayName_ = displayName_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.IssueAssignment) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.IssueAssignment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.IssueAssignment other) {
      if (other == com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance())
        return this;
      if (!other.getIssue().isEmpty()) {
        issue_ = other.issue_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getScore() != 0D) {
        setScore(other.getScore());
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000004;
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
                issue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 17:
              {
                score_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 26:
              {
                displayName_ = input.readStringRequireUtf8();
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

    private java.lang.Object issue_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the assigned issue.
     * </pre>
     *
     * <code>string issue = 1;</code>
     *
     * @return The issue.
     */
    public java.lang.String getIssue() {
      java.lang.Object ref = issue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the assigned issue.
     * </pre>
     *
     * <code>string issue = 1;</code>
     *
     * @return The bytes for issue.
     */
    public com.google.protobuf.ByteString getIssueBytes() {
      java.lang.Object ref = issue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        issue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the assigned issue.
     * </pre>
     *
     * <code>string issue = 1;</code>
     *
     * @param value The issue to set.
     * @return This builder for chaining.
     */
    public Builder setIssue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      issue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the assigned issue.
     * </pre>
     *
     * <code>string issue = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIssue() {
      issue_ = getDefaultInstance().getIssue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the assigned issue.
     * </pre>
     *
     * <code>string issue = 1;</code>
     *
     * @param value The bytes for issue to set.
     * @return This builder for chaining.
     */
    public Builder setIssueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      issue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double score_;
    /**
     *
     *
     * <pre>
     * Score indicating the likelihood of the issue assignment.
     * currently bounded on [0,1].
     * </pre>
     *
     * <code>double score = 2;</code>
     *
     * @return The score.
     */
    @java.lang.Override
    public double getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Score indicating the likelihood of the issue assignment.
     * currently bounded on [0,1].
     * </pre>
     *
     * <code>double score = 2;</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(double value) {

      score_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Score indicating the likelihood of the issue assignment.
     * currently bounded on [0,1].
     * </pre>
     *
     * <code>double score = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      score_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Display name of the assigned issue. This field is set at time of
     * analyis and immutable since then.
     * </pre>
     *
     * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Display name of the assigned issue. This field is set at time of
     * analyis and immutable since then.
     * </pre>
     *
     * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Display name of the assigned issue. This field is set at time of
     * analyis and immutable since then.
     * </pre>
     *
     * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Display name of the assigned issue. This field is set at time of
     * analyis and immutable since then.
     * </pre>
     *
     * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Display name of the assigned issue. This field is set at time of
     * analyis and immutable since then.
     * </pre>
     *
     * <code>string display_name = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.IssueAssignment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.IssueAssignment)
  private static final com.google.cloud.contactcenterinsights.v1.IssueAssignment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.IssueAssignment();
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueAssignment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IssueAssignment> PARSER =
      new com.google.protobuf.AbstractParser<IssueAssignment>() {
        @java.lang.Override
        public IssueAssignment parsePartialFrom(
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

  public static com.google.protobuf.Parser<IssueAssignment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IssueAssignment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueAssignment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
