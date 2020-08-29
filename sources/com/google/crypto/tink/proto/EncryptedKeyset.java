package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3733b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3739z0;

public final class EncryptedKeyset extends C3731z<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
    public static final EncryptedKeyset DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    public static volatile C3739z0<EncryptedKeyset> PARSER;
    public C3635j encryptedKeyset_ = C3635j.f9034f;
    public KeysetInfo keysetInfo_;

    /* renamed from: com.google.crypto.tink.proto.EncryptedKeyset$1 */
    public static /* synthetic */ class C02981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1497xa1df5c61;

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
                f1497xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1497xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EncryptedKeyset.C02981.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
        public Builder() {
            super(EncryptedKeyset.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02981 r1) {
            this();
        }

        public Builder clearEncryptedKeyset() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearEncryptedKeyset();
            return this;
        }

        public Builder clearKeysetInfo() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearKeysetInfo();
            return this;
        }

        public C3635j getEncryptedKeyset() {
            return ((EncryptedKeyset) this.instance).getEncryptedKeyset();
        }

        public KeysetInfo getKeysetInfo() {
            return ((EncryptedKeyset) this.instance).getKeysetInfo();
        }

        public boolean hasKeysetInfo() {
            return ((EncryptedKeyset) this.instance).hasKeysetInfo();
        }

        public Builder mergeKeysetInfo(KeysetInfo keysetInfo) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).mergeKeysetInfo(keysetInfo);
            return this;
        }

        public Builder setEncryptedKeyset(C3635j jVar) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setEncryptedKeyset(jVar);
            return this;
        }

        public Builder setKeysetInfo(com.google.crypto.tink.proto.KeysetInfo.Builder builder) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo((KeysetInfo) builder.build());
            return this;
        }

        public Builder setKeysetInfo(KeysetInfo keysetInfo) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo(keysetInfo);
            return this;
        }
    }

    static {
        EncryptedKeyset encryptedKeyset = new EncryptedKeyset();
        DEFAULT_INSTANCE = encryptedKeyset;
        C3731z.registerDefaultInstance(EncryptedKeyset.class, encryptedKeyset);
    }

    /* access modifiers changed from: private */
    public void clearEncryptedKeyset() {
        this.encryptedKeyset_ = getDefaultInstance().getEncryptedKeyset();
    }

    /* access modifiers changed from: private */
    public void clearKeysetInfo() {
        this.keysetInfo_ = null;
    }

    public static EncryptedKeyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        KeysetInfo keysetInfo2 = this.keysetInfo_;
        if (!(keysetInfo2 == null || keysetInfo2 == KeysetInfo.getDefaultInstance())) {
            keysetInfo = (KeysetInfo) ((com.google.crypto.tink.proto.KeysetInfo.Builder) KeysetInfo.newBuilder(this.keysetInfo_).mergeFrom(keysetInfo)).buildPartial();
        }
        this.keysetInfo_ = keysetInfo;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EncryptedKeyset encryptedKeyset) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(encryptedKeyset);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream) {
        return (EncryptedKeyset) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EncryptedKeyset parseFrom(C3635j jVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EncryptedKeyset parseFrom(C3635j jVar, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EncryptedKeyset parseFrom(C3656k kVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EncryptedKeyset parseFrom(C3656k kVar, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr, C3697r rVar) {
        return (EncryptedKeyset) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EncryptedKeyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setEncryptedKeyset(C3635j jVar) {
        jVar.getClass();
        this.encryptedKeyset_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        this.keysetInfo_ = keysetInfo;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new EncryptedKeyset();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EncryptedKeyset> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EncryptedKeyset.class) {
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

    public C3635j getEncryptedKeyset() {
        return this.encryptedKeyset_;
    }

    public KeysetInfo getKeysetInfo() {
        KeysetInfo keysetInfo = this.keysetInfo_;
        return keysetInfo == null ? KeysetInfo.getDefaultInstance() : keysetInfo;
    }

    public boolean hasKeysetInfo() {
        return this.keysetInfo_ != null;
    }
}
