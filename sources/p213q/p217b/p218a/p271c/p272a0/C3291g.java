package p213q.p217b.p218a.p271c.p272a0;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: q.b.a.c.a0.g */
public class C3291g implements OnPreDrawListener {

    /* renamed from: e */
    public final /* synthetic */ C3281e f8226e;

    public C3291g(C3281e eVar) {
        this.f8226e = eVar;
    }

    public boolean onPreDraw() {
        C3281e eVar = this.f8226e;
        float rotation = eVar.f8210t.getRotation();
        if (eVar.f8204n != rotation) {
            eVar.f8204n = rotation;
            eVar.mo8977l();
        }
        return true;
    }
}
