package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3733b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3739z0;

public final class KmsEnvelopeAeadKeyFormat extends C3731z<KmsEnvelopeAeadKeyFormat, Builder> implements KmsEnvelopeAeadKeyFormatOrBuilder {
    public static final KmsEnvelopeAeadKeyFormat DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    public static volatile C3739z0<KmsEnvelopeAeadKeyFormat> PARSER;
    public KeyTemplate dekTemplate_;
    public String kekUri_ = Objects.EMPTY_STRING;

    /* renamed from: com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$1 */
    public static /* synthetic */ class C03161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1512xa1df5c61;

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
                f1512xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1512xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.C03161.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<KmsEnvelopeAeadKeyFormat, Builder> implements KmsEnvelopeAeadKeyFormatOrBuilder {
        public Builder() {
            super(KmsEnvelopeAeadKeyFormat.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03161 r1) {
            this();
        }

        public Builder clearDekTemplate() {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).clearDekTemplate();
            return this;
        }

        public Builder clearKekUri() {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).clearKekUri();
            return this;
        }

        public KeyTemplate getDekTemplate() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getDekTemplate();
        }

        public String getKekUri() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getKekUri();
        }

        public C3635j getKekUriBytes() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getKekUriBytes();
        }

        public boolean hasDekTemplate() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).hasDekTemplate();
        }

        public Builder mergeDekTemplate(KeyTemplate keyTemplate) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).mergeDekTemplate(keyTemplate);
            return this;
        }

        public Builder setDekTemplate(com.google.crypto.tink.proto.KeyTemplate.Builder builder) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setDekTemplate((KeyTemplate) builder.build());
            return this;
        }

        public Builder setDekTemplate(KeyTemplate keyTemplate) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setDekTemplate(keyTemplate);
            return this;
        }

        public Builder setKekUri(String str) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setKekUri(str);
            return this;
        }

        public Builder setKekUriBytes(C3635j jVar) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setKekUriBytes(jVar);
            return this;
        }
    }

    static {
        KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = new KmsEnvelopeAeadKeyFormat();
        DEFAULT_INSTANCE = kmsEnvelopeAeadKeyFormat;
        C3731z.registerDefaultInstance(KmsEnvelopeAeadKeyFormat.class, kmsEnvelopeAeadKeyFormat);
    }

    /* access modifiers changed from: private */
    public void clearDekTemplate() {
        this.dekTemplate_ = null;
    }

    /* access modifiers changed from: private */
    public void clearKekUri() {
        this.kekUri_ = getDefaultInstance().getKekUri();
    }

    public static KmsEnvelopeAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeDekTemplate(KeyTemplate keyTemplate) {
        keyTemplate.getClass();
        KeyTemplate keyTemplate2 = this.dekTemplate_;
        if (!(keyTemplate2 == null || keyTemplate2 == KeyTemplate.getDefaultInstance())) {
            keyTemplate = (KeyTemplate) ((com.google.crypto.tink.proto.KeyTemplate.Builder) KeyTemplate.newBuilder(this.dekTemplate_).mergeFrom(keyTemplate)).buildPartial();
        }
        this.dekTemplate_ = keyTemplate;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(kmsEnvelopeAeadKeyFormat);
    }

    public static KmsEnvelopeAeadKeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KmsEnvelopeAeadKeyFormat parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(InputStream inputStream) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(InputStream inputStream, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(C3635j jVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(C3635j jVar, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(C3656k kVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(C3656k kVar, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(byte[] bArr) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(byte[] bArr, C3697r rVar) {
        return (KmsEnvelopeAeadKeyFormat) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<KmsEnvelopeAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDekTemplate(KeyTemplate keyTemplate) {
        keyTemplate.getClass();
        this.dekTemplate_ = keyTemplate;
    }

    /* access modifiers changed from: private */
    public void setKekUri(String str) {
        str.getClass();
        this.kekUri_ = str;
    }

    /* access modifiers changed from: private */
    public void setKekUriBytes(C3635j jVar) {
        C3588a.checkByteStringIsUtf8(jVar);
        this.kekUri_ = jVar.mo9669h();
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new KmsEnvelopeAeadKeyFormat();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<KmsEnvelopeAeadKeyFormat> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (KmsEnvelopeAeadKeyFormat.class) {
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

    public KeyTemplate getDekTemplate() {
        KeyTemplate keyTemplate = this.dekTemplate_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    public String getKekUri() {
        return this.kekUri_;
    }

    public C3635j getKekUriBytes() {
        return C3635j.m8387a(this.kekUri_);
    }

    public boolean hasDekTemplate() {
        return this.dekTemplate_ != null;
    }
}
