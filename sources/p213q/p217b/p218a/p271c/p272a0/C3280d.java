package p213q.p217b.p218a.p271c.p272a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p213q.p217b.p218a.p271c.p272a0.C3281e.C3287f;

/* renamed from: q.b.a.c.a0.d */
public class C3280d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f8181a;

    /* renamed from: b */
    public final /* synthetic */ C3287f f8182b;

    /* renamed from: c */
    public final /* synthetic */ C3281e f8183c;

    public C3280d(C3281e eVar, boolean z, C3287f fVar) {
        this.f8183c = eVar;
        this.f8181a = z;
        this.f8182b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        C3281e eVar = this.f8183c;
        eVar.f8206p = 0;
        eVar.f8201k = null;
        C3287f fVar = this.f8182b;
        if (fVar != null) {
            C3278b bVar = (C3278b) fVar;
            bVar.f8175a.mo2135b(bVar.f8176b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f8183c.f8210t.mo9040a(0, this.f8181a);
        C3281e eVar = this.f8183c;
        eVar.f8206p = 2;
        eVar.f8201k = animator;
    }
}
