package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;

/* renamed from: q.b.a.b.g.e.i6 */
public abstract class C2490i6<MessageType extends C2490i6<MessageType, BuilderType>, BuilderType extends C2491a<MessageType, BuilderType>> extends C2730w4<MessageType, BuilderType> {
    public static Map<Object, C2490i6<?, ?>> zzd = new ConcurrentHashMap();
    public C2685t8 zzb = C2685t8.f6893f;
    public int zzc = -1;

    /* renamed from: q.b.a.b.g.e.i6$a */
    public static abstract class C2491a<MessageType extends C2490i6<MessageType, BuilderType>, BuilderType extends C2491a<MessageType, BuilderType>> extends C2714v4<MessageType, BuilderType> {

        /* renamed from: e */
        public final MessageType f6617e;

        /* renamed from: f */
        public MessageType f6618f;

        /* renamed from: g */
        public boolean f6619g = false;

        public C2491a(MessageType messagetype) {
            this.f6617e = messagetype;
            this.f6618f = (C2490i6) messagetype.mo7350a(4, (Object) null, (Object) null);
        }

        /* renamed from: a */
        public final BuilderType mo7773a(MessageType messagetype) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            MessageType messagetype2 = this.f6618f;
            C2386c8.f6416c.mo7488a(messagetype2).mo7683b(messagetype2, messagetype);
            return this;
        }

        /* renamed from: b */
        public final boolean mo7763b() {
            return C2490i6.m5947a(this.f6618f, false);
        }

        /* renamed from: c */
        public final /* synthetic */ C2619p7 mo7764c() {
            return this.f6617e;
        }

        public /* synthetic */ Object clone() {
            C2491a aVar = (C2491a) this.f6617e.mo7350a(5, (Object) null, (Object) null);
            aVar.mo7773a((C2490i6) mo7777l());
            return aVar;
        }

        /* renamed from: k */
        public void mo7776k() {
            MessageType messagetype = (C2490i6) this.f6618f.mo7350a(4, (Object) null, (Object) null);
            C2386c8.f6416c.mo7488a(messagetype).mo7683b(messagetype, this.f6618f);
            this.f6618f = messagetype;
        }

        /* renamed from: l */
        public /* synthetic */ C2619p7 mo7777l() {
            if (!this.f6619g) {
                MessageType messagetype = this.f6618f;
                C2386c8.f6416c.mo7488a(messagetype).mo7685c(messagetype);
                this.f6619g = true;
            }
            return this.f6618f;
        }

        /* renamed from: m */
        public /* synthetic */ C2619p7 mo7778m() {
            C2490i6 i6Var = (C2490i6) mo7777l();
            if (i6Var.mo7763b()) {
                return i6Var;
            }
            throw new C2669s8();
        }

        /* renamed from: a */
        public final C2491a mo7774a(byte[] bArr, int i, C2698u5 u5Var) {
            if (this.f6619g) {
                mo7776k();
                this.f6619g = false;
            }
            try {
                C2386c8.f6416c.mo7488a(this.f6618f).mo7681a(this.f6618f, bArr, 0, i + 0, new C2362b5(u5Var));
                return this;
            } catch (C2618p6 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C2618p6.m6290a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }
    }

    /* renamed from: q.b.a.b.g.e.i6$b */
    public static abstract class C2492b<MessageType extends C2492b<MessageType, BuilderType>, BuilderType> extends C2490i6<MessageType, BuilderType> implements C2652r7 {
        public C2746x5<C2495e> zzc = C2746x5.f6957d;

        /* renamed from: a */
        public final C2746x5<C2495e> mo7779a() {
            C2746x5<C2495e> x5Var = this.zzc;
            if (x5Var.f6959b) {
                this.zzc = (C2746x5) x5Var.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: q.b.a.b.g.e.i6$c */
    public static class C2493c<T extends C2490i6<T, ?>> extends C2745x4<T> {
        public C2493c(T t) {
        }
    }

    /* renamed from: q.b.a.b.g.e.i6$d */
    public static class C2494d<ContainingType extends C2619p7, Type> extends C2666s5<ContainingType, Type> {
    }

    /* renamed from: q.b.a.b.g.e.i6$e */
    public static final class C2495e implements C2778z5<C2495e> {
        /* renamed from: a */
        public final int mo7780a() {
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final C2668s7 mo7781a(C2668s7 s7Var, C2619p7 p7Var) {
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final C2733w7 mo7782a(C2733w7 w7Var, C2733w7 w7Var2) {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        public final C2476h9 mo7783b() {
            throw new NoSuchMethodError();
        }

        /* renamed from: c */
        public final C2601o9 mo7784c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        /* renamed from: d */
        public final boolean mo7786d() {
            throw new NoSuchMethodError();
        }

        /* renamed from: e */
        public final boolean mo7787e() {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: q.b.a.b.g.e.i6$f */
    public static final class C2496f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6620a = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: a */
        public static int[] m5972a() {
            return (int[]) f6620a.clone();
        }
    }

    /* renamed from: a */
    public static Object m5943a(Method method, Object obj, Object... objArr) {
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

    /* renamed from: a */
    public static <T extends C2490i6<?, ?>> T m5944a(Class<T> cls) {
        T t = (C2490i6) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2490i6) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C2490i6) ((C2490i6) C2366b9.m5480a(cls)).mo7350a(6, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    public static C2581n6 m5945a(C2581n6 n6Var) {
        int size = n6Var.size();
        return ((C2402d7) n6Var).mo7414a(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    public static <E> C2635q6<E> m5946a(C2635q6<E> q6Var) {
        int size = q6Var.size();
        return q6Var.mo7414a(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    public abstract Object mo7350a(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final void mo7762a(C2615p5 p5Var) {
        C2455g8 a = C2386c8.f6416c.mo7488a(this);
        C2650r5 r5Var = p5Var.f6801a;
        if (r5Var == null) {
            r5Var = new C2650r5(p5Var);
        }
        a.mo7680a(this, (C2584n9) r5Var);
    }

    /* renamed from: b */
    public final boolean mo7763b() {
        return m5947a(this, Boolean.TRUE.booleanValue());
    }

    /* renamed from: c */
    public final /* synthetic */ C2619p7 mo7764c() {
        return (C2490i6) mo7350a(6, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final int mo7765d() {
        if (this.zzc == -1) {
            this.zzc = C2386c8.f6416c.mo7488a(this).mo7686d(this);
        }
        return this.zzc;
    }

    /* renamed from: e */
    public final /* synthetic */ C2668s7 mo7766e() {
        C2491a aVar = (C2491a) mo7350a(5, (Object) null, (Object) null);
        aVar.mo7773a(this);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2386c8.f6416c.mo7488a(this).mo7682a(this, (C2490i6) obj);
        }
        return false;
    }

    /* renamed from: g */
    public final <MessageType extends C2490i6<MessageType, BuilderType>, BuilderType extends C2491a<MessageType, BuilderType>> BuilderType mo7768g() {
        return (C2491a) mo7350a(5, (Object) null, (Object) null);
    }

    /* renamed from: h */
    public final BuilderType mo7769h() {
        BuilderType buildertype = (C2491a) mo7350a(5, (Object) null, (Object) null);
        buildertype.mo7773a(this);
        return buildertype;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = C2386c8.f6416c.mo7488a(this).mo7678a(this);
        this.zza = a;
        return a;
    }

    /* renamed from: j */
    public final /* synthetic */ C2668s7 mo7771j() {
        return (C2491a) mo7350a(5, (Object) null, (Object) null);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C2286e.m5244a((C2619p7) this, sb, 0);
        return sb.toString();
    }

    /* renamed from: a */
    public static final <T extends C2490i6<T, ?>> boolean m5947a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo7350a(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C2386c8.f6416c.mo7488a(t).mo7684b(t);
        if (z) {
            t.mo7350a(2, (Object) b ? t : null, (Object) null);
        }
        return b;
    }
}
