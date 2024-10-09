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
// source: google/chat/v1/attachment.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface AttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.Attachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the attachment, in the form
   * `spaces/{space}/messages/{message}/attachments/{attachment}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the attachment, in the form
   * `spaces/{space}/messages/{message}/attachments/{attachment}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The original file name for the content, not the full path.
   * </pre>
   *
   * <code>string content_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The contentName.
   */
  java.lang.String getContentName();
  /**
   *
   *
   * <pre>
   * Output only. The original file name for the content, not the full path.
   * </pre>
   *
   * <code>string content_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for contentName.
   */
  com.google.protobuf.ByteString getContentNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The content type (MIME type) of the file.
   * </pre>
   *
   * <code>string content_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   *
   *
   * <pre>
   * Output only. The content type (MIME type) of the file.
   * </pre>
   *
   * <code>string content_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString getContentTypeBytes();

  /**
   *
   *
   * <pre>
   * A reference to the attachment data. This field is used with the media API
   * to download the attachment data.
   * </pre>
   *
   * <code>.google.chat.v1.AttachmentDataRef attachment_data_ref = 4;</code>
   *
   * @return Whether the attachmentDataRef field is set.
   */
  boolean hasAttachmentDataRef();
  /**
   *
   *
   * <pre>
   * A reference to the attachment data. This field is used with the media API
   * to download the attachment data.
   * </pre>
   *
   * <code>.google.chat.v1.AttachmentDataRef attachment_data_ref = 4;</code>
   *
   * @return The attachmentDataRef.
   */
  com.google.chat.v1.AttachmentDataRef getAttachmentDataRef();
  /**
   *
   *
   * <pre>
   * A reference to the attachment data. This field is used with the media API
   * to download the attachment data.
   * </pre>
   *
   * <code>.google.chat.v1.AttachmentDataRef attachment_data_ref = 4;</code>
   */
  com.google.chat.v1.AttachmentDataRefOrBuilder getAttachmentDataRefOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A reference to the Google Drive attachment. This field is
   * used with the Google Drive API.
   * </pre>
   *
   * <code>
   * .google.chat.v1.DriveDataRef drive_data_ref = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the driveDataRef field is set.
   */
  boolean hasDriveDataRef();
  /**
   *
   *
   * <pre>
   * Output only. A reference to the Google Drive attachment. This field is
   * used with the Google Drive API.
   * </pre>
   *
   * <code>
   * .google.chat.v1.DriveDataRef drive_data_ref = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The driveDataRef.
   */
  com.google.chat.v1.DriveDataRef getDriveDataRef();
  /**
   *
   *
   * <pre>
   * Output only. A reference to the Google Drive attachment. This field is
   * used with the Google Drive API.
   * </pre>
   *
   * <code>
   * .google.chat.v1.DriveDataRef drive_data_ref = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.chat.v1.DriveDataRefOrBuilder getDriveDataRefOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The thumbnail URL which should be used to preview the
   * attachment to a human user. Chat apps shouldn't use this URL to download
   * attachment content.
   * </pre>
   *
   * <code>string thumbnail_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The thumbnailUri.
   */
  java.lang.String getThumbnailUri();
  /**
   *
   *
   * <pre>
   * Output only. The thumbnail URL which should be used to preview the
   * attachment to a human user. Chat apps shouldn't use this URL to download
   * attachment content.
   * </pre>
   *
   * <code>string thumbnail_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for thumbnailUri.
   */
  com.google.protobuf.ByteString getThumbnailUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The download URL which should be used to allow a human user to
   * download the attachment. Chat apps shouldn't use this URL to download
   * attachment content.
   * </pre>
   *
   * <code>string download_uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The downloadUri.
   */
  java.lang.String getDownloadUri();
  /**
   *
   *
   * <pre>
   * Output only. The download URL which should be used to allow a human user to
   * download the attachment. Chat apps shouldn't use this URL to download
   * attachment content.
   * </pre>
   *
   * <code>string download_uri = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for downloadUri.
   */
  com.google.protobuf.ByteString getDownloadUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The source of the attachment.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Attachment.Source source = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   *
   *
   * <pre>
   * Output only. The source of the attachment.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Attachment.Source source = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The source.
   */
  com.google.chat.v1.Attachment.Source getSource();

  com.google.chat.v1.Attachment.DataRefCase getDataRefCase();
}
