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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.5
package com.google.iam.admin.v1;

public interface LintResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.LintResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The validation unit level.
   * </pre>
   *
   * <code>.google.iam.admin.v1.LintResult.Level level = 1;</code>
   *
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   *
   *
   * <pre>
   * The validation unit level.
   * </pre>
   *
   * <code>.google.iam.admin.v1.LintResult.Level level = 1;</code>
   *
   * @return The level.
   */
  com.google.iam.admin.v1.LintResult.Level getLevel();

  /**
   *
   *
   * <pre>
   * The validation unit name, for instance
   * "lintValidationUnits/ConditionComplexityCheck".
   * </pre>
   *
   * <code>string validation_unit_name = 2;</code>
   *
   * @return The validationUnitName.
   */
  java.lang.String getValidationUnitName();
  /**
   *
   *
   * <pre>
   * The validation unit name, for instance
   * "lintValidationUnits/ConditionComplexityCheck".
   * </pre>
   *
   * <code>string validation_unit_name = 2;</code>
   *
   * @return The bytes for validationUnitName.
   */
  com.google.protobuf.ByteString getValidationUnitNameBytes();

  /**
   *
   *
   * <pre>
   * The validation unit severity.
   * </pre>
   *
   * <code>.google.iam.admin.v1.LintResult.Severity severity = 3;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * The validation unit severity.
   * </pre>
   *
   * <code>.google.iam.admin.v1.LintResult.Severity severity = 3;</code>
   *
   * @return The severity.
   */
  com.google.iam.admin.v1.LintResult.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * The name of the field for which this lint result is about.
   *
   * For nested messages `field_name` consists of names of the embedded fields
   * separated by period character. The top-level qualifier is the input object
   * to lint in the request. For example, the `field_name` value
   * `condition.expression` identifies a lint result for the `expression` field
   * of the provided condition.
   * </pre>
   *
   * <code>string field_name = 5;</code>
   *
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   *
   *
   * <pre>
   * The name of the field for which this lint result is about.
   *
   * For nested messages `field_name` consists of names of the embedded fields
   * separated by period character. The top-level qualifier is the input object
   * to lint in the request. For example, the `field_name` value
   * `condition.expression` identifies a lint result for the `expression` field
   * of the provided condition.
   * </pre>
   *
   * <code>string field_name = 5;</code>
   *
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString getFieldNameBytes();

  /**
   *
   *
   * <pre>
   * 0-based character position of problematic construct within the object
   * identified by `field_name`. Currently, this is populated only for condition
   * expression.
   * </pre>
   *
   * <code>int32 location_offset = 6;</code>
   *
   * @return The locationOffset.
   */
  int getLocationOffset();

  /**
   *
   *
   * <pre>
   * Human readable debug message associated with the issue.
   * </pre>
   *
   * <code>string debug_message = 7;</code>
   *
   * @return The debugMessage.
   */
  java.lang.String getDebugMessage();
  /**
   *
   *
   * <pre>
   * Human readable debug message associated with the issue.
   * </pre>
   *
   * <code>string debug_message = 7;</code>
   *
   * @return The bytes for debugMessage.
   */
  com.google.protobuf.ByteString getDebugMessageBytes();
}
