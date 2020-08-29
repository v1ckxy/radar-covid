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

public final class HmacKey extends C3731z<HmacKey, Builder> implements HmacKeyOrBuilder {
    public static final HmacKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    public static volatile C3739z0<HmacKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public C3635j keyValue_ = C3635j.f9034f;
    public HmacParams params_;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.HmacKey$1 */
    public static /* synthetic */ class C03031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1501xa1df5c61;

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
                f1501xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1501xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.HmacKey.C03031.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<HmacKey, Builder> implements HmacKeyOrBuilder {
        public Builder() {
            super(HmacKey.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03031 r1) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((HmacKey) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HmacKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HmacKey) this.instance).clearVersion();
            return this;
        }

        public C3635j getKeyValue() {
            return ((HmacKey) this.instance).getKeyValue();
        }

        public HmacParams getParams() {
            return ((HmacKey) this.instance).getParams();
        }

        public int getVersion() {
            return ((HmacKey) this.instance).getVersion();
        }

        public boolean hasParams() {
            return ((HmacKey) this.instance).hasParams();
        }

        public Builder mergeParams(HmacParams hmacParams) {
            copyOnWrite();
            ((HmacKey) this.instance).mergeParams(hmacParams);
            return this;
        }

        public Builder setKeyValue(C3635j jVar) {
            copyOnWrite();
            ((HmacKey) this.instance).setKeyValue(jVar);
            return this;
        }

        public Builder setParams(com.google.crypto.tink.proto.HmacParams.Builder builder) {
            copyOnWrite();
            ((HmacKey) this.instance).setParams((HmacParams) builder.build());
            return this;
        }

        public Builder setParams(HmacParams hmacParams) {
            copyOnWrite();
            ((HmacKey) this.instance).setParams(hmacParams);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((HmacKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        HmacKey hmacKey = new HmacKey();
        DEFAULT_INSTANCE = hmacKey;
        C3731z.registerDefaultInstance(HmacKey.class, hmacKey);
    }

    /* access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static HmacKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeParams(HmacParams hmacParams) {
        hmacParams.getClass();
        HmacParams hmacParams2 = this.params_;
        if (!(hmacParams2 == null || hmacParams2 == HmacParams.getDefaultInstance())) {
            hmacParams = (HmacParams) ((com.google.crypto.tink.proto.HmacParams.Builder) HmacParams.newBuilder(this.params_).mergeFrom(hmacParams)).buildPartial();
        }
        this.params_ = hmacParams;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HmacKey hmacKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hmacKey);
    }

    public static HmacKey parseDelimitedFrom(InputStream inputStream) {
        return (HmacKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HmacKey parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (HmacKey) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static HmacKey parseFrom(InputStream inputStream) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HmacKey parseFrom(InputStream inputStream, C3697r rVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static HmacKey parseFrom(ByteBuffer byteBuffer) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HmacKey parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static HmacKey parseFrom(C3635j jVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static HmacKey parseFrom(C3635j jVar, C3697r rVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static HmacKey parseFrom(C3656k kVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static HmacKey parseFrom(C3656k kVar, C3697r rVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static HmacKey parseFrom(byte[] bArr) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HmacKey parseFrom(byte[] bArr, C3697r rVar) {
        return (HmacKey) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<HmacKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setKeyValue(C3635j jVar) {
        jVar.getClass();
        this.keyValue_ = jVar;
    }

    /* access modifiers changed from: private */
    public void setParams(HmacParams hmacParams) {
        hmacParams.getClass();
        this.params_ = hmacParams;
    }

    /* access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new HmacKey();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<HmacKey> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (HmacKey.class) {
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

    public C3635j getKeyValue() {
        return this.keyValue_;
    }

    public HmacParams getParams() {
        HmacParams hmacParams = this.params_;
        return hmacParams == null ? HmacParams.getDefaultInstance() : hmacParams;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }
}
