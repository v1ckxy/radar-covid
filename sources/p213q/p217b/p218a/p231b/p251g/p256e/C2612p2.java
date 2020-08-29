package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: q.b.a.b.g.e.p2 */
public final class C2612p2<T> extends C2630q2<T> {

    /* renamed from: e */
    public static final C2612p2<Object> f6795e = new C2612p2<>();

    /* renamed from: a */
    public final boolean mo7933a() {
        return false;
    }

    /* renamed from: b */
    public final T mo7934b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
