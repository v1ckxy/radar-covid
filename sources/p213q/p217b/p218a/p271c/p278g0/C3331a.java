package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: q.b.a.c.g0.a */
public final class C3331a implements C3333c {

    /* renamed from: a */
    public final float f8360a;

    public C3331a(float f) {
        this.f8360a = f;
    }

    /* renamed from: a */
    public float mo9050a(RectF rectF) {
        return this.f8360a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3331a)) {
            return false;
        }
        if (this.f8360a != ((C3331a) obj).f8360a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8360a)});
    }
}
