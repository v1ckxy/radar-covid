package p124p.p144f.p145a.p146h;

import java.util.ArrayList;
import p124p.p144f.p145a.p146h.C1274c.C1276b;

/* renamed from: p.f.a.h.m */
public class C1288m {

    /* renamed from: a */
    public int f3817a;

    /* renamed from: b */
    public int f3818b;

    /* renamed from: c */
    public int f3819c;

    /* renamed from: d */
    public int f3820d;

    /* renamed from: e */
    public ArrayList<C1289a> f3821e = new ArrayList<>();

    /* renamed from: p.f.a.h.m$a */
    public static class C1289a {

        /* renamed from: a */
        public C1274c f3822a;

        /* renamed from: b */
        public C1274c f3823b;

        /* renamed from: c */
        public int f3824c;

        /* renamed from: d */
        public C1276b f3825d;

        /* renamed from: e */
        public int f3826e;

        public C1289a(C1274c cVar) {
            this.f3822a = cVar;
            this.f3823b = cVar.f3672d;
            this.f3824c = cVar.mo5674a();
            this.f3825d = cVar.f3675g;
            this.f3826e = cVar.f3676h;
        }
    }

    public C1288m(C1278d dVar) {
        this.f3817a = dVar.f3704I;
        this.f3818b = dVar.f3705J;
        this.f3819c = dVar.mo5705j();
        this.f3820d = dVar.mo5696d();
        ArrayList b = dVar.mo5687b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f3821e.add(new C1289a((C1274c) b.get(i)));
        }
    }
}
