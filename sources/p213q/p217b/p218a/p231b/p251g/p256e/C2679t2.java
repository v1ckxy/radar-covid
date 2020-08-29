package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.t2 */
public final class C2679t2<T> implements C2663s2<T> {

    /* renamed from: e */
    public volatile C2663s2<T> f6869e;

    /* renamed from: f */
    public volatile boolean f6870f;
    @NullableDecl

    /* renamed from: g */
    public T f6871g;

    public C2679t2(C2663s2<T> s2Var) {
        if (s2Var != null) {
            this.f6869e = s2Var;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final T mo7405a() {
        if (!this.f6870f) {
            synchronized (this) {
                if (!this.f6870f) {
                    T a = this.f6869e.mo7405a();
                    this.f6871g = a;
                    this.f6870f = true;
                    this.f6869e = null;
                    return a;
                }
            }
        }
        return this.f6871g;
    }

    public final String toString() {
        Object obj = this.f6869e;
        if (obj == null) {
            String valueOf = String.valueOf(this.f6871g);
            obj = C1965a.m4745a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return C1965a.m4745a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
