package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import p124p.p199y.C1805o;
import p124p.p199y.C1805o.C1807b.C1808a;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.C1824c;
import p124p.p199y.p200x.C1827e;
import p124p.p199y.p200x.C1828f;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1891b;
import p124p.p199y.p200x.p209s.C1892c;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.t.d */
public abstract class C1933d implements Runnable {

    /* renamed from: e */
    public final C1824c f5566e = new C1824c();

    /* renamed from: a */
    public abstract void mo6919a();

    /* renamed from: a */
    public void mo6921a(C1842l lVar, String str) {
        WorkDatabase workDatabase = lVar.f5350c;
        C1915q m = workDatabase.mo1462m();
        C1891b h = workDatabase.mo1457h();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C1916r rVar = (C1916r) m;
            C1816t b = rVar.mo6908b(str2);
            if (!(b == C1816t.SUCCEEDED || b == C1816t.FAILED)) {
                rVar.mo6902a(C1816t.CANCELLED, str2);
            }
            linkedList.addAll(((C1892c) h).mo6880a(str2));
        }
        lVar.f5353f.mo6804d(str);
        for (C1827e a : lVar.f5352e) {
            a.mo6809a(str);
        }
    }

    public void run() {
        try {
            mo6919a();
            this.f5566e.mo6796a(C1805o.f5287a);
        } catch (Throwable th) {
            this.f5566e.mo6796a(new C1808a(th));
        }
    }

    /* renamed from: a */
    public void mo6920a(C1842l lVar) {
        C1828f.m4501a(lVar.f5349b, lVar.f5350c, lVar.f5352e);
    }
}
