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

public final class RsaSsaPssKeyFormat extends C3731z<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
    public static final RsaSsaPssKeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    public static volatile C3739z0<RsaSsaPssKeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    public int modulusSizeInBits_;
    public RsaSsaPssParams params_;
    public C3635j publicExponent_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssKeyFormat$1 */
    public static /* synthetic */ class C03231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1523xa1df5c61;

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
                f1523xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1523xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RsaSsaPssKeyFormat.C03231.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
        public Builder() {
            super(RsaSsaPssKeyFormat.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03231 r1) {
            this();
        }

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearModulusSizeInBits();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearParams();
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearPublicExponent();
            return this;
        }

        public int getModulusSizeInBits() {
            return ((RsaSsaPssKeyFormat) this.instance).getModulusSizeInBits();
        }

        public RsaSsaPssParams getParams() {
            return ((RsaSsaPssKeyFormat) this.instance).getParams();
        }

        public C3635j getPublicExponent() {
            return ((RsaSsaPssKeyFormat) this.instance).getPublicExponent();
        }

        public boolean hasParams() {
            return ((RsaSsaPssKeyFormat) this.instance).hasParams();
        }

        public Builder mergeParams(RsaSsaPssParams rsaSsaPssParams) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).mergeParams(rsaSsaPssParams);
            return this;
        }

        public Builder setModulusSizeInBits(int i) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setModulusSizeInBits(i);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.RsaSsaPssParams.Builder builder) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setParams((RsaSsaPssParams) builder.build());
            return this;
        }

        public Builder setParams(RsaSsaPssParams rsaSsaPssParams) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setParams(rsaSsaPssParams);
            return this;
        }

        public Builder setPublicExponent(C3635j jVar) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setPublicExponent(jVar);
            return this;
        }
    }

    static {
        RsaSsaPssKeyFormat rsaSsaPssKeyFormat = new RsaSsaPssKeyFormat();
        DEFAULT_INSTANCE = rsaSsaPssKeyFormat;
        C3731z.registerDefaultInstance(RsaSsaPssKeyFormat.class, rsaSsaPssKeyFormat);
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

    public static RsaSsaPssKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeParams(RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssParams.getClass();
        RsaSsaPssParams rsaSsaPssParams2 = this.params_;
        if (!(rsaSsaPssParams2 == null || rsaSsaPssParams2 == RsaSsaPssParams.getDefaultInstance())) {
            rsaSsaPssParams = (RsaSsaPssParams) ((com.google.crypto.tink.proto.RsaSsaPssParams.Builder) RsaSsaPssParams.newBuilder(this.params_).mergeFrom(rsaSsaPssParams)).buildPartial();
        }
        this.params_ = rsaSsaPssParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPssKeyFormat rsaSsaPssKeyFormat) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rsaSsaPssKeyFormat);
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPssKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream inputStream) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream inputStream, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(C3635j jVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(C3635j jVar, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(C3656k kVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(C3656k kVar, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] bArr) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] bArr, C3697r rVar) {
        return (RsaSsaPssKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RsaSsaPssKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setModulusSizeInBits(int i) {
        this.modulusSizeInBits_ = i;
    }

    /* access modifiers changed from: private */
    public void setParams(RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssParams.getClass();
        this.params_ = rsaSsaPssParams;
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
                return new RsaSsaPssKeyFormat();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RsaSsaPssKeyFormat> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RsaSsaPssKeyFormat.class) {
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

    public RsaSsaPssParams getParams() {
        RsaSsaPssParams rsaSsaPssParams = this.params_;
        return rsaSsaPssParams == null ? RsaSsaPssParams.getDefaultInstance() : rsaSsaPssParams;
    }

    public C3635j getPublicExponent() {
        return this.publicExponent_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
