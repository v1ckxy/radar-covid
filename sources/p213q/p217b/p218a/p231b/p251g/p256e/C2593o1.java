package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.Context;
import javax.annotation.Nullable;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.a.b.g.e.o1 */
public final class C2593o1 extends C2469h2 {

    /* renamed from: a */
    public final Context f6756a;

    /* renamed from: b */
    public final C2663s2<C2630q2<C2711v1>> f6757b;

    public C2593o1(Context context, @Nullable C2663s2<C2630q2<C2711v1>> s2Var) {
        if (context != null) {
            this.f6756a = context;
            this.f6757b = s2Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2469h2) {
            C2469h2 h2Var = (C2469h2) obj;
            if (this.f6756a.equals(((C2593o1) h2Var).f6756a)) {
                C2663s2<C2630q2<C2711v1>> s2Var = this.f6757b;
                C2593o1 o1Var = (C2593o1) h2Var;
                return s2Var != null ? s2Var.equals(o1Var.f6757b) : o1Var.f6757b == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f6756a.hashCode() ^ 1000003) * 1000003;
        C2663s2<C2630q2<C2711v1>> s2Var = this.f6757b;
        return hashCode ^ (s2Var == null ? 0 : s2Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6756a);
        String valueOf2 = String.valueOf(this.f6757b);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 46);
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }
}
