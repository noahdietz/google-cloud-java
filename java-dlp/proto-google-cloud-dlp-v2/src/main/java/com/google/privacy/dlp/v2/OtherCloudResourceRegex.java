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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * A pattern to match against one or more resources. At least one pattern must
 * be specified. Regular expressions use RE2
 * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
 * under the google/re2 repository on GitHub.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.OtherCloudResourceRegex}
 */
public final class OtherCloudResourceRegex extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.OtherCloudResourceRegex)
    OtherCloudResourceRegexOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OtherCloudResourceRegex.newBuilder() to construct.
  private OtherCloudResourceRegex(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OtherCloudResourceRegex() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OtherCloudResourceRegex();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_OtherCloudResourceRegex_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_OtherCloudResourceRegex_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.OtherCloudResourceRegex.class,
            com.google.privacy.dlp.v2.OtherCloudResourceRegex.Builder.class);
  }

  private int resourceRegexCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object resourceRegex_;

  public enum ResourceRegexCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AMAZON_S3_BUCKET_REGEX(1),
    RESOURCEREGEX_NOT_SET(0);
    private final int value;

    private ResourceRegexCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResourceRegexCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResourceRegexCase forNumber(int value) {
      switch (value) {
        case 1:
          return AMAZON_S3_BUCKET_REGEX;
        case 0:
          return RESOURCEREGEX_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ResourceRegexCase getResourceRegexCase() {
    return ResourceRegexCase.forNumber(resourceRegexCase_);
  }

  public static final int AMAZON_S3_BUCKET_REGEX_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Regex for Amazon S3 buckets.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
   *
   * @return Whether the amazonS3BucketRegex field is set.
   */
  @java.lang.Override
  public boolean hasAmazonS3BucketRegex() {
    return resourceRegexCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Regex for Amazon S3 buckets.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
   *
   * @return The amazonS3BucketRegex.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AmazonS3BucketRegex getAmazonS3BucketRegex() {
    if (resourceRegexCase_ == 1) {
      return (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_;
    }
    return com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Regex for Amazon S3 buckets.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AmazonS3BucketRegexOrBuilder getAmazonS3BucketRegexOrBuilder() {
    if (resourceRegexCase_ == 1) {
      return (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_;
    }
    return com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
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
    if (resourceRegexCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resourceRegexCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.OtherCloudResourceRegex)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.OtherCloudResourceRegex other =
        (com.google.privacy.dlp.v2.OtherCloudResourceRegex) obj;

    if (!getResourceRegexCase().equals(other.getResourceRegexCase())) return false;
    switch (resourceRegexCase_) {
      case 1:
        if (!getAmazonS3BucketRegex().equals(other.getAmazonS3BucketRegex())) return false;
        break;
      case 0:
      default:
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
    switch (resourceRegexCase_) {
      case 1:
        hash = (37 * hash) + AMAZON_S3_BUCKET_REGEX_FIELD_NUMBER;
        hash = (53 * hash) + getAmazonS3BucketRegex().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.OtherCloudResourceRegex prototype) {
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
   * A pattern to match against one or more resources. At least one pattern must
   * be specified. Regular expressions use RE2
   * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
   * under the google/re2 repository on GitHub.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.OtherCloudResourceRegex}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.OtherCloudResourceRegex)
      com.google.privacy.dlp.v2.OtherCloudResourceRegexOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_OtherCloudResourceRegex_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_OtherCloudResourceRegex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.OtherCloudResourceRegex.class,
              com.google.privacy.dlp.v2.OtherCloudResourceRegex.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.OtherCloudResourceRegex.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (amazonS3BucketRegexBuilder_ != null) {
        amazonS3BucketRegexBuilder_.clear();
      }
      resourceRegexCase_ = 0;
      resourceRegex_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_OtherCloudResourceRegex_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.OtherCloudResourceRegex getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.OtherCloudResourceRegex.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.OtherCloudResourceRegex build() {
      com.google.privacy.dlp.v2.OtherCloudResourceRegex result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.OtherCloudResourceRegex buildPartial() {
      com.google.privacy.dlp.v2.OtherCloudResourceRegex result =
          new com.google.privacy.dlp.v2.OtherCloudResourceRegex(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.OtherCloudResourceRegex result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.OtherCloudResourceRegex result) {
      result.resourceRegexCase_ = resourceRegexCase_;
      result.resourceRegex_ = this.resourceRegex_;
      if (resourceRegexCase_ == 1 && amazonS3BucketRegexBuilder_ != null) {
        result.resourceRegex_ = amazonS3BucketRegexBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.OtherCloudResourceRegex) {
        return mergeFrom((com.google.privacy.dlp.v2.OtherCloudResourceRegex) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.OtherCloudResourceRegex other) {
      if (other == com.google.privacy.dlp.v2.OtherCloudResourceRegex.getDefaultInstance())
        return this;
      switch (other.getResourceRegexCase()) {
        case AMAZON_S3_BUCKET_REGEX:
          {
            mergeAmazonS3BucketRegex(other.getAmazonS3BucketRegex());
            break;
          }
        case RESOURCEREGEX_NOT_SET:
          {
            break;
          }
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
                input.readMessage(
                    getAmazonS3BucketRegexFieldBuilder().getBuilder(), extensionRegistry);
                resourceRegexCase_ = 1;
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

    private int resourceRegexCase_ = 0;
    private java.lang.Object resourceRegex_;

    public ResourceRegexCase getResourceRegexCase() {
      return ResourceRegexCase.forNumber(resourceRegexCase_);
    }

    public Builder clearResourceRegex() {
      resourceRegexCase_ = 0;
      resourceRegex_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AmazonS3BucketRegex,
            com.google.privacy.dlp.v2.AmazonS3BucketRegex.Builder,
            com.google.privacy.dlp.v2.AmazonS3BucketRegexOrBuilder>
        amazonS3BucketRegexBuilder_;
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     *
     * @return Whether the amazonS3BucketRegex field is set.
     */
    @java.lang.Override
    public boolean hasAmazonS3BucketRegex() {
      return resourceRegexCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     *
     * @return The amazonS3BucketRegex.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3BucketRegex getAmazonS3BucketRegex() {
      if (amazonS3BucketRegexBuilder_ == null) {
        if (resourceRegexCase_ == 1) {
          return (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_;
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
      } else {
        if (resourceRegexCase_ == 1) {
          return amazonS3BucketRegexBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    public Builder setAmazonS3BucketRegex(com.google.privacy.dlp.v2.AmazonS3BucketRegex value) {
      if (amazonS3BucketRegexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resourceRegex_ = value;
        onChanged();
      } else {
        amazonS3BucketRegexBuilder_.setMessage(value);
      }
      resourceRegexCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    public Builder setAmazonS3BucketRegex(
        com.google.privacy.dlp.v2.AmazonS3BucketRegex.Builder builderForValue) {
      if (amazonS3BucketRegexBuilder_ == null) {
        resourceRegex_ = builderForValue.build();
        onChanged();
      } else {
        amazonS3BucketRegexBuilder_.setMessage(builderForValue.build());
      }
      resourceRegexCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    public Builder mergeAmazonS3BucketRegex(com.google.privacy.dlp.v2.AmazonS3BucketRegex value) {
      if (amazonS3BucketRegexBuilder_ == null) {
        if (resourceRegexCase_ == 1
            && resourceRegex_
                != com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance()) {
          resourceRegex_ =
              com.google.privacy.dlp.v2.AmazonS3BucketRegex.newBuilder(
                      (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          resourceRegex_ = value;
        }
        onChanged();
      } else {
        if (resourceRegexCase_ == 1) {
          amazonS3BucketRegexBuilder_.mergeFrom(value);
        } else {
          amazonS3BucketRegexBuilder_.setMessage(value);
        }
      }
      resourceRegexCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    public Builder clearAmazonS3BucketRegex() {
      if (amazonS3BucketRegexBuilder_ == null) {
        if (resourceRegexCase_ == 1) {
          resourceRegexCase_ = 0;
          resourceRegex_ = null;
          onChanged();
        }
      } else {
        if (resourceRegexCase_ == 1) {
          resourceRegexCase_ = 0;
          resourceRegex_ = null;
        }
        amazonS3BucketRegexBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    public com.google.privacy.dlp.v2.AmazonS3BucketRegex.Builder getAmazonS3BucketRegexBuilder() {
      return getAmazonS3BucketRegexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3BucketRegexOrBuilder
        getAmazonS3BucketRegexOrBuilder() {
      if ((resourceRegexCase_ == 1) && (amazonS3BucketRegexBuilder_ != null)) {
        return amazonS3BucketRegexBuilder_.getMessageOrBuilder();
      } else {
        if (resourceRegexCase_ == 1) {
          return (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_;
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Regex for Amazon S3 buckets.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketRegex amazon_s3_bucket_regex = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AmazonS3BucketRegex,
            com.google.privacy.dlp.v2.AmazonS3BucketRegex.Builder,
            com.google.privacy.dlp.v2.AmazonS3BucketRegexOrBuilder>
        getAmazonS3BucketRegexFieldBuilder() {
      if (amazonS3BucketRegexBuilder_ == null) {
        if (!(resourceRegexCase_ == 1)) {
          resourceRegex_ = com.google.privacy.dlp.v2.AmazonS3BucketRegex.getDefaultInstance();
        }
        amazonS3BucketRegexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.AmazonS3BucketRegex,
                com.google.privacy.dlp.v2.AmazonS3BucketRegex.Builder,
                com.google.privacy.dlp.v2.AmazonS3BucketRegexOrBuilder>(
                (com.google.privacy.dlp.v2.AmazonS3BucketRegex) resourceRegex_,
                getParentForChildren(),
                isClean());
        resourceRegex_ = null;
      }
      resourceRegexCase_ = 1;
      onChanged();
      return amazonS3BucketRegexBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.OtherCloudResourceRegex)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.OtherCloudResourceRegex)
  private static final com.google.privacy.dlp.v2.OtherCloudResourceRegex DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.OtherCloudResourceRegex();
  }

  public static com.google.privacy.dlp.v2.OtherCloudResourceRegex getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OtherCloudResourceRegex> PARSER =
      new com.google.protobuf.AbstractParser<OtherCloudResourceRegex>() {
        @java.lang.Override
        public OtherCloudResourceRegex parsePartialFrom(
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

  public static com.google.protobuf.Parser<OtherCloudResourceRegex> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OtherCloudResourceRegex> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.OtherCloudResourceRegex getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
