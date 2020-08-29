package androidx.lifecycle;

import p124p.p177n.C1534b;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;

public class FullLifecycleObserverAdapter implements C1540f {

    /* renamed from: a */
    public final C1534b f655a;

    /* renamed from: b */
    public final C1540f f656b;

    public FullLifecycleObserverAdapter(C1534b bVar, C1540f fVar) {
        this.f655a = bVar;
        this.f656b = fVar;
    }

    /* renamed from: a */
    public void mo9a(C1542h hVar, C1538a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f655a.mo6222c(hVar);
                break;
            case 1:
                this.f655a.mo6224e(hVar);
                break;
            case 2:
                this.f655a.mo6220a(hVar);
                break;
            case 3:
                this.f655a.mo6223d(hVar);
                break;
            case 4:
                this.f655a.mo6225f(hVar);
                break;
            case 5:
                this.f655a.mo6221b(hVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1540f fVar = this.f656b;
        if (fVar != null) {
            fVar.mo9a(hVar, aVar);
        }
    }
}
