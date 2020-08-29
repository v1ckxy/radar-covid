package p410v.p411m0.p414e;

import java.io.IOException;
import java.net.ProtocolException;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4706e0;
import p410v.C4708f;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4720i0.C4721a;
import p410v.C4725j0;
import p410v.C4861t;
import p410v.C4877y;
import p410v.C4877y.C4878a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4754c;
import p410v.p411m0.p413d.C4754c.C4756b;
import p410v.p411m0.p413d.C4761h;
import p423w.C4882a0;
import p423w.C4895h;

/* renamed from: v.m0.e.b */
public final class C4772b implements C4877y {

    /* renamed from: a */
    public final boolean f11295a;

    public C4772b(boolean z) {
        this.f11295a = z;
    }

    /* renamed from: a */
    public C4720i0 mo11074a(C4878a aVar) {
        boolean z;
        C4721a aVar2;
        C4721a aVar3;
        C4725j0 j0Var;
        Long l = null;
        if (aVar != null) {
            C4778g gVar = (C4778g) aVar;
            C4754c cVar = gVar.f11302d;
            if (cVar != null) {
                C4706e0 e0Var = gVar.f11304f;
                C4716h0 h0Var = e0Var.f11032e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C4861t tVar = cVar.f11211d;
                    C4708f fVar = cVar.f11210c;
                    if (tVar != null) {
                        String str = "call";
                        if (fVar != null) {
                            cVar.f11213f.mo11165a(e0Var);
                            C4861t tVar2 = cVar.f11211d;
                            C4708f fVar2 = cVar.f11210c;
                            if (tVar2 == null) {
                                throw null;
                            } else if (fVar2 != null) {
                                if (!C4777f.m10584a(e0Var.f11030c) || h0Var == null) {
                                    cVar.f11209b.mo11150a(cVar, true, false, null);
                                    aVar2 = null;
                                    z = false;
                                } else {
                                    if (C4681g.m10322a("100-continue", e0Var.mo11012a("Expect"), true)) {
                                        try {
                                            cVar.f11213f.mo11168c();
                                            C4861t tVar3 = cVar.f11211d;
                                            C4708f fVar3 = cVar.f11210c;
                                            if (tVar3 == null) {
                                                throw null;
                                            } else if (fVar3 != null) {
                                                aVar2 = cVar.mo11109a(true);
                                                z = true;
                                            } else {
                                                C4638h.m10271a(str);
                                                throw null;
                                            }
                                        } catch (IOException e) {
                                            cVar.f11211d.mo11354a(cVar.f11210c, e);
                                            cVar.mo11112a(e);
                                            throw e;
                                        }
                                    } else {
                                        aVar2 = null;
                                        z = false;
                                    }
                                    if (aVar2 == null) {
                                        C4895h a = C0967p0.m2182a(cVar.mo11111a(e0Var, false));
                                        h0Var.mo10972a(a);
                                        a.close();
                                    } else {
                                        cVar.f11209b.mo11150a(cVar, true, false, null);
                                        C4761h a2 = cVar.mo11110a();
                                        if (a2 == null) {
                                            C4638h.m10269a();
                                            throw null;
                                        } else if (!a2.mo11131b()) {
                                            C4761h a3 = cVar.f11213f.mo11163a();
                                            if (a3 != null) {
                                                a3.mo11132c();
                                            } else {
                                                C4638h.m10269a();
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                try {
                                    cVar.f11213f.mo11167b();
                                    if (!z) {
                                        C4861t tVar4 = cVar.f11211d;
                                        C4708f fVar4 = cVar.f11210c;
                                        if (tVar4 == null) {
                                            throw null;
                                        } else if (fVar4 == null) {
                                            C4638h.m10271a(str);
                                            throw null;
                                        }
                                    }
                                    if (aVar2 == null) {
                                        aVar2 = cVar.mo11109a(false);
                                        if (aVar2 == null) {
                                            C4638h.m10269a();
                                            throw null;
                                        }
                                    }
                                    aVar2.f11073a = e0Var;
                                    C4761h a4 = cVar.mo11110a();
                                    if (a4 != null) {
                                        aVar2.f11077e = a4.f11242d;
                                        aVar2.f11083k = currentTimeMillis;
                                        aVar2.f11084l = System.currentTimeMillis();
                                        C4720i0 a5 = aVar2.mo11042a();
                                        int i = a5.f11063i;
                                        if (i == 100) {
                                            C4721a a6 = cVar.mo11109a(false);
                                            if (a6 != null) {
                                                a6.f11073a = e0Var;
                                                C4761h a7 = cVar.mo11110a();
                                                if (a7 != null) {
                                                    a6.f11077e = a7.f11242d;
                                                    a6.f11083k = currentTimeMillis;
                                                    a6.f11084l = System.currentTimeMillis();
                                                    a5 = a6.mo11042a();
                                                    i = a5.f11063i;
                                                } else {
                                                    C4638h.m10269a();
                                                    throw null;
                                                }
                                            } else {
                                                C4638h.m10269a();
                                                throw null;
                                            }
                                        }
                                        C4861t tVar5 = cVar.f11211d;
                                        C4708f fVar5 = cVar.f11210c;
                                        if (tVar5 == null) {
                                            throw null;
                                        } else if (fVar5 != null) {
                                            if (!this.f11295a || i != 101) {
                                                aVar3 = new C4721a(a5);
                                                try {
                                                    C4861t tVar6 = cVar.f11211d;
                                                    C4708f fVar6 = cVar.f11210c;
                                                    if (tVar6 == null) {
                                                        throw null;
                                                    } else if (fVar6 != null) {
                                                        String a8 = C4720i0.m10406a(a5, "Content-Type", null, 2);
                                                        long a9 = cVar.f11213f.mo11161a(a5);
                                                        j0Var = new C4779h(a8, a9, C0967p0.m2183a((C4882a0) new C4756b(cVar, cVar.f11213f.mo11166b(a5), a9)));
                                                    } else {
                                                        C4638h.m10271a(str);
                                                        throw null;
                                                    }
                                                } catch (IOException e2) {
                                                    cVar.f11211d.mo11357b(cVar.f11210c, e2);
                                                    cVar.mo11112a(e2);
                                                    throw e2;
                                                }
                                            } else {
                                                aVar3 = new C4721a(a5);
                                                j0Var = C4737b.f11142c;
                                            }
                                            aVar3.f11079g = j0Var;
                                            C4720i0 a10 = aVar3.mo11042a();
                                            String str2 = "Connection";
                                            String str3 = "close";
                                            if (C4681g.m10322a(str3, a10.f11060f.mo11012a(str2), true) || C4681g.m10322a(str3, C4720i0.m10406a(a10, str2, null, 2), true)) {
                                                C4761h a11 = cVar.f11213f.mo11163a();
                                                if (a11 != null) {
                                                    a11.mo11132c();
                                                } else {
                                                    C4638h.m10269a();
                                                    throw null;
                                                }
                                            }
                                            if (i == 204 || i == 205) {
                                                C4725j0 j0Var2 = a10.f11066l;
                                                if ((j0Var2 != null ? j0Var2.mo10989f() : -1) > 0) {
                                                    StringBuilder a12 = C1965a.m4757a("HTTP ", i, " had non-zero Content-Length: ");
                                                    C4725j0 j0Var3 = a10.f11066l;
                                                    if (j0Var3 != null) {
                                                        l = Long.valueOf(j0Var3.mo10989f());
                                                    }
                                                    a12.append(l);
                                                    throw new ProtocolException(a12.toString());
                                                }
                                            }
                                            return a10;
                                        } else {
                                            C4638h.m10271a(str);
                                            throw null;
                                        }
                                    } else {
                                        C4638h.m10269a();
                                        throw null;
                                    }
                                } catch (IOException e3) {
                                    cVar.f11211d.mo11354a(cVar.f11210c, e3);
                                    cVar.mo11112a(e3);
                                    throw e3;
                                }
                            } else {
                                C4638h.m10271a(str);
                                throw null;
                            }
                        } else {
                            C4638h.m10271a(str);
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } catch (IOException e4) {
                    cVar.f11211d.mo11354a(cVar.f11210c, e4);
                    cVar.mo11112a(e4);
                    throw e4;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        } else {
            C4638h.m10271a("chain");
            throw null;
        }
    }
}
