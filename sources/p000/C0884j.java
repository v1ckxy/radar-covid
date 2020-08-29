package p000;

import android.view.View;
import android.view.View.OnClickListener;
import p002es.gob.radarcovid.common.view.LabelTextView;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p012b.p043e.p046c.C0567a;
import p003f.p004a.p005a.p012b.p043e.p048e.C0571a;
import p392u.p401r.p403c.C4638h;

/* renamed from: j */
/* compiled from: java-style lambda group */
public final class C0884j implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2456e;

    /* renamed from: f */
    public final /* synthetic */ Object f2457f;

    public C0884j(int i, Object obj) {
        this.f2456e = i;
        this.f2457f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2456e;
        if (i == 0) {
            C0567a t0 = ((C0571a) this.f2457f).mo3780t0();
            LabelTextView labelTextView = (LabelTextView) ((C0571a) this.f2457f).mo3779d(C0699d.textViewFaqsWebUrl);
            C4638h.m10270a((Object) labelTextView, "textViewFaqsWebUrl");
            t0.mo3777a(labelTextView.getText().toString());
        } else if (i == 1) {
            C0567a t02 = ((C0571a) this.f2457f).mo3780t0();
            LabelTextView labelTextView2 = (LabelTextView) ((C0571a) this.f2457f).mo3779d(C0699d.textViewInfoWebUrl);
            C4638h.m10270a((Object) labelTextView2, "textViewInfoWebUrl");
            t02.mo3777a(labelTextView2.getText().toString());
        } else if (i == 2) {
            C0567a t03 = ((C0571a) this.f2457f).mo3780t0();
            LabelTextView labelTextView3 = (LabelTextView) ((C0571a) this.f2457f).mo3779d(C0699d.textViewOtherWebUrl);
            C4638h.m10270a((Object) labelTextView3, "textViewOtherWebUrl");
            t03.mo3777a(labelTextView3.getText().toString());
        } else {
            throw null;
        }
    }
}
