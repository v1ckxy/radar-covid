package p124p.p180p.p181d;

import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0114l.C0117c;
import p124p.p143e.C1253e;
import p124p.p143e.C1261h;
import p124p.p150h.p161k.C1384d;

/* renamed from: p.p.d.a0 */
public class C1573a0 {

    /* renamed from: a */
    public final C1261h<C0105d0, C1574a> f4596a = new C1261h<>();

    /* renamed from: b */
    public final C1253e<C0105d0> f4597b = new C1253e<>();

    /* renamed from: p.p.d.a0$a */
    public static class C1574a {

        /* renamed from: d */
        public static C1384d<C1574a> f4598d = new C1384d<>(20);

        /* renamed from: a */
        public int f4599a;

        /* renamed from: b */
        public C0117c f4600b;

        /* renamed from: c */
        public C0117c f4601c;

        /* renamed from: a */
        public static C1574a m3989a() {
            C1574a aVar = (C1574a) f4598d.mo5864a();
            return aVar == null ? new C1574a() : aVar;
        }

        /* renamed from: a */
        public static void m3990a(C1574a aVar) {
            aVar.f4599a = 0;
            aVar.f4600b = null;
            aVar.f4601c = null;
            f4598d.mo5865a(aVar);
        }
    }

    /* renamed from: p.p.d.a0$b */
    public interface C1575b {
    }

    /* renamed from: a */
    public final C0117c mo6273a(C0105d0 d0Var, int i) {
        C0117c cVar;
        int a = this.f4596a.mo5587a((Object) d0Var);
        if (a < 0) {
            return null;
        }
        C1574a aVar = (C1574a) this.f4596a.mo5598e(a);
        if (aVar != null) {
            int i2 = aVar.f4599a;
            if ((i2 & i) != 0) {
                aVar.f4599a = (~i) & i2;
                if (i == 4) {
                    cVar = aVar.f4600b;
                } else if (i == 8) {
                    cVar = aVar.f4601c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.f4599a & 12) == 0) {
                    this.f4596a.mo5597d(a);
                    C1574a.m3990a(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6274a(C0105d0 d0Var) {
        C1574a aVar = (C1574a) this.f4596a.getOrDefault(d0Var, null);
        if (aVar == null) {
            aVar = C1574a.m3989a();
            this.f4596a.put(d0Var, aVar);
        }
        aVar.f4599a |= 1;
    }

    /* renamed from: b */
    public void mo6276b(C0105d0 d0Var, C0117c cVar) {
        C1574a aVar = (C1574a) this.f4596a.getOrDefault(d0Var, null);
        if (aVar == null) {
            aVar = C1574a.m3989a();
            this.f4596a.put(d0Var, aVar);
        }
        aVar.f4600b = cVar;
        aVar.f4599a |= 4;
    }

    /* renamed from: c */
    public void mo6278c(C0105d0 d0Var) {
        C1574a aVar = (C1574a) this.f4596a.getOrDefault(d0Var, null);
        if (aVar != null) {
            aVar.f4599a &= -2;
        }
    }

    /* renamed from: d */
    public void mo6279d(C0105d0 d0Var) {
        int e = this.f4597b.mo5523e() - 1;
        while (true) {
            if (e < 0) {
                break;
            } else if (d0Var == this.f4597b.mo5514b(e)) {
                C1253e<C0105d0> eVar = this.f4597b;
                Object[] objArr = eVar.f3559g;
                Object obj = objArr[e];
                Object obj2 = C1253e.f3556i;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    eVar.f3557e = true;
                }
            } else {
                e--;
            }
        }
        C1574a aVar = (C1574a) this.f4596a.remove(d0Var);
        if (aVar != null) {
            C1574a.m3990a(aVar);
        }
    }

    /* renamed from: a */
    public void mo6275a(C0105d0 d0Var, C0117c cVar) {
        C1574a aVar = (C1574a) this.f4596a.getOrDefault(d0Var, null);
        if (aVar == null) {
            aVar = C1574a.m3989a();
            this.f4596a.put(d0Var, aVar);
        }
        aVar.f4601c = cVar;
        aVar.f4599a |= 8;
    }

    /* renamed from: b */
    public boolean mo6277b(C0105d0 d0Var) {
        C1574a aVar = (C1574a) this.f4596a.getOrDefault(d0Var, null);
        return (aVar == null || (aVar.f4599a & 1) == 0) ? false : true;
    }
}
