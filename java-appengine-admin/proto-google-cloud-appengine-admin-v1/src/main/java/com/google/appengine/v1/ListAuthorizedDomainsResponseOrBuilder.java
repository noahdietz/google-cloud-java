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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public interface ListAuthorizedDomainsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ListAuthorizedDomainsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The authorized domains belonging to the user.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.AuthorizedDomain domains = 1;</code>
   */
  java.util.List<com.google.appengine.v1.AuthorizedDomain> getDomainsList();
  /**
   *
   *
   * <pre>
   * The authorized domains belonging to the user.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.AuthorizedDomain domains = 1;</code>
   */
  com.google.appengine.v1.AuthorizedDomain getDomains(int index);
  /**
   *
   *
   * <pre>
   * The authorized domains belonging to the user.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.AuthorizedDomain domains = 1;</code>
   */
  int getDomainsCount();
  /**
   *
   *
   * <pre>
   * The authorized domains belonging to the user.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.AuthorizedDomain domains = 1;</code>
   */
  java.util.List<? extends com.google.appengine.v1.AuthorizedDomainOrBuilder>
      getDomainsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The authorized domains belonging to the user.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.AuthorizedDomain domains = 1;</code>
   */
  com.google.appengine.v1.AuthorizedDomainOrBuilder getDomainsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
