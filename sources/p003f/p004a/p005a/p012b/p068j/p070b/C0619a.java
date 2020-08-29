package p003f.p004a.p005a.p012b.p068j.p070b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p012b.p068j.p086f.C0650a;
import p124p.p170k.p171a.C1482e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.b.a */
public final class C0619a extends Fragment {

    /* renamed from: b0 */
    public HashMap f2061b0;

    /* renamed from: f.a.a.b.j.b.a$a */
    public static final class C0620a implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C0619a f2062e;

        public C0620a(C0619a aVar) {
            this.f2062e = aVar;
        }

        public final void onClick(View view) {
            C1482e Q = this.f2062e.mo777Q();
            if (!(Q instanceof C0650a)) {
                Q = null;
            }
            C0650a aVar = (C0650a) Q;
            if (aVar != null) {
                aVar.mo3185a(true);
            }
        }
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_activation_page, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        this.f592I = true;
        HashMap hashMap = this.f2061b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        View view2 = null;
        if (view != null) {
            int i = C0699d.buttonContinue;
            if (this.f2061b0 == null) {
                this.f2061b0 = new HashMap();
            }
            View view3 = (View) this.f2061b0.get(Integer.valueOf(i));
            if (view3 == null) {
                View view4 = this.f594K;
                if (view4 != null) {
                    view2 = view4.findViewById(i);
                    this.f2061b0.put(Integer.valueOf(i), view2);
                }
            } else {
                view2 = view3;
            }
            ((LabelButton) view2).setOnClickListener(new C0620a(this));
            return;
        }
        C4638h.m10271a("view");
        throw null;
    }
}
