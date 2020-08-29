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

public final class EciesAeadDemParams extends C3731z<EciesAeadDemParams, Builder> implements EciesAeadDemParamsOrBuilder {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    public static final EciesAeadDemParams DEFAULT_INSTANCE;
    public static volatile C3739z0<EciesAeadDemParams> PARSER;
    public KeyTemplate aeadDem_;

    /* renamed from: com.google.crypto.tink.proto.EciesAeadDemParams$1 */
    public static /* synthetic */ class C02871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1485xa1df5c61;

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
                f1485xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1485xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EciesAeadDemParams.C02871.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EciesAeadDemParams, Builder> implements EciesAeadDemParamsOrBuilder {
        public Builder() {
            super(EciesAeadDemParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02871 r1) {
            this();
        }

        public Builder clearAeadDem() {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).clearAeadDem();
            return this;
        }

        public KeyTemplate getAeadDem() {
            return ((EciesAeadDemParams) this.instance).getAeadDem();
        }

        public boolean hasAeadDem() {
            return ((EciesAeadDemParams) this.instance).hasAeadDem();
        }

        public Builder mergeAeadDem(KeyTemplate keyTemplate) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).mergeAeadDem(keyTemplate);
            return this;
        }

        public Builder setAeadDem(com.google.crypto.tink.proto.KeyTemplate.Builder builder) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).setAeadDem((KeyTemplate) builder.build());
            return this;
        }

        public Builder setAeadDem(KeyTemplate keyTemplate) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).setAeadDem(keyTemplate);
            return this;
        }
    }

    static {
        EciesAeadDemParams eciesAeadDemParams = new EciesAeadDemParams();
        DEFAULT_INSTANCE = eciesAeadDemParams;
        C3731z.registerDefaultInstance(EciesAeadDemParams.class, eciesAeadDemParams);
    }

    /* access modifiers changed from: private */
    public void clearAeadDem() {
        this.aeadDem_ = null;
    }

    public static EciesAeadDemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeAeadDem(KeyTemplate keyTemplate) {
        keyTemplate.getClass();
        KeyTemplate keyTemplate2 = this.aeadDem_;
        if (!(keyTemplate2 == null || keyTemplate2 == KeyTemplate.getDefaultInstance())) {
            keyTemplate = (KeyTemplate) ((com.google.crypto.tink.proto.KeyTemplate.Builder) KeyTemplate.newBuilder(this.aeadDem_).mergeFrom(keyTemplate)).buildPartial();
        }
        this.aeadDem_ = keyTemplate;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadDemParams eciesAeadDemParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eciesAeadDemParams);
    }

    public static EciesAeadDemParams parseDelimitedFrom(InputStream inputStream) {
        return (EciesAeadDemParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadDemParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadDemParams parseFrom(InputStream inputStream) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadDemParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadDemParams parseFrom(ByteBuffer byteBuffer) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EciesAeadDemParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EciesAeadDemParams parseFrom(C3635j jVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EciesAeadDemParams parseFrom(C3635j jVar, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EciesAeadDemParams parseFrom(C3656k kVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EciesAeadDemParams parseFrom(C3656k kVar, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EciesAeadDemParams parseFrom(byte[] bArr) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadDemParams parseFrom(byte[] bArr, C3697r rVar) {
        return (EciesAeadDemParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EciesAeadDemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAeadDem(KeyTemplate keyTemplate) {
        keyTemplate.getClass();
        this.aeadDem_ = keyTemplate;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"aeadDem_"});
            case 3:
                return new EciesAeadDemParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EciesAeadDemParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EciesAeadDemParams.class) {
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

    public KeyTemplate getAeadDem() {
        KeyTemplate keyTemplate = this.aeadDem_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    public boolean hasAeadDem() {
        return this.aeadDem_ != null;
    }
}
