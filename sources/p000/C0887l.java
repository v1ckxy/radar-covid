package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p003f.p004a.p005a.p012b.p062i.p065c.C0608a;
import p003f.p004a.p005a.p012b.p062i.p067e.C0613a;
import p392u.p401r.p403c.C4638h;

/* renamed from: l */
/* compiled from: java-style lambda group */
public final class C0887l implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2462e;

    /* renamed from: f */
    public final /* synthetic */ Object f2463f;

    public C0887l(int i, Object obj) {
        this.f2462e = i;
        this.f2463f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2462e;
        String str = "presenter";
        if (i == 0) {
            C0608a aVar = ((C0613a) this.f2463f).f2051e0;
            if (aVar != null) {
                aVar.mo3808b();
            } else {
                C4638h.m10273b(str);
                throw null;
            }
        } else if (i == 1) {
            C0608a aVar2 = ((C0613a) this.f2463f).f2051e0;
            if (aVar2 != null) {
                aVar2.mo3809c();
            } else {
                C4638h.m10273b(str);
                throw null;
            }
        } else {
            throw null;
        }
    }
}
