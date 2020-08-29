package p213q.p217b.p218a.p271c.p283m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p124p.p143e.C1261h;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.c.m.g */
public class C3413g {

    /* renamed from: a */
    public final C1261h<String, C3414h> f8585a = new C1261h<>();

    /* renamed from: b */
    public final C1261h<String, PropertyValuesHolder[]> f8586b = new C1261h<>();

    /* renamed from: a */
    public static C3413g m7807a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m7809a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m7809a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Can't load animation resource ID #0x");
            a.append(Integer.toHexString(i));
            Log.w("MotionSpec", a.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static C3413g m7808a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m7807a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C3413g m7809a(List<Animator> list) {
        C3413g gVar = new C3413g();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f8586b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C3407a.f8573b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C3407a.f8574c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C3407a.f8575d;
                }
                C3414h hVar = new C3414h(startDelay, duration, interpolator);
                hVar.f8590d = objectAnimator.getRepeatCount();
                hVar.f8591e = objectAnimator.getRepeatMode();
                gVar.f8585a.put(propertyName, hVar);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3413g)) {
            return false;
        }
        return this.f8585a.equals(((C3413g) obj).f8585a);
    }

    public int hashCode() {
        return this.f8585a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C3413g.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f8585a);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public C3414h mo9189a(String str) {
        if (this.f8585a.getOrDefault(str, null) != null) {
            return (C3414h) this.f8585a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }
}
