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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.5
package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Metadata for build operations.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.BuildOperationMetadata}
 */
public final class BuildOperationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.BuildOperationMetadata)
    BuildOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BuildOperationMetadata.newBuilder() to construct.
  private BuildOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BuildOperationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BuildOperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_BuildOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_BuildOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.BuildOperationMetadata.class,
            com.google.cloudbuild.v1.BuildOperationMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int BUILD_FIELD_NUMBER = 1;
  private com.google.cloudbuild.v1.Build build_;
  /**
   *
   *
   * <pre>
   * The build that the operation is tracking.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
   *
   * @return Whether the build field is set.
   */
  @java.lang.Override
  public boolean hasBuild() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The build that the operation is tracking.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
   *
   * @return The build.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.Build getBuild() {
    return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
  }
  /**
   *
   *
   * <pre>
   * The build that the operation is tracking.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder() {
    return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
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
      output.writeMessage(1, getBuild());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBuild());
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
    if (!(obj instanceof com.google.cloudbuild.v1.BuildOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.BuildOperationMetadata other =
        (com.google.cloudbuild.v1.BuildOperationMetadata) obj;

    if (hasBuild() != other.hasBuild()) return false;
    if (hasBuild()) {
      if (!getBuild().equals(other.getBuild())) return false;
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
    if (hasBuild()) {
      hash = (37 * hash) + BUILD_FIELD_NUMBER;
      hash = (53 * hash) + getBuild().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.BuildOperationMetadata prototype) {
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
   * Metadata for build operations.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.BuildOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.BuildOperationMetadata)
      com.google.cloudbuild.v1.BuildOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuildOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuildOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.BuildOperationMetadata.class,
              com.google.cloudbuild.v1.BuildOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.BuildOperationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBuildFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      build_ = null;
      if (buildBuilder_ != null) {
        buildBuilder_.dispose();
        buildBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuildOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildOperationMetadata getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.BuildOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildOperationMetadata build() {
      com.google.cloudbuild.v1.BuildOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildOperationMetadata buildPartial() {
      com.google.cloudbuild.v1.BuildOperationMetadata result =
          new com.google.cloudbuild.v1.BuildOperationMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.BuildOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.build_ = buildBuilder_ == null ? build_ : buildBuilder_.build();
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
      if (other instanceof com.google.cloudbuild.v1.BuildOperationMetadata) {
        return mergeFrom((com.google.cloudbuild.v1.BuildOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.BuildOperationMetadata other) {
      if (other == com.google.cloudbuild.v1.BuildOperationMetadata.getDefaultInstance())
        return this;
      if (other.hasBuild()) {
        mergeBuild(other.getBuild());
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
                input.readMessage(getBuildFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloudbuild.v1.Build build_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.Build,
            com.google.cloudbuild.v1.Build.Builder,
            com.google.cloudbuild.v1.BuildOrBuilder>
        buildBuilder_;
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     *
     * @return Whether the build field is set.
     */
    public boolean hasBuild() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     *
     * @return The build.
     */
    public com.google.cloudbuild.v1.Build getBuild() {
      if (buildBuilder_ == null) {
        return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
      } else {
        return buildBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public Builder setBuild(com.google.cloudbuild.v1.Build value) {
      if (buildBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        build_ = value;
      } else {
        buildBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public Builder setBuild(com.google.cloudbuild.v1.Build.Builder builderForValue) {
      if (buildBuilder_ == null) {
        build_ = builderForValue.build();
      } else {
        buildBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public Builder mergeBuild(com.google.cloudbuild.v1.Build value) {
      if (buildBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && build_ != null
            && build_ != com.google.cloudbuild.v1.Build.getDefaultInstance()) {
          getBuildBuilder().mergeFrom(value);
        } else {
          build_ = value;
        }
      } else {
        buildBuilder_.mergeFrom(value);
      }
      if (build_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public Builder clearBuild() {
      bitField0_ = (bitField0_ & ~0x00000001);
      build_ = null;
      if (buildBuilder_ != null) {
        buildBuilder_.dispose();
        buildBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public com.google.cloudbuild.v1.Build.Builder getBuildBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBuildFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder() {
      if (buildBuilder_ != null) {
        return buildBuilder_.getMessageOrBuilder();
      } else {
        return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
      }
    }
    /**
     *
     *
     * <pre>
     * The build that the operation is tracking.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.Build build = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.Build,
            com.google.cloudbuild.v1.Build.Builder,
            com.google.cloudbuild.v1.BuildOrBuilder>
        getBuildFieldBuilder() {
      if (buildBuilder_ == null) {
        buildBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.Build,
                com.google.cloudbuild.v1.Build.Builder,
                com.google.cloudbuild.v1.BuildOrBuilder>(
                getBuild(), getParentForChildren(), isClean());
        build_ = null;
      }
      return buildBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.BuildOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.BuildOperationMetadata)
  private static final com.google.cloudbuild.v1.BuildOperationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.BuildOperationMetadata();
  }

  public static com.google.cloudbuild.v1.BuildOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildOperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<BuildOperationMetadata>() {
        @java.lang.Override
        public BuildOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.BuildOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
