package p124p.p199y.p200x.p205q;

/* renamed from: p.y.x.q.b */
public class C1862b {

    /* renamed from: a */
    public boolean f5449a;

    /* renamed from: b */
    public boolean f5450b;

    /* renamed from: c */
    public boolean f5451c;

    /* renamed from: d */
    public boolean f5452d;

    public C1862b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5449a = z;
        this.f5450b = z2;
        this.f5451c = z3;
        this.f5452d = z4;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862b)) {
            return false;
        }
        C1862b bVar = (C1862b) obj;
        if (!(this.f5449a == bVar.f5449a && this.f5450b == bVar.f5450b && this.f5451c == bVar.f5451c && this.f5452d == bVar.f5452d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.f5449a ? 1 : 0;
        if (this.f5450b) {
            i += 16;
        }
        if (this.f5451c) {
            i += 256;
        }
        return this.f5452d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5449a), Boolean.valueOf(this.f5450b), Boolean.valueOf(this.f5451c), Boolean.valueOf(this.f5452d)});
    }
}
