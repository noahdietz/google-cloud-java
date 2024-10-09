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
// source: google/cloud/securitycenter/v2/group_membership.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Contains details about groups of which this finding is a member. A group is a
 * collection of findings that are related in some way.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.GroupMembership}
 */
public final class GroupMembership extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.GroupMembership)
    GroupMembershipOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GroupMembership.newBuilder() to construct.
  private GroupMembership(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GroupMembership() {
    groupType_ = 0;
    groupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GroupMembership();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.GroupMembershipProto
        .internal_static_google_cloud_securitycenter_v2_GroupMembership_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.GroupMembershipProto
        .internal_static_google_cloud_securitycenter_v2_GroupMembership_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.GroupMembership.class,
            com.google.cloud.securitycenter.v2.GroupMembership.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible types of groups.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.securitycenter.v2.GroupMembership.GroupType}
   */
  public enum GroupType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>GROUP_TYPE_UNSPECIFIED = 0;</code>
     */
    GROUP_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Group represents a toxic combination.
     * </pre>
     *
     * <code>GROUP_TYPE_TOXIC_COMBINATION = 1;</code>
     */
    GROUP_TYPE_TOXIC_COMBINATION(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>GROUP_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int GROUP_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Group represents a toxic combination.
     * </pre>
     *
     * <code>GROUP_TYPE_TOXIC_COMBINATION = 1;</code>
     */
    public static final int GROUP_TYPE_TOXIC_COMBINATION_VALUE = 1;

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
    public static GroupType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GroupType forNumber(int value) {
      switch (value) {
        case 0:
          return GROUP_TYPE_UNSPECIFIED;
        case 1:
          return GROUP_TYPE_TOXIC_COMBINATION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GroupType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<GroupType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GroupType>() {
          public GroupType findValueByNumber(int number) {
            return GroupType.forNumber(number);
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
      return com.google.cloud.securitycenter.v2.GroupMembership.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final GroupType[] VALUES = values();

    public static GroupType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GroupType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v2.GroupMembership.GroupType)
  }

  public static final int GROUP_TYPE_FIELD_NUMBER = 1;
  private int groupType_ = 0;
  /**
   *
   *
   * <pre>
   * Type of group.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
   *
   * @return The enum numeric value on the wire for groupType.
   */
  @java.lang.Override
  public int getGroupTypeValue() {
    return groupType_;
  }
  /**
   *
   *
   * <pre>
   * Type of group.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
   *
   * @return The groupType.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v2.GroupMembership.GroupType getGroupType() {
    com.google.cloud.securitycenter.v2.GroupMembership.GroupType result =
        com.google.cloud.securitycenter.v2.GroupMembership.GroupType.forNumber(groupType_);
    return result == null
        ? com.google.cloud.securitycenter.v2.GroupMembership.GroupType.UNRECOGNIZED
        : result;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object groupId_ = "";
  /**
   *
   *
   * <pre>
   * ID of the group.
   * </pre>
   *
   * <code>string group_id = 2;</code>
   *
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the group.
   * </pre>
   *
   * <code>string group_id = 2;</code>
   *
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      groupId_ = b;
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
    if (groupType_
        != com.google.cloud.securitycenter.v2.GroupMembership.GroupType.GROUP_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, groupType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupType_
        != com.google.cloud.securitycenter.v2.GroupMembership.GroupType.GROUP_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, groupType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, groupId_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.GroupMembership)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.GroupMembership other =
        (com.google.cloud.securitycenter.v2.GroupMembership) obj;

    if (groupType_ != other.groupType_) return false;
    if (!getGroupId().equals(other.getGroupId())) return false;
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
    hash = (37 * hash) + GROUP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + groupType_;
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v2.GroupMembership prototype) {
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
   * Contains details about groups of which this finding is a member. A group is a
   * collection of findings that are related in some way.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.GroupMembership}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.GroupMembership)
      com.google.cloud.securitycenter.v2.GroupMembershipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.GroupMembershipProto
          .internal_static_google_cloud_securitycenter_v2_GroupMembership_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.GroupMembershipProto
          .internal_static_google_cloud_securitycenter_v2_GroupMembership_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.GroupMembership.class,
              com.google.cloud.securitycenter.v2.GroupMembership.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.GroupMembership.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      groupType_ = 0;
      groupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.GroupMembershipProto
          .internal_static_google_cloud_securitycenter_v2_GroupMembership_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.GroupMembership getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.GroupMembership.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.GroupMembership build() {
      com.google.cloud.securitycenter.v2.GroupMembership result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.GroupMembership buildPartial() {
      com.google.cloud.securitycenter.v2.GroupMembership result =
          new com.google.cloud.securitycenter.v2.GroupMembership(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.GroupMembership result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupType_ = groupType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupId_ = groupId_;
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
      if (other instanceof com.google.cloud.securitycenter.v2.GroupMembership) {
        return mergeFrom((com.google.cloud.securitycenter.v2.GroupMembership) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.GroupMembership other) {
      if (other == com.google.cloud.securitycenter.v2.GroupMembership.getDefaultInstance())
        return this;
      if (other.groupType_ != 0) {
        setGroupTypeValue(other.getGroupTypeValue());
      }
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
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
            case 8:
              {
                groupType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                groupId_ = input.readStringRequireUtf8();
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

    private int groupType_ = 0;
    /**
     *
     *
     * <pre>
     * Type of group.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
     *
     * @return The enum numeric value on the wire for groupType.
     */
    @java.lang.Override
    public int getGroupTypeValue() {
      return groupType_;
    }
    /**
     *
     *
     * <pre>
     * Type of group.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for groupType to set.
     * @return This builder for chaining.
     */
    public Builder setGroupTypeValue(int value) {
      groupType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of group.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
     *
     * @return The groupType.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v2.GroupMembership.GroupType getGroupType() {
      com.google.cloud.securitycenter.v2.GroupMembership.GroupType result =
          com.google.cloud.securitycenter.v2.GroupMembership.GroupType.forNumber(groupType_);
      return result == null
          ? com.google.cloud.securitycenter.v2.GroupMembership.GroupType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of group.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
     *
     * @param value The groupType to set.
     * @return This builder for chaining.
     */
    public Builder setGroupType(
        com.google.cloud.securitycenter.v2.GroupMembership.GroupType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      groupType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of group.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.GroupMembership.GroupType group_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGroupType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      groupType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object groupId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the group.
     * </pre>
     *
     * <code>string group_id = 2;</code>
     *
     * @return The groupId.
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the group.
     * </pre>
     *
     * <code>string group_id = 2;</code>
     *
     * @return The bytes for groupId.
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the group.
     * </pre>
     *
     * <code>string group_id = 2;</code>
     *
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      groupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the group.
     * </pre>
     *
     * <code>string group_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      groupId_ = getDefaultInstance().getGroupId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the group.
     * </pre>
     *
     * <code>string group_id = 2;</code>
     *
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      groupId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.GroupMembership)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.GroupMembership)
  private static final com.google.cloud.securitycenter.v2.GroupMembership DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.GroupMembership();
  }

  public static com.google.cloud.securitycenter.v2.GroupMembership getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupMembership> PARSER =
      new com.google.protobuf.AbstractParser<GroupMembership>() {
        @java.lang.Override
        public GroupMembership parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupMembership> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupMembership> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.GroupMembership getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
