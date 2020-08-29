package p003f.p004a.p005a.p012b.p062i.p067e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelTextView;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p012b.p062i.p065c.C0608a;
import p003f.p004a.p005a.p012b.p062i.p065c.C0610c;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.i.e.a */
public final class C0613a extends C0706e implements C0610c {

    /* renamed from: e0 */
    public C0608a f2051e0;

    /* renamed from: f0 */
    public HashMap f2052f0;

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_my_data, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: d */
    public View mo3812d(int i) {
        if (this.f2052f0 == null) {
            this.f2052f0 = new HashMap();
        }
        View view = (View) this.f2052f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f2052f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f2052f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f2052f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            ((LabelTextView) mo3812d(C0699d.textViewConditions)).setOnClickListener(new C0887l(0, this));
            ((LabelTextView) mo3812d(C0699d.textViewPrivacy)).setOnClickListener(new C0887l(1, this));
            C0608a aVar = this.f2051e0;
            if (aVar != null) {
                aVar.mo3807a();
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
