package p124p.p199y.p200x.p209s;

import androidx.work.OverwritingInputMerger;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p199y.C1784a;
import p124p.p199y.C1788c;
import p124p.p199y.C1792e;
import p124p.p199y.C1800l;
import p124p.p199y.C1816t;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.y.x.s.p */
public final class C1913p {

    /* renamed from: r */
    public static final String f5526r = C1800l.m4459a("WorkSpec");

    /* renamed from: a */
    public String f5527a;

    /* renamed from: b */
    public C1816t f5528b = C1816t.ENQUEUED;

    /* renamed from: c */
    public String f5529c;

    /* renamed from: d */
    public String f5530d = OverwritingInputMerger.class.getName();

    /* renamed from: e */
    public C1792e f5531e;

    /* renamed from: f */
    public C1792e f5532f;

    /* renamed from: g */
    public long f5533g;

    /* renamed from: h */
    public long f5534h;

    /* renamed from: i */
    public long f5535i;

    /* renamed from: j */
    public C1788c f5536j;

    /* renamed from: k */
    public int f5537k;

    /* renamed from: l */
    public C1784a f5538l;

    /* renamed from: m */
    public long f5539m;

    /* renamed from: n */
    public long f5540n;

    /* renamed from: o */
    public long f5541o;

    /* renamed from: p */
    public long f5542p;

    /* renamed from: q */
    public boolean f5543q;

    /* renamed from: p.y.x.s.p$a */
    public static class C1914a {

        /* renamed from: a */
        public String f5544a;

        /* renamed from: b */
        public C1816t f5545b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1914a)) {
                return false;
            }
            C1914a aVar = (C1914a) obj;
            if (this.f5545b != aVar.f5545b) {
                return false;
            }
            return this.f5544a.equals(aVar.f5544a);
        }

        public int hashCode() {
            return this.f5545b.hashCode() + (this.f5544a.hashCode() * 31);
        }
    }

    public C1913p(String str, String str2) {
        C1792e eVar = C1792e.f5264c;
        this.f5531e = eVar;
        this.f5532f = eVar;
        this.f5536j = C1788c.f5243i;
        this.f5538l = C1784a.EXPONENTIAL;
        this.f5539m = 30000;
        this.f5542p = -1;
        this.f5527a = str;
        this.f5529c = str2;
    }

    public C1913p(C1913p pVar) {
        C1792e eVar = C1792e.f5264c;
        this.f5531e = eVar;
        this.f5532f = eVar;
        this.f5536j = C1788c.f5243i;
        this.f5538l = C1784a.EXPONENTIAL;
        this.f5539m = 30000;
        this.f5542p = -1;
        this.f5527a = pVar.f5527a;
        this.f5529c = pVar.f5529c;
        this.f5528b = pVar.f5528b;
        this.f5530d = pVar.f5530d;
        this.f5531e = new C1792e(pVar.f5531e);
        this.f5532f = new C1792e(pVar.f5532f);
        this.f5533g = pVar.f5533g;
        this.f5534h = pVar.f5534h;
        this.f5535i = pVar.f5535i;
        this.f5536j = new C1788c(pVar.f5536j);
        this.f5537k = pVar.f5537k;
        this.f5538l = pVar.f5538l;
        this.f5539m = pVar.f5539m;
        this.f5540n = pVar.f5540n;
        this.f5541o = pVar.f5541o;
        this.f5542p = pVar.f5542p;
        this.f5543q = pVar.f5543q;
    }

    /* renamed from: a */
    public long mo6893a() {
        long j;
        long j2;
        boolean z = false;
        if (this.f5528b == C1816t.ENQUEUED && this.f5537k > 0) {
            if (this.f5538l == C1784a.LINEAR) {
                z = true;
            }
            long j3 = this.f5539m;
            long scalb = z ? j3 * ((long) this.f5537k) : (long) Math.scalb((float) j3, this.f5537k - 1);
            j = this.f5540n;
            j2 = Math.min(18000000, scalb);
        } else {
            long j4 = 0;
            if (mo6895c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = this.f5540n;
                if (j5 == 0) {
                    j5 = this.f5533g + currentTimeMillis;
                }
                if (this.f5535i != this.f5534h) {
                    z = true;
                }
                int i = (this.f5540n > 0 ? 1 : (this.f5540n == 0 ? 0 : -1));
                if (z) {
                    if (i == 0) {
                        j4 = this.f5535i * -1;
                    }
                    return j5 + this.f5534h + j4;
                }
                if (i != 0) {
                    j4 = this.f5534h;
                }
                return j5 + j4;
            }
            j2 = this.f5540n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j = this.f5533g;
        }
        return j2 + j;
    }

    /* renamed from: b */
    public boolean mo6894b() {
        return !C1788c.f5243i.equals(this.f5536j);
    }

    /* renamed from: c */
    public boolean mo6895c() {
        return this.f5534h != 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1913p)) {
            return false;
        }
        C1913p pVar = (C1913p) obj;
        if (this.f5533g != pVar.f5533g || this.f5534h != pVar.f5534h || this.f5535i != pVar.f5535i || this.f5537k != pVar.f5537k || this.f5539m != pVar.f5539m || this.f5540n != pVar.f5540n || this.f5541o != pVar.f5541o || this.f5542p != pVar.f5542p || this.f5543q != pVar.f5543q || !this.f5527a.equals(pVar.f5527a) || this.f5528b != pVar.f5528b || !this.f5529c.equals(pVar.f5529c)) {
            return false;
        }
        String str = this.f5530d;
        if (str == null ? pVar.f5530d != null : !str.equals(pVar.f5530d)) {
            return false;
        }
        if (!this.f5531e.equals(pVar.f5531e) || !this.f5532f.equals(pVar.f5532f) || !this.f5536j.equals(pVar.f5536j)) {
            return false;
        }
        if (this.f5538l != pVar.f5538l) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f5529c.hashCode() + ((this.f5528b.hashCode() + (this.f5527a.hashCode() * 31)) * 31)) * 31;
        String str = this.f5530d;
        int hashCode2 = (this.f5532f.hashCode() + ((this.f5531e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f5533g;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f5534h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f5535i;
        int hashCode3 = (this.f5538l.hashCode() + ((((this.f5536j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f5537k) * 31)) * 31;
        long j4 = this.f5539m;
        int i3 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f5540n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f5541o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f5542p;
        return ((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f5543q ? 1 : 0);
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("{WorkSpec: "), this.f5527a, Objects.ARRAY_END);
    }
}
