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

public final class HkdfPrfParams extends C3731z<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
    public static final HkdfPrfParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    public static volatile C3739z0<HkdfPrfParams> PARSER = null;
    public static final int SALT_FIELD_NUMBER = 2;
    public int hash_;
    public C3635j salt_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.HkdfPrfParams$1 */
    public static /* synthetic */ class C03021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1500xa1df5c61;

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
                f1500xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1500xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.HkdfPrfParams.C03021.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
        public Builder() {
            super(HkdfPrfParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03021 r1) {
            this();
        }

        public Builder clearHash() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearHash();
            return this;
        }

        public Builder clearSalt() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearSalt();
            return this;
        }

        public HashType getHash() {
            return ((HkdfPrfParams) this.instance).getHash();
        }

        public int getHashValue() {
            return ((HkdfPrfParams) this.instance).getHashValue();
        }

        public C3635j getSalt() {
            return ((HkdfPrfParams) this.instance).getSalt();
        }

        public Builder setHash(HashType hashType) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHash(hashType);
            return this;
        }

        public Builder setHashValue(int i) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHashValue(i);
            return this;
        }

        public Builder setSalt(C3635j jVar) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setSalt(jVar);
            return this;
        }
    }

    static {
        HkdfPrfParams hkdfPrfParams = new HkdfPrfParams();
        DEFAULT_INSTANCE = hkdfPrfParams;
        C3731z.registerDefaultInstance(HkdfPrfParams.class, hkdfPrfParams);
    }

    /* access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSalt() {
        this.salt_ = getDefaultInstance().getSalt();
    }

    public static HkdfPrfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HkdfPrfParams hkdfPrfParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hkdfPrfParams);
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream inputStream) {
        return (HkdfPrfParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static HkdfPrfParams parseFrom(InputStream inputStream) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static HkdfPrfParams parseFrom(ByteBuffer byteBuffer) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HkdfPrfParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static HkdfPrfParams parseFrom(C3635j jVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static HkdfPrfParams parseFrom(C3635j jVar, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static HkdfPrfParams parseFrom(C3656k kVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static HkdfPrfParams parseFrom(C3656k kVar, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static HkdfPrfParams parseFrom(byte[] bArr) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HkdfPrfParams parseFrom(byte[] bArr, C3697r rVar) {
        return (HkdfPrfParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<HkdfPrfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setHash(HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setHashValue(int i) {
        this.hash_ = i;
    }

    /* access modifiers changed from: private */
    public void setSalt(C3635j jVar) {
        jVar.getClass();
        this.salt_ = jVar;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"hash_", "salt_"});
            case 3:
                return new HkdfPrfParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<HkdfPrfParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (HkdfPrfParams.class) {
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

    public HashType getHash() {
        HashType forNumber = HashType.forNumber(this.hash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    public int getHashValue() {
        return this.hash_;
    }

    public C3635j getSalt() {
        return this.salt_;
    }
}
