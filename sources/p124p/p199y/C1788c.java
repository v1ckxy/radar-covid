package p124p.p199y;

import android.os.Build.VERSION;

/* renamed from: p.y.c */
public final class C1788c {

    /* renamed from: i */
    public static final C1788c f5243i = new C1789a().mo6768a();

    /* renamed from: a */
    public C1802m f5244a = C1802m.NOT_REQUIRED;

    /* renamed from: b */
    public boolean f5245b;

    /* renamed from: c */
    public boolean f5246c;

    /* renamed from: d */
    public boolean f5247d;

    /* renamed from: e */
    public boolean f5248e;

    /* renamed from: f */
    public long f5249f = -1;

    /* renamed from: g */
    public long f5250g = -1;

    /* renamed from: h */
    public C1790d f5251h = new C1790d();

    /* renamed from: p.y.c$a */
    public static final class C1789a {

        /* renamed from: a */
        public boolean f5252a = false;

        /* renamed from: b */
        public boolean f5253b = false;

        /* renamed from: c */
        public C1802m f5254c = C1802m.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f5255d = false;

        /* renamed from: e */
        public boolean f5256e = false;

        /* renamed from: f */
        public long f5257f = -1;

        /* renamed from: g */
        public long f5258g = -1;

        /* renamed from: h */
        public C1790d f5259h = new C1790d();

        /* renamed from: a */
        public C1788c mo6768a() {
            return new C1788c(this);
        }
    }

    public C1788c() {
    }

    public C1788c(C1789a aVar) {
        this.f5245b = aVar.f5252a;
        this.f5246c = aVar.f5253b;
        this.f5244a = aVar.f5254c;
        this.f5247d = aVar.f5255d;
        this.f5248e = aVar.f5256e;
        if (VERSION.SDK_INT >= 24) {
            this.f5251h = aVar.f5259h;
            this.f5249f = aVar.f5257f;
            this.f5250g = aVar.f5258g;
        }
    }

    public C1788c(C1788c cVar) {
        this.f5245b = cVar.f5245b;
        this.f5246c = cVar.f5246c;
        this.f5244a = cVar.f5244a;
        this.f5247d = cVar.f5247d;
        this.f5248e = cVar.f5248e;
        this.f5251h = cVar.f5251h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1788c.class != obj.getClass()) {
            return false;
        }
        C1788c cVar = (C1788c) obj;
        if (this.f5245b == cVar.f5245b && this.f5246c == cVar.f5246c && this.f5247d == cVar.f5247d && this.f5248e == cVar.f5248e && this.f5249f == cVar.f5249f && this.f5250g == cVar.f5250g && this.f5244a == cVar.f5244a) {
            return this.f5251h.equals(cVar.f5251h);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f5244a.hashCode() * 31) + (this.f5245b ? 1 : 0)) * 31) + (this.f5246c ? 1 : 0)) * 31) + (this.f5247d ? 1 : 0)) * 31) + (this.f5248e ? 1 : 0)) * 31;
        long j = this.f5249f;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f5250g;
        return this.f5251h.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
