package p124p.p191u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p124p.p150h.p162l.C1404o;
import p124p.p191u.C1718i.C1722d;

/* renamed from: p.u.c */
public class C1700c extends C1709d0 {

    /* renamed from: p.u.c$a */
    public class C1701a extends C1725l {

        /* renamed from: a */
        public final /* synthetic */ View f4982a;

        public C1701a(C1700c cVar, View view) {
            this.f4982a = view;
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            C1739v.f5079a.mo6509a(this.f4982a, 1.0f);
            C1739v.f5079a.mo6539a(this.f4982a);
            iVar.mo6574b((C1722d) this);
        }
    }

    /* renamed from: p.u.c$b */
    public static class C1702b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f4983a;

        /* renamed from: b */
        public boolean f4984b = false;

        public C1702b(View view) {
            this.f4983a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1739v.f5079a.mo6509a(this.f4983a, 1.0f);
            if (this.f4984b) {
                this.f4983a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C1404o.m3560u(this.f4983a) && this.f4983a.getLayerType() == 0) {
                this.f4984b = true;
                this.f4983a.setLayerType(2, null);
            }
        }
    }

    public C1700c(int i) {
        if ((i & -4) == 0) {
            this.f4999M = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public final Animator mo6541a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1739v.f5079a.mo6509a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1739v.f5080b, new float[]{f2});
        ofFloat.addListener(new C1702b(view));
        mo6565a((C1722d) new C1701a(this, view));
        return ofFloat;
    }

    /* renamed from: c */
    public void mo6517c(C1734q qVar) {
        mo6548d(qVar);
        qVar.f5070a.put("android:fade:transitionAlpha", Float.valueOf(C1739v.m4376b(qVar.f5071b)));
    }

    /* renamed from: a */
    public Animator mo6542a(ViewGroup viewGroup, View view, C1734q qVar, C1734q qVar2) {
        float f;
        C1739v.f5079a.mo6540c(view);
        if (qVar != null) {
            Float f2 = (Float) qVar.f5070a.get("android:fade:transitionAlpha");
            if (f2 != null) {
                f = f2.floatValue();
                return mo6541a(view, f, 0.0f);
            }
        }
        f = 1.0f;
        return mo6541a(view, f, 0.0f);
    }
}
