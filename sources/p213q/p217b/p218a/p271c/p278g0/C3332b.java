package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: q.b.a.c.g0.b */
public final class C3332b implements C3333c {

    /* renamed from: a */
    public final C3333c f8361a;

    /* renamed from: b */
    public final float f8362b;

    public C3332b(float f, C3333c cVar) {
        while (cVar instanceof C3332b) {
            cVar = ((C3332b) cVar).f8361a;
            f += ((C3332b) cVar).f8362b;
        }
        this.f8361a = cVar;
        this.f8362b = f;
    }

    /* renamed from: a */
    public float mo9050a(RectF rectF) {
        return Math.max(0.0f, this.f8361a.mo9050a(rectF) + this.f8362b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3332b)) {
            return false;
        }
        C3332b bVar = (C3332b) obj;
        if (!this.f8361a.equals(bVar.f8361a) || this.f8362b != bVar.f8362b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8361a, Float.valueOf(this.f8362b)});
    }
}
