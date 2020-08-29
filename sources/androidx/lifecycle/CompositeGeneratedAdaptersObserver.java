package androidx.lifecycle;

import p124p.p177n.C1535c;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;
import p124p.p177n.C1548m;

public class CompositeGeneratedAdaptersObserver implements C1540f {

    /* renamed from: a */
    public final C1535c[] f654a;

    public CompositeGeneratedAdaptersObserver(C1535c[] cVarArr) {
        this.f654a = cVarArr;
    }

    /* renamed from: a */
    public void mo9a(C1542h hVar, C1538a aVar) {
        C1548m mVar = new C1548m();
        for (C1535c a : this.f654a) {
            a.mo6226a(hVar, aVar, false, mVar);
        }
        for (C1535c a2 : this.f654a) {
            a2.mo6226a(hVar, aVar, true, mVar);
        }
    }
}
