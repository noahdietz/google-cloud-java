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
// source: google/cloud/talent/v4beta1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Educational degree level defined in International Standard Classification
 * of Education (ISCED).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.DegreeType}
 */
public enum DegreeType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value. Represents no degree, or early childhood education.
   * Maps to ISCED code 0.
   * Ex) Kindergarten
   * </pre>
   *
   * <code>DEGREE_TYPE_UNSPECIFIED = 0;</code>
   */
  DEGREE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Primary education which is typically the first stage of compulsory
   * education. ISCED code 1.
   * Ex) Elementary school
   * </pre>
   *
   * <code>PRIMARY_EDUCATION = 1;</code>
   */
  PRIMARY_EDUCATION(1),
  /**
   *
   *
   * <pre>
   * Lower secondary education; First stage of secondary education building on
   * primary education, typically with a more subject-oriented curriculum.
   * ISCED code 2.
   * Ex) Middle school
   * </pre>
   *
   * <code>LOWER_SECONDARY_EDUCATION = 2;</code>
   */
  LOWER_SECONDARY_EDUCATION(2),
  /**
   *
   *
   * <pre>
   * Middle education; Second/final stage of secondary education preparing for
   * tertiary education and/or providing skills relevant to employment.
   * Usually with an increased range of subject options and streams. ISCED
   * code 3.
   * Ex) High school
   * </pre>
   *
   * <code>UPPER_SECONDARY_EDUCATION = 3;</code>
   */
  UPPER_SECONDARY_EDUCATION(3),
  /**
   *
   *
   * <pre>
   * Adult Remedial Education; Programmes providing learning experiences that
   * build on secondary education and prepare for labour market entry and/or
   * tertiary education. The content is broader than secondary but not as
   * complex as tertiary education. ISCED code 4.
   * </pre>
   *
   * <code>ADULT_REMEDIAL_EDUCATION = 4;</code>
   */
  ADULT_REMEDIAL_EDUCATION(4),
  /**
   *
   *
   * <pre>
   * Associate's or equivalent; Short first tertiary programmes that are
   * typically practically-based, occupationally-specific and prepare for
   * labour market entry. These programmes may also provide a pathway to other
   * tertiary programmes. ISCED code 5.
   * </pre>
   *
   * <code>ASSOCIATES_OR_EQUIVALENT = 5;</code>
   */
  ASSOCIATES_OR_EQUIVALENT(5),
  /**
   *
   *
   * <pre>
   * Bachelor's or equivalent; Programmes designed to provide intermediate
   * academic and/or professional knowledge, skills and competencies leading
   * to a first tertiary degree or equivalent qualification. ISCED code 6.
   * </pre>
   *
   * <code>BACHELORS_OR_EQUIVALENT = 6;</code>
   */
  BACHELORS_OR_EQUIVALENT(6),
  /**
   *
   *
   * <pre>
   * Master's or equivalent; Programmes designed to provide advanced academic
   * and/or professional knowledge, skills and competencies leading to a
   * second tertiary degree or equivalent qualification. ISCED code 7.
   * </pre>
   *
   * <code>MASTERS_OR_EQUIVALENT = 7;</code>
   */
  MASTERS_OR_EQUIVALENT(7),
  /**
   *
   *
   * <pre>
   * Doctoral or equivalent; Programmes designed primarily to lead to an
   * advanced research qualification, usually concluding with the submission
   * and defense of a substantive dissertation of publishable quality based on
   * original research. ISCED code 8.
   * </pre>
   *
   * <code>DOCTORAL_OR_EQUIVALENT = 8;</code>
   */
  DOCTORAL_OR_EQUIVALENT(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value. Represents no degree, or early childhood education.
   * Maps to ISCED code 0.
   * Ex) Kindergarten
   * </pre>
   *
   * <code>DEGREE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DEGREE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Primary education which is typically the first stage of compulsory
   * education. ISCED code 1.
   * Ex) Elementary school
   * </pre>
   *
   * <code>PRIMARY_EDUCATION = 1;</code>
   */
  public static final int PRIMARY_EDUCATION_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Lower secondary education; First stage of secondary education building on
   * primary education, typically with a more subject-oriented curriculum.
   * ISCED code 2.
   * Ex) Middle school
   * </pre>
   *
   * <code>LOWER_SECONDARY_EDUCATION = 2;</code>
   */
  public static final int LOWER_SECONDARY_EDUCATION_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Middle education; Second/final stage of secondary education preparing for
   * tertiary education and/or providing skills relevant to employment.
   * Usually with an increased range of subject options and streams. ISCED
   * code 3.
   * Ex) High school
   * </pre>
   *
   * <code>UPPER_SECONDARY_EDUCATION = 3;</code>
   */
  public static final int UPPER_SECONDARY_EDUCATION_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Adult Remedial Education; Programmes providing learning experiences that
   * build on secondary education and prepare for labour market entry and/or
   * tertiary education. The content is broader than secondary but not as
   * complex as tertiary education. ISCED code 4.
   * </pre>
   *
   * <code>ADULT_REMEDIAL_EDUCATION = 4;</code>
   */
  public static final int ADULT_REMEDIAL_EDUCATION_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Associate's or equivalent; Short first tertiary programmes that are
   * typically practically-based, occupationally-specific and prepare for
   * labour market entry. These programmes may also provide a pathway to other
   * tertiary programmes. ISCED code 5.
   * </pre>
   *
   * <code>ASSOCIATES_OR_EQUIVALENT = 5;</code>
   */
  public static final int ASSOCIATES_OR_EQUIVALENT_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Bachelor's or equivalent; Programmes designed to provide intermediate
   * academic and/or professional knowledge, skills and competencies leading
   * to a first tertiary degree or equivalent qualification. ISCED code 6.
   * </pre>
   *
   * <code>BACHELORS_OR_EQUIVALENT = 6;</code>
   */
  public static final int BACHELORS_OR_EQUIVALENT_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Master's or equivalent; Programmes designed to provide advanced academic
   * and/or professional knowledge, skills and competencies leading to a
   * second tertiary degree or equivalent qualification. ISCED code 7.
   * </pre>
   *
   * <code>MASTERS_OR_EQUIVALENT = 7;</code>
   */
  public static final int MASTERS_OR_EQUIVALENT_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Doctoral or equivalent; Programmes designed primarily to lead to an
   * advanced research qualification, usually concluding with the submission
   * and defense of a substantive dissertation of publishable quality based on
   * original research. ISCED code 8.
   * </pre>
   *
   * <code>DOCTORAL_OR_EQUIVALENT = 8;</code>
   */
  public static final int DOCTORAL_OR_EQUIVALENT_VALUE = 8;

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
  public static DegreeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DegreeType forNumber(int value) {
    switch (value) {
      case 0:
        return DEGREE_TYPE_UNSPECIFIED;
      case 1:
        return PRIMARY_EDUCATION;
      case 2:
        return LOWER_SECONDARY_EDUCATION;
      case 3:
        return UPPER_SECONDARY_EDUCATION;
      case 4:
        return ADULT_REMEDIAL_EDUCATION;
      case 5:
        return ASSOCIATES_OR_EQUIVALENT;
      case 6:
        return BACHELORS_OR_EQUIVALENT;
      case 7:
        return MASTERS_OR_EQUIVALENT;
      case 8:
        return DOCTORAL_OR_EQUIVALENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DegreeType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DegreeType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DegreeType>() {
        public DegreeType findValueByNumber(int number) {
          return DegreeType.forNumber(number);
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
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final DegreeType[] VALUES = values();

  public static DegreeType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DegreeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.DegreeType)
}
