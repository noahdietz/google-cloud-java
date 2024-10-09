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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_tables.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

/**
 *
 *
 * <pre>
 * Model metadata specific to AutoML Tables.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata}
 */
public final class AutoMlTablesMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
    AutoMlTablesMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoMlTablesMetadata.newBuilder() to construct.
  private AutoMlTablesMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoMlTablesMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoMlTablesMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLTablesProto
        .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLTablesProto
        .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata.class,
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
                .Builder.class);
  }

  public static final int TRAIN_COST_MILLI_NODE_HOURS_FIELD_NUMBER = 1;
  private long trainCostMilliNodeHours_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. The actual training cost of the model, expressed in milli
   * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
   * to not exceed the train budget.
   * </pre>
   *
   * <code>int64 train_cost_milli_node_hours = 1;</code>
   *
   * @return The trainCostMilliNodeHours.
   */
  @java.lang.Override
  public long getTrainCostMilliNodeHours() {
    return trainCostMilliNodeHours_;
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
    if (trainCostMilliNodeHours_ != 0L) {
      output.writeInt64(1, trainCostMilliNodeHours_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainCostMilliNodeHours_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, trainCostMilliNodeHours_);
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata other =
        (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata) obj;

    if (getTrainCostMilliNodeHours() != other.getTrainCostMilliNodeHours()) return false;
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
    hash = (37 * hash) + TRAIN_COST_MILLI_NODE_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTrainCostMilliNodeHours());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      parseFrom(
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
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata prototype) {
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
   * Model metadata specific to AutoML Tables.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLTablesProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLTablesProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
                  .class,
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      trainCostMilliNodeHours_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMLTablesProto
          .internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
        build() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
        buildPartial() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata result =
          new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata(
              this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trainCostMilliNodeHours_ = trainCostMilliNodeHours_;
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata other) {
      if (other
          == com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
              .getDefaultInstance()) return this;
      if (other.getTrainCostMilliNodeHours() != 0L) {
        setTrainCostMilliNodeHours(other.getTrainCostMilliNodeHours());
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
                trainCostMilliNodeHours_ = input.readInt64();
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

    private long trainCostMilliNodeHours_;
    /**
     *
     *
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     *
     * @return The trainCostMilliNodeHours.
     */
    @java.lang.Override
    public long getTrainCostMilliNodeHours() {
      return trainCostMilliNodeHours_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     *
     * @param value The trainCostMilliNodeHours to set.
     * @return This builder for chaining.
     */
    public Builder setTrainCostMilliNodeHours(long value) {

      trainCostMilliNodeHours_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrainCostMilliNodeHours() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trainCostMilliNodeHours_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
  private static final com.google.cloud.aiplatform.v1.schema.trainingjob.definition
          .AutoMlTablesMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata();
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlTablesMetadata> PARSER =
      new com.google.protobuf.AbstractParser<AutoMlTablesMetadata>() {
        @java.lang.Override
        public AutoMlTablesMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlTablesMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlTablesMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
