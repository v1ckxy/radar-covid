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

public final class AesCtrHmacStreamingParams extends C3731z<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    public static final AesCtrHmacStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    public static volatile C3739z0<AesCtrHmacStreamingParams> PARSER;
    public int ciphertextSegmentSize_;
    public int derivedKeySize_;
    public int hkdfHashType_;
    public HmacParams hmacParams_;

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacStreamingParams$1 */
    public static /* synthetic */ class C02651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1463xa1df5c61;

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
                f1463xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1463xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.AesCtrHmacStreamingParams.C02651.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
        public Builder() {
            super(AesCtrHmacStreamingParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02651 r1) {
            this();
        }

        public Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearCiphertextSegmentSize();
            return this;
        }

        public Builder clearDerivedKeySize() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearDerivedKeySize();
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearHkdfHashType();
            return this;
        }

        public Builder clearHmacParams() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearHmacParams();
            return this;
        }

        public int getCiphertextSegmentSize() {
            return ((AesCtrHmacStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        public int getDerivedKeySize() {
            return ((AesCtrHmacStreamingParams) this.instance).getDerivedKeySize();
        }

        public HashType getHkdfHashType() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashType();
        }

        public int getHkdfHashTypeValue() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        public HmacParams getHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).getHmacParams();
        }

        public boolean hasHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).hasHmacParams();
        }

        public Builder mergeHmacParams(HmacParams hmacParams) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).mergeHmacParams(hmacParams);
            return this;
        }

        public Builder setCiphertextSegmentSize(int i) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setCiphertextSegmentSize(i);
            return this;
        }

        public Builder setDerivedKeySize(int i) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setDerivedKeySize(i);
            return this;
        }

        public Builder setHkdfHashType(HashType hashType) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHkdfHashType(hashType);
            return this;
        }

        public Builder setHkdfHashTypeValue(int i) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHkdfHashTypeValue(i);
            return this;
        }

        public Builder setHmacParams(com.google.crypto.tink.proto.HmacParams.Builder builder) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHmacParams((HmacParams) builder.build());
            return this;
        }

        public Builder setHmacParams(HmacParams hmacParams) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHmacParams(hmacParams);
            return this;
        }
    }

    static {
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = new AesCtrHmacStreamingParams();
        DEFAULT_INSTANCE = aesCtrHmacStreamingParams;
        C3731z.registerDefaultInstance(AesCtrHmacStreamingParams.class, aesCtrHmacStreamingParams);
    }

    /* access modifiers changed from: private */
    public void clearCiphertextSegmentSize() {
        this.ciphertextSegmentSize_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearDerivedKeySize() {
        this.derivedKeySize_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHmacParams() {
        this.hmacParams_ = null;
    }

    public static AesCtrHmacStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeHmacParams(HmacParams hmacParams) {
        hmacParams.getClass();
        HmacParams hmacParams2 = this.hmacParams_;
        if (!(hmacParams2 == null || hmacParams2 == HmacParams.getDefaultInstance())) {
            hmacParams = (HmacParams) ((com.google.crypto.tink.proto.HmacParams.Builder) HmacParams.newBuilder(this.hmacParams_).mergeFrom(hmacParams)).buildPartial();
        }
        this.hmacParams_ = hmacParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(aesCtrHmacStreamingParams);
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream inputStream) {
        return (AesCtrHmacStreamingParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream inputStream) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer byteBuffer) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(C3635j jVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(C3635j jVar, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(C3656k kVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(C3656k kVar, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] bArr) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] bArr, C3697r rVar) {
        return (AesCtrHmacStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<AesCtrHmacStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCiphertextSegmentSize(int i) {
        this.ciphertextSegmentSize_ = i;
    }

    /* access modifiers changed from: private */
    public void setDerivedKeySize(int i) {
        this.derivedKeySize_ = i;
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
    public void setHmacParams(HmacParams hmacParams) {
        hmacParams.getClass();
        this.hmacParams_ = hmacParams;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 3:
                return new AesCtrHmacStreamingParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<AesCtrHmacStreamingParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (AesCtrHmacStreamingParams.class) {
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

    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    public int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    public HashType getHkdfHashType() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    public HmacParams getHmacParams() {
        HmacParams hmacParams = this.hmacParams_;
        return hmacParams == null ? HmacParams.getDefaultInstance() : hmacParams;
    }

    public boolean hasHmacParams() {
        return this.hmacParams_ != null;
    }
}
