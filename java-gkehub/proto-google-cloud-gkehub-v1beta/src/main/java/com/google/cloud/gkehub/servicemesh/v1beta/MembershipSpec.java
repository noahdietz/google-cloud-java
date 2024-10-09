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
// source: google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkehub.servicemesh.v1beta;

/**
 *
 *
 * <pre>
 * **Service Mesh**: Spec for a single Membership for the servicemesh feature
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.servicemesh.v1beta.MembershipSpec}
 */
public final class MembershipSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec)
    MembershipSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MembershipSpec.newBuilder() to construct.
  private MembershipSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MembershipSpec() {
    controlPlane_ = 0;
    management_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MembershipSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.servicemesh.v1beta.ServiceMeshProto
        .internal_static_google_cloud_gkehub_servicemesh_v1beta_MembershipSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.servicemesh.v1beta.ServiceMeshProto
        .internal_static_google_cloud_gkehub_servicemesh_v1beta_MembershipSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.class,
            com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Whether to automatically manage Service Mesh control planes.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement}
   */
  public enum ControlPlaneManagement implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>CONTROL_PLANE_MANAGEMENT_UNSPECIFIED = 0;</code>
     */
    CONTROL_PLANE_MANAGEMENT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Google should provision a control plane revision and make it available in
     * the cluster. Google will enroll this revision in a release channel and
     * keep it up to date. The control plane revision may be a managed service,
     * or a managed install.
     * </pre>
     *
     * <code>AUTOMATIC = 1;</code>
     */
    AUTOMATIC(1),
    /**
     *
     *
     * <pre>
     * User will manually configure the control plane (e.g. via CLI, or via the
     * ControlPlaneRevision KRM API)
     * </pre>
     *
     * <code>MANUAL = 2;</code>
     */
    MANUAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>CONTROL_PLANE_MANAGEMENT_UNSPECIFIED = 0;</code>
     */
    public static final int CONTROL_PLANE_MANAGEMENT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Google should provision a control plane revision and make it available in
     * the cluster. Google will enroll this revision in a release channel and
     * keep it up to date. The control plane revision may be a managed service,
     * or a managed install.
     * </pre>
     *
     * <code>AUTOMATIC = 1;</code>
     */
    public static final int AUTOMATIC_VALUE = 1;
    /**
     *
     *
     * <pre>
     * User will manually configure the control plane (e.g. via CLI, or via the
     * ControlPlaneRevision KRM API)
     * </pre>
     *
     * <code>MANUAL = 2;</code>
     */
    public static final int MANUAL_VALUE = 2;

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
    public static ControlPlaneManagement valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ControlPlaneManagement forNumber(int value) {
      switch (value) {
        case 0:
          return CONTROL_PLANE_MANAGEMENT_UNSPECIFIED;
        case 1:
          return AUTOMATIC;
        case 2:
          return MANUAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ControlPlaneManagement>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ControlPlaneManagement>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ControlPlaneManagement>() {
              public ControlPlaneManagement findValueByNumber(int number) {
                return ControlPlaneManagement.forNumber(number);
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
      return com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ControlPlaneManagement[] VALUES = values();

    public static ControlPlaneManagement valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ControlPlaneManagement(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement)
  }

  /**
   *
   *
   * <pre>
   * Whether to automatically manage Service Mesh.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management}
   */
  public enum Management implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>MANAGEMENT_UNSPECIFIED = 0;</code>
     */
    MANAGEMENT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Google should manage my Service Mesh for the cluster.
     * </pre>
     *
     * <code>MANAGEMENT_AUTOMATIC = 1;</code>
     */
    MANAGEMENT_AUTOMATIC(1),
    /**
     *
     *
     * <pre>
     * User will manually configure their service mesh components.
     * </pre>
     *
     * <code>MANAGEMENT_MANUAL = 2;</code>
     */
    MANAGEMENT_MANUAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>MANAGEMENT_UNSPECIFIED = 0;</code>
     */
    public static final int MANAGEMENT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Google should manage my Service Mesh for the cluster.
     * </pre>
     *
     * <code>MANAGEMENT_AUTOMATIC = 1;</code>
     */
    public static final int MANAGEMENT_AUTOMATIC_VALUE = 1;
    /**
     *
     *
     * <pre>
     * User will manually configure their service mesh components.
     * </pre>
     *
     * <code>MANAGEMENT_MANUAL = 2;</code>
     */
    public static final int MANAGEMENT_MANUAL_VALUE = 2;

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
    public static Management valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Management forNumber(int value) {
      switch (value) {
        case 0:
          return MANAGEMENT_UNSPECIFIED;
        case 1:
          return MANAGEMENT_AUTOMATIC;
        case 2:
          return MANAGEMENT_MANUAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Management> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Management> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Management>() {
          public Management findValueByNumber(int number) {
            return Management.forNumber(number);
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
      return com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.getDescriptor()
          .getEnumTypes()
          .get(1);
    }

    private static final Management[] VALUES = values();

    public static Management valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Management(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management)
  }

  public static final int CONTROL_PLANE_FIELD_NUMBER = 1;
  private int controlPlane_ = 0;
  /**
   *
   *
   * <pre>
   * Deprecated: use `management` instead
   * Enables automatic control plane management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is deprecated.
   *     See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
   * @return The enum numeric value on the wire for controlPlane.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public int getControlPlaneValue() {
    return controlPlane_;
  }
  /**
   *
   *
   * <pre>
   * Deprecated: use `management` instead
   * Enables automatic control plane management.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is deprecated.
   *     See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
   * @return The controlPlane.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
      getControlPlane() {
    com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement result =
        com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement.forNumber(
            controlPlane_);
    return result == null
        ? com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
            .UNRECOGNIZED
        : result;
  }

  public static final int MANAGEMENT_FIELD_NUMBER = 4;
  private int management_ = 0;
  /**
   *
   *
   * <pre>
   * Enables automatic Service Mesh management.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;</code>
   *
   * @return The enum numeric value on the wire for management.
   */
  @java.lang.Override
  public int getManagementValue() {
    return management_;
  }
  /**
   *
   *
   * <pre>
   * Enables automatic Service Mesh management.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;</code>
   *
   * @return The management.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management getManagement() {
    com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management result =
        com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management.forNumber(management_);
    return result == null
        ? com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management.UNRECOGNIZED
        : result;
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
    if (controlPlane_
        != com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
            .CONTROL_PLANE_MANAGEMENT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, controlPlane_);
    }
    if (management_
        != com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management
            .MANAGEMENT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, management_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controlPlane_
        != com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
            .CONTROL_PLANE_MANAGEMENT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, controlPlane_);
    }
    if (management_
        != com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management
            .MANAGEMENT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, management_);
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
    if (!(obj instanceof com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec other =
        (com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec) obj;

    if (controlPlane_ != other.controlPlane_) return false;
    if (management_ != other.management_) return false;
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
    hash = (37 * hash) + CONTROL_PLANE_FIELD_NUMBER;
    hash = (53 * hash) + controlPlane_;
    hash = (37 * hash) + MANAGEMENT_FIELD_NUMBER;
    hash = (53 * hash) + management_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec parseFrom(
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
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec prototype) {
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
   * **Service Mesh**: Spec for a single Membership for the servicemesh feature
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.servicemesh.v1beta.MembershipSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec)
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.servicemesh.v1beta.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1beta_MembershipSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.servicemesh.v1beta.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1beta_MembershipSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.class,
              com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      controlPlane_ = 0;
      management_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.servicemesh.v1beta.ServiceMeshProto
          .internal_static_google_cloud_gkehub_servicemesh_v1beta_MembershipSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec build() {
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec buildPartial() {
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec result =
          new com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.controlPlane_ = controlPlane_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.management_ = management_;
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
      if (other instanceof com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec) {
        return mergeFrom((com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec other) {
      if (other == com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.getDefaultInstance())
        return this;
      if (other.controlPlane_ != 0) {
        setControlPlaneValue(other.getControlPlaneValue());
      }
      if (other.management_ != 0) {
        setManagementValue(other.getManagementValue());
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
                controlPlane_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 32:
              {
                management_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
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

    private int controlPlane_ = 0;
    /**
     *
     *
     * <pre>
     * Deprecated: use `management` instead
     * Enables automatic control plane management.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is
     *     deprecated. See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
     * @return The enum numeric value on the wire for controlPlane.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public int getControlPlaneValue() {
      return controlPlane_;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `management` instead
     * Enables automatic control plane management.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is
     *     deprecated. See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
     * @param value The enum numeric value on the wire for controlPlane to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setControlPlaneValue(int value) {
      controlPlane_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `management` instead
     * Enables automatic control plane management.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is
     *     deprecated. See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
     * @return The controlPlane.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
        getControlPlane() {
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement result =
          com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
              .forNumber(controlPlane_);
      return result == null
          ? com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `management` instead
     * Enables automatic control plane management.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is
     *     deprecated. See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
     * @param value The controlPlane to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setControlPlane(
        com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      controlPlane_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `management` instead
     * Enables automatic control plane management.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.ControlPlaneManagement control_plane = 1 [deprecated = true];
     * </code>
     *
     * @deprecated google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.control_plane is
     *     deprecated. See google/cloud/gkehub/servicemesh/v1beta/servicemesh.proto;l=60
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearControlPlane() {
      bitField0_ = (bitField0_ & ~0x00000001);
      controlPlane_ = 0;
      onChanged();
      return this;
    }

    private int management_ = 0;
    /**
     *
     *
     * <pre>
     * Enables automatic Service Mesh management.
     * </pre>
     *
     * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;
     * </code>
     *
     * @return The enum numeric value on the wire for management.
     */
    @java.lang.Override
    public int getManagementValue() {
      return management_;
    }
    /**
     *
     *
     * <pre>
     * Enables automatic Service Mesh management.
     * </pre>
     *
     * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;
     * </code>
     *
     * @param value The enum numeric value on the wire for management to set.
     * @return This builder for chaining.
     */
    public Builder setManagementValue(int value) {
      management_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enables automatic Service Mesh management.
     * </pre>
     *
     * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;
     * </code>
     *
     * @return The management.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management getManagement() {
      com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management result =
          com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management.forNumber(
              management_);
      return result == null
          ? com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Enables automatic Service Mesh management.
     * </pre>
     *
     * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;
     * </code>
     *
     * @param value The management to set.
     * @return This builder for chaining.
     */
    public Builder setManagement(
        com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      management_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enables automatic Service Mesh management.
     * </pre>
     *
     * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec.Management management = 4;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearManagement() {
      bitField0_ = (bitField0_ & ~0x00000002);
      management_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.servicemesh.v1beta.MembershipSpec)
  private static final com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec();
  }

  public static com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipSpec> PARSER =
      new com.google.protobuf.AbstractParser<MembershipSpec>() {
        @java.lang.Override
        public MembershipSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<MembershipSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
