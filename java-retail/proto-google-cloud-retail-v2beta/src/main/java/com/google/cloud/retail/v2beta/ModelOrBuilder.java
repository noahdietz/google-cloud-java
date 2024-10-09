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
// source: google/cloud/retail/v2beta/model.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2beta;

public interface ModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The fully qualified resource name of the model.
   *
   * Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/models/{model_id}`
   * catalog_id has char limit of 50.
   * recommendation_model_id has char limit of 40.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The fully qualified resource name of the model.
   *
   * Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/models/{model_id}`
   * catalog_id has char limit of 50.
   * recommendation_model_id has char limit of 40.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the model.
   *
   * Should be human readable, used to display Recommendation Models in the
   * Retail Cloud Console Dashboard. UTF-8 encoded string with limit of 1024
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the model.
   *
   * Should be human readable, used to display Recommendation Models in the
   * Retail Cloud Console Dashboard. UTF-8 encoded string with limit of 1024
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The training state that the model is in (e.g.
   * `TRAINING` or `PAUSED`).
   *
   * Since part of the cost of running the service
   * is frequency of training - this can be used to determine when to train
   * model in order to control cost. If not specified: the default value for
   * `CreateModel` method is `TRAINING`. The default value for
   * `UpdateModel` method is to keep the state the same as before.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.TrainingState training_state = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for trainingState.
   */
  int getTrainingStateValue();
  /**
   *
   *
   * <pre>
   * Optional. The training state that the model is in (e.g.
   * `TRAINING` or `PAUSED`).
   *
   * Since part of the cost of running the service
   * is frequency of training - this can be used to determine when to train
   * model in order to control cost. If not specified: the default value for
   * `CreateModel` method is `TRAINING`. The default value for
   * `UpdateModel` method is to keep the state the same as before.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.TrainingState training_state = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The trainingState.
   */
  com.google.cloud.retail.v2beta.Model.TrainingState getTrainingState();

  /**
   *
   *
   * <pre>
   * Output only. The serving state of the model: `ACTIVE`, `NOT_ACTIVE`.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.ServingState serving_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for servingState.
   */
  int getServingStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The serving state of the model: `ACTIVE`, `NOT_ACTIVE`.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.ServingState serving_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The servingState.
   */
  com.google.cloud.retail.v2beta.Model.ServingState getServingState();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was last updated. E.g.
   * if a Recommendation Model was paused - this would be the time the pause was
   * initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was last updated. E.g.
   * if a Recommendation Model was paused - this would be the time the pause was
   * initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Model was last updated. E.g.
   * if a Recommendation Model was paused - this would be the time the pause was
   * initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The type of model e.g. `home-page`.
   *
   * Currently supported values: `recommended-for-you`, `others-you-may-like`,
   * `frequently-bought-together`, `page-optimization`, `similar-items`,
   * `buy-it-again`, `on-sale-items`, and `recently-viewed`(readonly value).
   *
   *
   * This field together with
   * [optimization_objective][google.cloud.retail.v2beta.Model.optimization_objective]
   * describe model metadata to use to control model training and serving.
   * See https://cloud.google.com/retail/docs/models
   * for more details on what the model metadata control and which combination
   * of parameters are valid. For invalid combinations of parameters (e.g. type
   * = `frequently-bought-together` and optimization_objective = `ctr`), you
   * receive an error 400 if you try to create/update a recommendation with
   * this set of knobs.
   * </pre>
   *
   * <code>string type = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Required. The type of model e.g. `home-page`.
   *
   * Currently supported values: `recommended-for-you`, `others-you-may-like`,
   * `frequently-bought-together`, `page-optimization`, `similar-items`,
   * `buy-it-again`, `on-sale-items`, and `recently-viewed`(readonly value).
   *
   *
   * This field together with
   * [optimization_objective][google.cloud.retail.v2beta.Model.optimization_objective]
   * describe model metadata to use to control model training and serving.
   * See https://cloud.google.com/retail/docs/models
   * for more details on what the model metadata control and which combination
   * of parameters are valid. For invalid combinations of parameters (e.g. type
   * = `frequently-bought-together` and optimization_objective = `ctr`), you
   * receive an error 400 if you try to create/update a recommendation with
   * this set of knobs.
   * </pre>
   *
   * <code>string type = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The optimization objective e.g. `cvr`.
   *
   * Currently supported
   * values: `ctr`, `cvr`, `revenue-per-order`.
   *
   *  If not specified, we choose default based on model type.
   * Default depends on type of recommendation:
   *
   * `recommended-for-you` =&gt; `ctr`
   *
   * `others-you-may-like` =&gt; `ctr`
   *
   * `frequently-bought-together` =&gt; `revenue_per_order`
   *
   * This field together with
   * [optimization_objective][google.cloud.retail.v2beta.Model.type]
   * describe model metadata to use to control model training and serving.
   * See https://cloud.google.com/retail/docs/models
   * for more details on what the model metadata control and which combination
   * of parameters are valid. For invalid combinations of parameters (e.g. type
   * = `frequently-bought-together` and optimization_objective = `ctr`), you
   * receive an error 400 if you try to create/update a recommendation with
   * this set of knobs.
   * </pre>
   *
   * <code>string optimization_objective = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The optimizationObjective.
   */
  java.lang.String getOptimizationObjective();
  /**
   *
   *
   * <pre>
   * Optional. The optimization objective e.g. `cvr`.
   *
   * Currently supported
   * values: `ctr`, `cvr`, `revenue-per-order`.
   *
   *  If not specified, we choose default based on model type.
   * Default depends on type of recommendation:
   *
   * `recommended-for-you` =&gt; `ctr`
   *
   * `others-you-may-like` =&gt; `ctr`
   *
   * `frequently-bought-together` =&gt; `revenue_per_order`
   *
   * This field together with
   * [optimization_objective][google.cloud.retail.v2beta.Model.type]
   * describe model metadata to use to control model training and serving.
   * See https://cloud.google.com/retail/docs/models
   * for more details on what the model metadata control and which combination
   * of parameters are valid. For invalid combinations of parameters (e.g. type
   * = `frequently-bought-together` and optimization_objective = `ctr`), you
   * receive an error 400 if you try to create/update a recommendation with
   * this set of knobs.
   * </pre>
   *
   * <code>string optimization_objective = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for optimizationObjective.
   */
  com.google.protobuf.ByteString getOptimizationObjectiveBytes();

  /**
   *
   *
   * <pre>
   * Optional. The state of periodic tuning.
   *
   * The period we use is 3 months - to do a
   * one-off tune earlier use the `TuneModel` method. Default value
   * is `PERIODIC_TUNING_ENABLED`.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.PeriodicTuningState periodic_tuning_state = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for periodicTuningState.
   */
  int getPeriodicTuningStateValue();
  /**
   *
   *
   * <pre>
   * Optional. The state of periodic tuning.
   *
   * The period we use is 3 months - to do a
   * one-off tune earlier use the `TuneModel` method. Default value
   * is `PERIODIC_TUNING_ENABLED`.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.PeriodicTuningState periodic_tuning_state = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The periodicTuningState.
   */
  com.google.cloud.retail.v2beta.Model.PeriodicTuningState getPeriodicTuningState();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the latest successful tune finished.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_tune_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastTuneTime field is set.
   */
  boolean hasLastTuneTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the latest successful tune finished.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_tune_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastTuneTime.
   */
  com.google.protobuf.Timestamp getLastTuneTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the latest successful tune finished.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_tune_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastTuneTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The tune operation associated with the model.
   *
   * Can be used to determine if there is an ongoing tune for this
   * recommendation. Empty field implies no tune is goig on.
   * </pre>
   *
   * <code>string tuning_operation = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tuningOperation.
   */
  java.lang.String getTuningOperation();
  /**
   *
   *
   * <pre>
   * Output only. The tune operation associated with the model.
   *
   * Can be used to determine if there is an ongoing tune for this
   * recommendation. Empty field implies no tune is goig on.
   * </pre>
   *
   * <code>string tuning_operation = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tuningOperation.
   */
  com.google.protobuf.ByteString getTuningOperationBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of data requirements for this model: `DATA_OK` and
   * `DATA_ERROR`.
   *
   * Recommendation model cannot be trained if the data is in
   * `DATA_ERROR` state. Recommendation model can have `DATA_ERROR` state even
   * if serving state is `ACTIVE`: models were trained successfully before, but
   * cannot be refreshed because model no longer has sufficient
   * data for training.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.DataState data_state = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for dataState.
   */
  int getDataStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of data requirements for this model: `DATA_OK` and
   * `DATA_ERROR`.
   *
   * Recommendation model cannot be trained if the data is in
   * `DATA_ERROR` state. Recommendation model can have `DATA_ERROR` state even
   * if serving state is `ACTIVE`: models were trained successfully before, but
   * cannot be refreshed because model no longer has sufficient
   * data for training.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.DataState data_state = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataState.
   */
  com.google.cloud.retail.v2beta.Model.DataState getDataState();

  /**
   *
   *
   * <pre>
   * Optional. If `RECOMMENDATIONS_FILTERING_ENABLED`, recommendation filtering
   * by attributes is enabled for the model.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.RecommendationsFilteringOption filtering_option = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for filteringOption.
   */
  int getFilteringOptionValue();
  /**
   *
   *
   * <pre>
   * Optional. If `RECOMMENDATIONS_FILTERING_ENABLED`, recommendation filtering
   * by attributes is enabled for the model.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.RecommendationsFilteringOption filtering_option = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The filteringOption.
   */
  com.google.cloud.retail.v2beta.RecommendationsFilteringOption getFilteringOption();

  /**
   *
   *
   * <pre>
   * Output only. The list of valid serving configs associated with the
   * PageOptimizationConfig.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.Model.ServingConfigList serving_config_lists = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2beta.Model.ServingConfigList>
      getServingConfigListsList();
  /**
   *
   *
   * <pre>
   * Output only. The list of valid serving configs associated with the
   * PageOptimizationConfig.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.Model.ServingConfigList serving_config_lists = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.retail.v2beta.Model.ServingConfigList getServingConfigLists(int index);
  /**
   *
   *
   * <pre>
   * Output only. The list of valid serving configs associated with the
   * PageOptimizationConfig.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.Model.ServingConfigList serving_config_lists = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getServingConfigListsCount();
  /**
   *
   *
   * <pre>
   * Output only. The list of valid serving configs associated with the
   * PageOptimizationConfig.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.Model.ServingConfigList serving_config_lists = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.Model.ServingConfigListOrBuilder>
      getServingConfigListsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The list of valid serving configs associated with the
   * PageOptimizationConfig.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.Model.ServingConfigList serving_config_lists = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.retail.v2beta.Model.ServingConfigListOrBuilder getServingConfigListsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Additional model features config.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.ModelFeaturesConfig model_features_config = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the modelFeaturesConfig field is set.
   */
  boolean hasModelFeaturesConfig();
  /**
   *
   *
   * <pre>
   * Optional. Additional model features config.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.ModelFeaturesConfig model_features_config = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The modelFeaturesConfig.
   */
  com.google.cloud.retail.v2beta.Model.ModelFeaturesConfig getModelFeaturesConfig();
  /**
   *
   *
   * <pre>
   * Optional. Additional model features config.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Model.ModelFeaturesConfig model_features_config = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.retail.v2beta.Model.ModelFeaturesConfigOrBuilder
      getModelFeaturesConfigOrBuilder();
}
