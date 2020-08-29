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

@Deprecated
public final class KeyTypeEntry extends C3731z<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    public static final KeyTypeEntry DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    public static volatile C3739z0<KeyTypeEntry> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    public String catalogueName_;
    public int keyManagerVersion_;
    public boolean newKeyAllowed_;
    public String primitiveName_;
    public String typeUrl_;

    /* renamed from: com.google.crypto.tink.proto.KeyTypeEntry$1 */
    public static /* synthetic */ class C03101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1506xa1df5c61;

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
                f1506xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1506xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KeyTypeEntry.C03101.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
        public Builder() {
            super(KeyTypeEntry.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03101 r1) {
            this();
        }

        public Builder clearCatalogueName() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearCatalogueName();
            return this;
        }

        public Builder clearKeyManagerVersion() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearKeyManagerVersion();
            return this;
        }

        public Builder clearNewKeyAllowed() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearNewKeyAllowed();
            return this;
        }

        public Builder clearPrimitiveName() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearPrimitiveName();
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearTypeUrl();
            return this;
        }

        public String getCatalogueName() {
            return ((KeyTypeEntry) this.instance).getCatalogueName();
        }

        public C3635j getCatalogueNameBytes() {
            return ((KeyTypeEntry) this.instance).getCatalogueNameBytes();
        }

        public int getKeyManagerVersion() {
            return ((KeyTypeEntry) this.instance).getKeyManagerVersion();
        }

        public boolean getNewKeyAllowed() {
            return ((KeyTypeEntry) this.instance).getNewKeyAllowed();
        }

        public String getPrimitiveName() {
            return ((KeyTypeEntry) this.instance).getPrimitiveName();
        }

        public C3635j getPrimitiveNameBytes() {
            return ((KeyTypeEntry) this.instance).getPrimitiveNameBytes();
        }

        public String getTypeUrl() {
            return ((KeyTypeEntry) this.instance).getTypeUrl();
        }

        public C3635j getTypeUrlBytes() {
            return ((KeyTypeEntry) this.instance).getTypeUrlBytes();
        }

        public Builder setCatalogueName(String str) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setCatalogueName(str);
            return this;
        }

        public Builder setCatalogueNameBytes(C3635j jVar) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setCatalogueNameBytes(jVar);
            return this;
        }

        public Builder setKeyManagerVersion(int i) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setKeyManagerVersion(i);
            return this;
        }

        public Builder setNewKeyAllowed(boolean z) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setNewKeyAllowed(z);
            return this;
        }

        public Builder setPrimitiveName(String str) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setPrimitiveName(str);
            return this;
        }

        public Builder setPrimitiveNameBytes(C3635j jVar) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setPrimitiveNameBytes(jVar);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setTypeUrl(str);
            return this;
        }

        public Builder setTypeUrlBytes(C3635j jVar) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setTypeUrlBytes(jVar);
            return this;
        }
    }

    static {
        KeyTypeEntry keyTypeEntry = new KeyTypeEntry();
        DEFAULT_INSTANCE = keyTypeEntry;
        C3731z.registerDefaultInstance(KeyTypeEntry.class, keyTypeEntry);
    }

    public KeyTypeEntry() {
        String str = Objects.EMPTY_STRING;
        this.primitiveName_ = str;
        this.typeUrl_ = str;
        this.catalogueName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearCatalogueName() {
        this.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    /* access modifiers changed from: private */
    public void clearKeyManagerVersion() {
        this.keyManagerVersion_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNewKeyAllowed() {
        this.newKeyAllowed_ = false;
    }

    /* access modifiers changed from: private */
    public void clearPrimitiveName() {
        this.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    /* access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static KeyTypeEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeyTypeEntry keyTypeEntry) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyTypeEntry);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream) {
        return (KeyTypeEntry) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static KeyTypeEntry parseFrom(C3635j jVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static KeyTypeEntry parseFrom(C3635j jVar, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static KeyTypeEntry parseFrom(C3656k kVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static KeyTypeEntry parseFrom(C3656k kVar, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr, C3697r rVar) {
        return (KeyTypeEntry) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<KeyTypeEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCatalogueName(String str) {
        str.getClass();
        this.catalogueName_ = str;
    }

    /* access modifiers changed from: private */
    public void setCatalogueNameBytes(C3635j jVar) {
        C3588a.checkByteStringIsUtf8(jVar);
        this.catalogueName_ = jVar.mo9669h();
    }

    /* access modifiers changed from: private */
    public void setKeyManagerVersion(int i) {
        this.keyManagerVersion_ = i;
    }

    /* access modifiers changed from: private */
    public void setNewKeyAllowed(boolean z) {
        this.newKeyAllowed_ = z;
    }

    /* access modifiers changed from: private */
    public void setPrimitiveName(String str) {
        str.getClass();
        this.primitiveName_ = str;
    }

    /* access modifiers changed from: private */
    public void setPrimitiveNameBytes(C3635j jVar) {
        C3588a.checkByteStringIsUtf8(jVar);
        this.primitiveName_ = jVar.mo9669h();
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

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new KeyTypeEntry();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<KeyTypeEntry> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (KeyTypeEntry.class) {
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

    public String getCatalogueName() {
        return this.catalogueName_;
    }

    public C3635j getCatalogueNameBytes() {
        return C3635j.m8387a(this.catalogueName_);
    }

    public int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    public boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    public String getPrimitiveName() {
        return this.primitiveName_;
    }

    public C3635j getPrimitiveNameBytes() {
        return C3635j.m8387a(this.primitiveName_);
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public C3635j getTypeUrlBytes() {
        return C3635j.m8387a(this.typeUrl_);
    }
}
