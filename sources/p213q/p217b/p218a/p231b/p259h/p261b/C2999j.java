package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.j */
public final class C2999j {

    /* renamed from: a */
    public final String f7429a;

    /* renamed from: b */
    public final String f7430b;

    /* renamed from: c */
    public final long f7431c;

    /* renamed from: d */
    public final long f7432d;

    /* renamed from: e */
    public final long f7433e;

    /* renamed from: f */
    public final long f7434f;

    /* renamed from: g */
    public final long f7435g;

    /* renamed from: h */
    public final Long f7436h;

    /* renamed from: i */
    public final Long f7437i;

    /* renamed from: j */
    public final Long f7438j;

    /* renamed from: k */
    public final Boolean f7439k;

    public C2999j(String str, String str2, long j) {
        this(str, str2, 0, 0, 0, j, 0, null, null, null, null);
    }

    public C2999j(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C1061o.m2528b(str);
        C1061o.m2528b(str2);
        boolean z = true;
        C1061o.m2507a(j6 >= 0);
        C1061o.m2507a(j7 >= 0);
        C1061o.m2507a(j8 >= 0);
        if (j9 < 0) {
            z = false;
        }
        C1061o.m2507a(z);
        this.f7429a = str;
        this.f7430b = str2;
        this.f7431c = j6;
        this.f7432d = j7;
        this.f7433e = j8;
        this.f7434f = j4;
        this.f7435g = j9;
        this.f7436h = l;
        this.f7437i = l2;
        this.f7438j = l3;
        this.f7439k = bool;
    }

    /* renamed from: a */
    public final C2999j mo8540a(long j) {
        C2999j jVar = new C2999j(this.f7429a, this.f7430b, this.f7431c, this.f7432d, this.f7433e, j, this.f7435g, this.f7436h, this.f7437i, this.f7438j, this.f7439k);
        return jVar;
    }

    /* renamed from: a */
    public final C2999j mo8541a(long j, long j2) {
        C2999j jVar = new C2999j(this.f7429a, this.f7430b, this.f7431c, this.f7432d, this.f7433e, this.f7434f, j, Long.valueOf(j2), this.f7437i, this.f7438j, this.f7439k);
        return jVar;
    }

    /* renamed from: a */
    public final C2999j mo8542a(Long l, Long l2, Boolean bool) {
        C2999j jVar = new C2999j(this.f7429a, this.f7430b, this.f7431c, this.f7432d, this.f7433e, this.f7434f, this.f7435g, this.f7436h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return jVar;
    }
}
