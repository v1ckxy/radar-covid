package p213q.p217b.p218a.p271c.p281j0;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: q.b.a.c.j0.j */
public class C3387j implements OnFocusChangeListener {

    /* renamed from: e */
    public final /* synthetic */ C3380h f8512e;

    public C3387j(C3380h hVar) {
        this.f8512e = hVar;
    }

    public void onFocusChange(View view, boolean z) {
        this.f8512e.f8516a.setEndIconActivated(z);
        if (!z) {
            C3380h.m7778a(this.f8512e, false);
            this.f8512e.f8496g = false;
        }
    }
}
