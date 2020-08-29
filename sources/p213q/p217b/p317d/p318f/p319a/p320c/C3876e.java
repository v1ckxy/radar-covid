package p213q.p217b.p317d.p318f.p319a.p320c;

import android.os.Bundle;
import p213q.p217b.p218a.p231b.p259h.p260a.C2889a.C2890a;
import p213q.p217b.p317d.p322h.C3908a;

/* renamed from: q.b.d.f.a.c.e */
public final class C3876e implements C2890a {

    /* renamed from: a */
    public final /* synthetic */ C3877f f9491a;

    public C3876e(C3877f fVar) {
        this.f9491a = fVar;
    }

    /* renamed from: a */
    public final void mo1622a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && (!C3872a.f9481a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            ((C3908a) this.f9491a.f9492a).mo10098a(3, bundle2);
        }
    }
}
