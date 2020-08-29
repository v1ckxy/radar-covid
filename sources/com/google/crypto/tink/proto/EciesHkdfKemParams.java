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

public final class EciesHkdfKemParams extends C3731z<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    public static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    public static volatile C3739z0<EciesHkdfKemParams> PARSER;
    public int curveType_;
    public int hkdfHashType_;
    public C3635j hkdfSalt_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.EciesHkdfKemParams$1 */
    public static /* synthetic */ class C02921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1492xa1df5c61;

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
                f1492xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1492xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EciesHkdfKemParams.C02921.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
        public Builder() {
            super(EciesHkdfKemParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02921 r1) {
            this();
        }

        public Builder clearCurveType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearCurveType();
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfHashType();
            return this;
        }

        public Builder clearHkdfSalt() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfSalt();
            return this;
        }

        public EllipticCurveType getCurveType() {
            return ((EciesHkdfKemParams) this.instance).getCurveType();
        }

        public int getCurveTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getCurveTypeValue();
        }

        public HashType getHkdfHashType() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashType();
        }

        public int getHkdfHashTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashTypeValue();
        }

        public C3635j getHkdfSalt() {
            return ((EciesHkdfKemParams) this.instance).getHkdfSalt();
        }

        public Builder setCurveType(EllipticCurveType ellipticCurveType) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveType(ellipticCurveType);
            return this;
        }

        public Builder setCurveTypeValue(int i) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveTypeValue(i);
            return this;
        }

        public Builder setHkdfHashType(HashType hashType) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashType(hashType);
            return this;
        }

        public Builder setHkdfHashTypeValue(int i) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashTypeValue(i);
            return this;
        }

        public Builder setHkdfSalt(C3635j jVar) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfSalt(jVar);
            return this;
        }
    }

    static {
        EciesHkdfKemParams eciesHkdfKemParams = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = eciesHkdfKemParams;
        C3731z.registerDefaultInstance(EciesHkdfKemParams.class, eciesHkdfKemParams);
    }

    /* access modifiers changed from: private */
    public void clearCurveType() {
        this.curveType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHkdfSalt() {
        this.hkdfSalt_ = getDefaultInstance().getHkdfSalt();
    }

    public static EciesHkdfKemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesHkdfKemParams eciesHkdfKemParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eciesHkdfKemParams);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream) {
        return (EciesHkdfKemParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EciesHkdfKemParams parseFrom(C3635j jVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EciesHkdfKemParams parseFrom(C3635j jVar, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EciesHkdfKemParams parseFrom(C3656k kVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EciesHkdfKemParams parseFrom(C3656k kVar, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr, C3697r rVar) {
        return (EciesHkdfKemParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EciesHkdfKemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCurveType(EllipticCurveType ellipticCurveType) {
        this.curveType_ = ellipticCurveType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setCurveTypeValue(int i) {
        this.curveType_ = i;
    }

    /* access modifiers changed from: private */
    public void setHkdfHashType(HashType hashType) {
        this.hkdfHashType_ = hashType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setHkdfHashTypeValue(int i) {
        this.hkdfHashType_ = i;
    }

    /* access modifiers changed from: private */
    public void setHkdfSalt(C3635j jVar) {
        jVar.getClass();
        this.hkdfSalt_ = jVar;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 3:
                return new EciesHkdfKemParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EciesHkdfKemParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EciesHkdfKemParams.class) {
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

    public EllipticCurveType getCurveType() {
        EllipticCurveType forNumber = EllipticCurveType.forNumber(this.curveType_);
        return forNumber == null ? EllipticCurveType.UNRECOGNIZED : forNumber;
    }

    public int getCurveTypeValue() {
        return this.curveType_;
    }

    public HashType getHkdfHashType() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    public C3635j getHkdfSalt() {
        return this.hkdfSalt_;
    }
}
