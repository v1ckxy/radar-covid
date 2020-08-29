package p003f.p004a.p005a.p012b.p103l.p107d;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p002es.gob.radarcovid.features.main.view.MainActivity;
import p002es.gob.radarcovid.features.onboarding.view.OnboardingActivity;
import p003f.p004a.p005a.p012b.p103l.p106c.C0694b;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.l.d.a */
public final class C0696a implements C0694b {

    /* renamed from: a */
    public final Context f2145a;

    public C0696a(Context context) {
        if (context != null) {
            this.f2145a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3867a() {
        String str = "android.intent.action.VIEW";
        try {
            this.f2145a.startActivity(new Intent(str, Uri.parse("market://details?id=com.google.android.gms")));
        } catch (ActivityNotFoundException unused) {
            Context context = this.f2145a;
            StringBuilder sb = new StringBuilder();
            sb.append("https://play.google.com/store/apps/details?id=");
            sb.append("com.google.android.gms");
            context.startActivity(new Intent(str, Uri.parse(sb.toString())));
        }
    }

    /* renamed from: b */
    public void mo3868b() {
        this.f2145a.startActivity(new Intent(this.f2145a, OnboardingActivity.class));
    }

    /* renamed from: c */
    public void mo3869c() {
        String str = "android.intent.action.VIEW";
        try {
            Context context = this.f2145a;
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(this.f2145a.getPackageName());
            context.startActivity(new Intent(str, Uri.parse(sb.toString())));
        } catch (Exception unused) {
            Context context2 = this.f2145a;
            StringBuilder a = C1965a.m4756a("https://play.google.com/store/apps/details?id=");
            a.append(this.f2145a.getPackageName());
            context2.startActivity(new Intent(str, Uri.parse(a.toString())));
        }
    }

    /* renamed from: d */
    public void mo3870d() {
        MainActivity.m1348a(this.f2145a, false);
    }
}
