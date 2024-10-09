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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v1;

public interface SourceRepositoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.SourceRepository)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL pointing to the hosted repository where the function is defined.
   * There are supported Cloud Source Repository URLs in the following
   * formats:
   *
   * To refer to a specific commit:
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
   * To refer to a moveable alias (branch):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
   * In particular, to refer to HEAD use `master` moveable alias.
   * To refer to a specific fixed alias (tag):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
   *
   * You may omit `paths/&#42;` if you want to use the main directory. The function
   * response may add an empty `/paths/` to the URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * The URL pointing to the hosted repository where the function is defined.
   * There are supported Cloud Source Repository URLs in the following
   * formats:
   *
   * To refer to a specific commit:
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
   * To refer to a moveable alias (branch):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
   * In particular, to refer to HEAD use `master` moveable alias.
   * To refer to a specific fixed alias (tag):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
   *
   * You may omit `paths/&#42;` if you want to use the main directory. The function
   * response may add an empty `/paths/` to the URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * Output only. The URL pointing to the hosted repository where the function
   * were defined at the time of deployment. It always points to a specific
   * commit in the format described above.
   * </pre>
   *
   * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deployedUrl.
   */
  java.lang.String getDeployedUrl();
  /**
   *
   *
   * <pre>
   * Output only. The URL pointing to the hosted repository where the function
   * were defined at the time of deployment. It always points to a specific
   * commit in the format described above.
   * </pre>
   *
   * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for deployedUrl.
   */
  com.google.protobuf.ByteString getDeployedUrlBytes();
}
