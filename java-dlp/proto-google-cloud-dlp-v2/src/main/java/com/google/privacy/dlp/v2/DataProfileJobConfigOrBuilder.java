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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface DataProfileJobConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataProfileJobConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileLocation location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileLocation location = 1;</code>
   *
   * @return The location.
   */
  com.google.privacy.dlp.v2.DataProfileLocation getLocation();
  /**
   *
   *
   * <pre>
   * The data to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileLocation location = 1;</code>
   */
  com.google.privacy.dlp.v2.DataProfileLocationOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The project that will run the scan. The DLP service
   * account that exists within this project must have access to all resources
   * that are profiled, and the Cloud DLP API must be enabled.
   * </pre>
   *
   * <code>string project_id = 5;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project that will run the scan. The DLP service
   * account that exists within this project must have access to all resources
   * that are profiled, and the Cloud DLP API must be enabled.
   * </pre>
   *
   * <code>string project_id = 5;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Must be set only when scanning other clouds.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.OtherCloudDiscoveryStartingLocation other_cloud_starting_location = 8;
   * </code>
   *
   * @return Whether the otherCloudStartingLocation field is set.
   */
  boolean hasOtherCloudStartingLocation();
  /**
   *
   *
   * <pre>
   * Must be set only when scanning other clouds.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.OtherCloudDiscoveryStartingLocation other_cloud_starting_location = 8;
   * </code>
   *
   * @return The otherCloudStartingLocation.
   */
  com.google.privacy.dlp.v2.OtherCloudDiscoveryStartingLocation getOtherCloudStartingLocation();
  /**
   *
   *
   * <pre>
   * Must be set only when scanning other clouds.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.OtherCloudDiscoveryStartingLocation other_cloud_starting_location = 8;
   * </code>
   */
  com.google.privacy.dlp.v2.OtherCloudDiscoveryStartingLocationOrBuilder
      getOtherCloudStartingLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by profiles. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * data profiling.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/sensitive-data-protection/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 7;</code>
   *
   * @return A list containing the inspectTemplates.
   */
  java.util.List<java.lang.String> getInspectTemplatesList();
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by profiles. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * data profiling.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/sensitive-data-protection/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 7;</code>
   *
   * @return The count of inspectTemplates.
   */
  int getInspectTemplatesCount();
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by profiles. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * data profiling.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/sensitive-data-protection/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The inspectTemplates at the given index.
   */
  java.lang.String getInspectTemplates(int index);
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by profiles. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * data profiling.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/sensitive-data-protection/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the inspectTemplates at the given index.
   */
  com.google.protobuf.ByteString getInspectTemplatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of the job.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction data_profile_actions = 6;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.DataProfileAction> getDataProfileActionsList();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of the job.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction data_profile_actions = 6;</code>
   */
  com.google.privacy.dlp.v2.DataProfileAction getDataProfileActions(int index);
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of the job.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction data_profile_actions = 6;</code>
   */
  int getDataProfileActionsCount();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of the job.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction data_profile_actions = 6;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.DataProfileActionOrBuilder>
      getDataProfileActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of the job.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction data_profile_actions = 6;</code>
   */
  com.google.privacy.dlp.v2.DataProfileActionOrBuilder getDataProfileActionsOrBuilder(int index);
}
