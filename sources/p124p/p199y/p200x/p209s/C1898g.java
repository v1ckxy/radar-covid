package p124p.p199y.p200x.p209s;

/* renamed from: p.y.x.s.g */
public class C1898g {

    /* renamed from: a */
    public final String f5512a;

    /* renamed from: b */
    public final int f5513b;

    public C1898g(String str, int i) {
        this.f5512a = str;
        this.f5513b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898g)) {
            return false;
        }
        C1898g gVar = (C1898g) obj;
        if (this.f5513b != gVar.f5513b) {
            return false;
        }
        return this.f5512a.equals(gVar.f5512a);
    }

    public int hashCode() {
        return (this.f5512a.hashCode() * 31) + this.f5513b;
    }
}
