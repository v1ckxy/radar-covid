package p124p.p150h.p162l;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.l.c */
public final class C1391c {

    /* renamed from: a */
    public final Object f4150a;

    public C1391c(Object obj) {
        this.f4150a = obj;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1391c.class != obj.getClass()) {
            return false;
        }
        C1391c cVar = (C1391c) obj;
        Object obj2 = this.f4150a;
        Object obj3 = cVar.f4150a;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.f4150a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("DisplayCutoutCompat{");
        a.append(this.f4150a);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
