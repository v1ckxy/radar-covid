package p003f.p004a.p005a.p012b.p050g.p055e;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import p002es.gob.radarcovid.features.locale.view.LocaleSelectionFragment;
import p003f.p004a.p005a.p012b.p050g.p053c.C0580a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.e.b */
public final class C0586b implements OnItemSelectedListener {

    /* renamed from: e */
    public final /* synthetic */ LocaleSelectionFragment f2015e;

    public C0586b(LocaleSelectionFragment localeSelectionFragment) {
        this.f2015e = localeSelectionFragment;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i > 0) {
            C0580a aVar = this.f2015e.f1744e0;
            if (aVar != null) {
                aVar.mo3786a(i - 1);
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
