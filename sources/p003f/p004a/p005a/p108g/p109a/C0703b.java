package p003f.p004a.p005a.p108g.p109a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p003f.p004a.p005a.p108g.p114c.C0843g;
import p365r.p366a.p367f.C4423a;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.a.b */
public abstract class C0703b extends C4423a {

    /* renamed from: u */
    public C0843g f2153u;

    /* renamed from: v */
    public C0500a f2154v;

    /* renamed from: B */
    public final void mo3872B() {
        C0843g gVar = this.f2153u;
        if (gVar != null) {
            gVar.dismiss();
        }
        C0843g gVar2 = new C0843g(this);
        this.f2153u = gVar2;
        if (gVar2 != null) {
            gVar2.setCanceledOnTouchOutside(false);
        }
        C0843g gVar3 = this.f2153u;
        if (gVar3 != null) {
            gVar3.setCancelable(false);
        }
        C0843g gVar4 = this.f2153u;
        if (gVar4 != null && !gVar4.isShowing()) {
            gVar4.show();
        }
    }

    /* renamed from: R */
    public final C0500a mo3873R() {
        C0500a aVar = this.f2154v;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("labelManager");
        throw null;
    }

    /* renamed from: S */
    public final void mo3874S() {
        try {
            Object systemService = getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = getCurrentFocus();
                inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
                return;
            }
            throw new C4557i("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo3875a(Throwable th) {
        String str;
        if (th != null) {
            String str2 = "labelManager";
            if (th.getMessage() == null) {
                C0500a aVar = this.f2154v;
                if (aVar != null) {
                    str = aVar.mo3714a("ALERT_GENERIC_ERROR_TITLE", aVar.f1897b.getText(R.string.error_generic_title)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            } else {
                str = null;
            }
            String message = th.getMessage();
            if (message == null) {
                C0500a aVar2 = this.f2154v;
                if (aVar2 != null) {
                    message = aVar2.mo3714a("ALERT_GENERIC_ERROR_CONTENT", aVar2.f1897b.getText(R.string.error_generic_message)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            }
            C0500a aVar3 = this.f2154v;
            if (aVar3 != null) {
                String obj = aVar3.mo3714a("ALERT_ACCEPT_BUTTON", aVar3.f1897b.getText(R.string.accept)).toString();
                C0843g gVar = this.f2153u;
                if (gVar != null) {
                    gVar.mo3918a(str, message, obj);
                    return;
                }
                return;
            }
            C4638h.m10273b(str2);
            throw null;
        }
        C4638h.m10271a("error");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C0843g gVar = this.f2153u;
        if (gVar != null) {
            gVar.dismiss();
        }
    }

    /* renamed from: v */
    public final void mo3878v() {
        C0843g gVar = this.f2153u;
        if (gVar != null) {
            gVar.hide();
        }
    }

    /* renamed from: a */
    public final void mo3876a(Throwable th, boolean z) {
        String str;
        if (th != null) {
            String str2 = "labelManager";
            if (th.getMessage() == null) {
                C0500a aVar = this.f2154v;
                if (aVar != null) {
                    str = aVar.mo3714a("ALERT_GENERIC_ERROR_TITLE", aVar.f1897b.getText(R.string.error_generic_title)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            } else {
                str = null;
            }
            String message = th.getMessage();
            if (message == null) {
                C0500a aVar2 = this.f2154v;
                if (aVar2 != null) {
                    message = aVar2.mo3714a("ALERT_GENERIC_ERROR_CONTENT", aVar2.f1897b.getText(R.string.error_generic_message)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            }
            if (!isFinishing()) {
                C0837d dVar = new C0837d(this);
                if (str != null) {
                    dVar.mo3899b(str);
                }
                dVar.mo3896a(message);
                C0500a aVar3 = this.f2154v;
                if (aVar3 != null) {
                    dVar.mo3900b(aVar3.mo3714a("ALERT_ACCEPT_BUTTON", aVar3.f1897b.getText(R.string.accept)).toString(), new C0702a(this, z));
                    dVar.f2398g.show();
                    return;
                }
                C4638h.m10273b(str2);
                throw null;
            }
            return;
        }
        C4638h.m10271a("error");
        throw null;
    }
}
