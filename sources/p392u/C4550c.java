package p392u;

import p392u.p401r.p403c.C4638h;

/* renamed from: u.c */
public final class C4550c implements Comparable<C4550c> {

    /* renamed from: i */
    public static final C4550c f10761i = new C4550c(1, 3, 72);

    /* renamed from: e */
    public final int f10762e;

    /* renamed from: f */
    public final int f10763f;

    /* renamed from: g */
    public final int f10764g;

    /* renamed from: h */
    public final int f10765h;

    public C4550c(int i, int i2, int i3) {
        this.f10763f = i;
        this.f10764g = i2;
        this.f10765h = i3;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            this.f10762e = (i << 16) + (i2 << 8) + i3;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        sb.append('.');
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public int compareTo(Object obj) {
        C4550c cVar = (C4550c) obj;
        if (cVar != null) {
            return this.f10762e - cVar.f10762e;
        }
        C4638h.m10271a("other");
        throw null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4550c)) {
            obj = null;
        }
        C4550c cVar = (C4550c) obj;
        if (cVar == null) {
            return false;
        }
        if (this.f10762e != cVar.f10762e) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f10762e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10763f);
        sb.append('.');
        sb.append(this.f10764g);
        sb.append('.');
        sb.append(this.f10765h);
        return sb.toString();
    }
}
