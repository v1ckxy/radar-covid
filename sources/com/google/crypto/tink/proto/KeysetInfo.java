package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3710t0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3733b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3739z0;

public final class KeysetInfo extends C3731z<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
    public static final KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    public static volatile C3739z0<KeysetInfo> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    public C3603i<KeyInfo> keyInfo_ = C3731z.emptyProtobufList();
    public int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.KeysetInfo$1 */
    public static /* synthetic */ class C03121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1508xa1df5c61;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
        static {
            /*
                q.b.c.a.j0.a.z$g[] r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1508xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1508xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KeysetInfo.C03121.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
        public Builder() {
            super(KeysetInfo.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03121 r1) {
            this();
        }

        public Builder addAllKeyInfo(Iterable<? extends KeyInfo> iterable) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addAllKeyInfo(iterable);
            return this;
        }

        public Builder addKeyInfo(int i, Builder builder) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(i, (KeyInfo) builder.build());
            return this;
        }

        public Builder addKeyInfo(int i, KeyInfo keyInfo) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(i, keyInfo);
            return this;
        }

        public Builder addKeyInfo(Builder builder) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo((KeyInfo) builder.build());
            return this;
        }

        public Builder addKeyInfo(KeyInfo keyInfo) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(keyInfo);
            return this;
        }

        public Builder clearKeyInfo() {
            copyOnWrite();
            ((KeysetInfo) this.instance).clearKeyInfo();
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((KeysetInfo) this.instance).clearPrimaryKeyId();
            return this;
        }

        public KeyInfo getKeyInfo(int i) {
            return ((KeysetInfo) this.instance).getKeyInfo(i);
        }

        public int getKeyInfoCount() {
            return ((KeysetInfo) this.instance).getKeyInfoCount();
        }

        public List<KeyInfo> getKeyInfoList() {
            return Collections.unmodifiableList(((KeysetInfo) this.instance).getKeyInfoList());
        }

        public int getPrimaryKeyId() {
            return ((KeysetInfo) this.instance).getPrimaryKeyId();
        }

        public Builder removeKeyInfo(int i) {
            copyOnWrite();
            ((KeysetInfo) this.instance).removeKeyInfo(i);
            return this;
        }

        public Builder setKeyInfo(int i, Builder builder) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setKeyInfo(i, (KeyInfo) builder.build());
            return this;
        }

        public Builder setKeyInfo(int i, KeyInfo keyInfo) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setKeyInfo(i, keyInfo);
            return this;
        }

        public Builder setPrimaryKeyId(int i) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setPrimaryKeyId(i);
            return this;
        }
    }

    public static final class KeyInfo extends C3731z<KeyInfo, Builder> implements KeyInfoOrBuilder {
        public static final KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        public static volatile C3739z0<KeyInfo> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        public int keyId_;
        public int outputPrefixType_;
        public int status_;
        public String typeUrl_ = Objects.EMPTY_STRING;

        public static final class Builder extends C3732a<KeyInfo, Builder> implements KeyInfoOrBuilder {
            public Builder() {
                super(KeyInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(C03121 r1) {
                this();
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearKeyId();
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearOutputPrefixType();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearStatus();
                return this;
            }

            public Builder clearTypeUrl() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearTypeUrl();
                return this;
            }

            public int getKeyId() {
                return ((KeyInfo) this.instance).getKeyId();
            }

            public OutputPrefixType getOutputPrefixType() {
                return ((KeyInfo) this.instance).getOutputPrefixType();
            }

            public int getOutputPrefixTypeValue() {
                return ((KeyInfo) this.instance).getOutputPrefixTypeValue();
            }

            public KeyStatusType getStatus() {
                return ((KeyInfo) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((KeyInfo) this.instance).getStatusValue();
            }

            public String getTypeUrl() {
                return ((KeyInfo) this.instance).getTypeUrl();
            }

            public C3635j getTypeUrlBytes() {
                return ((KeyInfo) this.instance).getTypeUrlBytes();
            }

            public Builder setKeyId(int i) {
                copyOnWrite();
                ((KeyInfo) this.instance).setKeyId(i);
                return this;
            }

            public Builder setOutputPrefixType(OutputPrefixType outputPrefixType) {
                copyOnWrite();
                ((KeyInfo) this.instance).setOutputPrefixType(outputPrefixType);
                return this;
            }

            public Builder setOutputPrefixTypeValue(int i) {
                copyOnWrite();
                ((KeyInfo) this.instance).setOutputPrefixTypeValue(i);
                return this;
            }

            public Builder setStatus(KeyStatusType keyStatusType) {
                copyOnWrite();
                ((KeyInfo) this.instance).setStatus(keyStatusType);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((KeyInfo) this.instance).setStatusValue(i);
                return this;
            }

            public Builder setTypeUrl(String str) {
                copyOnWrite();
                ((KeyInfo) this.instance).setTypeUrl(str);
                return this;
            }

            public Builder setTypeUrlBytes(C3635j jVar) {
                copyOnWrite();
                ((KeyInfo) this.instance).setTypeUrlBytes(jVar);
                return this;
            }
        }

        static {
            KeyInfo keyInfo = new KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            C3731z.registerDefaultInstance(KeyInfo.class, keyInfo);
        }

        /* access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOutputPrefixType() {
            this.outputPrefixType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTypeUrl() {
            this.typeUrl_ = getDefaultInstance().getTypeUrl();
        }

        public static KeyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(KeyInfo keyInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(keyInfo);
        }

        public static KeyInfo parseDelimitedFrom(InputStream inputStream) {
            return (KeyInfo) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyInfo parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
            return (KeyInfo) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
        }

        public static KeyInfo parseFrom(InputStream inputStream) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyInfo parseFrom(InputStream inputStream, C3697r rVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
        }

        public static KeyInfo parseFrom(ByteBuffer byteBuffer) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static KeyInfo parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
        }

        public static KeyInfo parseFrom(C3635j jVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static KeyInfo parseFrom(C3635j jVar, C3697r rVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
        }

        public static KeyInfo parseFrom(C3656k kVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static KeyInfo parseFrom(C3656k kVar, C3697r rVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
        }

        public static KeyInfo parseFrom(byte[] bArr) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeyInfo parseFrom(byte[] bArr, C3697r rVar) {
            return (KeyInfo) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
        }

        public static C3739z0<KeyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setKeyId(int i) {
            this.keyId_ = i;
        }

        /* access modifiers changed from: private */
        public void setOutputPrefixType(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* access modifiers changed from: private */
        public void setOutputPrefixTypeValue(int i) {
            this.outputPrefixType_ = i;
        }

        /* access modifiers changed from: private */
        public void setStatus(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        /* access modifiers changed from: private */
        public void setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setTypeUrlBytes(C3635j jVar) {
            C3588a.checkByteStringIsUtf8(jVar);
            this.typeUrl_ = jVar.mo9669h();
        }

        public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
            switch (gVar.ordinal()) {
                case 0:
                    return Byte.valueOf(1);
                case 1:
                    return null;
                case 2:
                    return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new KeyInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C3739z0<KeyInfo> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (KeyInfo.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new C3733b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getKeyId() {
            return this.keyId_;
        }

        public OutputPrefixType getOutputPrefixType() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        public KeyStatusType getStatus() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            return forNumber == null ? KeyStatusType.UNRECOGNIZED : forNumber;
        }

        public int getStatusValue() {
            return this.status_;
        }

        public String getTypeUrl() {
            return this.typeUrl_;
        }

        public C3635j getTypeUrlBytes() {
            return C3635j.m8387a(this.typeUrl_);
        }
    }

    public interface KeyInfoOrBuilder extends C3710t0 {
        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        String getTypeUrl();

        C3635j getTypeUrlBytes();
    }

    static {
        KeysetInfo keysetInfo = new KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        C3731z.registerDefaultInstance(KeysetInfo.class, keysetInfo);
    }

    /* access modifiers changed from: private */
    public void addAllKeyInfo(Iterable<? extends KeyInfo> iterable) {
        ensureKeyInfoIsMutable();
        C3588a.addAll(iterable, (List<? super T>) this.keyInfo_);
    }

    /* access modifiers changed from: private */
    public void addKeyInfo(int i, KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(i, keyInfo);
    }

    /* access modifiers changed from: private */
    public void addKeyInfo(KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(keyInfo);
    }

    /* access modifiers changed from: private */
    public void clearKeyInfo() {
        this.keyInfo_ = C3731z.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyInfoIsMutable() {
        if (!this.keyInfo_.mo9531s()) {
            this.keyInfo_ = C3731z.mutableCopy(this.keyInfo_);
        }
    }

    public static KeysetInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeysetInfo keysetInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keysetInfo);
    }

    public static KeysetInfo parseDelimitedFrom(InputStream inputStream) {
        return (KeysetInfo) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeysetInfo parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (KeysetInfo) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeysetInfo parseFrom(InputStream inputStream) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeysetInfo parseFrom(InputStream inputStream, C3697r rVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeysetInfo parseFrom(ByteBuffer byteBuffer) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeysetInfo parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static KeysetInfo parseFrom(C3635j jVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static KeysetInfo parseFrom(C3635j jVar, C3697r rVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static KeysetInfo parseFrom(C3656k kVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static KeysetInfo parseFrom(C3656k kVar, C3697r rVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static KeysetInfo parseFrom(byte[] bArr) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeysetInfo parseFrom(byte[] bArr, C3697r rVar) {
        return (KeysetInfo) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<KeysetInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeKeyInfo(int i) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setKeyInfo(int i, KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.set(i, keyInfo);
    }

    /* access modifiers changed from: private */
    public void setPrimaryKeyId(int i) {
        this.primaryKeyId_ = i;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", KeyInfo.class});
            case 3:
                return new KeysetInfo();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<KeysetInfo> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (KeysetInfo.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new C3733b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public KeyInfo getKeyInfo(int i) {
        return (KeyInfo) this.keyInfo_.get(i);
    }

    public int getKeyInfoCount() {
        return this.keyInfo_.size();
    }

    public List<KeyInfo> getKeyInfoList() {
        return this.keyInfo_;
    }

    public KeyInfoOrBuilder getKeyInfoOrBuilder(int i) {
        return (KeyInfoOrBuilder) this.keyInfo_.get(i);
    }

    public List<? extends KeyInfoOrBuilder> getKeyInfoOrBuilderList() {
        return this.keyInfo_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }
}
