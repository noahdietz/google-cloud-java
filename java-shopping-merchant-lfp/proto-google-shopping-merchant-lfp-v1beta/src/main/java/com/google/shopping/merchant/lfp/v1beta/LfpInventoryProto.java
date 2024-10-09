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
// source: google/shopping/merchant/lfp/v1beta/lfpinventory.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.lfp.v1beta;

public final class LfpInventoryProto {
  private LfpInventoryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_LfpInventory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_LfpInventory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpInventoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpInventoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/shopping/merchant/lfp/v1beta/lf"
          + "pinventory.proto\022#google.shopping.mercha"
          + "nt.lfp.v1beta\032\034google/api/annotations.pr"
          + "oto\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\037google/protobuf/timestamp.prot"
          + "o\032 google/shopping/type/types.proto\"\242\005\n\014"
          + "LfpInventory\022\024\n\004name\030\001 \001(\tB\006\340A\003\340A\010\022\033\n\016ta"
          + "rget_account\030\002 \001(\003B\003\340A\002\022\027\n\nstore_code\030\003 "
          + "\001(\tB\003\340A\002\022\030\n\010offer_id\030\004 \001(\tB\006\340A\002\340A\005\022\030\n\013re"
          + "gion_code\030\005 \001(\tB\003\340A\002\022\035\n\020content_language"
          + "\030\006 \001(\tB\003\340A\002\022\026\n\004gtin\030\007 \001(\tB\003\340A\001H\000\210\001\001\022/\n\005p"
          + "rice\030\010 \001(\0132\033.google.shopping.type.PriceB"
          + "\003\340A\001\022\031\n\014availability\030\t \001(\tB\003\340A\002\022\032\n\010quant"
          + "ity\030\n \001(\003B\003\340A\001H\001\210\001\001\0228\n\017collection_time\030\013"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\001\022\037\n"
          + "\rpickup_method\030\014 \001(\tB\003\340A\001H\002\210\001\001\022\034\n\npickup"
          + "_sla\030\r \001(\tB\003\340A\001H\003\210\001\001\022\034\n\nfeed_label\030\016 \001(\t"
          + "B\003\340A\001H\004\210\001\001:\225\001\352A\221\001\n\'merchantapi.googleapi"
          + "s.com/LfpInventory\022Haccounts/{account}/l"
          + "fpInventories/{target_merchant}~{store_c"
          + "ode}~{offer}*\016lfpInventories2\014lfpInvento"
          + "ryB\007\n\005_gtinB\013\n\t_quantityB\020\n\016_pickup_meth"
          + "odB\r\n\013_pickup_slaB\r\n\013_feed_label\"\253\001\n\031Ins"
          + "ertLfpInventoryRequest\022?\n\006parent\030\001 \001(\tB/"
          + "\340A\002\372A)\022\'merchantapi.googleapis.com/LfpIn"
          + "ventory\022M\n\rlfp_inventory\030\002 \001(\01321.google."
          + "shopping.merchant.lfp.v1beta.LfpInventor"
          + "yB\003\340A\0022\266\002\n\023LfpInventoryService\022\325\001\n\022Inser"
          + "tLfpInventory\022>.google.shopping.merchant"
          + ".lfp.v1beta.InsertLfpInventoryRequest\0321."
          + "google.shopping.merchant.lfp.v1beta.LfpI"
          + "nventory\"L\202\323\344\223\002F\"5/lfp/v1beta/{parent=ac"
          + "counts/*}/lfpInventories:insert:\rlfp_inv"
          + "entory\032G\312A\032merchantapi.googleapis.com\322A\'"
          + "https://www.googleapis.com/auth/contentB"
          + "\272\001\n\'com.google.shopping.merchant.lfp.v1b"
          + "etaB\021LfpInventoryProtoP\001Z?cloud.google.c"
          + "om/go/shopping/merchant/lfp/apiv1beta/lf"
          + "ppb;lfppb\352A8\n\"merchantapi.googleapis.com"
          + "/Account\022\022accounts/{account}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_lfp_v1beta_LfpInventory_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_lfp_v1beta_LfpInventory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_LfpInventory_descriptor,
            new java.lang.String[] {
              "Name",
              "TargetAccount",
              "StoreCode",
              "OfferId",
              "RegionCode",
              "ContentLanguage",
              "Gtin",
              "Price",
              "Availability",
              "Quantity",
              "CollectionTime",
              "PickupMethod",
              "PickupSla",
              "FeedLabel",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpInventoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpInventoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpInventoryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LfpInventory",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
