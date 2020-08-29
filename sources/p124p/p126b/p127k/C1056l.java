package p124p.p126b.p127k;

import android.view.View;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1416u;
import p124p.p150h.p162l.C1417v;

/* renamed from: p.b.k.l */
public class C1056l implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1039h f2781e;

    /* renamed from: p.b.k.l$a */
    public class C1057a extends C1417v {
        public C1057a() {
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            C1056l.this.f2781e.f2735s.setAlpha(1.0f);
            C1056l.this.f2781e.f2738v.mo5912a((C1416u) null);
            C1056l.this.f2781e.f2738v = null;
        }

        /* renamed from: c */
        public void mo4521c(View view) {
            C1056l.this.f2781e.f2735s.setVisibility(0);
        }
    }

    public C1056l(C1039h hVar) {
        this.f2781e = hVar;
    }

    public void run() {
        C1039h hVar = this.f2781e;
        hVar.f2736t.showAtLocation(hVar.f2735s, 55, 0, 0);
        this.f2781e.mo4480e();
        if (this.f2781e.mo4488k()) {
            this.f2781e.f2735s.setAlpha(0.0f);
            C1039h hVar2 = this.f2781e;
            C1413t a = C1404o.m3511a(hVar2.f2735s);
            a.mo5910a(1.0f);
            hVar2.f2738v = a;
            C1413t tVar = this.f2781e.f2738v;
            C1057a aVar = new C1057a();
            View view = (View) tVar.f4179a.get();
            if (view != null) {
                tVar.mo5915a(view, aVar);
                return;
            }
            return;
        }
        this.f2781e.f2735s.setAlpha(1.0f);
        this.f2781e.f2735s.setVisibility(0);
    }
}
