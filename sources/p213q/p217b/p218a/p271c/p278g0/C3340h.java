package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: q.b.a.c.g0.h */
public final class C3340h implements C3333c {

    /* renamed from: a */
    public final float f8409a;

    public C3340h(float f) {
        this.f8409a = f;
    }

    /* renamed from: a */
    public float mo9050a(RectF rectF) {
        return rectF.height() * this.f8409a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3340h)) {
            return false;
        }
        if (this.f8409a != ((C3340h) obj).f8409a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8409a)});
    }
}
