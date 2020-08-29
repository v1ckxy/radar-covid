package androidx.savedstate;

import p124p.p177n.C1536d;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1542h;
import p124p.p185r.C1657a;

public class SavedStateRegistry$1 implements C1536d {

    /* renamed from: a */
    public final /* synthetic */ C1657a f916a;

    public SavedStateRegistry$1(C1657a aVar) {
        this.f916a = aVar;
    }

    /* renamed from: a */
    public void mo9a(C1542h hVar, C1538a aVar) {
        C1657a aVar2;
        boolean z;
        if (aVar == C1538a.ON_START) {
            aVar2 = this.f916a;
            z = true;
        } else if (aVar == C1538a.ON_STOP) {
            aVar2 = this.f916a;
            z = false;
        } else {
            return;
        }
        aVar2.f4895d = z;
    }
}
