package androidx.lifecycle;

import java.util.List;
import p124p.p177n.C1531a;
import p124p.p177n.C1531a.C1532a;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1540f;
import p124p.p177n.C1542h;

public class ReflectiveGenericLifecycleObserver implements C1540f {

    /* renamed from: a */
    public final Object f674a;

    /* renamed from: b */
    public final C1532a f675b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f674a = obj;
        this.f675b = C1531a.f4545c.mo6215a(obj.getClass());
    }

    /* renamed from: a */
    public void mo9a(C1542h hVar, C1538a aVar) {
        C1532a aVar2 = this.f675b;
        Object obj = this.f674a;
        C1532a.m3916a((List) aVar2.f4548a.get(aVar), hVar, aVar, obj);
        C1532a.m3916a((List) aVar2.f4548a.get(C1538a.ON_ANY), hVar, aVar, obj);
    }
}
