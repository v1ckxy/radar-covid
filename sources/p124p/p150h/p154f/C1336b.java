package p124p.p150h.p154f;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.f.b */
public final class C1336b {

    /* renamed from: e */
    public static final C1336b f4034e = new C1336b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f4035a;

    /* renamed from: b */
    public final int f4036b;

    /* renamed from: c */
    public final int f4037c;

    /* renamed from: d */
    public final int f4038d;

    public C1336b(int i, int i2, int i3, int i4) {
        this.f4035a = i;
        this.f4036b = i2;
        this.f4037c = i3;
        this.f4038d = i4;
    }

    /* renamed from: a */
    public static C1336b m3390a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f4034e : new C1336b(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1336b.class != obj.getClass()) {
            return false;
        }
        C1336b bVar = (C1336b) obj;
        return this.f4038d == bVar.f4038d && this.f4035a == bVar.f4035a && this.f4037c == bVar.f4037c && this.f4036b == bVar.f4036b;
    }

    public int hashCode() {
        return (((((this.f4035a * 31) + this.f4036b) * 31) + this.f4037c) * 31) + this.f4038d;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Insets{left=");
        a.append(this.f4035a);
        a.append(", top=");
        a.append(this.f4036b);
        a.append(", right=");
        a.append(this.f4037c);
        a.append(", bottom=");
        a.append(this.f4038d);
        a.append('}');
        return a.toString();
    }
}
