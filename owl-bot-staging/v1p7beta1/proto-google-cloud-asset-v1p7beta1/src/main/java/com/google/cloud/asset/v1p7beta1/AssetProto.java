// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p7beta1/assets.proto

package com.google.cloud.asset.v1p7beta1;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/asset/v1p7beta1/assets.pr" +
      "oto\022\034google.cloud.asset.v1p7beta1\032\034googl" +
      "e/api/annotations.proto\032\031google/api/reso" +
      "urce.proto\032)google/cloud/orgpolicy/v1/or" +
      "gpolicy.proto\032(google/cloud/osconfig/v1/" +
      "inventory.proto\032\032google/iam/v1/policy.pr" +
      "oto\032:google/identity/accesscontextmanage" +
      "r/v1/access_level.proto\032;google/identity" +
      "/accesscontextmanager/v1/access_policy.p" +
      "roto\032?google/identity/accesscontextmanag" +
      "er/v1/service_perimeter.proto\032\031google/pr" +
      "otobuf/any.proto\032\034google/protobuf/struct" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\206\005\n\005Asset\022/\n\013update_time\030\013 \001(\0132\032.google." +
      "protobuf.Timestamp\022\014\n\004name\030\001 \001(\t\022\022\n\nasse" +
      "t_type\030\002 \001(\t\0228\n\010resource\030\003 \001(\0132&.google." +
      "cloud.asset.v1p7beta1.Resource\022)\n\niam_po" +
      "licy\030\004 \001(\0132\025.google.iam.v1.Policy\0225\n\norg" +
      "_policy\030\006 \003(\0132!.google.cloud.orgpolicy.v" +
      "1.Policy\022N\n\raccess_policy\030\007 \001(\01325.google" +
      ".identity.accesscontextmanager.v1.Access" +
      "PolicyH\000\022L\n\014access_level\030\010 \001(\01324.google." +
      "identity.accesscontextmanager.v1.AccessL" +
      "evelH\000\022V\n\021service_perimeter\030\t \001(\01329.goog" +
      "le.identity.accesscontextmanager.v1.Serv" +
      "icePerimeterH\000\022C\n\016related_assets\030\r \001(\0132+" +
      ".google.cloud.asset.v1p7beta1.RelatedAss" +
      "ets\022\021\n\tancestors\030\n \003(\t:\'\352A$\n\037cloudasset." +
      "googleapis.com/Asset\022\001*B\027\n\025access_contex" +
      "t_policy\"\262\001\n\010Resource\022\017\n\007version\030\001 \001(\t\022\036" +
      "\n\026discovery_document_uri\030\002 \001(\t\022\026\n\016discov" +
      "ery_name\030\003 \001(\t\022\024\n\014resource_url\030\004 \001(\t\022\016\n\006" +
      "parent\030\005 \001(\t\022%\n\004data\030\006 \001(\0132\027.google.prot" +
      "obuf.Struct\022\020\n\010location\030\010 \001(\t\"\242\001\n\rRelate" +
      "dAssets\022U\n\027relationship_attributes\030\001 \001(\013" +
      "24.google.cloud.asset.v1p7beta1.Relation" +
      "shipAttributes\022:\n\006assets\030\002 \003(\0132*.google." +
      "cloud.asset.v1p7beta1.RelatedAsset\"r\n\026Re" +
      "lationshipAttributes\022\014\n\004type\030\004 \001(\t\022\034\n\024so" +
      "urce_resource_type\030\001 \001(\t\022\034\n\024target_resou" +
      "rce_type\030\002 \001(\t\022\016\n\006action\030\003 \001(\t\"j\n\014Relate" +
      "dAsset\0223\n\005asset\030\001 \001(\tB$\372A!\n\037cloudasset.g" +
      "oogleapis.com/Asset\022\022\n\nasset_type\030\002 \001(\t\022" +
      "\021\n\tancestors\030\003 \003(\tB\264\001\n com.google.cloud." +
      "asset.v1p7beta1B\nAssetProtoP\001ZAgoogle.go" +
      "lang.org/genproto/googleapis/cloud/asset" +
      "/v1p7beta1;asset\370\001\001\252\002\034Google.Cloud.Asset" +
      ".V1P7Beta1\312\002\034Google\\Cloud\\Asset\\V1p7beta" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor(),
          com.google.cloud.osconfig.v1.Inventories.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor(),
          com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p7beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_Asset_descriptor,
        new java.lang.String[] { "UpdateTime", "Name", "AssetType", "Resource", "IamPolicy", "OrgPolicy", "AccessPolicy", "AccessLevel", "ServicePerimeter", "RelatedAssets", "Ancestors", "AccessContextPolicy", });
    internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p7beta1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_Resource_descriptor,
        new java.lang.String[] { "Version", "DiscoveryDocumentUri", "DiscoveryName", "ResourceUrl", "Parent", "Data", "Location", });
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelatedAssets_descriptor,
        new java.lang.String[] { "RelationshipAttributes", "Assets", });
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelationshipAttributes_descriptor,
        new java.lang.String[] { "Type", "SourceResourceType", "TargetResourceType", "Action", });
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p7beta1_RelatedAsset_descriptor,
        new java.lang.String[] { "Asset", "AssetType", "Ancestors", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor();
    com.google.cloud.osconfig.v1.Inventories.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
