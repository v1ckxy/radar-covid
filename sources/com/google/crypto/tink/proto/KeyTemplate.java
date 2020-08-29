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

public final class KeyTemplate extends C3731z<KeyTemplate, Builder> implements KeyTemplateOrBuilder {
    public static final KeyTemplate DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    public static volatile C3739z0<KeyTemplate> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int outputPrefixType_;
    public String typeUrl_ = Objects.EMPTY_STRING;
    public C3635j value_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.KeyTemplate$1 */
    public static /* synthetic */ class C03091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1505xa1df5c61;

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
                f1505xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1505xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KeyTemplate.C03091.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<KeyTemplate, Builder> implements KeyTemplateOrBuilder {
        public Builder() {
            super(KeyTemplate.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03091 r1) {
            this();
        }

        public Builder clearOutputPrefixType() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearOutputPrefixType();
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearTypeUrl();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearValue();
            return this;
        }

        public OutputPrefixType getOutputPrefixType() {
            return ((KeyTemplate) this.instance).getOutputPrefixType();
        }

        public int getOutputPrefixTypeValue() {
            return ((KeyTemplate) this.instance).getOutputPrefixTypeValue();
        }

        public String getTypeUrl() {
            return ((KeyTemplate) this.instance).getTypeUrl();
        }

        public C3635j getTypeUrlBytes() {
            return ((KeyTemplate) this.instance).getTypeUrlBytes();
        }

        public C3635j getValue() {
            return ((KeyTemplate) this.instance).getValue();
        }

        public Builder setOutputPrefixType(OutputPrefixType outputPrefixType) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setOutputPrefixType(outputPrefixType);
            return this;
        }

        public Builder setOutputPrefixTypeValue(int i) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setOutputPrefixTypeValue(i);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setTypeUrl(str);
            return this;
        }

        public Builder setTypeUrlBytes(C3635j jVar) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setTypeUrlBytes(jVar);
            return this;
        }

        public Builder setValue(C3635j jVar) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setValue(jVar);
            return this;
        }
    }

    static {
        KeyTemplate keyTemplate = new KeyTemplate();
        DEFAULT_INSTANCE = keyTemplate;
        C3731z.registerDefaultInstance(KeyTemplate.class, keyTemplate);
    }

    /* access modifiers changed from: private */
    public void clearOutputPrefixType() {
        this.outputPrefixType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static KeyTemplate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeyTemplate keyTemplate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyTemplate);
    }

    public static KeyTemplate parseDelimitedFrom(InputStream inputStream) {
        return (KeyTemplate) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTemplate parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (KeyTemplate) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyTemplate parseFrom(InputStream inputStream) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTemplate parseFrom(InputStream inputStream, C3697r rVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyTemplate parseFrom(ByteBuffer byteBuffer) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeyTemplate parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static KeyTemplate parseFrom(C3635j jVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static KeyTemplate parseFrom(C3635j jVar, C3697r rVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static KeyTemplate parseFrom(C3656k kVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static KeyTemplate parseFrom(C3656k kVar, C3697r rVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static KeyTemplate parseFrom(byte[] bArr) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyTemplate parseFrom(byte[] bArr, C3697r rVar) {
        return (KeyTemplate) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<KeyTemplate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setOutputPrefixType(OutputPrefixType outputPrefixType) {
        this.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setOutputPrefixTypeValue(int i) {
        this.outputPrefixType_ = i;
    }

    /* access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setTypeUrlBytes(C3635j jVar) {
        C3588a.checkByteStringIsUtf8(jVar);
        this.typeUrl_ = jVar.mo9669h();
    }

    /* access modifiers changed from: private */
    public void setValue(C3635j jVar) {
        jVar.getClass();
        this.value_ = jVar;
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new KeyTemplate();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<KeyTemplate> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (KeyTemplate.class) {
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

    public OutputPrefixType getOutputPrefixType() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
    }

    public int getOutputPrefixTypeValue() {
        return this.outputPrefixType_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public C3635j getTypeUrlBytes() {
        return C3635j.m8387a(this.typeUrl_);
    }

    public C3635j getValue() {
        return this.value_;
    }
}
