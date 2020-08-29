package p003f.p004a.p005a.p012b.p013a.p015b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.a.b.b */
public final class C0508b implements OnTouchListener {

    /* renamed from: e */
    public static final C0508b f1919e = new C0508b();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4638h.m10270a((Object) motionEvent, "event");
        return motionEvent.getActionMasked() == 2;
    }
}
