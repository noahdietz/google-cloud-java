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
// source: google/cloud/dialogflow/cx/v3/flow.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The flow import strategy used for resource conflict resolution associated
 * with an [ImportFlowRequest][google.cloud.dialogflow.cx.v3.ImportFlowRequest].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.FlowImportStrategy}
 */
public final class FlowImportStrategy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.FlowImportStrategy)
    FlowImportStrategyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FlowImportStrategy.newBuilder() to construct.
  private FlowImportStrategy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FlowImportStrategy() {
    globalImportStrategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FlowImportStrategy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.class,
            com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.Builder.class);
  }

  public static final int GLOBAL_IMPORT_STRATEGY_FIELD_NUMBER = 1;
  private int globalImportStrategy_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Import strategy for resource conflict resolution, applied
   * globally throughout the flow. It will be applied for all display name
   * conflicts in the imported content. If not specified, 'CREATE_NEW' is
   * assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for globalImportStrategy.
   */
  @java.lang.Override
  public int getGlobalImportStrategyValue() {
    return globalImportStrategy_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Import strategy for resource conflict resolution, applied
   * globally throughout the flow. It will be applied for all display name
   * conflicts in the imported content. If not specified, 'CREATE_NEW' is
   * assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The globalImportStrategy.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ImportStrategy getGlobalImportStrategy() {
    com.google.cloud.dialogflow.cx.v3.ImportStrategy result =
        com.google.cloud.dialogflow.cx.v3.ImportStrategy.forNumber(globalImportStrategy_);
    return result == null ? com.google.cloud.dialogflow.cx.v3.ImportStrategy.UNRECOGNIZED : result;
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
    if (globalImportStrategy_
        != com.google.cloud.dialogflow.cx.v3.ImportStrategy.IMPORT_STRATEGY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, globalImportStrategy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (globalImportStrategy_
        != com.google.cloud.dialogflow.cx.v3.ImportStrategy.IMPORT_STRATEGY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, globalImportStrategy_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.FlowImportStrategy)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.FlowImportStrategy other =
        (com.google.cloud.dialogflow.cx.v3.FlowImportStrategy) obj;

    if (globalImportStrategy_ != other.globalImportStrategy_) return false;
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
    hash = (37 * hash) + GLOBAL_IMPORT_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + globalImportStrategy_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.FlowImportStrategy prototype) {
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
   * The flow import strategy used for resource conflict resolution associated
   * with an [ImportFlowRequest][google.cloud.dialogflow.cx.v3.ImportFlowRequest].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.FlowImportStrategy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.FlowImportStrategy)
      com.google.cloud.dialogflow.cx.v3.FlowImportStrategyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.class,
              com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      globalImportStrategy_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_FlowImportStrategy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.FlowImportStrategy getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.FlowImportStrategy build() {
      com.google.cloud.dialogflow.cx.v3.FlowImportStrategy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.FlowImportStrategy buildPartial() {
      com.google.cloud.dialogflow.cx.v3.FlowImportStrategy result =
          new com.google.cloud.dialogflow.cx.v3.FlowImportStrategy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.FlowImportStrategy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.globalImportStrategy_ = globalImportStrategy_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.FlowImportStrategy) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.FlowImportStrategy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.FlowImportStrategy other) {
      if (other == com.google.cloud.dialogflow.cx.v3.FlowImportStrategy.getDefaultInstance())
        return this;
      if (other.globalImportStrategy_ != 0) {
        setGlobalImportStrategyValue(other.getGlobalImportStrategyValue());
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
            case 8:
              {
                globalImportStrategy_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int globalImportStrategy_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Import strategy for resource conflict resolution, applied
     * globally throughout the flow. It will be applied for all display name
     * conflicts in the imported content. If not specified, 'CREATE_NEW' is
     * assumed.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for globalImportStrategy.
     */
    @java.lang.Override
    public int getGlobalImportStrategyValue() {
      return globalImportStrategy_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Import strategy for resource conflict resolution, applied
     * globally throughout the flow. It will be applied for all display name
     * conflicts in the imported content. If not specified, 'CREATE_NEW' is
     * assumed.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for globalImportStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalImportStrategyValue(int value) {
      globalImportStrategy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Import strategy for resource conflict resolution, applied
     * globally throughout the flow. It will be applied for all display name
     * conflicts in the imported content. If not specified, 'CREATE_NEW' is
     * assumed.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The globalImportStrategy.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ImportStrategy getGlobalImportStrategy() {
      com.google.cloud.dialogflow.cx.v3.ImportStrategy result =
          com.google.cloud.dialogflow.cx.v3.ImportStrategy.forNumber(globalImportStrategy_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3.ImportStrategy.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Import strategy for resource conflict resolution, applied
     * globally throughout the flow. It will be applied for all display name
     * conflicts in the imported content. If not specified, 'CREATE_NEW' is
     * assumed.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The globalImportStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalImportStrategy(com.google.cloud.dialogflow.cx.v3.ImportStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      globalImportStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Import strategy for resource conflict resolution, applied
     * globally throughout the flow. It will be applied for all display name
     * conflicts in the imported content. If not specified, 'CREATE_NEW' is
     * assumed.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.ImportStrategy global_import_strategy = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGlobalImportStrategy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      globalImportStrategy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.FlowImportStrategy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.FlowImportStrategy)
  private static final com.google.cloud.dialogflow.cx.v3.FlowImportStrategy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.FlowImportStrategy();
  }

  public static com.google.cloud.dialogflow.cx.v3.FlowImportStrategy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlowImportStrategy> PARSER =
      new com.google.protobuf.AbstractParser<FlowImportStrategy>() {
        @java.lang.Override
        public FlowImportStrategy parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlowImportStrategy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlowImportStrategy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.FlowImportStrategy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
