package p213q.p217b.p218a.p271c.p284n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;

/* renamed from: q.b.a.c.n.e */
public class C3422e<V extends View> extends C0068c<V> {

    /* renamed from: a */
    public C3423f f8613a;

    /* renamed from: b */
    public int f8614b = 0;

    /* renamed from: c */
    public int f8615c = 0;

    public C3422e() {
    }

    public C3422e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo658a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo9206b(coordinatorLayout, v, i);
        if (this.f8613a == null) {
            this.f8613a = new C3423f(v);
        }
        C3423f fVar = this.f8613a;
        fVar.f8617b = fVar.f8616a.getTop();
        fVar.f8618c = fVar.f8616a.getLeft();
        this.f8613a.mo9209a();
        int i2 = this.f8614b;
        if (i2 != 0) {
            C3423f fVar2 = this.f8613a;
            if (fVar2.f8621f && fVar2.f8619d != i2) {
                fVar2.f8619d = i2;
                fVar2.mo9209a();
            }
            this.f8614b = 0;
        }
        int i3 = this.f8615c;
        if (i3 != 0) {
            C3423f fVar3 = this.f8613a;
            if (fVar3.f8622g && fVar3.f8620e != i3) {
                fVar3.f8620e = i3;
                fVar3.mo9209a();
            }
            this.f8615c = 0;
        }
        return true;
    }

    /* renamed from: b */
    public int mo9208b() {
        C3423f fVar = this.f8613a;
        if (fVar != null) {
            return fVar.f8619d;
        }
        return 0;
    }

    /* renamed from: b */
    public void mo9206b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo607b(v, i);
    }

    /* renamed from: a */
    public boolean mo9207a(int i) {
        C3423f fVar = this.f8613a;
        boolean z = false;
        if (fVar != null) {
            if (fVar.f8621f && fVar.f8619d != i) {
                fVar.f8619d = i;
                fVar.mo9209a();
                z = true;
            }
            return z;
        }
        this.f8614b = i;
        return false;
    }
}
