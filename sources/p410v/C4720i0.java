package p410v;

import java.io.Closeable;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p410v.C4870w.C4871a;
import p410v.p411m0.p413d.C4754c;

/* renamed from: v.i0 */
public final class C4720i0 implements Closeable {

    /* renamed from: e */
    public C4704e f11059e;

    /* renamed from: f */
    public final C4706e0 f11060f;

    /* renamed from: g */
    public final C4694c0 f11061g;

    /* renamed from: h */
    public final String f11062h;

    /* renamed from: i */
    public final int f11063i;

    /* renamed from: j */
    public final C4866v f11064j;

    /* renamed from: k */
    public final C4870w f11065k;

    /* renamed from: l */
    public final C4725j0 f11066l;

    /* renamed from: m */
    public final C4720i0 f11067m;

    /* renamed from: n */
    public final C4720i0 f11068n;

    /* renamed from: o */
    public final C4720i0 f11069o;

    /* renamed from: p */
    public final long f11070p;

    /* renamed from: q */
    public final long f11071q;

    /* renamed from: r */
    public final C4754c f11072r;

    /* renamed from: v.i0$a */
    public static class C4721a {

        /* renamed from: a */
        public C4706e0 f11073a;

        /* renamed from: b */
        public C4694c0 f11074b;

        /* renamed from: c */
        public int f11075c;

        /* renamed from: d */
        public String f11076d;

        /* renamed from: e */
        public C4866v f11077e;

        /* renamed from: f */
        public C4871a f11078f;

        /* renamed from: g */
        public C4725j0 f11079g;

        /* renamed from: h */
        public C4720i0 f11080h;

        /* renamed from: i */
        public C4720i0 f11081i;

        /* renamed from: j */
        public C4720i0 f11082j;

        /* renamed from: k */
        public long f11083k;

        /* renamed from: l */
        public long f11084l;

        /* renamed from: m */
        public C4754c f11085m;

        public C4721a() {
            this.f11075c = -1;
            this.f11078f = new C4871a();
        }

        public C4721a(C4720i0 i0Var) {
            if (i0Var != null) {
                this.f11075c = -1;
                this.f11073a = i0Var.f11060f;
                this.f11074b = i0Var.f11061g;
                this.f11075c = i0Var.f11063i;
                this.f11076d = i0Var.f11062h;
                this.f11077e = i0Var.f11064j;
                this.f11078f = i0Var.f11065k.mo11368c();
                this.f11079g = i0Var.f11066l;
                this.f11080h = i0Var.f11067m;
                this.f11081i = i0Var.f11068n;
                this.f11082j = i0Var.f11069o;
                this.f11083k = i0Var.f11070p;
                this.f11084l = i0Var.f11071q;
                this.f11085m = i0Var.f11072r;
                return;
            }
            C4638h.m10271a("response");
            throw null;
        }

        /* renamed from: a */
        public C4721a mo11037a(String str, String str2) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (str2 != null) {
                this.f11078f.mo11377a(str, str2);
                return this;
            } else {
                C4638h.m10271a("value");
                throw null;
            }
        }

        /* renamed from: a */
        public C4721a mo11040a(C4720i0 i0Var) {
            mo11043a("cacheResponse", i0Var);
            this.f11081i = i0Var;
            return this;
        }

        /* renamed from: a */
        public C4720i0 mo11042a() {
            if (this.f11075c >= 0) {
                C4706e0 e0Var = this.f11073a;
                if (e0Var != null) {
                    C4694c0 c0Var = this.f11074b;
                    if (c0Var != null) {
                        String str = this.f11076d;
                        if (str != null) {
                            C4720i0 i0Var = new C4720i0(e0Var, c0Var, str, this.f11075c, this.f11077e, this.f11078f.mo11378a(), this.f11079g, this.f11080h, this.f11081i, this.f11082j, this.f11083k, this.f11084l, this.f11085m);
                            return i0Var;
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder a = C1965a.m4756a("code < 0: ");
            a.append(this.f11075c);
            throw new IllegalStateException(a.toString().toString());
        }

        /* renamed from: a */
        public final void mo11043a(String str, C4720i0 i0Var) {
            if (i0Var != null) {
                boolean z = true;
                if (i0Var.f11066l == null) {
                    if (i0Var.f11067m == null) {
                        if (i0Var.f11068n == null) {
                            if (i0Var.f11069o != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(C1965a.m4751a(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(C1965a.m4751a(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(C1965a.m4751a(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(C1965a.m4751a(str, ".body != null").toString());
            }
        }

        /* renamed from: a */
        public C4721a mo11041a(C4870w wVar) {
            if (wVar != null) {
                this.f11078f = wVar.mo11368c();
                return this;
            }
            C4638h.m10271a("headers");
            throw null;
        }

        /* renamed from: a */
        public C4721a mo11036a(String str) {
            if (str != null) {
                this.f11076d = str;
                return this;
            }
            C4638h.m10271a("message");
            throw null;
        }

        /* renamed from: a */
        public C4721a mo11038a(C4694c0 c0Var) {
            if (c0Var != null) {
                this.f11074b = c0Var;
                return this;
            }
            C4638h.m10271a("protocol");
            throw null;
        }

        /* renamed from: a */
        public C4721a mo11039a(C4706e0 e0Var) {
            if (e0Var != null) {
                this.f11073a = e0Var;
                return this;
            }
            C4638h.m10271a("request");
            throw null;
        }
    }

    public C4720i0(C4706e0 e0Var, C4694c0 c0Var, String str, int i, C4866v vVar, C4870w wVar, C4725j0 j0Var, C4720i0 i0Var, C4720i0 i0Var2, C4720i0 i0Var3, long j, long j2, C4754c cVar) {
        C4706e0 e0Var2 = e0Var;
        C4694c0 c0Var2 = c0Var;
        String str2 = str;
        C4870w wVar2 = wVar;
        if (e0Var2 == null) {
            C4638h.m10271a("request");
            throw null;
        } else if (c0Var2 == null) {
            C4638h.m10271a("protocol");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("message");
            throw null;
        } else if (wVar2 != null) {
            this.f11060f = e0Var2;
            this.f11061g = c0Var2;
            this.f11062h = str2;
            this.f11063i = i;
            this.f11064j = vVar;
            this.f11065k = wVar2;
            this.f11066l = j0Var;
            this.f11067m = i0Var;
            this.f11068n = i0Var2;
            this.f11069o = i0Var3;
            this.f11070p = j;
            this.f11071q = j2;
            this.f11072r = cVar;
        } else {
            C4638h.m10271a("headers");
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m10406a(C4720i0 i0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if (str != null) {
            String a = i0Var.f11065k.mo11366a(str);
            return a != null ? a : str2;
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: a */
    public final C4704e mo11032a() {
        C4704e eVar = this.f11059e;
        if (eVar != null) {
            return eVar;
        }
        C4704e a = C4704e.f11014n.mo11011a(this.f11065k);
        this.f11059e = a;
        return a;
    }

    public void close() {
        C4725j0 j0Var = this.f11066l;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: f */
    public final boolean mo11034f() {
        int i = this.f11063i;
        return 200 <= i && 299 >= i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Response{protocol=");
        a.append(this.f11061g);
        a.append(", code=");
        a.append(this.f11063i);
        a.append(", message=");
        a.append(this.f11062h);
        a.append(", url=");
        a.append(this.f11060f.f11029b);
        a.append('}');
        return a.toString();
    }
}
