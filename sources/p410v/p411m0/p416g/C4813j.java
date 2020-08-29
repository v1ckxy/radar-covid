package p410v.p411m0.p416g;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4690b0;
import p410v.C4694c0;
import p410v.C4706e0;
import p410v.C4720i0;
import p410v.C4720i0.C4721a;
import p410v.C4870w;
import p410v.C4873x;
import p410v.C4877y.C4878a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4761h;
import p410v.p411m0.p414e.C4775d;
import p410v.p411m0.p414e.C4781j;
import p423w.C4882a0;
import p423w.C4897j;
import p423w.C4915y;

/* renamed from: v.m0.g.j */
public final class C4813j implements C4775d {

    /* renamed from: g */
    public static final List<String> f11457g = C4737b.m10458a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h */
    public static final List<String> f11458h = C4737b.m10458a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a */
    public volatile C4817l f11459a;

    /* renamed from: b */
    public final C4694c0 f11460b;

    /* renamed from: c */
    public volatile boolean f11461c;

    /* renamed from: d */
    public final C4761h f11462d;

    /* renamed from: e */
    public final C4878a f11463e;

    /* renamed from: f */
    public final C4797f f11464f;

    public C4813j(C4690b0 b0Var, C4761h hVar, C4878a aVar, C4797f fVar) {
        if (b0Var == null) {
            C4638h.m10271a("client");
            throw null;
        } else if (hVar == null) {
            C4638h.m10271a("realConnection");
            throw null;
        } else if (aVar == null) {
            C4638h.m10271a("chain");
            throw null;
        } else if (fVar != null) {
            this.f11462d = hVar;
            this.f11463e = aVar;
            this.f11464f = fVar;
            this.f11460b = b0Var.f10936x.contains(C4694c0.H2_PRIOR_KNOWLEDGE) ? C4694c0.H2_PRIOR_KNOWLEDGE : C4694c0.HTTP_2;
        } else {
            C4638h.m10271a("connection");
            throw null;
        }
    }

    /* renamed from: a */
    public C4761h mo11163a() {
        return this.f11462d;
    }

    /* renamed from: a */
    public C4915y mo11164a(C4706e0 e0Var, long j) {
        if (e0Var != null) {
            C4817l lVar = this.f11459a;
            if (lVar != null) {
                return lVar.mo11257d();
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("request");
        throw null;
    }

    /* renamed from: b */
    public C4882a0 mo11166b(C4720i0 i0Var) {
        if (i0Var != null) {
            C4817l lVar = this.f11459a;
            if (lVar != null) {
                return lVar.f11483g;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("response");
        throw null;
    }

    /* renamed from: b */
    public void mo11167b() {
        C4817l lVar = this.f11459a;
        if (lVar != null) {
            lVar.mo11257d().close();
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: c */
    public void mo11168c() {
        this.f11464f.f11402w.flush();
    }

    public void cancel() {
        this.f11461c = true;
        C4817l lVar = this.f11459a;
        if (lVar != null) {
            lVar.mo11250a(C4790b.CANCEL);
        }
    }

    /* renamed from: a */
    public C4721a mo11162a(boolean z) {
        C4817l lVar = this.f11459a;
        if (lVar != null) {
            C4870w g = lVar.mo11260g();
            C4694c0 c0Var = this.f11460b;
            if (g == null) {
                C4638h.m10271a("headerBlock");
                throw null;
            } else if (c0Var != null) {
                ArrayList arrayList = new ArrayList(20);
                int size = g.size();
                C4781j jVar = null;
                for (int i = 0; i < size; i++) {
                    String e = g.mo11369e(i);
                    String f = g.mo11371f(i);
                    if (C4638h.m10272a((Object) e, (Object) ":status")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("HTTP/1.1 ");
                        sb.append(f);
                        jVar = C4781j.m10600a(sb.toString());
                    } else if (f11458h.contains(e)) {
                        continue;
                    } else if (e == null) {
                        C4638h.m10271a("name");
                        throw null;
                    } else if (f != null) {
                        arrayList.add(e);
                        arrayList.add(C4681g.m10328c(f).toString());
                    } else {
                        C4638h.m10271a("value");
                        throw null;
                    }
                }
                if (jVar != null) {
                    C4721a aVar = new C4721a();
                    aVar.f11074b = c0Var;
                    aVar.f11075c = jVar.f11314b;
                    aVar.mo11036a(jVar.f11315c);
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        aVar.mo11041a(new C4870w((String[]) array, null));
                        if (!z || aVar.f11075c != 100) {
                            return aVar;
                        }
                        return null;
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new ProtocolException("Expected ':status' header not present");
            } else {
                C4638h.m10271a("protocol");
                throw null;
            }
        } else {
            C4638h.m10269a();
            throw null;
        }
    }

    /* renamed from: a */
    public long mo11161a(C4720i0 i0Var) {
        if (i0Var != null) {
            return C4737b.m10454a(i0Var);
        }
        C4638h.m10271a("response");
        throw null;
    }

    /* renamed from: a */
    public void mo11165a(C4706e0 e0Var) {
        if (e0Var == null) {
            C4638h.m10271a("request");
            throw null;
        } else if (this.f11459a == null) {
            boolean z = e0Var.f11032e != null;
            C4870w wVar = e0Var.f11031d;
            ArrayList arrayList = new ArrayList(wVar.size() + 4);
            arrayList.add(new C4792c(C4792c.f11350f, e0Var.f11030c));
            C4897j jVar = C4792c.f11351g;
            C4873x xVar = e0Var.f11029b;
            if (xVar != null) {
                String b = xVar.mo11388b();
                String d = xVar.mo11391d();
                if (d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('?');
                    sb.append(d);
                    b = sb.toString();
                }
                arrayList.add(new C4792c(jVar, b));
                String a = e0Var.mo11012a("Host");
                if (a != null) {
                    arrayList.add(new C4792c(C4792c.f11353i, a));
                }
                arrayList.add(new C4792c(C4792c.f11352h, e0Var.f11029b.f11617b));
                int size = wVar.size();
                int i = 0;
                while (i < size) {
                    String e = wVar.mo11369e(i);
                    Locale locale = Locale.US;
                    C4638h.m10270a((Object) locale, "Locale.US");
                    if (e != null) {
                        String lowerCase = e.toLowerCase(locale);
                        C4638h.m10270a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (!f11457g.contains(lowerCase) || (C4638h.m10272a((Object) lowerCase, (Object) "te") && C4638h.m10272a((Object) wVar.mo11371f(i), (Object) "trailers"))) {
                            arrayList.add(new C4792c(lowerCase, wVar.mo11371f(i)));
                        }
                        i++;
                    } else {
                        throw new C4557i("null cannot be cast to non-null type java.lang.String");
                    }
                }
                this.f11459a = this.f11464f.mo11207a(0, (List<C4792c>) arrayList, z);
                if (this.f11461c) {
                    C4817l lVar = this.f11459a;
                    if (lVar == null) {
                        C4638h.m10269a();
                        throw null;
                    } else {
                        lVar.mo11250a(C4790b.CANCEL);
                        throw new IOException("Canceled");
                    }
                } else {
                    C4817l lVar2 = this.f11459a;
                    if (lVar2 != null) {
                        lVar2.f11485i.mo11425a((long) this.f11463e.mo11174c(), TimeUnit.MILLISECONDS);
                        C4817l lVar3 = this.f11459a;
                        if (lVar3 != null) {
                            lVar3.f11486j.mo11425a((long) this.f11463e.mo11175d(), TimeUnit.MILLISECONDS);
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
            } else {
                C4638h.m10271a("url");
                throw null;
            }
        }
    }
}
