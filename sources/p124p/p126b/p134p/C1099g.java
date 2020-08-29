package p124p.p126b.p134p;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1416u;
import p124p.p150h.p162l.C1417v;

/* renamed from: p.b.p.g */
public class C1099g {

    /* renamed from: a */
    public final ArrayList<C1413t> f2976a = new ArrayList<>();

    /* renamed from: b */
    public long f2977b = -1;

    /* renamed from: c */
    public Interpolator f2978c;

    /* renamed from: d */
    public C1416u f2979d;

    /* renamed from: e */
    public boolean f2980e;

    /* renamed from: f */
    public final C1417v f2981f = new C1100a();

    /* renamed from: p.b.p.g$a */
    public class C1100a extends C1417v {

        /* renamed from: a */
        public boolean f2982a = false;

        /* renamed from: b */
        public int f2983b = 0;

        public C1100a() {
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            int i = this.f2983b + 1;
            this.f2983b = i;
            if (i == C1099g.this.f2976a.size()) {
                C1416u uVar = C1099g.this.f2979d;
                if (uVar != null) {
                    uVar.mo4498b(null);
                }
                this.f2983b = 0;
                this.f2982a = false;
                C1099g.this.f2980e = false;
            }
        }

        /* renamed from: c */
        public void mo4521c(View view) {
            if (!this.f2982a) {
                this.f2982a = true;
                C1416u uVar = C1099g.this.f2979d;
                if (uVar != null) {
                    uVar.mo4521c(null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4685a() {
        if (this.f2980e) {
            Iterator it = this.f2976a.iterator();
            while (it.hasNext()) {
                ((C1413t) it.next()).mo5914a();
            }
            this.f2980e = false;
        }
    }

    /* renamed from: b */
    public void mo4686b() {
        if (!this.f2980e) {
            Iterator it = this.f2976a.iterator();
            while (it.hasNext()) {
                C1413t tVar = (C1413t) it.next();
                long j = this.f2977b;
                if (j >= 0) {
                    tVar.mo5911a(j);
                }
                Interpolator interpolator = this.f2978c;
                if (interpolator != null) {
                    View view = (View) tVar.f4179a.get();
                    if (view != null) {
                        view.animate().setInterpolator(interpolator);
                    }
                }
                if (this.f2979d != null) {
                    tVar.mo5912a((C1416u) this.f2981f);
                }
                View view2 = (View) tVar.f4179a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f2980e = true;
        }
    }
}
