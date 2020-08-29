package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.features.exposure.region.view.RegionInfoFragment;

/* renamed from: g */
/* compiled from: java-style lambda group */
public final class C0861g implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2447e;

    /* renamed from: f */
    public final /* synthetic */ Object f2448f;

    public C0861g(int i, Object obj) {
        this.f2447e = i;
        this.f2448f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2447e;
        if (i == 0) {
            ((RegionInfoFragment) this.f2448f).mo3159t0().mo3768b();
        } else if (i == 1) {
            ((RegionInfoFragment) this.f2448f).mo3159t0().mo3770d();
        } else {
            throw null;
        }
    }
}
