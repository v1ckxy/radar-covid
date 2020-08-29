package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3980e;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3989n;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4155d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;

/* renamed from: q.b.d.h.e.k.y */
public class C4000y implements C3253h<C4173b, Void> {

    /* renamed from: a */
    public final /* synthetic */ Executor f9780a;

    /* renamed from: b */
    public final /* synthetic */ C3980e f9781b;

    public C4000y(C3980e eVar, Executor executor) {
        this.f9781b = eVar;
        this.f9780a = executor;
    }

    /* renamed from: a */
    public C3255i mo8939a(Object obj) {
        C4173b bVar = (C4173b) obj;
        if (bVar == null) {
            C3913b.f9552c.mo10113c("Received null app settings, cannot send reports at crash time.");
            return C2286e.m5291b(null);
        }
        C3975t tVar = C3975t.this;
        Context context = tVar.f9718a;
        C4146b a = ((C3935c0) tVar.f9727j).mo10125a(bVar);
        File[] g = tVar.mo10181g();
        int length = g.length;
        int i = 0;
        while (i < length) {
            File file = g[i];
            C3975t.m9402a(bVar.f10096e, file);
            C4155d dVar = new C4155d(file, C3975t.f9713D);
            C3948h hVar = tVar.f9722e;
            C3989n nVar = new C3989n(context, dVar, a, true);
            if (hVar != null) {
                hVar.mo10137a(new C3951i(hVar, nVar));
                i++;
            } else {
                throw null;
            }
        }
        return C2286e.m5210a((Collection<? extends C3255i<?>>) Arrays.asList(new C3255i[]{C3975t.m9400a(C3975t.this), C3975t.this.f9736s.mo10196a(this.f9780a, C3961m0.m9386a(bVar))}));
    }
}
