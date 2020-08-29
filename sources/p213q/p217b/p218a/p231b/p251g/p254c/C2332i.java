package p213q.p217b.p218a.p231b.p251g.p254c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.c.i */
public final class C2332i<T> implements C2331h<T> {

    /* renamed from: e */
    public volatile C2331h<T> f6291e;

    /* renamed from: f */
    public volatile boolean f6292f;
    @NullableDecl

    /* renamed from: g */
    public T f6293g;

    public C2332i(C2331h<T> hVar) {
        if (hVar != null) {
            this.f6291e = hVar;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final T mo7302a() {
        if (!this.f6292f) {
            synchronized (this) {
                if (!this.f6292f) {
                    T a = this.f6291e.mo7302a();
                    this.f6293g = a;
                    this.f6292f = true;
                    this.f6291e = null;
                    return a;
                }
            }
        }
        return this.f6293g;
    }

    public final String toString() {
        Object obj = this.f6291e;
        if (obj == null) {
            String valueOf = String.valueOf(this.f6293g);
            obj = C1965a.m4745a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return C1965a.m4745a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
