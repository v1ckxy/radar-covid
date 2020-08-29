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

public final class RsaSsaPkcs1PublicKey extends C3731z<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
    public static final RsaSsaPkcs1PublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    public static volatile C3739z0<RsaSsaPkcs1PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;

    /* renamed from: e_ */
    public C3635j f1520e_;

    /* renamed from: n_ */
    public C3635j f1521n_;
    public RsaSsaPkcs1Params params_;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$1 */
    public static /* synthetic */ class C03221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1522xa1df5c61;

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
                f1522xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1522xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.C03221.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
        public Builder() {
            super(RsaSsaPkcs1PublicKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03221 r1) {
            this();
        }

        public Builder clearE() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearE();
            return this;
        }

        public Builder clearN() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearN();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearVersion();
            return this;
        }

        public C3635j getE() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getE();
        }

        public C3635j getN() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getN();
        }

        public RsaSsaPkcs1Params getParams() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getParams();
        }

        public int getVersion() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getVersion();
        }

        public boolean hasParams() {
            return ((RsaSsaPkcs1PublicKey) this.instance).hasParams();
        }

        public Builder mergeParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).mergeParams(rsaSsaPkcs1Params);
            return this;
        }

        public Builder setE(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setE(jVar);
            return this;
        }

        public Builder setN(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setN(jVar);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.RsaSsaPkcs1Params.Builder builder) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setParams((RsaSsaPkcs1Params) builder.build());
            return this;
        }

        public Builder setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setParams(rsaSsaPkcs1Params);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = new RsaSsaPkcs1PublicKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PublicKey;
        C3731z.registerDefaultInstance(RsaSsaPkcs1PublicKey.class, rsaSsaPkcs1PublicKey);
    }

    public RsaSsaPkcs1PublicKey() {
        C3635j jVar = C3635j.f9034f;
        this.f1521n_ = jVar;
        this.f1520e_ = jVar;
    }

    /* access modifiers changed from: private */
    public void clearE() {
        this.f1520e_ = getDefaultInstance().getE();
    }

    /* access modifiers changed from: private */
    public void clearN() {
        this.f1521n_ = getDefaultInstance().getN();
    }

    /* access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPkcs1PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1Params.getClass();
        RsaSsaPkcs1Params rsaSsaPkcs1Params2 = this.params_;
        if (!(rsaSsaPkcs1Params2 == null || rsaSsaPkcs1Params2 == RsaSsaPkcs1Params.getDefaultInstance())) {
            rsaSsaPkcs1Params = (RsaSsaPkcs1Params) ((com.google.crypto.tink.proto.RsaSsaPkcs1Params.Builder) RsaSsaPkcs1Params.newBuilder(this.params_).mergeFrom(rsaSsaPkcs1Params)).buildPartial();
        }
        this.params_ = rsaSsaPkcs1Params;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1PublicKey);
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(C3635j jVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(C3635j jVar, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(C3656k kVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(C3656k kVar, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] bArr) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] bArr, C3697r rVar) {
        return (RsaSsaPkcs1PublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RsaSsaPkcs1PublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setE(C3635j jVar) {
        jVar.getClass();
        this.f1520e_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setN(C3635j jVar) {
        jVar.getClass();
        this.f1521n_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1Params.getClass();
        this.params_ = rsaSsaPkcs1Params;
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
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "n_", "e_"});
            case 3:
                return new RsaSsaPkcs1PublicKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RsaSsaPkcs1PublicKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RsaSsaPkcs1PublicKey.class) {
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

    public C3635j getE() {
        return this.f1520e_;
    }

    public C3635j getN() {
        return this.f1521n_;
    }

    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
