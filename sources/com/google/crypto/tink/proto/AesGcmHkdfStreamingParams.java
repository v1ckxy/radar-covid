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

public final class AesGcmHkdfStreamingParams extends C3731z<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    public static final AesGcmHkdfStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static volatile C3739z0<AesGcmHkdfStreamingParams> PARSER;
    public int ciphertextSegmentSize_;
    public int derivedKeySize_;
    public int hkdfHashType_;

    /* renamed from: com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$1 */
    public static /* synthetic */ class C02741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1472xa1df5c61;

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
                f1472xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1472xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.C02741.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
        public Builder() {
            super(AesGcmHkdfStreamingParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02741 r1) {
            this();
        }

        public Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearCiphertextSegmentSize();
            return this;
        }

        public Builder clearDerivedKeySize() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearDerivedKeySize();
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearHkdfHashType();
            return this;
        }

        public int getCiphertextSegmentSize() {
            return ((AesGcmHkdfStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        public int getDerivedKeySize() {
            return ((AesGcmHkdfStreamingParams) this.instance).getDerivedKeySize();
        }

        public HashType getHkdfHashType() {
            return ((AesGcmHkdfStreamingParams) this.instance).getHkdfHashType();
        }

        public int getHkdfHashTypeValue() {
            return ((AesGcmHkdfStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        public Builder setCiphertextSegmentSize(int i) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setCiphertextSegmentSize(i);
            return this;
        }

        public Builder setDerivedKeySize(int i) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setDerivedKeySize(i);
            return this;
        }

        public Builder setHkdfHashType(HashType hashType) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setHkdfHashType(hashType);
            return this;
        }

        public Builder setHkdfHashTypeValue(int i) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setHkdfHashTypeValue(i);
            return this;
        }
    }

    static {
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = new AesGcmHkdfStreamingParams();
        DEFAULT_INSTANCE = aesGcmHkdfStreamingParams;
        C3731z.registerDefaultInstance(AesGcmHkdfStreamingParams.class, aesGcmHkdfStreamingParams);
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

    public static AesGcmHkdfStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(aesGcmHkdfStreamingParams);
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream inputStream) {
        return (AesGcmHkdfStreamingParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream inputStream) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer byteBuffer) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(C3635j jVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(C3635j jVar, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(C3656k kVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(C3656k kVar, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] bArr) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] bArr, C3697r rVar) {
        return (AesGcmHkdfStreamingParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<AesGcmHkdfStreamingParams> parser() {
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

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new AesGcmHkdfStreamingParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<AesGcmHkdfStreamingParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (AesGcmHkdfStreamingParams.class) {
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
}
