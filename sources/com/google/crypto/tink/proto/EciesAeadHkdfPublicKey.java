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

public final class EciesAeadHkdfPublicKey extends C3731z<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
    public static final EciesAeadHkdfPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    public static volatile C3739z0<EciesAeadHkdfPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    public EciesAeadHkdfParams params_;
    public int version_;

    /* renamed from: x_ */
    public C3635j f1489x_;

    /* renamed from: y_ */
    public C3635j f1490y_;

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$1 */
    public static /* synthetic */ class C02911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1491xa1df5c61;

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
                f1491xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1491xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.C02911.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
        public Builder() {
            super(EciesAeadHkdfPublicKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02911 r1) {
            this();
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearVersion();
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearY();
            return this;
        }

        public EciesAeadHkdfParams getParams() {
            return ((EciesAeadHkdfPublicKey) this.instance).getParams();
        }

        public int getVersion() {
            return ((EciesAeadHkdfPublicKey) this.instance).getVersion();
        }

        public C3635j getX() {
            return ((EciesAeadHkdfPublicKey) this.instance).getX();
        }

        public C3635j getY() {
            return ((EciesAeadHkdfPublicKey) this.instance).getY();
        }

        public boolean hasParams() {
            return ((EciesAeadHkdfPublicKey) this.instance).hasParams();
        }

        public Builder mergeParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).mergeParams(eciesAeadHkdfParams);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder builder) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setParams((EciesAeadHkdfParams) builder.build());
            return this;
        }

        public Builder setParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setParams(eciesAeadHkdfParams);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setVersion(i);
            return this;
        }

        public Builder setX(C3635j jVar) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setX(jVar);
            return this;
        }

        public Builder setY(C3635j jVar) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setY(jVar);
            return this;
        }
    }

    static {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = new EciesAeadHkdfPublicKey();
        DEFAULT_INSTANCE = eciesAeadHkdfPublicKey;
        C3731z.registerDefaultInstance(EciesAeadHkdfPublicKey.class, eciesAeadHkdfPublicKey);
    }

    public EciesAeadHkdfPublicKey() {
        C3635j jVar = C3635j.f9034f;
        this.f1489x_ = jVar;
        this.f1490y_ = jVar;
    }

    /* access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearX() {
        this.f1489x_ = getDefaultInstance().getX();
    }

    /* access modifiers changed from: private */
    public void clearY() {
        this.f1490y_ = getDefaultInstance().getY();
    }

    public static EciesAeadHkdfPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.getClass();
        EciesAeadHkdfParams eciesAeadHkdfParams2 = this.params_;
        if (!(eciesAeadHkdfParams2 == null || eciesAeadHkdfParams2 == EciesAeadHkdfParams.getDefaultInstance())) {
            eciesAeadHkdfParams = (EciesAeadHkdfParams) ((com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder) EciesAeadHkdfParams.newBuilder(this.params_).mergeFrom(eciesAeadHkdfParams)).buildPartial();
        }
        this.params_ = eciesAeadHkdfParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfPublicKey);
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream inputStream) {
        return (EciesAeadHkdfPublicKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream inputStream) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer byteBuffer) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(C3635j jVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(C3635j jVar, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(C3656k kVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(C3656k kVar, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] bArr) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] bArr, C3697r rVar) {
        return (EciesAeadHkdfPublicKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EciesAeadHkdfPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.getClass();
        this.params_ = eciesAeadHkdfParams;
    }

    /* access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* access modifiers changed from: private */
    public void setX(C3635j jVar) {
        jVar.getClass();
        this.f1489x_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setY(C3635j jVar) {
        jVar.getClass();
        this.f1490y_ = jVar;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 3:
                return new EciesAeadHkdfPublicKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EciesAeadHkdfPublicKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EciesAeadHkdfPublicKey.class) {
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

    public EciesAeadHkdfParams getParams() {
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        return eciesAeadHkdfParams == null ? EciesAeadHkdfParams.getDefaultInstance() : eciesAeadHkdfParams;
    }

    public int getVersion() {
        return this.version_;
    }

    public C3635j getX() {
        return this.f1489x_;
    }

    public C3635j getY() {
        return this.f1490y_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
