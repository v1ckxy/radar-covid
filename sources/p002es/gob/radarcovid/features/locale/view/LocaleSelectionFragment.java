package p002es.gob.radarcovid.features.locale.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import es.gob.radarcovid.R;
import java.util.HashMap;
import java.util.List;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p050g.p053c.C0580a;
import p003f.p004a.p005a.p012b.p050g.p053c.C0582c;
import p003f.p004a.p005a.p012b.p050g.p055e.C0585a;
import p003f.p004a.p005a.p012b.p050g.p055e.C0586b;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p003f.p004a.p005a.p108g.p114c.C0842f;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.features.locale.view.LocaleSelectionFragment */
public final class LocaleSelectionFragment extends C0706e implements C0582c {

    /* renamed from: e0 */
    public C0580a f1744e0;

    /* renamed from: f0 */
    public HashMap f1745f0;

    /* renamed from: D */
    public int mo3170D() {
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3174d(C0699d.spinnerLanguage);
        C4638h.m10270a((Object) appCompatSpinner, "spinnerLanguage");
        return appCompatSpinner.getSelectedItemPosition() - 1;
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_locale_selection, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: a */
    public void mo3171a(int i) {
        ((AppCompatSpinner) mo3174d(C0699d.spinnerLanguage)).setSelection(i + 1);
    }

    /* renamed from: b */
    public void mo3173b(List<String> list) {
        if (list != null) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3174d(C0699d.spinnerLanguage);
            C4638h.m10270a((Object) appCompatSpinner, "spinnerLanguage");
            Context U = mo781U();
            if (U != null) {
                C4638h.m10270a((Object) U, "context!!");
                C0500a s0 = mo3883s0();
                appCompatSpinner.setAdapter((SpinnerAdapter) new C0842f(U, s0.mo3714a(Objects.EMPTY_STRING, s0.f1897b.getText(R.string.locale_selection_language_default)).toString(), R.layout.row_spinner, list));
                return;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("languages");
        throw null;
    }

    /* renamed from: d */
    public View mo3174d(int i) {
        if (this.f1745f0 == null) {
            this.f1745f0 = new HashMap();
        }
        View view = (View) this.f1745f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1745f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1745f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1745f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3174d(C0699d.spinnerRegion);
            C4638h.m10270a((Object) appCompatSpinner, "spinnerRegion");
            appCompatSpinner.setOnItemSelectedListener(new C0585a());
            AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) mo3174d(C0699d.spinnerLanguage);
            C4638h.m10270a((Object) appCompatSpinner2, "spinnerLanguage");
            appCompatSpinner2.setOnItemSelectedListener(new C0586b(this));
            C0580a aVar = this.f1744e0;
            if (aVar != null) {
                aVar.mo3785a();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3172a(List<String> list) {
        if (list != null) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3174d(C0699d.spinnerRegion);
            C4638h.m10270a((Object) appCompatSpinner, "spinnerRegion");
            Context U = mo781U();
            if (U != null) {
                C4638h.m10270a((Object) U, "context!!");
                C0500a s0 = mo3883s0();
                appCompatSpinner.setAdapter((SpinnerAdapter) new C0842f(U, s0.mo3714a("LOCALE_SELECTION_REGION_DEFAULT", s0.f1897b.getText(R.string.locale_selection_region_default)).toString(), R.layout.row_spinner, list));
                return;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("regions");
        throw null;
    }
}
