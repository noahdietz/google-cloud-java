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
// source: google/cloud/aiplatform/v1beta1/feature_view.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureViewProto {
  private FeatureViewProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_BruteForceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_BruteForceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_TreeAHConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_TreeAHConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VertexRagSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VertexRagSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/featur"
          + "e_view.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\352\031\n\013FeatureView\022\\\n\020bi"
          + "g_query_source\030\006 \001(\0132;.google.cloud.aipl"
          + "atform.v1beta1.FeatureView.BigQuerySourc"
          + "eB\003\340A\001H\000\022j\n\027feature_registry_source\030\t \001("
          + "\0132B.google.cloud.aiplatform.v1beta1.Feat"
          + "ureView.FeatureRegistrySourceB\003\340A\001H\000\022^\n\021"
          + "vertex_rag_source\030\022 \001(\0132<.google.cloud.a"
          + "iplatform.v1beta1.FeatureView.VertexRagS"
          + "ourceB\003\340A\001H\000\022\021\n\004name\030\001 \001(\tB\003\340A\010\0224\n\013creat"
          + "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\022\021\n\004etag\030\004 \001(\tB\003\340A\001\022M"
          + "\n\006labels\030\005 \003(\01328.google.cloud.aiplatform"
          + ".v1beta1.FeatureView.LabelsEntryB\003\340A\001\022L\n"
          + "\013sync_config\030\007 \001(\01327.google.cloud.aiplat"
          + "form.v1beta1.FeatureView.SyncConfig\022d\n\024v"
          + "ector_search_config\030\010 \001(\0132?.google.cloud"
          + ".aiplatform.v1beta1.FeatureView.VectorSe"
          + "archConfigB\005\030\001\340A\001\022S\n\014index_config\030\017 \001(\0132"
          + "8.google.cloud.aiplatform.v1beta1.Featur"
          + "eView.IndexConfigB\003\340A\001\022^\n\022service_agent_"
          + "type\030\016 \001(\0162=.google.cloud.aiplatform.v1b"
          + "eta1.FeatureView.ServiceAgentTypeB\003\340A\001\022\""
          + "\n\025service_account_email\030\r \001(\tB\003\340A\003\022\032\n\rsa"
          + "tisfies_pzs\030\023 \001(\010B\003\340A\003\022\032\n\rsatisfies_pzi\030"
          + "\024 \001(\010B\003\340A\003\032B\n\016BigQuerySource\022\020\n\003uri\030\001 \001("
          + "\tB\003\340A\002\022\036\n\021entity_id_columns\030\002 \003(\tB\003\340A\002\032\032"
          + "\n\nSyncConfig\022\014\n\004cron\030\001 \001(\t\032\226\006\n\022VectorSea"
          + "rchConfig\022k\n\016tree_ah_config\030\010 \001(\0132L.goog"
          + "le.cloud.aiplatform.v1beta1.FeatureView."
          + "VectorSearchConfig.TreeAHConfigB\003\340A\001H\000\022s"
          + "\n\022brute_force_config\030\t \001(\0132P.google.clou"
          + "d.aiplatform.v1beta1.FeatureView.VectorS"
          + "earchConfig.BruteForceConfigB\003\340A\001H\000\022\035\n\020e"
          + "mbedding_column\030\003 \001(\tB\003\340A\001\022\033\n\016filter_col"
          + "umns\030\004 \003(\tB\003\340A\001\022\034\n\017crowding_column\030\005 \001(\t"
          + "B\003\340A\001\022%\n\023embedding_dimension\030\006 \001(\005B\003\340A\001H"
          + "\001\210\001\001\022w\n\025distance_measure_type\030\007 \001(\0162S.go"
          + "ogle.cloud.aiplatform.v1beta1.FeatureVie"
          + "w.VectorSearchConfig.DistanceMeasureType"
          + "B\003\340A\001\032\022\n\020BruteForceConfig\032Y\n\014TreeAHConfi"
          + "g\022+\n\031leaf_node_embedding_count\030\001 \001(\003B\003\340A"
          + "\001H\000\210\001\001B\034\n\032_leaf_node_embedding_count\"\204\001\n"
          + "\023DistanceMeasureType\022%\n!DISTANCE_MEASURE"
          + "_TYPE_UNSPECIFIED\020\000\022\027\n\023SQUARED_L2_DISTAN"
          + "CE\020\001\022\023\n\017COSINE_DISTANCE\020\002\022\030\n\024DOT_PRODUCT"
          + "_DISTANCE\020\003:\002\030\001B\022\n\020algorithm_configB\026\n\024_"
          + "embedding_dimension\032\366\005\n\013IndexConfig\022d\n\016t"
          + "ree_ah_config\030\006 \001(\0132E.google.cloud.aipla"
          + "tform.v1beta1.FeatureView.IndexConfig.Tr"
          + "eeAHConfigB\003\340A\001H\000\022l\n\022brute_force_config\030"
          + "\007 \001(\0132I.google.cloud.aiplatform.v1beta1."
          + "FeatureView.IndexConfig.BruteForceConfig"
          + "B\003\340A\001H\000\022\035\n\020embedding_column\030\001 \001(\tB\003\340A\001\022\033"
          + "\n\016filter_columns\030\002 \003(\tB\003\340A\001\022\034\n\017crowding_"
          + "column\030\003 \001(\tB\003\340A\001\022%\n\023embedding_dimension"
          + "\030\004 \001(\005B\003\340A\001H\001\210\001\001\022p\n\025distance_measure_typ"
          + "e\030\005 \001(\0162L.google.cloud.aiplatform.v1beta"
          + "1.FeatureView.IndexConfig.DistanceMeasur"
          + "eTypeB\003\340A\001\032\022\n\020BruteForceConfig\032Y\n\014TreeAH"
          + "Config\022+\n\031leaf_node_embedding_count\030\001 \001("
          + "\003B\003\340A\001H\000\210\001\001B\034\n\032_leaf_node_embedding_coun"
          + "t\"\204\001\n\023DistanceMeasureType\022%\n!DISTANCE_ME"
          + "ASURE_TYPE_UNSPECIFIED\020\000\022\027\n\023SQUARED_L2_D"
          + "ISTANCE\020\001\022\023\n\017COSINE_DISTANCE\020\002\022\030\n\024DOT_PR"
          + "ODUCT_DISTANCE\020\003B\022\n\020algorithm_configB\026\n\024"
          + "_embedding_dimension\032\203\002\n\025FeatureRegistry"
          + "Source\022l\n\016feature_groups\030\001 \003(\0132O.google."
          + "cloud.aiplatform.v1beta1.FeatureView.Fea"
          + "tureRegistrySource.FeatureGroupB\003\340A\002\022 \n\016"
          + "project_number\030\002 \001(\003B\003\340A\001H\000\210\001\001\032G\n\014Featur"
          + "eGroup\022\035\n\020feature_group_id\030\001 \001(\tB\003\340A\002\022\030\n"
          + "\013feature_ids\030\002 \003(\tB\003\340A\002B\021\n\017_project_numb"
          + "er\032?\n\017VertexRagSource\022\020\n\003uri\030\001 \001(\tB\003\340A\002\022"
          + "\032\n\rrag_corpus_id\030\002 \001(\003B\003\340A\001\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"{\n\020Se"
          + "rviceAgentType\022\"\n\036SERVICE_AGENT_TYPE_UNS"
          + "PECIFIED\020\000\022\036\n\032SERVICE_AGENT_TYPE_PROJECT"
          + "\020\001\022#\n\037SERVICE_AGENT_TYPE_FEATURE_VIEW\020\002:"
          + "\233\001\352A\227\001\n%aiplatform.googleapis.com/Featur"
          + "eView\022nprojects/{project}/locations/{loc"
          + "ation}/featureOnlineStores/{feature_onli"
          + "ne_store}/featureViews/{feature_view}B\010\n"
          + "\006sourceB\347\001\n#com.google.cloud.aiplatform."
          + "v1beta1B\020FeatureViewProtoP\001ZCcloud.googl"
          + "e.com/go/aiplatform/apiv1beta1/aiplatfor"
          + "mpb;aiplatformpb\252\002\037Google.Cloud.AIPlatfo"
          + "rm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1b"
          + "eta1\352\002\"Google::Cloud::AIPlatform::V1beta"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor,
            new java.lang.String[] {
              "BigQuerySource",
              "FeatureRegistrySource",
              "VertexRagSource",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "SyncConfig",
              "VectorSearchConfig",
              "IndexConfig",
              "ServiceAgentType",
              "ServiceAccountEmail",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_BigQuerySource_descriptor,
            new java.lang.String[] {
              "Uri", "EntityIdColumns",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_SyncConfig_descriptor,
            new java.lang.String[] {
              "Cron",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor,
            new java.lang.String[] {
              "TreeAhConfig",
              "BruteForceConfig",
              "EmbeddingColumn",
              "FilterColumns",
              "CrowdingColumn",
              "EmbeddingDimension",
              "DistanceMeasureType",
              "AlgorithmConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_BruteForceConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VectorSearchConfig_TreeAHConfig_descriptor,
            new java.lang.String[] {
              "LeafNodeEmbeddingCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_descriptor,
            new java.lang.String[] {
              "TreeAhConfig",
              "BruteForceConfig",
              "EmbeddingColumn",
              "FilterColumns",
              "CrowdingColumn",
              "EmbeddingDimension",
              "DistanceMeasureType",
              "AlgorithmConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_BruteForceConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_BruteForceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_BruteForceConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_TreeAHConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_TreeAHConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_IndexConfig_TreeAHConfig_descriptor,
            new java.lang.String[] {
              "LeafNodeEmbeddingCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor,
            new java.lang.String[] {
              "FeatureGroups", "ProjectNumber",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_FeatureRegistrySource_FeatureGroup_descriptor,
            new java.lang.String[] {
              "FeatureGroupId", "FeatureIds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VertexRagSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VertexRagSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_VertexRagSource_descriptor,
            new java.lang.String[] {
              "Uri", "RagCorpusId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureView_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureView_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
