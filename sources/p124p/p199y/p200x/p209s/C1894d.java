package p124p.p199y.p200x.p209s;

/* renamed from: p.y.x.s.d */
public class C1894d {

    /* renamed from: a */
    public String f5508a;

    /* renamed from: b */
    public Long f5509b;

    public C1894d(String str, long j) {
        this.f5508a = str;
        this.f5509b = Long.valueOf(j);
    }

    public C1894d(String str, boolean z) {
        long j = z ? 1 : 0;
        this.f5508a = str;
        this.f5509b = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894d)) {
            return false;
        }
        C1894d dVar = (C1894d) obj;
        if (!this.f5508a.equals(dVar.f5508a)) {
            return false;
        }
        Long l = this.f5509b;
        Long l2 = dVar.f5509b;
        if (l != null) {
            z = l.equals(l2);
        } else if (l2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f5508a.hashCode() * 31;
        Long l = this.f5509b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
