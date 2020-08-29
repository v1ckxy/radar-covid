package p003f.p004a.p005a.p012b.p027c.p031d.p036e;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import p002es.gob.radarcovid.features.exposure.region.view.RegionInfoFragment;

/* renamed from: f.a.a.b.c.d.e.a */
public final class C0557a implements OnItemSelectedListener {

    /* renamed from: e */
    public final /* synthetic */ RegionInfoFragment f1981e;

    public C0557a(RegionInfoFragment regionInfoFragment) {
        this.f1981e = regionInfoFragment;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i > 0) {
            this.f1981e.mo3159t0().mo3769c();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
