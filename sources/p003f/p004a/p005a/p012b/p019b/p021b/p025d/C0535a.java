package p003f.p004a.p005a.p012b.p019b.p021b.p025d;

import android.content.Context;
import android.content.Intent;
import p002es.gob.radarcovid.features.covidreport.confirmation.ConfirmationActivity;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0533b;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.b.b.d.a */
public final class C0535a implements C0533b {

    /* renamed from: a */
    public final Context f1955a;

    public C0535a(Context context) {
        if (context != null) {
            this.f1955a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3756a() {
        Context context = this.f1955a;
        if (context != null) {
            context.startActivity(new Intent(context, ConfirmationActivity.class));
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }
}
