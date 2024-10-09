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
// source: google/cloud/asset/v1p2beta1/asset_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1p2beta1;

public interface ListFeedsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.ListFeedsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p2beta1.Feed feeds = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1p2beta1.Feed> getFeedsList();
  /**
   *
   *
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p2beta1.Feed feeds = 1;</code>
   */
  com.google.cloud.asset.v1p2beta1.Feed getFeeds(int index);
  /**
   *
   *
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p2beta1.Feed feeds = 1;</code>
   */
  int getFeedsCount();
  /**
   *
   *
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p2beta1.Feed feeds = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1p2beta1.FeedOrBuilder> getFeedsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of feeds.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p2beta1.Feed feeds = 1;</code>
   */
  com.google.cloud.asset.v1p2beta1.FeedOrBuilder getFeedsOrBuilder(int index);
}
