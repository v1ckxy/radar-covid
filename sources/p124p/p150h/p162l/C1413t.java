package p124p.p150h.p162l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.lang.ref.WeakReference;
import p124p.p126b.p127k.C1065r;

/* renamed from: p.h.l.t */
public final class C1413t {

    /* renamed from: a */
    public WeakReference<View> f4179a;

    /* renamed from: b */
    public Runnable f4180b = null;

    /* renamed from: c */
    public Runnable f4181c = null;

    /* renamed from: d */
    public int f4182d = -1;

    /* renamed from: p.h.l.t$a */
    public class C1414a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1416u f4183a;

        /* renamed from: b */
        public final /* synthetic */ View f4184b;

        public C1414a(C1413t tVar, C1416u uVar, View view) {
            this.f4183a = uVar;
            this.f4184b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4183a.mo5020a(this.f4184b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4183a.mo4498b(this.f4184b);
        }

        public void onAnimationStart(Animator animator) {
            this.f4183a.mo4521c(this.f4184b);
        }
    }

    /* renamed from: p.h.l.t$b */
    public class C1415b implements AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C1418w f4185a;

        /* renamed from: b */
        public final /* synthetic */ View f4186b;

        public C1415b(C1413t tVar, C1418w wVar, View view) {
            this.f4185a = wVar;
            this.f4186b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C1065r.this.f2815d.getParent()).invalidate();
        }
    }

    public C1413t(View view) {
        this.f4179a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C1413t mo5910a(float f) {
        View view = (View) this.f4179a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C1413t mo5911a(long j) {
        View view = (View) this.f4179a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C1413t mo5912a(C1416u uVar) {
        View view = (View) this.f4179a.get();
        if (view != null) {
            mo5915a(view, uVar);
        }
        return this;
    }

    /* renamed from: a */
    public C1413t mo5913a(C1418w wVar) {
        View view = (View) this.f4179a.get();
        if (view != null) {
            C1415b bVar = null;
            if (wVar != null) {
                bVar = new C1415b(this, wVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public void mo5914a() {
        View view = (View) this.f4179a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public final void mo5915a(View view, C1416u uVar) {
        if (uVar != null) {
            view.animate().setListener(new C1414a(this, uVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C1413t mo5916b(float f) {
        View view = (View) this.f4179a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
