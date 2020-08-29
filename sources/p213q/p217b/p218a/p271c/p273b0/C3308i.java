package p213q.p217b.p218a.p271c.p273b0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p124p.p191u.C1718i;
import p124p.p191u.C1734q;

/* renamed from: q.b.a.c.b0.i */
public class C3308i extends C1718i {

    /* renamed from: q.b.a.c.b0.i$a */
    public class C3309a implements AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f8299a;

        public C3309a(C3308i iVar, TextView textView) {
            this.f8299a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f8299a.setScaleX(floatValue);
            this.f8299a.setScaleY(floatValue);
        }
    }

    /* renamed from: a */
    public Animator mo6515a(ViewGroup viewGroup, C1734q qVar, C1734q qVar2) {
        ValueAnimator valueAnimator = null;
        if (!(qVar == null || qVar2 == null || !(qVar.f5071b instanceof TextView))) {
            View view = qVar2.f5071b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Map<String, Object> map = qVar.f5070a;
                Map<String, Object> map2 = qVar2.f5070a;
                String str = "android:textscale:scale";
                float f = 1.0f;
                float floatValue = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
                if (map2.get(str) != null) {
                    f = ((Float) map2.get(str)).floatValue();
                }
                if (floatValue == f) {
                    return null;
                }
                valueAnimator = ValueAnimator.ofFloat(new float[]{floatValue, f});
                valueAnimator.addUpdateListener(new C3309a(this, textView));
            }
        }
        return valueAnimator;
    }

    /* renamed from: a */
    public void mo6516a(C1734q qVar) {
        mo9036d(qVar);
    }

    /* renamed from: c */
    public void mo6517c(C1734q qVar) {
        mo9036d(qVar);
    }

    /* renamed from: d */
    public final void mo9036d(C1734q qVar) {
        View view = qVar.f5071b;
        if (view instanceof TextView) {
            String str = "android:textscale:scale";
            qVar.f5070a.put(str, Float.valueOf(((TextView) view).getScaleX()));
        }
    }
}
