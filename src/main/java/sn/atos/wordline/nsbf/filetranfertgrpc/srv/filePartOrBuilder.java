// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proj.proto

package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

public interface filePartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileTransfertManager.filePart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes chunk = 1;</code>
   */
  com.google.protobuf.ByteString getChunk();

  /**
   * <code>string fileName = 2;</code>
   */
  java.lang.String getFileName();
  /**
   * <code>string fileName = 2;</code>
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string zise = 3;</code>
   */
  java.lang.String getZise();
  /**
   * <code>string zise = 3;</code>
   */
  com.google.protobuf.ByteString
      getZiseBytes();

  /**
   * <code>int32 blocNumber = 4;</code>
   */
  int getBlocNumber();

  /**
   * <code>string identifiant = 5;</code>
   */
  java.lang.String getIdentifiant();
  /**
   * <code>string identifiant = 5;</code>
   */
  com.google.protobuf.ByteString
      getIdentifiantBytes();
}
