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

public final class RsaSsaPkcs1PrivateKey extends C3731z<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    public static final RsaSsaPkcs1PrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    public static volatile C3739z0<RsaSsaPkcs1PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    public C3635j crt_;

    /* renamed from: d_ */
    public C3635j f1516d_;
    public C3635j dp_;
    public C3635j dq_;

    /* renamed from: p_ */
    public C3635j f1517p_;
    public RsaSsaPkcs1PublicKey publicKey_;

    /* renamed from: q_ */
    public C3635j f1518q_;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey$1 */
    public static /* synthetic */ class C03211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1519xa1df5c61;

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
                f1519xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1519xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.C03211.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
        public Builder() {
            super(RsaSsaPkcs1PrivateKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03211 r1) {
            this();
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearCrt();
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearD();
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDp();
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDq();
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearP();
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearPublicKey();
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearQ();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearVersion();
            return this;
        }

        public C3635j getCrt() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getCrt();
        }

        public C3635j getD() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getD();
        }

        public C3635j getDp() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDp();
        }

        public C3635j getDq() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDq();
        }

        public C3635j getP() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getP();
        }

        public RsaSsaPkcs1PublicKey getPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getPublicKey();
        }

        public C3635j getQ() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getQ();
        }

        public int getVersion() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getVersion();
        }

        public boolean hasPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).hasPublicKey();
        }

        public Builder mergePublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).mergePublicKey(rsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setCrt(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setCrt(jVar);
            return this;
        }

        public Builder setD(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setD(jVar);
            return this;
        }

        public Builder setDp(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDp(jVar);
            return this;
        }

        public Builder setDq(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDq(jVar);
            return this;
        }

        public Builder setP(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setP(jVar);
            return this;
        }

        public Builder setPublicKey(com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.Builder builder) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey((RsaSsaPkcs1PublicKey) builder.build());
            return this;
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(rsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setQ(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setQ(jVar);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = new RsaSsaPkcs1PrivateKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PrivateKey;
        C3731z.registerDefaultInstance(RsaSsaPkcs1PrivateKey.class, rsaSsaPkcs1PrivateKey);
    }

    public RsaSsaPkcs1PrivateKey() {
        C3635j jVar = C3635j.f9034f;
        this.f1516d_ = jVar;
        this.f1517p_ = jVar;
        this.f1518q_ = jVar;
        this.dp_ = jVar;
        this.dq_ = jVar;
        this.crt_ = jVar;
    }

    /* access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    /* access modifiers changed from: private */
    public void clearD() {
        this.f1516d_ = getDefaultInstance().getD();
    }

    /* access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    /* access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    /* access modifiers changed from: private */
    public void clearP() {
        this.f1517p_ = getDefaultInstance().getP();
    }

    /* access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* access modifiers changed from: private */
    public void clearQ() {
        this.f1518q_ = getDefaultInstance().getQ();
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPkcs1PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        rsaSsaPkcs1PublicKey.getClass();
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey2 = this.publicKey_;
        if (!(rsaSsaPkcs1PublicKey2 == null || rsaSsaPkcs1PublicKey2 == RsaSsaPkcs1PublicKey.getDefaultInstance())) {
            rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) ((com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.Builder) RsaSsaPkcs1PublicKey.newBuilder(this.publicKey_).mergeFrom(rsaSsaPkcs1PublicKey)).buildPartial();
        }
        this.publicKey_ = rsaSsaPkcs1PublicKey;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1PrivateKey);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(C3635j jVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(C3635j jVar, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(C3656k kVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(C3656k kVar, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] bArr) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] bArr, C3697r rVar) {
        return (RsaSsaPkcs1PrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RsaSsaPkcs1PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCrt(C3635j jVar) {
        jVar.getClass();
        this.crt_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setD(C3635j jVar) {
        jVar.getClass();
        this.f1516d_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setDp(C3635j jVar) {
        jVar.getClass();
        this.dp_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setDq(C3635j jVar) {
        jVar.getClass();
        this.dq_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setP(C3635j jVar) {
        jVar.getClass();
        this.f1517p_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setPublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        rsaSsaPkcs1PublicKey.getClass();
        this.publicKey_ = rsaSsaPkcs1PublicKey;
    }

    /* access modifiers changed from: private */
    public void setQ(C3635j jVar) {
        jVar.getClass();
        this.f1518q_ = jVar;
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
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 3:
                return new RsaSsaPkcs1PrivateKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RsaSsaPkcs1PrivateKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RsaSsaPkcs1PrivateKey.class) {
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

    public C3635j getCrt() {
        return this.crt_;
    }

    public C3635j getD() {
        return this.f1516d_;
    }

    public C3635j getDp() {
        return this.dp_;
    }

    public C3635j getDq() {
        return this.dq_;
    }

    public C3635j getP() {
        return this.f1517p_;
    }

    public RsaSsaPkcs1PublicKey getPublicKey() {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        return rsaSsaPkcs1PublicKey == null ? RsaSsaPkcs1PublicKey.getDefaultInstance() : rsaSsaPkcs1PublicKey;
    }

    public C3635j getQ() {
        return this.f1518q_;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }
}
