package p392u.p406t;

import java.util.Iterator;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.t.a */
public class C4653a implements Iterable<Integer>, C4646a {

    /* renamed from: e */
    public final int f10839e;

    /* renamed from: f */
    public final int f10840f;

    /* renamed from: g */
    public final int f10841g;

    public C4653a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f10839e = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= C2286e.m5144a(C2286e.m5144a(i2, i3) - C2286e.m5144a(i, i3), i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i4 = -i3;
                i2 += C2286e.m5144a(C2286e.m5144a(i, i4) - C2286e.m5144a(i2, i4), i4);
            }
            this.f10840f = i2;
            this.f10841g = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f10841g == r3.f10841g) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p392u.p406t.C4653a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            u.t.a r0 = (p392u.p406t.C4653a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f10839e
            u.t.a r3 = (p392u.p406t.C4653a) r3
            int r1 = r3.f10839e
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f10840f
            int r1 = r3.f10840f
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f10841g
            int r3 = r3.f10841g
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p406t.C4653a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f10839e * 31) + this.f10840f) * 31) + this.f10841g;
    }

    public boolean isEmpty() {
        if (this.f10841g > 0) {
            if (this.f10839e > this.f10840f) {
                return true;
            }
        } else if (this.f10839e < this.f10840f) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new C4654b(this.f10839e, this.f10840f, this.f10841g);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        if (this.f10841g > 0) {
            sb = new StringBuilder();
            sb.append(this.f10839e);
            sb.append(Strings.TOP_PATH);
            sb.append(this.f10840f);
            sb.append(str);
            i = this.f10841g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f10839e);
            sb.append(" downTo ");
            sb.append(this.f10840f);
            sb.append(str);
            i = -this.f10841g;
        }
        sb.append(i);
        return sb.toString();
    }
}
