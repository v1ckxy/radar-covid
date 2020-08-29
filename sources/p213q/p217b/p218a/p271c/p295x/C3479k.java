package p213q.p217b.p218a.p271c.p295x;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: q.b.a.c.x.k */
public class C3479k implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C3486q f8868e;

    /* renamed from: f */
    public final /* synthetic */ C3468f f8869f;

    public C3479k(C3468f fVar, C3486q qVar) {
        this.f8869f = fVar;
        this.f8868e = qVar;
    }

    public void onClick(View view) {
        int t = this.f8869f.mo9424r0().mo923t() + 1;
        if (t < this.f8869f.f8849j0.getAdapter().mo1178b()) {
            this.f8869f.mo9422a(this.f8868e.mo9449b(t));
        }
    }
}
