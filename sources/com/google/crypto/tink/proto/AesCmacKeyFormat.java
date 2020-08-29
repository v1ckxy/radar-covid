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

public final class AesCmacKeyFormat extends C3731z<AesCmacKeyFormat, Builder> implements AesCmacKeyFormatOrBuilder {
    public static final AesCmacKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    public static volatile C3739z0<AesCmacKeyFormat> PARSER;
    public int keySize_;
    public AesCmacParams params_;

    /* renamed from: com.google.crypto.tink.proto.AesCmacKeyFormat$1 */
    public static /* synthetic */ class C02591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1457xa1df5c61;

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
                f1457xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1457xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.AesCmacKeyFormat.C02591.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<AesCmacKeyFormat, Builder> implements AesCmacKeyFormatOrBuilder {
        public Builder() {
            super(AesCmacKeyFormat.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02591 r1) {
            this();
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).clearKeySize();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).clearParams();
            return this;
        }

        public int getKeySize() {
            return ((AesCmacKeyFormat) this.instance).getKeySize();
        }

        public AesCmacParams getParams() {
            return ((AesCmacKeyFormat) this.instance).getParams();
        }

        public boolean hasParams() {
            return ((AesCmacKeyFormat) this.instance).hasParams();
        }

        public Builder mergeParams(AesCmacParams aesCmacParams) {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).mergeParams(aesCmacParams);
            return this;
        }

        public Builder setKeySize(int i) {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).setKeySize(i);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.AesCmacParams.Builder builder) {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).setParams((AesCmacParams) builder.build());
            return this;
        }

        public Builder setParams(AesCmacParams aesCmacParams) {
            copyOnWrite();
            ((AesCmacKeyFormat) this.instance).setParams(aesCmacParams);
            return this;
        }
    }

    static {
        AesCmacKeyFormat aesCmacKeyFormat = new AesCmacKeyFormat();
        DEFAULT_INSTANCE = aesCmacKeyFormat;
        C3731z.registerDefaultInstance(AesCmacKeyFormat.class, aesCmacKeyFormat);
    }

    /* access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    public static AesCmacKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeParams(AesCmacParams aesCmacParams) {
        aesCmacParams.getClass();
        AesCmacParams aesCmacParams2 = this.params_;
        if (!(aesCmacParams2 == null || aesCmacParams2 == AesCmacParams.getDefaultInstance())) {
            aesCmacParams = (AesCmacParams) ((com.google.crypto.tink.proto.AesCmacParams.Builder) AesCmacParams.newBuilder(this.params_).mergeFrom(aesCmacParams)).buildPartial();
        }
        this.params_ = aesCmacParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCmacKeyFormat aesCmacKeyFormat) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(aesCmacKeyFormat);
    }

    public static AesCmacKeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (AesCmacKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCmacKeyFormat parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCmacKeyFormat parseFrom(InputStream inputStream) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCmacKeyFormat parseFrom(InputStream inputStream, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCmacKeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesCmacKeyFormat parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static AesCmacKeyFormat parseFrom(C3635j jVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AesCmacKeyFormat parseFrom(C3635j jVar, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static AesCmacKeyFormat parseFrom(C3656k kVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static AesCmacKeyFormat parseFrom(C3656k kVar, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static AesCmacKeyFormat parseFrom(byte[] bArr) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCmacKeyFormat parseFrom(byte[] bArr, C3697r rVar) {
        return (AesCmacKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<AesCmacKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setKeySize(int i) {
        this.keySize_ = i;
    }

    /* access modifiers changed from: private */
    public void setParams(AesCmacParams aesCmacParams) {
        aesCmacParams.getClass();
        this.params_ = aesCmacParams;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new AesCmacKeyFormat();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<AesCmacKeyFormat> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (AesCmacKeyFormat.class) {
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

    public int getKeySize() {
        return this.keySize_;
    }

    public AesCmacParams getParams() {
        AesCmacParams aesCmacParams = this.params_;
        return aesCmacParams == null ? AesCmacParams.getDefaultInstance() : aesCmacParams;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
