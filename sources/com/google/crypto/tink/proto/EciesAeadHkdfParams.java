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

public final class EciesAeadHkdfParams extends C3731z<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    public static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    public static volatile C3739z0<EciesAeadHkdfParams> PARSER;
    public EciesAeadDemParams demParams_;
    public int ecPointFormat_;
    public EciesHkdfKemParams kemParams_;

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfParams$1 */
    public static /* synthetic */ class C02891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1487xa1df5c61;

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
                f1487xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1487xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.EciesAeadHkdfParams.C02891.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
        public Builder() {
            super(EciesAeadHkdfParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02891 r1) {
            this();
        }

        public Builder clearDemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearDemParams();
            return this;
        }

        public Builder clearEcPointFormat() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearEcPointFormat();
            return this;
        }

        public Builder clearKemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearKemParams();
            return this;
        }

        public EciesAeadDemParams getDemParams() {
            return ((EciesAeadHkdfParams) this.instance).getDemParams();
        }

        public EcPointFormat getEcPointFormat() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormat();
        }

        public int getEcPointFormatValue() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormatValue();
        }

        public EciesHkdfKemParams getKemParams() {
            return ((EciesAeadHkdfParams) this.instance).getKemParams();
        }

        public boolean hasDemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasDemParams();
        }

        public boolean hasKemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasKemParams();
        }

        public Builder mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeDemParams(eciesAeadDemParams);
            return this;
        }

        public Builder mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeKemParams(eciesHkdfKemParams);
            return this;
        }

        public Builder setDemParams(com.google.crypto.tink.proto.EciesAeadDemParams.Builder builder) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams((EciesAeadDemParams) builder.build());
            return this;
        }

        public Builder setDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams(eciesAeadDemParams);
            return this;
        }

        public Builder setEcPointFormat(EcPointFormat ecPointFormat) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormat(ecPointFormat);
            return this;
        }

        public Builder setEcPointFormatValue(int i) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormatValue(i);
            return this;
        }

        public Builder setKemParams(com.google.crypto.tink.proto.EciesHkdfKemParams.Builder builder) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams((EciesHkdfKemParams) builder.build());
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams(eciesHkdfKemParams);
            return this;
        }
    }

    static {
        EciesAeadHkdfParams eciesAeadHkdfParams = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        C3731z.registerDefaultInstance(EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    /* access modifiers changed from: private */
    public void clearDemParams() {
        this.demParams_ = null;
    }

    /* access modifiers changed from: private */
    public void clearEcPointFormat() {
        this.ecPointFormat_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearKemParams() {
        this.kemParams_ = null;
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        EciesAeadDemParams eciesAeadDemParams2 = this.demParams_;
        if (!(eciesAeadDemParams2 == null || eciesAeadDemParams2 == EciesAeadDemParams.getDefaultInstance())) {
            eciesAeadDemParams = (EciesAeadDemParams) ((com.google.crypto.tink.proto.EciesAeadDemParams.Builder) EciesAeadDemParams.newBuilder(this.demParams_).mergeFrom(eciesAeadDemParams)).buildPartial();
        }
        this.demParams_ = eciesAeadDemParams;
    }

    /* access modifiers changed from: private */
    public void mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        EciesHkdfKemParams eciesHkdfKemParams2 = this.kemParams_;
        if (!(eciesHkdfKemParams2 == null || eciesHkdfKemParams2 == EciesHkdfKemParams.getDefaultInstance())) {
            eciesHkdfKemParams = (EciesHkdfKemParams) ((com.google.crypto.tink.proto.EciesHkdfKemParams.Builder) EciesHkdfKemParams.newBuilder(this.kemParams_).mergeFrom(eciesHkdfKemParams)).buildPartial();
        }
        this.kemParams_ = eciesHkdfKemParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfParams eciesAeadHkdfParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfParams);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream) {
        return (EciesAeadHkdfParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static EciesAeadHkdfParams parseFrom(C3635j jVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static EciesAeadHkdfParams parseFrom(C3635j jVar, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static EciesAeadHkdfParams parseFrom(C3656k kVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static EciesAeadHkdfParams parseFrom(C3656k kVar, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr, C3697r rVar) {
        return (EciesAeadHkdfParams) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        this.demParams_ = eciesAeadDemParams;
    }

    /* access modifiers changed from: private */
    public void setEcPointFormat(EcPointFormat ecPointFormat) {
        this.ecPointFormat_ = ecPointFormat.getNumber();
    }

    /* access modifiers changed from: private */
    public void setEcPointFormatValue(int i) {
        this.ecPointFormat_ = i;
    }

    /* access modifiers changed from: private */
    public void setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        this.kemParams_ = eciesHkdfKemParams;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"kemParams_", "demParams_", "ecPointFormat_"});
            case 3:
                return new EciesAeadHkdfParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<EciesAeadHkdfParams> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (EciesAeadHkdfParams.class) {
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

    public EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    public EcPointFormat getEcPointFormat() {
        EcPointFormat forNumber = EcPointFormat.forNumber(this.ecPointFormat_);
        return forNumber == null ? EcPointFormat.UNRECOGNIZED : forNumber;
    }

    public int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    public EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    public boolean hasDemParams() {
        return this.demParams_ != null;
    }

    public boolean hasKemParams() {
        return this.kemParams_ != null;
    }
}
