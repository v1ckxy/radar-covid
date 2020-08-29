package p003f.p004a.p005a.p012b.p068j.p070b.p077c.p082e;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import es.gob.radarcovid.R;
import java.util.HashMap;
import p002es.gob.radarcovid.common.view.LabelButton;
import p002es.gob.radarcovid.features.locale.view.LocaleSelectionFragment;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p050g.p053c.C0580a;
import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p080c.C0634a;
import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p080c.C0636c;
import p003f.p004a.p005a.p012b.p068j.p086f.C0650a;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p124p.p170k.p171a.C1482e;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.b.j.b.c.e.b */
public final class C0640b extends C0706e implements C0636c {

    /* renamed from: e0 */
    public C0634a f2079e0;

    /* renamed from: f0 */
    public HashMap f2080f0;

    /* renamed from: f.a.a.b.j.b.c.e.b$a */
    public static final class C0641a extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C0640b f2081f;

        public C0641a(C0640b bVar) {
            this.f2081f = bVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                C0634a aVar = this.f2081f.f2079e0;
                if (aVar != null) {
                    aVar.mo3824c();
                    return C4560l.f10773a;
                }
                C4638h.m10273b("presenter");
                throw null;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: f.a.a.b.j.b.c.e.b$b */
    public static final class C0642b extends C4639i implements C4618l<C1034d, C4560l> {

        /* renamed from: f */
        public static final C0642b f2082f = new C0642b();

        public C0642b() {
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            C1034d dVar = (C1034d) obj;
            if (dVar != null) {
                dVar.dismiss();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: J */
    public boolean mo3825J() {
        Fragment a = mo780T().mo6087a((int) R.id.fragmentLocaleSelection);
        if (a != null) {
            C0580a aVar = ((LocaleSelectionFragment) a).f1744e0;
            if (aVar != null) {
                return aVar.mo3788c();
            }
            C4638h.m10273b("presenter");
            throw null;
        }
        throw new C4557i("null cannot be cast to non-null type es.gob.radarcovid.features.locale.view.LocaleSelectionFragment");
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_welcome, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: b */
    public void mo3826b() {
        Fragment a = mo780T().mo6087a((int) R.id.fragmentLocaleSelection);
        if (a != null) {
            C0580a aVar = ((LocaleSelectionFragment) a).f1744e0;
            if (aVar != null) {
                aVar.mo3787b();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            throw new C4557i("null cannot be cast to non-null type es.gob.radarcovid.features.locale.view.LocaleSelectionFragment");
        }
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
        HashMap hashMap = this.f2080f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: r0 */
    public void mo3158r0() {
        HashMap hashMap = this.f2080f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: s */
    public void mo3827s() {
        C1482e Q = mo777Q();
        if (!(Q instanceof C0650a)) {
            Q = null;
        }
        C0650a aVar = (C0650a) Q;
        if (aVar != null) {
            aVar.mo3186b();
        }
    }

    /* renamed from: y */
    public void mo3828y() {
        Context U = mo781U();
        if (U != null) {
            C4638h.m10270a((Object) U, "context!!");
            C0837d dVar = new C0837d(U);
            C0500a s0 = mo3883s0();
            dVar.mo3896a(s0.mo3714a("LOCALE_CHANGE_WARNING", s0.f1897b.getText(R.string.locale_selection_warning_message)).toString());
            C0500a s02 = mo3883s0();
            dVar.mo3900b(s02.mo3714a("ALERT_ACCEPT_BUTTON", s02.f1897b.getText(R.string.accept)).toString(), new C0641a(this));
            dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0642b.f2082f);
            dVar.f2398g.show();
            return;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            int i = C0699d.buttonContinue;
            if (this.f2080f0 == null) {
                this.f2080f0 = new HashMap();
            }
            View view2 = (View) this.f2080f0.get(Integer.valueOf(i));
            if (view2 == null) {
                View view3 = this.f594K;
                if (view3 == null) {
                    view2 = null;
                } else {
                    view2 = view3.findViewById(i);
                    this.f2080f0.put(Integer.valueOf(i), view2);
                }
            }
            ((LabelButton) view2).setOnClickListener(new C0639a(this));
            C0634a aVar = this.f2079e0;
            if (aVar != null) {
                aVar.mo3822a();
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
