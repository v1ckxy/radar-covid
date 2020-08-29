package p213q.p217b.p218a.p271c.p281j0;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: q.b.a.c.j0.i */
public class C3386i implements OnTouchListener {

    /* renamed from: e */
    public final /* synthetic */ AutoCompleteTextView f8510e;

    /* renamed from: f */
    public final /* synthetic */ C3380h f8511f;

    public C3386i(C3380h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f8511f = hVar;
        this.f8510e = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f8511f.mo9150c()) {
                this.f8511f.f8496g = false;
            }
            C3380h.m7777a(this.f8511f, this.f8510e);
            view.performClick();
        }
        return false;
    }
}
