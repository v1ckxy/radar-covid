package p003f.p004a.p005a.p012b.p050g.p054d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import p002es.gob.radarcovid.features.splash.view.SplashActivity;
import p003f.p004a.p005a.p012b.p050g.p053c.C0581b;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.d.a */
public final class C0583a implements C0581b {

    /* renamed from: a */
    public final Context f2013a;

    public C0583a(Context context) {
        if (context != null) {
            this.f2013a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3789a() {
        Context context = this.f2013a;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.finish();
        }
        Context context2 = this.f2013a;
        Intent intent = new Intent(this.f2013a, SplashActivity.class);
        intent.setFlags(67108864);
        context2.startActivity(intent);
    }
}
