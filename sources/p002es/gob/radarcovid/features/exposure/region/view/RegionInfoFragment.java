package p002es.gob.radarcovid.features.exposure.region.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import es.gob.radarcovid.R;
import java.util.HashMap;
import java.util.List;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0553a;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0555c;
import p003f.p004a.p005a.p012b.p027c.p031d.p036e.C0557a;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p003f.p004a.p005a.p108g.p114c.C0842f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.features.exposure.region.view.RegionInfoFragment */
public final class RegionInfoFragment extends C0706e implements C0555c {

    /* renamed from: e0 */
    public C0553a f1739e0;

    /* renamed from: f0 */
    public HashMap f1740f0;

    /* renamed from: C */
    public int mo3154C() {
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3157d(C0699d.spinnerRegion);
        C4638h.m10270a((Object) appCompatSpinner, "spinnerRegion");
        return appCompatSpinner.getSelectedItemPosition() - 1;
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_region_info, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: d */
    public View mo3157d(int i) {
        if (this.f1740f0 == null) {
            this.f1740f0 = new HashMap();
        }
        View view = (View) this.f1740f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1740f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1740f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1740f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: t0 */
    public final C0553a mo3159t0() {
        C0553a aVar = this.f1739e0;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            ((ConstraintLayout) mo3157d(C0699d.wrapperPhone)).setOnClickListener(new C0861g(0, this));
            ((ConstraintLayout) mo3157d(C0699d.wrapperWeb)).setOnClickListener(new C0861g(1, this));
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3157d(C0699d.spinnerRegion);
            C4638h.m10270a((Object) appCompatSpinner, "spinnerRegion");
            appCompatSpinner.setOnItemSelectedListener(new C0557a(this));
            C0553a aVar = this.f1739e0;
            if (aVar != null) {
                aVar.mo3767a();
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
    public void mo3156a(List<String> list) {
        if (list != null) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) mo3157d(C0699d.spinnerRegion);
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

    /* renamed from: a */
    public void mo3155a(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("phone");
            throw null;
        } else if (str2 != null) {
            LinearLayout linearLayout = (LinearLayout) mo3157d(C0699d.wrapperRegionInfo);
            C4638h.m10270a((Object) linearLayout, "wrapperRegionInfo");
            linearLayout.setVisibility(0);
            boolean z = true;
            String str3 = "wrapperPhone";
            if (str.length() > 0) {
                ConstraintLayout constraintLayout = (ConstraintLayout) mo3157d(C0699d.wrapperPhone);
                C4638h.m10270a((Object) constraintLayout, str3);
                constraintLayout.setVisibility(0);
                TextView textView = (TextView) mo3157d(C0699d.textViewPhone);
                C4638h.m10270a((Object) textView, "textViewPhone");
                textView.setText(str);
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) mo3157d(C0699d.wrapperPhone);
                C4638h.m10270a((Object) constraintLayout2, str3);
                constraintLayout2.setVisibility(8);
            }
            if (str2.length() <= 0) {
                z = false;
            }
            String str4 = "wrapperWeb";
            if (z) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) mo3157d(C0699d.wrapperWeb);
                C4638h.m10270a((Object) constraintLayout3, str4);
                constraintLayout3.setVisibility(0);
                TextView textView2 = (TextView) mo3157d(C0699d.textViewWeb);
                C4638h.m10270a((Object) textView2, "textViewWeb");
                textView2.setText(str2);
                return;
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) mo3157d(C0699d.wrapperWeb);
            C4638h.m10270a((Object) constraintLayout4, str4);
            constraintLayout4.setVisibility(0);
        } else {
            C4638h.m10271a("webName");
            throw null;
        }
    }
}
