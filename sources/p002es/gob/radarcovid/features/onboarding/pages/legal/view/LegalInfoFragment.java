package p002es.gob.radarcovid.features.onboarding.pages.legal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p002es.gob.radarcovid.common.view.LabelTextView;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p012b.p068j.p070b.p071b.p074c.C0623a;
import p003f.p004a.p005a.p012b.p068j.p070b.p071b.p074c.C0625c;
import p003f.p004a.p005a.p012b.p068j.p070b.p071b.p076e.C0627a;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.features.onboarding.pages.legal.view.LegalInfoFragment */
public final class LegalInfoFragment extends C0706e implements C0625c {

    /* renamed from: e0 */
    public C0623a f1751e0;

    /* renamed from: f0 */
    public HashMap f1752f0;

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_legal_info, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: a */
    public void mo788a(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            C0623a aVar = this.f1751e0;
            if (aVar != null) {
                aVar.mo3818d();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo3179a(boolean z) {
        LabelButton labelButton = (LabelButton) mo3180d(C0699d.buttonAccept);
        C4638h.m10270a((Object) labelButton, "buttonAccept");
        labelButton.setEnabled(z);
    }

    /* renamed from: d */
    public View mo3180d(int i) {
        if (this.f1752f0 == null) {
            this.f1752f0 = new HashMap();
        }
        View view = (View) this.f1752f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1752f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1752f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: l */
    public void mo3181l() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) mo3180d(C0699d.checkBoxTermsAndConditions);
        C4638h.m10270a((Object) appCompatCheckBox, "checkBoxTermsAndConditions");
        appCompatCheckBox.setChecked(true);
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1752f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: t0 */
    public final C0623a mo3182t0() {
        C0623a aVar = this.f1751e0;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            ((AppCompatCheckBox) mo3180d(C0699d.checkBoxTermsAndConditions)).setOnCheckedChangeListener(new C0627a(this));
            ((LabelTextView) mo3180d(C0699d.textViewPrivacyPolicy)).setOnClickListener(new C0383e(0, this));
            ((LabelTextView) mo3180d(C0699d.textViewUsageConditions)).setOnClickListener(new C0383e(1, this));
            ((LabelButton) mo3180d(C0699d.buttonAccept)).setOnClickListener(new C0383e(2, this));
            C0623a aVar = this.f1751e0;
            if (aVar != null) {
                aVar.mo3814a();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }
}
