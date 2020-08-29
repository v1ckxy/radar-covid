package p213q.p217b.p317d.p347l;

import android.os.Bundle;
import java.io.IOException;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.d.l.a1 */
public final /* synthetic */ class C4217a1 implements Runnable {

    /* renamed from: e */
    public final C4220b1 f10163e;

    /* renamed from: f */
    public final String f10164f;

    /* renamed from: g */
    public final String f10165g;

    /* renamed from: h */
    public final String f10166h;

    /* renamed from: i */
    public final Bundle f10167i;

    /* renamed from: j */
    public final C3257j f10168j;

    public C4217a1(C4220b1 b1Var, String str, String str2, String str3, Bundle bundle, C3257j jVar) {
        this.f10163e = b1Var;
        this.f10164f = str;
        this.f10165g = str2;
        this.f10166h = str3;
        this.f10167i = bundle;
        this.f10168j = jVar;
    }

    public final void run() {
        C4220b1 b1Var = this.f10163e;
        String str = this.f10164f;
        String str2 = this.f10165g;
        String str3 = this.f10166h;
        Bundle bundle = this.f10167i;
        C3257j jVar = this.f10168j;
        if (b1Var != null) {
            try {
                b1Var.mo10406a(str, str2, str3, bundle);
                jVar.f8128a.mo8930a(b1Var.f10171c.mo10460a(bundle));
            } catch (IOException e) {
                jVar.f8128a.mo8929a((Exception) e);
            }
        } else {
            throw null;
        }
    }
}
