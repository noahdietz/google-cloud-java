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
// source: google/cloud/discoveryengine/v1beta/user_event_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CollectUserEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/discoveryengine/v1beta/us"
          + "er_event_service.proto\022#google.cloud.dis"
          + "coveryengine.v1beta\032\034google/api/annotati"
          + "ons.proto\032\027google/api/client.proto\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "httpbody.proto\032\031google/api/resource.prot"
          + "o\0327google/cloud/discoveryengine/v1beta/i"
          + "mport_config.proto\0326google/cloud/discove"
          + "ryengine/v1beta/purge_config.proto\0324goog"
          + "le/cloud/discoveryengine/v1beta/user_eve"
          + "nt.proto\032#google/longrunning/operations."
          + "proto\"\313\001\n\025WriteUserEventRequest\022@\n\006paren"
          + "t\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine.googlea"
          + "pis.com/DataStore\022L\n\nuser_event\030\002 \001(\0132.."
          + "google.cloud.discoveryengine.v1beta.User"
          + "EventB\003\340A\002H\000\210\001\001\022\023\n\013write_async\030\003 \001(\010B\r\n\013"
          + "_user_event\"\250\001\n\027CollectUserEventRequest\022"
          + "@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(discoveryengine"
          + ".googleapis.com/DataStore\022\027\n\nuser_event\030"
          + "\002 \001(\tB\003\340A\002\022\020\n\003uri\030\003 \001(\tH\000\210\001\001\022\020\n\003ets\030\004 \001("
          + "\003H\001\210\001\001B\006\n\004_uriB\006\n\004_ets2\374\014\n\020UserEventServ"
          + "ice\022\204\003\n\016WriteUserEvent\022:.google.cloud.di"
          + "scoveryengine.v1beta.WriteUserEventReque"
          + "st\032..google.cloud.discoveryengine.v1beta"
          + ".UserEvent\"\205\002\202\323\344\223\002\376\001\"E/v1beta/{parent=pr"
          + "ojects/*/locations/*/dataStores/*}/userE"
          + "vents:write:\nuser_eventZa\"S/v1beta/{pare"
          + "nt=projects/*/locations/*/collections/*/"
          + "dataStores/*}/userEvents:write:\nuser_eve"
          + "ntZF\"8/v1beta/{parent=projects/*/locatio"
          + "ns/*}/userEvents:write:\nuser_event\022\320\002\n\020C"
          + "ollectUserEvent\022<.google.cloud.discovery"
          + "engine.v1beta.CollectUserEventRequest\032\024."
          + "google.api.HttpBody\"\347\001\202\323\344\223\002\340\001\022G/v1beta/{"
          + "parent=projects/*/locations/*/dataStores"
          + "/*}/userEvents:collectZW\022U/v1beta/{paren"
          + "t=projects/*/locations/*/collections/*/d"
          + "ataStores/*}/userEvents:collectZ<\022:/v1be"
          + "ta/{parent=projects/*/locations/*}/userE"
          + "vents:collect\022\230\003\n\017PurgeUserEvents\022;.goog"
          + "le.cloud.discoveryengine.v1beta.PurgeUse"
          + "rEventsRequest\032\035.google.longrunning.Oper"
          + "ation\"\250\002\312Az\n;google.cloud.discoveryengin"
          + "e.v1beta.PurgeUserEventsResponse\022;google"
          + ".cloud.discoveryengine.v1beta.PurgeUserE"
          + "ventsMetadata\202\323\344\223\002\244\001\"E/v1beta/{parent=pr"
          + "ojects/*/locations/*/dataStores/*}/userE"
          + "vents:purge:\001*ZX\"S/v1beta/{parent=projec"
          + "ts/*/locations/*/collections/*/dataStore"
          + "s/*}/userEvents:purge:\001*\022\236\003\n\020ImportUserE"
          + "vents\022<.google.cloud.discoveryengine.v1b"
          + "eta.ImportUserEventsRequest\032\035.google.lon"
          + "grunning.Operation\"\254\002\312A|\n<google.cloud.d"
          + "iscoveryengine.v1beta.ImportUserEventsRe"
          + "sponse\022<google.cloud.discoveryengine.v1b"
          + "eta.ImportUserEventsMetadata\202\323\344\223\002\246\001\"F/v1"
          + "beta/{parent=projects/*/locations/*/data"
          + "Stores/*}/userEvents:import:\001*ZY\"T/v1bet"
          + "a/{parent=projects/*/locations/*/collect"
          + "ions/*/dataStores/*}/userEvents:import:\001"
          + "*\032R\312A\036discoveryengine.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformB\234\002\n\'com.google.cloud.discoveryengi"
          + "ne.v1betaB\025UserEventServiceProtoP\001ZQclou"
          + "d.google.com/go/discoveryengine/apiv1bet"
          + "a/discoveryenginepb;discoveryenginepb\242\002\017"
          + "DISCOVERYENGINE\252\002#Google.Cloud.Discovery"
          + "Engine.V1Beta\312\002#Google\\Cloud\\DiscoveryEn"
          + "gine\\V1beta\352\002&Google::Cloud::DiscoveryEn"
          + "gine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.PurgeConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "WriteAsync",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "Uri", "Ets",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.PurgeConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
