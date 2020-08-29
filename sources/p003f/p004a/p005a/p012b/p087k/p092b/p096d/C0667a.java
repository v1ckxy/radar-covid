package p003f.p004a.p005a.p012b.p087k.p092b.p096d;

import android.app.Activity;
import android.content.Context;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0665b;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.b.d.a */
public final class C0667a implements C0665b {

    /* renamed from: a */
    public final Context f2105a;

    public C0667a(Context context) {
        if (context != null) {
            this.f2105a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3848a() {
        Context context = this.f2105a;
        if (context != null) {
            Activity activity = (Activity) context;
            activity.setResult(-1);
            activity.finish();
            return;
        }
        throw new C4557i("null cannot be cast to non-null type android.app.Activity");
    }
}
