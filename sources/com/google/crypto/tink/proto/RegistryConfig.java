package com.google.crypto.tink.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3656k;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3733b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3739z0;

@Deprecated
public final class RegistryConfig extends C3731z<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    public static final RegistryConfig DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    public static volatile C3739z0<RegistryConfig> PARSER;
    public String configName_ = Objects.EMPTY_STRING;
    public C3603i<KeyTypeEntry> entry_ = C3731z.emptyProtobufList();

    /* renamed from: com.google.crypto.tink.proto.RegistryConfig$1 */
    public static /* synthetic */ class C03181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f1513xa1df5c61;

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
                f1513xa1df5c61 = r0
                r1 = 1
                r2 = 3
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                r3 = 4
                int[] r4 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r4 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.c.a.j0.a.z$g r5 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 5
                int[] r2 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0024 }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r2 = 6
                int[] r3 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                q.b.c.a.j0.a.z$g r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x002b }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0032 }
                q.b.c.a.j0.a.z$g r3 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f1513xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0039 }
                q.b.c.a.j0.a.z$g r2 = p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3738g.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.RegistryConfig.C03181.<clinit>():void");
        }
    }

    public static final class Builder extends C3732a<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
        public Builder() {
            super(RegistryConfig.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(C03181 r1) {
            this();
        }

        public Builder addAllEntry(Iterable<? extends KeyTypeEntry> iterable) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addAllEntry(iterable);
            return this;
        }

        public Builder addEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(i, (KeyTypeEntry) builder.build());
            return this;
        }

        public Builder addEntry(int i, KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(i, keyTypeEntry);
            return this;
        }

        public Builder addEntry(com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry((KeyTypeEntry) builder.build());
            return this;
        }

        public Builder addEntry(KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(keyTypeEntry);
            return this;
        }

        public Builder clearConfigName() {
            copyOnWrite();
            ((RegistryConfig) this.instance).clearConfigName();
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            ((RegistryConfig) this.instance).clearEntry();
            return this;
        }

        public String getConfigName() {
            return ((RegistryConfig) this.instance).getConfigName();
        }

        public C3635j getConfigNameBytes() {
            return ((RegistryConfig) this.instance).getConfigNameBytes();
        }

        public KeyTypeEntry getEntry(int i) {
            return ((RegistryConfig) this.instance).getEntry(i);
        }

        public int getEntryCount() {
            return ((RegistryConfig) this.instance).getEntryCount();
        }

        public List<KeyTypeEntry> getEntryList() {
            return Collections.unmodifiableList(((RegistryConfig) this.instance).getEntryList());
        }

        public Builder removeEntry(int i) {
            copyOnWrite();
            ((RegistryConfig) this.instance).removeEntry(i);
            return this;
        }

        public Builder setConfigName(String str) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setConfigName(str);
            return this;
        }

        public Builder setConfigNameBytes(C3635j jVar) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setConfigNameBytes(jVar);
            return this;
        }

        public Builder setEntry(int i, com.google.crypto.tink.proto.KeyTypeEntry.Builder builder) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setEntry(i, (KeyTypeEntry) builder.build());
            return this;
        }

        public Builder setEntry(int i, KeyTypeEntry keyTypeEntry) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setEntry(i, keyTypeEntry);
            return this;
        }
    }

    static {
        RegistryConfig registryConfig = new RegistryConfig();
        DEFAULT_INSTANCE = registryConfig;
        C3731z.registerDefaultInstance(RegistryConfig.class, registryConfig);
    }

    /* access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends KeyTypeEntry> iterable) {
        ensureEntryIsMutable();
        C3588a.addAll(iterable, (List<? super T>) this.entry_);
    }

    /* access modifiers changed from: private */
    public void addEntry(int i, KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.add(i, keyTypeEntry);
    }

    /* access modifiers changed from: private */
    public void addEntry(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.add(keyTypeEntry);
    }

    /* access modifiers changed from: private */
    public void clearConfigName() {
        this.configName_ = getDefaultInstance().getConfigName();
    }

    /* access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = C3731z.emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        if (!this.entry_.mo9531s()) {
            this.entry_ = C3731z.mutableCopy(this.entry_);
        }
    }

    public static RegistryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RegistryConfig registryConfig) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(registryConfig);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream) {
        return (RegistryConfig) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream, C3697r rVar) {
        return (RegistryConfig) C3731z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RegistryConfig parseFrom(InputStream inputStream) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseFrom(InputStream inputStream, C3697r rVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, inputStream, rVar);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer, C3697r rVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, byteBuffer, rVar);
    }

    public static RegistryConfig parseFrom(C3635j jVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static RegistryConfig parseFrom(C3635j jVar, C3697r rVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, jVar, rVar);
    }

    public static RegistryConfig parseFrom(C3656k kVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static RegistryConfig parseFrom(C3656k kVar, C3697r rVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, kVar, rVar);
    }

    public static RegistryConfig parseFrom(byte[] bArr) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RegistryConfig parseFrom(byte[] bArr, C3697r rVar) {
        return (RegistryConfig) C3731z.parseFrom(DEFAULT_INSTANCE, bArr, rVar);
    }

    public static C3739z0<RegistryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeEntry(int i) {
        ensureEntryIsMutable();
        this.entry_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setConfigName(String str) {
        str.getClass();
        this.configName_ = str;
    }

    /* access modifiers changed from: private */
    public void setConfigNameBytes(C3635j jVar) {
        C3588a.checkByteStringIsUtf8(jVar);
        this.configName_ = jVar.mo9669h();
    }

    /* access modifiers changed from: private */
    public void setEntry(int i, KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.set(i, keyTypeEntry);
    }

    public final Object dynamicMethod(C3738g gVar, Object obj, Object obj2) {
        switch (gVar.ordinal()) {
            case 0:
                return Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                return C3731z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", KeyTypeEntry.class});
            case 3:
                return new RegistryConfig();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C3739z0<RegistryConfig> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (RegistryConfig.class) {
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

    public String getConfigName() {
        return this.configName_;
    }

    public C3635j getConfigNameBytes() {
        return C3635j.m8387a(this.configName_);
    }

    public KeyTypeEntry getEntry(int i) {
        return (KeyTypeEntry) this.entry_.get(i);
    }

    public int getEntryCount() {
        return this.entry_.size();
    }

    public List<KeyTypeEntry> getEntryList() {
        return this.entry_;
    }

    public KeyTypeEntryOrBuilder getEntryOrBuilder(int i) {
        return (KeyTypeEntryOrBuilder) this.entry_.get(i);
    }

    public List<? extends KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }
}
