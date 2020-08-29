package p000;

import android.view.View;
import android.view.View.OnClickListener;
import es.gob.radarcovid.R;
import p002es.gob.radarcovid.features.exposure.view.ExposureActivity;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p027c.p030c.C0548a;

/* renamed from: i */
/* compiled from: java-style lambda group */
public final class C0863i implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2451e;

    /* renamed from: f */
    public final /* synthetic */ Object f2452f;

    public C0863i(int i, Object obj) {
        this.f2451e = i;
        this.f2452f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2451e;
        if (i == 0) {
            ((ExposureActivity) this.f2452f).mo3160T().mo3764d();
        } else if (i == 1) {
            C0548a T = ((ExposureActivity) this.f2452f).mo3160T();
            C0500a R = ((ExposureActivity) this.f2452f).mo3873R();
            T.mo3761a(R.mo3714a("EXPOSURE_LOW_INFO_URL", R.f1897b.getText(R.string.exposure_detail_info_url)).toString());
        } else if (i == 2) {
            C0548a T2 = ((ExposureActivity) this.f2452f).mo3160T();
            C0500a R2 = ((ExposureActivity) this.f2452f).mo3873R();
            T2.mo3761a(R2.mo3714a("EXPOSURE_HIGH_INFO_URL", R2.f1897b.getText(R.string.exposure_detail_info_url)).toString());
        } else if (i == 3) {
            C0548a T3 = ((ExposureActivity) this.f2452f).mo3160T();
            C0500a R3 = ((ExposureActivity) this.f2452f).mo3873R();
            T3.mo3761a(R3.mo3714a("EXPOSURE_INFECTED_INFO_URL", R3.f1897b.getText(R.string.exposure_detail_info_url)).toString());
        } else {
            throw null;
        }
    }
}
