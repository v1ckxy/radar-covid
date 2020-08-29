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

public final class AesCtrHmacAeadKeyFormat extends C3731z<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    public static final AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    public static volatile C3739z0<AesCtrHmacAeadKeyFormat> PARSER;
    public AesCtrKeyFormat aesCtrKeyFormat_;
    public HmacKeyFormat hmacKeyFormat_;

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$1 */
    public static /* synthetic */ class C02621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1460xa1df5c61;

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
                f1460xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1460xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.C02621.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
        public Builder() {
            super(AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02621 r1) {
            this();
        }

        public Builder clearAesCtrKeyFormat() {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).clearAesCtrKeyFormat();
            return this;
        }

        public Builder clearHmacKeyFormat() {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).clearHmacKeyFormat();
            return this;
        }

        public AesCtrKeyFormat getAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getAesCtrKeyFormat();
        }

        public HmacKeyFormat getHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getHmacKeyFormat();
        }

        public boolean hasAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasAesCtrKeyFormat();
        }

        public boolean hasHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasHmacKeyFormat();
        }

        public Builder mergeAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).mergeAesCtrKeyFormat(aesCtrKeyFormat);
            return this;
        }

        public Builder mergeHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).mergeHmacKeyFormat(hmacKeyFormat);
            return this;
        }

        public Builder setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat.Builder builder) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat((AesCtrKeyFormat) builder.build());
            return this;
        }

        public Builder setAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat(aesCtrKeyFormat);
            return this;
        }

        public Builder setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat.Builder builder) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat((HmacKeyFormat) builder.build());
            return this;
        }

        public Builder setHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat(hmacKeyFormat);
            return this;
        }
    }

    static {
        AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = new AesCtrHmacAeadKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacAeadKeyFormat;
        C3731z.registerDefaultInstance(AesCtrHmacAeadKeyFormat.class, aesCtrHmacAeadKeyFormat);
    }

    /* access modifiers changed from: private */
    public void clearAesCtrKeyFormat() {
        this.aesCtrKeyFormat_ = null;
    }

    /* access modifiers changed from: private */
    public void clearHmacKeyFormat() {
        this.hmacKeyFormat_ = null;
    }

    public static AesCtrHmacAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
        aesCtrKeyFormat.getClass();
        AesCtrKeyFormat aesCtrKeyFormat2 = this.aesCtrKeyFormat_;
        if (!(aesCtrKeyFormat2 == null || aesCtrKeyFormat2 == AesCtrKeyFormat.getDefaultInstance())) {
            aesCtrKeyFormat = (AesCtrKeyFormat) ((com.google.crypto.tink.proto.AesCtrKeyFormat.Builder) AesCtrKeyFormat.newBuilder(this.aesCtrKeyFormat_).mergeFrom(aesCtrKeyFormat)).buildPartial();
        }
        this.aesCtrKeyFormat_ = aesCtrKeyFormat;
    }

    /* access modifiers changed from: private */
    public void mergeHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
        hmacKeyFormat.getClass();
        HmacKeyFormat hmacKeyFormat2 = this.hmacKeyFormat_;
        if (!(hmacKeyFormat2 == null || hmacKeyFormat2 == HmacKeyFormat.getDefaultInstance())) {
            hmacKeyFormat = (HmacKeyFormat) ((com.google.crypto.tink.proto.HmacKeyFormat.Builder) HmacKeyFormat.newBuilder(this.hmacKeyFormat_).mergeFrom(hmacKeyFormat)).buildPartial();
        }
        this.hmacKeyFormat_ = hmacKeyFormat;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(aesCtrHmacAeadKeyFormat);
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream inputStream) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream inputStream, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(C3635j jVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(C3635j jVar, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(C3656k kVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(C3656k kVar, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] bArr, C3697r rVar) {
        return (AesCtrHmacAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<AesCtrHmacAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAesCtrKeyFormat(AesCtrKeyFormat aesCtrKeyFormat) {
        aesCtrKeyFormat.getClass();
        this.aesCtrKeyFormat_ = aesCtrKeyFormat;
    }

    /* access modifiers changed from: private */
    public void setHmacKeyFormat(HmacKeyFormat hmacKeyFormat) {
        hmacKeyFormat.getClass();
        this.hmacKeyFormat_ = hmacKeyFormat;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new AesCtrHmacAeadKeyFormat();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<AesCtrHmacAeadKeyFormat> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (AesCtrHmacAeadKeyFormat.class) {
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

    public AesCtrKeyFormat getAesCtrKeyFormat() {
        AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        return aesCtrKeyFormat == null ? AesCtrKeyFormat.getDefaultInstance() : aesCtrKeyFormat;
    }

    public HmacKeyFormat getHmacKeyFormat() {
        HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        return hmacKeyFormat == null ? HmacKeyFormat.getDefaultInstance() : hmacKeyFormat;
    }

    public boolean hasAesCtrKeyFormat() {
        return this.aesCtrKeyFormat_ != null;
    }

    public boolean hasHmacKeyFormat() {
        return this.hmacKeyFormat_ != null;
    }
}
