package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3733b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3739z0;

public final class KeyData extends C3731z<KeyData, Builder> implements KeyDataOrBuilder {
    public static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    public static volatile C3739z0<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int keyMaterialType_;
    public String typeUrl_ = Objects.EMPTY_STRING;
    public C3635j value_ = C3635j.f9034f;

    /* renamed from: com.google.crypto.tink.proto.KeyData$1 */
    public static /* synthetic */ class C03061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1504xa1df5c61;

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
                f1504xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1504xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KeyData.C03061.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<KeyData, Builder> implements KeyDataOrBuilder {
        public Builder() {
            super(KeyData.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03061 r1) {
            this();
        }

        public Builder clearKeyMaterialType() {
            copyOnWrite();
            ((KeyData) this.instance).clearKeyMaterialType();
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((KeyData) this.instance).clearTypeUrl();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((KeyData) this.instance).clearValue();
            return this;
        }

        public KeyMaterialType getKeyMaterialType() {
            return ((KeyData) this.instance).getKeyMaterialType();
        }

        public int getKeyMaterialTypeValue() {
            return ((KeyData) this.instance).getKeyMaterialTypeValue();
        }

        public String getTypeUrl() {
            return ((KeyData) this.instance).getTypeUrl();
        }

        public C3635j getTypeUrlBytes() {
            return ((KeyData) this.instance).getTypeUrlBytes();
        }

        public C3635j getValue() {
            return ((KeyData) this.instance).getValue();
        }

        public Builder setKeyMaterialType(KeyMaterialType keyMaterialType) {
            copyOnWrite();
            ((KeyData) this.instance).setKeyMaterialType(keyMaterialType);
            return this;
        }

        public Builder setKeyMaterialTypeValue(int i) {
            copyOnWrite();
            ((KeyData) this.instance).setKeyMaterialTypeValue(i);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((KeyData) this.instance).setTypeUrl(str);
            return this;
        }

        public Builder setTypeUrlBytes(C3635j jVar) {
            copyOnWrite();
            ((KeyData) this.instance).setTypeUrlBytes(jVar);
            return this;
        }

        public Builder setValue(C3635j jVar) {
            copyOnWrite();
            ((KeyData) this.instance).setValue(jVar);
            return this;
        }
    }

    public enum KeyMaterialType implements C3597c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        public static final C3598d<KeyMaterialType> internalValueMap = null;
        public final int value;

        public static final class KeyMaterialTypeVerifier implements C3599e {
            public static final C3599e INSTANCE = null;

            static {
                INSTANCE = new KeyMaterialTypeVerifier();
            }

            public boolean isInRange(int i) {
                return KeyMaterialType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C3598d<KeyMaterialType>() {
                public KeyMaterialType findValueByNumber(int i) {
                    return KeyMaterialType.forNumber(i);
                }
            };
        }

        /* access modifiers changed from: public */
        KeyMaterialType(int i) {
            this.value = i;
        }

        public static KeyMaterialType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static C3598d<KeyMaterialType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C3599e internalGetVerifier() {
            return KeyMaterialTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static KeyMaterialType valueOf(int i) {
            return forNumber(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        C3731z.registerDefaultInstance(KeyData.class, keyData);
    }

    /* access modifiers changed from: private */
    public void clearKeyMaterialType() {
        this.keyMaterialType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static KeyData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeyData keyData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyData);
    }

    public static KeyData parseDelimitedFrom(InputStream inputStream) {
        return (KeyData) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyData parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (KeyData) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyData parseFrom(InputStream inputStream) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyData parseFrom(InputStream inputStream, C3697r rVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyData parseFrom(ByteBuffer byteBuffer) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeyData parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static KeyData parseFrom(C3635j jVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static KeyData parseFrom(C3635j jVar, C3697r rVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static KeyData parseFrom(C3656k kVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static KeyData parseFrom(C3656k kVar, C3697r rVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static KeyData parseFrom(byte[] bArr) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyData parseFrom(byte[] bArr, C3697r rVar) {
        return (KeyData) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<KeyData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setKeyMaterialType(KeyMaterialType keyMaterialType) {
        this.keyMaterialType_ = keyMaterialType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setKeyMaterialTypeValue(int i) {
        this.keyMaterialType_ = i;
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
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new KeyData();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<KeyData> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (KeyData.class) {
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

    public KeyMaterialType getKeyMaterialType() {
        KeyMaterialType forNumber = KeyMaterialType.forNumber(this.keyMaterialType_);
        return forNumber == null ? KeyMaterialType.UNRECOGNIZED : forNumber;
    }

    public int getKeyMaterialTypeValue() {
        return this.keyMaterialType_;
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
