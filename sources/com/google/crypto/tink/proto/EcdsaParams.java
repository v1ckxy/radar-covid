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

public final class EcdsaParams extends C3731z<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
    public static final int CURVE_FIELD_NUMBER = 2;
    public static final EcdsaParams DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    public static volatile C3739z0<EcdsaParams> PARSER;
    public int curve_;
    public int encoding_;
    public int hashType_;

    /* renamed from: com.google.crypto.tink.proto.EcdsaParams$1 */
    public static /* synthetic */ class C02831 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1480xa1df5c61;

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
                f1480xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1480xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EcdsaParams.C02831.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
        public Builder() {
            super(EcdsaParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02831 r1) {
            this();
        }

        public Builder clearCurve() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearCurve();
            return this;
        }

        public Builder clearEncoding() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearEncoding();
            return this;
        }

        public Builder clearHashType() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearHashType();
            return this;
        }

        public EllipticCurveType getCurve() {
            return ((EcdsaParams) this.instance).getCurve();
        }

        public int getCurveValue() {
            return ((EcdsaParams) this.instance).getCurveValue();
        }

        public EcdsaSignatureEncoding getEncoding() {
            return ((EcdsaParams) this.instance).getEncoding();
        }

        public int getEncodingValue() {
            return ((EcdsaParams) this.instance).getEncodingValue();
        }

        public HashType getHashType() {
            return ((EcdsaParams) this.instance).getHashType();
        }

        public int getHashTypeValue() {
            return ((EcdsaParams) this.instance).getHashTypeValue();
        }

        public Builder setCurve(EllipticCurveType ellipticCurveType) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setCurve(ellipticCurveType);
            return this;
        }

        public Builder setCurveValue(int i) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setCurveValue(i);
            return this;
        }

        public Builder setEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setEncoding(ecdsaSignatureEncoding);
            return this;
        }

        public Builder setEncodingValue(int i) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setEncodingValue(i);
            return this;
        }

        public Builder setHashType(HashType hashType) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setHashType(hashType);
            return this;
        }

        public Builder setHashTypeValue(int i) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setHashTypeValue(i);
            return this;
        }
    }

    static {
        EcdsaParams ecdsaParams = new EcdsaParams();
        DEFAULT_INSTANCE = ecdsaParams;
        C3731z.registerDefaultInstance(EcdsaParams.class, ecdsaParams);
    }

    /* access modifiers changed from: private */
    public void clearCurve() {
        this.curve_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearEncoding() {
        this.encoding_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHashType() {
        this.hashType_ = 0;
    }

    public static EcdsaParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaParams ecdsaParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ecdsaParams);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream) {
        return (EcdsaParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EcdsaParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EcdsaParams parseFrom(InputStream inputStream) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EcdsaParams parseFrom(C3635j jVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EcdsaParams parseFrom(C3635j jVar, C3697r rVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EcdsaParams parseFrom(C3656k kVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EcdsaParams parseFrom(C3656k kVar, C3697r rVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EcdsaParams parseFrom(byte[] bArr) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaParams parseFrom(byte[] bArr, C3697r rVar) {
        return (EcdsaParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EcdsaParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCurve(EllipticCurveType ellipticCurveType) {
        this.curve_ = ellipticCurveType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setCurveValue(int i) {
        this.curve_ = i;
    }

    /* access modifiers changed from: private */
    public void setEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) {
        this.encoding_ = ecdsaSignatureEncoding.getNumber();
    }

    /* access modifiers changed from: private */
    public void setEncodingValue(int i) {
        this.encoding_ = i;
    }

    /* access modifiers changed from: private */
    public void setHashType(HashType hashType) {
        this.hashType_ = hashType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setHashTypeValue(int i) {
        this.hashType_ = i;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 3:
                return new EcdsaParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EcdsaParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EcdsaParams.class) {
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

    public EllipticCurveType getCurve() {
        EllipticCurveType forNumber = EllipticCurveType.forNumber(this.curve_);
        return forNumber == null ? EllipticCurveType.UNRECOGNIZED : forNumber;
    }

    public int getCurveValue() {
        return this.curve_;
    }

    public EcdsaSignatureEncoding getEncoding() {
        EcdsaSignatureEncoding forNumber = EcdsaSignatureEncoding.forNumber(this.encoding_);
        return forNumber == null ? EcdsaSignatureEncoding.UNRECOGNIZED : forNumber;
    }

    public int getEncodingValue() {
        return this.encoding_;
    }

    public HashType getHashType() {
        HashType forNumber = HashType.forNumber(this.hashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public int getHashTypeValue() {
        return this.hashType_;
    }
}
