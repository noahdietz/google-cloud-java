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
// source: google/cloud/essentialcontacts/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.essentialcontacts.v1;

public interface UpdateContactRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.essentialcontacts.v1.UpdateContactRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>
   * .google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the contact field is set.
   */
  boolean hasContact();
  /**
   *
   *
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>
   * .google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The contact.
   */
  com.google.cloud.essentialcontacts.v1.Contact getContact();
  /**
   *
   *
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>
   * .google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.essentialcontacts.v1.ContactOrBuilder getContactOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
