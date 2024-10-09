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
// source: google/cloud/kms/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.kms.v1;

public final class KmsResourcesProto {
  private KmsResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_PublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyAccessJustificationsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyAccessJustificationsPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g"
          + "oogle.cloud.kms.v1\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\036google/protobuf"
          + "/wrappers.proto\"\265\001\n\007KeyRing\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003:a\352A^\n\037cloudkms.goog"
          + "leapis.com/KeyRing\022;projects/{project}/l"
          + "ocations/{location}/keyRings/{key_ring}\""
          + "\221\010\n\tCryptoKey\022\021\n\004name\030\001 \001(\tB\003\340A\003\022;\n\007prim"
          + "ary\030\002 \001(\0132%.google.cloud.kms.v1.CryptoKe"
          + "yVersionB\003\340A\003\022E\n\007purpose\030\003 \001(\0162/.google."
          + "cloud.kms.v1.CryptoKey.CryptoKeyPurposeB"
          + "\003\340A\005\0224\n\013create_time\030\005 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0226\n\022next_rotation_time"
          + "\030\007 \001(\0132\032.google.protobuf.Timestamp\0224\n\017ro"
          + "tation_period\030\010 \001(\0132\031.google.protobuf.Du"
          + "rationH\000\022G\n\020version_template\030\013 \001(\0132-.goo"
          + "gle.cloud.kms.v1.CryptoKeyVersionTemplat"
          + "e\022:\n\006labels\030\n \003(\0132*.google.cloud.kms.v1."
          + "CryptoKey.LabelsEntry\022\030\n\013import_only\030\r \001"
          + "(\010B\003\340A\005\022B\n\032destroy_scheduled_duration\030\016 "
          + "\001(\0132\031.google.protobuf.DurationB\003\340A\005\022%\n\022c"
          + "rypto_key_backend\030\017 \001(\tB\t\340A\005\372A\003\n\001*\022a\n ke"
          + "y_access_justifications_policy\030\021 \001(\01322.g"
          + "oogle.cloud.kms.v1.KeyAccessJustificatio"
          + "nsPolicyB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\232\001\n\020CryptoKeyPurpos"
          + "e\022\"\n\036CRYPTO_KEY_PURPOSE_UNSPECIFIED\020\000\022\023\n"
          + "\017ENCRYPT_DECRYPT\020\001\022\023\n\017ASYMMETRIC_SIGN\020\005\022"
          + "\026\n\022ASYMMETRIC_DECRYPT\020\006\022\027\n\023RAW_ENCRYPT_D"
          + "ECRYPT\020\007\022\007\n\003MAC\020\t:{\352Ax\n!cloudkms.googlea"
          + "pis.com/CryptoKey\022Sprojects/{project}/lo"
          + "cations/{location}/keyRings/{key_ring}/c"
          + "ryptoKeys/{crypto_key}B\023\n\021rotation_sched"
          + "ule\"\263\001\n\030CryptoKeyVersionTemplate\022>\n\020prot"
          + "ection_level\030\001 \001(\0162$.google.cloud.kms.v1"
          + ".ProtectionLevel\022W\n\talgorithm\030\003 \001(\0162?.go"
          + "ogle.cloud.kms.v1.CryptoKeyVersion.Crypt"
          + "oKeyVersionAlgorithmB\003\340A\002\"\261\003\n\027KeyOperati"
          + "onAttestation\022S\n\006format\030\004 \001(\0162>.google.c"
          + "loud.kms.v1.KeyOperationAttestation.Atte"
          + "stationFormatB\003\340A\003\022\024\n\007content\030\005 \001(\014B\003\340A\003"
          + "\022X\n\013cert_chains\030\006 \001(\0132>.google.cloud.kms"
          + ".v1.KeyOperationAttestation.CertificateC"
          + "hainsB\003\340A\003\032d\n\021CertificateChains\022\024\n\014caviu"
          + "m_certs\030\001 \003(\t\022\031\n\021google_card_certs\030\002 \003(\t"
          + "\022\036\n\026google_partition_certs\030\003 \003(\t\"k\n\021Atte"
          + "stationFormat\022\"\n\036ATTESTATION_FORMAT_UNSP"
          + "ECIFIED\020\000\022\030\n\024CAVIUM_V1_COMPRESSED\020\003\022\030\n\024C"
          + "AVIUM_V2_COMPRESSED\020\004\"\201\023\n\020CryptoKeyVersi"
          + "on\022\021\n\004name\030\001 \001(\tB\003\340A\003\022J\n\005state\030\003 \001(\0162;.g"
          + "oogle.cloud.kms.v1.CryptoKeyVersion.Cryp"
          + "toKeyVersionState\022C\n\020protection_level\030\007 "
          + "\001(\0162$.google.cloud.kms.v1.ProtectionLeve"
          + "lB\003\340A\003\022W\n\talgorithm\030\n \001(\0162?.google.cloud"
          + ".kms.v1.CryptoKeyVersion.CryptoKeyVersio"
          + "nAlgorithmB\003\340A\003\022F\n\013attestation\030\010 \001(\0132,.g"
          + "oogle.cloud.kms.v1.KeyOperationAttestati"
          + "onB\003\340A\003\0224\n\013create_time\030\004 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0226\n\rgenerate_time\030\013"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0225\n"
          + "\014destroy_time\030\005 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022;\n\022destroy_event_time\030\006 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022\027\n\nimp"
          + "ort_job\030\016 \001(\tB\003\340A\003\0224\n\013import_time\030\017 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022\"\n\025impo"
          + "rt_failure_reason\030\020 \001(\tB\003\340A\003\022&\n\031generati"
          + "on_failure_reason\030\023 \001(\tB\003\340A\003\0220\n#external"
          + "_destruction_failure_reason\030\024 \001(\tB\003\340A\003\022^"
          + "\n!external_protection_level_options\030\021 \001("
          + "\01323.google.cloud.kms.v1.ExternalProtecti"
          + "onLevelOptions\022\036\n\021reimport_eligible\030\022 \001("
          + "\010B\003\340A\003\"\342\007\n\031CryptoKeyVersionAlgorithm\022,\n("
          + "CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED"
          + "\020\000\022\037\n\033GOOGLE_SYMMETRIC_ENCRYPTION\020\001\022\017\n\013A"
          + "ES_128_GCM\020)\022\017\n\013AES_256_GCM\020\023\022\017\n\013AES_128"
          + "_CBC\020*\022\017\n\013AES_256_CBC\020+\022\017\n\013AES_128_CTR\020,"
          + "\022\017\n\013AES_256_CTR\020-\022\034\n\030RSA_SIGN_PSS_2048_S"
          + "HA256\020\002\022\034\n\030RSA_SIGN_PSS_3072_SHA256\020\003\022\034\n"
          + "\030RSA_SIGN_PSS_4096_SHA256\020\004\022\034\n\030RSA_SIGN_"
          + "PSS_4096_SHA512\020\017\022\036\n\032RSA_SIGN_PKCS1_2048"
          + "_SHA256\020\005\022\036\n\032RSA_SIGN_PKCS1_3072_SHA256\020"
          + "\006\022\036\n\032RSA_SIGN_PKCS1_4096_SHA256\020\007\022\036\n\032RSA"
          + "_SIGN_PKCS1_4096_SHA512\020\020\022\033\n\027RSA_SIGN_RA"
          + "W_PKCS1_2048\020\034\022\033\n\027RSA_SIGN_RAW_PKCS1_307"
          + "2\020\035\022\033\n\027RSA_SIGN_RAW_PKCS1_4096\020\036\022 \n\034RSA_"
          + "DECRYPT_OAEP_2048_SHA256\020\010\022 \n\034RSA_DECRYP"
          + "T_OAEP_3072_SHA256\020\t\022 \n\034RSA_DECRYPT_OAEP"
          + "_4096_SHA256\020\n\022 \n\034RSA_DECRYPT_OAEP_4096_"
          + "SHA512\020\021\022\036\n\032RSA_DECRYPT_OAEP_2048_SHA1\020%"
          + "\022\036\n\032RSA_DECRYPT_OAEP_3072_SHA1\020&\022\036\n\032RSA_"
          + "DECRYPT_OAEP_4096_SHA1\020\'\022\027\n\023EC_SIGN_P256"
          + "_SHA256\020\014\022\027\n\023EC_SIGN_P384_SHA384\020\r\022\034\n\030EC"
          + "_SIGN_SECP256K1_SHA256\020\037\022\023\n\017EC_SIGN_ED25"
          + "519\020(\022\017\n\013HMAC_SHA256\020 \022\r\n\tHMAC_SHA1\020!\022\017\n"
          + "\013HMAC_SHA384\020\"\022\017\n\013HMAC_SHA512\020#\022\017\n\013HMAC_"
          + "SHA224\020$\022!\n\035EXTERNAL_SYMMETRIC_ENCRYPTIO"
          + "N\020\022\"\233\002\n\025CryptoKeyVersionState\022(\n$CRYPTO_"
          + "KEY_VERSION_STATE_UNSPECIFIED\020\000\022\026\n\022PENDI"
          + "NG_GENERATION\020\005\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED"
          + "\020\002\022\r\n\tDESTROYED\020\003\022\025\n\021DESTROY_SCHEDULED\020\004"
          + "\022\022\n\016PENDING_IMPORT\020\006\022\021\n\rIMPORT_FAILED\020\007\022"
          + "\025\n\021GENERATION_FAILED\020\010\022 \n\034PENDING_EXTERN"
          + "AL_DESTRUCTION\020\t\022\037\n\033EXTERNAL_DESTRUCTION"
          + "_FAILED\020\n\"I\n\024CryptoKeyVersionView\022\'\n#CRY"
          + "PTO_KEY_VERSION_VIEW_UNSPECIFIED\020\000\022\010\n\004FU"
          + "LL\020\001:\252\001\352A\246\001\n(cloudkms.googleapis.com/Cry"
          + "ptoKeyVersion\022zprojects/{project}/locati"
          + "ons/{location}/keyRings/{key_ring}/crypt"
          + "oKeys/{crypto_key}/cryptoKeyVersions/{cr"
          + "ypto_key_version}\"\234\003\n\tPublicKey\022\013\n\003pem\030\001"
          + " \001(\t\022R\n\talgorithm\030\002 \001(\0162?.google.cloud.k"
          + "ms.v1.CryptoKeyVersion.CryptoKeyVersionA"
          + "lgorithm\022/\n\npem_crc32c\030\003 \001(\0132\033.google.pr"
          + "otobuf.Int64Value\022\014\n\004name\030\004 \001(\t\022>\n\020prote"
          + "ction_level\030\005 \001(\0162$.google.cloud.kms.v1."
          + "ProtectionLevel:\256\001\352A\252\001\n!cloudkms.googlea"
          + "pis.com/PublicKey\022\204\001projects/{project}/l"
          + "ocations/{location}/keyRings/{key_ring}/"
          + "cryptoKeys/{crypto_key}/cryptoKeyVersion"
          + "s/{crypto_key_version}/publicKey\"\324\010\n\tImp"
          + "ortJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022J\n\rimport_meth"
          + "od\030\002 \001(\0162+.google.cloud.kms.v1.ImportJob"
          + ".ImportMethodB\006\340A\002\340A\005\022F\n\020protection_leve"
          + "l\030\t \001(\0162$.google.cloud.kms.v1.Protection"
          + "LevelB\006\340A\002\340A\005\0224\n\013create_time\030\003 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0226\n\rgenerate_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013expire_time\030\005 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022:\n\021expire_event_time\030\n"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022A\n"
          + "\005state\030\006 \001(\0162-.google.cloud.kms.v1.Impor"
          + "tJob.ImportJobStateB\003\340A\003\022I\n\npublic_key\030\007"
          + " \001(\01320.google.cloud.kms.v1.ImportJob.Wra"
          + "ppingPublicKeyB\003\340A\003\022F\n\013attestation\030\010 \001(\013"
          + "2,.google.cloud.kms.v1.KeyOperationAttes"
          + "tationB\003\340A\003\032 \n\021WrappingPublicKey\022\013\n\003pem\030"
          + "\001 \001(\t\"\345\001\n\014ImportMethod\022\035\n\031IMPORT_METHOD_"
          + "UNSPECIFIED\020\000\022\036\n\032RSA_OAEP_3072_SHA1_AES_"
          + "256\020\001\022\036\n\032RSA_OAEP_4096_SHA1_AES_256\020\002\022 \n"
          + "\034RSA_OAEP_3072_SHA256_AES_256\020\003\022 \n\034RSA_O"
          + "AEP_4096_SHA256_AES_256\020\004\022\030\n\024RSA_OAEP_30"
          + "72_SHA256\020\005\022\030\n\024RSA_OAEP_4096_SHA256\020\006\"c\n"
          + "\016ImportJobState\022 \n\034IMPORT_JOB_STATE_UNSP"
          + "ECIFIED\020\000\022\026\n\022PENDING_GENERATION\020\001\022\n\n\006ACT"
          + "IVE\020\002\022\013\n\007EXPIRED\020\003:{\352Ax\n!cloudkms.google"
          + "apis.com/ImportJob\022Sprojects/{project}/l"
          + "ocations/{location}/keyRings/{key_ring}/"
          + "importJobs/{import_job}\"[\n\036ExternalProte"
          + "ctionLevelOptions\022\030\n\020external_key_uri\030\001 "
          + "\001(\t\022\037\n\027ekm_connection_key_path\030\002 \001(\t\"b\n\035"
          + "KeyAccessJustificationsPolicy\022A\n\026allowed"
          + "_access_reasons\030\001 \003(\0162!.google.cloud.kms"
          + ".v1.AccessReason*j\n\017ProtectionLevel\022 \n\034P"
          + "ROTECTION_LEVEL_UNSPECIFIED\020\000\022\014\n\010SOFTWAR"
          + "E\020\001\022\007\n\003HSM\020\002\022\014\n\010EXTERNAL\020\003\022\020\n\014EXTERNAL_V"
          + "PC\020\004*\253\003\n\014AccessReason\022\026\n\022REASON_UNSPECIF"
          + "IED\020\000\022\036\n\032CUSTOMER_INITIATED_SUPPORT\020\001\022\034\n"
          + "\030GOOGLE_INITIATED_SERVICE\020\002\022\034\n\030THIRD_PAR"
          + "TY_DATA_REQUEST\020\003\022\033\n\027GOOGLE_INITIATED_RE"
          + "VIEW\020\004\022\035\n\031CUSTOMER_INITIATED_ACCESS\020\005\022%\n"
          + "!GOOGLE_INITIATED_SYSTEM_OPERATION\020\006\022\027\n\023"
          + "REASON_NOT_EXPECTED\020\007\022&\n\"MODIFIED_CUSTOM"
          + "ER_INITIATED_ACCESS\020\010\022.\n*MODIFIED_GOOGLE"
          + "_INITIATED_SYSTEM_OPERATION\020\t\022\'\n#GOOGLE_"
          + "RESPONSE_TO_PRODUCTION_ALERT\020\n\022*\n&CUSTOM"
          + "ER_AUTHORIZED_WORKFLOW_SERVICING\020\013B\210\001\n\027c"
          + "om.google.cloud.kms.v1B\021KmsResourcesProt"
          + "oP\001Z)cloud.google.com/go/kms/apiv1/kmspb"
          + ";kmspb\370\001\001\252\002\023Google.Cloud.Kms.V1\312\002\023Google"
          + "\\Cloud\\Kms\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyRing_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
            new java.lang.String[] {
              "Name",
              "Primary",
              "Purpose",
              "CreateTime",
              "NextRotationTime",
              "RotationPeriod",
              "VersionTemplate",
              "Labels",
              "ImportOnly",
              "DestroyScheduledDuration",
              "CryptoKeyBackend",
              "KeyAccessJustificationsPolicy",
              "RotationSchedule",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor,
            new java.lang.String[] {
              "ProtectionLevel", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor,
            new java.lang.String[] {
              "Format", "Content", "CertChains",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor =
        internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor,
            new java.lang.String[] {
              "CaviumCerts", "GoogleCardCerts", "GooglePartitionCerts",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "ProtectionLevel",
              "Algorithm",
              "Attestation",
              "CreateTime",
              "GenerateTime",
              "DestroyTime",
              "DestroyEventTime",
              "ImportJob",
              "ImportTime",
              "ImportFailureReason",
              "GenerationFailureReason",
              "ExternalDestructionFailureReason",
              "ExternalProtectionLevelOptions",
              "ReimportEligible",
            });
    internal_static_google_cloud_kms_v1_PublicKey_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_PublicKey_descriptor,
            new java.lang.String[] {
              "Pem", "Algorithm", "PemCrc32C", "Name", "ProtectionLevel",
            });
    internal_static_google_cloud_kms_v1_ImportJob_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_descriptor,
            new java.lang.String[] {
              "Name",
              "ImportMethod",
              "ProtectionLevel",
              "CreateTime",
              "GenerateTime",
              "ExpireTime",
              "ExpireEventTime",
              "State",
              "PublicKey",
              "Attestation",
            });
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor =
        internal_static_google_cloud_kms_v1_ImportJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor,
            new java.lang.String[] {
              "Pem",
            });
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor,
            new java.lang.String[] {
              "ExternalKeyUri", "EkmConnectionKeyPath",
            });
    internal_static_google_cloud_kms_v1_KeyAccessJustificationsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_kms_v1_KeyAccessJustificationsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyAccessJustificationsPolicy_descriptor,
            new java.lang.String[] {
              "AllowedAccessReasons",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
