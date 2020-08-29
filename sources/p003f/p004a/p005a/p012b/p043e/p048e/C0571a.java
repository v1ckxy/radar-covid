package p003f.p004a.p005a.p012b.p043e.p048e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelTextView;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p012b.p043e.p046c.C0567a;
import p003f.p004a.p005a.p012b.p043e.p046c.C0569c;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.e.e.a */
public final class C0571a extends C0706e implements C0569c {

    /* renamed from: e0 */
    public C0567a f1987e0;

    /* renamed from: f0 */
    public HashMap f1988f0;

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_helpline, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: d */
    public View mo3779d(int i) {
        if (this.f1988f0 == null) {
            this.f1988f0 = new HashMap();
        }
        View view = (View) this.f1988f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f1988f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f1988f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f1988f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: t0 */
    public final C0567a mo3780t0() {
        C0567a aVar = this.f1987e0;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("presenter");
        throw null;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            ((LabelTextView) mo3779d(C0699d.textViewFaqsWebUrl)).setOnClickListener(new C0884j(0, this));
            ((LabelTextView) mo3779d(C0699d.textViewInfoWebUrl)).setOnClickListener(new C0884j(1, this));
            ((LabelTextView) mo3779d(C0699d.textViewOtherWebUrl)).setOnClickListener(new C0884j(2, this));
            C0567a aVar = this.f1987e0;
            if (aVar != null) {
                aVar.mo3776a();
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
