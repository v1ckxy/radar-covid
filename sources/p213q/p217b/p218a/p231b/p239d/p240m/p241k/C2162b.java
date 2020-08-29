package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2137d;

/* renamed from: q.b.a.b.d.m.k.b */
public final class C2162b<O extends C2137d> {

    /* renamed from: a */
    public final int f6030a;

    /* renamed from: b */
    public final C2133a<O> f6031b;

    /* renamed from: c */
    public final O f6032c;

    public C2162b(C2133a<O> aVar, O o) {
        this.f6031b = aVar;
        this.f6032c = o;
        this.f6030a = Arrays.hashCode(new Object[]{aVar, o});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2162b)) {
            return false;
        }
        C2162b bVar = (C2162b) obj;
        return C1061o.m2546c((Object) this.f6031b, (Object) bVar.f6031b) && C1061o.m2546c((Object) this.f6032c, (Object) bVar.f6032c);
    }

    public final int hashCode() {
        return this.f6030a;
    }
}
