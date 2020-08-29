package p124p.p199y.p200x.p205q.p206e;

import android.content.Context;
import android.os.Build.VERSION;
import p124p.p199y.C1800l;
import p124p.p199y.C1802m;
import p124p.p199y.p200x.p205q.C1862b;
import p124p.p199y.p200x.p205q.p207f.C1884g;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.e.e */
public class C1870e extends C1867c<C1862b> {

    /* renamed from: e */
    public static final String f5461e = C1800l.m4459a("NetworkMeteredCtrlr");

    public C1870e(Context context, C1962a aVar) {
        super(C1884g.m4630a(context, aVar).f5486c);
    }

    /* renamed from: a */
    public boolean mo6858a(C1913p pVar) {
        return pVar.f5536j.f5244a == C1802m.METERED;
    }

    /* renamed from: b */
    public boolean mo6859b(Object obj) {
        C1862b bVar = (C1862b) obj;
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            C1800l.m4460a().mo6782a(f5461e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.f5449a;
        }
        if (bVar.f5449a && bVar.f5451c) {
            z = false;
        }
        return z;
    }
}
