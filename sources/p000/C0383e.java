package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.features.onboarding.pages.legal.view.LegalInfoFragment;
import p003f.p004a.p005a.p012b.p068j.p086f.C0650a;
import p124p.p170k.p171a.C1482e;

/* renamed from: e */
/* compiled from: java-style lambda group */
public final class C0383e implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f1692e;

    /* renamed from: f */
    public final /* synthetic */ Object f1693f;

    public C0383e(int i, Object obj) {
        this.f1692e = i;
        this.f1693f = obj;
    }

    public final void onClick(View view) {
        int i = this.f1692e;
        if (i == 0) {
            ((LegalInfoFragment) this.f1693f).mo3182t0().mo3817c();
        } else if (i != 1) {
            C0650a aVar = null;
            if (i == 2) {
                C1482e Q = ((LegalInfoFragment) this.f1693f).mo777Q();
                if (Q instanceof C0650a) {
                    aVar = Q;
                }
                C0650a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo3186b();
                }
                return;
            }
            throw null;
        } else {
            ((LegalInfoFragment) this.f1693f).mo3182t0().mo3816b();
        }
    }
}
