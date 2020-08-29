package p124p.p150h.p161k;

import java.util.Objects;

/* renamed from: p.h.k.c */
public class C1383c<F, S> {

    /* renamed from: a */
    public final F f4140a;

    /* renamed from: b */
    public final S f4141b;

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C1383c)) {
            return false;
        }
        C1383c cVar = (C1383c) obj;
        if (Objects.equals(cVar.f4140a, null) && Objects.equals(cVar.f4141b, null)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Pair{null null}";
    }
}
