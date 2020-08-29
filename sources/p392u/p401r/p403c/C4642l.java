package p392u.p401r.p403c;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p407u.C4657a;
import p392u.p407u.C4661e;

/* renamed from: u.r.c.l */
public abstract class C4642l extends C4631b implements C4661e {
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4642l) {
            C4642l lVar = (C4642l) obj;
            C4641k kVar = (C4641k) this;
            C4641k kVar2 = (C4641k) lVar;
            if (!kVar.f10831h.equals(kVar2.f10831h) || !kVar.f10832i.equals(kVar2.f10832i) || !kVar.f10833j.equals(kVar2.f10833j) || !C4638h.m10272a(this.f10822f, lVar.f10822f)) {
                z = false;
            }
            return z;
        } else if (obj instanceof C4661e) {
            return obj.equals(mo10930a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        C4641k kVar = (C4641k) this;
        return kVar.f10833j.hashCode() + ((kVar.f10832i.hashCode() + (kVar.f10831h.hashCode() * 31)) * 31);
    }

    public String toString() {
        C4657a a = mo10930a();
        if (a != this) {
            return a.toString();
        }
        return C1965a.m4754a(C1965a.m4756a("property "), ((C4641k) this).f10832i, " (Kotlin reflection is not available)");
    }
}
