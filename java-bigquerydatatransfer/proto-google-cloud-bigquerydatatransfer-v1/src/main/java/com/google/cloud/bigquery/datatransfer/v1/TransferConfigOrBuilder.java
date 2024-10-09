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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datatransfer.v1;

public interface TransferConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.TransferConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the transfer config.
   * Transfer config names have the form either
   * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}` or
   * `projects/{project_id}/transferConfigs/{config_id}`,
   * where `config_id` is usually a UUID, even though it is not
   * guaranteed or required. The name is ignored when creating a transfer
   * config.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the transfer config.
   * Transfer config names have the form either
   * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}` or
   * `projects/{project_id}/transferConfigs/{config_id}`,
   * where `config_id` is usually a UUID, even though it is not
   * guaranteed or required. The name is ignored when creating a transfer
   * config.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2;</code>
   *
   * @return Whether the destinationDatasetId field is set.
   */
  boolean hasDestinationDatasetId();
  /**
   *
   *
   * <pre>
   * The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2;</code>
   *
   * @return The destinationDatasetId.
   */
  java.lang.String getDestinationDatasetId();
  /**
   *
   *
   * <pre>
   * The BigQuery target dataset id.
   * </pre>
   *
   * <code>string destination_dataset_id = 2;</code>
   *
   * @return The bytes for destinationDatasetId.
   */
  com.google.protobuf.ByteString getDestinationDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * User specified display name for the data transfer.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * User specified display name for the data transfer.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Data source ID. This cannot be changed once data transfer is created. The
   * full list of available data source IDs can be returned through an API call:
   * https://cloud.google.com/bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
   * </pre>
   *
   * <code>string data_source_id = 5;</code>
   *
   * @return The dataSourceId.
   */
  java.lang.String getDataSourceId();
  /**
   *
   *
   * <pre>
   * Data source ID. This cannot be changed once data transfer is created. The
   * full list of available data source IDs can be returned through an API call:
   * https://cloud.google.com/bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
   * </pre>
   *
   * <code>string data_source_id = 5;</code>
   *
   * @return The bytes for dataSourceId.
   */
  com.google.protobuf.ByteString getDataSourceIdBytes();

  /**
   *
   *
   * <pre>
   * Parameters specific to each data source. For more information see the
   * bq tab in the 'Setting up a data transfer' section for each data source.
   * For example the parameters for Cloud Storage transfers are listed here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9;</code>
   *
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   *
   *
   * <pre>
   * Parameters specific to each data source. For more information see the
   * bq tab in the 'Setting up a data transfer' section for each data source.
   * For example the parameters for Cloud Storage transfers are listed here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9;</code>
   *
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   *
   *
   * <pre>
   * Parameters specific to each data source. For more information see the
   * bq tab in the 'Setting up a data transfer' section for each data source.
   * For example the parameters for Cloud Storage transfers are listed here:
   * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 9;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Data transfer schedule.
   * If the data source does not support a custom schedule, this should be
   * empty. If it is empty, the default value for the data source will be used.
   * The specified times are in UTC.
   * Examples of valid format:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * See more explanation about the format here:
   * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
   *
   * NOTE: The minimum interval time between recurring transfers depends on the
   * data source; refer to the documentation for your data source.
   * </pre>
   *
   * <code>string schedule = 7;</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Data transfer schedule.
   * If the data source does not support a custom schedule, this should be
   * empty. If it is empty, the default value for the data source will be used.
   * The specified times are in UTC.
   * Examples of valid format:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * See more explanation about the format here:
   * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
   *
   * NOTE: The minimum interval time between recurring transfers depends on the
   * data source; refer to the documentation for your data source.
   * </pre>
   *
   * <code>string schedule = 7;</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Options customizing the data transfer schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptions schedule_options = 24;</code>
   *
   * @return Whether the scheduleOptions field is set.
   */
  boolean hasScheduleOptions();
  /**
   *
   *
   * <pre>
   * Options customizing the data transfer schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptions schedule_options = 24;</code>
   *
   * @return The scheduleOptions.
   */
  com.google.cloud.bigquery.datatransfer.v1.ScheduleOptions getScheduleOptions();
  /**
   *
   *
   * <pre>
   * Options customizing the data transfer schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptions schedule_options = 24;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsOrBuilder getScheduleOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Options customizing different types of data transfer schedule.
   * This field replaces "schedule" and "schedule_options" fields.
   * ScheduleOptionsV2 cannot be used together with ScheduleOptions/Schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsV2 schedule_options_v2 = 31;</code>
   *
   * @return Whether the scheduleOptionsV2 field is set.
   */
  boolean hasScheduleOptionsV2();
  /**
   *
   *
   * <pre>
   * Options customizing different types of data transfer schedule.
   * This field replaces "schedule" and "schedule_options" fields.
   * ScheduleOptionsV2 cannot be used together with ScheduleOptions/Schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsV2 schedule_options_v2 = 31;</code>
   *
   * @return The scheduleOptionsV2.
   */
  com.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsV2 getScheduleOptionsV2();
  /**
   *
   *
   * <pre>
   * Options customizing different types of data transfer schedule.
   * This field replaces "schedule" and "schedule_options" fields.
   * ScheduleOptionsV2 cannot be used together with ScheduleOptions/Schedule.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsV2 schedule_options_v2 = 31;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ScheduleOptionsV2OrBuilder
      getScheduleOptionsV2OrBuilder();

  /**
   *
   *
   * <pre>
   * The number of days to look back to automatically refresh the data.
   * For example, if `data_refresh_window_days = 10`, then every day
   * BigQuery reingests data for [today-10, today-1], rather than ingesting data
   * for just [today-1].
   * Only valid if the data source supports the feature. Set the value to 0
   * to use the default value.
   * </pre>
   *
   * <code>int32 data_refresh_window_days = 12;</code>
   *
   * @return The dataRefreshWindowDays.
   */
  int getDataRefreshWindowDays();

  /**
   *
   *
   * <pre>
   * Is this config disabled. When set to true, no runs will be scheduled for
   * this transfer config.
   * </pre>
   *
   * <code>bool disabled = 13;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Output only. Data transfer modification time. Ignored by server on input.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Data transfer modification time. Ignored by server on input.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Data transfer modification time. Ignored by server on input.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Next time when data transfer will run.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextRunTime field is set.
   */
  boolean hasNextRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Next time when data transfer will run.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextRunTime.
   */
  com.google.protobuf.Timestamp getNextRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Next time when data transfer will run.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the most recently updated transfer run.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the most recently updated transfer run.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferState getState();

  /**
   *
   *
   * <pre>
   * Deprecated. Unique ID of the user on whose behalf transfer is done.
   * </pre>
   *
   * <code>int64 user_id = 11;</code>
   *
   * @return The userId.
   */
  long getUserId();

  /**
   *
   *
   * <pre>
   * Output only. Region in which BigQuery dataset is located.
   * </pre>
   *
   * <code>string dataset_region = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The datasetRegion.
   */
  java.lang.String getDatasetRegion();
  /**
   *
   *
   * <pre>
   * Output only. Region in which BigQuery dataset is located.
   * </pre>
   *
   * <code>string dataset_region = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for datasetRegion.
   */
  com.google.protobuf.ByteString getDatasetRegionBytes();

  /**
   *
   *
   * <pre>
   * Pub/Sub topic where notifications will be sent after transfer runs
   * associated with this transfer config finish.
   *
   * The format for specifying a pubsub topic is:
   * `projects/{project_id}/topics/{topic_id}`
   * </pre>
   *
   * <code>string notification_pubsub_topic = 15;</code>
   *
   * @return The notificationPubsubTopic.
   */
  java.lang.String getNotificationPubsubTopic();
  /**
   *
   *
   * <pre>
   * Pub/Sub topic where notifications will be sent after transfer runs
   * associated with this transfer config finish.
   *
   * The format for specifying a pubsub topic is:
   * `projects/{project_id}/topics/{topic_id}`
   * </pre>
   *
   * <code>string notification_pubsub_topic = 15;</code>
   *
   * @return The bytes for notificationPubsubTopic.
   */
  com.google.protobuf.ByteString getNotificationPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Email notifications will be sent according to these preferences
   * to the email address of the user who owns this transfer config.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 18;</code>
   *
   * @return Whether the emailPreferences field is set.
   */
  boolean hasEmailPreferences();
  /**
   *
   *
   * <pre>
   * Email notifications will be sent according to these preferences
   * to the email address of the user who owns this transfer config.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 18;</code>
   *
   * @return The emailPreferences.
   */
  com.google.cloud.bigquery.datatransfer.v1.EmailPreferences getEmailPreferences();
  /**
   *
   *
   * <pre>
   * Email notifications will be sent according to these preferences
   * to the email address of the user who owns this transfer config.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.EmailPreferences email_preferences = 18;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.EmailPreferencesOrBuilder
      getEmailPreferencesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information about the user whose credentials are used to
   * transfer data. Populated only for `transferConfigs.get` requests. In case
   * the user information is not available, this field will not be populated.
   * </pre>
   *
   * <code>
   * optional .google.cloud.bigquery.datatransfer.v1.UserInfo owner_info = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the ownerInfo field is set.
   */
  boolean hasOwnerInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information about the user whose credentials are used to
   * transfer data. Populated only for `transferConfigs.get` requests. In case
   * the user information is not available, this field will not be populated.
   * </pre>
   *
   * <code>
   * optional .google.cloud.bigquery.datatransfer.v1.UserInfo owner_info = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The ownerInfo.
   */
  com.google.cloud.bigquery.datatransfer.v1.UserInfo getOwnerInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information about the user whose credentials are used to
   * transfer data. Populated only for `transferConfigs.get` requests. In case
   * the user information is not available, this field will not be populated.
   * </pre>
   *
   * <code>
   * optional .google.cloud.bigquery.datatransfer.v1.UserInfo owner_info = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.UserInfoOrBuilder getOwnerInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The encryption configuration part. Currently, it is only used for the
   * optional KMS key name. The BigQuery service account of your project must be
   * granted permissions to use the key. Read methods will return the key name
   * applied in effect. Write methods will apply the key if it is present, or
   * otherwise try to apply project default keys if it is absent.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration encryption_configuration = 28;
   * </code>
   *
   * @return Whether the encryptionConfiguration field is set.
   */
  boolean hasEncryptionConfiguration();
  /**
   *
   *
   * <pre>
   * The encryption configuration part. Currently, it is only used for the
   * optional KMS key name. The BigQuery service account of your project must be
   * granted permissions to use the key. Read methods will return the key name
   * applied in effect. Write methods will apply the key if it is present, or
   * otherwise try to apply project default keys if it is absent.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration encryption_configuration = 28;
   * </code>
   *
   * @return The encryptionConfiguration.
   */
  com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration getEncryptionConfiguration();
  /**
   *
   *
   * <pre>
   * The encryption configuration part. Currently, it is only used for the
   * optional KMS key name. The BigQuery service account of your project must be
   * granted permissions to use the key. Read methods will return the key name
   * applied in effect. Write methods will apply the key if it is present, or
   * otherwise try to apply project default keys if it is absent.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration encryption_configuration = 28;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.EncryptionConfigurationOrBuilder
      getEncryptionConfigurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Error code with detailed information about reason of the
   * latest config failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Error code with detailed information about reason of the
   * latest config failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Error code with detailed information about reason of the
   * latest config failure.
   * </pre>
   *
   * <code>.google.rpc.Status error = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  com.google.cloud.bigquery.datatransfer.v1.TransferConfig.DestinationCase getDestinationCase();
}
