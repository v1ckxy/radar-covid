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

public final class RsaSsaPssPrivateKey extends C3731z<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    public static final RsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    public static volatile C3739z0<RsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    public C3635j crt_;

    /* renamed from: d_ */
    public C3635j f1525d_;
    public C3635j dp_;
    public C3635j dq_;

    /* renamed from: p_ */
    public C3635j f1526p_;
    public RsaSsaPssPublicKey publicKey_;

    /* renamed from: q_ */
    public C3635j f1527q_;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssPrivateKey$1 */
    public static /* synthetic */ class C03251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1528xa1df5c61;

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
                f1528xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1528xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RsaSsaPssPrivateKey.C03251.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
        public Builder() {
            super(RsaSsaPssPrivateKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03251 r1) {
            this();
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearCrt();
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearD();
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearDp();
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearDq();
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearP();
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearQ();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).clearVersion();
            return this;
        }

        public C3635j getCrt() {
            return ((RsaSsaPssPrivateKey) this.instance).getCrt();
        }

        public C3635j getD() {
            return ((RsaSsaPssPrivateKey) this.instance).getD();
        }

        public C3635j getDp() {
            return ((RsaSsaPssPrivateKey) this.instance).getDp();
        }

        public C3635j getDq() {
            return ((RsaSsaPssPrivateKey) this.instance).getDq();
        }

        public C3635j getP() {
            return ((RsaSsaPssPrivateKey) this.instance).getP();
        }

        public RsaSsaPssPublicKey getPublicKey() {
            return ((RsaSsaPssPrivateKey) this.instance).getPublicKey();
        }

        public C3635j getQ() {
            return ((RsaSsaPssPrivateKey) this.instance).getQ();
        }

        public int getVersion() {
            return ((RsaSsaPssPrivateKey) this.instance).getVersion();
        }

        public boolean hasPublicKey() {
            return ((RsaSsaPssPrivateKey) this.instance).hasPublicKey();
        }

        public Builder mergePublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).mergePublicKey(rsaSsaPssPublicKey);
            return this;
        }

        public Builder setCrt(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setCrt(jVar);
            return this;
        }

        public Builder setD(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setD(jVar);
            return this;
        }

        public Builder setDp(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setDp(jVar);
            return this;
        }

        public Builder setDq(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setDq(jVar);
            return this;
        }

        public Builder setP(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setP(jVar);
            return this;
        }

        public Builder setPublicKey(com.google.crypto.tink.proto.RsaSsaPssPublicKey.Builder builder) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setPublicKey((RsaSsaPssPublicKey) builder.build());
            return this;
        }

        public Builder setPublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setPublicKey(rsaSsaPssPublicKey);
            return this;
        }

        public Builder setQ(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setQ(jVar);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((RsaSsaPssPrivateKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        RsaSsaPssPrivateKey rsaSsaPssPrivateKey = new RsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = rsaSsaPssPrivateKey;
        C3731z.registerDefaultInstance(RsaSsaPssPrivateKey.class, rsaSsaPssPrivateKey);
    }

    public RsaSsaPssPrivateKey() {
        C3635j jVar = C3635j.f9034f;
        this.f1525d_ = jVar;
        this.f1526p_ = jVar;
        this.f1527q_ = jVar;
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
        this.f1525d_ = getDefaultInstance().getD();
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
        this.f1526p_ = getDefaultInstance().getP();
    }

    /* access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* access modifiers changed from: private */
    public void clearQ() {
        this.f1527q_ = getDefaultInstance().getQ();
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        RsaSsaPssPublicKey rsaSsaPssPublicKey2 = this.publicKey_;
        if (!(rsaSsaPssPublicKey2 == null || rsaSsaPssPublicKey2 == RsaSsaPssPublicKey.getDefaultInstance())) {
            rsaSsaPssPublicKey = (RsaSsaPssPublicKey) ((com.google.crypto.tink.proto.RsaSsaPssPublicKey.Builder) RsaSsaPssPublicKey.newBuilder(this.publicKey_).mergeFrom(rsaSsaPssPublicKey)).buildPartial();
        }
        this.publicKey_ = rsaSsaPssPublicKey;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rsaSsaPssPrivateKey);
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPssPrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(C3635j jVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(C3635j jVar, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(C3656k kVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(C3656k kVar, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr, C3697r rVar) {
        return (RsaSsaPssPrivateKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RsaSsaPssPrivateKey> parser() {
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
        this.f1525d_ = jVar;
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
        this.f1526p_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setPublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        this.publicKey_ = rsaSsaPssPublicKey;
    }

    /* access modifiers changed from: private */
    public void setQ(C3635j jVar) {
        jVar.getClass();
        this.f1527q_ = jVar;
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
                return new RsaSsaPssPrivateKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RsaSsaPssPrivateKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RsaSsaPssPrivateKey.class) {
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
        return this.f1525d_;
    }

    public C3635j getDp() {
        return this.dp_;
    }

    public C3635j getDq() {
        return this.dq_;
    }

    public C3635j getP() {
        return this.f1526p_;
    }

    public RsaSsaPssPublicKey getPublicKey() {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = this.publicKey_;
        return rsaSsaPssPublicKey == null ? RsaSsaPssPublicKey.getDefaultInstance() : rsaSsaPssPublicKey;
    }

    public C3635j getQ() {
        return this.f1527q_;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }
}
