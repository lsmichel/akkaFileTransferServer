// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proj.proto

package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

/**
 * Protobuf type {@code FileTransfertManager.fileInfo}
 */
public  final class fileInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FileTransfertManager.fileInfo)
    fileInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use fileInfo.newBuilder() to construct.
  private fileInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private fileInfo() {
    identifiant_ = "";
    size_ = 0;
    fileName_ = "";
    totalblocNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private fileInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            identifiant_ = s;
            break;
          }
          case 16: {

            size_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 32: {

            totalblocNumber_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_fileInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_fileInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.Builder.class);
  }

  public static final int IDENTIFIANT_FIELD_NUMBER = 1;
  private volatile java.lang.Object identifiant_;
  /**
   * <code>string identifiant = 1;</code>
   */
  public java.lang.String getIdentifiant() {
    java.lang.Object ref = identifiant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identifiant_ = s;
      return s;
    }
  }
  /**
   * <code>string identifiant = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdentifiantBytes() {
    java.lang.Object ref = identifiant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identifiant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private int size_;
  /**
   * <code>int32 size = 2;</code>
   */
  public int getSize() {
    return size_;
  }

  public static final int FILENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string fileName = 3;</code>
   */
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string fileName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTALBLOCNUMBER_FIELD_NUMBER = 4;
  private int totalblocNumber_;
  /**
   * <code>int32 totalblocNumber = 4;</code>
   */
  public int getTotalblocNumber() {
    return totalblocNumber_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdentifiantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identifiant_);
    }
    if (size_ != 0) {
      output.writeInt32(2, size_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    if (totalblocNumber_ != 0) {
      output.writeInt32(4, totalblocNumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdentifiantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identifiant_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, size_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
    }
    if (totalblocNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalblocNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo)) {
      return super.equals(obj);
    }
    sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo other = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo) obj;

    boolean result = true;
    result = result && getIdentifiant()
        .equals(other.getIdentifiant());
    result = result && (getSize()
        == other.getSize());
    result = result && getFileName()
        .equals(other.getFileName());
    result = result && (getTotalblocNumber()
        == other.getTotalblocNumber());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDENTIFIANT_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifiant().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + TOTALBLOCNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getTotalblocNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FileTransfertManager.fileInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FileTransfertManager.fileInfo)
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_fileInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_fileInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.Builder.class);
    }

    // Construct using sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      identifiant_ = "";

      size_ = 0;

      fileName_ = "";

      totalblocNumber_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_fileInfo_descriptor;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo getDefaultInstanceForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.getDefaultInstance();
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo build() {
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo buildPartial() {
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo result = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo(this);
      result.identifiant_ = identifiant_;
      result.size_ = size_;
      result.fileName_ = fileName_;
      result.totalblocNumber_ = totalblocNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo) {
        return mergeFrom((sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo other) {
      if (other == sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo.getDefaultInstance()) return this;
      if (!other.getIdentifiant().isEmpty()) {
        identifiant_ = other.identifiant_;
        onChanged();
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (other.getTotalblocNumber() != 0) {
        setTotalblocNumber(other.getTotalblocNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object identifiant_ = "";
    /**
     * <code>string identifiant = 1;</code>
     */
    public java.lang.String getIdentifiant() {
      java.lang.Object ref = identifiant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identifiant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identifiant = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifiantBytes() {
      java.lang.Object ref = identifiant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifiant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identifiant = 1;</code>
     */
    public Builder setIdentifiant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identifiant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identifiant = 1;</code>
     */
    public Builder clearIdentifiant() {
      
      identifiant_ = getDefaultInstance().getIdentifiant();
      onChanged();
      return this;
    }
    /**
     * <code>string identifiant = 1;</code>
     */
    public Builder setIdentifiantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identifiant_ = value;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 2;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 2;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 2;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string fileName = 3;</code>
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fileName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fileName = 3;</code>
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 3;</code>
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 3;</code>
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private int totalblocNumber_ ;
    /**
     * <code>int32 totalblocNumber = 4;</code>
     */
    public int getTotalblocNumber() {
      return totalblocNumber_;
    }
    /**
     * <code>int32 totalblocNumber = 4;</code>
     */
    public Builder setTotalblocNumber(int value) {
      
      totalblocNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 totalblocNumber = 4;</code>
     */
    public Builder clearTotalblocNumber() {
      
      totalblocNumber_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FileTransfertManager.fileInfo)
  }

  // @@protoc_insertion_point(class_scope:FileTransfertManager.fileInfo)
  private static final sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo();
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<fileInfo>
      PARSER = new com.google.protobuf.AbstractParser<fileInfo>() {
    public fileInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new fileInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<fileInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<fileInfo> getParserForType() {
    return PARSER;
  }

  public sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

