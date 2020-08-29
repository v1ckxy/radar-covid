package p365r.p368b;

import p390t.p391a.C4547a;

/* renamed from: r.b.a */
public final class C4426a<T> implements C4547a<T> {

    /* renamed from: c */
    public static final Object f10525c = new Object();

    /* renamed from: a */
    public volatile C4547a<T> f10526a;

    /* renamed from: b */
    public volatile Object f10527b = f10525c;

    public C4426a(C4547a<T> aVar) {
        this.f10526a = aVar;
    }

    /* renamed from: a */
    public static Object m10002a(Object obj, Object obj2) {
        if (!(obj != f10525c) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static <P extends C4547a<T>, T> C4547a<T> m10003a(P p) {
        if (p != null) {
            return p instanceof C4426a ? p : new C4426a(p);
        }
        throw null;
    }

    public T get() {
        T t = this.f10527b;
        if (t == f10525c) {
            synchronized (this) {
                t = this.f10527b;
                if (t == f10525c) {
                    t = this.f10526a.get();
                    m10002a(this.f10527b, t);
                    this.f10527b = t;
                    this.f10526a = null;
                }
            }
        }
        return t;
    }
}
