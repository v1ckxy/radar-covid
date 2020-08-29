package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.features.poll.completed.view.PollCompletedFragment;
import p003f.p004a.p005a.p012b.p087k.p088a.p091c.C0656a;
import p392u.p401r.p403c.C4638h;

/* renamed from: m */
/* compiled from: java-style lambda group */
public final class C0888m implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2464e;

    /* renamed from: f */
    public final /* synthetic */ Object f2465f;

    public C0888m(int i, Object obj) {
        this.f2464e = i;
        this.f2465f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2464e;
        String str = "presenter";
        if (i == 0) {
            C0656a aVar = ((PollCompletedFragment) this.f2465f).f1760e0;
            if (aVar != null) {
                aVar.mo3840c();
            } else {
                C4638h.m10273b(str);
                throw null;
            }
        } else if (i == 1) {
            C0656a aVar2 = ((PollCompletedFragment) this.f2465f).f1760e0;
            if (aVar2 != null) {
                aVar2.mo3839b();
            } else {
                C4638h.m10273b(str);
                throw null;
            }
        } else {
            throw null;
        }
    }
}
