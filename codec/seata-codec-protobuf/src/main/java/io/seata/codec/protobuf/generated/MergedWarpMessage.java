// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mergedWarpMessage.proto

package io.seata.codec.protobuf.generated;

public final class MergedWarpMessage {
  private MergedWarpMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_MergedWarpMessageProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_MergedWarpMessageProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027mergedWarpMessage.proto\022\032io.seata.prot" +
      "ocol.protobuf\032\025abstractMessage.proto\032\031go" +
      "ogle/protobuf/any.proto\"\227\001\n\026MergedWarpMe" +
      "ssageProto\022I\n\017abstractMessage\030\001 \001(\01320.io" +
      ".seata.protocol.protobuf.AbstractMessage" +
      "Proto\022\"\n\004msgs\030\002 \003(\0132\024.google.protobuf.An" +
      "y\022\016\n\006msgIds\030\003 \003(\003B8\n!io.seata.codec.prot" +
      "obuf.generatedB\021MergedWarpMessageP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.codec.protobuf.generated.AbstractMessage.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_MergedWarpMessageProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_MergedWarpMessageProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_MergedWarpMessageProto_descriptor,
        new java.lang.String[] { "AbstractMessage", "Msgs", "MsgIds", });
    io.seata.codec.protobuf.generated.AbstractMessage.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
