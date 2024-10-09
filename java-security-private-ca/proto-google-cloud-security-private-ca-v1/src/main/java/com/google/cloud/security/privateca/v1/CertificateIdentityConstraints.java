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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.privateca.v1;

/**
 *
 *
 * <pre>
 * Describes constraints on a
 * [Certificate][google.cloud.security.privateca.v1.Certificate]'s
 * [Subject][google.cloud.security.privateca.v1.Subject] and
 * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames].
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.CertificateIdentityConstraints}
 */
public final class CertificateIdentityConstraints extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.CertificateIdentityConstraints)
    CertificateIdentityConstraintsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CertificateIdentityConstraints.newBuilder() to construct.
  private CertificateIdentityConstraints(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CertificateIdentityConstraints() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CertificateIdentityConstraints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1_CertificateIdentityConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1_CertificateIdentityConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.CertificateIdentityConstraints.class,
            com.google.cloud.security.privateca.v1.CertificateIdentityConstraints.Builder.class);
  }

  private int bitField0_;
  public static final int CEL_EXPRESSION_FIELD_NUMBER = 1;
  private com.google.type.Expr celExpression_;
  /**
   *
   *
   * <pre>
   * Optional. A CEL expression that may be used to validate the resolved X.509
   * Subject and/or Subject Alternative Name before a certificate is signed. To
   * see the full allowed syntax and some examples, see
   * https://cloud.google.com/certificate-authority-service/docs/using-cel
   * </pre>
   *
   * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the celExpression field is set.
   */
  @java.lang.Override
  public boolean hasCelExpression() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. A CEL expression that may be used to validate the resolved X.509
   * Subject and/or Subject Alternative Name before a certificate is signed. To
   * see the full allowed syntax and some examples, see
   * https://cloud.google.com/certificate-authority-service/docs/using-cel
   * </pre>
   *
   * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The celExpression.
   */
  @java.lang.Override
  public com.google.type.Expr getCelExpression() {
    return celExpression_ == null ? com.google.type.Expr.getDefaultInstance() : celExpression_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A CEL expression that may be used to validate the resolved X.509
   * Subject and/or Subject Alternative Name before a certificate is signed. To
   * see the full allowed syntax and some examples, see
   * https://cloud.google.com/certificate-authority-service/docs/using-cel
   * </pre>
   *
   * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.type.ExprOrBuilder getCelExpressionOrBuilder() {
    return celExpression_ == null ? com.google.type.Expr.getDefaultInstance() : celExpression_;
  }

  public static final int ALLOW_SUBJECT_PASSTHROUGH_FIELD_NUMBER = 2;
  private boolean allowSubjectPassthrough_ = false;
  /**
   *
   *
   * <pre>
   * Required. If this is true, the
   * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
   * from a certificate request into the signed certificate. Otherwise, the
   * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
   * discarded.
   * </pre>
   *
   * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the allowSubjectPassthrough field is set.
   */
  @java.lang.Override
  public boolean hasAllowSubjectPassthrough() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. If this is true, the
   * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
   * from a certificate request into the signed certificate. Otherwise, the
   * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
   * discarded.
   * </pre>
   *
   * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The allowSubjectPassthrough.
   */
  @java.lang.Override
  public boolean getAllowSubjectPassthrough() {
    return allowSubjectPassthrough_;
  }

  public static final int ALLOW_SUBJECT_ALT_NAMES_PASSTHROUGH_FIELD_NUMBER = 3;
  private boolean allowSubjectAltNamesPassthrough_ = false;
  /**
   *
   *
   * <pre>
   * Required. If this is true, the
   * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
   * extension may be copied from a certificate request into the signed
   * certificate. Otherwise, the requested
   * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
   * be discarded.
   * </pre>
   *
   * <code>
   * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the allowSubjectAltNamesPassthrough field is set.
   */
  @java.lang.Override
  public boolean hasAllowSubjectAltNamesPassthrough() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. If this is true, the
   * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
   * extension may be copied from a certificate request into the signed
   * certificate. Otherwise, the requested
   * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
   * be discarded.
   * </pre>
   *
   * <code>
   * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The allowSubjectAltNamesPassthrough.
   */
  @java.lang.Override
  public boolean getAllowSubjectAltNamesPassthrough() {
    return allowSubjectAltNamesPassthrough_;
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
      output.writeMessage(1, getCelExpression());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, allowSubjectPassthrough_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, allowSubjectAltNamesPassthrough_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCelExpression());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowSubjectPassthrough_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              3, allowSubjectAltNamesPassthrough_);
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
    if (!(obj instanceof com.google.cloud.security.privateca.v1.CertificateIdentityConstraints)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.CertificateIdentityConstraints other =
        (com.google.cloud.security.privateca.v1.CertificateIdentityConstraints) obj;

    if (hasCelExpression() != other.hasCelExpression()) return false;
    if (hasCelExpression()) {
      if (!getCelExpression().equals(other.getCelExpression())) return false;
    }
    if (hasAllowSubjectPassthrough() != other.hasAllowSubjectPassthrough()) return false;
    if (hasAllowSubjectPassthrough()) {
      if (getAllowSubjectPassthrough() != other.getAllowSubjectPassthrough()) return false;
    }
    if (hasAllowSubjectAltNamesPassthrough() != other.hasAllowSubjectAltNamesPassthrough())
      return false;
    if (hasAllowSubjectAltNamesPassthrough()) {
      if (getAllowSubjectAltNamesPassthrough() != other.getAllowSubjectAltNamesPassthrough())
        return false;
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
    if (hasCelExpression()) {
      hash = (37 * hash) + CEL_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getCelExpression().hashCode();
    }
    if (hasAllowSubjectPassthrough()) {
      hash = (37 * hash) + ALLOW_SUBJECT_PASSTHROUGH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowSubjectPassthrough());
    }
    if (hasAllowSubjectAltNamesPassthrough()) {
      hash = (37 * hash) + ALLOW_SUBJECT_ALT_NAMES_PASSTHROUGH_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashBoolean(getAllowSubjectAltNamesPassthrough());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints parseFrom(
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
      com.google.cloud.security.privateca.v1.CertificateIdentityConstraints prototype) {
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
   * Describes constraints on a
   * [Certificate][google.cloud.security.privateca.v1.Certificate]'s
   * [Subject][google.cloud.security.privateca.v1.Subject] and
   * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames].
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.CertificateIdentityConstraints}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.CertificateIdentityConstraints)
      com.google.cloud.security.privateca.v1.CertificateIdentityConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_CertificateIdentityConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_CertificateIdentityConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.CertificateIdentityConstraints.class,
              com.google.cloud.security.privateca.v1.CertificateIdentityConstraints.Builder.class);
    }

    // Construct using
    // com.google.cloud.security.privateca.v1.CertificateIdentityConstraints.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCelExpressionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      celExpression_ = null;
      if (celExpressionBuilder_ != null) {
        celExpressionBuilder_.dispose();
        celExpressionBuilder_ = null;
      }
      allowSubjectPassthrough_ = false;
      allowSubjectAltNamesPassthrough_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_CertificateIdentityConstraints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
        getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.CertificateIdentityConstraints build() {
      com.google.cloud.security.privateca.v1.CertificateIdentityConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.CertificateIdentityConstraints buildPartial() {
      com.google.cloud.security.privateca.v1.CertificateIdentityConstraints result =
          new com.google.cloud.security.privateca.v1.CertificateIdentityConstraints(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.security.privateca.v1.CertificateIdentityConstraints result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.celExpression_ =
            celExpressionBuilder_ == null ? celExpression_ : celExpressionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowSubjectPassthrough_ = allowSubjectPassthrough_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowSubjectAltNamesPassthrough_ = allowSubjectAltNamesPassthrough_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.security.privateca.v1.CertificateIdentityConstraints) {
        return mergeFrom(
            (com.google.cloud.security.privateca.v1.CertificateIdentityConstraints) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.security.privateca.v1.CertificateIdentityConstraints other) {
      if (other
          == com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
              .getDefaultInstance()) return this;
      if (other.hasCelExpression()) {
        mergeCelExpression(other.getCelExpression());
      }
      if (other.hasAllowSubjectPassthrough()) {
        setAllowSubjectPassthrough(other.getAllowSubjectPassthrough());
      }
      if (other.hasAllowSubjectAltNamesPassthrough()) {
        setAllowSubjectAltNamesPassthrough(other.getAllowSubjectAltNamesPassthrough());
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
                input.readMessage(getCelExpressionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                allowSubjectPassthrough_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                allowSubjectAltNamesPassthrough_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private com.google.type.Expr celExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>
        celExpressionBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the celExpression field is set.
     */
    public boolean hasCelExpression() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The celExpression.
     */
    public com.google.type.Expr getCelExpression() {
      if (celExpressionBuilder_ == null) {
        return celExpression_ == null ? com.google.type.Expr.getDefaultInstance() : celExpression_;
      } else {
        return celExpressionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setCelExpression(com.google.type.Expr value) {
      if (celExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        celExpression_ = value;
      } else {
        celExpressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setCelExpression(com.google.type.Expr.Builder builderForValue) {
      if (celExpressionBuilder_ == null) {
        celExpression_ = builderForValue.build();
      } else {
        celExpressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeCelExpression(com.google.type.Expr value) {
      if (celExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && celExpression_ != null
            && celExpression_ != com.google.type.Expr.getDefaultInstance()) {
          getCelExpressionBuilder().mergeFrom(value);
        } else {
          celExpression_ = value;
        }
      } else {
        celExpressionBuilder_.mergeFrom(value);
      }
      if (celExpression_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearCelExpression() {
      bitField0_ = (bitField0_ & ~0x00000001);
      celExpression_ = null;
      if (celExpressionBuilder_ != null) {
        celExpressionBuilder_.dispose();
        celExpressionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.type.Expr.Builder getCelExpressionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCelExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.type.ExprOrBuilder getCelExpressionOrBuilder() {
      if (celExpressionBuilder_ != null) {
        return celExpressionBuilder_.getMessageOrBuilder();
      } else {
        return celExpression_ == null ? com.google.type.Expr.getDefaultInstance() : celExpression_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A CEL expression that may be used to validate the resolved X.509
     * Subject and/or Subject Alternative Name before a certificate is signed. To
     * see the full allowed syntax and some examples, see
     * https://cloud.google.com/certificate-authority-service/docs/using-cel
     * </pre>
     *
     * <code>.google.type.Expr cel_expression = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>
        getCelExpressionFieldBuilder() {
      if (celExpressionBuilder_ == null) {
        celExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>(
                getCelExpression(), getParentForChildren(), isClean());
        celExpression_ = null;
      }
      return celExpressionBuilder_;
    }

    private boolean allowSubjectPassthrough_;
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
     * from a certificate request into the signed certificate. Otherwise, the
     * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
     * discarded.
     * </pre>
     *
     * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the allowSubjectPassthrough field is set.
     */
    @java.lang.Override
    public boolean hasAllowSubjectPassthrough() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
     * from a certificate request into the signed certificate. Otherwise, the
     * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
     * discarded.
     * </pre>
     *
     * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The allowSubjectPassthrough.
     */
    @java.lang.Override
    public boolean getAllowSubjectPassthrough() {
      return allowSubjectPassthrough_;
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
     * from a certificate request into the signed certificate. Otherwise, the
     * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
     * discarded.
     * </pre>
     *
     * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The allowSubjectPassthrough to set.
     * @return This builder for chaining.
     */
    public Builder setAllowSubjectPassthrough(boolean value) {

      allowSubjectPassthrough_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [Subject][google.cloud.security.privateca.v1.Subject] field may be copied
     * from a certificate request into the signed certificate. Otherwise, the
     * requested [Subject][google.cloud.security.privateca.v1.Subject] will be
     * discarded.
     * </pre>
     *
     * <code>optional bool allow_subject_passthrough = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowSubjectPassthrough() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowSubjectPassthrough_ = false;
      onChanged();
      return this;
    }

    private boolean allowSubjectAltNamesPassthrough_;
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
     * extension may be copied from a certificate request into the signed
     * certificate. Otherwise, the requested
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
     * be discarded.
     * </pre>
     *
     * <code>
     * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the allowSubjectAltNamesPassthrough field is set.
     */
    @java.lang.Override
    public boolean hasAllowSubjectAltNamesPassthrough() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
     * extension may be copied from a certificate request into the signed
     * certificate. Otherwise, the requested
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
     * be discarded.
     * </pre>
     *
     * <code>
     * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The allowSubjectAltNamesPassthrough.
     */
    @java.lang.Override
    public boolean getAllowSubjectAltNamesPassthrough() {
      return allowSubjectAltNamesPassthrough_;
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
     * extension may be copied from a certificate request into the signed
     * certificate. Otherwise, the requested
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
     * be discarded.
     * </pre>
     *
     * <code>
     * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The allowSubjectAltNamesPassthrough to set.
     * @return This builder for chaining.
     */
    public Builder setAllowSubjectAltNamesPassthrough(boolean value) {

      allowSubjectAltNamesPassthrough_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If this is true, the
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames]
     * extension may be copied from a certificate request into the signed
     * certificate. Otherwise, the requested
     * [SubjectAltNames][google.cloud.security.privateca.v1.SubjectAltNames] will
     * be discarded.
     * </pre>
     *
     * <code>
     * optional bool allow_subject_alt_names_passthrough = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowSubjectAltNamesPassthrough() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowSubjectAltNamesPassthrough_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.CertificateIdentityConstraints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.CertificateIdentityConstraints)
  private static final com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1.CertificateIdentityConstraints();
  }

  public static com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateIdentityConstraints> PARSER =
      new com.google.protobuf.AbstractParser<CertificateIdentityConstraints>() {
        @java.lang.Override
        public CertificateIdentityConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateIdentityConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateIdentityConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.CertificateIdentityConstraints
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
