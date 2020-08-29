package p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.SwitchCompat;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.C0699d;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p013a.p015b.C0506a;
import p003f.p004a.p005a.p012b.p013a.p015b.C0509c;
import p003f.p004a.p005a.p108g.p114c.C0837d;
import p124p.p126b.p127k.C1034d;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;

/* renamed from: k */
/* compiled from: java-style lambda group */
public final class C0885k implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f2458e;

    /* renamed from: f */
    public final /* synthetic */ Object f2459f;

    public C0885k(int i, Object obj) {
        this.f2458e = i;
        this.f2459f = obj;
    }

    public final void onClick(View view) {
        int i = this.f2458e;
        if (i == 0) {
            SwitchCompat switchCompat = (SwitchCompat) ((C0506a) this.f2459f).mo3734d(C0699d.switchRadar);
            String str = "switchRadar";
            C4638h.m10270a((Object) switchCompat, str);
            if (!switchCompat.isChecked()) {
                SwitchCompat switchCompat2 = (SwitchCompat) ((C0506a) this.f2459f).mo3734d(C0699d.switchRadar);
                C4638h.m10270a((Object) switchCompat2, str);
                switchCompat2.setChecked(true);
                ((SwitchCompat) ((C0506a) this.f2459f).mo3734d(C0699d.switchRadar)).jumpDrawablesToCurrentState();
                C0506a aVar = (C0506a) this.f2459f;
                Context U = aVar.mo781U();
                if (U != null) {
                    C4638h.m10270a((Object) U, "context!!");
                    C0837d dVar = new C0837d(U);
                    C0500a s0 = aVar.mo3883s0();
                    dVar.mo3899b(s0.mo3714a("ALERT_HOME_RADAR_TITLE", s0.f1897b.getText(R.string.radar_warning_title)).toString());
                    C0500a s02 = aVar.mo3883s0();
                    dVar.mo3896a(s02.mo3714a("ALERT_HOME_RADAR_CONTENT", s02.f1897b.getText(R.string.radar_warning_message)).toString());
                    dVar.mo3898a((C4618l<? super C1034d, C4560l>) C0889n.f2466g);
                    C0500a s03 = aVar.mo3883s0();
                    dVar.mo3900b(s03.mo3714a("ALERT_HOME_RADAR_CANCEL_BUTTON", s03.f1897b.getText(R.string.radar_warning_button_positive)).toString(), C0889n.f2467h);
                    C0500a s04 = aVar.mo3883s0();
                    dVar.mo3897a(s04.mo3714a("ALERT_HOME_RADAR_OK_BUTTON", s04.f1897b.getText(R.string.radar_warning_button_negative)).toString(), new C0509c(aVar));
                    dVar.f2398g.show();
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                SwitchCompat switchCompat3 = (SwitchCompat) ((C0506a) this.f2459f).mo3734d(C0699d.switchRadar);
                C4638h.m10270a((Object) switchCompat3, str);
                switchCompat3.setChecked(false);
                ((SwitchCompat) ((C0506a) this.f2459f).mo3734d(C0699d.switchRadar)).jumpDrawablesToCurrentState();
                ((C0506a) this.f2459f).mo3740t0().mo3720b(false);
            }
        } else if (i == 1) {
            ((C0506a) this.f2459f).mo3740t0().mo3724f();
        } else if (i == 2) {
            ((C0506a) this.f2459f).mo3740t0().mo3723e();
        } else if (i == 3) {
            ((C0506a) this.f2459f).mo3740t0().mo3717a();
        } else {
            throw null;
        }
    }
}
