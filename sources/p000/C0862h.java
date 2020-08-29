package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.features.onboarding.pages.legal.view.ConditionsActivity;

/* renamed from: h */
/* compiled from: java-style lambda group */
public final class C0862h implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2449e;

    /* renamed from: f */
    public final /* synthetic */ Object f2450f;

    public C0862h(int i, Object obj) {
        this.f2449e = i;
        this.f2450f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2449e;
        if (i == 0) {
            ((ConditionsActivity) this.f2450f).finish();
        } else if (i == 1) {
            ((ConditionsActivity) this.f2450f).setResult(-1);
            ((ConditionsActivity) this.f2450f).finish();
        } else if (i == 2) {
            ((ConditionsActivity) this.f2450f).finish();
        } else {
            throw null;
        }
    }
}
