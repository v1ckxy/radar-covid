package p003f.p004a.p005a.p108g.p109a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.C0007b;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p108g.p114c.C0843g;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1034d.C1035a;
import p124p.p170k.p171a.C1482e;
import p365r.p366a.p367f.C4425c;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.a.e */
public abstract class C0706e extends C4425c {

    /* renamed from: c0 */
    public C0843g f2157c0;

    /* renamed from: d0 */
    public C0500a f2158d0;

    /* renamed from: B */
    public final void mo3880B() {
        C0843g gVar = this.f2157c0;
        if (gVar != null) {
            gVar.dismiss();
        }
        Context U = mo781U();
        if (U != null) {
            C4638h.m10270a((Object) U, "context!!");
            C0843g gVar2 = new C0843g(U);
            this.f2157c0 = gVar2;
            if (gVar2 != null) {
                gVar2.setCanceledOnTouchOutside(false);
            }
            C0843g gVar3 = this.f2157c0;
            if (gVar3 != null) {
                gVar3.setCancelable(false);
            }
            C0843g gVar4 = this.f2157c0;
            if (gVar4 != null && !gVar4.isShowing()) {
                gVar4.show();
                return;
            }
            return;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public final void mo3881a(Throwable th) {
        String str;
        if (th != null) {
            String str2 = "labelManager";
            if (th.getMessage() == null) {
                C0500a aVar = this.f2158d0;
                if (aVar != null) {
                    str = aVar.mo3714a("ALERT_GENERIC_ERROR_TITLE", aVar.f1897b.getText(R.string.error_generic_title)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            } else {
                str = Objects.EMPTY_STRING;
            }
            String message = th.getMessage();
            if (message == null) {
                C0500a aVar2 = this.f2158d0;
                if (aVar2 != null) {
                    message = aVar2.mo3714a("ALERT_GENERIC_ERROR_CONTENT", aVar2.f1897b.getText(R.string.error_generic_message)).toString();
                } else {
                    C4638h.m10273b(str2);
                    throw null;
                }
            }
            C0500a aVar3 = this.f2158d0;
            if (aVar3 != null) {
                String obj = aVar3.mo3714a("ALERT_ACCEPT_BUTTON", aVar3.f1897b.getText(R.string.accept)).toString();
                C0843g gVar = this.f2157c0;
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

    /* renamed from: h0 */
    public void mo813h0() {
        this.f592I = true;
        C0843g gVar = this.f2157c0;
        if (gVar != null) {
            gVar.dismiss();
        }
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        this.f592I = true;
        mo3158r0();
    }

    /* renamed from: r0 */
    public abstract void mo3158r0();

    /* renamed from: s0 */
    public final C0500a mo3883s0() {
        C0500a aVar = this.f2158d0;
        if (aVar != null) {
            return aVar;
        }
        C4638h.m10273b("labelManager");
        throw null;
    }

    /* renamed from: v */
    public final void mo3884v() {
        C0843g gVar = this.f2157c0;
        if (gVar != null) {
            gVar.hide();
        }
    }

    /* renamed from: a */
    public final void mo3882a(Throwable th, boolean z) {
        if (th != null) {
            String str = "labelManager";
            if (th.getMessage() == null) {
                C0500a aVar = this.f2158d0;
                if (aVar != null) {
                    aVar.mo3714a("ALERT_GENERIC_ERROR_TITLE", aVar.f1897b.getText(R.string.error_generic_title)).toString();
                } else {
                    C4638h.m10273b(str);
                    throw null;
                }
            }
            String message = th.getMessage();
            if (message == null) {
                C0500a aVar2 = this.f2158d0;
                if (aVar2 != null) {
                    message = aVar2.mo3714a("ALERT_GENERIC_ERROR_CONTENT", aVar2.f1897b.getText(R.string.error_generic_message)).toString();
                } else {
                    C4638h.m10273b(str);
                    throw null;
                }
            }
            C1482e Q = mo777Q();
            if (Q != null && !Q.isFinishing()) {
                Context U = mo781U();
                if (U != null) {
                    C1035a aVar3 = new C1035a(U);
                    Context U2 = mo781U();
                    if (U2 != null) {
                        View inflate = LayoutInflater.from(U2).inflate(R.layout.dialog_error, null);
                        View findViewById = inflate.findViewById(R.id.textViewErrorMessage);
                        C4638h.m10270a((Object) findViewById, "view.findViewById<TextVi….id.textViewErrorMessage)");
                        ((TextView) findViewById).setText(message);
                        C0007b bVar = aVar3.f2683a;
                        bVar.f86r = inflate;
                        bVar.f85q = 0;
                        bVar.f87s = false;
                        C0705d dVar = new C0705d(this, z);
                        C0007b bVar2 = aVar3.f2683a;
                        bVar2.f77i = bVar2.f69a.getText(17039370);
                        aVar3.f2683a.f78j = dVar;
                        C1034d a = aVar3.mo4425a();
                        C4638h.m10270a((Object) a, "builder.create()");
                        a.show();
                        return;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                C4638h.m10269a();
                throw null;
            }
            return;
        }
        C4638h.m10271a("error");
        throw null;
    }
}
