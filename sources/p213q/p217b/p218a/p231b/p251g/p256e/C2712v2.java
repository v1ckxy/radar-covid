package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.v2 */
public final class C2712v2<T> implements C2663s2<T>, Serializable {
    @NullableDecl

    /* renamed from: e */
    public final T f6930e;

    public C2712v2(@NullableDecl T t) {
        this.f6930e = t;
    }

    /* renamed from: a */
    public final T mo7405a() {
        return this.f6930e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C2712v2)) {
            return false;
        }
        return C2286e.m5238a((Object) this.f6930e, (Object) ((C2712v2) obj).f6930e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6930e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6930e);
        return C1965a.m4745a(valueOf.length() + 22, "Suppliers.ofInstance(", valueOf, ")");
    }
}
