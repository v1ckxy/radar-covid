package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a.C3589a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a.C3589a.C3590a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3595a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3596b;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3600f;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3601g;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3602h;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0.C3707a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3719v.C3720a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3731z.C3732a;

/* renamed from: q.b.c.a.j0.a.z */
public abstract class C3731z<MessageType extends C3731z<MessageType, BuilderType>, BuilderType extends C3732a<MessageType, BuilderType>> extends C3588a<MessageType, BuilderType> {
    public static Map<Object, C3731z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C3680n1 unknownFields = C3680n1.f9117f;

    /* renamed from: q.b.c.a.j0.a.z$a */
    public static abstract class C3732a<MessageType extends C3731z<MessageType, BuilderType>, BuilderType extends C3732a<MessageType, BuilderType>> extends C3589a<MessageType, BuilderType> {
        public final MessageType defaultInstance;
        public MessageType instance;
        public boolean isBuilt = false;

        public C3732a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (C3731z) messagetype.dynamicMethod(C3738g.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            C3608c1.f8978c.mo9538a(messagetype).mo9644a(messagetype, messagetype2);
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw C3589a.newUninitializedMessageException(buildPartial);
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (C3731z) this.instance.dynamicMethod(C3738g.NEW_MUTABLE_INSTANCE);
            return this;
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (C3731z) this.instance.dynamicMethod(C3738g.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public final boolean isInitialized() {
            return C3731z.isInitialized(this.instance, false);
        }

        public BuilderType mergeFrom(C3656k kVar, C3697r rVar) {
            copyOnWrite();
            try {
                C3625g1 a = C3608c1.f8978c.mo9538a(this.instance);
                MessageType messagetype = this.instance;
                C3666l lVar = kVar.f9069d;
                if (lVar == null) {
                    lVar = new C3666l(kVar);
                }
                a.mo9645a(messagetype, lVar, rVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
            return mergeFrom(bArr, i, i2, C3697r.m8878a());
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C3697r rVar) {
            copyOnWrite();
            try {
                C3608c1.f8978c.mo9538a(this.instance).mo9647a(this.instance, bArr, i, i + i2, new C3612e(rVar));
                return this;
            } catch (C3606c0 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C3606c0.m8181h();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }
    }

    /* renamed from: q.b.c.a.j0.a.z$b */
    public static class C3733b<T extends C3731z<T, ?>> extends C3593b<T> {

        /* renamed from: a */
        public final T f9285a;

        public C3733b(T t) {
            this.f9285a = t;
        }

        /* renamed from: a */
        public Object mo10010a(C3656k kVar, C3697r rVar) {
            return C3731z.parsePartialFrom(this.f9285a, kVar, rVar);
        }
    }

    /* renamed from: q.b.c.a.j0.a.z$c */
    public static abstract class C3734c<MessageType extends C3734c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C3731z<MessageType, BuilderType> implements C3735d<MessageType, BuilderType> {

        /* renamed from: e */
        public C3719v<C3736e> f9286e = C3719v.f9207d;

        /* renamed from: a */
        public C3719v<C3736e> mo10011a() {
            C3719v<C3736e> vVar = this.f9286e;
            if (vVar.f9209b) {
                this.f9286e = vVar.clone();
            }
            return this.f9286e;
        }
    }

    /* renamed from: q.b.c.a.j0.a.z$d */
    public interface C3735d<MessageType extends C3734c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C3710t0 {
    }

    /* renamed from: q.b.c.a.j0.a.z$e */
    public static final class C3736e implements C3720a<C3736e> {

        /* renamed from: e */
        public final C3598d<?> f9287e;

        /* renamed from: f */
        public final int f9288f;

        /* renamed from: g */
        public final C3711t1 f9289g;

        /* renamed from: h */
        public final boolean f9290h;

        /* renamed from: i */
        public final boolean f9291i;

        public C3736e(C3598d<?> dVar, int i, C3711t1 t1Var, boolean z, boolean z2) {
            this.f9287e = dVar;
            this.f9288f = i;
            this.f9289g = t1Var;
            this.f9290h = z;
            this.f9291i = z2;
        }

        /* renamed from: a */
        public C3707a mo9975a(C3707a aVar, C3706s0 s0Var) {
            return ((C3732a) aVar).mergeFrom((C3731z) s0Var);
        }

        public int compareTo(Object obj) {
            return this.f9288f - ((C3736e) obj).f9288f;
        }

        public int getNumber() {
            return this.f9288f;
        }

        /* renamed from: i */
        public boolean mo9977i() {
            return this.f9290h;
        }

        /* renamed from: l */
        public C3711t1 mo9978l() {
            return this.f9289g;
        }

        /* renamed from: p */
        public C3718u1 mo9979p() {
            return this.f9289g.f9173e;
        }

        /* renamed from: r */
        public boolean mo9980r() {
            return this.f9291i;
        }
    }

    /* renamed from: q.b.c.a.j0.a.z$f */
    public static class C3737f<ContainingType extends C3706s0, Type> extends C3684p<ContainingType, Type> {

        /* renamed from: a */
        public final Type f9292a;

        /* renamed from: b */
        public final C3706s0 f9293b;

        /* renamed from: c */
        public final C3736e f9294c;

        public C3737f(C3706s0 s0Var, Object obj, C3706s0 s0Var2, C3736e eVar) {
            if (s0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.f9289g == C3711t1.MESSAGE && s0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f9292a = obj;
                this.f9293b = s0Var2;
                this.f9294c = eVar;
            }
        }
    }

    /* renamed from: q.b.c.a.j0.a.z$g */
    public enum C3738g {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <MessageType extends C3734c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>, T> C3737f<MessageType, T> checkIsLite(C3684p<MessageType, T> pVar) {
        if (pVar != null) {
            return (C3737f) pVar;
        }
        throw null;
    }

    public static <T extends C3731z<T, ?>> T checkMessageInitialized(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        C3669l1 newUninitializedMessageException = t.newUninitializedMessageException();
        if (newUninitializedMessageException != null) {
            throw new C3606c0(newUninitializedMessageException.getMessage());
        }
        throw null;
    }

    public static C3595a emptyBooleanList() {
        return C3623g.f9019h;
    }

    public static C3596b emptyDoubleList() {
        return C3681o.f9123h;
    }

    public static C3600f emptyFloatList() {
        return C3727x.f9279h;
    }

    public static C3601g emptyIntList() {
        return C3591a0.f8969h;
    }

    public static C3602h emptyLongList() {
        return C3645j0.f9042h;
    }

    public static <E> C3603i<E> emptyProtobufList() {
        return C3611d1.f8996h;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C3680n1.f9117f) {
            this.unknownFields = C3680n1.m8772c();
        }
    }

    public static <T extends C3731z<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (C3731z) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C3731z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C3731z) C3691q1.m8806a(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            StringBuilder a = C1965a.m4756a("Generated message class \"");
            a.append(cls.getName());
            a.append("\" missing method \"");
            a.append(str);
            a.append("\".");
            throw new RuntimeException(a.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final <T extends C3731z<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(C3738g.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C3608c1.f8978c.mo9538a(t).mo9648b(t);
        if (z) {
            t.dynamicMethod(C3738g.SET_MEMOIZED_IS_INITIALIZED, b ? t : null);
        }
        return b;
    }

    public static C3595a mutableCopy(C3595a aVar) {
        int size = aVar.size();
        return ((C3623g) aVar).m8299b(size == 0 ? 10 : size * 2);
    }

    public static C3596b mutableCopy(C3596b bVar) {
        int size = bVar.size();
        return ((C3681o) bVar).m8780b(size == 0 ? 10 : size * 2);
    }

    public static C3600f mutableCopy(C3600f fVar) {
        int size = fVar.size();
        return ((C3727x) fVar).m9000b(size == 0 ? 10 : size * 2);
    }

    public static C3601g mutableCopy(C3601g gVar) {
        int size = gVar.size();
        return ((C3591a0) gVar).m8154b(size == 0 ? 10 : size * 2);
    }

    public static C3602h mutableCopy(C3602h hVar) {
        int size = hVar.size();
        return ((C3645j0) hVar).m8425b(size == 0 ? 10 : size * 2);
    }

    public static <E> C3603i<E> mutableCopy(C3603i<E> iVar) {
        int size = iVar.size();
        return iVar.mo9516b(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(C3706s0 s0Var, String str, Object[] objArr) {
        return new C3617e1(s0Var, str, objArr);
    }

    public static <ContainingType extends C3706s0, Type> C3737f<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C3706s0 s0Var, C3598d<?> dVar, int i, C3711t1 t1Var, boolean z, Class cls) {
        List emptyList = Collections.emptyList();
        C3736e eVar = new C3736e(dVar, i, t1Var, true, z);
        return new C3737f<>(containingtype, emptyList, s0Var, eVar);
    }

    public static <ContainingType extends C3706s0, Type> C3737f<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C3706s0 s0Var, C3598d<?> dVar, int i, C3711t1 t1Var, Class cls) {
        C3736e eVar = new C3736e(dVar, i, t1Var, false, false);
        return new C3737f<>(containingtype, type, s0Var, eVar);
    }

    public static <T extends C3731z<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3697r.m8878a()));
    }

    public static <T extends C3731z<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C3697r rVar) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, rVar));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, InputStream inputStream) {
        return checkMessageInitialized(parsePartialFrom(t, C3656k.m8445a(inputStream), C3697r.m8878a()));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, InputStream inputStream, C3697r rVar) {
        return checkMessageInitialized(parsePartialFrom(t, C3656k.m8445a(inputStream), rVar));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return parseFrom(t, byteBuffer, C3697r.m8878a());
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C3697r rVar) {
        return checkMessageInitialized(parseFrom(t, C3656k.m8446a(byteBuffer, false), rVar));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, C3635j jVar) {
        return checkMessageInitialized(parseFrom(t, jVar, C3697r.m8878a()));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, C3635j jVar, C3697r rVar) {
        return checkMessageInitialized(parsePartialFrom(t, jVar, rVar));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, C3656k kVar) {
        return parseFrom(t, kVar, C3697r.m8878a());
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, C3656k kVar, C3697r rVar) {
        return checkMessageInitialized(parsePartialFrom(t, kVar, rVar));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, byte[] bArr) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C3697r.m8878a()));
    }

    public static <T extends C3731z<T, ?>> T parseFrom(T t, byte[] bArr, C3697r rVar) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, rVar));
    }

    public static <T extends C3731z<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C3697r rVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C3656k a = C3656k.m8445a((InputStream) new C3590a(inputStream, C3656k.m8443a(read, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, a, rVar);
            try {
                a.mo9733a(0);
                return parsePartialFrom;
            } catch (C3606c0 e) {
                throw e;
            }
        } catch (IOException e2) {
            throw new C3606c0(e2.getMessage());
        }
    }

    public static <T extends C3731z<T, ?>> T parsePartialFrom(T t, C3635j jVar, C3697r rVar) {
        try {
            C3656k f = jVar.mo9667f();
            T parsePartialFrom = parsePartialFrom(t, f, rVar);
            f.mo9733a(0);
            return parsePartialFrom;
        } catch (C3606c0 e) {
            throw e;
        } catch (C3606c0 e2) {
            throw e2;
        }
    }

    public static <T extends C3731z<T, ?>> T parsePartialFrom(T t, C3656k kVar) {
        return parsePartialFrom(t, kVar, C3697r.m8878a());
    }

    public static <T extends C3731z<T, ?>> T parsePartialFrom(T t, C3656k kVar, C3697r rVar) {
        T t2 = (C3731z) t.dynamicMethod(C3738g.NEW_MUTABLE_INSTANCE);
        try {
            C3625g1 a = C3608c1.f8978c.mo9538a(t2);
            C3666l lVar = kVar.f9069d;
            if (lVar == null) {
                lVar = new C3666l(kVar);
            }
            a.mo9645a(t2, lVar, rVar);
            a.mo9643a(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C3606c0) {
                throw ((C3606c0) e.getCause());
            }
            throw new C3606c0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C3606c0) {
                throw ((C3606c0) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends C3731z<T, ?>> T parsePartialFrom(T t, byte[] bArr, C3697r rVar) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, rVar));
    }

    public static <T extends C3731z<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(C3738g.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends C3731z<MessageType, BuilderType>, BuilderType extends C3732a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C3732a) dynamicMethod(C3738g.NEW_BUILDER);
    }

    public final <MessageType extends C3731z<MessageType, BuilderType>, BuilderType extends C3732a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(C3738g gVar) {
        return dynamicMethod(gVar, null, null);
    }

    public Object dynamicMethod(C3738g gVar, Object obj) {
        return dynamicMethod(gVar, obj, null);
    }

    public abstract Object dynamicMethod(C3738g gVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        return C3608c1.f8978c.mo9538a(this).mo9649b(this, (C3731z) obj);
    }

    public final MessageType getDefaultInstanceForType() {
        return (C3731z) dynamicMethod(C3738g.GET_DEFAULT_INSTANCE);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C3739z0<MessageType> getParserForType() {
        return (C3739z0) dynamicMethod(C3738g.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C3608c1.f8978c.mo9538a(this).mo9650c(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int d = C3608c1.f8978c.mo9538a(this).mo9651d(this);
        this.memoizedHashCode = d;
        return d;
    }

    public final boolean isInitialized() {
        return isInitialized(this, Boolean.TRUE.booleanValue());
    }

    public void makeImmutable() {
        C3608c1.f8978c.mo9538a(this).mo9643a(this);
    }

    public void mergeLengthDelimitedField(int i, C3635j jVar) {
        ensureUnknownFieldsInitialized();
        C3680n1 n1Var = this.unknownFields;
        n1Var.mo9858a();
        if (i != 0) {
            n1Var.mo9859a((i << 3) | 2, (Object) jVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(C3680n1 n1Var) {
        this.unknownFields = C3680n1.m8770a(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C3680n1 n1Var = this.unknownFields;
        n1Var.mo9858a();
        if (i != 0) {
            n1Var.mo9859a((i << 3) | 0, (Object) Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final BuilderType newBuilderForType() {
        return (C3732a) dynamicMethod(C3738g.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i, C3656k kVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo9861a(i, kVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C3732a) dynamicMethod(C3738g.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C2286e.m5248a((C3706s0) this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C3670m mVar) {
        C3625g1 a = C3608c1.f8978c.mo9538a(this);
        C3678n nVar = mVar.f9105a;
        if (nVar == null) {
            nVar = new C3678n(mVar);
        }
        a.mo9646a(this, (C3722v1) nVar);
    }

    public static <T extends C3731z<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C3697r rVar) {
        T t2 = (C3731z) t.dynamicMethod(C3738g.NEW_MUTABLE_INSTANCE);
        try {
            C3625g1 a = C3608c1.f8978c.mo9538a(t2);
            a.mo9647a(t2, bArr, i, i + i2, new C3612e(rVar));
            a.mo9643a(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C3606c0) {
                throw ((C3606c0) e.getCause());
            }
            throw new C3606c0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C3606c0.m8181h();
        }
    }
}
