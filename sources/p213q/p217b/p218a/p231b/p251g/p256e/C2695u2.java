package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.u2 */
public final class C2695u2<T> implements C2663s2<T>, Serializable {

    /* renamed from: e */
    public final C2663s2<T> f6909e;

    /* renamed from: f */
    public volatile transient boolean f6910f;
    @NullableDecl

    /* renamed from: g */
    public transient T f6911g;

    public C2695u2(C2663s2<T> s2Var) {
        if (s2Var != null) {
            this.f6909e = s2Var;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final T mo7405a() {
        if (!this.f6910f) {
            synchronized (this) {
                if (!this.f6910f) {
                    T a = this.f6909e.mo7405a();
                    this.f6911g = a;
                    this.f6910f = true;
                    return a;
                }
            }
        }
        return this.f6911g;
    }

    public final String toString() {
        Object obj;
        if (this.f6910f) {
            String valueOf = String.valueOf(this.f6911g);
            obj = C1965a.m4745a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f6909e;
        }
        String valueOf2 = String.valueOf(obj);
        return C1965a.m4745a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
