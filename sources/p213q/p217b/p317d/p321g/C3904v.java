package p213q.p217b.p317d.p321g;

import p213q.p217b.p317d.p349m.C4274a;

/* renamed from: q.b.d.g.v */
public class C3904v<T> implements C4274a<T> {

    /* renamed from: c */
    public static final Object f9535c = new Object();

    /* renamed from: a */
    public volatile Object f9536a = f9535c;

    /* renamed from: b */
    public volatile C4274a<T> f9537b;

    public C3904v(C4274a<T> aVar) {
        this.f9537b = aVar;
    }

    public T get() {
        T t = this.f9536a;
        if (t == f9535c) {
            synchronized (this) {
                t = this.f9536a;
                if (t == f9535c) {
                    t = this.f9537b.get();
                    this.f9536a = t;
                    this.f9537b = null;
                }
            }
        }
        return t;
    }
}
