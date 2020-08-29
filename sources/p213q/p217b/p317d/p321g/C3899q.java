package p213q.p217b.p317d.p321g;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.d.g.q */
public final class C3899q {

    /* renamed from: a */
    public final Class<?> f9527a;

    /* renamed from: b */
    public final int f9528b;

    /* renamed from: c */
    public final int f9529c;

    public C3899q(Class<?> cls, int i, int i2) {
        C2286e.m5181a(cls, "Null dependency anInterface.");
        this.f9527a = cls;
        this.f9528b = i;
        this.f9529c = i2;
    }

    /* renamed from: a */
    public static C3899q m9288a(Class<?> cls) {
        return new C3899q(cls, 1, 0);
    }

    /* renamed from: a */
    public boolean mo10088a() {
        return this.f9528b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3899q)) {
            return false;
        }
        C3899q qVar = (C3899q) obj;
        return this.f9527a == qVar.f9527a && this.f9528b == qVar.f9528b && this.f9529c == qVar.f9529c;
    }

    public int hashCode() {
        return ((((this.f9527a.hashCode() ^ 1000003) * 1000003) ^ this.f9528b) * 1000003) ^ this.f9529c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f9527a);
        sb.append(", type=");
        int i = this.f9528b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        sb.append(str);
        sb.append(", direct=");
        if (this.f9529c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }
}
