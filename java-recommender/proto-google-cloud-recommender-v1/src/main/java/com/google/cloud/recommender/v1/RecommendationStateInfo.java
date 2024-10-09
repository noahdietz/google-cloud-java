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
// source: google/cloud/recommender/v1/recommendation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.recommender.v1;

/**
 *
 *
 * <pre>
 * Information for state. Contains state and metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1.RecommendationStateInfo}
 */
public final class RecommendationStateInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1.RecommendationStateInfo)
    RecommendationStateInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecommendationStateInfo.newBuilder() to construct.
  private RecommendationStateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecommendationStateInfo() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecommendationStateInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetStateMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1.RecommendationStateInfo.class,
            com.google.cloud.recommender.v1.RecommendationStateInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Represents Recommendation State.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recommender.v1.RecommendationStateInfo.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default state. Don't use directly.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Recommendation is active and can be applied. Recommendations content can
     * be updated by Google.
     *
     * ACTIVE recommendations can be marked as CLAIMED, SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1),
    /**
     *
     *
     * <pre>
     * Recommendation is in claimed state. Recommendations content is
     * immutable and cannot be updated by Google.
     *
     * CLAIMED recommendations can be marked as CLAIMED, SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>CLAIMED = 6;</code>
     */
    CLAIMED(6),
    /**
     *
     *
     * <pre>
     * Recommendation is in succeeded state. Recommendations content is
     * immutable and cannot be updated by Google.
     *
     * SUCCEEDED recommendations can be marked as SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>SUCCEEDED = 3;</code>
     */
    SUCCEEDED(3),
    /**
     *
     *
     * <pre>
     * Recommendation is in failed state. Recommendations content is immutable
     * and cannot be updated by Google.
     *
     * FAILED recommendations can be marked as SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    FAILED(4),
    /**
     *
     *
     * <pre>
     * Recommendation is in dismissed state. Recommendation content can be
     * updated by Google.
     *
     * DISMISSED recommendations can be marked as ACTIVE.
     * </pre>
     *
     * <code>DISMISSED = 5;</code>
     */
    DISMISSED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default state. Don't use directly.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Recommendation is active and can be applied. Recommendations content can
     * be updated by Google.
     *
     * ACTIVE recommendations can be marked as CLAIMED, SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Recommendation is in claimed state. Recommendations content is
     * immutable and cannot be updated by Google.
     *
     * CLAIMED recommendations can be marked as CLAIMED, SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>CLAIMED = 6;</code>
     */
    public static final int CLAIMED_VALUE = 6;
    /**
     *
     *
     * <pre>
     * Recommendation is in succeeded state. Recommendations content is
     * immutable and cannot be updated by Google.
     *
     * SUCCEEDED recommendations can be marked as SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>SUCCEEDED = 3;</code>
     */
    public static final int SUCCEEDED_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Recommendation is in failed state. Recommendations content is immutable
     * and cannot be updated by Google.
     *
     * FAILED recommendations can be marked as SUCCEEDED, or FAILED.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    public static final int FAILED_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Recommendation is in dismissed state. Recommendation content can be
     * updated by Google.
     *
     * DISMISSED recommendations can be marked as ACTIVE.
     * </pre>
     *
     * <code>DISMISSED = 5;</code>
     */
    public static final int DISMISSED_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return ACTIVE;
        case 6:
          return CLAIMED;
        case 3:
          return SUCCEEDED;
        case 4:
          return FAILED;
        case 5:
          return DISMISSED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.recommender.v1.RecommendationStateInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recommender.v1.RecommendationStateInfo.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1.RecommendationStateInfo.State getState() {
    com.google.cloud.recommender.v1.RecommendationStateInfo.State result =
        com.google.cloud.recommender.v1.RecommendationStateInfo.State.forNumber(state_);
    return result == null
        ? com.google.cloud.recommender.v1.RecommendationStateInfo.State.UNRECOGNIZED
        : result;
  }

  public static final int STATE_METADATA_FIELD_NUMBER = 2;

  private static final class StateMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.recommender.v1.RecommendationOuterClass
                .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> stateMetadata_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetStateMetadata() {
    if (stateMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StateMetadataDefaultEntryHolder.defaultEntry);
    }
    return stateMetadata_;
  }

  public int getStateMetadataCount() {
    return internalGetStateMetadata().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public boolean containsStateMetadata(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetStateMetadata().getMap().containsKey(key);
  }
  /** Use {@link #getStateMetadataMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
    return getStateMetadataMap();
  }
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
    return internalGetStateMetadata().getMap();
  }
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetStateMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getStateMetadataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetStateMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (state_
        != com.google.cloud.recommender.v1.RecommendationStateInfo.State.STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, state_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetStateMetadata(), StateMetadataDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.recommender.v1.RecommendationStateInfo.State.STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetStateMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> stateMetadata__ =
          StateMetadataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, stateMetadata__);
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
    if (!(obj instanceof com.google.cloud.recommender.v1.RecommendationStateInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1.RecommendationStateInfo other =
        (com.google.cloud.recommender.v1.RecommendationStateInfo) obj;

    if (state_ != other.state_) return false;
    if (!internalGetStateMetadata().equals(other.internalGetStateMetadata())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (!internalGetStateMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + STATE_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStateMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo parseFrom(
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
      com.google.cloud.recommender.v1.RecommendationStateInfo prototype) {
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
   * Information for state. Contains state and metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1.RecommendationStateInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1.RecommendationStateInfo)
      com.google.cloud.recommender.v1.RecommendationStateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetStateMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableStateMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1.RecommendationStateInfo.class,
              com.google.cloud.recommender.v1.RecommendationStateInfo.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1.RecommendationStateInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      internalGetMutableStateMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.RecommendationStateInfo getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1.RecommendationStateInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.RecommendationStateInfo build() {
      com.google.cloud.recommender.v1.RecommendationStateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.RecommendationStateInfo buildPartial() {
      com.google.cloud.recommender.v1.RecommendationStateInfo result =
          new com.google.cloud.recommender.v1.RecommendationStateInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.recommender.v1.RecommendationStateInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stateMetadata_ = internalGetStateMetadata();
        result.stateMetadata_.makeImmutable();
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
      if (other instanceof com.google.cloud.recommender.v1.RecommendationStateInfo) {
        return mergeFrom((com.google.cloud.recommender.v1.RecommendationStateInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1.RecommendationStateInfo other) {
      if (other == com.google.cloud.recommender.v1.RecommendationStateInfo.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      internalGetMutableStateMetadata().mergeFrom(other.internalGetStateMetadata());
      bitField0_ |= 0x00000002;
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
                state_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> stateMetadata__ =
                    input.readMessage(
                        StateMetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableStateMetadata()
                    .getMutableMap()
                    .put(stateMetadata__.getKey(), stateMetadata__.getValue());
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

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.recommender.v1.RecommendationStateInfo.State getState() {
      com.google.cloud.recommender.v1.RecommendationStateInfo.State result =
          com.google.cloud.recommender.v1.RecommendationStateInfo.State.forNumber(state_);
      return result == null
          ? com.google.cloud.recommender.v1.RecommendationStateInfo.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.recommender.v1.RecommendationStateInfo.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED.
     * </pre>
     *
     * <code>.google.cloud.recommender.v1.RecommendationStateInfo.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> stateMetadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetStateMetadata() {
      if (stateMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StateMetadataDefaultEntryHolder.defaultEntry);
      }
      return stateMetadata_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableStateMetadata() {
      if (stateMetadata_ == null) {
        stateMetadata_ =
            com.google.protobuf.MapField.newMapField(StateMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!stateMetadata_.isMutable()) {
        stateMetadata_ = stateMetadata_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return stateMetadata_;
    }

    public int getStateMetadataCount() {
      return internalGetStateMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public boolean containsStateMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetStateMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getStateMetadataMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
      return getStateMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
      return internalGetStateMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getStateMetadataOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetStateMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getStateMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetStateMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearStateMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableStateMetadata().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder removeStateMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableStateMetadata().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableStateMetadata() {
      bitField0_ |= 0x00000002;
      return internalGetMutableStateMetadata().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder putStateMetadata(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableStateMetadata().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map of metadata for the state, provided by user or automations systems.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder putAllStateMetadata(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableStateMetadata().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1.RecommendationStateInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.RecommendationStateInfo)
  private static final com.google.cloud.recommender.v1.RecommendationStateInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1.RecommendationStateInfo();
  }

  public static com.google.cloud.recommender.v1.RecommendationStateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendationStateInfo> PARSER =
      new com.google.protobuf.AbstractParser<RecommendationStateInfo>() {
        @java.lang.Override
        public RecommendationStateInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecommendationStateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendationStateInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1.RecommendationStateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
