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
// source: google/dataflow/v1beta3/metrics.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public interface MetricStructuredNameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.MetricStructuredName)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Origin (namespace) of metric name. May be blank for user-define metrics;
   * will be "dataflow" for metrics defined by the Dataflow service or SDK.
   * </pre>
   *
   * <code>string origin = 1;</code>
   *
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   *
   *
   * <pre>
   * Origin (namespace) of metric name. May be blank for user-define metrics;
   * will be "dataflow" for metrics defined by the Dataflow service or SDK.
   * </pre>
   *
   * <code>string origin = 1;</code>
   *
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString getOriginBytes();

  /**
   *
   *
   * <pre>
   * Worker-defined metric name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Worker-defined metric name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Zero or more labeled fields which identify the part of the job this
   * metric is associated with, such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have
   * context['step'] = &lt;step-name&gt;. Counters associated with PCollections
   * in the SDK will have context['pcollection'] = &lt;pcollection-name&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  int getContextCount();
  /**
   *
   *
   * <pre>
   * Zero or more labeled fields which identify the part of the job this
   * metric is associated with, such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have
   * context['step'] = &lt;step-name&gt;. Counters associated with PCollections
   * in the SDK will have context['pcollection'] = &lt;pcollection-name&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  boolean containsContext(java.lang.String key);
  /** Use {@link #getContextMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getContext();
  /**
   *
   *
   * <pre>
   * Zero or more labeled fields which identify the part of the job this
   * metric is associated with, such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have
   * context['step'] = &lt;step-name&gt;. Counters associated with PCollections
   * in the SDK will have context['pcollection'] = &lt;pcollection-name&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getContextMap();
  /**
   *
   *
   * <pre>
   * Zero or more labeled fields which identify the part of the job this
   * metric is associated with, such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have
   * context['step'] = &lt;step-name&gt;. Counters associated with PCollections
   * in the SDK will have context['pcollection'] = &lt;pcollection-name&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  /* nullable */
  java.lang.String getContextOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Zero or more labeled fields which identify the part of the job this
   * metric is associated with, such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have
   * context['step'] = &lt;step-name&gt;. Counters associated with PCollections
   * in the SDK will have context['pcollection'] = &lt;pcollection-name&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  java.lang.String getContextOrThrow(java.lang.String key);
}
