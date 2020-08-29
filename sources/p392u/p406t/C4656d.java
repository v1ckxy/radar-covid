package p392u.p406t;

import p392u.p401r.p403c.C4638h;

/* renamed from: u.t.d */
public class C4656d {
    /* renamed from: a */
    public static final int m10288a(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final C4653a m10289a(int i, int i2) {
        return new C4653a(i, i2, -1);
    }

    /* renamed from: b */
    public static final C4655c m10291b(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C4655c(i, i2 - 1);
        }
        C4655c cVar = C4655c.f10847i;
        return C4655c.f10846h;
    }

    /* renamed from: a */
    public static final C4653a m10290a(C4653a aVar, int i) {
        if (aVar != null) {
            boolean z = i > 0;
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null) {
                C4638h.m10271a("step");
                throw null;
            } else if (z) {
                int i2 = aVar.f10839e;
                int i3 = aVar.f10840f;
                if (aVar.f10841g <= 0) {
                    i = -i;
                }
                return new C4653a(i2, i3, i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Step must be positive, was: ");
                sb.append(valueOf);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            C4638h.m10271a("$this$step");
            throw null;
        }
    }
}
