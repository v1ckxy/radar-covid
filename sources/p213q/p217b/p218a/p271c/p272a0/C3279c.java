package p213q.p217b.p218a.p271c.p272a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p213q.p217b.p218a.p271c.p272a0.C3281e.C3287f;

/* renamed from: q.b.a.c.a0.c */
public class C3279c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f8177a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8178b;

    /* renamed from: c */
    public final /* synthetic */ C3287f f8179c;

    /* renamed from: d */
    public final /* synthetic */ C3281e f8180d;

    public C3279c(C3281e eVar, boolean z, C3287f fVar) {
        this.f8180d = eVar;
        this.f8178b = z;
        this.f8179c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f8177a = true;
    }

    public void onAnimationEnd(Animator animator) {
        C3281e eVar = this.f8180d;
        eVar.f8206p = 0;
        eVar.f8201k = null;
        if (!this.f8177a) {
            eVar.f8210t.mo9040a(this.f8178b ? 8 : 4, this.f8178b);
            C3287f fVar = this.f8179c;
            if (fVar != null) {
                C3278b bVar = (C3278b) fVar;
                bVar.f8175a.mo2134a(bVar.f8176b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f8180d.f8210t.mo9040a(0, this.f8178b);
        C3281e eVar = this.f8180d;
        eVar.f8206p = 1;
        eVar.f8201k = animator;
        this.f8177a = false;
    }
}
