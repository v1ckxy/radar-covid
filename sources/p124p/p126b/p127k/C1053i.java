package p124p.p126b.p127k;

import android.os.Build.VERSION;
import android.view.View;
import p124p.p150h.p154f.C1336b;
import p124p.p150h.p162l.C1401l;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1419x;
import p124p.p150h.p162l.C1419x.C1420a;
import p124p.p150h.p162l.C1419x.C1421b;
import p124p.p150h.p162l.C1419x.C1422c;

/* renamed from: p.b.k.i */
public class C1053i implements C1401l {

    /* renamed from: a */
    public final /* synthetic */ C1039h f2778a;

    public C1053i(C1039h hVar) {
        this.f2778a = hVar;
    }

    /* renamed from: a */
    public C1419x mo648a(View view, C1419x xVar) {
        int d = xVar.mo5924d();
        int f = this.f2778a.mo4482f(d);
        if (d != f) {
            int b = xVar.mo5922b();
            int c = xVar.mo5923c();
            int a = xVar.mo5921a();
            C1422c bVar = VERSION.SDK_INT >= 29 ? new C1421b(xVar) : new C1420a(xVar);
            bVar.mo5930a(C1336b.m3390a(b, f, c, a));
            xVar = bVar.mo5929a();
        }
        return C1404o.m3512a(view, xVar);
    }
}
