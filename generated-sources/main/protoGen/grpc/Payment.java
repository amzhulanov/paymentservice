// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package grpc;

public final class Payment {
  private Payment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Card_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Card_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_APIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_APIResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpayment.proto\"&\n\004Card\022\016\n\006userId\030\001 \001(\005\022" +
      "\016\n\006amount\030\002 \001(\005\"\035\n\013APIResponse\022\016\n\006idTask" +
      "\030\001 \001(\0052N\n\016PaymentService\022\035\n\006enroll\022\005.Car" +
      "d\032\014.APIResponse\022\035\n\006refund\022\005.Card\032\014.APIRe" +
      "sponseB\010\n\004grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Card_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Card_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Card_descriptor,
        new java.lang.String[] { "UserId", "Amount", });
    internal_static_APIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_APIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_APIResponse_descriptor,
        new java.lang.String[] { "IdTask", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}