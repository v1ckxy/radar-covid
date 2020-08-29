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

public final class ChaCha20Poly1305Key extends C3731z<ChaCha20Poly1305Key, Builder> implements ChaCha20Poly1305KeyOrBuilder {
    public static final ChaCha20Poly1305Key DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static volatile C3739z0<ChaCha20Poly1305Key> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public C3635j keyValue_ = C3635j.f9034f;
    public int version_;

    /* renamed from: com.google.crypto.tink.proto.ChaCha20Poly1305Key$1 */
    public static /* synthetic */ class C02791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1477xa1df5c61;

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
                f1477xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1477xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.ChaCha20Poly1305Key.C02791.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<ChaCha20Poly1305Key, Builder> implements ChaCha20Poly1305KeyOrBuilder {
        public Builder() {
            super(ChaCha20Poly1305Key.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C02791 r1) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((ChaCha20Poly1305Key) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((ChaCha20Poly1305Key) this.instance).clearVersion();
            return this;
        }

        public C3635j getKeyValue() {
            return ((ChaCha20Poly1305Key) this.instance).getKeyValue();
        }

        public int getVersion() {
            return ((ChaCha20Poly1305Key) this.instance).getVersion();
        }

        public Builder setKeyValue(C3635j jVar) {
            copyOnWrite();
            ((ChaCha20Poly1305Key) this.instance).setKeyValue(jVar);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((ChaCha20Poly1305Key) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        ChaCha20Poly1305Key chaCha20Poly1305Key = new ChaCha20Poly1305Key();
        DEFAULT_INSTANCE = chaCha20Poly1305Key;
        C3731z.registerDefaultInstance(ChaCha20Poly1305Key.class, chaCha20Poly1305Key);
    }

    /* access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static ChaCha20Poly1305Key getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ChaCha20Poly1305Key chaCha20Poly1305Key) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chaCha20Poly1305Key);
    }

    public static ChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream) {
        return (ChaCha20Poly1305Key) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static ChaCha20Poly1305Key parseFrom(InputStream inputStream) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChaCha20Poly1305Key parseFrom(InputStream inputStream, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static ChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static ChaCha20Poly1305Key parseFrom(C3635j jVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static ChaCha20Poly1305Key parseFrom(C3635j jVar, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static ChaCha20Poly1305Key parseFrom(C3656k kVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static ChaCha20Poly1305Key parseFrom(C3656k kVar, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static ChaCha20Poly1305Key parseFrom(byte[] bArr) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChaCha20Poly1305Key parseFrom(byte[] bArr, C3697r rVar) {
        return (ChaCha20Poly1305Key) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<ChaCha20Poly1305Key> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setKeyValue(C3635j jVar) {
        jVar.getClass();
        this.keyValue_ = jVar;
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
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new ChaCha20Poly1305Key();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<ChaCha20Poly1305Key> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (ChaCha20Poly1305Key.class) {
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

    public int getVersion() {
        return this.version_;
    }
}
