package p003f.p004a.p005a.p012b.p013a.p018e;

import android.content.Context;
import android.content.Intent;
import p002es.gob.radarcovid.features.covidreport.confirmation.ConfirmationActivity;
import p002es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity;
import p002es.gob.radarcovid.features.exposure.view.ExposureActivity;
import p003f.p004a.p005a.p012b.p013a.p017d.C0516b;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.e.a */
public final class C0518a implements C0516b {

    /* renamed from: a */
    public final Context f1929a;

    public C0518a(Context context) {
        if (context != null) {
            this.f1929a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3743a() {
        Context context = this.f1929a;
        if (context != null) {
            context.startActivity(new Intent(context, ExposureActivity.class));
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo3744b() {
        Context context = this.f1929a;
        if (context != null) {
            context.startActivity(new Intent(context, ConfirmationActivity.class));
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo3745c() {
        this.f1929a.startActivity(new Intent("com.google.android.gms.settings.EXPOSURE_NOTIFICATION_SETTINGS"));
    }

    /* renamed from: d */
    public void mo3746d() {
        Context context = this.f1929a;
        if (context != null) {
            context.startActivity(new Intent(context, CovidReportActivity.class));
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }
}
