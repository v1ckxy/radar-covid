package p213q.p217b.p218a.p231b.p251g.p254c;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.c.j */
public final class C2333j<T> implements C2331h<T>, Serializable {

    /* renamed from: e */
    public final C2331h<T> f6294e;

    /* renamed from: f */
    public volatile transient boolean f6295f;
    @NullableDecl

    /* renamed from: g */
    public transient T f6296g;

    public C2333j(C2331h<T> hVar) {
        if (hVar != null) {
            this.f6294e = hVar;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final T mo7302a() {
        if (!this.f6295f) {
            synchronized (this) {
                if (!this.f6295f) {
                    T a = this.f6294e.mo7302a();
                    this.f6296g = a;
                    this.f6295f = true;
                    return a;
                }
            }
        }
        return this.f6296g;
    }

    public final String toString() {
        Object obj;
        if (this.f6295f) {
            String valueOf = String.valueOf(this.f6296g);
            obj = C1965a.m4745a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f6294e;
        }
        String valueOf2 = String.valueOf(obj);
        return C1965a.m4745a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
