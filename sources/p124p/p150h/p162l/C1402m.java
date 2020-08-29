package p124p.p150h.p162l;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: p.h.l.m */
public final class C1402m implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: e */
    public final View f4162e;

    /* renamed from: f */
    public ViewTreeObserver f4163f;

    /* renamed from: g */
    public final Runnable f4164g;

    public C1402m(View view, Runnable runnable) {
        this.f4162e = view;
        this.f4163f = view.getViewTreeObserver();
        this.f4164g = runnable;
    }

    /* renamed from: a */
    public static C1402m m3504a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C1402m mVar = new C1402m(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(mVar);
            view.addOnAttachStateChangeListener(mVar);
            return mVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: a */
    public void mo5896a() {
        (this.f4163f.isAlive() ? this.f4163f : this.f4162e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f4162e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo5896a();
        this.f4164g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f4163f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo5896a();
    }
}
