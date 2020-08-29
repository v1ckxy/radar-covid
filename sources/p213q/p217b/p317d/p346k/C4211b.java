package p213q.p217b.p317d.p346k;

import android.content.Context;
import p213q.p217b.p317d.p346k.C4212c.C4213a;

/* renamed from: q.b.d.k.b */
public class C4211b implements C4212c {

    /* renamed from: a */
    public C4214d f10151a;

    public C4211b(Context context) {
        this.f10151a = C4214d.m9689a(context);
    }

    /* renamed from: a */
    public C4213a mo10394a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f10151a.mo10396a(str, currentTimeMillis);
        boolean a2 = this.f10151a.mo10395a(currentTimeMillis);
        return (!a || !a2) ? a2 ? C4213a.GLOBAL : a ? C4213a.SDK : C4213a.NONE : C4213a.COMBINED;
    }
}
