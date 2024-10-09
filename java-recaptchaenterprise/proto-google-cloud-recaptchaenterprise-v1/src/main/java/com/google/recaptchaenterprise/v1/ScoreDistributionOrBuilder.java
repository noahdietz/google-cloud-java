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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.5
package com.google.recaptchaenterprise.v1;

public interface ScoreDistributionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ScoreDistribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  int getScoreBucketsCount();
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  boolean containsScoreBuckets(int key);
  /** Use {@link #getScoreBucketsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Long> getScoreBuckets();
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Long> getScoreBucketsMap();
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  long getScoreBucketsOrDefault(int key, long defaultValue);
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  long getScoreBucketsOrThrow(int key);
}
