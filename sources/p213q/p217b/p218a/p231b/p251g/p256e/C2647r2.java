package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.r2 */
public final class C2647r2<T> extends C2630q2<T> {

    /* renamed from: e */
    public final T f6831e;

    public C2647r2(T t) {
        this.f6831e = t;
    }

    /* renamed from: a */
    public final boolean mo7933a() {
        return true;
    }

    /* renamed from: b */
    public final T mo7934b() {
        return this.f6831e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C2647r2)) {
            return false;
        }
        return this.f6831e.equals(((C2647r2) obj).f6831e);
    }

    public final int hashCode() {
        return this.f6831e.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6831e);
        return C1965a.m4745a(valueOf.length() + 13, "Optional.of(", valueOf, ")");
    }
}
