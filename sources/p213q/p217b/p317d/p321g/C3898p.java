package p213q.p217b.p317d.p321g;

/* renamed from: q.b.d.g.p */
public class C3898p {

    /* renamed from: a */
    public final Class<?> f9525a;

    /* renamed from: b */
    public final boolean f9526b;

    public /* synthetic */ C3898p(Class cls, boolean z, C3896n nVar) {
        this.f9525a = cls;
        this.f9526b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3898p)) {
            return false;
        }
        C3898p pVar = (C3898p) obj;
        return pVar.f9525a.equals(this.f9525a) && pVar.f9526b == this.f9526b;
    }

    public int hashCode() {
        return ((this.f9525a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9526b).hashCode();
    }
}
