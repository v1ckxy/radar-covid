package p410v.p411m0.p413d;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p410v.C4866v;

/* renamed from: v.m0.d.g */
public final class C4760g extends C4639i implements C4607a<List<? extends X509Certificate>> {

    /* renamed from: f */
    public final /* synthetic */ C4761h f11239f;

    public C4760g(C4761h hVar) {
        this.f11239f = hVar;
        super(0);
    }

    /* renamed from: c */
    public Object mo3123c() {
        C4866v vVar = this.f11239f.f11242d;
        if (vVar != null) {
            List<Certificate> a = vVar.mo11360a();
            ArrayList arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) a, 10));
            for (Certificate certificate : a) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new C4557i("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
        C4638h.m10269a();
        throw null;
    }
}
