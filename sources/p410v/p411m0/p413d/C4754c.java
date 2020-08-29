package p410v.p411m0.p413d;

import java.io.IOException;
import java.net.ProtocolException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p410v.C4706e0;
import p410v.C4708f;
import p410v.C4716h0;
import p410v.C4720i0.C4721a;
import p410v.C4861t;
import p410v.p411m0.p414e.C4775d;
import p423w.C4882a0;
import p423w.C4892f;
import p423w.C4899k;
import p423w.C4900l;
import p423w.C4915y;

/* renamed from: v.m0.d.c */
public final class C4754c {

    /* renamed from: a */
    public boolean f11208a;

    /* renamed from: b */
    public final C4768m f11209b;

    /* renamed from: c */
    public final C4708f f11210c;

    /* renamed from: d */
    public final C4861t f11211d;

    /* renamed from: e */
    public final C4757d f11212e;

    /* renamed from: f */
    public final C4775d f11213f;

    /* renamed from: v.m0.d.c$a */
    public final class C4755a extends C4899k {

        /* renamed from: f */
        public boolean f11214f;

        /* renamed from: g */
        public long f11215g;

        /* renamed from: h */
        public boolean f11216h;

        /* renamed from: i */
        public final long f11217i;

        /* renamed from: j */
        public final /* synthetic */ C4754c f11218j;

        public C4755a(C4754c cVar, C4915y yVar, long j) {
            if (yVar != null) {
                this.f11218j = cVar;
                super(yVar);
                this.f11217i = j;
                return;
            }
            C4638h.m10271a("delegate");
            throw null;
        }

        /* renamed from: a */
        public final <E extends IOException> E mo11113a(E e) {
            if (this.f11214f) {
                return e;
            }
            this.f11214f = true;
            return this.f11218j.mo11108a(this.f11215g, false, true, e);
        }

        /* renamed from: a */
        public void mo11105a(C4892f fVar, long j) {
            if (fVar == null) {
                C4638h.m10271a("source");
                throw null;
            } else if (!this.f11216h) {
                long j2 = this.f11217i;
                if (j2 == -1 || this.f11215g + j <= j2) {
                    try {
                        super.mo11105a(fVar, j);
                        this.f11215g += j;
                    } catch (IOException e) {
                        throw mo11113a(e);
                    }
                } else {
                    StringBuilder a = C1965a.m4756a("expected ");
                    a.append(this.f11217i);
                    a.append(" bytes but received ");
                    a.append(this.f11215g + j);
                    throw new ProtocolException(a.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f11216h) {
                this.f11216h = true;
                long j = this.f11217i;
                if (j == -1 || this.f11215g == j) {
                    try {
                        super.close();
                        mo11113a(null);
                    } catch (IOException e) {
                        throw mo11113a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw mo11113a(e);
            }
        }
    }

    /* renamed from: v.m0.d.c$b */
    public final class C4756b extends C4900l {

        /* renamed from: f */
        public long f11219f;

        /* renamed from: g */
        public boolean f11220g;

        /* renamed from: h */
        public boolean f11221h;

        /* renamed from: i */
        public final long f11222i;

        /* renamed from: j */
        public final /* synthetic */ C4754c f11223j;

        public C4756b(C4754c cVar, C4882a0 a0Var, long j) {
            if (a0Var != null) {
                this.f11223j = cVar;
                super(a0Var);
                this.f11222i = j;
                if (j == 0) {
                    mo11114a(null);
                    return;
                }
                return;
            }
            C4638h.m10271a("delegate");
            throw null;
        }

        /* renamed from: a */
        public final <E extends IOException> E mo11114a(E e) {
            if (this.f11220g) {
                return e;
            }
            this.f11220g = true;
            return this.f11223j.mo11108a(this.f11219f, true, false, e);
        }

        /* renamed from: b */
        public long mo11077b(C4892f fVar, long j) {
            if (fVar == null) {
                C4638h.m10271a("sink");
                throw null;
            } else if (!this.f11221h) {
                try {
                    long b = this.f11670e.mo11077b(fVar, j);
                    if (b == -1) {
                        mo11114a(null);
                        return -1;
                    }
                    long j2 = this.f11219f + b;
                    if (this.f11222i != -1) {
                        if (j2 > this.f11222i) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.f11222i);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f11219f = j2;
                    if (j2 == this.f11222i) {
                        mo11114a(null);
                    }
                    return b;
                } catch (IOException e) {
                    throw mo11114a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f11221h) {
                this.f11221h = true;
                try {
                    super.close();
                    mo11114a(null);
                } catch (IOException e) {
                    throw mo11114a(e);
                }
            }
        }
    }

    public C4754c(C4768m mVar, C4708f fVar, C4861t tVar, C4757d dVar, C4775d dVar2) {
        if (mVar == null) {
            C4638h.m10271a("transmitter");
            throw null;
        } else if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (tVar == null) {
            C4638h.m10271a("eventListener");
            throw null;
        } else if (dVar == null) {
            C4638h.m10271a("finder");
            throw null;
        } else if (dVar2 != null) {
            this.f11209b = mVar;
            this.f11210c = fVar;
            this.f11211d = tVar;
            this.f11212e = dVar;
            this.f11213f = dVar2;
        } else {
            C4638h.m10271a("codec");
            throw null;
        }
    }

    /* renamed from: a */
    public final <E extends IOException> E mo11108a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            mo11112a((IOException) e);
        }
        String str = "call";
        if (z2) {
            C4861t tVar = this.f11211d;
            C4708f fVar = this.f11210c;
            if (e != null) {
                tVar.mo11354a(fVar, (IOException) e);
            } else if (tVar == null) {
                throw null;
            } else if (fVar == null) {
                C4638h.m10271a(str);
                throw null;
            }
        }
        if (z) {
            if (e != null) {
                this.f11211d.mo11357b(this.f11210c, e);
            } else {
                C4861t tVar2 = this.f11211d;
                C4708f fVar2 = this.f11210c;
                if (tVar2 == null) {
                    throw null;
                } else if (fVar2 == null) {
                    C4638h.m10271a(str);
                    throw null;
                }
            }
        }
        return this.f11209b.mo11150a(this, z2, z, e);
    }

    /* renamed from: a */
    public final C4761h mo11110a() {
        return this.f11213f.mo11163a();
    }

    /* renamed from: a */
    public final void mo11112a(IOException iOException) {
        this.f11212e.mo11120d();
        C4761h a = this.f11213f.mo11163a();
        if (a != null) {
            a.mo11126a(iOException);
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: a */
    public final C4915y mo11111a(C4706e0 e0Var, boolean z) {
        if (e0Var != null) {
            this.f11208a = z;
            C4716h0 h0Var = e0Var.f11032e;
            if (h0Var != null) {
                long a = h0Var.mo10970a();
                C4861t tVar = this.f11211d;
                C4708f fVar = this.f11210c;
                if (tVar == null) {
                    throw null;
                } else if (fVar != null) {
                    return new C4755a(this, this.f11213f.mo11164a(e0Var, a), a);
                } else {
                    C4638h.m10271a("call");
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10271a("request");
            throw null;
        }
    }

    /* renamed from: a */
    public final C4721a mo11109a(boolean z) {
        try {
            C4721a a = this.f11213f.mo11162a(z);
            if (a != null) {
                a.f11085m = this;
            }
            return a;
        } catch (IOException e) {
            this.f11211d.mo11357b(this.f11210c, e);
            mo11112a(e);
            throw e;
        }
    }
}
