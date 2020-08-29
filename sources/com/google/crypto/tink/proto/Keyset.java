package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
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

public final class Keyset extends C3731z<Keyset, Builder> implements KeysetOrBuilder {
    public static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    public static volatile C3739z0<Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    public C3603i<Key> key_ = C3731z.emptyProtobufList();
    public int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.Keyset$1 */
    public static /* synthetic */ class C03111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1507xa1df5c61;

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
                f1507xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1507xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.Keyset.C03111.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<Keyset, Builder> implements KeysetOrBuilder {
        public Builder() {
            super(Keyset.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03111 r1) {
            this();
        }

        public Builder addAllKey(Iterable<? extends Key> iterable) {
            copyOnWrite();
            ((Keyset) this.instance).addAllKey(iterable);
            return this;
        }

        public Builder addKey(int i, Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(i, (Key) builder.build());
            return this;
        }

        public Builder addKey(int i, Key key) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(i, key);
            return this;
        }

        public Builder addKey(Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).addKey((Key) builder.build());
            return this;
        }

        public Builder addKey(Key key) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(key);
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((Keyset) this.instance).clearKey();
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((Keyset) this.instance).clearPrimaryKeyId();
            return this;
        }

        public Key getKey(int i) {
            return ((Keyset) this.instance).getKey(i);
        }

        public int getKeyCount() {
            return ((Keyset) this.instance).getKeyCount();
        }

        public List<Key> getKeyList() {
            return Collections.unmodifiableList(((Keyset) this.instance).getKeyList());
        }

        public int getPrimaryKeyId() {
            return ((Keyset) this.instance).getPrimaryKeyId();
        }

        public Builder removeKey(int i) {
            copyOnWrite();
            ((Keyset) this.instance).removeKey(i);
            return this;
        }

        public Builder setKey(int i, Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(i, (Key) builder.build());
            return this;
        }

        public Builder setKey(int i, Key key) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(i, key);
            return this;
        }

        public Builder setPrimaryKeyId(int i) {
            copyOnWrite();
            ((Keyset) this.instance).setPrimaryKeyId(i);
            return this;
        }
    }

    public static final class Key extends C3731z<Key, Builder> implements KeyOrBuilder {
        public static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        public static volatile C3739z0<Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public KeyData keyData_;
        public int keyId_;
        public int outputPrefixType_;
        public int status_;

        public static final class Builder extends C3732a<Key, Builder> implements KeyOrBuilder {
            public Builder() {
                super(Key.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(C03111 r1) {
                this();
            }

            public Builder clearKeyData() {
                copyOnWrite();
                ((Key) this.instance).clearKeyData();
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((Key) this.instance).clearKeyId();
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                ((Key) this.instance).clearOutputPrefixType();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Key) this.instance).clearStatus();
                return this;
            }

            public KeyData getKeyData() {
                return ((Key) this.instance).getKeyData();
            }

            public int getKeyId() {
                return ((Key) this.instance).getKeyId();
            }

            public OutputPrefixType getOutputPrefixType() {
                return ((Key) this.instance).getOutputPrefixType();
            }

            public int getOutputPrefixTypeValue() {
                return ((Key) this.instance).getOutputPrefixTypeValue();
            }

            public KeyStatusType getStatus() {
                return ((Key) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((Key) this.instance).getStatusValue();
            }

            public boolean hasKeyData() {
                return ((Key) this.instance).hasKeyData();
            }

            public Builder mergeKeyData(KeyData keyData) {
                copyOnWrite();
                ((Key) this.instance).mergeKeyData(keyData);
                return this;
            }

            public Builder setKeyData(com.google.crypto.tink.proto.KeyData.Builder builder) {
                copyOnWrite();
                ((Key) this.instance).setKeyData((KeyData) builder.build());
                return this;
            }

            public Builder setKeyData(KeyData keyData) {
                copyOnWrite();
                ((Key) this.instance).setKeyData(keyData);
                return this;
            }

            public Builder setKeyId(int i) {
                copyOnWrite();
                ((Key) this.instance).setKeyId(i);
                return this;
            }

            public Builder setOutputPrefixType(OutputPrefixType outputPrefixType) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixType(outputPrefixType);
                return this;
            }

            public Builder setOutputPrefixTypeValue(int i) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixTypeValue(i);
                return this;
            }

            public Builder setStatus(KeyStatusType keyStatusType) {
                copyOnWrite();
                ((Key) this.instance).setStatus(keyStatusType);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((Key) this.instance).setStatusValue(i);
                return this;
            }
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            C3731z.registerDefaultInstance(Key.class, key);
        }

        /* access modifiers changed from: private */
        public void clearKeyData() {
            this.keyData_ = null;
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

        public static Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeKeyData(KeyData keyData) {
            keyData.getClass();
            KeyData keyData2 = this.keyData_;
            if (!(keyData2 == null || keyData2 == KeyData.getDefaultInstance())) {
                keyData = (KeyData) ((com.google.crypto.tink.proto.KeyData.Builder) KeyData.newBuilder(this.keyData_).mergeFrom(keyData)).buildPartial();
            }
            this.keyData_ = keyData;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Key key) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(key);
        }

        public static Key parseDelimitedFrom(InputStream inputStream) {
            return (Key) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
            return (Key) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
        }

        public static Key parseFrom(InputStream inputStream) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(InputStream inputStream, C3697r rVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
        }

        public static Key parseFrom(ByteBuffer byteBuffer) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Key parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
        }

        public static Key parseFrom(C3635j jVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Key parseFrom(C3635j jVar, C3697r rVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
        }

        public static Key parseFrom(C3656k kVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Key parseFrom(C3656k kVar, C3697r rVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
        }

        public static Key parseFrom(byte[] bArr) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Key parseFrom(byte[] bArr, C3697r rVar) {
            return (Key) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
        }

        public static C3739z0<Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setKeyData(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
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

        public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
            switch (gVar.ordinal()) {
                case 0:
                    return Byte.valueOf(1);
                case 1:
                    return null;
                case 2:
                    return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new Key();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C3739z0<Key> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (Key.class) {
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

        public KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
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

        public boolean hasKeyData() {
            return this.keyData_ != null;
        }
    }

    public interface KeyOrBuilder extends C3710t0 {
        KeyData getKeyData();

        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        boolean hasKeyData();
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        C3731z.registerDefaultInstance(Keyset.class, keyset);
    }

    /* access modifiers changed from: private */
    public void addAllKey(Iterable<? extends Key> iterable) {
        ensureKeyIsMutable();
        C3588a.addAll(iterable, (List<? super T>) this.key_);
    }

    /* access modifiers changed from: private */
    public void addKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(i, key);
    }

    /* access modifiers changed from: private */
    public void addKey(Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(key);
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = C3731z.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyIsMutable() {
        if (!this.key_.mo9531s()) {
            this.key_ = C3731z.mutableCopy(this.key_);
        }
    }

    public static Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Keyset keyset) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyset);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream) {
        return (Keyset) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (Keyset) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static Keyset parseFrom(InputStream inputStream) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(InputStream inputStream, C3697r rVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static Keyset parseFrom(C3635j jVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Keyset parseFrom(C3635j jVar, C3697r rVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static Keyset parseFrom(C3656k kVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Keyset parseFrom(C3656k kVar, C3697r rVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static Keyset parseFrom(byte[] bArr) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Keyset parseFrom(byte[] bArr, C3697r rVar) {
        return (Keyset) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeKey(int i) {
        ensureKeyIsMutable();
        this.key_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.set(i, key);
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
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 3:
                return new Keyset();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<Keyset> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (Keyset.class) {
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

    public Key getKey(int i) {
        return (Key) this.key_.get(i);
    }

    public int getKeyCount() {
        return this.key_.size();
    }

    public List<Key> getKeyList() {
        return this.key_;
    }

    public KeyOrBuilder getKeyOrBuilder(int i) {
        return (KeyOrBuilder) this.key_.get(i);
    }

    public List<? extends KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }
}
