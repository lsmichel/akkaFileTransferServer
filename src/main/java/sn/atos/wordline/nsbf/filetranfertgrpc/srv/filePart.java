// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proj.proto

package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

/**
 * Protobuf type {@code FileTransfertManager.filePart}
 */
public  final class filePart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FileTransfertManager.filePart)
    filePartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use filePart.newBuilder() to construct.
  private filePart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private filePart() {
    chunk_ = com.google.protobuf.ByteString.EMPTY;
    fileName_ = "";
    zise_ = "";
    blocNumber_ = 0;
    identifiant_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private filePart(
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

            chunk_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            zise_ = s;
            break;
          }
          case 32: {

            blocNumber_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            identifiant_ = s;
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
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_filePart_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_filePart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.Builder.class);
  }

  public static final int CHUNK_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString chunk_;
  /**
   * <code>bytes chunk = 1;</code>
   */
  public com.google.protobuf.ByteString getChunk() {
    return chunk_;
  }

  public static final int FILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string fileName = 2;</code>
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
   * <code>string fileName = 2;</code>
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

  public static final int ZISE_FIELD_NUMBER = 3;
  private volatile java.lang.Object zise_;
  /**
   * <code>string zise = 3;</code>
   */
  public java.lang.String getZise() {
    java.lang.Object ref = zise_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zise_ = s;
      return s;
    }
  }
  /**
   * <code>string zise = 3;</code>
   */
  public com.google.protobuf.ByteString
      getZiseBytes() {
    java.lang.Object ref = zise_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zise_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOCNUMBER_FIELD_NUMBER = 4;
  private int blocNumber_;
  /**
   * <code>int32 blocNumber = 4;</code>
   */
  public int getBlocNumber() {
    return blocNumber_;
  }

  public static final int IDENTIFIANT_FIELD_NUMBER = 5;
  private volatile java.lang.Object identifiant_;
  /**
   * <code>string identifiant = 5;</code>
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
   * <code>string identifiant = 5;</code>
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
    if (!chunk_.isEmpty()) {
      output.writeBytes(1, chunk_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileName_);
    }
    if (!getZiseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, zise_);
    }
    if (blocNumber_ != 0) {
      output.writeInt32(4, blocNumber_);
    }
    if (!getIdentifiantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, identifiant_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!chunk_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, chunk_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileName_);
    }
    if (!getZiseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, zise_);
    }
    if (blocNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, blocNumber_);
    }
    if (!getIdentifiantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, identifiant_);
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
    if (!(obj instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart)) {
      return super.equals(obj);
    }
    sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart other = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart) obj;

    boolean result = true;
    result = result && getChunk()
        .equals(other.getChunk());
    result = result && getFileName()
        .equals(other.getFileName());
    result = result && getZise()
        .equals(other.getZise());
    result = result && (getBlocNumber()
        == other.getBlocNumber());
    result = result && getIdentifiant()
        .equals(other.getIdentifiant());
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
    hash = (37 * hash) + CHUNK_FIELD_NUMBER;
    hash = (53 * hash) + getChunk().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + ZISE_FIELD_NUMBER;
    hash = (53 * hash) + getZise().hashCode();
    hash = (37 * hash) + BLOCNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getBlocNumber();
    hash = (37 * hash) + IDENTIFIANT_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifiant().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parseFrom(
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
  public static Builder newBuilder(sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart prototype) {
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
   * Protobuf type {@code FileTransfertManager.filePart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FileTransfertManager.filePart)
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_filePart_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_filePart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.Builder.class);
    }

    // Construct using sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.newBuilder()
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
      chunk_ = com.google.protobuf.ByteString.EMPTY;

      fileName_ = "";

      zise_ = "";

      blocNumber_ = 0;

      identifiant_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_filePart_descriptor;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart getDefaultInstanceForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.getDefaultInstance();
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart build() {
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart buildPartial() {
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart result = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart(this);
      result.chunk_ = chunk_;
      result.fileName_ = fileName_;
      result.zise_ = zise_;
      result.blocNumber_ = blocNumber_;
      result.identifiant_ = identifiant_;
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
      if (other instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart) {
        return mergeFrom((sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart other) {
      if (other == sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart.getDefaultInstance()) return this;
      if (other.getChunk() != com.google.protobuf.ByteString.EMPTY) {
        setChunk(other.getChunk());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (!other.getZise().isEmpty()) {
        zise_ = other.zise_;
        onChanged();
      }
      if (other.getBlocNumber() != 0) {
        setBlocNumber(other.getBlocNumber());
      }
      if (!other.getIdentifiant().isEmpty()) {
        identifiant_ = other.identifiant_;
        onChanged();
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
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString chunk_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes chunk = 1;</code>
     */
    public com.google.protobuf.ByteString getChunk() {
      return chunk_;
    }
    /**
     * <code>bytes chunk = 1;</code>
     */
    public Builder setChunk(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      chunk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes chunk = 1;</code>
     */
    public Builder clearChunk() {
      
      chunk_ = getDefaultInstance().getChunk();
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string fileName = 2;</code>
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
     * <code>string fileName = 2;</code>
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
     * <code>string fileName = 2;</code>
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
     * <code>string fileName = 2;</code>
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 2;</code>
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

    private java.lang.Object zise_ = "";
    /**
     * <code>string zise = 3;</code>
     */
    public java.lang.String getZise() {
      java.lang.Object ref = zise_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zise_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string zise = 3;</code>
     */
    public com.google.protobuf.ByteString
        getZiseBytes() {
      java.lang.Object ref = zise_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zise_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string zise = 3;</code>
     */
    public Builder setZise(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zise_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string zise = 3;</code>
     */
    public Builder clearZise() {
      
      zise_ = getDefaultInstance().getZise();
      onChanged();
      return this;
    }
    /**
     * <code>string zise = 3;</code>
     */
    public Builder setZiseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zise_ = value;
      onChanged();
      return this;
    }

    private int blocNumber_ ;
    /**
     * <code>int32 blocNumber = 4;</code>
     */
    public int getBlocNumber() {
      return blocNumber_;
    }
    /**
     * <code>int32 blocNumber = 4;</code>
     */
    public Builder setBlocNumber(int value) {
      
      blocNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 blocNumber = 4;</code>
     */
    public Builder clearBlocNumber() {
      
      blocNumber_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object identifiant_ = "";
    /**
     * <code>string identifiant = 5;</code>
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
     * <code>string identifiant = 5;</code>
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
     * <code>string identifiant = 5;</code>
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
     * <code>string identifiant = 5;</code>
     */
    public Builder clearIdentifiant() {
      
      identifiant_ = getDefaultInstance().getIdentifiant();
      onChanged();
      return this;
    }
    /**
     * <code>string identifiant = 5;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FileTransfertManager.filePart)
  }

  // @@protoc_insertion_point(class_scope:FileTransfertManager.filePart)
  private static final sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart();
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<filePart>
      PARSER = new com.google.protobuf.AbstractParser<filePart>() {
    public filePart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new filePart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<filePart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<filePart> getParserForType() {
    return PARSER;
  }

  public sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

