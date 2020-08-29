package p003f.p004a.p005a.p012b.p087k.p098c.p102d;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p087k.p098c.p101c.C0674a;
import p003f.p004a.p005a.p012b.p087k.p098c.p101c.C0675b;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p003f.p004a.p005a.p108g.p114c.C0836c;
import p003f.p004a.p005a.p108g.p114c.C0846i;
import p003f.p004a.p005a.p108g.p114c.C0849k;
import p003f.p004a.p005a.p108g.p114c.C0851m;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p124p.p170k.p171a.C1482e;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.c.d.a */
public final class C0676a extends C0706e implements C0675b {

    /* renamed from: e0 */
    public C0674a f2113e0;

    /* renamed from: f0 */
    public HashMap f2114f0;

    /* renamed from: f.a.a.b.k.c.d.a$a */
    public interface C0677a {
        /* renamed from: a */
        void mo3197a(C0857b bVar);
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_question, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: b */
    public void mo3854b(C0857b bVar) {
        C0677a aVar = null;
        if (bVar != null) {
            C1482e Q = mo777Q();
            if (Q instanceof C0677a) {
                aVar = Q;
            }
            C0677a aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.mo3197a(bVar);
                return;
            }
            return;
        }
        C4638h.m10271a("answers");
        throw null;
    }

    /* renamed from: c */
    public C0857b mo3855c() {
        View childAt = ((FrameLayout) mo3857d(C0699d.wrapperQuestion)).getChildAt(0);
        if (childAt != null) {
            return ((C0836c) childAt).getSelectedAnswers();
        }
        throw new C4557i("null cannot be cast to non-null type es.gob.radarcovid.common.view.AnswerView");
    }

    /* renamed from: d */
    public View mo3857d(int i) {
        if (this.f2114f0 == null) {
            this.f2114f0 = new HashMap();
        }
        View view = (View) this.f2114f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = this.f594K;
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f2114f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f2114f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f2114f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: t */
    public void mo3856t() {
        LabelButton labelButton = (LabelButton) mo3857d(C0699d.buttonNext);
        C4638h.m10270a((Object) labelButton, "buttonNext");
        C0500a s0 = mo3883s0();
        labelButton.setText(s0.mo3714a("POLL_END_BUTON", s0.f1897b.getText(R.string.poll_button_finish)));
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            Bundle bundle2 = this.f615j;
            if (bundle2 != null) {
                C0674a aVar = this.f2113e0;
                if (aVar != null) {
                    boolean z = bundle2.getBoolean("arg_is_last_question", false);
                    C0857b bVar = (C0857b) bundle2.getParcelable("arg_question");
                    if (bVar == null) {
                        bVar = new C0857b(0, null, null, null, 0, 0, 0, 0, 255);
                    }
                    aVar.mo3852a(z, bVar);
                } else {
                    C4638h.m10273b("presenter");
                    throw null;
                }
            }
            ((LabelButton) mo3857d(C0699d.buttonNext)).setOnClickListener(new C0678b(this));
            return;
        }
        C4638h.m10271a("view");
        throw null;
    }

    /* renamed from: a */
    public void mo3853a(C0857b bVar) {
        View view;
        FrameLayout frameLayout;
        if (bVar != null) {
            int ordinal = bVar.f2435f.ordinal();
            String str = "textViewQuestion";
            String str2 = "context!!";
            if (ordinal == 0) {
                frameLayout = (FrameLayout) mo3857d(C0699d.wrapperQuestion);
                Context U = mo781U();
                if (U != null) {
                    C4638h.m10270a((Object) U, str2);
                    C0851m mVar = new C0851m(U, null, 0, 6);
                    mVar.setQuestion(bVar);
                    view = mVar;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else if (ordinal == 1 || ordinal == 2) {
                frameLayout = (FrameLayout) mo3857d(C0699d.wrapperQuestion);
                Context U2 = mo781U();
                if (U2 != null) {
                    C4638h.m10270a((Object) U2, str2);
                    C0846i iVar = new C0846i(U2, null, 0, 6);
                    iVar.setQuestion(bVar);
                    view = iVar;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else if (ordinal == 3) {
                frameLayout = (FrameLayout) mo3857d(C0699d.wrapperQuestion);
                Context U3 = mo781U();
                if (U3 != null) {
                    C4638h.m10270a((Object) U3, str2);
                    C0849k kVar = new C0849k(U3, null, 0, 6);
                    kVar.setQuestion(bVar);
                    view = kVar;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                return;
            }
            frameLayout.addView(view);
            TextView textView = (TextView) mo3857d(C0699d.textViewQuestion);
            C4638h.m10270a((Object) textView, str);
            textView.setText(bVar.f2436g);
            return;
        }
        C4638h.m10271a("question");
        throw null;
    }
}
