package p213q.p217b.p218a.p271c.p295x;

import android.view.View;
import android.view.View.OnClickListener;
import p213q.p217b.p218a.p271c.p295x.C3468f.C3473e;

/* renamed from: q.b.a.c.x.j */
public class C3478j implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C3468f f8867e;

    public C3478j(C3468f fVar) {
        this.f8867e = fVar;
    }

    public void onClick(View view) {
        C3473e eVar;
        C3468f fVar = this.f8867e;
        C3473e eVar2 = fVar.f8846g0;
        if (eVar2 == C3473e.YEAR) {
            eVar = C3473e.DAY;
        } else if (eVar2 == C3473e.DAY) {
            eVar = C3473e.YEAR;
        } else {
            return;
        }
        fVar.mo9421a(eVar);
    }
}
