package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import java.util.List;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.p297z.C3497b;

public abstract class ExpandableBehavior extends C0068c<View> {

    /* renamed from: a */
    public int f1433a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C0253a implements OnPreDrawListener {

        /* renamed from: e */
        public final /* synthetic */ View f1434e;

        /* renamed from: f */
        public final /* synthetic */ int f1435f;

        /* renamed from: g */
        public final /* synthetic */ C3497b f1436g;

        public C0253a(View view, int i, C3497b bVar) {
            this.f1434e = view;
            this.f1435f = i;
            this.f1436g = bVar;
        }

        public boolean onPreDraw() {
            this.f1434e.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1433a == this.f1435f) {
                C3497b bVar = this.f1436g;
                expandableBehavior.mo2318a((View) bVar, this.f1434e, bVar.mo2060a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public abstract boolean mo2318a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    public boolean mo658a(CoordinatorLayout coordinatorLayout, View view, int i) {
        C3497b bVar;
        if (!C1404o.m3563x(view)) {
            List a = coordinatorLayout.mo595a(view);
            int size = a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    bVar = null;
                    break;
                }
                View view2 = (View) a.get(i2);
                if (mo663a(coordinatorLayout, view, view2)) {
                    bVar = (C3497b) view2;
                    break;
                }
                i2++;
            }
            if (bVar != null && mo2319a(bVar.mo2060a())) {
                int i3 = bVar.mo2060a() ? 1 : 2;
                this.f1433a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new C0253a(view, i3, bVar));
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo2319a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f1433a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f1433a == 1) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo668b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C3497b bVar = (C3497b) view2;
        if (!mo2319a(bVar.mo2060a())) {
            return false;
        }
        this.f1433a = bVar.mo2060a() ? 1 : 2;
        return mo2318a((View) bVar, view, bVar.mo2060a(), true);
    }
}
