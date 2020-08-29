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

public final class RsaSsaPkcs1KeyFormat extends C3731z<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
    public static final RsaSsaPkcs1KeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    public static volatile C3739z0<RsaSsaPkcs1KeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    public int modulusSizeInBits_;
    public RsaSsaPkcs1Params params_;
    public C3635j publicExponent_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$1 */
    public static /* synthetic */ class C03191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1514xa1df5c61;

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
                f1514xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1514xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.C03191.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
        public Builder() {
            super(RsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03191 r1) {
            this();
        }

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearModulusSizeInBits();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearParams();
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearPublicExponent();
            return this;
        }

        public int getModulusSizeInBits() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getModulusSizeInBits();
        }

        public RsaSsaPkcs1Params getParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getParams();
        }

        public C3635j getPublicExponent() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getPublicExponent();
        }

        public boolean hasParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).hasParams();
        }

        public Builder mergeParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).mergeParams(rsaSsaPkcs1Params);
            return this;
        }

        public Builder setModulusSizeInBits(int i) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setModulusSizeInBits(i);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.RsaSsaPkcs1Params.Builder builder) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setParams((RsaSsaPkcs1Params) builder.build());
            return this;
        }

        public Builder setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setParams(rsaSsaPkcs1Params);
            return this;
        }

        public Builder setPublicExponent(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setPublicExponent(jVar);
            return this;
        }
    }

    static {
        RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = new RsaSsaPkcs1KeyFormat();
        DEFAULT_INSTANCE = rsaSsaPkcs1KeyFormat;
        C3731z.registerDefaultInstance(RsaSsaPkcs1KeyFormat.class, rsaSsaPkcs1KeyFormat);
    }

    /* access modifiers changed from: private */
    public void clearModulusSizeInBits() {
        this.modulusSizeInBits_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* access modifiers changed from: private */
    public void clearPublicExponent() {
        this.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    public static RsaSsaPkcs1KeyFormat getDefaultInstance() {
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

    public static Builder newBuilder(RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1KeyFormat);
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream inputStream) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(C3635j jVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(C3635j jVar, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(C3656k kVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(C3656k kVar, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] bArr) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] bArr, C3697r rVar) {
        return (RsaSsaPkcs1KeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RsaSsaPkcs1KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setModulusSizeInBits(int i) {
        this.modulusSizeInBits_ = i;
    }

    /* access modifiers changed from: private */
    public void setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1Params.getClass();
        this.params_ = rsaSsaPkcs1Params;
    }

    /* access modifiers changed from: private */
    public void setPublicExponent(C3635j jVar) {
        jVar.getClass();
        this.publicExponent_ = jVar;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"params_", "modulusSizeInBits_", "publicExponent_"});
            case 3:
                return new RsaSsaPkcs1KeyFormat();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RsaSsaPkcs1KeyFormat> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RsaSsaPkcs1KeyFormat.class) {
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

    public int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    public C3635j getPublicExponent() {
        return this.publicExponent_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
