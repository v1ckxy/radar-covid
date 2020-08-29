package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p213q.p217b.p218a.p271c.p279h0.C3357a;
import p213q.p217b.p218a.p271c.p279h0.C3360d;
import p213q.p217b.p218a.p271c.p279h0.C3362e;
import p213q.p217b.p218a.p271c.p279h0.C3362e.C3364b;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: j */
    public final C3357a f1354j = new C3357a(this);

    /* renamed from: a */
    public boolean mo1688a(View view) {
        if (this.f1354j != null) {
            return view instanceof C3360d;
        }
        throw null;
    }

    /* renamed from: a */
    public boolean mo662a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f1354j != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (C3362e.f8473c == null) {
                        C3362e.f8473c = new C3362e();
                    }
                    C3362e.f8473c.mo9130b(null);
                }
            } else if (coordinatorLayout.mo603a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (C3362e.f8473c == null) {
                    C3362e.f8473c = new C3362e();
                }
                C3362e.f8473c.mo9128a((C3364b) null);
            }
            return super.mo662a(coordinatorLayout, view, motionEvent);
        }
        throw null;
    }
}
