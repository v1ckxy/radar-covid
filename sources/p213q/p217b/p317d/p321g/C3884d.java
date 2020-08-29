package p213q.p217b.p317d.p321g;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.d.g.d */
public final class C3884d<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f9500a;

    /* renamed from: b */
    public final Set<C3899q> f9501b;

    /* renamed from: c */
    public final int f9502c;

    /* renamed from: d */
    public final int f9503d;

    /* renamed from: e */
    public final C3890h<T> f9504e;

    /* renamed from: f */
    public final Set<Class<?>> f9505f;

    /* renamed from: q.b.d.g.d$b */
    public static class C3886b<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f9506a = new HashSet();

        /* renamed from: b */
        public final Set<C3899q> f9507b = new HashSet();

        /* renamed from: c */
        public int f9508c;

        /* renamed from: d */
        public int f9509d;

        /* renamed from: e */
        public C3890h<T> f9510e;

        /* renamed from: f */
        public Set<Class<?>> f9511f;

        public /* synthetic */ C3886b(Class cls, Class[] clsArr, C3885a aVar) {
            this.f9508c = 0;
            this.f9509d = 0;
            this.f9511f = new HashSet();
            String str = "Null interface";
            C2286e.m5181a(cls, str);
            this.f9506a.add(cls);
            for (Class a : clsArr) {
                C2286e.m5181a(a, str);
            }
            Collections.addAll(this.f9506a, clsArr);
        }

        /* renamed from: a */
        public C3886b<T> mo10080a(C3890h<T> hVar) {
            C2286e.m5181a(hVar, "Null factory");
            this.f9510e = hVar;
            return this;
        }

        /* renamed from: a */
        public C3886b<T> mo10081a(C3899q qVar) {
            C2286e.m5181a(qVar, "Null dependency");
            if (!this.f9506a.contains(qVar.f9527a)) {
                this.f9507b.add(qVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: a */
        public C3884d<T> mo10082a() {
            if (this.f9510e != null) {
                C3884d dVar = new C3884d(new HashSet(this.f9506a), new HashSet(this.f9507b), this.f9508c, this.f9509d, this.f9510e, this.f9511f, null);
                return dVar;
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: a */
        public final C3886b<T> mo10079a(int i) {
            if (this.f9508c == 0) {
                this.f9508c = i;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public /* synthetic */ C3884d(Set set, Set set2, int i, int i2, C3890h hVar, Set set3, C3885a aVar) {
        this.f9500a = Collections.unmodifiableSet(set);
        this.f9501b = Collections.unmodifiableSet(set2);
        this.f9502c = i;
        this.f9503d = i2;
        this.f9504e = hVar;
        this.f9505f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C3886b<T> m9271a(Class<T> cls) {
        return new C3886b<>(cls, new Class[0], null);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C3884d<T> m9272a(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        String str = "Null interface";
        C2286e.m5181a(cls, str);
        hashSet.add(cls);
        for (Class<? super T> a : clsArr) {
            C2286e.m5181a(a, str);
        }
        Collections.addAll(hashSet, clsArr);
        C3882b bVar = new C3882b(t);
        C2286e.m5181a(bVar, "Null factory");
        if (1 != 0) {
            C3884d dVar = new C3884d(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, bVar, hashSet3, null);
            return dVar;
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* renamed from: a */
    public boolean mo10077a() {
        return this.f9503d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f9500a.toArray()));
        sb.append(">{");
        sb.append(this.f9502c);
        sb.append(", type=");
        sb.append(this.f9503d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f9501b.toArray()));
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }
}
