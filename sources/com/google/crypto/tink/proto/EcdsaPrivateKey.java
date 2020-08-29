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

public final class EcdsaPrivateKey extends C3731z<EcdsaPrivateKey, Builder> implements EcdsaPrivateKeyOrBuilder {
    public static final EcdsaPrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static volatile C3739z0<EcdsaPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    public C3635j keyValue_ = C3635j.f9034f;
    public EcdsaPublicKey publicKey_;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.EcdsaPrivateKey$1 */
    public static /* synthetic */ class C02841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1481xa1df5c61;

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
                f1481xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1481xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EcdsaPrivateKey.C02841.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EcdsaPrivateKey, Builder> implements EcdsaPrivateKeyOrBuilder {
        public Builder() {
            super(EcdsaPrivateKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02841 r1) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearVersion();
            return this;
        }

        public C3635j getKeyValue() {
            return ((EcdsaPrivateKey) this.instance).getKeyValue();
        }

        public EcdsaPublicKey getPublicKey() {
            return ((EcdsaPrivateKey) this.instance).getPublicKey();
        }

        public int getVersion() {
            return ((EcdsaPrivateKey) this.instance).getVersion();
        }

        public boolean hasPublicKey() {
            return ((EcdsaPrivateKey) this.instance).hasPublicKey();
        }

        public Builder mergePublicKey(EcdsaPublicKey ecdsaPublicKey) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).mergePublicKey(ecdsaPublicKey);
            return this;
        }

        public Builder setKeyValue(C3635j jVar) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setKeyValue(jVar);
            return this;
        }

        public Builder setPublicKey(com.google.crypto.tink.proto.EcdsaPublicKey.Builder builder) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setPublicKey((EcdsaPublicKey) builder.build());
            return this;
        }

        public Builder setPublicKey(EcdsaPublicKey ecdsaPublicKey) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setPublicKey(ecdsaPublicKey);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        EcdsaPrivateKey ecdsaPrivateKey = new EcdsaPrivateKey();
        DEFAULT_INSTANCE = ecdsaPrivateKey;
        C3731z.registerDefaultInstance(EcdsaPrivateKey.class, ecdsaPrivateKey);
    }

    /* access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static EcdsaPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergePublicKey(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.getClass();
        EcdsaPublicKey ecdsaPublicKey2 = this.publicKey_;
        if (!(ecdsaPublicKey2 == null || ecdsaPublicKey2 == EcdsaPublicKey.getDefaultInstance())) {
            ecdsaPublicKey = (EcdsaPublicKey) ((com.google.crypto.tink.proto.EcdsaPublicKey.Builder) EcdsaPublicKey.newBuilder(this.publicKey_).mergeFrom(ecdsaPublicKey)).buildPartial();
        }
        this.publicKey_ = ecdsaPublicKey;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaPrivateKey ecdsaPrivateKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ecdsaPrivateKey);
    }

    public static EcdsaPrivateKey parseDelimitedFrom(InputStream inputStream) {
        return (EcdsaPrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPrivateKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EcdsaPrivateKey parseFrom(InputStream inputStream) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPrivateKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EcdsaPrivateKey parseFrom(ByteBuffer byteBuffer) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EcdsaPrivateKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EcdsaPrivateKey parseFrom(C3635j jVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EcdsaPrivateKey parseFrom(C3635j jVar, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EcdsaPrivateKey parseFrom(C3656k kVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EcdsaPrivateKey parseFrom(C3656k kVar, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EcdsaPrivateKey parseFrom(byte[] bArr) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaPrivateKey parseFrom(byte[] bArr, C3697r rVar) {
        return (EcdsaPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EcdsaPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setKeyValue(C3635j jVar) {
        jVar.getClass();
        this.keyValue_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setPublicKey(EcdsaPublicKey ecdsaPublicKey) {
        ecdsaPublicKey.getClass();
        this.publicKey_ = ecdsaPublicKey;
    }

    /* access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 3:
                return new EcdsaPrivateKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EcdsaPrivateKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EcdsaPrivateKey.class) {
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

    public C3635j getKeyValue() {
        return this.keyValue_;
    }

    public EcdsaPublicKey getPublicKey() {
        EcdsaPublicKey ecdsaPublicKey = this.publicKey_;
        return ecdsaPublicKey == null ? EcdsaPublicKey.getDefaultInstance() : ecdsaPublicKey;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }
}
