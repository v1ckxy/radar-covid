package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a;

/* renamed from: q.b.d.h.e.m.p */
public final class C4075p extends C4108e {

    /* renamed from: a */
    public final String f9940a;

    /* renamed from: b */
    public final int f9941b;

    /* renamed from: c */
    public final C4119w<C4109a> f9942c;

    public /* synthetic */ C4075p(String str, int i, C4119w wVar, C4076a aVar) {
        this.f9940a = str;
        this.f9941b = i;
        this.f9942c = wVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4108e)) {
            return false;
        }
        C4075p pVar = (C4075p) ((C4108e) obj);
        if (!this.f9940a.equals(pVar.f9940a) || this.f9941b != pVar.f9941b || !this.f9942c.equals(pVar.f9942c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.f9940a.hashCode() ^ 1000003) * 1000003) ^ this.f9941b) * 1000003) ^ this.f9942c.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Thread{name=");
        a.append(this.f9940a);
        a.append(", importance=");
        a.append(this.f9941b);
        a.append(", frames=");
        a.append(this.f9942c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
