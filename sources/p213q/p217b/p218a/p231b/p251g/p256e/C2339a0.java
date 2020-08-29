package p213q.p217b.p218a.p231b.p251g.p256e;

import android.util.Log;
import android.util.Pair;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h.C2463a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h.C2465c;
import p213q.p217b.p218a.p231b.p259h.p261b.C2994i6;

/* renamed from: q.b.a.b.g.e.a0 */
public final class C2339a0 extends C2463a {

    /* renamed from: i */
    public final /* synthetic */ C2994i6 f6300i;

    /* renamed from: j */
    public final /* synthetic */ C2462h f6301j;

    public C2339a0(C2462h hVar, C2994i6 i6Var) {
        this.f6301j = hVar;
        this.f6300i = i6Var;
        super(true);
    }

    /* renamed from: a */
    public final void mo7349a() {
        for (int i = 0; i < this.f6301j.f6559e.size(); i++) {
            if (this.f6300i.equals(((Pair) this.f6301j.f6559e.get(i)).first)) {
                Log.w(this.f6301j.f6555a, "OnEventListener already registered.");
                return;
            }
        }
        C2465c cVar = new C2465c(this.f6300i);
        this.f6301j.f6559e.add(new Pair(this.f6300i, cVar));
        this.f6301j.f6562h.registerOnMeasurementEventListener(cVar);
    }
}
