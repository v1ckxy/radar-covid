package p213q.p217b.p218a.p271c.p283m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.c.m.h */
public class C3414h {

    /* renamed from: a */
    public long f8587a = 0;

    /* renamed from: b */
    public long f8588b = 300;

    /* renamed from: c */
    public TimeInterpolator f8589c = null;

    /* renamed from: d */
    public int f8590d = 0;

    /* renamed from: e */
    public int f8591e = 1;

    public C3414h(long j, long j2) {
        this.f8587a = j;
        this.f8588b = j2;
    }

    public C3414h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f8587a = j;
        this.f8588b = j2;
        this.f8589c = timeInterpolator;
    }

    /* renamed from: a */
    public TimeInterpolator mo9193a() {
        TimeInterpolator timeInterpolator = this.f8589c;
        return timeInterpolator != null ? timeInterpolator : C3407a.f8573b;
    }

    /* renamed from: a */
    public void mo9194a(Animator animator) {
        animator.setStartDelay(this.f8587a);
        animator.setDuration(this.f8588b);
        animator.setInterpolator(mo9193a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f8590d);
            valueAnimator.setRepeatMode(this.f8591e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3414h)) {
            return false;
        }
        C3414h hVar = (C3414h) obj;
        if (this.f8587a == hVar.f8587a && this.f8588b == hVar.f8588b && this.f8590d == hVar.f8590d && this.f8591e == hVar.f8591e) {
            return mo9193a().getClass().equals(hVar.mo9193a().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f8587a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f8588b;
        return ((((mo9193a().getClass().hashCode() + ((i + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f8590d) * 31) + this.f8591e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C3414h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f8587a);
        sb.append(" duration: ");
        sb.append(this.f8588b);
        sb.append(" interpolator: ");
        sb.append(mo9193a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f8590d);
        sb.append(" repeatMode: ");
        return C1965a.m4753a(sb, this.f8591e, "}\n");
    }
}
