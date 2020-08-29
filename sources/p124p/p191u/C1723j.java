package p124p.p191u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p124p.p143e.C1248a;

/* renamed from: p.u.j */
public class C1723j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1248a f5052a;

    /* renamed from: b */
    public final /* synthetic */ C1718i f5053b;

    public C1723j(C1718i iVar, C1248a aVar) {
        this.f5053b = iVar;
        this.f5052a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5052a.remove(animator);
        this.f5053b.f5016A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f5053b.f5016A.add(animator);
    }
}
